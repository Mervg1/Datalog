import java.lang.reflect.Array;
import java.util.*;

public class Listener extends DatalogBaseListener{

    /*
    QUERIES


    estudiante(matrícula,nombre,carrera)
    curso(claveCurso,nombreCurso,unidades,departamento)
    grupo(claveCurso,idGrupo,semestre,profesorNombre)
    integrante(claveCurso,idGrupo,semestre,matrícula,calificación)
    prerequisito(claveCurso,clavePrerequisito)

     1. Los nombres de los estudiantesqueesténohayancursadolacarreradeISC.
     FUNCIONA
       ?- respuesta(?nombre) :- estudiante(_, ?nombre, ?carrera),carrera="ISC".

     2. RecuperarlosnombresdeloscursosquehaofrecidoelprofesorAbelBueno.
     FUNCIONA
       ?-respuesta(?nombreCurso) :- curso(?claveCurso,?nombreCurso,_,_),grupo(?claveCurso,_,_,?profesorNombre),profesorNombre="Abel Bueno".
       SELECT curso.nombreCurso,
       FROM curso,
       INNER JOIN grupo ON curso.claveCurso = grupo.claveCurso
       where grupo.profesorNombre = "Abel Bueno";

     3. Obtenga todos los nombres de los pre-requisitos del curso cuya clave es Cb00005.

       ?- respuesta(?nombreCurso) :- curso(?claveCurso,?nombreCurso,_,_),
							  prerequisito(?claveCurso,?clavePrerequisito),
					          claveCurso="Cb00005",
					          claveCurso = clavePrerequisito.

     4. Para cada grupo ofrecido por AbelBueno, recuperar la clave del curso,el número de grupo, su semestre así como el total de estudiantes inscritos.
      FUNCIONA
      ?- respuesta(?claveCurso, ?idGrupo, ?semestre, ?total) :-
                        grupo (?claveCurso, ?idGrupo, ?semestre,?profesorNombre),
                        integrante (?claveCurso,_,_,_,_),
                        profesorNombre = "Abel Bueno",
                        total = count <?claveCurso>.

        SELECT grupo.claveCurso, grupo.idGrupo, grupo.semestre, count(*) AS totalEstudiantes
        FROM grupo
        JOIN integrante ON grupo.claveCurso = integrante.claveCurso
        WHERE grupo.profesorNombre = 'Abel Bueno'
        GROUP BY claveCurso;

     5. Recuperar el historial académico de las materias aprobadas de los estudiantes de la carrera LSCA. El historial académico deberá incluir el nombre
     del alumno su tira de materias. La tira de materias deberáincluir la clave del curso, el nombre del curso, el semestre en que se
     aprobóla materia y la calificación obtenida.
     FUNCIONA
       ?- respuesta(?nombre, ?claveCurso, ?nombreCurso, ?semestre, ?calificacion) :-
							  curso (?claveCurso, ?nombreCurso,_,_),
							  integrante (?claveCurso,_,?semestre,?matricula,?calificacion),
							  estudiante (?matricula,?nombre,?carrera),
							  carrera = "LSCA".

     6. Obtenga los nombres de los cursos que hayan obtenido el número más alto de aprobados durante el semestre 200213.
        FUNCIONA
        ?- respuesta(?nombreCurso, ?claveCurso, ?semestre, ?total) :-
							  integrante (?claveCurso,_,?semestre,_,?calificacion),
							  curso (?claveCurso,?nombreCurso,_,_),
							  semestre = 200213,
							  calificacion >= 70,
							  total = count <?claveCurso>.

	   SELECT curso.nombreCurso, integrante.claveCurso, integrante.semestre, COUNT(*)
        FROM integrante
        JOIN curso ON integrante.claveCurso = curso.claveCurso
        WHERE integrante.semestre=200213 AND integrante.calificacion >= 70
        GROUP BY curso.nombreCurso;


     7. Todos los requisitos directos y transitivos de la materia Cb0005
     FUNCIONA
     ?- respuesta(?claveCurso, ?clavePrerequisito) :- prerequisito(?claveCurso, ?clavePrerequisito), claveCurso="Cb00005".

     SELECT prerequisito.claveCurso, prerequisito.clavePrerequisito
     FROM prerequisito
     WHERE prerequisito.claveCurso = 'Cb00005';


    * */


    Integer counterVariables = 0;

    List<String> predicados = new ArrayList<String>();
    ArrayList<String> tipoDeValores = new ArrayList<String>();

    // Crear un array con todos los elementos
    ArrayList<String> arrayTodo = new ArrayList<String>();

    //Se crea un array List de las variables y otro de las literales
    ArrayList<String> variables = new ArrayList<String>();
    ArrayList<String> literales = new ArrayList<String>();

    String predicadoActual = "";
    ArrayList<String> variablesSelect = new ArrayList<String>();

    ArrayList<String> variablesBusqueda = new ArrayList<String>();

    //Array List de elementos where
    ArrayList<String> elementosWhere = new ArrayList<String>();

    public static String query ="";

