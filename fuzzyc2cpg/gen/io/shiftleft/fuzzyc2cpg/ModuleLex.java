// Generated from D:/Workspace/RobustParser/fuzzyc2cpg/src/main/antlr4/io/shiftleft/fuzzyc2cpg\ModuleLex.g4 by ANTLR 4.9.1
package io.shiftleft.fuzzyc2cpg;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ModuleLex extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, FOR=3, WHILE=4, BREAK=5, CASE=6, CONTINUE=7, SWITCH=8, DO=9, 
		GOTO=10, RETURN=11, TYPEDEF=12, EXTERN=13, VOID=14, UNSIGNED=15, SIGNED=16, 
		LONG=17, CV_QUALIFIER=18, VIRTUAL=19, TRY=20, CATCH=21, THROW=22, USING=23, 
		NAMESPACE=24, AUTO=25, REGISTER=26, OPERATOR=27, TEMPLATE=28, NEW=29, 
		EXTENDS=30, IMPLEMENTS=31, CLASS_KEY=32, ALPHA_NUMERIC=33, OPENING_CURLY=34, 
		CLOSING_CURLY=35, PRE_IF=36, PRE_ELSE=37, PRE_ENDIF=38, PRE_DEFINE=39, 
		HEX_LITERAL=40, DECIMAL_LITERAL=41, OCTAL_LITERAL=42, BINARY_LITERAL=43, 
		FLOATING_POINT_LITERAL=44, CHAR=45, STRING=46, COMMENT=47, WHITESPACE=48, 
		CPPCOMMENT=49, ELLIPSIS=50, OTHER=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "ELSE", "FOR", "WHILE", "BREAK", "CASE", "CONTINUE", "SWITCH", 
			"DO", "GOTO", "RETURN", "TYPEDEF", "EXTERN", "VOID", "UNSIGNED", "SIGNED", 
			"LONG", "CV_QUALIFIER", "VIRTUAL", "TRY", "CATCH", "THROW", "USING", 
			"NAMESPACE", "AUTO", "REGISTER", "OPERATOR", "TEMPLATE", "NEW", "EXTENDS", 
			"IMPLEMENTS", "CLASS_KEY", "ALPHA_NUMERIC", "OPENING_CURLY", "CLOSING_CURLY", 
			"PRE_IF", "PRE_ELSE", "PRE_ENDIF", "PRE_DEFINE", "HEX_LITERAL", "DECIMAL_LITERAL", 
			"OCTAL_LITERAL", "BINARY_LITERAL", "FLOATING_POINT_LITERAL", "CHAR", 
			"STRING", "IntegerTypeSuffix", "Exponent", "FloatTypeSuffix", "EscapeSequence", 
			"OctalEscape", "UnicodeEscape", "HexDigit", "COMMENT", "WHITESPACE", 
			"CPPCOMMENT", "ELLIPSIS", "OTHER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'for'", "'while'", "'break'", "'case'", "'continue'", 
			"'switch'", "'do'", "'goto'", "'return'", "'typedef'", "'extern'", "'void'", 
			"'unsigned'", "'signed'", "'long'", null, "'virtual'", "'try'", "'catch'", 
			"'throw'", "'using'", "'namespace'", "'auto'", "'register'", "'operator'", 
			"'template'", "'new'", "'extends'", "'implements'", null, null, "'{'", 
			"'}'", null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "FOR", "WHILE", "BREAK", "CASE", "CONTINUE", "SWITCH", 
			"DO", "GOTO", "RETURN", "TYPEDEF", "EXTERN", "VOID", "UNSIGNED", "SIGNED", 
			"LONG", "CV_QUALIFIER", "VIRTUAL", "TRY", "CATCH", "THROW", "USING", 
			"NAMESPACE", "AUTO", "REGISTER", "OPERATOR", "TEMPLATE", "NEW", "EXTENDS", 
			"IMPLEMENTS", "CLASS_KEY", "ALPHA_NUMERIC", "OPENING_CURLY", "CLOSING_CURLY", 
			"PRE_IF", "PRE_ELSE", "PRE_ENDIF", "PRE_DEFINE", "HEX_LITERAL", "DECIMAL_LITERAL", 
			"OCTAL_LITERAL", "BINARY_LITERAL", "FLOATING_POINT_LITERAL", "CHAR", 
			"STRING", "COMMENT", "WHITESPACE", "CPPCOMMENT", "ELLIPSIS", "OTHER"
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


	public ModuleLex(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ModuleLex.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u028c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\5\23\u00ea\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u015f\n!\3\"\3\""+
		"\7\"\u0163\n\"\f\"\16\"\u0166\13\"\3#\3#\3$\3$\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u017c\n%\3%\7%\u017f\n%\f%\16%\u0182\13%"+
		"\3%\5%\u0185\n%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0193\n&\3&\7&"+
		"\u0196\n&\f&\16&\u0199\13&\3&\5&\u019c\n&\3&\3&\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\7\'\u01a8\n\'\f\'\16\'\u01ab\13\'\3\'\5\'\u01ae\n\'\3\'\3\'"+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u01bb\n(\f(\16(\u01be\13(\3(\5(\u01c1\n"+
		"(\3(\3(\3(\3(\3)\3)\3)\6)\u01ca\n)\r)\16)\u01cb\3)\5)\u01cf\n)\3*\3*\3"+
		"*\7*\u01d4\n*\f*\16*\u01d7\13*\5*\u01d9\n*\3*\5*\u01dc\n*\3+\3+\6+\u01e0"+
		"\n+\r+\16+\u01e1\3+\5+\u01e5\n+\3,\3,\3,\3,\6,\u01eb\n,\r,\16,\u01ec\3"+
		",\5,\u01f0\n,\3-\6-\u01f3\n-\r-\16-\u01f4\3-\3-\7-\u01f9\n-\f-\16-\u01fc"+
		"\13-\3-\5-\u01ff\n-\3-\5-\u0202\n-\3-\3-\6-\u0206\n-\r-\16-\u0207\3-\5"+
		"-\u020b\n-\3-\5-\u020e\n-\3-\6-\u0211\n-\r-\16-\u0212\3-\3-\5-\u0217\n"+
		"-\3-\6-\u021a\n-\r-\16-\u021b\3-\5-\u021f\n-\3-\5-\u0222\n-\3.\3.\3.\5"+
		".\u0227\n.\3.\3.\3/\3/\3/\7/\u022e\n/\f/\16/\u0231\13/\3/\3/\3\60\5\60"+
		"\u0236\n\60\3\60\3\60\3\60\5\60\u023b\n\60\5\60\u023d\n\60\3\61\3\61\5"+
		"\61\u0241\n\61\3\61\6\61\u0244\n\61\r\61\16\61\u0245\3\62\3\62\3\63\3"+
		"\63\3\63\3\63\5\63\u024e\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\5\64\u0259\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\67"+
		"\3\67\3\67\3\67\7\67\u0268\n\67\f\67\16\67\u026b\13\67\3\67\3\67\3\67"+
		"\38\68\u0271\n8\r8\168\u0272\38\38\39\39\39\39\79\u027b\n9\f9\169\u027e"+
		"\139\39\59\u0281\n9\39\39\3:\3:\3:\3:\3;\3;\3;\3;\3\u0269\2<\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\2a\2c\2e\2g\2i\2k\2m\61o\62q\63s\64u\65"+
		"\3\2\17\6\2C\\aac|\u0080\u0080\6\2\62;C\\aac|\4\2\f\f\17\17\4\2ZZzz\4"+
		"\2))^^\4\2$$^^\4\2WWww\4\2NNnn\4\2GGgg\4\2--//\6\2FFHHffhh\5\2\62;CHc"+
		"h\5\2\13\f\16\17\"\"\2\u02bb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\3w"+
		"\3\2\2\2\5z\3\2\2\2\7\177\3\2\2\2\t\u0083\3\2\2\2\13\u0089\3\2\2\2\r\u008f"+
		"\3\2\2\2\17\u0094\3\2\2\2\21\u009d\3\2\2\2\23\u00a4\3\2\2\2\25\u00a7\3"+
		"\2\2\2\27\u00ac\3\2\2\2\31\u00b3\3\2\2\2\33\u00bb\3\2\2\2\35\u00c2\3\2"+
		"\2\2\37\u00c7\3\2\2\2!\u00d0\3\2\2\2#\u00d7\3\2\2\2%\u00e9\3\2\2\2\'\u00eb"+
		"\3\2\2\2)\u00f3\3\2\2\2+\u00f7\3\2\2\2-\u00fd\3\2\2\2/\u0103\3\2\2\2\61"+
		"\u0109\3\2\2\2\63\u0113\3\2\2\2\65\u0118\3\2\2\2\67\u0121\3\2\2\29\u012a"+
		"\3\2\2\2;\u0133\3\2\2\2=\u0137\3\2\2\2?\u013f\3\2\2\2A\u015e\3\2\2\2C"+
		"\u0160\3\2\2\2E\u0167\3\2\2\2G\u0169\3\2\2\2I\u017b\3\2\2\2K\u0192\3\2"+
		"\2\2M\u019f\3\2\2\2O\u01b1\3\2\2\2Q\u01c6\3\2\2\2S\u01d8\3\2\2\2U\u01dd"+
		"\3\2\2\2W\u01e6\3\2\2\2Y\u0221\3\2\2\2[\u0223\3\2\2\2]\u022a\3\2\2\2_"+
		"\u023c\3\2\2\2a\u023e\3\2\2\2c\u0247\3\2\2\2e\u024d\3\2\2\2g\u0258\3\2"+
		"\2\2i\u025a\3\2\2\2k\u0261\3\2\2\2m\u0263\3\2\2\2o\u0270\3\2\2\2q\u0276"+
		"\3\2\2\2s\u0284\3\2\2\2u\u0288\3\2\2\2wx\7k\2\2xy\7h\2\2y\4\3\2\2\2z{"+
		"\7g\2\2{|\7n\2\2|}\7u\2\2}~\7g\2\2~\6\3\2\2\2\177\u0080\7h\2\2\u0080\u0081"+
		"\7q\2\2\u0081\u0082\7t\2\2\u0082\b\3\2\2\2\u0083\u0084\7y\2\2\u0084\u0085"+
		"\7j\2\2\u0085\u0086\7k\2\2\u0086\u0087\7n\2\2\u0087\u0088\7g\2\2\u0088"+
		"\n\3\2\2\2\u0089\u008a\7d\2\2\u008a\u008b\7t\2\2\u008b\u008c\7g\2\2\u008c"+
		"\u008d\7c\2\2\u008d\u008e\7m\2\2\u008e\f\3\2\2\2\u008f\u0090\7e\2\2\u0090"+
		"\u0091\7c\2\2\u0091\u0092\7u\2\2\u0092\u0093\7g\2\2\u0093\16\3\2\2\2\u0094"+
		"\u0095\7e\2\2\u0095\u0096\7q\2\2\u0096\u0097\7p\2\2\u0097\u0098\7v\2\2"+
		"\u0098\u0099\7k\2\2\u0099\u009a\7p\2\2\u009a\u009b\7w\2\2\u009b\u009c"+
		"\7g\2\2\u009c\20\3\2\2\2\u009d\u009e\7u\2\2\u009e\u009f\7y\2\2\u009f\u00a0"+
		"\7k\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7e\2\2\u00a2\u00a3\7j\2\2\u00a3"+
		"\22\3\2\2\2\u00a4\u00a5\7f\2\2\u00a5\u00a6\7q\2\2\u00a6\24\3\2\2\2\u00a7"+
		"\u00a8\7i\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7q\2\2"+
		"\u00ab\26\3\2\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7"+
		"v\2\2\u00af\u00b0\7w\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7p\2\2\u00b2\30"+
		"\3\2\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7{\2\2\u00b5\u00b6\7r\2\2\u00b6"+
		"\u00b7\7g\2\2\u00b7\u00b8\7f\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7h\2\2"+
		"\u00ba\32\3\2\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7z\2\2\u00bd\u00be\7"+
		"v\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7p\2\2\u00c1\34"+
		"\3\2\2\2\u00c2\u00c3\7x\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7k\2\2\u00c5"+
		"\u00c6\7f\2\2\u00c6\36\3\2\2\2\u00c7\u00c8\7w\2\2\u00c8\u00c9\7p\2\2\u00c9"+
		"\u00ca\7u\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7i\2\2\u00cc\u00cd\7p\2\2"+
		"\u00cd\u00ce\7g\2\2\u00ce\u00cf\7f\2\2\u00cf \3\2\2\2\u00d0\u00d1\7u\2"+
		"\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7i\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5"+
		"\7g\2\2\u00d5\u00d6\7f\2\2\u00d6\"\3\2\2\2\u00d7\u00d8\7n\2\2\u00d8\u00d9"+
		"\7q\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7i\2\2\u00db$\3\2\2\2\u00dc\u00dd"+
		"\7e\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7p\2\2\u00df\u00e0\7u\2\2\u00e0"+
		"\u00ea\7v\2\2\u00e1\u00e2\7x\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7n\2\2"+
		"\u00e4\u00e5\7c\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8"+
		"\7n\2\2\u00e8\u00ea\7g\2\2\u00e9\u00dc\3\2\2\2\u00e9\u00e1\3\2\2\2\u00ea"+
		"&\3\2\2\2\u00eb\u00ec\7x\2\2\u00ec\u00ed\7k\2\2\u00ed\u00ee\7t\2\2\u00ee"+
		"\u00ef\7v\2\2\u00ef\u00f0\7w\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7n\2\2"+
		"\u00f2(\3\2\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6\7{\2"+
		"\2\u00f6*\3\2\2\2\u00f7\u00f8\7e\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7"+
		"v\2\2\u00fa\u00fb\7e\2\2\u00fb\u00fc\7j\2\2\u00fc,\3\2\2\2\u00fd\u00fe"+
		"\7v\2\2\u00fe\u00ff\7j\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7q\2\2\u0101"+
		"\u0102\7y\2\2\u0102.\3\2\2\2\u0103\u0104\7w\2\2\u0104\u0105\7u\2\2\u0105"+
		"\u0106\7k\2\2\u0106\u0107\7p\2\2\u0107\u0108\7i\2\2\u0108\60\3\2\2\2\u0109"+
		"\u010a\7p\2\2\u010a\u010b\7c\2\2\u010b\u010c\7o\2\2\u010c\u010d\7g\2\2"+
		"\u010d\u010e\7u\2\2\u010e\u010f\7r\2\2\u010f\u0110\7c\2\2\u0110\u0111"+
		"\7e\2\2\u0111\u0112\7g\2\2\u0112\62\3\2\2\2\u0113\u0114\7c\2\2\u0114\u0115"+
		"\7w\2\2\u0115\u0116\7v\2\2\u0116\u0117\7q\2\2\u0117\64\3\2\2\2\u0118\u0119"+
		"\7t\2\2\u0119\u011a\7g\2\2\u011a\u011b\7i\2\2\u011b\u011c\7k\2\2\u011c"+
		"\u011d\7u\2\2\u011d\u011e\7v\2\2\u011e\u011f\7g\2\2\u011f\u0120\7t\2\2"+
		"\u0120\66\3\2\2\2\u0121\u0122\7q\2\2\u0122\u0123\7r\2\2\u0123\u0124\7"+
		"g\2\2\u0124\u0125\7t\2\2\u0125\u0126\7c\2\2\u0126\u0127\7v\2\2\u0127\u0128"+
		"\7q\2\2\u0128\u0129\7t\2\2\u01298\3\2\2\2\u012a\u012b\7v\2\2\u012b\u012c"+
		"\7g\2\2\u012c\u012d\7o\2\2\u012d\u012e\7r\2\2\u012e\u012f\7n\2\2\u012f"+
		"\u0130\7c\2\2\u0130\u0131\7v\2\2\u0131\u0132\7g\2\2\u0132:\3\2\2\2\u0133"+
		"\u0134\7p\2\2\u0134\u0135\7g\2\2\u0135\u0136\7y\2\2\u0136<\3\2\2\2\u0137"+
		"\u0138\7g\2\2\u0138\u0139\7z\2\2\u0139\u013a\7v\2\2\u013a\u013b\7g\2\2"+
		"\u013b\u013c\7p\2\2\u013c\u013d\7f\2\2\u013d\u013e\7u\2\2\u013e>\3\2\2"+
		"\2\u013f\u0140\7k\2\2\u0140\u0141\7o\2\2\u0141\u0142\7r\2\2\u0142\u0143"+
		"\7n\2\2\u0143\u0144\7g\2\2\u0144\u0145\7o\2\2\u0145\u0146\7g\2\2\u0146"+
		"\u0147\7p\2\2\u0147\u0148\7v\2\2\u0148\u0149\7u\2\2\u0149@\3\2\2\2\u014a"+
		"\u014b\7u\2\2\u014b\u014c\7v\2\2\u014c\u014d\7t\2\2\u014d\u014e\7w\2\2"+
		"\u014e\u014f\7e\2\2\u014f\u015f\7v\2\2\u0150\u0151\7e\2\2\u0151\u0152"+
		"\7n\2\2\u0152\u0153\7c\2\2\u0153\u0154\7u\2\2\u0154\u015f\7u\2\2\u0155"+
		"\u0156\7w\2\2\u0156\u0157\7p\2\2\u0157\u0158\7k\2\2\u0158\u0159\7q\2\2"+
		"\u0159\u015f\7p\2\2\u015a\u015b\7g\2\2\u015b\u015c\7p\2\2\u015c\u015d"+
		"\7w\2\2\u015d\u015f\7o\2\2\u015e\u014a\3\2\2\2\u015e\u0150\3\2\2\2\u015e"+
		"\u0155\3\2\2\2\u015e\u015a\3\2\2\2\u015fB\3\2\2\2\u0160\u0164\t\2\2\2"+
		"\u0161\u0163\t\3\2\2\u0162\u0161\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162"+
		"\3\2\2\2\u0164\u0165\3\2\2\2\u0165D\3\2\2\2\u0166\u0164\3\2\2\2\u0167"+
		"\u0168\7}\2\2\u0168F\3\2\2\2\u0169\u016a\7\177\2\2\u016aH\3\2\2\2\u016b"+
		"\u016c\7%\2\2\u016c\u016d\7k\2\2\u016d\u017c\7h\2\2\u016e\u016f\7%\2\2"+
		"\u016f\u0170\7k\2\2\u0170\u0171\7h\2\2\u0171\u0172\7f\2\2\u0172\u0173"+
		"\7g\2\2\u0173\u017c\7h\2\2\u0174\u0175\7%\2\2\u0175\u0176\7k\2\2\u0176"+
		"\u0177\7h\2\2\u0177\u0178\7p\2\2\u0178\u0179\7f\2\2\u0179\u017a\7g\2\2"+
		"\u017a\u017c\7h\2\2\u017b\u016b\3\2\2\2\u017b\u016e\3\2\2\2\u017b\u0174"+
		"\3\2\2\2\u017c\u0180\3\2\2\2\u017d\u017f\n\4\2\2\u017e\u017d\3\2\2\2\u017f"+
		"\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0184\3\2"+
		"\2\2\u0182\u0180\3\2\2\2\u0183\u0185\7\17\2\2\u0184\u0183\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\7\f\2\2\u0187J\3\2\2\2"+
		"\u0188\u0189\7%\2\2\u0189\u018a\7g\2\2\u018a\u018b\7n\2\2\u018b\u018c"+
		"\7u\2\2\u018c\u0193\7g\2\2\u018d\u018e\7%\2\2\u018e\u018f\7g\2\2\u018f"+
		"\u0190\7n\2\2\u0190\u0191\7k\2\2\u0191\u0193\7h\2\2\u0192\u0188\3\2\2"+
		"\2\u0192\u018d\3\2\2\2\u0193\u0197\3\2\2\2\u0194\u0196\n\4\2\2\u0195\u0194"+
		"\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019c\7\17\2\2\u019b\u019a\3"+
		"\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\7\f\2\2\u019e"+
		"L\3\2\2\2\u019f\u01a0\7%\2\2\u01a0\u01a1\7g\2\2\u01a1\u01a2\7p\2\2\u01a2"+
		"\u01a3\7f\2\2\u01a3\u01a4\7k\2\2\u01a4\u01a5\7h\2\2\u01a5\u01a9\3\2\2"+
		"\2\u01a6\u01a8\n\4\2\2\u01a7\u01a6\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7"+
		"\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac"+
		"\u01ae\7\17\2\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\3"+
		"\2\2\2\u01af\u01b0\7\f\2\2\u01b0N\3\2\2\2\u01b1\u01b2\7%\2\2\u01b2\u01b3"+
		"\7f\2\2\u01b3\u01b4\7g\2\2\u01b4\u01b5\7h\2\2\u01b5\u01b6\7k\2\2\u01b6"+
		"\u01b7\7p\2\2\u01b7\u01b8\7g\2\2\u01b8\u01bc\3\2\2\2\u01b9\u01bb\n\4\2"+
		"\2\u01ba\u01b9\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd"+
		"\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c1\7\17\2\2"+
		"\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3"+
		"\7\f\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\b(\2\2\u01c5P\3\2\2\2\u01c6\u01c7"+
		"\7\62\2\2\u01c7\u01c9\t\5\2\2\u01c8\u01ca\5k\66\2\u01c9\u01c8\3\2\2\2"+
		"\u01ca\u01cb\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ce"+
		"\3\2\2\2\u01cd\u01cf\5_\60\2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf"+
		"R\3\2\2\2\u01d0\u01d9\7\62\2\2\u01d1\u01d5\4\63;\2\u01d2\u01d4\4\62;\2"+
		"\u01d3\u01d2\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6"+
		"\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01d0\3\2\2\2\u01d8"+
		"\u01d1\3\2\2\2\u01d9\u01db\3\2\2\2\u01da\u01dc\5_\60\2\u01db\u01da\3\2"+
		"\2\2\u01db\u01dc\3\2\2\2\u01dcT\3\2\2\2\u01dd\u01df\7\62\2\2\u01de\u01e0"+
		"\4\629\2\u01df\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1"+
		"\u01e2\3\2\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01e5\5_\60\2\u01e4\u01e3\3\2"+
		"\2\2\u01e4\u01e5\3\2\2\2\u01e5V\3\2\2\2\u01e6\u01e7\7\62\2\2\u01e7\u01e8"+
		"\7d\2\2\u01e8\u01ea\3\2\2\2\u01e9\u01eb\4\62\63\2\u01ea\u01e9\3\2\2\2"+
		"\u01eb\u01ec\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef"+
		"\3\2\2\2\u01ee\u01f0\5_\60\2\u01ef\u01ee\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0"+
		"X\3\2\2\2\u01f1\u01f3\4\62;\2\u01f2\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2"+
		"\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01fa"+
		"\7\60\2\2\u01f7\u01f9\4\62;\2\u01f8\u01f7\3\2\2\2\u01f9\u01fc\3\2\2\2"+
		"\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa"+
		"\3\2\2\2\u01fd\u01ff\5a\61\2\u01fe\u01fd\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff"+
		"\u0201\3\2\2\2\u0200\u0202\5c\62\2\u0201\u0200\3\2\2\2\u0201\u0202\3\2"+
		"\2\2\u0202\u0222\3\2\2\2\u0203\u0205\7\60\2\2\u0204\u0206\4\62;\2\u0205"+
		"\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2"+
		"\2\2\u0208\u020a\3\2\2\2\u0209\u020b\5a\61\2\u020a\u0209\3\2\2\2\u020a"+
		"\u020b\3\2\2\2\u020b\u020d\3\2\2\2\u020c\u020e\5c\62\2\u020d\u020c\3\2"+
		"\2\2\u020d\u020e\3\2\2\2\u020e\u0222\3\2\2\2\u020f\u0211\4\62;\2\u0210"+
		"\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2"+
		"\2\2\u0213\u0214\3\2\2\2\u0214\u0216\5a\61\2\u0215\u0217\5c\62\2\u0216"+
		"\u0215\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0222\3\2\2\2\u0218\u021a\4\62"+
		";\2\u0219\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u0219\3\2\2\2\u021b"+
		"\u021c\3\2\2\2\u021c\u021e\3\2\2\2\u021d\u021f\5a\61\2\u021e\u021d\3\2"+
		"\2\2\u021e\u021f\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0222\5c\62\2\u0221"+
		"\u01f2\3\2\2\2\u0221\u0203\3\2\2\2\u0221\u0210\3\2\2\2\u0221\u0219\3\2"+
		"\2\2\u0222Z\3\2\2\2\u0223\u0226\7)\2\2\u0224\u0227\5e\63\2\u0225\u0227"+
		"\n\6\2\2\u0226\u0224\3\2\2\2\u0226\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228"+
		"\u0229\7)\2\2\u0229\\\3\2\2\2\u022a\u022f\7$\2\2\u022b\u022e\5e\63\2\u022c"+
		"\u022e\n\7\2\2\u022d\u022b\3\2\2\2\u022d\u022c\3\2\2\2\u022e\u0231\3\2"+
		"\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0232\3\2\2\2\u0231"+
		"\u022f\3\2\2\2\u0232\u0233\7$\2\2\u0233^\3\2\2\2\u0234\u0236\t\b\2\2\u0235"+
		"\u0234\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u023d\t\t"+
		"\2\2\u0238\u023a\t\b\2\2\u0239\u023b\t\t\2\2\u023a\u0239\3\2\2\2\u023a"+
		"\u023b\3\2\2\2\u023b\u023d\3\2\2\2\u023c\u0235\3\2\2\2\u023c\u0238\3\2"+
		"\2\2\u023d`\3\2\2\2\u023e\u0240\t\n\2\2\u023f\u0241\t\13\2\2\u0240\u023f"+
		"\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0243\3\2\2\2\u0242\u0244\4\62;\2\u0243"+
		"\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2"+
		"\2\2\u0246b\3\2\2\2\u0247\u0248\t\f\2\2\u0248d\3\2\2\2\u0249\u024a\7^"+
		"\2\2\u024a\u024e\13\2\2\2\u024b\u024e\5i\65\2\u024c\u024e\5g\64\2\u024d"+
		"\u0249\3\2\2\2\u024d\u024b\3\2\2\2\u024d\u024c\3\2\2\2\u024ef\3\2\2\2"+
		"\u024f\u0250\7^\2\2\u0250\u0251\4\62\65\2\u0251\u0252\4\629\2\u0252\u0259"+
		"\4\629\2\u0253\u0254\7^\2\2\u0254\u0255\4\629\2\u0255\u0259\4\629\2\u0256"+
		"\u0257\7^\2\2\u0257\u0259\4\629\2\u0258\u024f\3\2\2\2\u0258\u0253\3\2"+
		"\2\2\u0258\u0256\3\2\2\2\u0259h\3\2\2\2\u025a\u025b\7^\2\2\u025b\u025c"+
		"\7w\2\2\u025c\u025d\5k\66\2\u025d\u025e\5k\66\2\u025e\u025f\5k\66\2\u025f"+
		"\u0260\5k\66\2\u0260j\3\2\2\2\u0261\u0262\t\r\2\2\u0262l\3\2\2\2\u0263"+
		"\u0264\7\61\2\2\u0264\u0265\7,\2\2\u0265\u0269\3\2\2\2\u0266\u0268\13"+
		"\2\2\2\u0267\u0266\3\2\2\2\u0268\u026b\3\2\2\2\u0269\u026a\3\2\2\2\u0269"+
		"\u0267\3\2\2\2\u026a\u026c\3\2\2\2\u026b\u0269\3\2\2\2\u026c\u026d\7,"+
		"\2\2\u026d\u026e\7\61\2\2\u026en\3\2\2\2\u026f\u0271\t\16\2\2\u0270\u026f"+
		"\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273"+
		"\u0274\3\2\2\2\u0274\u0275\b8\2\2\u0275p\3\2\2\2\u0276\u0277\7\61\2\2"+
		"\u0277\u0278\7\61\2\2\u0278\u027c\3\2\2\2\u0279\u027b\n\4\2\2\u027a\u0279"+
		"\3\2\2\2\u027b\u027e\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d"+
		"\u0280\3\2\2\2\u027e\u027c\3\2\2\2\u027f\u0281\7\17\2\2\u0280\u027f\3"+
		"\2\2\2\u0280\u0281\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0283\7\f\2\2\u0283"+
		"r\3\2\2\2\u0284\u0285\7\60\2\2\u0285\u0286\7\60\2\2\u0286\u0287\7\60\2"+
		"\2\u0287t\3\2\2\2\u0288\u0289\13\2\2\2\u0289\u028a\3\2\2\2\u028a\u028b"+
		"\b;\2\2\u028bv\3\2\2\2\63\2\u00e9\u015e\u0164\u017b\u0180\u0184\u0192"+
		"\u0197\u019b\u01a9\u01ad\u01bc\u01c0\u01cb\u01ce\u01d5\u01d8\u01db\u01e1"+
		"\u01e4\u01ec\u01ef\u01f4\u01fa\u01fe\u0201\u0207\u020a\u020d\u0212\u0216"+
		"\u021b\u021e\u0221\u0226\u022d\u022f\u0235\u023a\u023c\u0240\u0245\u024d"+
		"\u0258\u0269\u0272\u027c\u0280\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}