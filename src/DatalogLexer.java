// Generated from C:/Users/Jorge/Desktop/Datalog/src\Datalog.g4 by ANTLR 4.9.1
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
		T__9=10, T__10=11, NOT=12, COUNT=13, AVG=14, SUM=15, MIN=16, MAX=17, IntegerLiteral=18, 
		FloatingPointLiteral=19, BooleanLiteral=20, CharacterLiteral=21, StringLiteral=22, 
		Predicate=23, Identifier=24, WS=25, COMMENT=26, MULTILINE_COMMENT=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "NOT", "COUNT", "AVG", "SUM", "MIN", "MAX", "IntegerLiteral", 
			"DecimalIntegerLiteral", "HexIntegerLiteral", "OctalIntegerLiteral", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u0201\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u00cc\n\23\3\24\3\24"+
		"\5\24\u00d0\n\24\3\25\3\25\5\25\u00d4\n\25\3\26\3\26\5\26\u00d8\n\26\3"+
		"\27\3\27\5\27\u00dc\n\27\3\30\3\30\3\31\3\31\3\31\5\31\u00e3\n\31\3\31"+
		"\3\31\3\31\5\31\u00e8\n\31\5\31\u00ea\n\31\3\32\3\32\5\32\u00ee\n\32\3"+
		"\32\5\32\u00f1\n\32\3\33\3\33\5\33\u00f5\n\33\3\34\3\34\3\35\6\35\u00fa"+
		"\n\35\r\35\16\35\u00fb\3\36\3\36\5\36\u0100\n\36\3\37\6\37\u0103\n\37"+
		"\r\37\16\37\u0104\3 \3 \3 \3 \3!\3!\5!\u010d\n!\3!\5!\u0110\n!\3\"\3\""+
		"\3#\6#\u0115\n#\r#\16#\u0116\3$\3$\5$\u011b\n$\3%\3%\5%\u011f\n%\3%\3"+
		"%\3&\3&\5&\u0125\n&\3&\5&\u0128\n&\3\'\3\'\3(\6(\u012d\n(\r(\16(\u012e"+
		"\3)\3)\5)\u0133\n)\3*\3*\3*\3*\3+\3+\5+\u013b\n+\3+\5+\u013e\n+\3,\3,"+
		"\3-\6-\u0143\n-\r-\16-\u0144\3.\3.\5.\u0149\n.\3/\3/\5/\u014d\n/\3\60"+
		"\3\60\3\60\5\60\u0152\n\60\3\60\5\60\u0155\n\60\3\60\5\60\u0158\n\60\3"+
		"\60\3\60\3\60\5\60\u015d\n\60\3\60\5\60\u0160\n\60\3\60\3\60\3\60\5\60"+
		"\u0165\n\60\3\60\3\60\3\60\5\60\u016a\n\60\3\61\3\61\3\61\3\62\3\62\3"+
		"\63\5\63\u0172\n\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\5\66"+
		"\u017d\n\66\3\67\3\67\5\67\u0181\n\67\3\67\3\67\3\67\5\67\u0186\n\67\3"+
		"\67\3\67\5\67\u018a\n\67\38\38\38\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:"+
		"\u019a\n:\3;\3;\3;\3;\3;\3;\3;\3;\5;\u01a4\n;\3<\3<\3=\3=\5=\u01aa\n="+
		"\3=\3=\3>\6>\u01af\n>\r>\16>\u01b0\3?\3?\5?\u01b5\n?\3@\3@\3@\5@\u01ba"+
		"\n@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u01c7\nA\3B\3B\3C\3C\7C\u01cd"+
		"\nC\fC\16C\u01d0\13C\3D\3D\3D\7D\u01d5\nD\fD\16D\u01d8\13D\3E\3E\3F\3"+
		"F\3G\6G\u01df\nG\rG\16G\u01e0\3G\3G\3H\3H\7H\u01e7\nH\fH\16H\u01ea\13"+
		"H\3H\5H\u01ed\nH\3H\3H\3I\3I\3I\3I\3I\7I\u01f6\nI\fI\16I\u01f9\13I\3I"+
		"\3I\3I\5I\u01fe\nI\3I\3I\3\u01f7\2J\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\2)\2+\2-\2/\2\61"+
		"\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2["+
		"\2]\25_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\26u\27w\2y\30{\2}\2\177\2\u0081"+
		"\2\u0083\2\u0085\31\u0087\32\u0089\2\u008b\2\u008d\33\u008f\34\u0091\35"+
		"\3\2\26\4\2NNnn\3\2\63;\4\2ZZzz\5\2\62;CHch\3\2\629\4\2DDdd\3\2\62\63"+
		"\4\2GGgg\4\2--//\6\2FFHHffhh\4\2RRrr\6\2\f\f\17\17))^^\6\2\f\f\17\17$"+
		"$^^\n\2$$))^^ddhhppttvv\3\2\62\65\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\16"+
		"\17\"\"\4\2\f\f\17\17\4\3\f\f\17\17\2\u020e\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2]\3\2\2\2"+
		"\2s\3\2\2\2\2u\3\2\2\2\2y\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u008d"+
		"\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\3\u0093\3\2\2\2\5\u0095\3\2\2"+
		"\2\7\u0097\3\2\2\2\t\u0099\3\2\2\2\13\u009b\3\2\2\2\r\u009e\3\2\2\2\17"+
		"\u00a1\3\2\2\2\21\u00a3\3\2\2\2\23\u00a6\3\2\2\2\25\u00a9\3\2\2\2\27\u00ab"+
		"\3\2\2\2\31\u00ad\3\2\2\2\33\u00b1\3\2\2\2\35\u00b7\3\2\2\2\37\u00bb\3"+
		"\2\2\2!\u00bf\3\2\2\2#\u00c3\3\2\2\2%\u00cb\3\2\2\2\'\u00cd\3\2\2\2)\u00d1"+
		"\3\2\2\2+\u00d5\3\2\2\2-\u00d9\3\2\2\2/\u00dd\3\2\2\2\61\u00e9\3\2\2\2"+
		"\63\u00eb\3\2\2\2\65\u00f4\3\2\2\2\67\u00f6\3\2\2\29\u00f9\3\2\2\2;\u00ff"+
		"\3\2\2\2=\u0102\3\2\2\2?\u0106\3\2\2\2A\u010a\3\2\2\2C\u0111\3\2\2\2E"+
		"\u0114\3\2\2\2G\u011a\3\2\2\2I\u011c\3\2\2\2K\u0122\3\2\2\2M\u0129\3\2"+
		"\2\2O\u012c\3\2\2\2Q\u0132\3\2\2\2S\u0134\3\2\2\2U\u0138\3\2\2\2W\u013f"+
		"\3\2\2\2Y\u0142\3\2\2\2[\u0148\3\2\2\2]\u014c\3\2\2\2_\u0169\3\2\2\2a"+
		"\u016b\3\2\2\2c\u016e\3\2\2\2e\u0171\3\2\2\2g\u0175\3\2\2\2i\u0177\3\2"+
		"\2\2k\u0179\3\2\2\2m\u0189\3\2\2\2o\u018b\3\2\2\2q\u018e\3\2\2\2s\u0199"+
		"\3\2\2\2u\u01a3\3\2\2\2w\u01a5\3\2\2\2y\u01a7\3\2\2\2{\u01ae\3\2\2\2}"+
		"\u01b4\3\2\2\2\177\u01b9\3\2\2\2\u0081\u01c6\3\2\2\2\u0083\u01c8\3\2\2"+
		"\2\u0085\u01ca\3\2\2\2\u0087\u01d1\3\2\2\2\u0089\u01d9\3\2\2\2\u008b\u01db"+
		"\3\2\2\2\u008d\u01de\3\2\2\2\u008f\u01e4\3\2\2\2\u0091\u01f0\3\2\2\2\u0093"+
		"\u0094\7*\2\2\u0094\4\3\2\2\2\u0095\u0096\7+\2\2\u0096\6\3\2\2\2\u0097"+
		"\u0098\7\60\2\2\u0098\b\3\2\2\2\u0099\u009a\7.\2\2\u009a\n\3\2\2\2\u009b"+
		"\u009c\7<\2\2\u009c\u009d\7/\2\2\u009d\f\3\2\2\2\u009e\u009f\7A\2\2\u009f"+
		"\u00a0\7/\2\2\u00a0\16\3\2\2\2\u00a1\u00a2\7?\2\2\u00a2\20\3\2\2\2\u00a3"+
		"\u00a4\7@\2\2\u00a4\u00a5\7?\2\2\u00a5\22\3\2\2\2\u00a6\u00a7\7>\2\2\u00a7"+
		"\u00a8\7?\2\2\u00a8\24\3\2\2\2\u00a9\u00aa\7@\2\2\u00aa\26\3\2\2\2\u00ab"+
		"\u00ac\7>\2\2\u00ac\30\3\2\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7q\2\2\u00af"+
		"\u00b0\7v\2\2\u00b0\32\3\2\2\2\u00b1\u00b2\7e\2\2\u00b2\u00b3\7q\2\2\u00b3"+
		"\u00b4\7w\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7v\2\2\u00b6\34\3\2\2\2\u00b7"+
		"\u00b8\7c\2\2\u00b8\u00b9\7x\2\2\u00b9\u00ba\7i\2\2\u00ba\36\3\2\2\2\u00bb"+
		"\u00bc\7u\2\2\u00bc\u00bd\7w\2\2\u00bd\u00be\7o\2\2\u00be \3\2\2\2\u00bf"+
		"\u00c0\7o\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7p\2\2\u00c2\"\3\2\2\2\u00c3"+
		"\u00c4\7o\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7z\2\2\u00c6$\3\2\2\2\u00c7"+
		"\u00cc\5\'\24\2\u00c8\u00cc\5)\25\2\u00c9\u00cc\5+\26\2\u00ca\u00cc\5"+
		"-\27\2\u00cb\u00c7\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00ca\3\2\2\2\u00cc&\3\2\2\2\u00cd\u00cf\5\61\31\2\u00ce\u00d0\5/\30"+
		"\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0(\3\2\2\2\u00d1\u00d3"+
		"\5? \2\u00d2\u00d4\5/\30\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"*\3\2\2\2\u00d5\u00d7\5I%\2\u00d6\u00d8\5/\30\2\u00d7\u00d6\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8,\3\2\2\2\u00d9\u00db\5S*\2\u00da\u00dc\5/\30\2\u00db"+
		"\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc.\3\2\2\2\u00dd\u00de\t\2\2\2"+
		"\u00de\60\3\2\2\2\u00df\u00ea\7\62\2\2\u00e0\u00e7\5\67\34\2\u00e1\u00e3"+
		"\5\63\32\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e8\3\2\2\2"+
		"\u00e4\u00e5\5=\37\2\u00e5\u00e6\5\63\32\2\u00e6\u00e8\3\2\2\2\u00e7\u00e2"+
		"\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00df\3\2\2\2\u00e9"+
		"\u00e0\3\2\2\2\u00ea\62\3\2\2\2\u00eb\u00f0\5\65\33\2\u00ec\u00ee\59\35"+
		"\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1"+
		"\5\65\33\2\u00f0\u00ed\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\64\3\2\2\2\u00f2"+
		"\u00f5\7\62\2\2\u00f3\u00f5\5\67\34\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3"+
		"\3\2\2\2\u00f5\66\3\2\2\2\u00f6\u00f7\t\3\2\2\u00f78\3\2\2\2\u00f8\u00fa"+
		"\5;\36\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc:\3\2\2\2\u00fd\u0100\5\65\33\2\u00fe\u0100\7a\2\2"+
		"\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100<\3\2\2\2\u0101\u0103\7"+
		"a\2\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105>\3\2\2\2\u0106\u0107\7\62\2\2\u0107\u0108\t\4\2\2"+
		"\u0108\u0109\5A!\2\u0109@\3\2\2\2\u010a\u010f\5C\"\2\u010b\u010d\5E#\2"+
		"\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110"+
		"\5C\"\2\u010f\u010c\3\2\2\2\u010f\u0110\3\2\2\2\u0110B\3\2\2\2\u0111\u0112"+
		"\t\5\2\2\u0112D\3\2\2\2\u0113\u0115\5G$\2\u0114\u0113\3\2\2\2\u0115\u0116"+
		"\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117F\3\2\2\2\u0118"+
		"\u011b\5C\"\2\u0119\u011b\7a\2\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2"+
		"\2\u011bH\3\2\2\2\u011c\u011e\7\62\2\2\u011d\u011f\5=\37\2\u011e\u011d"+
		"\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\5K&\2\u0121"+
		"J\3\2\2\2\u0122\u0127\5M\'\2\u0123\u0125\5O(\2\u0124\u0123\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\5M\'\2\u0127\u0124\3\2"+
		"\2\2\u0127\u0128\3\2\2\2\u0128L\3\2\2\2\u0129\u012a\t\6\2\2\u012aN\3\2"+
		"\2\2\u012b\u012d\5Q)\2\u012c\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012c"+
		"\3\2\2\2\u012e\u012f\3\2\2\2\u012fP\3\2\2\2\u0130\u0133\5M\'\2\u0131\u0133"+
		"\7a\2\2\u0132\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133R\3\2\2\2\u0134\u0135"+
		"\7\62\2\2\u0135\u0136\t\7\2\2\u0136\u0137\5U+\2\u0137T\3\2\2\2\u0138\u013d"+
		"\5W,\2\u0139\u013b\5Y-\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013e\5W,\2\u013d\u013a\3\2\2\2\u013d\u013e\3\2\2"+
		"\2\u013eV\3\2\2\2\u013f\u0140\t\b\2\2\u0140X\3\2\2\2\u0141\u0143\5[.\2"+
		"\u0142\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145"+
		"\3\2\2\2\u0145Z\3\2\2\2\u0146\u0149\5W,\2\u0147\u0149\7a\2\2\u0148\u0146"+
		"\3\2\2\2\u0148\u0147\3\2\2\2\u0149\\\3\2\2\2\u014a\u014d\5_\60\2\u014b"+
		"\u014d\5k\66\2\u014c\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014d^\3\2\2\2"+
		"\u014e\u014f\5\63\32\2\u014f\u0151\7\60\2\2\u0150\u0152\5\63\32\2\u0151"+
		"\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0155\5a"+
		"\61\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156"+
		"\u0158\5i\65\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u016a\3\2"+
		"\2\2\u0159\u015a\7\60\2\2\u015a\u015c\5\63\32\2\u015b\u015d\5a\61\2\u015c"+
		"\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f\3\2\2\2\u015e\u0160\5i"+
		"\65\2\u015f\u015e\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u016a\3\2\2\2\u0161"+
		"\u0162\5\63\32\2\u0162\u0164\5a\61\2\u0163\u0165\5i\65\2\u0164\u0163\3"+
		"\2\2\2\u0164\u0165\3\2\2\2\u0165\u016a\3\2\2\2\u0166\u0167\5\63\32\2\u0167"+
		"\u0168\5i\65\2\u0168\u016a\3\2\2\2\u0169\u014e\3\2\2\2\u0169\u0159\3\2"+
		"\2\2\u0169\u0161\3\2\2\2\u0169\u0166\3\2\2\2\u016a`\3\2\2\2\u016b\u016c"+
		"\5c\62\2\u016c\u016d\5e\63\2\u016db\3\2\2\2\u016e\u016f\t\t\2\2\u016f"+
		"d\3\2\2\2\u0170\u0172\5g\64\2\u0171\u0170\3\2\2\2\u0171\u0172\3\2\2\2"+
		"\u0172\u0173\3\2\2\2\u0173\u0174\5\63\32\2\u0174f\3\2\2\2\u0175\u0176"+
		"\t\n\2\2\u0176h\3\2\2\2\u0177\u0178\t\13\2\2\u0178j\3\2\2\2\u0179\u017a"+
		"\5m\67\2\u017a\u017c\5o8\2\u017b\u017d\5i\65\2\u017c\u017b\3\2\2\2\u017c"+
		"\u017d\3\2\2\2\u017dl\3\2\2\2\u017e\u0180\5? \2\u017f\u0181\7\60\2\2\u0180"+
		"\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u018a\3\2\2\2\u0182\u0183\7\62"+
		"\2\2\u0183\u0185\t\4\2\2\u0184\u0186\5A!\2\u0185\u0184\3\2\2\2\u0185\u0186"+
		"\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\7\60\2\2\u0188\u018a\5A!\2\u0189"+
		"\u017e\3\2\2\2\u0189\u0182\3\2\2\2\u018an\3\2\2\2\u018b\u018c\5q9\2\u018c"+
		"\u018d\5e\63\2\u018dp\3\2\2\2\u018e\u018f\t\f\2\2\u018fr\3\2\2\2\u0190"+
		"\u0191\7v\2\2\u0191\u0192\7t\2\2\u0192\u0193\7w\2\2\u0193\u019a\7g\2\2"+
		"\u0194\u0195\7h\2\2\u0195\u0196\7c\2\2\u0196\u0197\7n\2\2\u0197\u0198"+
		"\7u\2\2\u0198\u019a\7g\2\2\u0199\u0190\3\2\2\2\u0199\u0194\3\2\2\2\u019a"+
		"t\3\2\2\2\u019b\u019c\7)\2\2\u019c\u019d\5w<\2\u019d\u019e\7)\2\2\u019e"+
		"\u01a4\3\2\2\2\u019f\u01a0\7)\2\2\u01a0\u01a1\5\177@\2\u01a1\u01a2\7)"+
		"\2\2\u01a2\u01a4\3\2\2\2\u01a3\u019b\3\2\2\2\u01a3\u019f\3\2\2\2\u01a4"+
		"v\3\2\2\2\u01a5\u01a6\n\r\2\2\u01a6x\3\2\2\2\u01a7\u01a9\7$\2\2\u01a8"+
		"\u01aa\5{>\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2\2"+
		"\2\u01ab\u01ac\7$\2\2\u01acz\3\2\2\2\u01ad\u01af\5}?\2\u01ae\u01ad\3\2"+
		"\2\2\u01af\u01b0\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"|\3\2\2\2\u01b2\u01b5\n\16\2\2\u01b3\u01b5\5\177@\2\u01b4\u01b2\3\2\2"+
		"\2\u01b4\u01b3\3\2\2\2\u01b5~\3\2\2\2\u01b6\u01b7\7^\2\2\u01b7\u01ba\t"+
		"\17\2\2\u01b8\u01ba\5\u0081A\2\u01b9\u01b6\3\2\2\2\u01b9\u01b8\3\2\2\2"+
		"\u01ba\u0080\3\2\2\2\u01bb\u01bc\7^\2\2\u01bc\u01c7\5M\'\2\u01bd\u01be"+
		"\7^\2\2\u01be\u01bf\5M\'\2\u01bf\u01c0\5M\'\2\u01c0\u01c7\3\2\2\2\u01c1"+
		"\u01c2\7^\2\2\u01c2\u01c3\5\u0083B\2\u01c3\u01c4\5M\'\2\u01c4\u01c5\5"+
		"M\'\2\u01c5\u01c7\3\2\2\2\u01c6\u01bb\3\2\2\2\u01c6\u01bd\3\2\2\2\u01c6"+
		"\u01c1\3\2\2\2\u01c7\u0082\3\2\2\2\u01c8\u01c9\t\20\2\2\u01c9\u0084\3"+
		"\2\2\2\u01ca\u01ce\5\u0089E\2\u01cb\u01cd\5\u008bF\2\u01cc\u01cb\3\2\2"+
		"\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u0086"+
		"\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d2\7A\2\2\u01d2\u01d6\5\u0089E\2"+
		"\u01d3\u01d5\5\u008bF\2\u01d4\u01d3\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6"+
		"\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u0088\3\2\2\2\u01d8\u01d6\3\2"+
		"\2\2\u01d9\u01da\t\21\2\2\u01da\u008a\3\2\2\2\u01db\u01dc\t\22\2\2\u01dc"+
		"\u008c\3\2\2\2\u01dd\u01df\t\23\2\2\u01de\u01dd\3\2\2\2\u01df\u01e0\3"+
		"\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2"+
		"\u01e3\bG\2\2\u01e3\u008e\3\2\2\2\u01e4\u01e8\7\'\2\2\u01e5\u01e7\n\24"+
		"\2\2\u01e6\u01e5\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8"+
		"\u01e9\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01ed\t\25"+
		"\2\2\u01ec\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\bH\2\2\u01ef"+
		"\u0090\3\2\2\2\u01f0\u01f1\7\61\2\2\u01f1\u01f2\7,\2\2\u01f2\u01f7\3\2"+
		"\2\2\u01f3\u01f6\5\u0091I\2\u01f4\u01f6\13\2\2\2\u01f5\u01f3\3\2\2\2\u01f5"+
		"\u01f4\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f7\u01f5\3\2"+
		"\2\2\u01f8\u01fd\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa\u01fb\7,\2\2\u01fb"+
		"\u01fe\7\61\2\2\u01fc\u01fe\7\2\2\3\u01fd\u01fa\3\2\2\2\u01fd\u01fc\3"+
		"\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\bI\2\2\u0200\u0092\3\2\2\2:\2\u00cb"+
		"\u00cf\u00d3\u00d7\u00db\u00e2\u00e7\u00e9\u00ed\u00f0\u00f4\u00fb\u00ff"+
		"\u0104\u010c\u010f\u0116\u011a\u011e\u0124\u0127\u012e\u0132\u013a\u013d"+
		"\u0144\u0148\u014c\u0151\u0154\u0157\u015c\u015f\u0164\u0169\u0171\u017c"+
		"\u0180\u0185\u0189\u0199\u01a3\u01a9\u01b0\u01b4\u01b9\u01c6\u01ce\u01d6"+
		"\u01e0\u01e8\u01ec\u01f5\u01f7\u01fd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}