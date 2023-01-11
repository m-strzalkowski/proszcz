// Generated from C:/Users/mastr/Documents/MS/STUDIA/Programowanie_genetyczne/Upraszczacz/src/ms\wyr.g4 by ANTLR 4.9.2
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
public class wyrLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ZMIENNA=9, 
		NAZWA=10, STALA=11, IntegerLiteral=12, COMMENT=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "ZMIENNA", 
			"NAZWA", "STALA", "DecimalFloatingPointLiteral", "ExponentPart", "ExponentIndicator", 
			"SignedInteger", "Sign", "FloatTypeSuffix", "HexadecimalFloatingPointLiteral", 
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
			null, "'-'", "'+'", "'*'", "'/'", "'%'", "'('", "')'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "ZMIENNA", "NAZWA", 
			"STALA", "IntegerLiteral", "COMMENT", "WS"
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


	public wyrLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "wyr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u0164\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\7\n|\n\n\f\n\16\n\177\13\n\3\13\6\13\u0082\n\13\r\13\16\13\u0083"+
		"\3\f\3\f\3\f\5\f\u0089\n\f\3\r\3\r\3\r\5\r\u008e\n\r\3\r\5\r\u0091\n\r"+
		"\3\r\5\r\u0094\n\r\3\r\3\r\3\r\5\r\u0099\n\r\3\r\5\r\u009c\n\r\3\r\3\r"+
		"\3\r\5\r\u00a1\n\r\3\r\3\r\3\r\5\r\u00a6\n\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\20\5\20\u00ae\n\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\5\23"+
		"\u00b9\n\23\3\24\3\24\5\24\u00bd\n\24\3\24\3\24\3\24\5\24\u00c2\n\24\3"+
		"\24\3\24\5\24\u00c6\n\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\5\27\u00d1\n\27\3\30\3\30\5\30\u00d5\n\30\3\31\3\31\5\31\u00d9\n\31\3"+
		"\32\3\32\5\32\u00dd\n\32\3\33\3\33\5\33\u00e1\n\33\3\34\3\34\3\35\3\35"+
		"\3\35\5\35\u00e8\n\35\3\35\3\35\3\35\5\35\u00ed\n\35\5\35\u00ef\n\35\3"+
		"\36\3\36\5\36\u00f3\n\36\3\36\5\36\u00f6\n\36\3\37\3\37\5\37\u00fa\n\37"+
		"\3 \3 \3!\6!\u00ff\n!\r!\16!\u0100\3\"\3\"\5\"\u0105\n\"\3#\6#\u0108\n"+
		"#\r#\16#\u0109\3$\3$\3$\3$\3%\3%\5%\u0112\n%\3%\5%\u0115\n%\3&\3&\3\'"+
		"\6\'\u011a\n\'\r\'\16\'\u011b\3(\3(\5(\u0120\n(\3)\3)\5)\u0124\n)\3)\3"+
		")\3*\3*\5*\u012a\n*\3*\5*\u012d\n*\3+\3+\3,\6,\u0132\n,\r,\16,\u0133\3"+
		"-\3-\5-\u0138\n-\3.\3.\3.\3.\3/\3/\5/\u0140\n/\3/\5/\u0143\n/\3\60\3\60"+
		"\3\61\6\61\u0148\n\61\r\61\16\61\u0149\3\62\3\62\5\62\u014e\n\62\3\63"+
		"\3\63\3\63\3\63\7\63\u0154\n\63\f\63\16\63\u0157\13\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\64\6\64\u015f\n\64\r\64\16\64\u0160\3\64\3\64\3\u0155\2\65"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\2\33\2\35\2\37"+
		"\2!\2#\2%\2\'\2)\2+\2-\16/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2"+
		"G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\17g\20\3\2\21\3\2C\\\3"+
		"\2\62;\4\2aac|\4\2GGgg\4\2--//\6\2FFHHffhh\4\2ZZzz\4\2RRrr\4\2NNnn\3\2"+
		"\63;\5\2\62;CHch\3\2\629\4\2DDdd\3\2\62\63\5\2\13\f\17\17\"\"\2\u016f"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2-\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\3i\3\2\2\2\5k\3\2\2\2\7m\3\2\2\2\to"+
		"\3\2\2\2\13q\3\2\2\2\rs\3\2\2\2\17u\3\2\2\2\21w\3\2\2\2\23y\3\2\2\2\25"+
		"\u0081\3\2\2\2\27\u0088\3\2\2\2\31\u00a5\3\2\2\2\33\u00a7\3\2\2\2\35\u00aa"+
		"\3\2\2\2\37\u00ad\3\2\2\2!\u00b1\3\2\2\2#\u00b3\3\2\2\2%\u00b5\3\2\2\2"+
		"\'\u00c5\3\2\2\2)\u00c7\3\2\2\2+\u00ca\3\2\2\2-\u00d0\3\2\2\2/\u00d2\3"+
		"\2\2\2\61\u00d6\3\2\2\2\63\u00da\3\2\2\2\65\u00de\3\2\2\2\67\u00e2\3\2"+
		"\2\29\u00ee\3\2\2\2;\u00f0\3\2\2\2=\u00f9\3\2\2\2?\u00fb\3\2\2\2A\u00fe"+
		"\3\2\2\2C\u0104\3\2\2\2E\u0107\3\2\2\2G\u010b\3\2\2\2I\u010f\3\2\2\2K"+
		"\u0116\3\2\2\2M\u0119\3\2\2\2O\u011f\3\2\2\2Q\u0121\3\2\2\2S\u0127\3\2"+
		"\2\2U\u012e\3\2\2\2W\u0131\3\2\2\2Y\u0137\3\2\2\2[\u0139\3\2\2\2]\u013d"+
		"\3\2\2\2_\u0144\3\2\2\2a\u0147\3\2\2\2c\u014d\3\2\2\2e\u014f\3\2\2\2g"+
		"\u015e\3\2\2\2ij\7/\2\2j\4\3\2\2\2kl\7-\2\2l\6\3\2\2\2mn\7,\2\2n\b\3\2"+
		"\2\2op\7\61\2\2p\n\3\2\2\2qr\7\'\2\2r\f\3\2\2\2st\7*\2\2t\16\3\2\2\2u"+
		"v\7+\2\2v\20\3\2\2\2wx\7.\2\2x\22\3\2\2\2y}\t\2\2\2z|\t\3\2\2{z\3\2\2"+
		"\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\24\3\2\2\2\177}\3\2\2\2\u0080\u0082"+
		"\t\4\2\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\26\3\2\2\2\u0085\u0089\5\31\r\2\u0086\u0089\5%\23"+
		"\2\u0087\u0089\5-\27\2\u0088\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087"+
		"\3\2\2\2\u0089\30\3\2\2\2\u008a\u008b\5;\36\2\u008b\u008d\7\60\2\2\u008c"+
		"\u008e\5;\36\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2"+
		"\2\2\u008f\u0091\5\33\16\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0093\3\2\2\2\u0092\u0094\5#\22\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u00a6\3\2\2\2\u0095\u0096\7\60\2\2\u0096\u0098\5;\36\2\u0097"+
		"\u0099\5\33\16\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3"+
		"\2\2\2\u009a\u009c\5#\22\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u00a6\3\2\2\2\u009d\u009e\5;\36\2\u009e\u00a0\5\33\16\2\u009f\u00a1\5"+
		"#\22\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a6\3\2\2\2\u00a2"+
		"\u00a3\5;\36\2\u00a3\u00a4\5#\22\2\u00a4\u00a6\3\2\2\2\u00a5\u008a\3\2"+
		"\2\2\u00a5\u0095\3\2\2\2\u00a5\u009d\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a6"+
		"\32\3\2\2\2\u00a7\u00a8\5\35\17\2\u00a8\u00a9\5\37\20\2\u00a9\34\3\2\2"+
		"\2\u00aa\u00ab\t\5\2\2\u00ab\36\3\2\2\2\u00ac\u00ae\5!\21\2\u00ad\u00ac"+
		"\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\5;\36\2\u00b0"+
		" \3\2\2\2\u00b1\u00b2\t\6\2\2\u00b2\"\3\2\2\2\u00b3\u00b4\t\7\2\2\u00b4"+
		"$\3\2\2\2\u00b5\u00b6\5\'\24\2\u00b6\u00b8\5)\25\2\u00b7\u00b9\5#\22\2"+
		"\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9&\3\2\2\2\u00ba\u00bc\5"+
		"G$\2\u00bb\u00bd\7\60\2\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00c6\3\2\2\2\u00be\u00bf\7\62\2\2\u00bf\u00c1\t\b\2\2\u00c0\u00c2\5"+
		"I%\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c4\7\60\2\2\u00c4\u00c6\5I%\2\u00c5\u00ba\3\2\2\2\u00c5\u00be\3\2"+
		"\2\2\u00c6(\3\2\2\2\u00c7\u00c8\5+\26\2\u00c8\u00c9\5\37\20\2\u00c9*\3"+
		"\2\2\2\u00ca\u00cb\t\t\2\2\u00cb,\3\2\2\2\u00cc\u00d1\5/\30\2\u00cd\u00d1"+
		"\5\61\31\2\u00ce\u00d1\5\63\32\2\u00cf\u00d1\5\65\33\2\u00d0\u00cc\3\2"+
		"\2\2\u00d0\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1"+
		".\3\2\2\2\u00d2\u00d4\59\35\2\u00d3\u00d5\5\67\34\2\u00d4\u00d3\3\2\2"+
		"\2\u00d4\u00d5\3\2\2\2\u00d5\60\3\2\2\2\u00d6\u00d8\5G$\2\u00d7\u00d9"+
		"\5\67\34\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\62\3\2\2\2\u00da"+
		"\u00dc\5Q)\2\u00db\u00dd\5\67\34\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\64\3\2\2\2\u00de\u00e0\5[.\2\u00df\u00e1\5\67\34\2\u00e0\u00df"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\66\3\2\2\2\u00e2\u00e3\t\n\2\2\u00e3"+
		"8\3\2\2\2\u00e4\u00ef\7\62\2\2\u00e5\u00ec\5? \2\u00e6\u00e8\5;\36\2\u00e7"+
		"\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ed\3\2\2\2\u00e9\u00ea\5E"+
		"#\2\u00ea\u00eb\5;\36\2\u00eb\u00ed\3\2\2\2\u00ec\u00e7\3\2\2\2\u00ec"+
		"\u00e9\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00e4\3\2\2\2\u00ee\u00e5\3\2"+
		"\2\2\u00ef:\3\2\2\2\u00f0\u00f5\5=\37\2\u00f1\u00f3\5A!\2\u00f2\u00f1"+
		"\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\5=\37\2\u00f5"+
		"\u00f2\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6<\3\2\2\2\u00f7\u00fa\7\62\2\2"+
		"\u00f8\u00fa\5? \2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa>\3\2"+
		"\2\2\u00fb\u00fc\t\13\2\2\u00fc@\3\2\2\2\u00fd\u00ff\5C\"\2\u00fe\u00fd"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"B\3\2\2\2\u0102\u0105\5=\37\2\u0103\u0105\7a\2\2\u0104\u0102\3\2\2\2\u0104"+
		"\u0103\3\2\2\2\u0105D\3\2\2\2\u0106\u0108\7a\2\2\u0107\u0106\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010aF\3\2\2\2"+
		"\u010b\u010c\7\62\2\2\u010c\u010d\t\b\2\2\u010d\u010e\5I%\2\u010eH\3\2"+
		"\2\2\u010f\u0114\5K&\2\u0110\u0112\5M\'\2\u0111\u0110\3\2\2\2\u0111\u0112"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\5K&\2\u0114\u0111\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115J\3\2\2\2\u0116\u0117\t\f\2\2\u0117L\3\2\2\2\u0118"+
		"\u011a\5O(\2\u0119\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119\3\2\2"+
		"\2\u011b\u011c\3\2\2\2\u011cN\3\2\2\2\u011d\u0120\5K&\2\u011e\u0120\7"+
		"a\2\2\u011f\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120P\3\2\2\2\u0121\u0123"+
		"\7\62\2\2\u0122\u0124\5E#\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\u0126\5S*\2\u0126R\3\2\2\2\u0127\u012c\5U+\2\u0128"+
		"\u012a\5W,\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2"+
		"\2\u012b\u012d\5U+\2\u012c\u0129\3\2\2\2\u012c\u012d\3\2\2\2\u012dT\3"+
		"\2\2\2\u012e\u012f\t\r\2\2\u012fV\3\2\2\2\u0130\u0132\5Y-\2\u0131\u0130"+
		"\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"X\3\2\2\2\u0135\u0138\5U+\2\u0136\u0138\7a\2\2\u0137\u0135\3\2\2\2\u0137"+
		"\u0136\3\2\2\2\u0138Z\3\2\2\2\u0139\u013a\7\62\2\2\u013a\u013b\t\16\2"+
		"\2\u013b\u013c\5]/\2\u013c\\\3\2\2\2\u013d\u0142\5_\60\2\u013e\u0140\5"+
		"a\61\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u0143\5_\60\2\u0142\u013f\3\2\2\2\u0142\u0143\3\2\2\2\u0143^\3\2\2\2"+
		"\u0144\u0145\t\17\2\2\u0145`\3\2\2\2\u0146\u0148\5c\62\2\u0147\u0146\3"+
		"\2\2\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"b\3\2\2\2\u014b\u014e\5_\60\2\u014c\u014e\7a\2\2\u014d\u014b\3\2\2\2\u014d"+
		"\u014c\3\2\2\2\u014ed\3\2\2\2\u014f\u0150\7\61\2\2\u0150\u0151\7,\2\2"+
		"\u0151\u0155\3\2\2\2\u0152\u0154\13\2\2\2\u0153\u0152\3\2\2\2\u0154\u0157"+
		"\3\2\2\2\u0155\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0158\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0158\u0159\7,\2\2\u0159\u015a\7\61\2\2\u015a\u015b\3\2"+
		"\2\2\u015b\u015c\b\63\2\2\u015cf\3\2\2\2\u015d\u015f\t\20\2\2\u015e\u015d"+
		"\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u0163\b\64\2\2\u0163h\3\2\2\2/\2}\u0083\u0088\u008d"+
		"\u0090\u0093\u0098\u009b\u00a0\u00a5\u00ad\u00b8\u00bc\u00c1\u00c5\u00d0"+
		"\u00d4\u00d8\u00dc\u00e0\u00e7\u00ec\u00ee\u00f2\u00f5\u00f9\u0100\u0104"+
		"\u0109\u0111\u0114\u011b\u011f\u0123\u0129\u012c\u0133\u0137\u013f\u0142"+
		"\u0149\u014d\u0155\u0160\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}