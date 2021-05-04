// Generated from /Users/mer/Documents/Tec/8vo Semestre/Compiladores/Proyectos/Proyecto/src/Grammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DatalogLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, NOT=9, 
		COUNT=10, AVG=11, SUM=12, MIN=13, MAX=14, IntegerLiteral=15, FloatingPointLiteral=16, 
		BooleanLiteral=17, CharacterLiteral=18, StringLiteral=19, Predicate=20, 
		Identifier=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "NOT", 
			"COUNT", "AVG", "SUM", "MIN", "MAX", "IntegerLiteral", "DecimalIntegerLiteral", 
			"HexIntegerLiteral", "OctalIntegerLiteral", "BinaryIntegerLiteral", "IntegerTypeSuffix", 
			"DecimalNumeral", "Digits", "Digit", "NonZeroDigit", "DigitsAndUnderscores", 
			"DigitOrUnderscore", "Underscores", "HexNumeral", "HexDigits", "HexDigit", 
			"HexDigitsAndUnderscores", "HexDigitOrUnderscore", "OctalNumeral", "OctalDigits", 
			"OctalDigit", "OctalDigitsAndUnderscores", "OctalDigitOrUnderscore", 
			"BinaryNumeral", "BinaryDigits", "BinaryDigit", "BinaryDigitsAndUnderscores", 
			"BinaryDigitOrUnderscore", "FloatingPointLiteral", "DecimalFloatingPointLiteral", 
			"ExponentPart", "ExponentIndicator", "SignedInteger", "Sign", "FloatTypeSuffix", 
			"HexadecimalFloatingPointLiteral", "HexSignificand", "BinaryExponent", 
			"BinaryExponentIndicator", "BooleanLiteral", "CharacterLiteral", "SingleCharacter", 
			"StringLiteral", "StringCharacters", "StringCharacter", "EscapeSequence", 
			"OctalEscape", "ZeroToThree", "Predicate", "Identifier", "IdentifierLetter", 
			"IdentifierLetterOrDigit", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'.'", "','", "':-'", "'?-'", "'<'", "'>'", "'not'", 
			"'count'", "'avg'", "'sum'", "'min'", "'max'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "NOT", "COUNT", 
			"AVG", "SUM", "MIN", "MAX", "IntegerLiteral", "FloatingPointLiteral", 
			"BooleanLiteral", "CharacterLiteral", "StringLiteral", "Predicate", "Identifier", 
			"WS"
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


	public DatalogLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u01d2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00ba\n\20\3\21\3\21"+
		"\5\21\u00be\n\21\3\22\3\22\5\22\u00c2\n\22\3\23\3\23\5\23\u00c6\n\23\3"+
		"\24\3\24\5\24\u00ca\n\24\3\25\3\25\3\26\3\26\3\26\5\26\u00d1\n\26\3\26"+
		"\3\26\3\26\5\26\u00d6\n\26\5\26\u00d8\n\26\3\27\3\27\5\27\u00dc\n\27\3"+
		"\27\5\27\u00df\n\27\3\30\3\30\5\30\u00e3\n\30\3\31\3\31\3\32\6\32\u00e8"+
		"\n\32\r\32\16\32\u00e9\3\33\3\33\5\33\u00ee\n\33\3\34\6\34\u00f1\n\34"+
		"\r\34\16\34\u00f2\3\35\3\35\3\35\3\35\3\36\3\36\5\36\u00fb\n\36\3\36\5"+
		"\36\u00fe\n\36\3\37\3\37\3 \6 \u0103\n \r \16 \u0104\3!\3!\5!\u0109\n"+
		"!\3\"\3\"\5\"\u010d\n\"\3\"\3\"\3#\3#\5#\u0113\n#\3#\5#\u0116\n#\3$\3"+
		"$\3%\6%\u011b\n%\r%\16%\u011c\3&\3&\5&\u0121\n&\3\'\3\'\3\'\3\'\3(\3("+
		"\5(\u0129\n(\3(\5(\u012c\n(\3)\3)\3*\6*\u0131\n*\r*\16*\u0132\3+\3+\5"+
		"+\u0137\n+\3,\3,\5,\u013b\n,\3-\3-\3-\5-\u0140\n-\3-\5-\u0143\n-\3-\5"+
		"-\u0146\n-\3-\3-\3-\5-\u014b\n-\3-\5-\u014e\n-\3-\3-\3-\5-\u0153\n-\3"+
		"-\3-\3-\5-\u0158\n-\3.\3.\3.\3/\3/\3\60\5\60\u0160\n\60\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\3\63\5\63\u016b\n\63\3\64\3\64\5\64\u016f\n"+
		"\64\3\64\3\64\3\64\5\64\u0174\n\64\3\64\3\64\5\64\u0178\n\64\3\65\3\65"+
		"\3\65\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0188"+
		"\n\67\38\38\38\38\38\38\38\38\58\u0192\n8\39\39\3:\3:\5:\u0198\n:\3:\3"+
		":\3;\6;\u019d\n;\r;\16;\u019e\3<\3<\5<\u01a3\n<\3=\3=\3=\5=\u01a8\n=\3"+
		">\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u01b5\n>\3?\3?\3@\3@\7@\u01bb\n@\f"+
		"@\16@\u01be\13@\3A\3A\3A\7A\u01c3\nA\fA\16A\u01c6\13A\3B\3B\3C\3C\3D\6"+
		"D\u01cd\nD\rD\16D\u01ce\3D\3D\2\2E\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\2#\2%\2\'\2)\2+\2-\2/\2\61\2"+
		"\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\22Y\2[\2"+
		"]\2_\2a\2c\2e\2g\2i\2k\2m\23o\24q\2s\25u\2w\2y\2{\2}\2\177\26\u0081\27"+
		"\u0083\2\u0085\2\u0087\30\3\2\24\4\2NNnn\3\2\63;\4\2ZZzz\5\2\62;CHch\3"+
		"\2\629\4\2DDdd\3\2\62\63\4\2GGgg\4\2--//\6\2FFHHffhh\4\2RRrr\6\2\f\f\17"+
		"\17))^^\6\2\f\f\17\17$$^^\n\2$$))^^ddhhppttvv\3\2\62\65\4\2C\\c|\6\2\62"+
		";C\\aac|\5\2\13\f\16\17\"\"\2\u01db\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2W\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2s\3\2\2\2\2\177\3"+
		"\2\2\2\2\u0081\3\2\2\2\2\u0087\3\2\2\2\3\u0089\3\2\2\2\5\u008b\3\2\2\2"+
		"\7\u008d\3\2\2\2\t\u008f\3\2\2\2\13\u0091\3\2\2\2\r\u0094\3\2\2\2\17\u0097"+
		"\3\2\2\2\21\u0099\3\2\2\2\23\u009b\3\2\2\2\25\u009f\3\2\2\2\27\u00a5\3"+
		"\2\2\2\31\u00a9\3\2\2\2\33\u00ad\3\2\2\2\35\u00b1\3\2\2\2\37\u00b9\3\2"+
		"\2\2!\u00bb\3\2\2\2#\u00bf\3\2\2\2%\u00c3\3\2\2\2\'\u00c7\3\2\2\2)\u00cb"+
		"\3\2\2\2+\u00d7\3\2\2\2-\u00d9\3\2\2\2/\u00e2\3\2\2\2\61\u00e4\3\2\2\2"+
		"\63\u00e7\3\2\2\2\65\u00ed\3\2\2\2\67\u00f0\3\2\2\29\u00f4\3\2\2\2;\u00f8"+
		"\3\2\2\2=\u00ff\3\2\2\2?\u0102\3\2\2\2A\u0108\3\2\2\2C\u010a\3\2\2\2E"+
		"\u0110\3\2\2\2G\u0117\3\2\2\2I\u011a\3\2\2\2K\u0120\3\2\2\2M\u0122\3\2"+
		"\2\2O\u0126\3\2\2\2Q\u012d\3\2\2\2S\u0130\3\2\2\2U\u0136\3\2\2\2W\u013a"+
		"\3\2\2\2Y\u0157\3\2\2\2[\u0159\3\2\2\2]\u015c\3\2\2\2_\u015f\3\2\2\2a"+
		"\u0163\3\2\2\2c\u0165\3\2\2\2e\u0167\3\2\2\2g\u0177\3\2\2\2i\u0179\3\2"+
		"\2\2k\u017c\3\2\2\2m\u0187\3\2\2\2o\u0191\3\2\2\2q\u0193\3\2\2\2s\u0195"+
		"\3\2\2\2u\u019c\3\2\2\2w\u01a2\3\2\2\2y\u01a7\3\2\2\2{\u01b4\3\2\2\2}"+
		"\u01b6\3\2\2\2\177\u01b8\3\2\2\2\u0081\u01bf\3\2\2\2\u0083\u01c7\3\2\2"+
		"\2\u0085\u01c9\3\2\2\2\u0087\u01cc\3\2\2\2\u0089\u008a\7*\2\2\u008a\4"+
		"\3\2\2\2\u008b\u008c\7+\2\2\u008c\6\3\2\2\2\u008d\u008e\7\60\2\2\u008e"+
		"\b\3\2\2\2\u008f\u0090\7.\2\2\u0090\n\3\2\2\2\u0091\u0092\7<\2\2\u0092"+
		"\u0093\7/\2\2\u0093\f\3\2\2\2\u0094\u0095\7A\2\2\u0095\u0096\7/\2\2\u0096"+
		"\16\3\2\2\2\u0097\u0098\7>\2\2\u0098\20\3\2\2\2\u0099\u009a\7@\2\2\u009a"+
		"\22\3\2\2\2\u009b\u009c\7p\2\2\u009c\u009d\7q\2\2\u009d\u009e\7v\2\2\u009e"+
		"\24\3\2\2\2\u009f\u00a0\7e\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7w\2\2\u00a2"+
		"\u00a3\7p\2\2\u00a3\u00a4\7v\2\2\u00a4\26\3\2\2\2\u00a5\u00a6\7c\2\2\u00a6"+
		"\u00a7\7x\2\2\u00a7\u00a8\7i\2\2\u00a8\30\3\2\2\2\u00a9\u00aa\7u\2\2\u00aa"+
		"\u00ab\7w\2\2\u00ab\u00ac\7o\2\2\u00ac\32\3\2\2\2\u00ad\u00ae\7o\2\2\u00ae"+
		"\u00af\7k\2\2\u00af\u00b0\7p\2\2\u00b0\34\3\2\2\2\u00b1\u00b2\7o\2\2\u00b2"+
		"\u00b3\7c\2\2\u00b3\u00b4\7z\2\2\u00b4\36\3\2\2\2\u00b5\u00ba\5!\21\2"+
		"\u00b6\u00ba\5#\22\2\u00b7\u00ba\5%\23\2\u00b8\u00ba\5\'\24\2\u00b9\u00b5"+
		"\3\2\2\2\u00b9\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba"+
		" \3\2\2\2\u00bb\u00bd\5+\26\2\u00bc\u00be\5)\25\2\u00bd\u00bc\3\2\2\2"+
		"\u00bd\u00be\3\2\2\2\u00be\"\3\2\2\2\u00bf\u00c1\59\35\2\u00c0\u00c2\5"+
		")\25\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2$\3\2\2\2\u00c3\u00c5"+
		"\5C\"\2\u00c4\u00c6\5)\25\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"&\3\2\2\2\u00c7\u00c9\5M\'\2\u00c8\u00ca\5)\25\2\u00c9\u00c8\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca(\3\2\2\2\u00cb\u00cc\t\2\2\2\u00cc*\3\2\2\2\u00cd"+
		"\u00d8\7\62\2\2\u00ce\u00d5\5\61\31\2\u00cf\u00d1\5-\27\2\u00d0\u00cf"+
		"\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d6\3\2\2\2\u00d2\u00d3\5\67\34\2"+
		"\u00d3\u00d4\5-\27\2\u00d4\u00d6\3\2\2\2\u00d5\u00d0\3\2\2\2\u00d5\u00d2"+
		"\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00cd\3\2\2\2\u00d7\u00ce\3\2\2\2\u00d8"+
		",\3\2\2\2\u00d9\u00de\5/\30\2\u00da\u00dc\5\63\32\2\u00db\u00da\3\2\2"+
		"\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\5/\30\2\u00de\u00db"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df.\3\2\2\2\u00e0\u00e3\7\62\2\2\u00e1"+
		"\u00e3\5\61\31\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\60\3\2"+
		"\2\2\u00e4\u00e5\t\3\2\2\u00e5\62\3\2\2\2\u00e6\u00e8\5\65\33\2\u00e7"+
		"\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\64\3\2\2\2\u00eb\u00ee\5/\30\2\u00ec\u00ee\7a\2\2\u00ed\u00eb"+
		"\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\66\3\2\2\2\u00ef\u00f1\7a\2\2\u00f0"+
		"\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2"+
		"\2\2\u00f38\3\2\2\2\u00f4\u00f5\7\62\2\2\u00f5\u00f6\t\4\2\2\u00f6\u00f7"+
		"\5;\36\2\u00f7:\3\2\2\2\u00f8\u00fd\5=\37\2\u00f9\u00fb\5? \2\u00fa\u00f9"+
		"\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\5=\37\2\u00fd"+
		"\u00fa\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe<\3\2\2\2\u00ff\u0100\t\5\2\2"+
		"\u0100>\3\2\2\2\u0101\u0103\5A!\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105@\3\2\2\2\u0106\u0109"+
		"\5=\37\2\u0107\u0109\7a\2\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109"+
		"B\3\2\2\2\u010a\u010c\7\62\2\2\u010b\u010d\5\67\34\2\u010c\u010b\3\2\2"+
		"\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\5E#\2\u010fD\3"+
		"\2\2\2\u0110\u0115\5G$\2\u0111\u0113\5I%\2\u0112\u0111\3\2\2\2\u0112\u0113"+
		"\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\5G$\2\u0115\u0112\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116F\3\2\2\2\u0117\u0118\t\6\2\2\u0118H\3\2\2\2\u0119"+
		"\u011b\5K&\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011a\3\2\2"+
		"\2\u011c\u011d\3\2\2\2\u011dJ\3\2\2\2\u011e\u0121\5G$\2\u011f\u0121\7"+
		"a\2\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121L\3\2\2\2\u0122\u0123"+
		"\7\62\2\2\u0123\u0124\t\7\2\2\u0124\u0125\5O(\2\u0125N\3\2\2\2\u0126\u012b"+
		"\5Q)\2\u0127\u0129\5S*\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\u012c\5Q)\2\u012b\u0128\3\2\2\2\u012b\u012c\3\2\2"+
		"\2\u012cP\3\2\2\2\u012d\u012e\t\b\2\2\u012eR\3\2\2\2\u012f\u0131\5U+\2"+
		"\u0130\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133"+
		"\3\2\2\2\u0133T\3\2\2\2\u0134\u0137\5Q)\2\u0135\u0137\7a\2\2\u0136\u0134"+
		"\3\2\2\2\u0136\u0135\3\2\2\2\u0137V\3\2\2\2\u0138\u013b\5Y-\2\u0139\u013b"+
		"\5e\63\2\u013a\u0138\3\2\2\2\u013a\u0139\3\2\2\2\u013bX\3\2\2\2\u013c"+
		"\u013d\5-\27\2\u013d\u013f\7\60\2\2\u013e\u0140\5-\27\2\u013f\u013e\3"+
		"\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u0143\5[.\2\u0142"+
		"\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0146\5c"+
		"\62\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0158\3\2\2\2\u0147"+
		"\u0148\7\60\2\2\u0148\u014a\5-\27\2\u0149\u014b\5[.\2\u014a\u0149\3\2"+
		"\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u014e\5c\62\2\u014d"+
		"\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0158\3\2\2\2\u014f\u0150\5-"+
		"\27\2\u0150\u0152\5[.\2\u0151\u0153\5c\62\2\u0152\u0151\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0158\3\2\2\2\u0154\u0155\5-\27\2\u0155\u0156\5c"+
		"\62\2\u0156\u0158\3\2\2\2\u0157\u013c\3\2\2\2\u0157\u0147\3\2\2\2\u0157"+
		"\u014f\3\2\2\2\u0157\u0154\3\2\2\2\u0158Z\3\2\2\2\u0159\u015a\5]/\2\u015a"+
		"\u015b\5_\60\2\u015b\\\3\2\2\2\u015c\u015d\t\t\2\2\u015d^\3\2\2\2\u015e"+
		"\u0160\5a\61\2\u015f\u015e\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\3\2"+
		"\2\2\u0161\u0162\5-\27\2\u0162`\3\2\2\2\u0163\u0164\t\n\2\2\u0164b\3\2"+
		"\2\2\u0165\u0166\t\13\2\2\u0166d\3\2\2\2\u0167\u0168\5g\64\2\u0168\u016a"+
		"\5i\65\2\u0169\u016b\5c\62\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"f\3\2\2\2\u016c\u016e\59\35\2\u016d\u016f\7\60\2\2\u016e\u016d\3\2\2\2"+
		"\u016e\u016f\3\2\2\2\u016f\u0178\3\2\2\2\u0170\u0171\7\62\2\2\u0171\u0173"+
		"\t\4\2\2\u0172\u0174\5;\36\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\u0176\7\60\2\2\u0176\u0178\5;\36\2\u0177\u016c\3"+
		"\2\2\2\u0177\u0170\3\2\2\2\u0178h\3\2\2\2\u0179\u017a\5k\66\2\u017a\u017b"+
		"\5_\60\2\u017bj\3\2\2\2\u017c\u017d\t\f\2\2\u017dl\3\2\2\2\u017e\u017f"+
		"\7v\2\2\u017f\u0180\7t\2\2\u0180\u0181\7w\2\2\u0181\u0188\7g\2\2\u0182"+
		"\u0183\7h\2\2\u0183\u0184\7c\2\2\u0184\u0185\7n\2\2\u0185\u0186\7u\2\2"+
		"\u0186\u0188\7g\2\2\u0187\u017e\3\2\2\2\u0187\u0182\3\2\2\2\u0188n\3\2"+
		"\2\2\u0189\u018a\7)\2\2\u018a\u018b\5q9\2\u018b\u018c\7)\2\2\u018c\u0192"+
		"\3\2\2\2\u018d\u018e\7)\2\2\u018e\u018f\5y=\2\u018f\u0190\7)\2\2\u0190"+
		"\u0192\3\2\2\2\u0191\u0189\3\2\2\2\u0191\u018d\3\2\2\2\u0192p\3\2\2\2"+
		"\u0193\u0194\n\r\2\2\u0194r\3\2\2\2\u0195\u0197\7$\2\2\u0196\u0198\5u"+
		";\2\u0197\u0196\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\3\2\2\2\u0199"+
		"\u019a\7$\2\2\u019at\3\2\2\2\u019b\u019d\5w<\2\u019c\u019b\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019fv\3\2\2\2"+
		"\u01a0\u01a3\n\16\2\2\u01a1\u01a3\5y=\2\u01a2\u01a0\3\2\2\2\u01a2\u01a1"+
		"\3\2\2\2\u01a3x\3\2\2\2\u01a4\u01a5\7^\2\2\u01a5\u01a8\t\17\2\2\u01a6"+
		"\u01a8\5{>\2\u01a7\u01a4\3\2\2\2\u01a7\u01a6\3\2\2\2\u01a8z\3\2\2\2\u01a9"+
		"\u01aa\7^\2\2\u01aa\u01b5\5G$\2\u01ab\u01ac\7^\2\2\u01ac\u01ad\5G$\2\u01ad"+
		"\u01ae\5G$\2\u01ae\u01b5\3\2\2\2\u01af\u01b0\7^\2\2\u01b0\u01b1\5}?\2"+
		"\u01b1\u01b2\5G$\2\u01b2\u01b3\5G$\2\u01b3\u01b5\3\2\2\2\u01b4\u01a9\3"+
		"\2\2\2\u01b4\u01ab\3\2\2\2\u01b4\u01af\3\2\2\2\u01b5|\3\2\2\2\u01b6\u01b7"+
		"\t\20\2\2\u01b7~\3\2\2\2\u01b8\u01bc\5\u0083B\2\u01b9\u01bb\5\u0085C\2"+
		"\u01ba\u01b9\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd"+
		"\3\2\2\2\u01bd\u0080\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c0\7A\2\2\u01c0"+
		"\u01c4\5\u0083B\2\u01c1\u01c3\5\u0085C\2\u01c2\u01c1\3\2\2\2\u01c3\u01c6"+
		"\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u0082\3\2\2\2\u01c6"+
		"\u01c4\3\2\2\2\u01c7\u01c8\t\21\2\2\u01c8\u0084\3\2\2\2\u01c9\u01ca\t"+
		"\22\2\2\u01ca\u0086\3\2\2\2\u01cb\u01cd\t\23\2\2\u01cc\u01cb\3\2\2\2\u01cd"+
		"\u01ce\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\3\2"+
		"\2\2\u01d0\u01d1\bD\2\2\u01d1\u0088\3\2\2\2\65\2\u00b9\u00bd\u00c1\u00c5"+
		"\u00c9\u00d0\u00d5\u00d7\u00db\u00de\u00e2\u00e9\u00ed\u00f2\u00fa\u00fd"+
		"\u0104\u0108\u010c\u0112\u0115\u011c\u0120\u0128\u012b\u0132\u0136\u013a"+
		"\u013f\u0142\u0145\u014a\u014d\u0152\u0157\u015f\u016a\u016e\u0173\u0177"+
		"\u0187\u0191\u0197\u019e\u01a2\u01a7\u01b4\u01bc\u01c4\u01ce\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}