    Boolean difAttributes = false;

    String iguales = "";

    Stack<String> backwards = new Stack<String>();


    @Override public void enterInicioQuery(DatalogParser.InicioQueryContext ctx) {
        //System.out.println("Aqui esta el query " + ctx.getText());
    }

    @Override public void enterPredicado(DatalogParser.PredicadoContext ctx) {
       // System.out.println("Aqui esta el predicado " + ctx.getText());
        predicadoActual = ctx.getText();
        predicados.add(ctx.getText());


    }

    @Override public void enterVariableEnun(DatalogParser.VariableEnunContext ctx) {
       // System.out.println("Aqui esta la variable " + ctx.getText());
        //Se agrega el valor variable al arraylist
        arrayTodo.add(ctx.getText());
        variables.add(ctx.getText());
        String var = ctx.getText().substring(1);
        while(var.contains("?")){
            var = var.substring(1);
        }
        variablesSelect.add(predicadoActual + "." +var);

    }

    @Override public void enterLiteralEnun(DatalogParser.LiteralEnunContext ctx) {
        //System.out.println("Aqui esta la literal " + ctx.getText());
        //Se agrega que es un literal
        //tipoDeValores.add("literal");
        arrayTodo.add(ctx.getText());
        literales.add(ctx.getText());

    }

    @Override public void exitInicioQuery(DatalogParser.InicioQueryContext ctx) {

        //Primero ver si hay más de una tabla
        List<String> estadosUnion = new ArrayList<String>();
        if(predicados.size() > 1){
            String from = "FROM " + predicados.get(0);
            //Si hay mas de una tabla hay que ver como se van a unir, entonces hay que buscar los elementos que comparten
            for(int i = 0; i < arrayTodo.size(); i++){
                for(int j = i + 1; j < arrayTodo.size(); j++){
                    if(arrayTodo.get(i).equals(arrayTodo.get(j))){
                        estadosUnion.add(arrayTodo.get(i).substring(1));
                        //Si claveCurso esta con algo antes agregar
                    }
                }
            }



            String select = "SELECT ";
            //Hay que ver los elementos que unen a las tablas y separarlos
            for(String elem : predicados){
                for(String union : estadosUnion){
                    if(!elem.contains(union)){
                        select += union + " " ;
                    }
                }

            }

            //Agregar las tablas extras con Join
            for(int i = 1; i < predicados.size(); i++){
                from += " INNER JOIN " + predicados.get(i);
                /*for(String union : estadosUnion){
                    if(union.contains(predicados.get(i-1))){
                        from += "ON " + union + "=";

                    }else if(union.contains(predicados.get(i))){
                        from += union;
                    }
                }*/
                from += " ON ";
                for(String enu : variablesSelect){
                    for(String element : estadosUnion){
                        if(enu.contains(element)){
                            from += enu + "=";
                        }
                    }

                }

            }

            from = from.substring(0, from.length()-1);



            System.out.println(select + " " + from);


            for(String elem : estadosUnion){
                System.out.println("Estados unidos: " + elem);
            }
        }else{
            String from = "FROM " + predicados.get(0);
        }


    }

    @Override public void enterVariosQueries(DatalogParser.VariosQueriesContext ctx) {
        //System.out.println("VARIOS QUERIES "+ctx.getText());
        //Aqui hay que vaciar la lista de predicado y variable
        arrayTodo.add(ctx.getText());
        variables.add(ctx.getText());
        String var = ctx.getText().substring(1);
        variablesSelect.add(predicadoActual + "." +var);

        predicados.removeAll(predicados);

        for(String aux : variables){
            variablesBusqueda.add(aux.substring(1));
        }

        variables.removeAll(variables);
        arrayTodo.removeAll(arrayTodo);
        variablesSelect.removeAll(variablesSelect);

    }

    @Override public void enterWheree(DatalogParser.WhereeContext ctx) {
        //System.out.println("Where " + ctx.getText());
        String newElem = ctx.getText().replace("\"","\'" );
        elementosWhere.add(newElem);
        String spl[] = ctx.getText().split("=");
        System.out.println("CONTAINS = "+spl[0] + "spl1 " + spl[1]);
        for(int i = 0; i < variables.size(); i++){
            for(int j = 1; j < variables.size(); j++){
                if(variables.get(i).contains(spl[0]) && variables.get(j).contains(spl[1])){
                    iguales = spl[0] + "=" + spl[1];
                    difAttributes = true;
                }
            }
        }

    }


