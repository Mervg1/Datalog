import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.sql.*;
import java.util.*;

public class Main {
    public static String schema = "dbo";
    public static void main(String[] args) {
        // Create a variable for the connection string.
        SqlQuery database = new SqlQuery();

        // Declare the JDBC objects.
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        ResultSetMetaData rsmd;
        try {
            //?-curso(?cc,?nombre,?unidades,?departamento),grupo(?cc,?idC,?semestre,"Abel Bueno").
            //profe(?x):-curso(?cc,?nombre,?unidades,?departamento),grupo(?cc,?idC,?semestre,"Abel Bueno").

            System.out.println("Bienvenido al proyecto final de queries en datalog y SQL!!! ");
            System.out.println("Podras seleccionar una consulta y te dará el query en datalog para que lo pongas y se convierta en sql y después realice la consulta en la base de datos ");
            System.out.println("Selecciona una opción del query en datalog que quieres obtener y da enter (normal): ");
            System.out.println("1. Los nombres de los estudiantes que estén o hayan cursado la carrera de ISC.");
            System.out.println("2. Recuperar los nombres de los cursos que ha ofrecido el profesor AbelBueno.");
            System.out.println("3. Obtenga todos los nombres de los pre-requisitos del curso cuya clave es Cb00005.");
            System.out.println("4. Para cada grupo ofrecido por AbelBueno, recuperar la clave del curso,el número de grupo, su semestre así como el total de estudiantes inscritos.");
            System.out.println("5. Recuperar el historial académico de las materias aprobadas de los estudiantes de la carrera LSCA. El historial académico deberá incluir el nombre\n" +
                    "     del alumno su tira de materias. La tira de materias deberáincluir la clave del curso, el nombre del curso, el semestre en que se\n" +
                    "     aprobóla materia y la calificación obtenida.");
            System.out.println("6. Obtenga los nombres de los cursos que hayan obtenido el número más alto de aprobados durante el semestre 200213.");
            System.out.println("7. Todos los requisitos directos y transitivos de la materia Cb0005");
            System.out.println("8. Crear mi propio query de datalog");
            Scanner sc = new Scanner(System.in);
            String opcionUsuario = sc.nextLine();

            switch (Integer.parseInt(opcionUsuario)){
                case 1:
                    System.out.println("Copia tu query y después pegalo aqui y presiona command D.");
                    System.out.println("El query de datalog es: \n ?-estudianteISC(?nombre) :- estudiante(_, ?nombre, ?carrera),?carrera=\"ISC\".");
                    break;
                case 2:
                    System.out.println("Copia tu query y después pegalo aqui y presiona command D.");
                    System.out.println("El query de datalog es: \n ?-respuesta(?nombreCurso) :- curso(?claveCurso,?nombreCurso,_,_),grupo(?claveCurso,_,_,?profesorNombre),?profesorNombre=\"Abel Bueno\".");
                    break;
                case 3:
                    System.out.println("Copia tu query y después pegalo aqui y presiona command D.");
                    System.out.println("El query de datalog es: \n ?-previos(?nombreCurso) :- curso(?claveCurso,?nombreCurso,_,_),prerequisito(?claveCurso,?clavePrerequisito),?claveCurso=\"Cb00005\",claveCurso = clavePrerequisito.");
                    break;
                case 4:
                    System.out.println("Copia tu query y después pegalo aqui y presiona command D.");
                    System.out.println("El query de datalog es: \n ?-infoEst(?claveCurso, ?idGrupo, ?semestre, ?total) :- grupo (?claveCurso, ?idGrupo, ?semestre,?profesorNombre),integrante (?claveCurso,_,_,_,_),?profesorNombre = \"Abel Bueno\",total = count <?claveCurso>.");
                    break;
                case 5:
                    System.out.println("Copia tu query y después pegalo aqui y presiona command D.");
                    System.out.println("El query de datalog es: \n ?-estudiantesLASCA(?nombre, ?claveCurso, ?nombreCurso, ?semestre, ?calificacion) :- curso (?claveCurso, ?nombreCurso,_,_),integrante (?claveCurso,_,?semestre,?matricula,?calificacion),estudiante (?matricula,?nombre,?carrera),?calificacion >= 70,?carrera = \"LSCA\".");
                    break;
                case 6:
                    System.out.println("Copia tu query y después pegalo aqui y presiona command D.");
                    System.out.println("El query de datalog es: \n ?-aprobados(?nombreCurso, ?claveCurso, ?semestre, ?total) :- integrante (?claveCurso,_,?semestre,_,?calificacion),curso (?claveCurso,?nombreCurso,_,_),semestre = 200213,?calificacion >= 70,total = count <?claveCurso>.");
                    break;
                case 7:
                    System.out.println("Copia tu query y después pegalo aqui y presiona command D.");
                    System.out.println("El query de datalog es: \n ?-clases(?claveCurso, ?clavePrerequisito) :- prerequisito(?claveCurso, ?clavePrerequisito), ?claveCurso=\"Cb00005\".");
                    break;
                case 8:
                    System.out.println("Si quieres poner tu propio query tu query, escribelo aqui y presiona command D.");
                    System.out.println("Porfavor sigue la sintaxis Guiandote de este query: \n ?-clases(?claveCurso, ?clavePrerequisito) :- prerequisito(?claveCurso, ?clavePrerequisito), ?claveCurso=\"Cb00005\".");
                    break;
                default:
                    System.out.println("Porfavor escoge una opción válida");
            }



            CharStream input = CharStreams.fromStream(System.in);
            DatalogLexer lexer = new DatalogLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            DatalogParser parser = new DatalogParser(tokens);
            ParseTree tree = parser.program();
            System.out.println("\n");
            System.out.println(tree.toStringTree(parser));
            /*Visitador eval = new Visitador();
            HashMap<Integer, HashMap<Character, Set<Integer>>> n = eval.visit(tree);

            TablaTransicion tabla = getTablaTrancision(n,eval);
            System.out.println(tabla);*/

            ParseTreeWalker walker = new ParseTreeWalker();
            Listener listener = new Listener();
            walker.walk(listener, tree);
            // Create and execute an SQL statement that returns some data.
            //String SQL = "select EmployeeID, ManagerID from HumanResources.Employee";
            //String SQL = "select EmployeeID, ManagerID from HumanResources.Employee";
            //String SQL = "SELECT estudiante.nombre FROM dbo.estudiante WHERE estudiante.carrera='ISC'";
            String SQLPrueba = Listener.query;
            System.out.println("El resultado de la consulta es: ");
            database.getQuery(SQLPrueba);


        /*
        ParseTreeWalker walker = new ParseTreeWalker(); ?-respuesta(?EmployeeID,?ManagerID):- Employee(?EmployeeID,?ManagerID).
        MiListener listener = new MiListener();
        walker.walk(listener, tree);
        */
        }
        catch(Exception e) {
            System.out.println("Error"); }
    }
}
