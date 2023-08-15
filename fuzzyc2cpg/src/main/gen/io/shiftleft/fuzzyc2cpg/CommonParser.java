// Generated from /Users/hellomark/Documents/study/project/fuzzy2vec_mk/fuzzyc2cpg/src/main/antlr4/io/shiftleft/fuzzyc2cpg/Common.g4 by ANTLR 4.10.1
package io.shiftleft.fuzzyc2cpg;

  import java.util.Stack;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, IF=63, ELSE=64, FOR=65, WHILE=66, BREAK=67, 
		CASE=68, CONTINUE=69, SWITCH=70, DO=71, GOTO=72, RETURN=73, TYPEDEF=74, 
		EXTERN=75, VOID=76, UNSIGNED=77, SIGNED=78, LONG=79, CV_QUALIFIER=80, 
		VIRTUAL=81, TRY=82, CATCH=83, THROW=84, USING=85, NAMESPACE=86, AUTO=87, 
		REGISTER=88, OPERATOR=89, TEMPLATE=90, NEW=91, EXTENDS=92, IMPLEMENTS=93, 
		GCC_ATTRIBUTE=94, ALPHA_NUMERIC=95, OPENING_CURLY=96, CLOSING_CURLY=97, 
		PRE_IF=98, PRE_ELSE=99, PRE_ENDIF=100, PRE_DEFINE=101, HEX_LITERAL=102, 
		DECIMAL_LITERAL=103, OCTAL_LITERAL=104, BINARY_LITERAL=105, FLOATING_POINT_LITERAL=106, 
		CHAR=107, STRING=108, MULTILINE_STRING=109, COMMENT=110, LINE_COMMENT=111, 
		WHITESPACE=112, ELLIPSIS=113, OTHER=114;
	public static final int
		RULE_unary_operator = 0, RULE_relational_operator = 1, RULE_constant = 2, 
		RULE_function_decl_specifiers = 3, RULE_ptr_operator = 4, RULE_access_specifier = 5, 
		RULE_operator = 6, RULE_assignment_operator = 7, RULE_equality_operator = 8, 
		RULE_template_decl = 9, RULE_template_decl_param_list = 10, RULE_template_template = 11, 
		RULE_template_decl_param = 12, RULE_template_decl_keyword = 13, RULE_template_name = 14, 
		RULE_template_args = 15, RULE_template_args_param_list = 16, RULE_template_args_param = 17, 
		RULE_no_brackets = 18, RULE_no_brackets_curlies_or_squares = 19, RULE_no_brackets_or_semicolon = 20, 
		RULE_no_angle_brackets_or_brackets = 21, RULE_no_curlies = 22, RULE_no_squares = 23, 
		RULE_no_squares_or_semicolon = 24, RULE_no_comma_or_semicolon = 25, RULE_assign_water = 26, 
		RULE_assign_water_l2 = 27, RULE_water = 28, RULE_identifier = 29, RULE_number = 30, 
		RULE_ptrs = 31, RULE_func_ptrs = 32, RULE_rvalue_ref = 33, RULE_class_key = 34, 
		RULE_class_def = 35, RULE_class_name = 36, RULE_base_classes = 37, RULE_base_class = 38, 
		RULE_type_name = 39, RULE_base_type = 40, RULE_gcc_attribute = 41, RULE_expr = 42, 
		RULE_assign_expr = 43, RULE_conditional_expression = 44, RULE_or_expression = 45, 
		RULE_and_expression = 46, RULE_inclusive_or_expression = 47, RULE_exclusive_or_expression = 48, 
		RULE_bit_and_expression = 49, RULE_equality_expression = 50, RULE_relational_expression = 51, 
		RULE_shift_expression = 52, RULE_additive_expression = 53, RULE_multiplicative_expression = 54, 
		RULE_cast_expression = 55, RULE_cast_target = 56, RULE_unary_expression = 57, 
		RULE_new_expression = 58, RULE_unary_op_and_cast_expr = 59, RULE_sizeof_expression = 60, 
		RULE_sizeof = 61, RULE_sizeof_operand = 62, RULE_sizeof_operand2 = 63, 
		RULE_inc_dec = 64, RULE_postfix_expression = 65, RULE_function_argument_list = 66, 
		RULE_function_argument = 67, RULE_primary_expression = 68;
	private static String[] makeRuleNames() {
		return new String[] {
			"unary_operator", "relational_operator", "constant", "function_decl_specifiers", 
			"ptr_operator", "access_specifier", "operator", "assignment_operator", 
			"equality_operator", "template_decl", "template_decl_param_list", "template_template", 
			"template_decl_param", "template_decl_keyword", "template_name", "template_args", 
			"template_args_param_list", "template_args_param", "no_brackets", "no_brackets_curlies_or_squares", 
			"no_brackets_or_semicolon", "no_angle_brackets_or_brackets", "no_curlies", 
			"no_squares", "no_squares_or_semicolon", "no_comma_or_semicolon", "assign_water", 
			"assign_water_l2", "water", "identifier", "number", "ptrs", "func_ptrs", 
			"rvalue_ref", "class_key", "class_def", "class_name", "base_classes", 
			"base_class", "type_name", "base_type", "gcc_attribute", "expr", "assign_expr", 
			"conditional_expression", "or_expression", "and_expression", "inclusive_or_expression", 
			"exclusive_or_expression", "bit_and_expression", "equality_expression", 
			"relational_expression", "shift_expression", "additive_expression", "multiplicative_expression", 
			"cast_expression", "cast_target", "unary_expression", "new_expression", 
			"unary_op_and_cast_expr", "sizeof_expression", "sizeof", "sizeof_operand", 
			"sizeof_operand2", "inc_dec", "postfix_expression", "function_argument_list", 
			"function_argument", "primary_expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'&'", "'*'", "'+'", "'-'", "'~'", "'!'", "'<'", "'>'", "'<='", 
			"'>='", "'inline'", "'explicit'", "'friend'", "'static'", "'public'", 
			"'private'", "'protected'", "'class'", "'delete'", "'['", "']'", "'/'", 
			"'%'", "'^'", "'|'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'^='", 
			"'&='", "'|='", "'>>'", "'<<'", "'>>='", "'<<='", "'=='", "'!='", "'&&'", 
			"'||'", "'++'", "'--'", "','", "'->*'", "'->'", "'('", "')'", "'typename'", 
			"';'", "'::'", "'[]'", "'restrict'", "'struct'", "'union'", "'enum'", 
			"':'", "'?'", "'sizeof'", "'.'", "'instanceof'", "'if'", "'else'", "'for'", 
			"'while'", "'break'", "'case'", "'continue'", "'switch'", "'do'", "'goto'", 
			"'return'", "'typedef'", "'extern'", "'void'", "'unsigned'", "'signed'", 
			"'long'", null, "'virtual'", "'try'", "'catch'", "'throw'", "'using'", 
			"'namespace'", "'auto'", "'register'", "'operator'", "'template'", "'new'", 
			"'extends'", "'implements'", "'__attribute__'", null, "'{'", "'}'", null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "IF", "ELSE", "FOR", "WHILE", "BREAK", "CASE", "CONTINUE", 
			"SWITCH", "DO", "GOTO", "RETURN", "TYPEDEF", "EXTERN", "VOID", "UNSIGNED", 
			"SIGNED", "LONG", "CV_QUALIFIER", "VIRTUAL", "TRY", "CATCH", "THROW", 
			"USING", "NAMESPACE", "AUTO", "REGISTER", "OPERATOR", "TEMPLATE", "NEW", 
			"EXTENDS", "IMPLEMENTS", "GCC_ATTRIBUTE", "ALPHA_NUMERIC", "OPENING_CURLY", 
			"CLOSING_CURLY", "PRE_IF", "PRE_ELSE", "PRE_ENDIF", "PRE_DEFINE", "HEX_LITERAL", 
			"DECIMAL_LITERAL", "OCTAL_LITERAL", "BINARY_LITERAL", "FLOATING_POINT_LITERAL", 
			"CHAR", "STRING", "MULTILINE_STRING", "COMMENT", "LINE_COMMENT", "WHITESPACE", 
			"ELLIPSIS", "OTHER"
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
	public String getGrammarFileName() { return "Common.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	    public void skipToEndOfObject() {
	        Stack<Object> CurlyStack = new Stack<>();
	        Object o = new Object();
	        int t = _input.LA(1);

	        while (t != EOF && !(CurlyStack.empty() && t == CLOSING_CURLY)) {

	            if (t == PRE_ELSE){
	                Stack<Object> ifdefStack = new Stack<>();
	                consume();
	                t = _input.LA(1);

	                while (t != EOF && !(ifdefStack.empty() && (t == PRE_ENDIF))) {

	                    if (t == PRE_IF) ifdefStack.push(o);
	                    else if (t == PRE_ENDIF) ifdefStack.pop();

	                    consume();
	                    t = _input.LA(1);
	                }
	            }

	            if (t == OPENING_CURLY) CurlyStack.push(o);
	            else if (t == CLOSING_CURLY) CurlyStack.pop();

	            consume();
	            t = _input.LA(1);
	        }

	        if(t != EOF) consume();
	    }


	public CommonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Unary_operatorContext extends ParserRuleContext {
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
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

	public static class Relational_operatorContext extends ParserRuleContext {
		public Relational_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterRelational_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitRelational_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitRelational_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_operatorContext relational_operator() throws RecognitionException {
		Relational_operatorContext _localctx = new Relational_operatorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_relational_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode HEX_LITERAL() { return getToken(CommonParser.HEX_LITERAL, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(CommonParser.OCTAL_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(CommonParser.DECIMAL_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(CommonParser.BINARY_LITERAL, 0); }
		public TerminalNode STRING() { return getToken(CommonParser.STRING, 0); }
		public TerminalNode MULTILINE_STRING() { return getToken(CommonParser.MULTILINE_STRING, 0); }
		public TerminalNode CHAR() { return getToken(CommonParser.CHAR, 0); }
		public TerminalNode FLOATING_POINT_LITERAL() { return getToken(CommonParser.FLOATING_POINT_LITERAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (HEX_LITERAL - 102)) | (1L << (DECIMAL_LITERAL - 102)) | (1L << (OCTAL_LITERAL - 102)) | (1L << (BINARY_LITERAL - 102)) | (1L << (FLOATING_POINT_LITERAL - 102)) | (1L << (CHAR - 102)) | (1L << (STRING - 102)) | (1L << (MULTILINE_STRING - 102)))) != 0)) ) {
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

	public static class Function_decl_specifiersContext extends ParserRuleContext {
		public TerminalNode VIRTUAL() { return getToken(CommonParser.VIRTUAL, 0); }
		public Function_decl_specifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_decl_specifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterFunction_decl_specifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitFunction_decl_specifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitFunction_decl_specifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_decl_specifiersContext function_decl_specifiers() throws RecognitionException {
		Function_decl_specifiersContext _localctx = new Function_decl_specifiersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0) || _la==VIRTUAL) ) {
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

	public static class Ptr_operatorContext extends ParserRuleContext {
		public Ptr_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptr_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterPtr_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitPtr_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitPtr_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ptr_operatorContext ptr_operator() throws RecognitionException {
		Ptr_operatorContext _localctx = new Ptr_operatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ptr_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
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

	public static class Access_specifierContext extends ParserRuleContext {
		public Access_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterAccess_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitAccess_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitAccess_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_specifierContext access_specifier() throws RecognitionException {
		Access_specifierContext _localctx = new Access_specifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_access_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(CommonParser.NEW, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_operator);
		int _la;
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(150);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==NEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(151);
					match(T__19);
					setState(152);
					match(T__20);
					}
				}

				}
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(T__2);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				match(T__3);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(157);
				match(T__1);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 5);
				{
				setState(158);
				match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 6);
				{
				setState(159);
				match(T__22);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 7);
				{
				setState(160);
				match(T__23);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 8);
				{
				setState(161);
				match(T__0);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 9);
				{
				setState(162);
				match(T__24);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 10);
				{
				setState(163);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 11);
				{
				setState(164);
				match(T__5);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 12);
				{
				setState(165);
				match(T__25);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 13);
				{
				setState(166);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 14);
				{
				setState(167);
				match(T__7);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 15);
				{
				setState(168);
				match(T__26);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 16);
				{
				setState(169);
				match(T__27);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 17);
				{
				setState(170);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 18);
				{
				setState(171);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 19);
				{
				setState(172);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 20);
				{
				setState(173);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 21);
				{
				setState(174);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 22);
				{
				setState(175);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 23);
				{
				setState(176);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 24);
				{
				setState(177);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 25);
				{
				setState(178);
				match(T__36);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 26);
				{
				setState(179);
				match(T__37);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 27);
				{
				setState(180);
				match(T__38);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 28);
				{
				setState(181);
				match(T__39);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 29);
				{
				setState(182);
				match(T__8);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 30);
				{
				setState(183);
				match(T__9);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 31);
				{
				setState(184);
				match(T__40);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 32);
				{
				setState(185);
				match(T__41);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 33);
				{
				setState(186);
				match(T__42);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 34);
				{
				setState(187);
				match(T__43);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 35);
				{
				setState(188);
				match(T__44);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 36);
				{
				setState(189);
				match(T__45);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 37);
				{
				setState(190);
				match(T__46);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 38);
				{
				setState(191);
				match(T__47);
				setState(192);
				match(T__48);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 39);
				{
				setState(193);
				match(T__19);
				setState(194);
				match(T__20);
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

	public static class Assignment_operatorContext extends ParserRuleContext {
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitAssignment_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitAssignment_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__36) | (1L << T__37))) != 0)) ) {
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

	public static class Equality_operatorContext extends ParserRuleContext {
		public Equality_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterEquality_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitEquality_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitEquality_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_operatorContext equality_operator() throws RecognitionException {
		Equality_operatorContext _localctx = new Equality_operatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_equality_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_la = _input.LA(1);
			if ( !(_la==T__38 || _la==T__39) ) {
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

	public static class Template_declContext extends ParserRuleContext {
		public TerminalNode TEMPLATE() { return getToken(CommonParser.TEMPLATE, 0); }
		public Template_decl_param_listContext template_decl_param_list() {
			return getRuleContext(Template_decl_param_listContext.class,0);
		}
		public Template_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterTemplate_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitTemplate_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitTemplate_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_declContext template_decl() throws RecognitionException {
		Template_declContext _localctx = new Template_declContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_template_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(TEMPLATE);
			setState(202);
			match(T__6);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__49))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (CV_QUALIFIER - 80)) | (1L << (TEMPLATE - 80)) | (1L << (ALPHA_NUMERIC - 80)))) != 0)) {
				{
				setState(203);
				template_decl_param_list(0);
				}
			}

			setState(206);
			match(T__7);
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

	public static class Template_decl_param_listContext extends ParserRuleContext {
		public Template_templateContext template_template() {
			return getRuleContext(Template_templateContext.class,0);
		}
		public Template_decl_keywordContext template_decl_keyword() {
			return getRuleContext(Template_decl_keywordContext.class,0);
		}
		public Template_nameContext template_name() {
			return getRuleContext(Template_nameContext.class,0);
		}
		public Template_decl_paramContext template_decl_param() {
			return getRuleContext(Template_decl_paramContext.class,0);
		}
		public Template_decl_param_listContext template_decl_param_list() {
			return getRuleContext(Template_decl_param_listContext.class,0);
		}
		public Template_decl_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_decl_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterTemplate_decl_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitTemplate_decl_param_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitTemplate_decl_param_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_decl_param_listContext template_decl_param_list() throws RecognitionException {
		return template_decl_param_list(0);
	}

	private Template_decl_param_listContext template_decl_param_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Template_decl_param_listContext _localctx = new Template_decl_param_listContext(_ctx, _parentState);
		Template_decl_param_listContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_template_decl_param_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEMPLATE:
				{
				setState(209);
				template_template();
				setState(210);
				template_decl_keyword();
				setState(211);
				template_name();
				}
				break;
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__49:
			case CV_QUALIFIER:
			case ALPHA_NUMERIC:
				{
				setState(213);
				template_decl_param();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Template_decl_param_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_template_decl_param_list);
					setState(216);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(217);
					match(T__44);
					setState(218);
					template_decl_param();
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Template_templateContext extends ParserRuleContext {
		public TerminalNode TEMPLATE() { return getToken(CommonParser.TEMPLATE, 0); }
		public List<Template_decl_keywordContext> template_decl_keyword() {
			return getRuleContexts(Template_decl_keywordContext.class);
		}
		public Template_decl_keywordContext template_decl_keyword(int i) {
			return getRuleContext(Template_decl_keywordContext.class,i);
		}
		public Template_templateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterTemplate_template(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitTemplate_template(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitTemplate_template(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_templateContext template_template() throws RecognitionException {
		Template_templateContext _localctx = new Template_templateContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_template_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(TEMPLATE);
			setState(225);
			match(T__6);
			setState(230); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(226);
				template_decl_keyword();
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__44) {
					{
					setState(227);
					match(T__44);
					}
				}

				}
				}
				setState(232); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__17 || _la==T__49 );
			setState(234);
			match(T__7);
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

	public static class Template_decl_paramContext extends ParserRuleContext {
		public Template_decl_keywordContext template_decl_keyword() {
			return getRuleContext(Template_decl_keywordContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Template_nameContext template_name() {
			return getRuleContext(Template_nameContext.class,0);
		}
		public Ptr_operatorContext ptr_operator() {
			return getRuleContext(Ptr_operatorContext.class,0);
		}
		public TerminalNode CV_QUALIFIER() { return getToken(CommonParser.CV_QUALIFIER, 0); }
		public Template_decl_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_decl_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterTemplate_decl_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitTemplate_decl_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitTemplate_decl_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_decl_paramContext template_decl_param() throws RecognitionException {
		Template_decl_paramContext _localctx = new Template_decl_paramContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_template_decl_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(236);
				template_decl_keyword();
				}
				break;
			case 2:
				{
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CV_QUALIFIER) {
					{
					setState(237);
					match(CV_QUALIFIER);
					}
				}

				setState(240);
				identifier();
				}
				break;
			}
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(243);
				template_name();
				}
				break;
			}
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(246);
				ptr_operator();
				}
				break;
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

	public static class Template_decl_keywordContext extends ParserRuleContext {
		public Template_decl_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_decl_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterTemplate_decl_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitTemplate_decl_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitTemplate_decl_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_decl_keywordContext template_decl_keyword() throws RecognitionException {
		Template_decl_keywordContext _localctx = new Template_decl_keywordContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_template_decl_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__49) ) {
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

	public static class Template_nameContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(CommonParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(CommonParser.ALPHA_NUMERIC, i);
		}
		public TerminalNode ELLIPSIS() { return getToken(CommonParser.ELLIPSIS, 0); }
		public Template_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterTemplate_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitTemplate_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitTemplate_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_nameContext template_name() throws RecognitionException {
		Template_nameContext _localctx = new Template_nameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_template_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(252); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(251);
					match(ALPHA_NUMERIC);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(254); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(256);
				match(ELLIPSIS);
				}
				break;
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

	public static class Template_argsContext extends ParserRuleContext {
		public Template_args_param_listContext template_args_param_list() {
			return getRuleContext(Template_args_param_listContext.class,0);
		}
		public Template_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterTemplate_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitTemplate_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitTemplate_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_argsContext template_args() throws RecognitionException {
		Template_argsContext _localctx = new Template_argsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_template_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(T__6);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (VOID - 76)) | (1L << (LONG - 76)) | (1L << (CV_QUALIFIER - 76)) | (1L << (AUTO - 76)) | (1L << (ALPHA_NUMERIC - 76)))) != 0)) {
				{
				setState(260);
				template_args_param_list(0);
				}
			}

			setState(263);
			match(T__7);
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

	public static class Template_args_param_listContext extends ParserRuleContext {
		public Template_args_paramContext template_args_param() {
			return getRuleContext(Template_args_paramContext.class,0);
		}
		public Template_args_param_listContext template_args_param_list() {
			return getRuleContext(Template_args_param_listContext.class,0);
		}
		public Template_args_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_args_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterTemplate_args_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitTemplate_args_param_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitTemplate_args_param_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_args_param_listContext template_args_param_list() throws RecognitionException {
		return template_args_param_list(0);
	}

	private Template_args_param_listContext template_args_param_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Template_args_param_listContext _localctx = new Template_args_param_listContext(_ctx, _parentState);
		Template_args_param_listContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_template_args_param_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(266);
			template_args_param();
			}
			_ctx.stop = _input.LT(-1);
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Template_args_param_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_template_args_param_list);
					setState(268);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(269);
					match(T__44);
					setState(270);
					template_args_param();
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Template_args_paramContext extends ParserRuleContext {
		public Base_typeContext base_type() {
			return getRuleContext(Base_typeContext.class,0);
		}
		public TerminalNode CV_QUALIFIER() { return getToken(CommonParser.CV_QUALIFIER, 0); }
		public Ptr_operatorContext ptr_operator() {
			return getRuleContext(Ptr_operatorContext.class,0);
		}
		public Template_args_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_args_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterTemplate_args_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitTemplate_args_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitTemplate_args_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_args_paramContext template_args_param() throws RecognitionException {
		Template_args_paramContext _localctx = new Template_args_paramContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_template_args_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CV_QUALIFIER) {
				{
				setState(276);
				match(CV_QUALIFIER);
				}
			}

			setState(279);
			base_type();
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(280);
				ptr_operator();
				}
				break;
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

	public static class No_bracketsContext extends ParserRuleContext {
		public No_bracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_brackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterNo_brackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitNo_brackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitNo_brackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_bracketsContext no_brackets() throws RecognitionException {
		No_bracketsContext _localctx = new No_bracketsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_no_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__47 || _la==T__48) ) {
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

	public static class No_brackets_curlies_or_squaresContext extends ParserRuleContext {
		public TerminalNode OPENING_CURLY() { return getToken(CommonParser.OPENING_CURLY, 0); }
		public TerminalNode CLOSING_CURLY() { return getToken(CommonParser.CLOSING_CURLY, 0); }
		public No_brackets_curlies_or_squaresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_brackets_curlies_or_squares; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterNo_brackets_curlies_or_squares(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitNo_brackets_curlies_or_squares(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitNo_brackets_curlies_or_squares(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_brackets_curlies_or_squaresContext no_brackets_curlies_or_squares() throws RecognitionException {
		No_brackets_curlies_or_squaresContext _localctx = new No_brackets_curlies_or_squaresContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_no_brackets_curlies_or_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__47) | (1L << T__48))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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

	public static class No_brackets_or_semicolonContext extends ParserRuleContext {
		public No_brackets_or_semicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_brackets_or_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterNo_brackets_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitNo_brackets_or_semicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitNo_brackets_or_semicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_brackets_or_semicolonContext no_brackets_or_semicolon() throws RecognitionException {
		No_brackets_or_semicolonContext _localctx = new No_brackets_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_no_brackets_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__47) | (1L << T__48) | (1L << T__50))) != 0)) ) {
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

	public static class No_angle_brackets_or_bracketsContext extends ParserRuleContext {
		public No_angle_brackets_or_bracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_angle_brackets_or_brackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterNo_angle_brackets_or_brackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitNo_angle_brackets_or_brackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitNo_angle_brackets_or_brackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_angle_brackets_or_bracketsContext no_angle_brackets_or_brackets() throws RecognitionException {
		No_angle_brackets_or_bracketsContext _localctx = new No_angle_brackets_or_bracketsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_no_angle_brackets_or_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__47) | (1L << T__48))) != 0)) ) {
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

	public static class No_curliesContext extends ParserRuleContext {
		public TerminalNode OPENING_CURLY() { return getToken(CommonParser.OPENING_CURLY, 0); }
		public TerminalNode CLOSING_CURLY() { return getToken(CommonParser.CLOSING_CURLY, 0); }
		public No_curliesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_curlies; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterNo_curlies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitNo_curlies(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitNo_curlies(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_curliesContext no_curlies() throws RecognitionException {
		No_curliesContext _localctx = new No_curliesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_no_curlies);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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

	public static class No_squaresContext extends ParserRuleContext {
		public No_squaresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_squares; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterNo_squares(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitNo_squares(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitNo_squares(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_squaresContext no_squares() throws RecognitionException {
		No_squaresContext _localctx = new No_squaresContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_no_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__19 || _la==T__20) ) {
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

	public static class No_squares_or_semicolonContext extends ParserRuleContext {
		public No_squares_or_semicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_squares_or_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterNo_squares_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitNo_squares_or_semicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitNo_squares_or_semicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_squares_or_semicolonContext no_squares_or_semicolon() throws RecognitionException {
		No_squares_or_semicolonContext _localctx = new No_squares_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_no_squares_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__50))) != 0)) ) {
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

	public static class No_comma_or_semicolonContext extends ParserRuleContext {
		public No_comma_or_semicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_comma_or_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterNo_comma_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitNo_comma_or_semicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitNo_comma_or_semicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_comma_or_semicolonContext no_comma_or_semicolon() throws RecognitionException {
		No_comma_or_semicolonContext _localctx = new No_comma_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_no_comma_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__44 || _la==T__50) ) {
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

	public static class Assign_waterContext extends ParserRuleContext {
		public TerminalNode OPENING_CURLY() { return getToken(CommonParser.OPENING_CURLY, 0); }
		public TerminalNode CLOSING_CURLY() { return getToken(CommonParser.CLOSING_CURLY, 0); }
		public Assign_waterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_water; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterAssign_water(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitAssign_water(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitAssign_water(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_waterContext assign_water() throws RecognitionException {
		Assign_waterContext _localctx = new Assign_waterContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assign_water);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__44) | (1L << T__47) | (1L << T__48) | (1L << T__50))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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

	public static class Assign_water_l2Context extends ParserRuleContext {
		public TerminalNode OPENING_CURLY() { return getToken(CommonParser.OPENING_CURLY, 0); }
		public TerminalNode CLOSING_CURLY() { return getToken(CommonParser.CLOSING_CURLY, 0); }
		public Assign_water_l2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_water_l2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterAssign_water_l2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitAssign_water_l2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitAssign_water_l2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_water_l2Context assign_water_l2() throws RecognitionException {
		Assign_water_l2Context _localctx = new Assign_water_l2Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_assign_water_l2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__47) | (1L << T__48))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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

	public static class WaterContext extends ParserRuleContext {
		public WaterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_water; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterWater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitWater(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitWater(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WaterContext water() throws RecognitionException {
		WaterContext _localctx = new WaterContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_water);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			matchWildcard();
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

	public static class IdentifierContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(CommonParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(CommonParser.ALPHA_NUMERIC, i);
		}
		public Access_specifierContext access_specifier() {
			return getRuleContext(Access_specifierContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_identifier);
		try {
			int _alt;
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(305);
				match(ALPHA_NUMERIC);
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(306);
						match(T__51);
						setState(307);
						match(ALPHA_NUMERIC);
						}
						} 
					}
					setState(312);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				}
				setState(314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(313);
					match(T__52);
					}
					break;
				}
				}
				break;
			case T__14:
			case T__15:
			case T__16:
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				access_specifier();
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode HEX_LITERAL() { return getToken(CommonParser.HEX_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(CommonParser.DECIMAL_LITERAL, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(CommonParser.OCTAL_LITERAL, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_la = _input.LA(1);
			if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (HEX_LITERAL - 102)) | (1L << (DECIMAL_LITERAL - 102)) | (1L << (OCTAL_LITERAL - 102)))) != 0)) ) {
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

	public static class PtrsContext extends ParserRuleContext {
		public List<Ptr_operatorContext> ptr_operator() {
			return getRuleContexts(Ptr_operatorContext.class);
		}
		public Ptr_operatorContext ptr_operator(int i) {
			return getRuleContext(Ptr_operatorContext.class,i);
		}
		public List<TerminalNode> CV_QUALIFIER() { return getTokens(CommonParser.CV_QUALIFIER); }
		public TerminalNode CV_QUALIFIER(int i) {
			return getToken(CommonParser.CV_QUALIFIER, i);
		}
		public PtrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterPtrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitPtrs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitPtrs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PtrsContext ptrs() throws RecognitionException {
		PtrsContext _localctx = new PtrsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ptrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CV_QUALIFIER) {
					{
					setState(321);
					match(CV_QUALIFIER);
					}
				}

				setState(324);
				ptr_operator();
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__53) {
					{
					setState(325);
					match(T__53);
					}
				}

				}
				}
				setState(330); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 || _la==T__1 || _la==CV_QUALIFIER );
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

	public static class Func_ptrsContext extends ParserRuleContext {
		public PtrsContext ptrs() {
			return getRuleContext(PtrsContext.class,0);
		}
		public Func_ptrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_ptrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterFunc_ptrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitFunc_ptrs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitFunc_ptrs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_ptrsContext func_ptrs() throws RecognitionException {
		Func_ptrsContext _localctx = new Func_ptrsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_func_ptrs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			ptrs();
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

	public static class Rvalue_refContext extends ParserRuleContext {
		public Rvalue_refContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rvalue_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterRvalue_ref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitRvalue_ref(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitRvalue_ref(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rvalue_refContext rvalue_ref() throws RecognitionException {
		Rvalue_refContext _localctx = new Rvalue_refContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_rvalue_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(T__40);
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

	public static class Class_keyContext extends ParserRuleContext {
		public Class_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterClass_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitClass_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitClass_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_keyContext class_key() throws RecognitionException {
		Class_keyContext _localctx = new Class_keyContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_class_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0)) ) {
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

	public static class Class_defContext extends ParserRuleContext {
		public Class_keyContext class_key() {
			return getRuleContext(Class_keyContext.class,0);
		}
		public TerminalNode OPENING_CURLY() { return getToken(CommonParser.OPENING_CURLY, 0); }
		public List<Template_declContext> template_decl() {
			return getRuleContexts(Template_declContext.class);
		}
		public Template_declContext template_decl(int i) {
			return getRuleContext(Template_declContext.class,i);
		}
		public Gcc_attributeContext gcc_attribute() {
			return getRuleContext(Gcc_attributeContext.class,0);
		}
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Template_argsContext template_args() {
			return getRuleContext(Template_argsContext.class,0);
		}
		public Base_classesContext base_classes() {
			return getRuleContext(Base_classesContext.class,0);
		}
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterClass_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitClass_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitClass_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEMPLATE) {
				{
				{
				setState(338);
				template_decl();
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(344);
			class_key();
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GCC_ATTRIBUTE) {
				{
				setState(345);
				gcc_attribute();
				}
			}

			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0) || _la==ALPHA_NUMERIC) {
				{
				setState(348);
				class_name();
				}
			}

			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(351);
				template_args();
				}
			}

			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (T__57 - 58)) | (1L << (EXTENDS - 58)) | (1L << (IMPLEMENTS - 58)))) != 0)) {
				{
				setState(354);
				base_classes();
				}
			}

			setState(357);
			match(OPENING_CURLY);
			 skipToEndOfObject(); 
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

	public static class Class_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterClass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitClass_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitClass_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			identifier();
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

	public static class Base_classesContext extends ParserRuleContext {
		public List<Base_classContext> base_class() {
			return getRuleContexts(Base_classContext.class);
		}
		public Base_classContext base_class(int i) {
			return getRuleContext(Base_classContext.class,i);
		}
		public List<TerminalNode> EXTENDS() { return getTokens(CommonParser.EXTENDS); }
		public TerminalNode EXTENDS(int i) {
			return getToken(CommonParser.EXTENDS, i);
		}
		public List<TerminalNode> IMPLEMENTS() { return getTokens(CommonParser.IMPLEMENTS); }
		public TerminalNode IMPLEMENTS(int i) {
			return getToken(CommonParser.IMPLEMENTS, i);
		}
		public Base_classesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_classes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterBase_classes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitBase_classes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitBase_classes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_classesContext base_classes() throws RecognitionException {
		Base_classesContext _localctx = new Base_classesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_base_classes);
		int _la;
		try {
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__57:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				match(T__57);
				setState(363);
				base_class();
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__44) {
					{
					{
					setState(364);
					match(T__44);
					setState(365);
					base_class();
					}
					}
					setState(370);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case EXTENDS:
			case IMPLEMENTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(373); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(371);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==IMPLEMENTS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(372);
					base_class();
					}
					}
					setState(375); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==EXTENDS || _la==IMPLEMENTS );
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

	public static class Base_classContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode VIRTUAL() { return getToken(CommonParser.VIRTUAL, 0); }
		public Access_specifierContext access_specifier() {
			return getRuleContext(Access_specifierContext.class,0);
		}
		public Template_argsContext template_args() {
			return getRuleContext(Template_argsContext.class,0);
		}
		public Base_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterBase_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitBase_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitBase_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_classContext base_class() throws RecognitionException {
		Base_classContext _localctx = new Base_classContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_base_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRTUAL) {
				{
				setState(379);
				match(VIRTUAL);
				}
			}

			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(382);
				access_specifier();
				}
				break;
			}
			setState(385);
			identifier();
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(386);
				template_args();
				}
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

	public static class Type_nameContext extends ParserRuleContext {
		public List<Base_typeContext> base_type() {
			return getRuleContexts(Base_typeContext.class);
		}
		public Base_typeContext base_type(int i) {
			return getRuleContext(Base_typeContext.class,i);
		}
		public List<TerminalNode> CV_QUALIFIER() { return getTokens(CommonParser.CV_QUALIFIER); }
		public TerminalNode CV_QUALIFIER(int i) {
			return getToken(CommonParser.CV_QUALIFIER, i);
		}
		public Class_keyContext class_key() {
			return getRuleContext(Class_keyContext.class,0);
		}
		public TerminalNode UNSIGNED() { return getToken(CommonParser.UNSIGNED, 0); }
		public TerminalNode SIGNED() { return getToken(CommonParser.SIGNED, 0); }
		public List<Template_argsContext> template_args() {
			return getRuleContexts(Template_argsContext.class);
		}
		public Template_argsContext template_args(int i) {
			return getRuleContext(Template_argsContext.class,i);
		}
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_type_name);
		int _la;
		try {
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CV_QUALIFIER) {
					{
					{
					setState(389);
					match(CV_QUALIFIER);
					}
					}
					setState(394);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(398);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__17:
				case T__54:
				case T__55:
				case T__56:
					{
					setState(395);
					class_key();
					}
					break;
				case UNSIGNED:
					{
					setState(396);
					match(UNSIGNED);
					}
					break;
				case SIGNED:
					{
					setState(397);
					match(SIGNED);
					}
					break;
				case VOID:
				case LONG:
				case AUTO:
				case ALPHA_NUMERIC:
					break;
				default:
					break;
				}
				setState(400);
				base_type();
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(401);
					template_args();
					}
				}

				setState(406);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(404);
					match(T__19);
					setState(405);
					match(T__20);
					}
					break;
				}
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__51) {
					{
					{
					setState(408);
					match(T__51);
					setState(409);
					base_type();
					setState(411);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__6) {
						{
						setState(410);
						template_args();
						}
					}

					}
					}
					setState(417);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CV_QUALIFIER) {
					{
					setState(418);
					match(CV_QUALIFIER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				postfix_expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(422);
				match(UNSIGNED);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(423);
				match(SIGNED);
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

	public static class Base_typeContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(CommonParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(CommonParser.ALPHA_NUMERIC, i);
		}
		public List<TerminalNode> AUTO() { return getTokens(CommonParser.AUTO); }
		public TerminalNode AUTO(int i) {
			return getToken(CommonParser.AUTO, i);
		}
		public List<TerminalNode> VOID() { return getTokens(CommonParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(CommonParser.VOID, i);
		}
		public List<TerminalNode> LONG() { return getTokens(CommonParser.LONG); }
		public TerminalNode LONG(int i) {
			return getToken(CommonParser.LONG, i);
		}
		public List<TerminalNode> ELLIPSIS() { return getTokens(CommonParser.ELLIPSIS); }
		public TerminalNode ELLIPSIS(int i) {
			return getToken(CommonParser.ELLIPSIS, i);
		}
		public Base_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterBase_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitBase_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitBase_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_typeContext base_type() throws RecognitionException {
		Base_typeContext _localctx = new Base_typeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_base_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(430); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(426);
					_la = _input.LA(1);
					if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (VOID - 76)) | (1L << (LONG - 76)) | (1L << (AUTO - 76)) | (1L << (ALPHA_NUMERIC - 76)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(428);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						setState(427);
						match(ELLIPSIS);
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(432); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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

	public static class Gcc_attributeContext extends ParserRuleContext {
		public TerminalNode GCC_ATTRIBUTE() { return getToken(CommonParser.GCC_ATTRIBUTE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Gcc_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gcc_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterGcc_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitGcc_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitGcc_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gcc_attributeContext gcc_attribute() throws RecognitionException {
		Gcc_attributeContext _localctx = new Gcc_attributeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_gcc_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(GCC_ATTRIBUTE);
			setState(435);
			match(T__47);
			setState(436);
			match(T__47);
			setState(437);
			identifier();
			setState(438);
			match(T__48);
			setState(439);
			match(T__48);
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

	public static class ExprContext extends ParserRuleContext {
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			assign_expr();
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(442);
				match(T__44);
				setState(443);
				expr();
				}
				break;
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

	public static class Assign_exprContext extends ParserRuleContext {
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public Assign_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterAssign_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitAssign_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitAssign_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_exprContext assign_expr() throws RecognitionException {
		Assign_exprContext _localctx = new Assign_exprContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_assign_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			conditional_expression();
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(447);
				assignment_operator();
				setState(448);
				assign_expr();
				}
				break;
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

	public static class Conditional_expressionContext extends ParserRuleContext {
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
	 
		public Conditional_expressionContext() { }
		public void copyFrom(Conditional_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NormOrContext extends Conditional_expressionContext {
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public NormOrContext(Conditional_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterNormOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitNormOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitNormOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CndExprContext extends Conditional_expressionContext {
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public CndExprContext(Conditional_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterCndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitCndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitCndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_conditional_expression);
		try {
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				_localctx = new NormOrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				or_expression();
				}
				break;
			case 2:
				_localctx = new CndExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
				or_expression();
				{
				setState(454);
				match(T__58);
				setState(455);
				expr();
				setState(456);
				match(T__57);
				setState(457);
				conditional_expression();
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

	public static class Or_expressionContext extends ParserRuleContext {
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public Or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterOr_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitOr_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitOr_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_expressionContext or_expression() throws RecognitionException {
		Or_expressionContext _localctx = new Or_expressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_or_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			and_expression();
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(462);
				match(T__41);
				setState(463);
				or_expression();
				}
				break;
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

	public static class And_expressionContext extends ParserRuleContext {
		public Inclusive_or_expressionContext inclusive_or_expression() {
			return getRuleContext(Inclusive_or_expressionContext.class,0);
		}
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitAnd_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitAnd_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_and_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			inclusive_or_expression();
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(467);
				match(T__40);
				setState(468);
				and_expression();
				}
				break;
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

	public static class Inclusive_or_expressionContext extends ParserRuleContext {
		public Exclusive_or_expressionContext exclusive_or_expression() {
			return getRuleContext(Exclusive_or_expressionContext.class,0);
		}
		public Inclusive_or_expressionContext inclusive_or_expression() {
			return getRuleContext(Inclusive_or_expressionContext.class,0);
		}
		public Inclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterInclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitInclusive_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitInclusive_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inclusive_or_expressionContext inclusive_or_expression() throws RecognitionException {
		Inclusive_or_expressionContext _localctx = new Inclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_inclusive_or_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			exclusive_or_expression();
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(472);
				match(T__24);
				setState(473);
				inclusive_or_expression();
				}
				break;
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

	public static class Exclusive_or_expressionContext extends ParserRuleContext {
		public Bit_and_expressionContext bit_and_expression() {
			return getRuleContext(Bit_and_expressionContext.class,0);
		}
		public Exclusive_or_expressionContext exclusive_or_expression() {
			return getRuleContext(Exclusive_or_expressionContext.class,0);
		}
		public Exclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterExclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitExclusive_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitExclusive_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exclusive_or_expressionContext exclusive_or_expression() throws RecognitionException {
		Exclusive_or_expressionContext _localctx = new Exclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_exclusive_or_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			bit_and_expression();
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(477);
				match(T__23);
				setState(478);
				exclusive_or_expression();
				}
				break;
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

	public static class Bit_and_expressionContext extends ParserRuleContext {
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public Bit_and_expressionContext bit_and_expression() {
			return getRuleContext(Bit_and_expressionContext.class,0);
		}
		public Bit_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bit_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterBit_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitBit_and_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitBit_and_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bit_and_expressionContext bit_and_expression() throws RecognitionException {
		Bit_and_expressionContext _localctx = new Bit_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_bit_and_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			equality_expression();
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(482);
				match(T__0);
				setState(483);
				bit_and_expression();
				}
				break;
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

	public static class Equality_expressionContext extends ParserRuleContext {
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Equality_operatorContext equality_operator() {
			return getRuleContext(Equality_operatorContext.class,0);
		}
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitEquality_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitEquality_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_equality_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			relational_expression();
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(487);
				equality_operator();
				setState(488);
				equality_expression();
				}
				break;
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

	public static class Relational_expressionContext extends ParserRuleContext {
		public Shift_expressionContext shift_expression() {
			return getRuleContext(Shift_expressionContext.class,0);
		}
		public Relational_operatorContext relational_operator() {
			return getRuleContext(Relational_operatorContext.class,0);
		}
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitRelational_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitRelational_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_relational_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			shift_expression();
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(493);
				relational_operator();
				setState(494);
				relational_expression();
				}
				break;
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

	public static class Shift_expressionContext extends ParserRuleContext {
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public Shift_expressionContext shift_expression() {
			return getRuleContext(Shift_expressionContext.class,0);
		}
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterShift_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitShift_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitShift_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			additive_expression();
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(499);
				_la = _input.LA(1);
				if ( !(_la==T__34 || _la==T__35) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(500);
				shift_expression();
				}
				break;
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

	public static class Additive_expressionContext extends ParserRuleContext {
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterAdditive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitAdditive_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitAdditive_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			multiplicative_expression();
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(504);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(505);
				additive_expression();
				}
				break;
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

	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterMultiplicative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitMultiplicative_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitMultiplicative_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_multiplicative_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			cast_expression();
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(509);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__21) | (1L << T__22))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(510);
				multiplicative_expression();
				}
				break;
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

	public static class Cast_expressionContext extends ParserRuleContext {
		public Cast_targetContext cast_target() {
			return getRuleContext(Cast_targetContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Cast_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterCast_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitCast_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitCast_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cast_expressionContext cast_expression() throws RecognitionException {
		Cast_expressionContext _localctx = new Cast_expressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_cast_expression);
		try {
			setState(519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(513);
				match(T__47);
				setState(514);
				cast_target();
				setState(515);
				match(T__48);
				setState(516);
				cast_expression();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				unary_expression();
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

	public static class Cast_targetContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Ptr_operatorContext> ptr_operator() {
			return getRuleContexts(Ptr_operatorContext.class);
		}
		public Ptr_operatorContext ptr_operator(int i) {
			return getRuleContext(Ptr_operatorContext.class,i);
		}
		public Cast_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterCast_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitCast_target(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitCast_target(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cast_targetContext cast_target() throws RecognitionException {
		Cast_targetContext _localctx = new Cast_targetContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_cast_target);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			type_name();
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(522);
				ptr_operator();
				}
				}
				setState(527);
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

	public static class Unary_expressionContext extends ParserRuleContext {
		public Inc_decContext inc_dec() {
			return getRuleContext(Inc_decContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public New_expressionContext new_expression() {
			return getRuleContext(New_expressionContext.class,0);
		}
		public Unary_op_and_cast_exprContext unary_op_and_cast_expr() {
			return getRuleContext(Unary_op_and_cast_exprContext.class,0);
		}
		public Sizeof_expressionContext sizeof_expression() {
			return getRuleContext(Sizeof_expressionContext.class,0);
		}
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitUnary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitUnary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_unary_expression);
		try {
			int _alt;
			setState(545);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__42:
			case T__43:
				enterOuterAlt(_localctx, 1);
				{
				setState(528);
				inc_dec();
				setState(529);
				cast_expression();
				}
				break;
			case T__51:
			case NEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
				new_expression();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(532);
				unary_op_and_cast_expr();
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 4);
				{
				setState(533);
				sizeof_expression();
				}
				break;
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__47:
			case ALPHA_NUMERIC:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case BINARY_LITERAL:
			case FLOATING_POINT_LITERAL:
			case CHAR:
			case STRING:
			case MULTILINE_STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(542);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(539);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(534);
							identifier();
							setState(535);
							match(T__46);
							}
							} 
						}
						setState(541);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
					}
					}
					break;
				}
				setState(544);
				postfix_expression(0);
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

	public static class New_expressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(CommonParser.NEW, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public New_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterNew_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitNew_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitNew_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_expressionContext new_expression() throws RecognitionException {
		New_expressionContext _localctx = new New_expressionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_new_expression);
		int _la;
		try {
			setState(580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__51) {
					{
					setState(547);
					match(T__51);
					}
				}

				setState(550);
				match(NEW);
				setState(551);
				type_name();
				setState(552);
				match(T__19);
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__42) | (1L << T__43) | (1L << T__47) | (1L << T__51) | (1L << T__59))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (ALPHA_NUMERIC - 91)) | (1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)) | (1L << (BINARY_LITERAL - 91)) | (1L << (FLOATING_POINT_LITERAL - 91)) | (1L << (CHAR - 91)) | (1L << (STRING - 91)) | (1L << (MULTILINE_STRING - 91)))) != 0)) {
					{
					setState(553);
					conditional_expression();
					}
				}

				setState(556);
				match(T__20);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__51) {
					{
					setState(558);
					match(T__51);
					}
				}

				setState(561);
				match(NEW);
				setState(562);
				type_name();
				setState(563);
				match(T__47);
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__42) | (1L << T__43) | (1L << T__47) | (1L << T__51) | (1L << T__59))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (ALPHA_NUMERIC - 91)) | (1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)) | (1L << (BINARY_LITERAL - 91)) | (1L << (FLOATING_POINT_LITERAL - 91)) | (1L << (CHAR - 91)) | (1L << (STRING - 91)) | (1L << (MULTILINE_STRING - 91)))) != 0)) {
					{
					setState(564);
					expr();
					}
				}

				setState(567);
				match(T__48);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__51) {
					{
					setState(569);
					match(T__51);
					}
				}

				setState(572);
				match(NEW);
				setState(573);
				postfix_expression(0);
				setState(574);
				match(T__47);
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__42) | (1L << T__43) | (1L << T__47) | (1L << T__51) | (1L << T__59))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (ALPHA_NUMERIC - 91)) | (1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)) | (1L << (BINARY_LITERAL - 91)) | (1L << (FLOATING_POINT_LITERAL - 91)) | (1L << (CHAR - 91)) | (1L << (STRING - 91)) | (1L << (MULTILINE_STRING - 91)))) != 0)) {
					{
					setState(575);
					expr();
					}
				}

				setState(578);
				match(T__48);
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

	public static class Unary_op_and_cast_exprContext extends ParserRuleContext {
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Unary_op_and_cast_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_op_and_cast_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterUnary_op_and_cast_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitUnary_op_and_cast_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitUnary_op_and_cast_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_op_and_cast_exprContext unary_op_and_cast_expr() throws RecognitionException {
		Unary_op_and_cast_exprContext _localctx = new Unary_op_and_cast_exprContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_unary_op_and_cast_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			unary_operator();
			setState(583);
			cast_expression();
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

	public static class Sizeof_expressionContext extends ParserRuleContext {
		public SizeofContext sizeof() {
			return getRuleContext(SizeofContext.class,0);
		}
		public Sizeof_operand2Context sizeof_operand2() {
			return getRuleContext(Sizeof_operand2Context.class,0);
		}
		public Sizeof_operandContext sizeof_operand() {
			return getRuleContext(Sizeof_operandContext.class,0);
		}
		public Sizeof_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeof_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterSizeof_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitSizeof_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitSizeof_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sizeof_expressionContext sizeof_expression() throws RecognitionException {
		Sizeof_expressionContext _localctx = new Sizeof_expressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_sizeof_expression);
		try {
			setState(598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(585);
				sizeof();
				setState(586);
				sizeof_operand2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(588);
				sizeof();
				setState(589);
				match(T__47);
				setState(590);
				sizeof_operand2();
				setState(591);
				match(T__48);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(593);
				sizeof();
				setState(594);
				match(T__47);
				setState(595);
				sizeof_operand();
				setState(596);
				match(T__48);
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

	public static class SizeofContext extends ParserRuleContext {
		public SizeofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterSizeof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitSizeof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitSizeof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeofContext sizeof() throws RecognitionException {
		SizeofContext _localctx = new SizeofContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_sizeof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(T__59);
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

	public static class Sizeof_operandContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Ptr_operatorContext> ptr_operator() {
			return getRuleContexts(Ptr_operatorContext.class);
		}
		public Ptr_operatorContext ptr_operator(int i) {
			return getRuleContext(Ptr_operatorContext.class,i);
		}
		public Sizeof_operandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeof_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterSizeof_operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitSizeof_operand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitSizeof_operand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sizeof_operandContext sizeof_operand() throws RecognitionException {
		Sizeof_operandContext _localctx = new Sizeof_operandContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_sizeof_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			type_name();
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(603);
				ptr_operator();
				}
				}
				setState(608);
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

	public static class Sizeof_operand2Context extends ParserRuleContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Sizeof_operand2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeof_operand2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterSizeof_operand2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitSizeof_operand2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitSizeof_operand2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sizeof_operand2Context sizeof_operand2() throws RecognitionException {
		Sizeof_operand2Context _localctx = new Sizeof_operand2Context(_ctx, getState());
		enterRule(_localctx, 126, RULE_sizeof_operand2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			unary_expression();
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

	public static class Inc_decContext extends ParserRuleContext {
		public Inc_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterInc_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitInc_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitInc_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inc_decContext inc_dec() throws RecognitionException {
		Inc_decContext _localctx = new Inc_decContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_inc_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			_la = _input.LA(1);
			if ( !(_la==T__42 || _la==T__43) ) {
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

	public static class Postfix_expressionContext extends ParserRuleContext {
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
	 
		public Postfix_expressionContext() { }
		public void copyFrom(Postfix_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MemberAccessContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TEMPLATE() { return getToken(CommonParser.TEMPLATE, 0); }
		public MemberAccessContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitMemberAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncDecOpContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Inc_decContext inc_dec() {
			return getRuleContext(Inc_decContext.class,0);
		}
		public IncDecOpContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterIncDecOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitIncDecOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitIncDecOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstanceContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Function_argument_listContext function_argument_list() {
			return getRuleContext(Function_argument_listContext.class,0);
		}
		public InstanceContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitInstance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitInstance(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryOnlyContext extends Postfix_expressionContext {
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public PrimaryOnlyContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterPrimaryOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitPrimaryOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitPrimaryOnly(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Function_argument_listContext function_argument_list() {
			return getRuleContext(Function_argument_listContext.class,0);
		}
		public FuncCallContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayIndexingContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayIndexingContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterArrayIndexing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitArrayIndexing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitArrayIndexing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PtrMemberAccessContext extends Postfix_expressionContext {
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TEMPLATE() { return getToken(CommonParser.TEMPLATE, 0); }
		public PtrMemberAccessContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterPtrMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitPtrMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitPtrMemberAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_expressionContext postfix_expression() throws RecognitionException {
		return postfix_expression(0);
	}

	private Postfix_expressionContext postfix_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, _parentState);
		Postfix_expressionContext _prevctx = _localctx;
		int _startState = 130;
		enterRecursionRule(_localctx, 130, RULE_postfix_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimaryOnlyContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(614);
			primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(652);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(650);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayIndexingContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(616);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(617);
						match(T__19);
						setState(618);
						expr();
						setState(619);
						match(T__20);
						}
						break;
					case 2:
						{
						_localctx = new FuncCallContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(621);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(622);
						match(T__47);
						setState(623);
						function_argument_list();
						setState(624);
						match(T__48);
						}
						break;
					case 3:
						{
						_localctx = new MemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(626);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(627);
						match(T__60);
						setState(629);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(628);
							match(TEMPLATE);
							}
						}

						{
						setState(631);
						identifier();
						}
						}
						break;
					case 4:
						{
						_localctx = new PtrMemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(632);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(633);
						match(T__46);
						setState(635);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(634);
							match(TEMPLATE);
							}
						}

						{
						setState(637);
						identifier();
						}
						}
						break;
					case 5:
						{
						_localctx = new IncDecOpContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(638);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(639);
						inc_dec();
						}
						break;
					case 6:
						{
						_localctx = new InstanceContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(640);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(641);
						match(T__61);
						setState(642);
						expr();
						setState(648);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
						case 1:
							{
							setState(643);
							match(T__6);
							setState(645);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
							case 1:
								{
								setState(644);
								function_argument_list();
								}
								break;
							}
							setState(647);
							match(T__7);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(654);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Function_argument_listContext extends ParserRuleContext {
		public List<Function_argumentContext> function_argument() {
			return getRuleContexts(Function_argumentContext.class);
		}
		public Function_argumentContext function_argument(int i) {
			return getRuleContext(Function_argumentContext.class,i);
		}
		public Function_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterFunction_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitFunction_argument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitFunction_argument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_argument_listContext function_argument_list() throws RecognitionException {
		Function_argument_listContext _localctx = new Function_argument_listContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_function_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__42) | (1L << T__43) | (1L << T__47) | (1L << T__51) | (1L << T__59))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (ALPHA_NUMERIC - 91)) | (1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)) | (1L << (BINARY_LITERAL - 91)) | (1L << (FLOATING_POINT_LITERAL - 91)) | (1L << (CHAR - 91)) | (1L << (STRING - 91)) | (1L << (MULTILINE_STRING - 91)))) != 0)) {
				{
				setState(655);
				function_argument();
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__44) {
					{
					{
					setState(656);
					match(T__44);
					setState(657);
					function_argument();
					}
					}
					setState(662);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class Function_argumentContext extends ParserRuleContext {
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(CommonParser.COMMENT, 0); }
		public TerminalNode LINE_COMMENT() { return getToken(CommonParser.LINE_COMMENT, 0); }
		public Function_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterFunction_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitFunction_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitFunction_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_argumentContext function_argument() throws RecognitionException {
		Function_argumentContext _localctx = new Function_argumentContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_function_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			assign_expr();
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT || _la==LINE_COMMENT) {
				{
				setState(666);
				_la = _input.LA(1);
				if ( !(_la==COMMENT || _la==LINE_COMMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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

	public static class Primary_expressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(CommonParser.COMMENT, 0); }
		public TerminalNode LINE_COMMENT() { return getToken(CommonParser.LINE_COMMENT, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitPrimary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitPrimary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_primary_expression);
		int _la;
		try {
			setState(681);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(669);
				identifier();
				setState(671);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(670);
					_la = _input.LA(1);
					if ( !(_la==COMMENT || _la==LINE_COMMENT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case BINARY_LITERAL:
			case FLOATING_POINT_LITERAL:
			case CHAR:
			case STRING:
			case MULTILINE_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(673);
				constant();
				setState(675);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(674);
					_la = _input.LA(1);
					if ( !(_la==COMMENT || _la==LINE_COMMENT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 3);
				{
				setState(677);
				match(T__47);
				setState(678);
				expr();
				setState(679);
				match(T__48);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return template_decl_param_list_sempred((Template_decl_param_listContext)_localctx, predIndex);
		case 16:
			return template_args_param_list_sempred((Template_args_param_listContext)_localctx, predIndex);
		case 65:
			return postfix_expression_sempred((Postfix_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean template_decl_param_list_sempred(Template_decl_param_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean template_args_param_list_sempred(Template_args_param_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfix_expression_sempred(Postfix_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001r\u02ac\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u009a\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00c4\b\u0006\u0001\u0007\u0001\u0007\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0003\t\u00cd\b\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00d7\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u00dc\b\n\n\n\f\n\u00df\t\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u00e5\b\u000b\u0004\u000b\u00e7\b"+
		"\u000b\u000b\u000b\f\u000b\u00e8\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0003\f\u00ef\b\f\u0001\f\u0003\f\u00f2\b\f\u0001\f\u0003\f\u00f5\b"+
		"\f\u0001\f\u0003\f\u00f8\b\f\u0001\r\u0001\r\u0001\u000e\u0004\u000e\u00fd"+
		"\b\u000e\u000b\u000e\f\u000e\u00fe\u0001\u000e\u0003\u000e\u0102\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u0106\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u0110\b\u0010\n\u0010\f\u0010\u0113\t\u0010\u0001\u0011\u0003"+
		"\u0011\u0116\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u011a\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0005\u001d\u0135\b\u001d\n\u001d\f\u001d\u0138\t\u001d\u0001"+
		"\u001d\u0003\u001d\u013b\b\u001d\u0001\u001d\u0003\u001d\u013e\b\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0003\u001f\u0143\b\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u0147\b\u001f\u0004\u001f\u0149\b\u001f\u000b"+
		"\u001f\f\u001f\u014a\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"#\u0005#\u0154\b#\n#\f#\u0157\t#\u0001#\u0001#\u0003#\u015b\b#\u0001#"+
		"\u0003#\u015e\b#\u0001#\u0003#\u0161\b#\u0001#\u0003#\u0164\b#\u0001#"+
		"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0005%\u016f"+
		"\b%\n%\f%\u0172\t%\u0001%\u0001%\u0004%\u0176\b%\u000b%\f%\u0177\u0003"+
		"%\u017a\b%\u0001&\u0003&\u017d\b&\u0001&\u0003&\u0180\b&\u0001&\u0001"+
		"&\u0003&\u0184\b&\u0001\'\u0005\'\u0187\b\'\n\'\f\'\u018a\t\'\u0001\'"+
		"\u0001\'\u0001\'\u0003\'\u018f\b\'\u0001\'\u0001\'\u0003\'\u0193\b\'\u0001"+
		"\'\u0001\'\u0003\'\u0197\b\'\u0001\'\u0001\'\u0001\'\u0003\'\u019c\b\'"+
		"\u0005\'\u019e\b\'\n\'\f\'\u01a1\t\'\u0001\'\u0003\'\u01a4\b\'\u0001\'"+
		"\u0001\'\u0001\'\u0003\'\u01a9\b\'\u0001(\u0001(\u0003(\u01ad\b(\u0004"+
		"(\u01af\b(\u000b(\f(\u01b0\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001*\u0001*\u0001*\u0003*\u01bd\b*\u0001+\u0001+\u0001+\u0001+\u0003"+
		"+\u01c3\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u01cc"+
		"\b,\u0001-\u0001-\u0001-\u0003-\u01d1\b-\u0001.\u0001.\u0001.\u0003.\u01d6"+
		"\b.\u0001/\u0001/\u0001/\u0003/\u01db\b/\u00010\u00010\u00010\u00030\u01e0"+
		"\b0\u00011\u00011\u00011\u00031\u01e5\b1\u00012\u00012\u00012\u00012\u0003"+
		"2\u01eb\b2\u00013\u00013\u00013\u00013\u00033\u01f1\b3\u00014\u00014\u0001"+
		"4\u00034\u01f6\b4\u00015\u00015\u00015\u00035\u01fb\b5\u00016\u00016\u0001"+
		"6\u00036\u0200\b6\u00017\u00017\u00017\u00017\u00017\u00017\u00037\u0208"+
		"\b7\u00018\u00018\u00058\u020c\b8\n8\f8\u020f\t8\u00019\u00019\u00019"+
		"\u00019\u00019\u00019\u00019\u00019\u00019\u00059\u021a\b9\n9\f9\u021d"+
		"\t9\u00039\u021f\b9\u00019\u00039\u0222\b9\u0001:\u0003:\u0225\b:\u0001"+
		":\u0001:\u0001:\u0001:\u0003:\u022b\b:\u0001:\u0001:\u0001:\u0003:\u0230"+
		"\b:\u0001:\u0001:\u0001:\u0001:\u0003:\u0236\b:\u0001:\u0001:\u0001:\u0003"+
		":\u023b\b:\u0001:\u0001:\u0001:\u0001:\u0003:\u0241\b:\u0001:\u0001:\u0003"+
		":\u0245\b:\u0001;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0003<\u0257\b<\u0001"+
		"=\u0001=\u0001>\u0001>\u0005>\u025d\b>\n>\f>\u0260\t>\u0001?\u0001?\u0001"+
		"@\u0001@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0003A\u0276\bA\u0001"+
		"A\u0001A\u0001A\u0001A\u0003A\u027c\bA\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0003A\u0286\bA\u0001A\u0003A\u0289\bA\u0005A\u028b"+
		"\bA\nA\fA\u028e\tA\u0001B\u0001B\u0001B\u0005B\u0293\bB\nB\fB\u0296\t"+
		"B\u0003B\u0298\bB\u0001C\u0001C\u0003C\u029c\bC\u0001D\u0001D\u0003D\u02a0"+
		"\bD\u0001D\u0001D\u0003D\u02a4\bD\u0001D\u0001D\u0001D\u0001D\u0003D\u02aa"+
		"\bD\u0001D\u0000\u0003\u0014 \u0082E\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u0000\u001c"+
		"\u0001\u0000\u0001\u0006\u0001\u0000\u0007\n\u0001\u0000fm\u0002\u0000"+
		"\u000b\u000eQQ\u0001\u0000\u0001\u0002\u0001\u0000\u000f\u0012\u0002\u0000"+
		"\u0013\u0013[[\u0002\u0000\u001a\"%&\u0001\u0000\'(\u0002\u0000\u0012"+
		"\u001222\u0001\u000001\u0003\u0000\u0014\u001501`a\u0002\u00000133\u0002"+
		"\u0000\u0007\b01\u0001\u0000`a\u0001\u0000\u0014\u0015\u0002\u0000\u0014"+
		"\u001533\u0002\u0000--33\u0005\u0000\u0014\u0015--0133`a\u0001\u0000f"+
		"h\u0002\u0000\u0012\u001279\u0001\u0000\\]\u0004\u0000LLOOWW__\u0001\u0000"+
		"#$\u0001\u0000\u0003\u0004\u0002\u0000\u0002\u0002\u0016\u0017\u0001\u0000"+
		"+,\u0001\u0000no\u02ec\u0000\u008a\u0001\u0000\u0000\u0000\u0002\u008c"+
		"\u0001\u0000\u0000\u0000\u0004\u008e\u0001\u0000\u0000\u0000\u0006\u0090"+
		"\u0001\u0000\u0000\u0000\b\u0092\u0001\u0000\u0000\u0000\n\u0094\u0001"+
		"\u0000\u0000\u0000\f\u00c3\u0001\u0000\u0000\u0000\u000e\u00c5\u0001\u0000"+
		"\u0000\u0000\u0010\u00c7\u0001\u0000\u0000\u0000\u0012\u00c9\u0001\u0000"+
		"\u0000\u0000\u0014\u00d6\u0001\u0000\u0000\u0000\u0016\u00e0\u0001\u0000"+
		"\u0000\u0000\u0018\u00f1\u0001\u0000\u0000\u0000\u001a\u00f9\u0001\u0000"+
		"\u0000\u0000\u001c\u00fc\u0001\u0000\u0000\u0000\u001e\u0103\u0001\u0000"+
		"\u0000\u0000 \u0109\u0001\u0000\u0000\u0000\"\u0115\u0001\u0000\u0000"+
		"\u0000$\u011b\u0001\u0000\u0000\u0000&\u011d\u0001\u0000\u0000\u0000("+
		"\u011f\u0001\u0000\u0000\u0000*\u0121\u0001\u0000\u0000\u0000,\u0123\u0001"+
		"\u0000\u0000\u0000.\u0125\u0001\u0000\u0000\u00000\u0127\u0001\u0000\u0000"+
		"\u00002\u0129\u0001\u0000\u0000\u00004\u012b\u0001\u0000\u0000\u00006"+
		"\u012d\u0001\u0000\u0000\u00008\u012f\u0001\u0000\u0000\u0000:\u013d\u0001"+
		"\u0000\u0000\u0000<\u013f\u0001\u0000\u0000\u0000>\u0148\u0001\u0000\u0000"+
		"\u0000@\u014c\u0001\u0000\u0000\u0000B\u014e\u0001\u0000\u0000\u0000D"+
		"\u0150\u0001\u0000\u0000\u0000F\u0155\u0001\u0000\u0000\u0000H\u0168\u0001"+
		"\u0000\u0000\u0000J\u0179\u0001\u0000\u0000\u0000L\u017c\u0001\u0000\u0000"+
		"\u0000N\u01a8\u0001\u0000\u0000\u0000P\u01ae\u0001\u0000\u0000\u0000R"+
		"\u01b2\u0001\u0000\u0000\u0000T\u01b9\u0001\u0000\u0000\u0000V\u01be\u0001"+
		"\u0000\u0000\u0000X\u01cb\u0001\u0000\u0000\u0000Z\u01cd\u0001\u0000\u0000"+
		"\u0000\\\u01d2\u0001\u0000\u0000\u0000^\u01d7\u0001\u0000\u0000\u0000"+
		"`\u01dc\u0001\u0000\u0000\u0000b\u01e1\u0001\u0000\u0000\u0000d\u01e6"+
		"\u0001\u0000\u0000\u0000f\u01ec\u0001\u0000\u0000\u0000h\u01f2\u0001\u0000"+
		"\u0000\u0000j\u01f7\u0001\u0000\u0000\u0000l\u01fc\u0001\u0000\u0000\u0000"+
		"n\u0207\u0001\u0000\u0000\u0000p\u0209\u0001\u0000\u0000\u0000r\u0221"+
		"\u0001\u0000\u0000\u0000t\u0244\u0001\u0000\u0000\u0000v\u0246\u0001\u0000"+
		"\u0000\u0000x\u0256\u0001\u0000\u0000\u0000z\u0258\u0001\u0000\u0000\u0000"+
		"|\u025a\u0001\u0000\u0000\u0000~\u0261\u0001\u0000\u0000\u0000\u0080\u0263"+
		"\u0001\u0000\u0000\u0000\u0082\u0265\u0001\u0000\u0000\u0000\u0084\u0297"+
		"\u0001\u0000\u0000\u0000\u0086\u0299\u0001\u0000\u0000\u0000\u0088\u02a9"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0007\u0000\u0000\u0000\u008b\u0001"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0007\u0001\u0000\u0000\u008d\u0003"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0007\u0002\u0000\u0000\u008f\u0005"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0007\u0003\u0000\u0000\u0091\u0007"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0007\u0004\u0000\u0000\u0093\t\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0007\u0005\u0000\u0000\u0095\u000b\u0001"+
		"\u0000\u0000\u0000\u0096\u0099\u0007\u0006\u0000\u0000\u0097\u0098\u0005"+
		"\u0014\u0000\u0000\u0098\u009a\u0005\u0015\u0000\u0000\u0099\u0097\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u00c4\u0001"+
		"\u0000\u0000\u0000\u009b\u00c4\u0005\u0003\u0000\u0000\u009c\u00c4\u0005"+
		"\u0004\u0000\u0000\u009d\u00c4\u0005\u0002\u0000\u0000\u009e\u00c4\u0005"+
		"\u0016\u0000\u0000\u009f\u00c4\u0005\u0017\u0000\u0000\u00a0\u00c4\u0005"+
		"\u0018\u0000\u0000\u00a1\u00c4\u0005\u0001\u0000\u0000\u00a2\u00c4\u0005"+
		"\u0019\u0000\u0000\u00a3\u00c4\u0005\u0005\u0000\u0000\u00a4\u00c4\u0005"+
		"\u0006\u0000\u0000\u00a5\u00c4\u0005\u001a\u0000\u0000\u00a6\u00c4\u0005"+
		"\u0007\u0000\u0000\u00a7\u00c4\u0005\b\u0000\u0000\u00a8\u00c4\u0005\u001b"+
		"\u0000\u0000\u00a9\u00c4\u0005\u001c\u0000\u0000\u00aa\u00c4\u0005\u001d"+
		"\u0000\u0000\u00ab\u00c4\u0005\u001e\u0000\u0000\u00ac\u00c4\u0005\u001f"+
		"\u0000\u0000\u00ad\u00c4\u0005 \u0000\u0000\u00ae\u00c4\u0005!\u0000\u0000"+
		"\u00af\u00c4\u0005\"\u0000\u0000\u00b0\u00c4\u0005#\u0000\u0000\u00b1"+
		"\u00c4\u0005$\u0000\u0000\u00b2\u00c4\u0005%\u0000\u0000\u00b3\u00c4\u0005"+
		"&\u0000\u0000\u00b4\u00c4\u0005\'\u0000\u0000\u00b5\u00c4\u0005(\u0000"+
		"\u0000\u00b6\u00c4\u0005\t\u0000\u0000\u00b7\u00c4\u0005\n\u0000\u0000"+
		"\u00b8\u00c4\u0005)\u0000\u0000\u00b9\u00c4\u0005*\u0000\u0000\u00ba\u00c4"+
		"\u0005+\u0000\u0000\u00bb\u00c4\u0005,\u0000\u0000\u00bc\u00c4\u0005-"+
		"\u0000\u0000\u00bd\u00c4\u0005.\u0000\u0000\u00be\u00c4\u0005/\u0000\u0000"+
		"\u00bf\u00c0\u00050\u0000\u0000\u00c0\u00c4\u00051\u0000\u0000\u00c1\u00c2"+
		"\u0005\u0014\u0000\u0000\u00c2\u00c4\u0005\u0015\u0000\u0000\u00c3\u0096"+
		"\u0001\u0000\u0000\u0000\u00c3\u009b\u0001\u0000\u0000\u0000\u00c3\u009c"+
		"\u0001\u0000\u0000\u0000\u00c3\u009d\u0001\u0000\u0000\u0000\u00c3\u009e"+
		"\u0001\u0000\u0000\u0000\u00c3\u009f\u0001\u0000\u0000\u0000\u00c3\u00a0"+
		"\u0001\u0000\u0000\u0000\u00c3\u00a1\u0001\u0000\u0000\u0000\u00c3\u00a2"+
		"\u0001\u0000\u0000\u0000\u00c3\u00a3\u0001\u0000\u0000\u0000\u00c3\u00a4"+
		"\u0001\u0000\u0000\u0000\u00c3\u00a5\u0001\u0000\u0000\u0000\u00c3\u00a6"+
		"\u0001\u0000\u0000\u0000\u00c3\u00a7\u0001\u0000\u0000\u0000\u00c3\u00a8"+
		"\u0001\u0000\u0000\u0000\u00c3\u00a9\u0001\u0000\u0000\u0000\u00c3\u00aa"+
		"\u0001\u0000\u0000\u0000\u00c3\u00ab\u0001\u0000\u0000\u0000\u00c3\u00ac"+
		"\u0001\u0000\u0000\u0000\u00c3\u00ad\u0001\u0000\u0000\u0000\u00c3\u00ae"+
		"\u0001\u0000\u0000\u0000\u00c3\u00af\u0001\u0000\u0000\u0000\u00c3\u00b0"+
		"\u0001\u0000\u0000\u0000\u00c3\u00b1\u0001\u0000\u0000\u0000\u00c3\u00b2"+
		"\u0001\u0000\u0000\u0000\u00c3\u00b3\u0001\u0000\u0000\u0000\u00c3\u00b4"+
		"\u0001\u0000\u0000\u0000\u00c3\u00b5\u0001\u0000\u0000\u0000\u00c3\u00b6"+
		"\u0001\u0000\u0000\u0000\u00c3\u00b7\u0001\u0000\u0000\u0000\u00c3\u00b8"+
		"\u0001\u0000\u0000\u0000\u00c3\u00b9\u0001\u0000\u0000\u0000\u00c3\u00ba"+
		"\u0001\u0000\u0000\u0000\u00c3\u00bb\u0001\u0000\u0000\u0000\u00c3\u00bc"+
		"\u0001\u0000\u0000\u0000\u00c3\u00bd\u0001\u0000\u0000\u0000\u00c3\u00be"+
		"\u0001\u0000\u0000\u0000\u00c3\u00bf\u0001\u0000\u0000\u0000\u00c3\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c4\r\u0001\u0000\u0000\u0000\u00c5\u00c6\u0007"+
		"\u0007\u0000\u0000\u00c6\u000f\u0001\u0000\u0000\u0000\u00c7\u00c8\u0007"+
		"\b\u0000\u0000\u00c8\u0011\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005Z"+
		"\u0000\u0000\u00ca\u00cc\u0005\u0007\u0000\u0000\u00cb\u00cd\u0003\u0014"+
		"\n\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\b\u0000\u0000"+
		"\u00cf\u0013\u0001\u0000\u0000\u0000\u00d0\u00d1\u0006\n\uffff\uffff\u0000"+
		"\u00d1\u00d2\u0003\u0016\u000b\u0000\u00d2\u00d3\u0003\u001a\r\u0000\u00d3"+
		"\u00d4\u0003\u001c\u000e\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d7\u0003\u0018\f\u0000\u00d6\u00d0\u0001\u0000\u0000\u0000\u00d6\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d7\u00dd\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\n\u0001\u0000\u0000\u00d9\u00da\u0005-\u0000\u0000\u00da\u00dc\u0003"+
		"\u0018\f\u0000\u00db\u00d8\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000"+
		"\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000"+
		"\u0000\u0000\u00de\u0015\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0005Z\u0000\u0000\u00e1\u00e6\u0005\u0007\u0000"+
		"\u0000\u00e2\u00e4\u0003\u001a\r\u0000\u00e3\u00e5\u0005-\u0000\u0000"+
		"\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0005\b\u0000\u0000\u00eb\u0017\u0001\u0000\u0000\u0000\u00ec"+
		"\u00f2\u0003\u001a\r\u0000\u00ed\u00ef\u0005P\u0000\u0000\u00ee\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f2\u0003:\u001d\u0000\u00f1\u00ec\u0001"+
		"\u0000\u0000\u0000\u00f1\u00ee\u0001\u0000\u0000\u0000\u00f2\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f5\u0003\u001c\u000e\u0000\u00f4\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f8\u0003\b\u0004\u0000\u00f7\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u0019\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fa\u0007\t\u0000\u0000\u00fa\u001b\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fd\u0005_\u0000\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0101\u0001\u0000\u0000\u0000"+
		"\u0100\u0102\u0005q\u0000\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0101"+
		"\u0102\u0001\u0000\u0000\u0000\u0102\u001d\u0001\u0000\u0000\u0000\u0103"+
		"\u0105\u0005\u0007\u0000\u0000\u0104\u0106\u0003 \u0010\u0000\u0105\u0104"+
		"\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0107"+
		"\u0001\u0000\u0000\u0000\u0107\u0108\u0005\b\u0000\u0000\u0108\u001f\u0001"+
		"\u0000\u0000\u0000\u0109\u010a\u0006\u0010\uffff\uffff\u0000\u010a\u010b"+
		"\u0003\"\u0011\u0000\u010b\u0111\u0001\u0000\u0000\u0000\u010c\u010d\n"+
		"\u0001\u0000\u0000\u010d\u010e\u0005-\u0000\u0000\u010e\u0110\u0003\""+
		"\u0011\u0000\u010f\u010c\u0001\u0000\u0000\u0000\u0110\u0113\u0001\u0000"+
		"\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000"+
		"\u0000\u0000\u0112!\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000"+
		"\u0000\u0114\u0116\u0005P\u0000\u0000\u0115\u0114\u0001\u0000\u0000\u0000"+
		"\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000"+
		"\u0117\u0119\u0003P(\u0000\u0118\u011a\u0003\b\u0004\u0000\u0119\u0118"+
		"\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a#\u0001"+
		"\u0000\u0000\u0000\u011b\u011c\b\n\u0000\u0000\u011c%\u0001\u0000\u0000"+
		"\u0000\u011d\u011e\b\u000b\u0000\u0000\u011e\'\u0001\u0000\u0000\u0000"+
		"\u011f\u0120\b\f\u0000\u0000\u0120)\u0001\u0000\u0000\u0000\u0121\u0122"+
		"\b\r\u0000\u0000\u0122+\u0001\u0000\u0000\u0000\u0123\u0124\b\u000e\u0000"+
		"\u0000\u0124-\u0001\u0000\u0000\u0000\u0125\u0126\b\u000f\u0000\u0000"+
		"\u0126/\u0001\u0000\u0000\u0000\u0127\u0128\b\u0010\u0000\u0000\u0128"+
		"1\u0001\u0000\u0000\u0000\u0129\u012a\b\u0011\u0000\u0000\u012a3\u0001"+
		"\u0000\u0000\u0000\u012b\u012c\b\u0012\u0000\u0000\u012c5\u0001\u0000"+
		"\u0000\u0000\u012d\u012e\b\u000b\u0000\u0000\u012e7\u0001\u0000\u0000"+
		"\u0000\u012f\u0130\t\u0000\u0000\u0000\u01309\u0001\u0000\u0000\u0000"+
		"\u0131\u0136\u0005_\u0000\u0000\u0132\u0133\u00054\u0000\u0000\u0133\u0135"+
		"\u0005_\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0135\u0138\u0001"+
		"\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0136\u0137\u0001"+
		"\u0000\u0000\u0000\u0137\u013a\u0001\u0000\u0000\u0000\u0138\u0136\u0001"+
		"\u0000\u0000\u0000\u0139\u013b\u00055\u0000\u0000\u013a\u0139\u0001\u0000"+
		"\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013e\u0001\u0000"+
		"\u0000\u0000\u013c\u013e\u0003\n\u0005\u0000\u013d\u0131\u0001\u0000\u0000"+
		"\u0000\u013d\u013c\u0001\u0000\u0000\u0000\u013e;\u0001\u0000\u0000\u0000"+
		"\u013f\u0140\u0007\u0013\u0000\u0000\u0140=\u0001\u0000\u0000\u0000\u0141"+
		"\u0143\u0005P\u0000\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0142\u0143"+
		"\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0146"+
		"\u0003\b\u0004\u0000\u0145\u0147\u00056\u0000\u0000\u0146\u0145\u0001"+
		"\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0149\u0001"+
		"\u0000\u0000\u0000\u0148\u0142\u0001\u0000\u0000\u0000\u0149\u014a\u0001"+
		"\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014a\u014b\u0001"+
		"\u0000\u0000\u0000\u014b?\u0001\u0000\u0000\u0000\u014c\u014d\u0003>\u001f"+
		"\u0000\u014dA\u0001\u0000\u0000\u0000\u014e\u014f\u0005)\u0000\u0000\u014f"+
		"C\u0001\u0000\u0000\u0000\u0150\u0151\u0007\u0014\u0000\u0000\u0151E\u0001"+
		"\u0000\u0000\u0000\u0152\u0154\u0003\u0012\t\u0000\u0153\u0152\u0001\u0000"+
		"\u0000\u0000\u0154\u0157\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000"+
		"\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0158\u0001\u0000"+
		"\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0158\u015a\u0003D\""+
		"\u0000\u0159\u015b\u0003R)\u0000\u015a\u0159\u0001\u0000\u0000\u0000\u015a"+
		"\u015b\u0001\u0000\u0000\u0000\u015b\u015d\u0001\u0000\u0000\u0000\u015c"+
		"\u015e\u0003H$\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015d\u015e\u0001"+
		"\u0000\u0000\u0000\u015e\u0160\u0001\u0000\u0000\u0000\u015f\u0161\u0003"+
		"\u001e\u000f\u0000\u0160\u015f\u0001\u0000\u0000\u0000\u0160\u0161\u0001"+
		"\u0000\u0000\u0000\u0161\u0163\u0001\u0000\u0000\u0000\u0162\u0164\u0003"+
		"J%\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000"+
		"\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0166\u0005`\u0000\u0000"+
		"\u0166\u0167\u0006#\uffff\uffff\u0000\u0167G\u0001\u0000\u0000\u0000\u0168"+
		"\u0169\u0003:\u001d\u0000\u0169I\u0001\u0000\u0000\u0000\u016a\u016b\u0005"+
		":\u0000\u0000\u016b\u0170\u0003L&\u0000\u016c\u016d\u0005-\u0000\u0000"+
		"\u016d\u016f\u0003L&\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016f\u0172"+
		"\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0170\u0171"+
		"\u0001\u0000\u0000\u0000\u0171\u017a\u0001\u0000\u0000\u0000\u0172\u0170"+
		"\u0001\u0000\u0000\u0000\u0173\u0174\u0007\u0015\u0000\u0000\u0174\u0176"+
		"\u0003L&\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000"+
		"\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000"+
		"\u0000\u0000\u0178\u017a\u0001\u0000\u0000\u0000\u0179\u016a\u0001\u0000"+
		"\u0000\u0000\u0179\u0175\u0001\u0000\u0000\u0000\u017aK\u0001\u0000\u0000"+
		"\u0000\u017b\u017d\u0005Q\u0000\u0000\u017c\u017b\u0001\u0000\u0000\u0000"+
		"\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u017f\u0001\u0000\u0000\u0000"+
		"\u017e\u0180\u0003\n\u0005\u0000\u017f\u017e\u0001\u0000\u0000\u0000\u017f"+
		"\u0180\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181"+
		"\u0183\u0003:\u001d\u0000\u0182\u0184\u0003\u001e\u000f\u0000\u0183\u0182"+
		"\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184M\u0001"+
		"\u0000\u0000\u0000\u0185\u0187\u0005P\u0000\u0000\u0186\u0185\u0001\u0000"+
		"\u0000\u0000\u0187\u018a\u0001\u0000\u0000\u0000\u0188\u0186\u0001\u0000"+
		"\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018e\u0001\u0000"+
		"\u0000\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018b\u018f\u0003D\""+
		"\u0000\u018c\u018f\u0005M\u0000\u0000\u018d\u018f\u0005N\u0000\u0000\u018e"+
		"\u018b\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018e"+
		"\u018d\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f"+
		"\u0190\u0001\u0000\u0000\u0000\u0190\u0192\u0003P(\u0000\u0191\u0193\u0003"+
		"\u001e\u000f\u0000\u0192\u0191\u0001\u0000\u0000\u0000\u0192\u0193\u0001"+
		"\u0000\u0000\u0000\u0193\u0196\u0001\u0000\u0000\u0000\u0194\u0195\u0005"+
		"\u0014\u0000\u0000\u0195\u0197\u0005\u0015\u0000\u0000\u0196\u0194\u0001"+
		"\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u019f\u0001"+
		"\u0000\u0000\u0000\u0198\u0199\u00054\u0000\u0000\u0199\u019b\u0003P("+
		"\u0000\u019a\u019c\u0003\u001e\u000f\u0000\u019b\u019a\u0001\u0000\u0000"+
		"\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019e\u0001\u0000\u0000"+
		"\u0000\u019d\u0198\u0001\u0000\u0000\u0000\u019e\u01a1\u0001\u0000\u0000"+
		"\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000"+
		"\u0000\u01a0\u01a3\u0001\u0000\u0000\u0000\u01a1\u019f\u0001\u0000\u0000"+
		"\u0000\u01a2\u01a4\u0005P\u0000\u0000\u01a3\u01a2\u0001\u0000\u0000\u0000"+
		"\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a9\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a9\u0003\u0082A\u0000\u01a6\u01a9\u0005M\u0000\u0000\u01a7\u01a9"+
		"\u0005N\u0000\u0000\u01a8\u0188\u0001\u0000\u0000\u0000\u01a8\u01a5\u0001"+
		"\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a8\u01a7\u0001"+
		"\u0000\u0000\u0000\u01a9O\u0001\u0000\u0000\u0000\u01aa\u01ac\u0007\u0016"+
		"\u0000\u0000\u01ab\u01ad\u0005q\u0000\u0000\u01ac\u01ab\u0001\u0000\u0000"+
		"\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad\u01af\u0001\u0000\u0000"+
		"\u0000\u01ae\u01aa\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000"+
		"\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b1Q\u0001\u0000\u0000\u0000\u01b2\u01b3\u0005^\u0000\u0000\u01b3"+
		"\u01b4\u00050\u0000\u0000\u01b4\u01b5\u00050\u0000\u0000\u01b5\u01b6\u0003"+
		":\u001d\u0000\u01b6\u01b7\u00051\u0000\u0000\u01b7\u01b8\u00051\u0000"+
		"\u0000\u01b8S\u0001\u0000\u0000\u0000\u01b9\u01bc\u0003V+\u0000\u01ba"+
		"\u01bb\u0005-\u0000\u0000\u01bb\u01bd\u0003T*\u0000\u01bc\u01ba\u0001"+
		"\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bdU\u0001\u0000"+
		"\u0000\u0000\u01be\u01c2\u0003X,\u0000\u01bf\u01c0\u0003\u000e\u0007\u0000"+
		"\u01c0\u01c1\u0003V+\u0000\u01c1\u01c3\u0001\u0000\u0000\u0000\u01c2\u01bf"+
		"\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3W\u0001"+
		"\u0000\u0000\u0000\u01c4\u01cc\u0003Z-\u0000\u01c5\u01c6\u0003Z-\u0000"+
		"\u01c6\u01c7\u0005;\u0000\u0000\u01c7\u01c8\u0003T*\u0000\u01c8\u01c9"+
		"\u0005:\u0000\u0000\u01c9\u01ca\u0003X,\u0000\u01ca\u01cc\u0001\u0000"+
		"\u0000\u0000\u01cb\u01c4\u0001\u0000\u0000\u0000\u01cb\u01c5\u0001\u0000"+
		"\u0000\u0000\u01ccY\u0001\u0000\u0000\u0000\u01cd\u01d0\u0003\\.\u0000"+
		"\u01ce\u01cf\u0005*\u0000\u0000\u01cf\u01d1\u0003Z-\u0000\u01d0\u01ce"+
		"\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1[\u0001"+
		"\u0000\u0000\u0000\u01d2\u01d5\u0003^/\u0000\u01d3\u01d4\u0005)\u0000"+
		"\u0000\u01d4\u01d6\u0003\\.\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000"+
		"\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6]\u0001\u0000\u0000\u0000\u01d7"+
		"\u01da\u0003`0\u0000\u01d8\u01d9\u0005\u0019\u0000\u0000\u01d9\u01db\u0003"+
		"^/\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000"+
		"\u0000\u01db_\u0001\u0000\u0000\u0000\u01dc\u01df\u0003b1\u0000\u01dd"+
		"\u01de\u0005\u0018\u0000\u0000\u01de\u01e0\u0003`0\u0000\u01df\u01dd\u0001"+
		"\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0a\u0001\u0000"+
		"\u0000\u0000\u01e1\u01e4\u0003d2\u0000\u01e2\u01e3\u0005\u0001\u0000\u0000"+
		"\u01e3\u01e5\u0003b1\u0000\u01e4\u01e2\u0001\u0000\u0000\u0000\u01e4\u01e5"+
		"\u0001\u0000\u0000\u0000\u01e5c\u0001\u0000\u0000\u0000\u01e6\u01ea\u0003"+
		"f3\u0000\u01e7\u01e8\u0003\u0010\b\u0000\u01e8\u01e9\u0003d2\u0000\u01e9"+
		"\u01eb\u0001\u0000\u0000\u0000\u01ea\u01e7\u0001\u0000\u0000\u0000\u01ea"+
		"\u01eb\u0001\u0000\u0000\u0000\u01ebe\u0001\u0000\u0000\u0000\u01ec\u01f0"+
		"\u0003h4\u0000\u01ed\u01ee\u0003\u0002\u0001\u0000\u01ee\u01ef\u0003f"+
		"3\u0000\u01ef\u01f1\u0001\u0000\u0000\u0000\u01f0\u01ed\u0001\u0000\u0000"+
		"\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1g\u0001\u0000\u0000\u0000"+
		"\u01f2\u01f5\u0003j5\u0000\u01f3\u01f4\u0007\u0017\u0000\u0000\u01f4\u01f6"+
		"\u0003h4\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000"+
		"\u0000\u0000\u01f6i\u0001\u0000\u0000\u0000\u01f7\u01fa\u0003l6\u0000"+
		"\u01f8\u01f9\u0007\u0018\u0000\u0000\u01f9\u01fb\u0003j5\u0000\u01fa\u01f8"+
		"\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001\u0000\u0000\u0000\u01fbk\u0001"+
		"\u0000\u0000\u0000\u01fc\u01ff\u0003n7\u0000\u01fd\u01fe\u0007\u0019\u0000"+
		"\u0000\u01fe\u0200\u0003l6\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u01ff"+
		"\u0200\u0001\u0000\u0000\u0000\u0200m\u0001\u0000\u0000\u0000\u0201\u0202"+
		"\u00050\u0000\u0000\u0202\u0203\u0003p8\u0000\u0203\u0204\u00051\u0000"+
		"\u0000\u0204\u0205\u0003n7\u0000\u0205\u0208\u0001\u0000\u0000\u0000\u0206"+
		"\u0208\u0003r9\u0000\u0207\u0201\u0001\u0000\u0000\u0000\u0207\u0206\u0001"+
		"\u0000\u0000\u0000\u0208o\u0001\u0000\u0000\u0000\u0209\u020d\u0003N\'"+
		"\u0000\u020a\u020c\u0003\b\u0004\u0000\u020b\u020a\u0001\u0000\u0000\u0000"+
		"\u020c\u020f\u0001\u0000\u0000\u0000\u020d\u020b\u0001\u0000\u0000\u0000"+
		"\u020d\u020e\u0001\u0000\u0000\u0000\u020eq\u0001\u0000\u0000\u0000\u020f"+
		"\u020d\u0001\u0000\u0000\u0000\u0210\u0211\u0003\u0080@\u0000\u0211\u0212"+
		"\u0003n7\u0000\u0212\u0222\u0001\u0000\u0000\u0000\u0213\u0222\u0003t"+
		":\u0000\u0214\u0222\u0003v;\u0000\u0215\u0222\u0003x<\u0000\u0216\u0217"+
		"\u0003:\u001d\u0000\u0217\u0218\u0005/\u0000\u0000\u0218\u021a\u0001\u0000"+
		"\u0000\u0000\u0219\u0216\u0001\u0000\u0000\u0000\u021a\u021d\u0001\u0000"+
		"\u0000\u0000\u021b\u0219\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000"+
		"\u0000\u0000\u021c\u021f\u0001\u0000\u0000\u0000\u021d\u021b\u0001\u0000"+
		"\u0000\u0000\u021e\u021b\u0001\u0000\u0000\u0000\u021e\u021f\u0001\u0000"+
		"\u0000\u0000\u021f\u0220\u0001\u0000\u0000\u0000\u0220\u0222\u0003\u0082"+
		"A\u0000\u0221\u0210\u0001\u0000\u0000\u0000\u0221\u0213\u0001\u0000\u0000"+
		"\u0000\u0221\u0214\u0001\u0000\u0000\u0000\u0221\u0215\u0001\u0000\u0000"+
		"\u0000\u0221\u021e\u0001\u0000\u0000\u0000\u0222s\u0001\u0000\u0000\u0000"+
		"\u0223\u0225\u00054\u0000\u0000\u0224\u0223\u0001\u0000\u0000\u0000\u0224"+
		"\u0225\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000\u0000\u0226"+
		"\u0227\u0005[\u0000\u0000\u0227\u0228\u0003N\'\u0000\u0228\u022a\u0005"+
		"\u0014\u0000\u0000\u0229\u022b\u0003X,\u0000\u022a\u0229\u0001\u0000\u0000"+
		"\u0000\u022a\u022b\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000"+
		"\u0000\u022c\u022d\u0005\u0015\u0000\u0000\u022d\u0245\u0001\u0000\u0000"+
		"\u0000\u022e\u0230\u00054\u0000\u0000\u022f\u022e\u0001\u0000\u0000\u0000"+
		"\u022f\u0230\u0001\u0000\u0000\u0000\u0230\u0231\u0001\u0000\u0000\u0000"+
		"\u0231\u0232\u0005[\u0000\u0000\u0232\u0233\u0003N\'\u0000\u0233\u0235"+
		"\u00050\u0000\u0000\u0234\u0236\u0003T*\u0000\u0235\u0234\u0001\u0000"+
		"\u0000\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236\u0237\u0001\u0000"+
		"\u0000\u0000\u0237\u0238\u00051\u0000\u0000\u0238\u0245\u0001\u0000\u0000"+
		"\u0000\u0239\u023b\u00054\u0000\u0000\u023a\u0239\u0001\u0000\u0000\u0000"+
		"\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000\u0000"+
		"\u023c\u023d\u0005[\u0000\u0000\u023d\u023e\u0003\u0082A\u0000\u023e\u0240"+
		"\u00050\u0000\u0000\u023f\u0241\u0003T*\u0000\u0240\u023f\u0001\u0000"+
		"\u0000\u0000\u0240\u0241\u0001\u0000\u0000\u0000\u0241\u0242\u0001\u0000"+
		"\u0000\u0000\u0242\u0243\u00051\u0000\u0000\u0243\u0245\u0001\u0000\u0000"+
		"\u0000\u0244\u0224\u0001\u0000\u0000\u0000\u0244\u022f\u0001\u0000\u0000"+
		"\u0000\u0244\u023a\u0001\u0000\u0000\u0000\u0245u\u0001\u0000\u0000\u0000"+
		"\u0246\u0247\u0003\u0000\u0000\u0000\u0247\u0248\u0003n7\u0000\u0248w"+
		"\u0001\u0000\u0000\u0000\u0249\u024a\u0003z=\u0000\u024a\u024b\u0003~"+
		"?\u0000\u024b\u0257\u0001\u0000\u0000\u0000\u024c\u024d\u0003z=\u0000"+
		"\u024d\u024e\u00050\u0000\u0000\u024e\u024f\u0003~?\u0000\u024f\u0250"+
		"\u00051\u0000\u0000\u0250\u0257\u0001\u0000\u0000\u0000\u0251\u0252\u0003"+
		"z=\u0000\u0252\u0253\u00050\u0000\u0000\u0253\u0254\u0003|>\u0000\u0254"+
		"\u0255\u00051\u0000\u0000\u0255\u0257\u0001\u0000\u0000\u0000\u0256\u0249"+
		"\u0001\u0000\u0000\u0000\u0256\u024c\u0001\u0000\u0000\u0000\u0256\u0251"+
		"\u0001\u0000\u0000\u0000\u0257y\u0001\u0000\u0000\u0000\u0258\u0259\u0005"+
		"<\u0000\u0000\u0259{\u0001\u0000\u0000\u0000\u025a\u025e\u0003N\'\u0000"+
		"\u025b\u025d\u0003\b\u0004\u0000\u025c\u025b\u0001\u0000\u0000\u0000\u025d"+
		"\u0260\u0001\u0000\u0000\u0000\u025e\u025c\u0001\u0000\u0000\u0000\u025e"+
		"\u025f\u0001\u0000\u0000\u0000\u025f}\u0001\u0000\u0000\u0000\u0260\u025e"+
		"\u0001\u0000\u0000\u0000\u0261\u0262\u0003r9\u0000\u0262\u007f\u0001\u0000"+
		"\u0000\u0000\u0263\u0264\u0007\u001a\u0000\u0000\u0264\u0081\u0001\u0000"+
		"\u0000\u0000\u0265\u0266\u0006A\uffff\uffff\u0000\u0266\u0267\u0003\u0088"+
		"D\u0000\u0267\u028c\u0001\u0000\u0000\u0000\u0268\u0269\n\u0007\u0000"+
		"\u0000\u0269\u026a\u0005\u0014\u0000\u0000\u026a\u026b\u0003T*\u0000\u026b"+
		"\u026c\u0005\u0015\u0000\u0000\u026c\u028b\u0001\u0000\u0000\u0000\u026d"+
		"\u026e\n\u0006\u0000\u0000\u026e\u026f\u00050\u0000\u0000\u026f\u0270"+
		"\u0003\u0084B\u0000\u0270\u0271\u00051\u0000\u0000\u0271\u028b\u0001\u0000"+
		"\u0000\u0000\u0272\u0273\n\u0005\u0000\u0000\u0273\u0275\u0005=\u0000"+
		"\u0000\u0274\u0276\u0005Z\u0000\u0000\u0275\u0274\u0001\u0000\u0000\u0000"+
		"\u0275\u0276\u0001\u0000\u0000\u0000\u0276\u0277\u0001\u0000\u0000\u0000"+
		"\u0277\u028b\u0003:\u001d\u0000\u0278\u0279\n\u0004\u0000\u0000\u0279"+
		"\u027b\u0005/\u0000\u0000\u027a\u027c\u0005Z\u0000\u0000\u027b\u027a\u0001"+
		"\u0000\u0000\u0000\u027b\u027c\u0001\u0000\u0000\u0000\u027c\u027d\u0001"+
		"\u0000\u0000\u0000\u027d\u028b\u0003:\u001d\u0000\u027e\u027f\n\u0003"+
		"\u0000\u0000\u027f\u028b\u0003\u0080@\u0000\u0280\u0281\n\u0002\u0000"+
		"\u0000\u0281\u0282\u0005>\u0000\u0000\u0282\u0288\u0003T*\u0000\u0283"+
		"\u0285\u0005\u0007\u0000\u0000\u0284\u0286\u0003\u0084B\u0000\u0285\u0284"+
		"\u0001\u0000\u0000\u0000\u0285\u0286\u0001\u0000\u0000\u0000\u0286\u0287"+
		"\u0001\u0000\u0000\u0000\u0287\u0289\u0005\b\u0000\u0000\u0288\u0283\u0001"+
		"\u0000\u0000\u0000\u0288\u0289\u0001\u0000\u0000\u0000\u0289\u028b\u0001"+
		"\u0000\u0000\u0000\u028a\u0268\u0001\u0000\u0000\u0000\u028a\u026d\u0001"+
		"\u0000\u0000\u0000\u028a\u0272\u0001\u0000\u0000\u0000\u028a\u0278\u0001"+
		"\u0000\u0000\u0000\u028a\u027e\u0001\u0000\u0000\u0000\u028a\u0280\u0001"+
		"\u0000\u0000\u0000\u028b\u028e\u0001\u0000\u0000\u0000\u028c\u028a\u0001"+
		"\u0000\u0000\u0000\u028c\u028d\u0001\u0000\u0000\u0000\u028d\u0083\u0001"+
		"\u0000\u0000\u0000\u028e\u028c\u0001\u0000\u0000\u0000\u028f\u0294\u0003"+
		"\u0086C\u0000\u0290\u0291\u0005-\u0000\u0000\u0291\u0293\u0003\u0086C"+
		"\u0000\u0292\u0290\u0001\u0000\u0000\u0000\u0293\u0296\u0001\u0000\u0000"+
		"\u0000\u0294\u0292\u0001\u0000\u0000\u0000\u0294\u0295\u0001\u0000\u0000"+
		"\u0000\u0295\u0298\u0001\u0000\u0000\u0000\u0296\u0294\u0001\u0000\u0000"+
		"\u0000\u0297\u028f\u0001\u0000\u0000\u0000\u0297\u0298\u0001\u0000\u0000"+
		"\u0000\u0298\u0085\u0001\u0000\u0000\u0000\u0299\u029b\u0003V+\u0000\u029a"+
		"\u029c\u0007\u001b\u0000\u0000\u029b\u029a\u0001\u0000\u0000\u0000\u029b"+
		"\u029c\u0001\u0000\u0000\u0000\u029c\u0087\u0001\u0000\u0000\u0000\u029d"+
		"\u029f\u0003:\u001d\u0000\u029e\u02a0\u0007\u001b\u0000\u0000\u029f\u029e"+
		"\u0001\u0000\u0000\u0000\u029f\u02a0\u0001\u0000\u0000\u0000\u02a0\u02aa"+
		"\u0001\u0000\u0000\u0000\u02a1\u02a3\u0003\u0004\u0002\u0000\u02a2\u02a4"+
		"\u0007\u001b\u0000\u0000\u02a3\u02a2\u0001\u0000\u0000\u0000\u02a3\u02a4"+
		"\u0001\u0000\u0000\u0000\u02a4\u02aa\u0001\u0000\u0000\u0000\u02a5\u02a6"+
		"\u00050\u0000\u0000\u02a6\u02a7\u0003T*\u0000\u02a7\u02a8\u00051\u0000"+
		"\u0000\u02a8\u02aa\u0001\u0000\u0000\u0000\u02a9\u029d\u0001\u0000\u0000"+
		"\u0000\u02a9\u02a1\u0001\u0000\u0000\u0000\u02a9\u02a5\u0001\u0000\u0000"+
		"\u0000\u02aa\u0089\u0001\u0000\u0000\u0000S\u0099\u00c3\u00cc\u00d6\u00dd"+
		"\u00e4\u00e8\u00ee\u00f1\u00f4\u00f7\u00fe\u0101\u0105\u0111\u0115\u0119"+
		"\u0136\u013a\u013d\u0142\u0146\u014a\u0155\u015a\u015d\u0160\u0163\u0170"+
		"\u0177\u0179\u017c\u017f\u0183\u0188\u018e\u0192\u0196\u019b\u019f\u01a3"+
		"\u01a8\u01ac\u01b0\u01bc\u01c2\u01cb\u01d0\u01d5\u01da\u01df\u01e4\u01ea"+
		"\u01f0\u01f5\u01fa\u01ff\u0207\u020d\u021b\u021e\u0221\u0224\u022a\u022f"+
		"\u0235\u023a\u0240\u0244\u0256\u025e\u0275\u027b\u0285\u0288\u028a\u028c"+
		"\u0294\u0297\u029b\u029f\u02a3\u02a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}