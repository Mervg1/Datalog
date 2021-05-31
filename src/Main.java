import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {

            //?-curso(?cc,?nombre,?unidades,?departamento),grupo(?cc,?idC,?semestre,"Abel Bueno").

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



        /*
        ParseTreeWalker walker = new ParseTreeWalker();
        MiListener listener = new MiListener();
        walker.walk(listener, tree);
        */
        }
        catch(Exception e) {
            System.out.println("Error"); }
    }
}
