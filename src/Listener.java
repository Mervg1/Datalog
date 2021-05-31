public class Listener extends DatalogBaseListener{

    String variable = "";
    String literal = "";
    String predicado = "";
    String SQL = "";
    String var1 = "";
    String var2 = "";
    String var3 = "";
    String var4 = "";
    String var5 = "";
    Boolean var1Variable = false;
    Boolean var2Variable = false;
    Boolean var3Variable = false;
    Boolean var4Variable = false;
    Boolean var5Variable = false;
    Integer counterVariables = 0;

    @Override public void enterInicioQuery(DatalogParser.InicioQueryContext ctx) {
        System.out.println("Aqui esta el query " + ctx.getText());
    }

    @Override public void enterPredicado(DatalogParser.PredicadoContext ctx) {
        System.out.println("Aqui esta el predicado " + ctx.getText());
        predicado = ctx.getText();
    }

    @Override public void enterVariableEnun(DatalogParser.VariableEnunContext ctx) {
        System.out.println("Aqui esta la variable " + ctx.getText());
        variable = ctx.getText();
        if(counterVariables == 0){
            var1 = ctx.getText();
            var1Variable = true;
        }else if(counterVariables == 1){
            var2 = ctx.getText();
            var2Variable = true;
        }else if(counterVariables == 2){
            var3 = ctx.getText();
            var3Variable = true;
        }else if(counterVariables == 3){
            var4 = ctx.getText();
            var4Variable = true;
        }else{
            var5 = ctx.getText();
            var5Variable = true;
        }

        counterVariables++;

    }

    @Override public void enterLiteralEnun(DatalogParser.LiteralEnunContext ctx) {
        System.out.println("Aqui esta la literal " + ctx.getText());
        literal = ctx.getText();
        if(counterVariables == 0){
            var1 = ctx.getText();
        }else if(counterVariables == 1){
            var2 = ctx.getText();
        }else if(counterVariables == 2){
            var3 = ctx.getText();
        }else if(counterVariables == 3){
            var4 = ctx.getText();
        }else{
            var5 = ctx.getText();
        }

        counterVariables++;


    }

    @Override public void exitInicioQuery(DatalogParser.InicioQueryContext ctx) {
        System.out.println("Aqui esta el query " + ctx.getText());
        System.out.println("counter " + counterVariables);
        SQL = "SELECT ";
        String fromAux = "FROM " + predicado;
        String whereAux = ", WHERE ";
        //Vemos sobre que tabla se debe buscar el elemento
        if(predicado.equals("estudiante")){
            for(int i = 0; i < counterVariables; i++){
                if(i == 0){
                    if(var1Variable == true){
                        SQL += "matricula , ";
                    }else{
                        whereAux += "matricula = " + var1 + ",";
                    }
                }else if(i == 1){
                    if(var2Variable == true){
                        SQL += "nombre , ";
                    }else{
                        whereAux += "nombre = " + var2 + ",";
                    }
                }else if(i == 2){
                    if(var3Variable == true){
                        SQL += "carrera, ";
                    }else{
                        whereAux += "carrera = " + var3 + ";";
                    }
                }
            }

        }

        SQL += fromAux + whereAux;
        System.out.println(SQL);
    }
}