    @Override public void exitInicioQueryRule(DatalogParser.InicioQueryRuleContext ctx) {
        Queue<String> colaPredicados = new LinkedList<String>();
        //Se crea la cola de predicados chance Borrar
        for(String all : predicados){
            colaPredicados.add(all);
        }

        //Obtener los elementos iguales
        List<String> estadosUnion = new ArrayList<String>();
        Queue<String> colaEstadosUnion = new LinkedList<String>();
        for(int i = 0; i < arrayTodo.size(); i++){
            for(int j = i + 1; j < arrayTodo.size(); j++){
                if(arrayTodo.get(i).equals(arrayTodo.get(j))){
                    estadosUnion.add(arrayTodo.get(i).substring(1));
                    colaEstadosUnion.add(arrayTodo.get(i).substring(1));
                    //Si claveCurso esta con algo antes agregar
                }
            }
        }

        //Se crea el select y también se agregan los elementos a Group By
        String select = "SELECT ";
        String groupBy = " GROUP BY ";
        for(String search : variablesBusqueda){
            for(String search2 : variablesSelect){
                if(search2.contains(search) && !select.contains(search)){
                    select += search2 + ",";
                    groupBy += search2 + ",";
                }
            }

        }


        for(String elem : elementosWhere){
            if(elem.contains("count")){
                select += "COUNT (*) ";
            }
        }

        //Se crea el from

        //Checamos si esta dentro de un schema
        String from = "";
        if(Main.schema.length() > 0){
            from = "FROM " + Main.schema + "." + predicados.get(0) + " ";
        }else{
            from = "FROM " + predicados.get(0) + " ";
        }

        colaPredicados.poll();
        for(int i = 1; i < predicados.size(); i++){
            if(!colaEstadosUnion.isEmpty()){
                if(from.length() > 0){
                    from = from.substring(0, from.length()-1);
                }
                from += " JOIN " + predicados.get(i) + " ON ";
                //Hay que poner el ON
                String currentPredicado = colaPredicados.poll();
                String un = colaEstadosUnion.poll();
                if (difAttributes == true) {
                    String ayuda[] = iguales.split("=");

                    for(String f : ayuda){
                        Integer counter = 0;
                        for(String aux : variablesSelect){

                            if(aux.contains(f)){
                                if(counter == 0){
                                    from += aux + "=";
                                    counter += 1;
                                }

                            }
                        }
                    }
                    //from += iguales + "=";
                }else{
                    for(String aux : variablesSelect){
                        if(aux.contains(un)){
                            from += aux + "=";
                        }
                    }
                }



            }

        }

        //Primero ver que los elementos de where esten bien acomodados
        ArrayList<String> newWhere = new ArrayList<String>();
        for(String w : elementosWhere){
            if(w.contains("<") || w.contains(">")){
                if(w.contains("<=")){
                    String aux[] = w.split("<=");
                    for(String var : variablesSelect){
                        if(var.contains(aux[0])){
                            for(int i = 1; i < aux.length; i++){
                                newWhere.add(var+"<="+aux[i]);

                            }
                        }
                    }
                }else if(w.contains(">=")){
                    //System.out.println("Contiene >=");
                    String aux[] = w.split(">=");
                    //System.out.println(aux[0]);
                    for(String var : variablesSelect){
                        if(var.contains(aux[0])){
                            for(int i = 1; i < aux.length; i++){
                                newWhere.add(var+">="+aux[i]);

                            }
                        }
                    }
                }

            }else{
                String aux[] = w.split("=");
                for(String var : variablesSelect){
                    if(var.contains(aux[0])){
                        for(int i = 1; i < aux.length; i++){
                            newWhere.add(var+"="+aux[i]);

                        }
                    }
                }
            }

        }

        //Checar si vamos a tener que cambiar los parametros para unir
        String where = "WHERE ";
        if(difAttributes == true){
            System.out.println(newWhere.size());
            for(int i = newWhere.size()-1; i < 0; i--){
                System.out.println(newWhere.get(3));
                String aux[] = newWhere.get(i).split("\\.");
                //System.out.println("AUX1 " + aux[0]);
                System.out.println("w1 " + newWhere.get(i));
                if(!aux[1].equals(iguales) && !where.contains(aux[1])){
                    where += newWhere.get(i) + "AND ";
                }


            }
        }else{




        }

        //Se acomodan los elementos de Where
        for(String w : newWhere){

            String aux[] = w.split("\\.");
            //System.out.println("AUX1 " + aux[0]);
            System.out.println("w1 " + w);
            String blabla = "";
            if(difAttributes == true){
                if(!aux[1].equals(iguales) && blabla.contains(aux[1])){
                    where += w + "AND ";
                }else if(!aux[1].equals(iguales) && !blabla.contains(aux[1])){
                    blabla = w;
                    String aux2[] = blabla.split("\\.");
                    if(!aux2[0].contains(predicados.get(0))){
                        where += blabla + "AND ";
                    }
                }
            }else{
                if(!aux[1].equals(iguales) && !where.contains(aux[1])){
                    where += w + "AND ";
                }
            }


        }



        where = where.substring(0,where.length()-4);

        select = select.substring(0,select.length()-1);

        from = from.substring(0,from.length()-1);

        groupBy = groupBy.substring(0,groupBy.length()-1);

        System.out.println(select);
        System.out.println(from);

        System.out.println(where);
        System.out.println(Main.schema);


        if(from.contains("ON")){
            query = select + " " + from + " " + where + groupBy;
        }else{
            query = select + " " + from + " " + where;
        }

        System.out.println(query);

    }
}
