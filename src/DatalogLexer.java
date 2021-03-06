// Generated from /Users/mer/Documents/Tec/8vo Semestre/Compiladores/Proyectos/Proyecto/src/Datalog.g4 by ANTLR 4.9.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, NOT=13, COUNT=14, AVG=15, SUM=16, MIN=17, 
		MAX=18, IntegerLiteral=19, FloatingPointLiteral=20, BooleanLiteral=21, 
		CharacterLiteral=22, StringLiteral=23, Predicate=24, Identifier=25, WS=26, 
		COMMENT=27, MULTILINE_COMMENT=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "NOT", "COUNT", "AVG", "SUM", "MIN", "MAX", 
			"IntegerLiteral", "DecimalIntegerLiteral", "HexIntegerLiteral", "OctalIntegerLiteral", 
			"BinaryIntegerLiteral", "IntegerTypeSuffix", "DecimalNumeral", "Digits", 
			"Digit", "NonZeroDigit", "DigitsAndUnderscores", "DigitOrUnderscore", 
			"Underscores", "HexNumeral", "HexDigits", "HexDigit", "HexDigitsAndUnderscores", 
			"HexDigitOrUnderscore", "OctalNumeral", "OctalDigits", "OctalDigit", 
			"OctalDigitsAndUnderscores", "OctalDigitOrUnderscore", "BinaryNumeral", 
			"BinaryDigits", "BinaryDigit", "BinaryDigitsAndUnderscores", "BinaryDigitOrUnderscore", 
			"FloatingPointLiteral", "DecimalFloatingPointLiteral", "ExponentPart", 
			"ExponentIndicator", "SignedInteger", "Sign", "FloatTypeSuffix", "HexadecimalFloatingPointLiteral", 
			"HexSignificand", "BinaryExponent", "BinaryExponentIndicator", "BooleanLiteral", 
			"CharacterLiteral", "SingleCharacter", "StringLiteral", "StringCharacters", 
			"StringCharacter", "EscapeSequence", "OctalEscape", "ZeroToThree", "Predicate", 
			"Identifier", "IdentifierLetter", "IdentifierLetterOrDigit", "WS", "COMMENT", 
			"MULTILINE_COMMENT"
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


	public DatalogLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Datalog.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u0205\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24"+
		"\u00d0\n\24\3\25\3\25\5\25\u00d4\n\25\3\26\3\26\5\26\u00d8\n\26\3\27\3"+
		"\27\5\27\u00dc\n\27\3\30\3\30\5\30\u00e0\n\30\3\31\3\31\3\32\3\32\3\32"+
		"\5\32\u00e7\n\32\3\32\3\32\3\32\5\32\u00ec\n\32\5\32\u00ee\n\32\3\33\3"+
		"\33\5\33\u00f2\n\33\3\33\5\33\u00f5\n\33\3\34\3\34\5\34\u00f9\n\34\3\35"+
		"\3\35\3\36\6\36\u00fe\n\36\r\36\16\36\u00ff\3\37\3\37\5\37\u0104\n\37"+
		"\3 \6 \u0107\n \r \16 \u0108\3!\3!\3!\3!\3\"\3\"\5\"\u0111\n\"\3\"\5\""+
		"\u0114\n\"\3#\3#\3$\6$\u0119\n$\r$\16$\u011a\3%\3%\5%\u011f\n%\3&\3&\5"+
		"&\u0123\n&\3&\3&\3\'\3\'\5\'\u0129\n\'\3\'\5\'\u012c\n\'\3(\3(\3)\6)\u0131"+
		"\n)\r)\16)\u0132\3*\3*\5*\u0137\n*\3+\3+\3+\3+\3,\3,\5,\u013f\n,\3,\5"+
		",\u0142\n,\3-\3-\3.\6.\u0147\n.\r.\16.\u0148\3/\3/\5/\u014d\n/\3\60\3"+
		"\60\5\60\u0151\n\60\3\61\3\61\3\61\5\61\u0156\n\61\3\61\5\61\u0159\n\61"+
		"\3\61\5\61\u015c\n\61\3\61\3\61\3\61\5\61\u0161\n\61\3\61\5\61\u0164\n"+
		"\61\3\61\3\61\3\61\5\61\u0169\n\61\3\61\3\61\3\61\5\61\u016e\n\61\3\62"+
		"\3\62\3\62\3\63\3\63\3\64\5\64\u0176\n\64\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\3\67\3\67\3\67\5\67\u0181\n\67\38\38\58\u0185\n8\38\38\38\58\u018a\n"+
		"8\38\38\58\u018e\n8\39\39\39\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u019e"+
		"\n;\3<\3<\3<\3<\3<\3<\3<\3<\5<\u01a8\n<\3=\3=\3>\3>\5>\u01ae\n>\3>\3>"+
		"\3?\6?\u01b3\n?\r?\16?\u01b4\3@\3@\5@\u01b9\n@\3A\3A\3A\5A\u01be\nA\3"+
		"B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u01cb\nB\3C\3C\3D\3D\7D\u01d1\nD\f"+
		"D\16D\u01d4\13D\3E\3E\3E\7E\u01d9\nE\fE\16E\u01dc\13E\3F\3F\3G\3G\3H\6"+
		"H\u01e3\nH\rH\16H\u01e4\3H\3H\3I\3I\7I\u01eb\nI\fI\16I\u01ee\13I\3I\5"+
		"I\u01f1\nI\3I\3I\3J\3J\3J\3J\3J\7J\u01fa\nJ\fJ\16J\u01fd\13J\3J\3J\3J"+
		"\5J\u0202\nJ\3J\3J\3\u01fb\2K\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\2+\2-\2/\2\61\2\63"+
		"\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2"+
		"_\26a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\27w\30y\2{\31}\2\177\2\u0081\2\u0083"+
		"\2\u0085\2\u0087\32\u0089\33\u008b\2\u008d\2\u008f\34\u0091\35\u0093\36"+
		"\3\2\26\4\2NNnn\3\2\63;\4\2ZZzz\5\2\62;CHch\3\2\629\4\2DDdd\3\2\62\63"+
		"\4\2GGgg\4\2--//\6\2FFHHffhh\4\2RRrr\6\2\f\f\17\17))^^\6\2\f\f\17\17$"+
		"$^^\n\2$$))^^ddhhppttvv\3\2\62\65\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\16"+
		"\17\"\"\4\2\f\f\17\17\4\3\f\f\17\17\2\u0212\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2_\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2{\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\3\u0095\3\2\2"+
		"\2\5\u0097\3\2\2\2\7\u0099\3\2\2\2\t\u009b\3\2\2\2\13\u009d\3\2\2\2\r"+
		"\u00a0\3\2\2\2\17\u00a3\3\2\2\2\21\u00a5\3\2\2\2\23\u00a8\3\2\2\2\25\u00ab"+
		"\3\2\2\2\27\u00ad\3\2\2\2\31\u00af\3\2\2\2\33\u00b1\3\2\2\2\35\u00b5\3"+
		"\2\2\2\37\u00bb\3\2\2\2!\u00bf\3\2\2\2#\u00c3\3\2\2\2%\u00c7\3\2\2\2\'"+
		"\u00cf\3\2\2\2)\u00d1\3\2\2\2+\u00d5\3\2\2\2-\u00d9\3\2\2\2/\u00dd\3\2"+
		"\2\2\61\u00e1\3\2\2\2\63\u00ed\3\2\2\2\65\u00ef\3\2\2\2\67\u00f8\3\2\2"+
		"\29\u00fa\3\2\2\2;\u00fd\3\2\2\2=\u0103\3\2\2\2?\u0106\3\2\2\2A\u010a"+
		"\3\2\2\2C\u010e\3\2\2\2E\u0115\3\2\2\2G\u0118\3\2\2\2I\u011e\3\2\2\2K"+
		"\u0120\3\2\2\2M\u0126\3\2\2\2O\u012d\3\2\2\2Q\u0130\3\2\2\2S\u0136\3\2"+
		"\2\2U\u0138\3\2\2\2W\u013c\3\2\2\2Y\u0143\3\2\2\2[\u0146\3\2\2\2]\u014c"+
		"\3\2\2\2_\u0150\3\2\2\2a\u016d\3\2\2\2c\u016f\3\2\2\2e\u0172\3\2\2\2g"+
		"\u0175\3\2\2\2i\u0179\3\2\2\2k\u017b\3\2\2\2m\u017d\3\2\2\2o\u018d\3\2"+
		"\2\2q\u018f\3\2\2\2s\u0192\3\2\2\2u\u019d\3\2\2\2w\u01a7\3\2\2\2y\u01a9"+
		"\3\2\2\2{\u01ab\3\2\2\2}\u01b2\3\2\2\2\177\u01b8\3\2\2\2\u0081\u01bd\3"+
		"\2\2\2\u0083\u01ca\3\2\2\2\u0085\u01cc\3\2\2\2\u0087\u01ce\3\2\2\2\u0089"+
		"\u01d5\3\2\2\2\u008b\u01dd\3\2\2\2\u008d\u01df\3\2\2\2\u008f\u01e2\3\2"+
		"\2\2\u0091\u01e8\3\2\2\2\u0093\u01f4\3\2\2\2\u0095\u0096\7*\2\2\u0096"+
		"\4\3\2\2\2\u0097\u0098\7+\2\2\u0098\6\3\2\2\2\u0099\u009a\7\60\2\2\u009a"+
		"\b\3\2\2\2\u009b\u009c\7.\2\2\u009c\n\3\2\2\2\u009d\u009e\7<\2\2\u009e"+
		"\u009f\7/\2\2\u009f\f\3\2\2\2\u00a0\u00a1\7A\2\2\u00a1\u00a2\7/\2\2\u00a2"+
		"\16\3\2\2\2\u00a3\u00a4\7?\2\2\u00a4\20\3\2\2\2\u00a5\u00a6\7@\2\2\u00a6"+
		"\u00a7\7?\2\2\u00a7\22\3\2\2\2\u00a8\u00a9\7>\2\2\u00a9\u00aa\7?\2\2\u00aa"+
		"\24\3\2\2\2\u00ab\u00ac\7@\2\2\u00ac\26\3\2\2\2\u00ad\u00ae\7>\2\2\u00ae"+
		"\30\3\2\2\2\u00af\u00b0\7a\2\2\u00b0\32\3\2\2\2\u00b1\u00b2\7p\2\2\u00b2"+
		"\u00b3\7q\2\2\u00b3\u00b4\7v\2\2\u00b4\34\3\2\2\2\u00b5\u00b6\7e\2\2\u00b6"+
		"\u00b7\7q\2\2\u00b7\u00b8\7w\2\2\u00b8\u00b9\7p\2\2\u00b9\u00ba\7v\2\2"+
		"\u00ba\36\3\2\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7x\2\2\u00bd\u00be\7"+
		"i\2\2\u00be \3\2\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2"+
		"\7o\2\2\u00c2\"\3\2\2\2\u00c3\u00c4\7o\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6"+
		"\7p\2\2\u00c6$\3\2\2\2\u00c7\u00c8\7o\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca"+
		"\7z\2\2\u00ca&\3\2\2\2\u00cb\u00d0\5)\25\2\u00cc\u00d0\5+\26\2\u00cd\u00d0"+
		"\5-\27\2\u00ce\u00d0\5/\30\2\u00cf\u00cb\3\2\2\2\u00cf\u00cc\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0(\3\2\2\2\u00d1\u00d3\5\63\32"+
		"\2\u00d2\u00d4\5\61\31\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"*\3\2\2\2\u00d5\u00d7\5A!\2\u00d6\u00d8\5\61\31\2\u00d7\u00d6\3\2\2\2"+
		"\u00d7\u00d8\3\2\2\2\u00d8,\3\2\2\2\u00d9\u00db\5K&\2\u00da\u00dc\5\61"+
		"\31\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc.\3\2\2\2\u00dd\u00df"+
		"\5U+\2\u00de\u00e0\5\61\31\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\60\3\2\2\2\u00e1\u00e2\t\2\2\2\u00e2\62\3\2\2\2\u00e3\u00ee\7\62\2\2"+
		"\u00e4\u00eb\59\35\2\u00e5\u00e7\5\65\33\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\u00ec\3\2\2\2\u00e8\u00e9\5? \2\u00e9\u00ea\5\65\33\2\u00ea"+
		"\u00ec\3\2\2\2\u00eb\u00e6\3\2\2\2\u00eb\u00e8\3\2\2\2\u00ec\u00ee\3\2"+
		"\2\2\u00ed\u00e3\3\2\2\2\u00ed\u00e4\3\2\2\2\u00ee\64\3\2\2\2\u00ef\u00f4"+
		"\5\67\34\2\u00f0\u00f2\5;\36\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2"+
		"\u00f2\u00f3\3\2\2\2\u00f3\u00f5\5\67\34\2\u00f4\u00f1\3\2\2\2\u00f4\u00f5"+
		"\3\2\2\2\u00f5\66\3\2\2\2\u00f6\u00f9\7\62\2\2\u00f7\u00f9\59\35\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f98\3\2\2\2\u00fa\u00fb\t\3\2\2"+
		"\u00fb:\3\2\2\2\u00fc\u00fe\5=\37\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3"+
		"\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100<\3\2\2\2\u0101\u0104"+
		"\5\67\34\2\u0102\u0104\7a\2\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2"+
		"\u0104>\3\2\2\2\u0105\u0107\7a\2\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2"+
		"\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109@\3\2\2\2\u010a\u010b"+
		"\7\62\2\2\u010b\u010c\t\4\2\2\u010c\u010d\5C\"\2\u010dB\3\2\2\2\u010e"+
		"\u0113\5E#\2\u010f\u0111\5G$\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2"+
		"\u0111\u0112\3\2\2\2\u0112\u0114\5E#\2\u0113\u0110\3\2\2\2\u0113\u0114"+
		"\3\2\2\2\u0114D\3\2\2\2\u0115\u0116\t\5\2\2\u0116F\3\2\2\2\u0117\u0119"+
		"\5I%\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011bH\3\2\2\2\u011c\u011f\5E#\2\u011d\u011f\7a\2\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011d\3\2\2\2\u011fJ\3\2\2\2\u0120\u0122\7\62\2\2"+
		"\u0121\u0123\5? \2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124"+
		"\3\2\2\2\u0124\u0125\5M\'\2\u0125L\3\2\2\2\u0126\u012b\5O(\2\u0127\u0129"+
		"\5Q)\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012c\5O(\2\u012b\u0128\3\2\2\2\u012b\u012c\3\2\2\2\u012cN\3\2\2\2\u012d"+
		"\u012e\t\6\2\2\u012eP\3\2\2\2\u012f\u0131\5S*\2\u0130\u012f\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133R\3\2\2\2"+
		"\u0134\u0137\5O(\2\u0135\u0137\7a\2\2\u0136\u0134\3\2\2\2\u0136\u0135"+
		"\3\2\2\2\u0137T\3\2\2\2\u0138\u0139\7\62\2\2\u0139\u013a\t\7\2\2\u013a"+
		"\u013b\5W,\2\u013bV\3\2\2\2\u013c\u0141\5Y-\2\u013d\u013f\5[.\2\u013e"+
		"\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\5Y"+
		"-\2\u0141\u013e\3\2\2\2\u0141\u0142\3\2\2\2\u0142X\3\2\2\2\u0143\u0144"+
		"\t\b\2\2\u0144Z\3\2\2\2\u0145\u0147\5]/\2\u0146\u0145\3\2\2\2\u0147\u0148"+
		"\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\\\3\2\2\2\u014a"+
		"\u014d\5Y-\2\u014b\u014d\7a\2\2\u014c\u014a\3\2\2\2\u014c\u014b\3\2\2"+
		"\2\u014d^\3\2\2\2\u014e\u0151\5a\61\2\u014f\u0151\5m\67\2\u0150\u014e"+
		"\3\2\2\2\u0150\u014f\3\2\2\2\u0151`\3\2\2\2\u0152\u0153\5\65\33\2\u0153"+
		"\u0155\7\60\2\2\u0154\u0156\5\65\33\2\u0155\u0154\3\2\2\2\u0155\u0156"+
		"\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0159\5c\62\2\u0158\u0157\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u015c\5k\66\2\u015b\u015a\3\2"+
		"\2\2\u015b\u015c\3\2\2\2\u015c\u016e\3\2\2\2\u015d\u015e\7\60\2\2\u015e"+
		"\u0160\5\65\33\2\u015f\u0161\5c\62\2\u0160\u015f\3\2\2\2\u0160\u0161\3"+
		"\2\2\2\u0161\u0163\3\2\2\2\u0162\u0164\5k\66\2\u0163\u0162\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\u016e\3\2\2\2\u0165\u0166\5\65\33\2\u0166\u0168\5"+
		"c\62\2\u0167\u0169\5k\66\2\u0168\u0167\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u016e\3\2\2\2\u016a\u016b\5\65\33\2\u016b\u016c\5k\66\2\u016c\u016e\3"+
		"\2\2\2\u016d\u0152\3\2\2\2\u016d\u015d\3\2\2\2\u016d\u0165\3\2\2\2\u016d"+
		"\u016a\3\2\2\2\u016eb\3\2\2\2\u016f\u0170\5e\63\2\u0170\u0171\5g\64\2"+
		"\u0171d\3\2\2\2\u0172\u0173\t\t\2\2\u0173f\3\2\2\2\u0174\u0176\5i\65\2"+
		"\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178"+
		"\5\65\33\2\u0178h\3\2\2\2\u0179\u017a\t\n\2\2\u017aj\3\2\2\2\u017b\u017c"+
		"\t\13\2\2\u017cl\3\2\2\2\u017d\u017e\5o8\2\u017e\u0180\5q9\2\u017f\u0181"+
		"\5k\66\2\u0180\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181n\3\2\2\2\u0182"+
		"\u0184\5A!\2\u0183\u0185\7\60\2\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2"+
		"\2\2\u0185\u018e\3\2\2\2\u0186\u0187\7\62\2\2\u0187\u0189\t\4\2\2\u0188"+
		"\u018a\5C\"\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3\2"+
		"\2\2\u018b\u018c\7\60\2\2\u018c\u018e\5C\"\2\u018d\u0182\3\2\2\2\u018d"+
		"\u0186\3\2\2\2\u018ep\3\2\2\2\u018f\u0190\5s:\2\u0190\u0191\5g\64\2\u0191"+
		"r\3\2\2\2\u0192\u0193\t\f\2\2\u0193t\3\2\2\2\u0194\u0195\7v\2\2\u0195"+
		"\u0196\7t\2\2\u0196\u0197\7w\2\2\u0197\u019e\7g\2\2\u0198\u0199\7h\2\2"+
		"\u0199\u019a\7c\2\2\u019a\u019b\7n\2\2\u019b\u019c\7u\2\2\u019c\u019e"+
		"\7g\2\2\u019d\u0194\3\2\2\2\u019d\u0198\3\2\2\2\u019ev\3\2\2\2\u019f\u01a0"+
		"\7)\2\2\u01a0\u01a1\5y=\2\u01a1\u01a2\7)\2\2\u01a2\u01a8\3\2\2\2\u01a3"+
		"\u01a4\7)\2\2\u01a4\u01a5\5\u0081A\2\u01a5\u01a6\7)\2\2\u01a6\u01a8\3"+
		"\2\2\2\u01a7\u019f\3\2\2\2\u01a7\u01a3\3\2\2\2\u01a8x\3\2\2\2\u01a9\u01aa"+
		"\n\r\2\2\u01aaz\3\2\2\2\u01ab\u01ad\7$\2\2\u01ac\u01ae\5}?\2\u01ad\u01ac"+
		"\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\7$\2\2\u01b0"+
		"|\3\2\2\2\u01b1\u01b3\5\177@\2\u01b2\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2"+
		"\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5~\3\2\2\2\u01b6\u01b9\n"+
		"\16\2\2\u01b7\u01b9\5\u0081A\2\u01b8\u01b6\3\2\2\2\u01b8\u01b7\3\2\2\2"+
		"\u01b9\u0080\3\2\2\2\u01ba\u01bb\7^\2\2\u01bb\u01be\t\17\2\2\u01bc\u01be"+
		"\5\u0083B\2\u01bd\u01ba\3\2\2\2\u01bd\u01bc\3\2\2\2\u01be\u0082\3\2\2"+
		"\2\u01bf\u01c0\7^\2\2\u01c0\u01cb\5O(\2\u01c1\u01c2\7^\2\2\u01c2\u01c3"+
		"\5O(\2\u01c3\u01c4\5O(\2\u01c4\u01cb\3\2\2\2\u01c5\u01c6\7^\2\2\u01c6"+
		"\u01c7\5\u0085C\2\u01c7\u01c8\5O(\2\u01c8\u01c9\5O(\2\u01c9\u01cb\3\2"+
		"\2\2\u01ca\u01bf\3\2\2\2\u01ca\u01c1\3\2\2\2\u01ca\u01c5\3\2\2\2\u01cb"+
		"\u0084\3\2\2\2\u01cc\u01cd\t\20\2\2\u01cd\u0086\3\2\2\2\u01ce\u01d2\5"+
		"\u008bF\2\u01cf\u01d1\5\u008dG\2\u01d0\u01cf\3\2\2\2\u01d1\u01d4\3\2\2"+
		"\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u0088\3\2\2\2\u01d4\u01d2"+
		"\3\2\2\2\u01d5\u01d6\7A\2\2\u01d6\u01da\5\u008bF\2\u01d7\u01d9\5\u008d"+
		"G\2\u01d8\u01d7\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01da"+
		"\u01db\3\2\2\2\u01db\u008a\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd\u01de\t\21"+
		"\2\2\u01de\u008c\3\2\2\2\u01df\u01e0\t\22\2\2\u01e0\u008e\3\2\2\2\u01e1"+
		"\u01e3\t\23\2\2\u01e2\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e2\3"+
		"\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\bH\2\2\u01e7"+
		"\u0090\3\2\2\2\u01e8\u01ec\7\'\2\2\u01e9\u01eb\n\24\2\2\u01ea\u01e9\3"+
		"\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed"+
		"\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f1\t\25\2\2\u01f0\u01ef\3"+
		"\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\bI\2\2\u01f3\u0092\3\2\2\2\u01f4"+
		"\u01f5\7\61\2\2\u01f5\u01f6\7,\2\2\u01f6\u01fb\3\2\2\2\u01f7\u01fa\5\u0093"+
		"J\2\u01f8\u01fa\13\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01f8\3\2\2\2\u01fa"+
		"\u01fd\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc\u0201\3\2"+
		"\2\2\u01fd\u01fb\3\2\2\2\u01fe\u01ff\7,\2\2\u01ff\u0202\7\61\2\2\u0200"+
		"\u0202\7\2\2\3\u0201\u01fe\3\2\2\2\u0201\u0200\3\2\2\2\u0202\u0203\3\2"+
		"\2\2\u0203\u0204\bJ\2\2\u0204\u0094\3\2\2\2:\2\u00cf\u00d3\u00d7\u00db"+
		"\u00df\u00e6\u00eb\u00ed\u00f1\u00f4\u00f8\u00ff\u0103\u0108\u0110\u0113"+
		"\u011a\u011e\u0122\u0128\u012b\u0132\u0136\u013e\u0141\u0148\u014c\u0150"+
		"\u0155\u0158\u015b\u0160\u0163\u0168\u016d\u0175\u0180\u0184\u0189\u018d"+
		"\u019d\u01a7\u01ad\u01b4\u01b8\u01bd\u01ca\u01d2\u01da\u01e4\u01ec\u01f0"+
		"\u01f9\u01fb\u0201\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}