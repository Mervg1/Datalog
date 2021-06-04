// Generated from /Users/mer/Documents/Tec/8vo Semestre/Compiladores/Proyectos/Proyecto/src/Datalog.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DatalogParser}.
 */
public interface DatalogListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DatalogParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DatalogParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DatalogParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFact(DatalogParser.FactContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFact(DatalogParser.FactContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#literalList}.
	 * @param ctx the parse tree
	 */
	void enterLiteralList(DatalogParser.LiteralListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#literalList}.
	 * @param ctx the parse tree
	 */
	void exitLiteralList(DatalogParser.LiteralListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#facts}.
	 * @param ctx the parse tree
	 */
	void enterFacts(DatalogParser.FactsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#facts}.
	 * @param ctx the parse tree
	 */
	void exitFacts(DatalogParser.FactsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalRule}
	 * labeled alternative in {@link DatalogParser#r_rule}.
	 * @param ctx the parse tree
	 */
	void enterNormalRule(DatalogParser.NormalRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalRule}
	 * labeled alternative in {@link DatalogParser#r_rule}.
	 * @param ctx the parse tree
	 */
	void exitNormalRule(DatalogParser.NormalRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RuleQuery}
	 * labeled alternative in {@link DatalogParser#r_rule}.
	 * @param ctx the parse tree
	 */
	void enterRuleQuery(DatalogParser.RuleQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RuleQuery}
	 * labeled alternative in {@link DatalogParser#r_rule}.
	 * @param ctx the parse tree
	 */
	void exitRuleQuery(DatalogParser.RuleQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#r_rules}.
	 * @param ctx the parse tree
	 */
	void enterR_rules(DatalogParser.R_rulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#r_rules}.
	 * @param ctx the parse tree
	 */
	void exitR_rules(DatalogParser.R_rulesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InicioQuery}
	 * labeled alternative in {@link DatalogParser#query}.
	 * @param ctx the parse tree
	 */
	void enterInicioQuery(DatalogParser.InicioQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InicioQuery}
	 * labeled alternative in {@link DatalogParser#query}.
	 * @param ctx the parse tree
	 */
	void exitInicioQuery(DatalogParser.InicioQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InicioQueryRule}
	 * labeled alternative in {@link DatalogParser#query}.
	 * @param ctx the parse tree
	 */
	void enterInicioQueryRule(DatalogParser.InicioQueryRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InicioQueryRule}
	 * labeled alternative in {@link DatalogParser#query}.
	 * @param ctx the parse tree
	 */
	void exitInicioQueryRule(DatalogParser.InicioQueryRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Predicatew}
	 * labeled alternative in {@link DatalogParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterPredicatew(DatalogParser.PredicatewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Predicatew}
	 * labeled alternative in {@link DatalogParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitPredicatew(DatalogParser.PredicatewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Wheree}
	 * labeled alternative in {@link DatalogParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterWheree(DatalogParser.WhereeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Wheree}
	 * labeled alternative in {@link DatalogParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitWheree(DatalogParser.WhereeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotAtooom}
	 * labeled alternative in {@link DatalogParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNotAtooom(DatalogParser.NotAtooomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotAtooom}
	 * labeled alternative in {@link DatalogParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNotAtooom(DatalogParser.NotAtooomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariosQueries}
	 * labeled alternative in {@link DatalogParser#atoms}.
	 * @param ctx the parse tree
	 */
	void enterVariosQueries(DatalogParser.VariosQueriesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariosQueries}
	 * labeled alternative in {@link DatalogParser#atoms}.
	 * @param ctx the parse tree
	 */
	void exitVariosQueries(DatalogParser.VariosQueriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#where}.
	 * @param ctx the parse tree
	 */
	void enterWhere(DatalogParser.WhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#where}.
	 * @param ctx the parse tree
	 */
	void exitWhere(DatalogParser.WhereContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableEnun}
	 * labeled alternative in {@link DatalogParser#variableOrLiteral}.
	 * @param ctx the parse tree
	 */
	void enterVariableEnun(DatalogParser.VariableEnunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableEnun}
	 * labeled alternative in {@link DatalogParser#variableOrLiteral}.
	 * @param ctx the parse tree
	 */
	void exitVariableEnun(DatalogParser.VariableEnunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralEnun}
	 * labeled alternative in {@link DatalogParser#variableOrLiteral}.
	 * @param ctx the parse tree
	 */
	void enterLiteralEnun(DatalogParser.LiteralEnunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralEnun}
	 * labeled alternative in {@link DatalogParser#variableOrLiteral}.
	 * @param ctx the parse tree
	 */
	void exitLiteralEnun(DatalogParser.LiteralEnunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AggregateEnun}
	 * labeled alternative in {@link DatalogParser#variableOrLiteral}.
	 * @param ctx the parse tree
	 */
	void enterAggregateEnun(DatalogParser.AggregateEnunContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AggregateEnun}
	 * labeled alternative in {@link DatalogParser#variableOrLiteral}.
	 * @param ctx the parse tree
	 */
	void exitAggregateEnun(DatalogParser.AggregateEnunContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Nothing}
	 * labeled alternative in {@link DatalogParser#variableOrLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNothing(DatalogParser.NothingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Nothing}
	 * labeled alternative in {@link DatalogParser#variableOrLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNothing(DatalogParser.NothingContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#variableOrLiterals}.
	 * @param ctx the parse tree
	 */
	void enterVariableOrLiterals(DatalogParser.VariableOrLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#variableOrLiterals}.
	 * @param ctx the parse tree
	 */
	void exitVariableOrLiterals(DatalogParser.VariableOrLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#aggregateVariable}.
	 * @param ctx the parse tree
	 */
	void enterAggregateVariable(DatalogParser.AggregateVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#aggregateVariable}.
	 * @param ctx the parse tree
	 */
	void exitAggregateVariable(DatalogParser.AggregateVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#aggregateOp}.
	 * @param ctx the parse tree
	 */
	void enterAggregateOp(DatalogParser.AggregateOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#aggregateOp}.
	 * @param ctx the parse tree
	 */
	void exitAggregateOp(DatalogParser.AggregateOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(DatalogParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(DatalogParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Predicado}
	 * labeled alternative in {@link DatalogParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicado(DatalogParser.PredicadoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Predicado}
	 * labeled alternative in {@link DatalogParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicado(DatalogParser.PredicadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DatalogParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(DatalogParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DatalogParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(DatalogParser.LiteralContext ctx);
}