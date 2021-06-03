// Generated from /Users/mer/Documents/Tec/8vo Semestre/Compiladores/Proyectos/Proyecto/src/Datalog.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DatalogParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, NOT=12, COUNT=13, AVG=14, SUM=15, MIN=16, MAX=17, IntegerLiteral=18, 
		FloatingPointLiteral=19, BooleanLiteral=20, CharacterLiteral=21, StringLiteral=22, 
		Predicate=23, Identifier=24, WS=25, COMMENT=26, MULTILINE_COMMENT=27;
	public static final int
		RULE_program = 0, RULE_fact = 1, RULE_literalList = 2, RULE_facts = 3, 
		RULE_r_rule = 4, RULE_r_rules = 5, RULE_query = 6, RULE_atom = 7, RULE_atoms = 8, 
		RULE_where = 9, RULE_variableOrLiteral = 10, RULE_variableOrLiterals = 11, 
		RULE_aggregateVariable = 12, RULE_aggregateOp = 13, RULE_variable = 14, 
		RULE_predicate = 15, RULE_literal = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "fact", "literalList", "facts", "r_rule", "r_rules", "query", 
			"atom", "atoms", "where", "variableOrLiteral", "variableOrLiterals", 
			"aggregateVariable", "aggregateOp", "variable", "predicate", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'.'", "','", "':-'", "'?-'", "'='", "'>='", "'<='", 
			"'>'", "'<'", "'not'", "'count'", "'avg'", "'sum'", "'min'", "'max'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"NOT", "COUNT", "AVG", "SUM", "MIN", "MAX", "IntegerLiteral", "FloatingPointLiteral", 
			"BooleanLiteral", "CharacterLiteral", "StringLiteral", "Predicate", "Identifier", 
			"WS", "COMMENT", "MULTILINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Datalog.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DatalogParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public FactsContext facts() {
			return getRuleContext(FactsContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public R_rulesContext r_rules() {
			return getRuleContext(R_rulesContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				facts();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(35);
					facts();
					}
					break;
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT || _la==Predicate) {
					{
					setState(38);
					r_rules();
					}
				}

				setState(41);
				query();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public LiteralListContext literalList() {
			return getRuleContext(LiteralListContext.class,0);
		}
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitFact(this);
		}
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fact);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			predicate();
			setState(45);
			match(T__0);
			setState(46);
			literalList();
			setState(47);
			match(T__1);
			setState(48);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralListContext extends ParserRuleContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public LiteralListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterLiteralList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitLiteralList(this);
		}
	}

	public final LiteralListContext literalList() throws RecognitionException {
		LiteralListContext _localctx = new LiteralListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_literalList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			literal();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(51);
				match(T__3);
				setState(52);
				literal();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactsContext extends ParserRuleContext {
		public List<FactContext> fact() {
			return getRuleContexts(FactContext.class);
		}
		public FactContext fact(int i) {
			return getRuleContext(FactContext.class,i);
		}
		public FactsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_facts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterFacts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitFacts(this);
		}
	}

	public final FactsContext facts() throws RecognitionException {
		FactsContext _localctx = new FactsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_facts);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(59); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(58);
					fact();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(61); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class R_ruleContext extends ParserRuleContext {
		public R_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_rule; }
	 
		public R_ruleContext() { }
		public void copyFrom(R_ruleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RuleQueryContext extends R_ruleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public RuleQueryContext(R_ruleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterRuleQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitRuleQuery(this);
		}
	}
	public static class NormalRuleContext extends R_ruleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomsContext atoms() {
			return getRuleContext(AtomsContext.class,0);
		}
		public NormalRuleContext(R_ruleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterNormalRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitNormalRule(this);
		}
	}

	public final R_ruleContext r_rule() throws RecognitionException {
		R_ruleContext _localctx = new R_ruleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_r_rule);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new NormalRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				atom();
				setState(64);
				match(T__4);
				setState(65);
				atoms();
				setState(66);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new RuleQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				atom();
				setState(69);
				match(T__4);
				setState(70);
				query();
				setState(71);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class R_rulesContext extends ParserRuleContext {
		public List<R_ruleContext> r_rule() {
			return getRuleContexts(R_ruleContext.class);
		}
		public R_ruleContext r_rule(int i) {
			return getRuleContext(R_ruleContext.class,i);
		}
		public R_rulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterR_rules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitR_rules(this);
		}
	}

	public final R_rulesContext r_rules() throws RecognitionException {
		R_rulesContext _localctx = new R_rulesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_r_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(75);
				r_rule();
				}
				}
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NOT || _la==Predicate );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
	 
		public QueryContext() { }
		public void copyFrom(QueryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InicioQueryContext extends QueryContext {
		public AtomsContext atoms() {
			return getRuleContext(AtomsContext.class,0);
		}
		public InicioQueryContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterInicioQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitInicioQuery(this);
		}
	}
	public static class InicioQueryRuleContext extends QueryContext {
		public R_ruleContext r_rule() {
			return getRuleContext(R_ruleContext.class,0);
		}
		public InicioQueryRuleContext(QueryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterInicioQueryRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitInicioQueryRule(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_query);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new InicioQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(T__5);
				setState(81);
				atoms();
				}
				break;
			case 2:
				_localctx = new InicioQueryRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(T__5);
				setState(83);
				r_rule();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PredicatewContext extends AtomContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public VariableOrLiteralsContext variableOrLiterals() {
			return getRuleContext(VariableOrLiteralsContext.class,0);
		}
		public PredicatewContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterPredicatew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitPredicatew(this);
		}
	}
	public static class WhereeContext extends AtomContext {
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public WhereeContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterWheree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitWheree(this);
		}
	}
	public static class NotAtooomContext extends AtomContext {
		public TerminalNode NOT() { return getToken(DatalogParser.NOT, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public NotAtooomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterNotAtooom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitNotAtooom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_atom);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new PredicatewContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				predicate();
				setState(87);
				match(T__0);
				setState(88);
				variableOrLiterals();
				setState(89);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new WhereeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				where();
				}
				break;
			case 3:
				_localctx = new NotAtooomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				match(NOT);
				setState(93);
				atom();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomsContext extends ParserRuleContext {
		public AtomsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atoms; }
	 
		public AtomsContext() { }
		public void copyFrom(AtomsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariosQueriesContext extends AtomsContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public VariosQueriesContext(AtomsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterVariosQueries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitVariosQueries(this);
		}
	}

	public final AtomsContext atoms() throws RecognitionException {
		AtomsContext _localctx = new AtomsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_atoms);
		int _la;
		try {
			_localctx = new VariosQueriesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			atom();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(97);
				match(T__3);
				setState(98);
				atom();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public WhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitWhere(this);
		}
	}

	public final WhereContext where() throws RecognitionException {
		WhereContext _localctx = new WhereContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_where);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				predicate();
				setState(105);
				match(T__6);
				setState(106);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				predicate();
				setState(109);
				match(T__7);
				setState(110);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				predicate();
				setState(113);
				match(T__8);
				setState(114);
				literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				predicate();
				setState(117);
				match(T__9);
				setState(118);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(120);
				predicate();
				setState(121);
				match(T__10);
				setState(122);
				literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableOrLiteralContext extends ParserRuleContext {
		public VariableOrLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableOrLiteral; }
	 
		public VariableOrLiteralContext() { }
		public void copyFrom(VariableOrLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableEnunContext extends VariableOrLiteralContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableEnunContext(VariableOrLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterVariableEnun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitVariableEnun(this);
		}
	}
	public static class LiteralEnunContext extends VariableOrLiteralContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralEnunContext(VariableOrLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterLiteralEnun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitLiteralEnun(this);
		}
	}
	public static class AggregateEnunContext extends VariableOrLiteralContext {
		public AggregateVariableContext aggregateVariable() {
			return getRuleContext(AggregateVariableContext.class,0);
		}
		public AggregateEnunContext(VariableOrLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterAggregateEnun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitAggregateEnun(this);
		}
	}

	public final VariableOrLiteralContext variableOrLiteral() throws RecognitionException {
		VariableOrLiteralContext _localctx = new VariableOrLiteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableOrLiteral);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				_localctx = new VariableEnunContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				variable();
				}
				break;
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
				_localctx = new LiteralEnunContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				literal();
				}
				break;
			case COUNT:
			case AVG:
			case SUM:
			case MIN:
			case MAX:
				_localctx = new AggregateEnunContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				aggregateVariable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableOrLiteralsContext extends ParserRuleContext {
		public List<VariableOrLiteralContext> variableOrLiteral() {
			return getRuleContexts(VariableOrLiteralContext.class);
		}
		public VariableOrLiteralContext variableOrLiteral(int i) {
			return getRuleContext(VariableOrLiteralContext.class,i);
		}
		public VariableOrLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableOrLiterals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterVariableOrLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitVariableOrLiterals(this);
		}
	}

	public final VariableOrLiteralsContext variableOrLiterals() throws RecognitionException {
		VariableOrLiteralsContext _localctx = new VariableOrLiteralsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableOrLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			variableOrLiteral();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(132);
				match(T__3);
				setState(133);
				variableOrLiteral();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregateVariableContext extends ParserRuleContext {
		public AggregateOpContext aggregateOp() {
			return getRuleContext(AggregateOpContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AggregateVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterAggregateVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitAggregateVariable(this);
		}
	}

	public final AggregateVariableContext aggregateVariable() throws RecognitionException {
		AggregateVariableContext _localctx = new AggregateVariableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_aggregateVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			aggregateOp();
			setState(140);
			match(T__10);
			setState(141);
			variable();
			setState(142);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregateOpContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(DatalogParser.COUNT, 0); }
		public TerminalNode AVG() { return getToken(DatalogParser.AVG, 0); }
		public TerminalNode SUM() { return getToken(DatalogParser.SUM, 0); }
		public TerminalNode MIN() { return getToken(DatalogParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(DatalogParser.MAX, 0); }
		public AggregateOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterAggregateOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitAggregateOp(this);
		}
	}

	public final AggregateOpContext aggregateOp() throws RecognitionException {
		AggregateOpContext _localctx = new AggregateOpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_aggregateOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COUNT) | (1L << AVG) | (1L << SUM) | (1L << MIN) | (1L << MAX))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DatalogParser.Identifier, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	 
		public PredicateContext() { }
		public void copyFrom(PredicateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PredicadoContext extends PredicateContext {
		public TerminalNode Predicate() { return getToken(DatalogParser.Predicate, 0); }
		public PredicadoContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterPredicado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitPredicado(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_predicate);
		try {
			_localctx = new PredicadoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(Predicate);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(DatalogParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(DatalogParser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(DatalogParser.BooleanLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(DatalogParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(DatalogParser.StringLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u009b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\5\2\'\n\2\3\2\5\2*\n\2\3\2\5\2-\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\7\48\n\4\f\4\16\4;\13\4\3\5\6\5>\n\5\r\5\16\5?\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6L\n\6\3\7\6\7O\n\7\r\7\16\7P\3\b\3\b\3"+
		"\b\3\b\5\bW\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\ta\n\t\3\n\3\n\3\n\7"+
		"\nf\n\n\f\n\16\ni\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\177\n\13\3"+
		"\f\3\f\3\f\5\f\u0084\n\f\3\r\3\r\3\r\7\r\u0089\n\r\f\r\16\r\u008c\13\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22"+
		"\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\4\3\2\17\23\3\2\24"+
		"\30\2\u009b\2,\3\2\2\2\4.\3\2\2\2\6\64\3\2\2\2\b=\3\2\2\2\nK\3\2\2\2\f"+
		"N\3\2\2\2\16V\3\2\2\2\20`\3\2\2\2\22b\3\2\2\2\24~\3\2\2\2\26\u0083\3\2"+
		"\2\2\30\u0085\3\2\2\2\32\u008d\3\2\2\2\34\u0092\3\2\2\2\36\u0094\3\2\2"+
		"\2 \u0096\3\2\2\2\"\u0098\3\2\2\2$-\5\b\5\2%\'\5\b\5\2&%\3\2\2\2&\'\3"+
		"\2\2\2\')\3\2\2\2(*\5\f\7\2)(\3\2\2\2)*\3\2\2\2*+\3\2\2\2+-\5\16\b\2,"+
		"$\3\2\2\2,&\3\2\2\2-\3\3\2\2\2./\5 \21\2/\60\7\3\2\2\60\61\5\6\4\2\61"+
		"\62\7\4\2\2\62\63\7\5\2\2\63\5\3\2\2\2\649\5\"\22\2\65\66\7\6\2\2\668"+
		"\5\"\22\2\67\65\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\7\3\2\2\2;9\3"+
		"\2\2\2<>\5\4\3\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\t\3\2\2\2AB"+
		"\5\20\t\2BC\7\7\2\2CD\5\22\n\2DE\7\5\2\2EL\3\2\2\2FG\5\20\t\2GH\7\7\2"+
		"\2HI\5\16\b\2IJ\7\5\2\2JL\3\2\2\2KA\3\2\2\2KF\3\2\2\2L\13\3\2\2\2MO\5"+
		"\n\6\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\r\3\2\2\2RS\7\b\2\2SW"+
		"\5\22\n\2TU\7\b\2\2UW\5\n\6\2VR\3\2\2\2VT\3\2\2\2W\17\3\2\2\2XY\5 \21"+
		"\2YZ\7\3\2\2Z[\5\30\r\2[\\\7\4\2\2\\a\3\2\2\2]a\5\24\13\2^_\7\16\2\2_"+
		"a\5\20\t\2`X\3\2\2\2`]\3\2\2\2`^\3\2\2\2a\21\3\2\2\2bg\5\20\t\2cd\7\6"+
		"\2\2df\5\20\t\2ec\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\23\3\2\2\2ig"+
		"\3\2\2\2jk\5 \21\2kl\7\t\2\2lm\5\"\22\2m\177\3\2\2\2no\5 \21\2op\7\n\2"+
		"\2pq\5\"\22\2q\177\3\2\2\2rs\5 \21\2st\7\13\2\2tu\5\"\22\2u\177\3\2\2"+
		"\2vw\5 \21\2wx\7\f\2\2xy\5\"\22\2y\177\3\2\2\2z{\5 \21\2{|\7\r\2\2|}\5"+
		"\"\22\2}\177\3\2\2\2~j\3\2\2\2~n\3\2\2\2~r\3\2\2\2~v\3\2\2\2~z\3\2\2\2"+
		"\177\25\3\2\2\2\u0080\u0084\5\36\20\2\u0081\u0084\5\"\22\2\u0082\u0084"+
		"\5\32\16\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2"+
		"\u0084\27\3\2\2\2\u0085\u008a\5\26\f\2\u0086\u0087\7\6\2\2\u0087\u0089"+
		"\5\26\f\2\u0088\u0086\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2"+
		"\u008a\u008b\3\2\2\2\u008b\31\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e"+
		"\5\34\17\2\u008e\u008f\7\r\2\2\u008f\u0090\5\36\20\2\u0090\u0091\7\f\2"+
		"\2\u0091\33\3\2\2\2\u0092\u0093\t\2\2\2\u0093\35\3\2\2\2\u0094\u0095\7"+
		"\32\2\2\u0095\37\3\2\2\2\u0096\u0097\7\31\2\2\u0097!\3\2\2\2\u0098\u0099"+
		"\t\3\2\2\u0099#\3\2\2\2\17&),9?KPV`g~\u0083\u008a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}