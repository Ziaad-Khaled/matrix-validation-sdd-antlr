// Generated from D:/GitHub/matrix-validation-sdd-antlr/MatrixValidation/grammars\MatrixValidation.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MatrixValidationParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, WS=12;
	public static final int
		RULE_start = 0, RULE_matrix = 1, RULE_row = 2, RULE_digit = 3, RULE_hashtag = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "matrix", "row", "digit", "hashtag"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", 
			"'9'", "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
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

	@Override
	public String getGrammarFileName() { return "MatrixValidation.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MatrixValidationParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public int check;
		public MatrixContext m;
		public TerminalNode EOF() { return getToken(MatrixValidationParser.EOF, 0); }
		public MatrixContext matrix() {
			return getRuleContext(MatrixContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixValidationListener ) ((MatrixValidationListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixValidationListener ) ((MatrixValidationListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatrixValidationVisitor ) return ((MatrixValidationVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			((StartContext)_localctx).m = matrix();
			setState(11);
			match(EOF);
			 ((StartContext)_localctx).check =  ((StartContext)_localctx).m.check; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class MatrixContext extends ParserRuleContext {
		public int check;
		public int col;
		public int width;
		public RowContext r1;
		public HashtagContext h;
		public MatrixContext m1;
		public RowContext row;
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public HashtagContext hashtag() {
			return getRuleContext(HashtagContext.class,0);
		}
		public MatrixContext matrix() {
			return getRuleContext(MatrixContext.class,0);
		}
		public MatrixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixValidationListener ) ((MatrixValidationListener)listener).enterMatrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixValidationListener ) ((MatrixValidationListener)listener).exitMatrix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatrixValidationVisitor ) return ((MatrixValidationVisitor<? extends T>)visitor).visitMatrix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrixContext matrix() throws RecognitionException {
		MatrixContext _localctx = new MatrixContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_matrix);
		try {
			setState(26);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				((MatrixContext)_localctx).r1 = row();
				setState(15);
				((MatrixContext)_localctx).h = hashtag();
				setState(16);
				((MatrixContext)_localctx).m1 = matrix();
				((MatrixContext)_localctx).col =  ((MatrixContext)_localctx).r1.first_col + ((MatrixContext)_localctx).m1.col;
				                                ((MatrixContext)_localctx).width =  ((MatrixContext)_localctx).m1.width;
				                                ((MatrixContext)_localctx).check =  (((MatrixContext)_localctx).r1.sum == _localctx.col && ((MatrixContext)_localctx).r1.width == ((MatrixContext)_localctx).m1.width) ? 1 : 0;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				((MatrixContext)_localctx).r1 = ((MatrixContext)_localctx).row = row();
				setState(20);
				((MatrixContext)_localctx).h = hashtag();
				((MatrixContext)_localctx).check =  0;((MatrixContext)_localctx).col =  ((MatrixContext)_localctx).row.first_col; ((MatrixContext)_localctx).width =  ((MatrixContext)_localctx).row.width;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(23);
				((MatrixContext)_localctx).row = row();
				((MatrixContext)_localctx).check =  1;((MatrixContext)_localctx).col =  ((MatrixContext)_localctx).row.first_col; ((MatrixContext)_localctx).width =  ((MatrixContext)_localctx).row.width;
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

	@SuppressWarnings("CheckReturnValue")
	public static class RowContext extends ParserRuleContext {
		public int sum;
		public int first_col;
		public int width;
		public DigitContext d1;
		public RowContext r1;
		public DigitContext digit;
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixValidationListener ) ((MatrixValidationListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixValidationListener ) ((MatrixValidationListener)listener).exitRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatrixValidationVisitor ) return ((MatrixValidationVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_row);
		try {
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				((RowContext)_localctx).d1 = digit();
				setState(29);
				((RowContext)_localctx).r1 = row();
				((RowContext)_localctx).sum =  ((RowContext)_localctx).r1.sum + ((RowContext)_localctx).d1.value; ((RowContext)_localctx).first_col =  ((RowContext)_localctx).d1.value; ((RowContext)_localctx).width =  1 + ((RowContext)_localctx).r1.width;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				((RowContext)_localctx).digit = digit();
				((RowContext)_localctx).sum =  ((RowContext)_localctx).digit.value; ((RowContext)_localctx).first_col =  ((RowContext)_localctx).digit.value; ((RowContext)_localctx).width =  1;
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

	@SuppressWarnings("CheckReturnValue")
	public static class DigitContext extends ParserRuleContext {
		public int value;
		public DigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixValidationListener ) ((MatrixValidationListener)listener).enterDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixValidationListener ) ((MatrixValidationListener)listener).exitDigit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatrixValidationVisitor ) return ((MatrixValidationVisitor<? extends T>)visitor).visitDigit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_digit);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				match(T__0);
				 ((DigitContext)_localctx).value =  0; 
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(T__1);
				 ((DigitContext)_localctx).value =  1; 
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				match(T__2);
				 ((DigitContext)_localctx).value =  2; 
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				match(T__3);
				 ((DigitContext)_localctx).value =  3; 
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				match(T__4);
				 ((DigitContext)_localctx).value =  4; 
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 6);
				{
				setState(47);
				match(T__5);
				 ((DigitContext)_localctx).value =  5; 
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 7);
				{
				setState(49);
				match(T__6);
				 ((DigitContext)_localctx).value =  6; 
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 8);
				{
				setState(51);
				match(T__7);
				 ((DigitContext)_localctx).value =  7; 
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 9);
				{
				setState(53);
				match(T__8);
				 ((DigitContext)_localctx).value =  8; 
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 10);
				{
				setState(55);
				match(T__9);
				 ((DigitContext)_localctx).value =  9; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class HashtagContext extends ParserRuleContext {
		public HashtagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hashtag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixValidationListener ) ((MatrixValidationListener)listener).enterHashtag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatrixValidationListener ) ((MatrixValidationListener)listener).exitHashtag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatrixValidationVisitor ) return ((MatrixValidationVisitor<? extends T>)visitor).visitHashtag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HashtagContext hashtag() throws RecognitionException {
		HashtagContext _localctx = new HashtagContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_hashtag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__10);
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
		"\u0004\u0001\f>\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001b\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002$\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003:\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002"+
		"\u0004\u0006\b\u0000\u0000D\u0000\n\u0001\u0000\u0000\u0000\u0002\u001a"+
		"\u0001\u0000\u0000\u0000\u0004#\u0001\u0000\u0000\u0000\u00069\u0001\u0000"+
		"\u0000\u0000\b;\u0001\u0000\u0000\u0000\n\u000b\u0003\u0002\u0001\u0000"+
		"\u000b\f\u0005\u0000\u0000\u0001\f\r\u0006\u0000\uffff\uffff\u0000\r\u0001"+
		"\u0001\u0000\u0000\u0000\u000e\u000f\u0003\u0004\u0002\u0000\u000f\u0010"+
		"\u0003\b\u0004\u0000\u0010\u0011\u0003\u0002\u0001\u0000\u0011\u0012\u0006"+
		"\u0001\uffff\uffff\u0000\u0012\u001b\u0001\u0000\u0000\u0000\u0013\u0014"+
		"\u0003\u0004\u0002\u0000\u0014\u0015\u0003\b\u0004\u0000\u0015\u0016\u0006"+
		"\u0001\uffff\uffff\u0000\u0016\u001b\u0001\u0000\u0000\u0000\u0017\u0018"+
		"\u0003\u0004\u0002\u0000\u0018\u0019\u0006\u0001\uffff\uffff\u0000\u0019"+
		"\u001b\u0001\u0000\u0000\u0000\u001a\u000e\u0001\u0000\u0000\u0000\u001a"+
		"\u0013\u0001\u0000\u0000\u0000\u001a\u0017\u0001\u0000\u0000\u0000\u001b"+
		"\u0003\u0001\u0000\u0000\u0000\u001c\u001d\u0003\u0006\u0003\u0000\u001d"+
		"\u001e\u0003\u0004\u0002\u0000\u001e\u001f\u0006\u0002\uffff\uffff\u0000"+
		"\u001f$\u0001\u0000\u0000\u0000 !\u0003\u0006\u0003\u0000!\"\u0006\u0002"+
		"\uffff\uffff\u0000\"$\u0001\u0000\u0000\u0000#\u001c\u0001\u0000\u0000"+
		"\u0000# \u0001\u0000\u0000\u0000$\u0005\u0001\u0000\u0000\u0000%&\u0005"+
		"\u0001\u0000\u0000&:\u0006\u0003\uffff\uffff\u0000\'(\u0005\u0002\u0000"+
		"\u0000(:\u0006\u0003\uffff\uffff\u0000)*\u0005\u0003\u0000\u0000*:\u0006"+
		"\u0003\uffff\uffff\u0000+,\u0005\u0004\u0000\u0000,:\u0006\u0003\uffff"+
		"\uffff\u0000-.\u0005\u0005\u0000\u0000.:\u0006\u0003\uffff\uffff\u0000"+
		"/0\u0005\u0006\u0000\u00000:\u0006\u0003\uffff\uffff\u000012\u0005\u0007"+
		"\u0000\u00002:\u0006\u0003\uffff\uffff\u000034\u0005\b\u0000\u00004:\u0006"+
		"\u0003\uffff\uffff\u000056\u0005\t\u0000\u00006:\u0006\u0003\uffff\uffff"+
		"\u000078\u0005\n\u0000\u00008:\u0006\u0003\uffff\uffff\u00009%\u0001\u0000"+
		"\u0000\u00009\'\u0001\u0000\u0000\u00009)\u0001\u0000\u0000\u00009+\u0001"+
		"\u0000\u0000\u00009-\u0001\u0000\u0000\u00009/\u0001\u0000\u0000\u0000"+
		"91\u0001\u0000\u0000\u000093\u0001\u0000\u0000\u000095\u0001\u0000\u0000"+
		"\u000097\u0001\u0000\u0000\u0000:\u0007\u0001\u0000\u0000\u0000;<\u0005"+
		"\u000b\u0000\u0000<\t\u0001\u0000\u0000\u0000\u0003\u001a#9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}