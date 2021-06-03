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
            String SQL = "SELECT estudiante.nombre FROM dbo.estudiante WHERE estudiante.carrera='ISC'";
            String SQLPrueba = Listener.query;
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
