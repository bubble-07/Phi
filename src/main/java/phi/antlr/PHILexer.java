// Generated from C:\Users\bubble-07\My Documents\GitHub\Phi\src\main\antlr4\PHI.g4 by ANTLR 4.2.2

    package phi.antlr;
    import com.yuvalshavit.antlr4.DenterHelper;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PHILexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAREN=1, RPAREN=2, LBRACKET=3, RBRACKET=4, LSQBRACKET=5, RSQBRACKET=6, 
		COMMA=7, DOT=8, DEF=9, SUBS=10, SUPS=11, TYPE=12, NAMESPACE=13, LAMBDA=14, 
		LET=15, STRING_CONST=16, INT_CONST=17, FLOAT_CONST=18, LC=19, NC=20, NL=21, 
		ID=22, SPACE=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'('", "')'", "'{'", "'}'", "'['", "']'", "','", "'.'", "DEF", "SUBS", 
		"SUPS", "'type'", "'namespace'", "LAMBDA", "'let'", "STRING_CONST", "INT_CONST", 
		"FLOAT_CONST", "LC", "NC", "NL", "ID", "SPACE"
	};
	public static final String[] ruleNames = {
		"LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "LSQBRACKET", "RSQBRACKET", 
		"COMMA", "DOT", "DEF", "SUBS", "SUPS", "TYPE", "NAMESPACE", "LAMBDA", 
		"LET", "STRING_CONST", "ESC", "INT_CONST", "FLOAT_CONST", "LC", "NC", 
		"NL", "ID", "SPACE"
	};


	    private final DenterHelper denter = new DenterHelper(NL, PHIParser.INDENT, PHIParser.DEDENT) {
	        @Override
	        public Token pullToken() {
	            return PHILexer.super.nextToken();
	        }
	    };

	    @Override
	    public Token nextToken() {
	        return denter.nextToken();
	    }


	public PHILexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PHI.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u00f4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nM\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13]\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fo\n\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u0087\n\17\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\7\21\u0090\n\21\f\21\16\21\u0093\13\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\5\22\u009b\n\22\3\23\6\23\u009e\n\23\r\23\16\23\u009f\3\24\7\24"+
		"\u00a3\n\24\f\24\16\24\u00a6\13\24\3\24\5\24\u00a9\n\24\3\24\6\24\u00ac"+
		"\n\24\r\24\16\24\u00ad\3\24\3\24\5\24\u00b2\n\24\3\24\6\24\u00b5\n\24"+
		"\r\24\16\24\u00b6\5\24\u00b9\n\24\3\25\3\25\3\25\3\25\7\25\u00bf\n\25"+
		"\f\25\16\25\u00c2\13\25\3\25\5\25\u00c5\n\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\7\26\u00cf\n\26\f\26\16\26\u00d2\13\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u00db\n\26\3\26\3\26\3\27\5\27\u00e0\n\27\3"+
		"\27\3\27\7\27\u00e4\n\27\f\27\16\27\u00e7\13\27\3\30\3\30\7\30\u00eb\n"+
		"\30\f\30\16\30\u00ee\13\30\3\31\6\31\u00f1\n\31\r\31\16\31\u00f2\4\u0091"+
		"\u00d0\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\2%\23\'\24)\25+\26-\27/\30\61\31\3\2\n\3\2\62;\4"+
		"\2GGgg\4\2--//\4\2\f\f\17\17\3\2^^\4\2\13\13\"\"\n\2\13\f\17\17\"\"*+"+
		"\62;]_}}\177\177\t\2\13\f\17\17\"\"*+]_}}\177\177\u010a\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2"+
		"\2\5\65\3\2\2\2\7\67\3\2\2\2\t9\3\2\2\2\13;\3\2\2\2\r=\3\2\2\2\17?\3\2"+
		"\2\2\21A\3\2\2\2\23L\3\2\2\2\25\\\3\2\2\2\27n\3\2\2\2\31p\3\2\2\2\33u"+
		"\3\2\2\2\35\u0086\3\2\2\2\37\u0088\3\2\2\2!\u008c\3\2\2\2#\u009a\3\2\2"+
		"\2%\u009d\3\2\2\2\'\u00a4\3\2\2\2)\u00ba\3\2\2\2+\u00da\3\2\2\2-\u00df"+
		"\3\2\2\2/\u00e8\3\2\2\2\61\u00f0\3\2\2\2\63\64\7*\2\2\64\4\3\2\2\2\65"+
		"\66\7+\2\2\66\6\3\2\2\2\678\7}\2\28\b\3\2\2\29:\7\177\2\2:\n\3\2\2\2;"+
		"<\7]\2\2<\f\3\2\2\2=>\7_\2\2>\16\3\2\2\2?@\7.\2\2@\20\3\2\2\2AB\7\60\2"+
		"\2B\22\3\2\2\2CD\7f\2\2DE\7g\2\2EM\7h\2\2FG\7f\2\2GH\7g\2\2HI\7h\2\2I"+
		"J\7k\2\2JK\7p\2\2KM\7g\2\2LC\3\2\2\2LF\3\2\2\2M\24\3\2\2\2NO\7>\2\2O]"+
		"\7<\2\2PQ\7u\2\2QR\7w\2\2RS\7d\2\2S]\7u\2\2TU\7u\2\2UV\7w\2\2VW\7d\2\2"+
		"WX\7v\2\2XY\7{\2\2YZ\7r\2\2Z[\7g\2\2[]\7u\2\2\\N\3\2\2\2\\P\3\2\2\2\\"+
		"T\3\2\2\2]\26\3\2\2\2^_\7<\2\2_o\7@\2\2`a\7u\2\2ab\7w\2\2bc\7r\2\2co\7"+
		"u\2\2de\7u\2\2ef\7w\2\2fg\7r\2\2gh\7g\2\2hi\7t\2\2ij\7v\2\2jk\7{\2\2k"+
		"l\7r\2\2lm\7g\2\2mo\7u\2\2n^\3\2\2\2n`\3\2\2\2nd\3\2\2\2o\30\3\2\2\2p"+
		"q\7v\2\2qr\7{\2\2rs\7r\2\2st\7g\2\2t\32\3\2\2\2uv\7p\2\2vw\7c\2\2wx\7"+
		"o\2\2xy\7g\2\2yz\7u\2\2z{\7r\2\2{|\7c\2\2|}\7e\2\2}~\7g\2\2~\34\3\2\2"+
		"\2\177\u0080\7n\2\2\u0080\u0081\7c\2\2\u0081\u0082\7o\2\2\u0082\u0083"+
		"\7d\2\2\u0083\u0084\7f\2\2\u0084\u0087\7c\2\2\u0085\u0087\7^\2\2\u0086"+
		"\177\3\2\2\2\u0086\u0085\3\2\2\2\u0087\36\3\2\2\2\u0088\u0089\7n\2\2\u0089"+
		"\u008a\7g\2\2\u008a\u008b\7v\2\2\u008b \3\2\2\2\u008c\u0091\7$\2\2\u008d"+
		"\u0090\5#\22\2\u008e\u0090\13\2\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3"+
		"\2\2\2\u0090\u0093\3\2\2\2\u0091\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092"+
		"\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7$\2\2\u0095\"\3\2\2\2"+
		"\u0096\u0097\7^\2\2\u0097\u009b\7$\2\2\u0098\u0099\7^\2\2\u0099\u009b"+
		"\7^\2\2\u009a\u0096\3\2\2\2\u009a\u0098\3\2\2\2\u009b$\3\2\2\2\u009c\u009e"+
		"\t\2\2\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0&\3\2\2\2\u00a1\u00a3\t\2\2\2\u00a2\u00a1\3\2\2\2"+
		"\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a8"+
		"\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a9\7\60\2\2\u00a8\u00a7\3\2\2\2"+
		"\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00ac\t\2\2\2\u00ab\u00aa"+
		"\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00b8\3\2\2\2\u00af\u00b1\t\3\2\2\u00b0\u00b2\t\4\2\2\u00b1\u00b0\3\2"+
		"\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b5\t\2\2\2\u00b4"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00af\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"(\3\2\2\2\u00ba\u00bb\7\61\2\2\u00bb\u00bc\7\61\2\2\u00bc\u00c0\3\2\2"+
		"\2\u00bd\u00bf\n\5\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be"+
		"\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3"+
		"\u00c5\7\17\2\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3"+
		"\2\2\2\u00c6\u00c7\7\f\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\b\25\2\2\u00c9"+
		"*\3\2\2\2\u00ca\u00cb\7\61\2\2\u00cb\u00cc\7,\2\2\u00cc\u00d0\3\2\2\2"+
		"\u00cd\u00cf\13\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00d1"+
		"\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3"+
		"\u00d4\n\6\2\2\u00d4\u00d5\7,\2\2\u00d5\u00db\7\61\2\2\u00d6\u00d7\7\61"+
		"\2\2\u00d7\u00d8\7,\2\2\u00d8\u00d9\7,\2\2\u00d9\u00db\7\61\2\2\u00da"+
		"\u00ca\3\2\2\2\u00da\u00d6\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\b\26"+
		"\2\2\u00dd,\3\2\2\2\u00de\u00e0\7\17\2\2\u00df\u00de\3\2\2\2\u00df\u00e0"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e5\7\f\2\2\u00e2\u00e4\t\7\2\2\u00e3"+
		"\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6.\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ec\n\b\2\2\u00e9\u00eb"+
		"\n\t\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\60\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f1\t\7\2"+
		"\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3"+
		"\3\2\2\2\u00f3\62\3\2\2\2\31\2L\\n\u0086\u008f\u0091\u009a\u009f\u00a4"+
		"\u00a8\u00ad\u00b1\u00b6\u00b8\u00c0\u00c4\u00d0\u00da\u00df\u00e5\u00ec"+
		"\u00f2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}