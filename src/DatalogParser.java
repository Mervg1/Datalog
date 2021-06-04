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
		T__9=10, T__10=11, T__11=12, NOT=13, COUNT=14, AVG=15, SUM=16, MIN=17, 
		MAX=18, IntegerLiteral=19, FloatingPointLiteral=20, BooleanLiteral=21, 
		CharacterLiteral=22, StringLiteral=23, Predicate=24, Identifier=25, WS=26, 
		COMMENT=27, MULTILINE_COMMENT=28;
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
			"'>'", "'<'", "'_'", "'not'", "'count'", "'avg'", "'sum'", "'min'", "'max'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "NOT", "COUNT", "AVG", "SUM", "MIN", "MAX", "IntegerLiteral", "FloatingPointLiteral", 
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
		public R_rulesContext r_rules() {
			return getRuleContext(R_rulesContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
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
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << Predicate) | (1L << Identifier))) != 0)) {
					{
					setState(38);
					r_rules();
					}
				}

				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(41);
					query();
					}
				}

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
			setState(46);
			predicate();
			setState(47);
			match(T__0);
			setState(48);
			literalList();
			setState(49);
			match(T__1);
			setState(50);
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
			setState(52);
			literal();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(53);
				match(T__3);
				setState(54);
				literal();
				}
				}
				setState(59);
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
			setState(61); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(60);
					fact();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(63); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new NormalRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				atom();
				setState(66);
				match(T__4);
				setState(67);
				atoms();
				setState(68);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new RuleQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				atom();
				setState(71);
				match(T__4);
				setState(72);
				query();
				setState(73);
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
			setState(78); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(77);
				r_rule();
				}
				}
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << Predicate) | (1L << Identifier))) != 0) );
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
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new InicioQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(T__5);
				setState(83);
				atoms();
				}
				break;
			case 2:
				_localctx = new InicioQueryRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(T__5);
				setState(85);
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
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new PredicatewContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				predicate();
				setState(89);
				match(T__0);
				setState(90);
				variableOrLiterals();
				setState(91);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new WhereeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				where();
				}
				break;
			case 3:
				_localctx = new NotAtooomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(NOT);
				setState(95);
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
			setState(98);
			atom();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(99);
				match(T__3);
				setState(100);
				atom();
				}
				}
				setState(105);
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
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
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				predicate();
				setState(107);
				match(T__6);
				setState(108);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				predicate();
				setState(111);
				match(T__7);
				setState(112);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				predicate();
				setState(115);
				match(T__8);
				setState(116);
				literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				predicate();
				setState(119);
				match(T__9);
				setState(120);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(122);
				predicate();
				setState(123);
				match(T__10);
				setState(124);
				literal();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(126);
				variable();
				setState(127);
				match(T__6);
				setState(128);
				literal();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(130);
				variable();
				setState(131);
				match(T__7);
				setState(132);
				literal();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(134);
				variable();
				setState(135);
				match(T__8);
				setState(136);
				literal();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(138);
				variable();
				setState(139);
				match(T__9);
				setState(140);
				literal();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(142);
				variable();
				setState(143);
				match(T__10);
				setState(144);
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
	public static class NothingContext extends VariableOrLiteralContext {
		public NothingContext(VariableOrLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterNothing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitNothing(this);
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
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new VariableEnunContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				variable();
				}
				break;
			case 2:
				_localctx = new LiteralEnunContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				literal();
				}
				break;
			case 3:
				_localctx = new AggregateEnunContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				aggregateVariable();
				}
				break;
			case 4:
				_localctx = new NothingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				match(T__11);
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
			setState(154);
			variableOrLiteral();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(155);
				match(T__3);
				setState(156);
				variableOrLiteral();
				}
				}
				setState(161);
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
			setState(162);
			aggregateOp();
			setState(163);
			match(T__10);
			setState(164);
			variable();
			setState(165);
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
			setState(167);
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
			setState(169);
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
			setState(171);
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
		public TerminalNode COUNT() { return getToken(DatalogParser.COUNT, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
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
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(IntegerLiteral);
				}
				break;
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(FloatingPointLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(BooleanLiteral);
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				match(CharacterLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				match(StringLiteral);
				}
				break;
			case COUNT:
				enterOuterAlt(_localctx, 6);
				{
				setState(178);
				match(COUNT);
				setState(179);
				match(T__10);
				setState(180);
				variable();
				setState(181);
				match(T__9);
				}
				break;
			case Predicate:
				enterOuterAlt(_localctx, 7);
				{
				setState(183);
				predicate();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u00bd\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\5\2\'\n\2\3\2\5\2*\n\2\3\2\5\2-\n\2\5\2/\n\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\7\4:\n\4\f\4\16\4=\13\4\3\5\6\5@\n\5\r\5\16\5A\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6N\n\6\3\7\6\7Q\n\7\r\7\16\7"+
		"R\3\b\3\b\3\b\3\b\5\bY\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tc\n\t\3"+
		"\n\3\n\3\n\7\nh\n\n\f\n\16\nk\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u0095\n\13\3\f\3\f\3\f\3\f\5\f\u009b\n"+
		"\f\3\r\3\r\3\r\7\r\u00a0\n\r\f\r\16\r\u00a3\13\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\5\22\u00bb\n\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"\2\3\3\2\20\24\2\u00ca\2.\3\2\2\2\4\60\3\2\2\2\6\66"+
		"\3\2\2\2\b?\3\2\2\2\nM\3\2\2\2\fP\3\2\2\2\16X\3\2\2\2\20b\3\2\2\2\22d"+
		"\3\2\2\2\24\u0094\3\2\2\2\26\u009a\3\2\2\2\30\u009c\3\2\2\2\32\u00a4\3"+
		"\2\2\2\34\u00a9\3\2\2\2\36\u00ab\3\2\2\2 \u00ad\3\2\2\2\"\u00ba\3\2\2"+
		"\2$/\5\b\5\2%\'\5\b\5\2&%\3\2\2\2&\'\3\2\2\2\')\3\2\2\2(*\5\f\7\2)(\3"+
		"\2\2\2)*\3\2\2\2*,\3\2\2\2+-\5\16\b\2,+\3\2\2\2,-\3\2\2\2-/\3\2\2\2.$"+
		"\3\2\2\2.&\3\2\2\2/\3\3\2\2\2\60\61\5 \21\2\61\62\7\3\2\2\62\63\5\6\4"+
		"\2\63\64\7\4\2\2\64\65\7\5\2\2\65\5\3\2\2\2\66;\5\"\22\2\678\7\6\2\28"+
		":\5\"\22\29\67\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\7\3\2\2\2=;\3\2"+
		"\2\2>@\5\4\3\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\t\3\2\2\2CD\5"+
		"\20\t\2DE\7\7\2\2EF\5\22\n\2FG\7\5\2\2GN\3\2\2\2HI\5\20\t\2IJ\7\7\2\2"+
		"JK\5\16\b\2KL\7\5\2\2LN\3\2\2\2MC\3\2\2\2MH\3\2\2\2N\13\3\2\2\2OQ\5\n"+
		"\6\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\r\3\2\2\2TU\7\b\2\2UY\5"+
		"\22\n\2VW\7\b\2\2WY\5\n\6\2XT\3\2\2\2XV\3\2\2\2Y\17\3\2\2\2Z[\5 \21\2"+
		"[\\\7\3\2\2\\]\5\30\r\2]^\7\4\2\2^c\3\2\2\2_c\5\24\13\2`a\7\17\2\2ac\5"+
		"\20\t\2bZ\3\2\2\2b_\3\2\2\2b`\3\2\2\2c\21\3\2\2\2di\5\20\t\2ef\7\6\2\2"+
		"fh\5\20\t\2ge\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\23\3\2\2\2ki\3\2"+
		"\2\2lm\5 \21\2mn\7\t\2\2no\5\"\22\2o\u0095\3\2\2\2pq\5 \21\2qr\7\n\2\2"+
		"rs\5\"\22\2s\u0095\3\2\2\2tu\5 \21\2uv\7\13\2\2vw\5\"\22\2w\u0095\3\2"+
		"\2\2xy\5 \21\2yz\7\f\2\2z{\5\"\22\2{\u0095\3\2\2\2|}\5 \21\2}~\7\r\2\2"+
		"~\177\5\"\22\2\177\u0095\3\2\2\2\u0080\u0081\5\36\20\2\u0081\u0082\7\t"+
		"\2\2\u0082\u0083\5\"\22\2\u0083\u0095\3\2\2\2\u0084\u0085\5\36\20\2\u0085"+
		"\u0086\7\n\2\2\u0086\u0087\5\"\22\2\u0087\u0095\3\2\2\2\u0088\u0089\5"+
		"\36\20\2\u0089\u008a\7\13\2\2\u008a\u008b\5\"\22\2\u008b\u0095\3\2\2\2"+
		"\u008c\u008d\5\36\20\2\u008d\u008e\7\f\2\2\u008e\u008f\5\"\22\2\u008f"+
		"\u0095\3\2\2\2\u0090\u0091\5\36\20\2\u0091\u0092\7\r\2\2\u0092\u0093\5"+
		"\"\22\2\u0093\u0095\3\2\2\2\u0094l\3\2\2\2\u0094p\3\2\2\2\u0094t\3\2\2"+
		"\2\u0094x\3\2\2\2\u0094|\3\2\2\2\u0094\u0080\3\2\2\2\u0094\u0084\3\2\2"+
		"\2\u0094\u0088\3\2\2\2\u0094\u008c\3\2\2\2\u0094\u0090\3\2\2\2\u0095\25"+
		"\3\2\2\2\u0096\u009b\5\36\20\2\u0097\u009b\5\"\22\2\u0098\u009b\5\32\16"+
		"\2\u0099\u009b\7\16\2\2\u009a\u0096\3\2\2\2\u009a\u0097\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\27\3\2\2\2\u009c\u00a1\5\26\f"+
		"\2\u009d\u009e\7\6\2\2\u009e\u00a0\5\26\f\2\u009f\u009d\3\2\2\2\u00a0"+
		"\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\31\3\2\2"+
		"\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\5\34\17\2\u00a5\u00a6\7\r\2\2\u00a6"+
		"\u00a7\5\36\20\2\u00a7\u00a8\7\f\2\2\u00a8\33\3\2\2\2\u00a9\u00aa\t\2"+
		"\2\2\u00aa\35\3\2\2\2\u00ab\u00ac\7\33\2\2\u00ac\37\3\2\2\2\u00ad\u00ae"+
		"\7\32\2\2\u00ae!\3\2\2\2\u00af\u00bb\7\25\2\2\u00b0\u00bb\7\26\2\2\u00b1"+
		"\u00bb\7\27\2\2\u00b2\u00bb\7\30\2\2\u00b3\u00bb\7\31\2\2\u00b4\u00b5"+
		"\7\20\2\2\u00b5\u00b6\7\r\2\2\u00b6\u00b7\5\36\20\2\u00b7\u00b8\7\f\2"+
		"\2\u00b8\u00bb\3\2\2\2\u00b9\u00bb\5 \21\2\u00ba\u00af\3\2\2\2\u00ba\u00b0"+
		"\3\2\2\2\u00ba\u00b1\3\2\2\2\u00ba\u00b2\3\2\2\2\u00ba\u00b3\3\2\2\2\u00ba"+
		"\u00b4\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb#\3\2\2\2\21&),.;AMRXbi\u0094"+
		"\u009a\u00a1\u00ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}