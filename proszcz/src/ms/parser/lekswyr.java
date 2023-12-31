// Generated from C:/Users/mastr/Documents/MS/STUDIA/Programowanie_genetyczne/Upraszczacz/src/ms\lekswyr.g4 by ANTLR 4.9.2
package ms.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lekswyr extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ZMIENNA=1, NAZWA=2, STALA=3, IntegerLiteral=4, COMMENT=5, WS=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ZMIENNA", "NAZWA", "STALA", "DecimalFloatingPointLiteral", "ExponentPart", 
			"ExponentIndicator", "SignedInteger", "Sign", "FloatTypeSuffix", "HexadecimalFloatingPointLiteral", 
			"HexSignificand", "BinaryExponent", "BinaryExponentIndicator", "IntegerLiteral", 
			"DecimalIntegerLiteral", "HexIntegerLiteral", "OctalIntegerLiteral", 
			"BinaryIntegerLiteral", "IntegerTypeSuffix", "DecimalNumeral", "Digits", 
			"Digit", "NonZeroDigit", "DigitsAndUnderscores", "DigitOrUnderscore", 
			"Underscores", "HexNumeral", "HexDigits", "HexDigit", "HexDigitsAndUnderscores", 
			"HexDigitOrUnderscore", "OctalNumeral", "OctalDigits", "OctalDigit", 
			"OctalDigitsAndUnderscores", "OctalDigitOrUnderscore", "BinaryNumeral", 
			"BinaryDigits", "BinaryDigit", "BinaryDigitsAndUnderscores", "BinaryDigitOrUnderscore", 
			"COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ZMIENNA", "NAZWA", "STALA", "IntegerLiteral", "COMMENT", "WS"
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


	public lekswyr(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lekswyr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\b\u0144\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\7\2\\\n\2\f\2\16\2_\13\2\3\3\6\3b\n\3\r\3\16\3c\3\4\3\4\3"+
		"\4\5\4i\n\4\3\5\3\5\3\5\5\5n\n\5\3\5\5\5q\n\5\3\5\5\5t\n\5\3\5\3\5\3\5"+
		"\5\5y\n\5\3\5\5\5|\n\5\3\5\3\5\3\5\5\5\u0081\n\5\3\5\3\5\3\5\5\5\u0086"+
		"\n\5\3\6\3\6\3\6\3\7\3\7\3\b\5\b\u008e\n\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\13\5\13\u0099\n\13\3\f\3\f\5\f\u009d\n\f\3\f\3\f\3\f\5\f\u00a2"+
		"\n\f\3\f\3\f\5\f\u00a6\n\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\5"+
		"\17\u00b1\n\17\3\20\3\20\5\20\u00b5\n\20\3\21\3\21\5\21\u00b9\n\21\3\22"+
		"\3\22\5\22\u00bd\n\22\3\23\3\23\5\23\u00c1\n\23\3\24\3\24\3\25\3\25\3"+
		"\25\5\25\u00c8\n\25\3\25\3\25\3\25\5\25\u00cd\n\25\5\25\u00cf\n\25\3\26"+
		"\3\26\5\26\u00d3\n\26\3\26\5\26\u00d6\n\26\3\27\3\27\5\27\u00da\n\27\3"+
		"\30\3\30\3\31\6\31\u00df\n\31\r\31\16\31\u00e0\3\32\3\32\5\32\u00e5\n"+
		"\32\3\33\6\33\u00e8\n\33\r\33\16\33\u00e9\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\5\35\u00f2\n\35\3\35\5\35\u00f5\n\35\3\36\3\36\3\37\6\37\u00fa\n\37\r"+
		"\37\16\37\u00fb\3 \3 \5 \u0100\n \3!\3!\5!\u0104\n!\3!\3!\3\"\3\"\5\""+
		"\u010a\n\"\3\"\5\"\u010d\n\"\3#\3#\3$\6$\u0112\n$\r$\16$\u0113\3%\3%\5"+
		"%\u0118\n%\3&\3&\3&\3&\3\'\3\'\5\'\u0120\n\'\3\'\5\'\u0123\n\'\3(\3(\3"+
		")\6)\u0128\n)\r)\16)\u0129\3*\3*\5*\u012e\n*\3+\3+\3+\3+\7+\u0134\n+\f"+
		"+\16+\u0137\13+\3+\3+\3+\3+\3+\3,\6,\u013f\n,\r,\16,\u0140\3,\3,\3\u0135"+
		"\2-\3\3\5\4\7\5\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\6\37"+
		"\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G"+
		"\2I\2K\2M\2O\2Q\2S\2U\7W\b\3\2\21\3\2C\\\3\2\62;\4\2aac|\4\2GGgg\4\2-"+
		"-//\6\2FFHHffhh\4\2ZZzz\4\2RRrr\4\2NNnn\3\2\63;\5\2\62;CHch\3\2\629\4"+
		"\2DDdd\3\2\62\63\5\2\13\f\17\17\"\"\2\u014f\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\35\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5a\3\2\2\2\7"+
		"h\3\2\2\2\t\u0085\3\2\2\2\13\u0087\3\2\2\2\r\u008a\3\2\2\2\17\u008d\3"+
		"\2\2\2\21\u0091\3\2\2\2\23\u0093\3\2\2\2\25\u0095\3\2\2\2\27\u00a5\3\2"+
		"\2\2\31\u00a7\3\2\2\2\33\u00aa\3\2\2\2\35\u00b0\3\2\2\2\37\u00b2\3\2\2"+
		"\2!\u00b6\3\2\2\2#\u00ba\3\2\2\2%\u00be\3\2\2\2\'\u00c2\3\2\2\2)\u00ce"+
		"\3\2\2\2+\u00d0\3\2\2\2-\u00d9\3\2\2\2/\u00db\3\2\2\2\61\u00de\3\2\2\2"+
		"\63\u00e4\3\2\2\2\65\u00e7\3\2\2\2\67\u00eb\3\2\2\29\u00ef\3\2\2\2;\u00f6"+
		"\3\2\2\2=\u00f9\3\2\2\2?\u00ff\3\2\2\2A\u0101\3\2\2\2C\u0107\3\2\2\2E"+
		"\u010e\3\2\2\2G\u0111\3\2\2\2I\u0117\3\2\2\2K\u0119\3\2\2\2M\u011d\3\2"+
		"\2\2O\u0124\3\2\2\2Q\u0127\3\2\2\2S\u012d\3\2\2\2U\u012f\3\2\2\2W\u013e"+
		"\3\2\2\2Y]\t\2\2\2Z\\\t\3\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2"+
		"^\4\3\2\2\2_]\3\2\2\2`b\t\4\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2"+
		"\2d\6\3\2\2\2ei\5\t\5\2fi\5\25\13\2gi\5\35\17\2he\3\2\2\2hf\3\2\2\2hg"+
		"\3\2\2\2i\b\3\2\2\2jk\5+\26\2km\7\60\2\2ln\5+\26\2ml\3\2\2\2mn\3\2\2\2"+
		"np\3\2\2\2oq\5\13\6\2po\3\2\2\2pq\3\2\2\2qs\3\2\2\2rt\5\23\n\2sr\3\2\2"+
		"\2st\3\2\2\2t\u0086\3\2\2\2uv\7\60\2\2vx\5+\26\2wy\5\13\6\2xw\3\2\2\2"+
		"xy\3\2\2\2y{\3\2\2\2z|\5\23\n\2{z\3\2\2\2{|\3\2\2\2|\u0086\3\2\2\2}~\5"+
		"+\26\2~\u0080\5\13\6\2\177\u0081\5\23\n\2\u0080\177\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0086\3\2\2\2\u0082\u0083\5+\26\2\u0083\u0084\5\23\n\2"+
		"\u0084\u0086\3\2\2\2\u0085j\3\2\2\2\u0085u\3\2\2\2\u0085}\3\2\2\2\u0085"+
		"\u0082\3\2\2\2\u0086\n\3\2\2\2\u0087\u0088\5\r\7\2\u0088\u0089\5\17\b"+
		"\2\u0089\f\3\2\2\2\u008a\u008b\t\5\2\2\u008b\16\3\2\2\2\u008c\u008e\5"+
		"\21\t\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0090\5+\26\2\u0090\20\3\2\2\2\u0091\u0092\t\6\2\2\u0092\22\3\2\2\2\u0093"+
		"\u0094\t\7\2\2\u0094\24\3\2\2\2\u0095\u0096\5\27\f\2\u0096\u0098\5\31"+
		"\r\2\u0097\u0099\5\23\n\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\26\3\2\2\2\u009a\u009c\5\67\34\2\u009b\u009d\7\60\2\2\u009c\u009b\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\u00a6\3\2\2\2\u009e\u009f\7\62\2\2\u009f"+
		"\u00a1\t\b\2\2\u00a0\u00a2\59\35\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7\60\2\2\u00a4\u00a6\59\35\2\u00a5"+
		"\u009a\3\2\2\2\u00a5\u009e\3\2\2\2\u00a6\30\3\2\2\2\u00a7\u00a8\5\33\16"+
		"\2\u00a8\u00a9\5\17\b\2\u00a9\32\3\2\2\2\u00aa\u00ab\t\t\2\2\u00ab\34"+
		"\3\2\2\2\u00ac\u00b1\5\37\20\2\u00ad\u00b1\5!\21\2\u00ae\u00b1\5#\22\2"+
		"\u00af\u00b1\5%\23\2\u00b0\u00ac\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae"+
		"\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\36\3\2\2\2\u00b2\u00b4\5)\25\2\u00b3"+
		"\u00b5\5\'\24\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5 \3\2\2\2"+
		"\u00b6\u00b8\5\67\34\2\u00b7\u00b9\5\'\24\2\u00b8\u00b7\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\"\3\2\2\2\u00ba\u00bc\5A!\2\u00bb\u00bd\5\'\24\2"+
		"\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd$\3\2\2\2\u00be\u00c0\5"+
		"K&\2\u00bf\u00c1\5\'\24\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"&\3\2\2\2\u00c2\u00c3\t\n\2\2\u00c3(\3\2\2\2\u00c4\u00cf\7\62\2\2\u00c5"+
		"\u00cc\5/\30\2\u00c6\u00c8\5+\26\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8\u00cd\3\2\2\2\u00c9\u00ca\5\65\33\2\u00ca\u00cb\5+\26\2\u00cb"+
		"\u00cd\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cd\u00cf\3\2"+
		"\2\2\u00ce\u00c4\3\2\2\2\u00ce\u00c5\3\2\2\2\u00cf*\3\2\2\2\u00d0\u00d5"+
		"\5-\27\2\u00d1\u00d3\5\61\31\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2"+
		"\u00d3\u00d4\3\2\2\2\u00d4\u00d6\5-\27\2\u00d5\u00d2\3\2\2\2\u00d5\u00d6"+
		"\3\2\2\2\u00d6,\3\2\2\2\u00d7\u00da\7\62\2\2\u00d8\u00da\5/\30\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da.\3\2\2\2\u00db\u00dc\t\13\2\2"+
		"\u00dc\60\3\2\2\2\u00dd\u00df\5\63\32\2\u00de\u00dd\3\2\2\2\u00df\u00e0"+
		"\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\62\3\2\2\2\u00e2"+
		"\u00e5\5-\27\2\u00e3\u00e5\7a\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2"+
		"\2\2\u00e5\64\3\2\2\2\u00e6\u00e8\7a\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9"+
		"\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\66\3\2\2\2\u00eb"+
		"\u00ec\7\62\2\2\u00ec\u00ed\t\b\2\2\u00ed\u00ee\59\35\2\u00ee8\3\2\2\2"+
		"\u00ef\u00f4\5;\36\2\u00f0\u00f2\5=\37\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2"+
		"\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\5;\36\2\u00f4\u00f1\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5:\3\2\2\2\u00f6\u00f7\t\f\2\2\u00f7<\3\2\2\2\u00f8"+
		"\u00fa\5? \2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3\2\2"+
		"\2\u00fb\u00fc\3\2\2\2\u00fc>\3\2\2\2\u00fd\u0100\5;\36\2\u00fe\u0100"+
		"\7a\2\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100@\3\2\2\2\u0101\u0103"+
		"\7\62\2\2\u0102\u0104\5\65\33\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2"+
		"\2\u0104\u0105\3\2\2\2\u0105\u0106\5C\"\2\u0106B\3\2\2\2\u0107\u010c\5"+
		"E#\2\u0108\u010a\5G$\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b"+
		"\3\2\2\2\u010b\u010d\5E#\2\u010c\u0109\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"D\3\2\2\2\u010e\u010f\t\r\2\2\u010fF\3\2\2\2\u0110\u0112\5I%\2\u0111\u0110"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"H\3\2\2\2\u0115\u0118\5E#\2\u0116\u0118\7a\2\2\u0117\u0115\3\2\2\2\u0117"+
		"\u0116\3\2\2\2\u0118J\3\2\2\2\u0119\u011a\7\62\2\2\u011a\u011b\t\16\2"+
		"\2\u011b\u011c\5M\'\2\u011cL\3\2\2\2\u011d\u0122\5O(\2\u011e\u0120\5Q"+
		")\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0123\5O(\2\u0122\u011f\3\2\2\2\u0122\u0123\3\2\2\2\u0123N\3\2\2\2\u0124"+
		"\u0125\t\17\2\2\u0125P\3\2\2\2\u0126\u0128\5S*\2\u0127\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012aR\3\2\2\2"+
		"\u012b\u012e\5O(\2\u012c\u012e\7a\2\2\u012d\u012b\3\2\2\2\u012d\u012c"+
		"\3\2\2\2\u012eT\3\2\2\2\u012f\u0130\7\61\2\2\u0130\u0131\7,\2\2\u0131"+
		"\u0135\3\2\2\2\u0132\u0134\13\2\2\2\u0133\u0132\3\2\2\2\u0134\u0137\3"+
		"\2\2\2\u0135\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0138\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0138\u0139\7,\2\2\u0139\u013a\7\61\2\2\u013a\u013b\3\2"+
		"\2\2\u013b\u013c\b+\2\2\u013cV\3\2\2\2\u013d\u013f\t\20\2\2\u013e\u013d"+
		"\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\u0143\b,\2\2\u0143X\3\2\2\2/\2]chmpsx{\u0080\u0085"+
		"\u008d\u0098\u009c\u00a1\u00a5\u00b0\u00b4\u00b8\u00bc\u00c0\u00c7\u00cc"+
		"\u00ce\u00d2\u00d5\u00d9\u00e0\u00e4\u00e9\u00f1\u00f4\u00fb\u00ff\u0103"+
		"\u0109\u010c\u0113\u0117\u011f\u0122\u0129\u012d\u0135\u0140\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}