// Generated from D:/Workspace/RobustParser/fuzzyc2cpg/src/main/antlr4/io/shiftleft/fuzzyc2cpg\Common.g4 by ANTLR 4.9.1
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
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

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
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, IF=59, ELSE=60, 
		FOR=61, WHILE=62, BREAK=63, CASE=64, CONTINUE=65, SWITCH=66, DO=67, GOTO=68, 
		RETURN=69, TYPEDEF=70, EXTERN=71, VOID=72, UNSIGNED=73, SIGNED=74, LONG=75, 
		CV_QUALIFIER=76, VIRTUAL=77, TRY=78, CATCH=79, THROW=80, USING=81, NAMESPACE=82, 
		AUTO=83, REGISTER=84, OPERATOR=85, TEMPLATE=86, NEW=87, EXTENDS=88, IMPLEMENTS=89, 
		CLASS_KEY=90, ALPHA_NUMERIC=91, OPENING_CURLY=92, CLOSING_CURLY=93, PRE_IF=94, 
		PRE_ELSE=95, PRE_ENDIF=96, PRE_DEFINE=97, HEX_LITERAL=98, DECIMAL_LITERAL=99, 
		OCTAL_LITERAL=100, BINARY_LITERAL=101, FLOATING_POINT_LITERAL=102, CHAR=103, 
		STRING=104, COMMENT=105, WHITESPACE=106, CPPCOMMENT=107, ELLIPSIS=108, 
		OTHER=109;
	public static final int
		RULE_unary_operator = 0, RULE_relational_operator = 1, RULE_constant = 2, 
		RULE_function_decl_specifiers = 3, RULE_ptr_operator = 4, RULE_access_specifier = 5, 
		RULE_operator = 6, RULE_assignment_operator = 7, RULE_equality_operator = 8, 
		RULE_template_decl_start = 9, RULE_template_param_list = 10, RULE_no_brackets = 11, 
		RULE_no_brackets_curlies_or_squares = 12, RULE_no_brackets_or_semicolon = 13, 
		RULE_no_angle_brackets_or_brackets = 14, RULE_no_curlies = 15, RULE_no_squares = 16, 
		RULE_no_squares_or_semicolon = 17, RULE_no_comma_or_semicolon = 18, RULE_assign_water = 19, 
		RULE_assign_water_l2 = 20, RULE_water = 21, RULE_identifier = 22, RULE_number = 23, 
		RULE_ptrs = 24, RULE_func_ptrs = 25, RULE_class_def = 26, RULE_class_name = 27, 
		RULE_base_classes = 28, RULE_base_class = 29, RULE_type_name = 30, RULE_base_type = 31, 
		RULE_expr = 32, RULE_assign_expr = 33, RULE_conditional_expression = 34, 
		RULE_or_expression = 35, RULE_and_expression = 36, RULE_inclusive_or_expression = 37, 
		RULE_exclusive_or_expression = 38, RULE_bit_and_expression = 39, RULE_equality_expression = 40, 
		RULE_relational_expression = 41, RULE_shift_expression = 42, RULE_additive_expression = 43, 
		RULE_multiplicative_expression = 44, RULE_cast_expression = 45, RULE_cast_target = 46, 
		RULE_unary_expression = 47, RULE_new_expression = 48, RULE_unary_op_and_cast_expr = 49, 
		RULE_sizeof_expression = 50, RULE_sizeof = 51, RULE_sizeof_operand = 52, 
		RULE_sizeof_operand2 = 53, RULE_inc_dec = 54, RULE_postfix_expression = 55, 
		RULE_function_argument_list = 56, RULE_function_argument = 57, RULE_primary_expression = 58;
	private static String[] makeRuleNames() {
		return new String[] {
			"unary_operator", "relational_operator", "constant", "function_decl_specifiers", 
			"ptr_operator", "access_specifier", "operator", "assignment_operator", 
			"equality_operator", "template_decl_start", "template_param_list", "no_brackets", 
			"no_brackets_curlies_or_squares", "no_brackets_or_semicolon", "no_angle_brackets_or_brackets", 
			"no_curlies", "no_squares", "no_squares_or_semicolon", "no_comma_or_semicolon", 
			"assign_water", "assign_water_l2", "water", "identifier", "number", "ptrs", 
			"func_ptrs", "class_def", "class_name", "base_classes", "base_class", 
			"type_name", "base_type", "expr", "assign_expr", "conditional_expression", 
			"or_expression", "and_expression", "inclusive_or_expression", "exclusive_or_expression", 
			"bit_and_expression", "equality_expression", "relational_expression", 
			"shift_expression", "additive_expression", "multiplicative_expression", 
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
			"'||'", "'++'", "'--'", "','", "'->*'", "'->'", "'('", "')'", "';'", 
			"'::'", "'[]'", "'restrict'", "':'", "'?'", "'sizeof'", "'.'", "'instanceof'", 
			"'if'", "'else'", "'for'", "'while'", "'break'", "'case'", "'continue'", 
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
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "IF", 
			"ELSE", "FOR", "WHILE", "BREAK", "CASE", "CONTINUE", "SWITCH", "DO", 
			"GOTO", "RETURN", "TYPEDEF", "EXTERN", "VOID", "UNSIGNED", "SIGNED", 
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

	@Override
	public String getGrammarFileName() { return "Common.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	            public boolean skipToEndOfObject()
	            {
	                Stack<Object> CurlyStack = new Stack<Object>();
	                Object o = new Object();
	                int t = _input.LA(1);

	                while(t != EOF && !(CurlyStack.empty() && t == CLOSING_CURLY)){

	                    if(t == PRE_ELSE){
	                        Stack<Object> ifdefStack = new Stack<Object>();
	                        consume();
	                        t = _input.LA(1);

	                        while(t != EOF && !(ifdefStack.empty() && (t == PRE_ENDIF))){
	                            if(t == PRE_IF)
	                                ifdefStack.push(o);
	                            else if(t == PRE_ENDIF)
	                                ifdefStack.pop();
	                            consume();
	                            t = _input.LA(1);
	                        }
	                    }

	                    if(t == OPENING_CURLY)
	                        CurlyStack.push(o);
	                    else if(t == CLOSING_CURLY)
	                        CurlyStack.pop();

	                    consume();
	                    t = _input.LA(1);
	                }
	                if(t != EOF)
	                    consume();
	                return true;
	            }

	   // this should go into FunctionGrammar but ANTLR fails
	   // to join the parser::members-section on inclusion

	   public boolean preProcSkipToEnd()
	   {
	                Stack<Object> CurlyStack = new Stack<Object>();
	                Object o = new Object();
	                int t = _input.LA(1);

	                while(t != EOF && !(CurlyStack.empty() && t == PRE_ENDIF)){

	                    if(t == PRE_IF)
	                        CurlyStack.push(o);
	                    else if(t == PRE_ENDIF)
	                        CurlyStack.pop();

	                    consume();
	                    t = _input.LA(1);
	                }
	                if(t != EOF)
	                    consume();
	                return true;
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
			setState(118);
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
			setState(120);
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
			setState(122);
			_la = _input.LA(1);
			if ( !(((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (HEX_LITERAL - 98)) | (1L << (DECIMAL_LITERAL - 98)) | (1L << (OCTAL_LITERAL - 98)) | (1L << (BINARY_LITERAL - 98)) | (1L << (FLOATING_POINT_LITERAL - 98)) | (1L << (CHAR - 98)) | (1L << (STRING - 98)))) != 0)) ) {
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
			setState(124);
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
			setState(126);
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
			setState(128);
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
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(130);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==NEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(131);
					match(T__19);
					setState(132);
					match(T__20);
					}
				}

				}
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(T__2);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				match(T__3);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				match(T__1);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 5);
				{
				setState(138);
				match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 6);
				{
				setState(139);
				match(T__22);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 7);
				{
				setState(140);
				match(T__23);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 8);
				{
				setState(141);
				match(T__0);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 9);
				{
				setState(142);
				match(T__24);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 10);
				{
				setState(143);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 11);
				{
				setState(144);
				match(T__5);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 12);
				{
				setState(145);
				match(T__25);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 13);
				{
				setState(146);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 14);
				{
				setState(147);
				match(T__7);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 15);
				{
				setState(148);
				match(T__26);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 16);
				{
				setState(149);
				match(T__27);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 17);
				{
				setState(150);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 18);
				{
				setState(151);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 19);
				{
				setState(152);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 20);
				{
				setState(153);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 21);
				{
				setState(154);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 22);
				{
				setState(155);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 23);
				{
				setState(156);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 24);
				{
				setState(157);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 25);
				{
				setState(158);
				match(T__36);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 26);
				{
				setState(159);
				match(T__37);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 27);
				{
				setState(160);
				match(T__38);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 28);
				{
				setState(161);
				match(T__39);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 29);
				{
				setState(162);
				match(T__8);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 30);
				{
				setState(163);
				match(T__9);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 31);
				{
				setState(164);
				match(T__40);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 32);
				{
				setState(165);
				match(T__41);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 33);
				{
				setState(166);
				match(T__42);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 34);
				{
				setState(167);
				match(T__43);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 35);
				{
				setState(168);
				match(T__44);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 36);
				{
				setState(169);
				match(T__45);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 37);
				{
				setState(170);
				match(T__46);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 38);
				{
				setState(171);
				match(T__47);
				setState(172);
				match(T__48);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 39);
				{
				setState(173);
				match(T__19);
				setState(174);
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
			setState(177);
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
			setState(179);
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

	public static class Template_decl_startContext extends ParserRuleContext {
		public TerminalNode TEMPLATE() { return getToken(CommonParser.TEMPLATE, 0); }
		public Template_param_listContext template_param_list() {
			return getRuleContext(Template_param_listContext.class,0);
		}
		public Template_decl_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_decl_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterTemplate_decl_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitTemplate_decl_start(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitTemplate_decl_start(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_decl_startContext template_decl_start() throws RecognitionException {
		Template_decl_startContext _localctx = new Template_decl_startContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_template_decl_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(TEMPLATE);
			setState(182);
			match(T__6);
			setState(183);
			template_param_list();
			setState(184);
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

	public static class Template_param_listContext extends ParserRuleContext {
		public List<Base_typeContext> base_type() {
			return getRuleContexts(Base_typeContext.class);
		}
		public Base_typeContext base_type(int i) {
			return getRuleContext(Base_typeContext.class,i);
		}
		public List<Template_param_listContext> template_param_list() {
			return getRuleContexts(Template_param_listContext.class);
		}
		public Template_param_listContext template_param_list(int i) {
			return getRuleContext(Template_param_listContext.class,i);
		}
		public Template_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).enterTemplate_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CommonListener ) ((CommonListener)listener).exitTemplate_param_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CommonVisitor ) return ((CommonVisitor<? extends T>)visitor).visitTemplate_param_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_param_listContext template_param_list() throws RecognitionException {
		Template_param_listContext _localctx = new Template_param_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_template_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			base_type();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(187);
				match(T__6);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (VOID - 72)) | (1L << (LONG - 72)) | (1L << (ALPHA_NUMERIC - 72)))) != 0)) {
					{
					setState(188);
					template_param_list();
					}
				}

				setState(191);
				match(T__7);
				}
			}

			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__44) {
				{
				{
				setState(194);
				match(T__44);
				setState(195);
				base_type();
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(196);
					match(T__6);
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (VOID - 72)) | (1L << (LONG - 72)) | (1L << (ALPHA_NUMERIC - 72)))) != 0)) {
						{
						setState(197);
						template_param_list();
						}
					}

					setState(200);
					match(T__7);
					}
				}

				}
				}
				setState(207);
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
		enterRule(_localctx, 22, RULE_no_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
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
		enterRule(_localctx, 24, RULE_no_brackets_curlies_or_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
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
		enterRule(_localctx, 26, RULE_no_brackets_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__47) | (1L << T__48) | (1L << T__49))) != 0)) ) {
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
		enterRule(_localctx, 28, RULE_no_angle_brackets_or_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
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
		enterRule(_localctx, 30, RULE_no_curlies);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
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
		enterRule(_localctx, 32, RULE_no_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
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
		enterRule(_localctx, 34, RULE_no_squares_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__49))) != 0)) ) {
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
		enterRule(_localctx, 36, RULE_no_comma_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__44 || _la==T__49) ) {
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
		enterRule(_localctx, 38, RULE_assign_water);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__44) | (1L << T__47) | (1L << T__48) | (1L << T__49))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
		enterRule(_localctx, 40, RULE_assign_water_l2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
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
		enterRule(_localctx, 42, RULE_water);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
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
		enterRule(_localctx, 44, RULE_identifier);
		try {
			int _alt;
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(230);
				match(ALPHA_NUMERIC);
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(231);
						match(T__50);
						setState(232);
						match(ALPHA_NUMERIC);
						}
						} 
					}
					setState(237);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				setState(239);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(238);
					match(T__51);
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
				setState(241);
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
		enterRule(_localctx, 46, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_la = _input.LA(1);
			if ( !(((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (HEX_LITERAL - 98)) | (1L << (DECIMAL_LITERAL - 98)) | (1L << (OCTAL_LITERAL - 98)))) != 0)) ) {
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
		enterRule(_localctx, 48, RULE_ptrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CV_QUALIFIER) {
					{
					setState(246);
					match(CV_QUALIFIER);
					}
				}

				setState(249);
				ptr_operator();
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__52) {
					{
					setState(250);
					match(T__52);
					}
				}

				}
				}
				setState(255); 
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
		enterRule(_localctx, 50, RULE_func_ptrs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
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

	public static class Class_defContext extends ParserRuleContext {
		public TerminalNode CLASS_KEY() { return getToken(CommonParser.CLASS_KEY, 0); }
		public TerminalNode OPENING_CURLY() { return getToken(CommonParser.OPENING_CURLY, 0); }
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
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
		enterRule(_localctx, 52, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(CLASS_KEY);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0) || _la==ALPHA_NUMERIC) {
				{
				setState(260);
				class_name();
				}
			}

			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (T__53 - 54)) | (1L << (EXTENDS - 54)) | (1L << (IMPLEMENTS - 54)))) != 0)) {
				{
				setState(263);
				base_classes();
				}
			}

			setState(266);
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
		enterRule(_localctx, 54, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
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
		enterRule(_localctx, 56, RULE_base_classes);
		int _la;
		try {
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__53:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				match(T__53);
				setState(272);
				base_class();
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__44) {
					{
					{
					setState(273);
					match(T__44);
					setState(274);
					base_class();
					}
					}
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case EXTENDS:
			case IMPLEMENTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(282); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(280);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==IMPLEMENTS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(281);
					base_class();
					}
					}
					setState(284); 
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
		enterRule(_localctx, 58, RULE_base_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRTUAL) {
				{
				setState(288);
				match(VIRTUAL);
				}
			}

			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(291);
				access_specifier();
				}
				break;
			}
			setState(294);
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
		public TerminalNode CLASS_KEY() { return getToken(CommonParser.CLASS_KEY, 0); }
		public TerminalNode UNSIGNED() { return getToken(CommonParser.UNSIGNED, 0); }
		public TerminalNode SIGNED() { return getToken(CommonParser.SIGNED, 0); }
		public List<Template_param_listContext> template_param_list() {
			return getRuleContexts(Template_param_listContext.class);
		}
		public Template_param_listContext template_param_list(int i) {
			return getRuleContext(Template_param_listContext.class,i);
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
		enterRule(_localctx, 60, RULE_type_name);
		int _la;
		try {
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CV_QUALIFIER) {
					{
					{
					setState(296);
					match(CV_QUALIFIER);
					}
					}
					setState(301);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (UNSIGNED - 73)) | (1L << (SIGNED - 73)) | (1L << (CLASS_KEY - 73)))) != 0)) {
					{
					setState(302);
					_la = _input.LA(1);
					if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (UNSIGNED - 73)) | (1L << (SIGNED - 73)) | (1L << (CLASS_KEY - 73)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(305);
				base_type();
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(306);
					match(T__6);
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (VOID - 72)) | (1L << (LONG - 72)) | (1L << (ALPHA_NUMERIC - 72)))) != 0)) {
						{
						setState(307);
						template_param_list();
						}
					}

					setState(310);
					match(T__7);
					}
				}

				setState(315);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(313);
					match(T__19);
					setState(314);
					match(T__20);
					}
					break;
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__50) {
					{
					{
					setState(317);
					match(T__50);
					setState(318);
					base_type();
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__6) {
						{
						setState(319);
						match(T__6);
						setState(320);
						template_param_list();
						setState(321);
						match(T__7);
						}
					}

					}
					}
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CV_QUALIFIER) {
					{
					setState(330);
					match(CV_QUALIFIER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				postfix_expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				match(UNSIGNED);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(335);
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
		public List<TerminalNode> VOID() { return getTokens(CommonParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(CommonParser.VOID, i);
		}
		public List<TerminalNode> LONG() { return getTokens(CommonParser.LONG); }
		public TerminalNode LONG(int i) {
			return getToken(CommonParser.LONG, i);
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
		enterRule(_localctx, 62, RULE_base_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(338);
				_la = _input.LA(1);
				if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (VOID - 72)) | (1L << (LONG - 72)) | (1L << (ALPHA_NUMERIC - 72)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(341); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (VOID - 72)) | (1L << (LONG - 72)) | (1L << (ALPHA_NUMERIC - 72)))) != 0) );
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
		enterRule(_localctx, 64, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			assign_expr();
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(344);
				match(T__44);
				setState(345);
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
		enterRule(_localctx, 66, RULE_assign_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			conditional_expression();
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(349);
				assignment_operator();
				setState(350);
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
		enterRule(_localctx, 68, RULE_conditional_expression);
		try {
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new NormOrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				or_expression();
				}
				break;
			case 2:
				_localctx = new CndExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				or_expression();
				{
				setState(356);
				match(T__54);
				setState(357);
				expr();
				setState(358);
				match(T__53);
				setState(359);
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
		enterRule(_localctx, 70, RULE_or_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			and_expression();
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(364);
				match(T__41);
				setState(365);
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
		enterRule(_localctx, 72, RULE_and_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			inclusive_or_expression();
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(369);
				match(T__40);
				setState(370);
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
		enterRule(_localctx, 74, RULE_inclusive_or_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			exclusive_or_expression();
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(374);
				match(T__24);
				setState(375);
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
		enterRule(_localctx, 76, RULE_exclusive_or_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			bit_and_expression();
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(379);
				match(T__23);
				setState(380);
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
		enterRule(_localctx, 78, RULE_bit_and_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			equality_expression();
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(384);
				match(T__0);
				setState(385);
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
		enterRule(_localctx, 80, RULE_equality_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			relational_expression();
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(389);
				equality_operator();
				setState(390);
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
		enterRule(_localctx, 82, RULE_relational_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			shift_expression();
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(395);
				relational_operator();
				setState(396);
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
		enterRule(_localctx, 84, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			additive_expression();
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(401);
				_la = _input.LA(1);
				if ( !(_la==T__34 || _la==T__35) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(402);
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
		enterRule(_localctx, 86, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			multiplicative_expression();
			setState(408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(406);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(407);
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
		enterRule(_localctx, 88, RULE_multiplicative_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			cast_expression();
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(411);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__21) | (1L << T__22))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(412);
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
		enterRule(_localctx, 90, RULE_cast_expression);
		try {
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(415);
				match(T__47);
				setState(416);
				cast_target();
				setState(417);
				match(T__48);
				setState(418);
				cast_expression();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
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
		enterRule(_localctx, 92, RULE_cast_target);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			type_name();
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(424);
				ptr_operator();
				}
				}
				setState(429);
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
		public Unary_op_and_cast_exprContext unary_op_and_cast_expr() {
			return getRuleContext(Unary_op_and_cast_exprContext.class,0);
		}
		public Sizeof_expressionContext sizeof_expression() {
			return getRuleContext(Sizeof_expressionContext.class,0);
		}
		public New_expressionContext new_expression() {
			return getRuleContext(New_expressionContext.class,0);
		}
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
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
		enterRule(_localctx, 94, RULE_unary_expression);
		try {
			setState(437);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__42:
			case T__43:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				inc_dec();
				setState(431);
				cast_expression();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				unary_op_and_cast_expr();
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
				sizeof_expression();
				}
				break;
			case T__50:
			case NEW:
				enterOuterAlt(_localctx, 4);
				{
				setState(435);
				new_expression();
				}
				break;
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__47:
			case T__54:
			case ALPHA_NUMERIC:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case BINARY_LITERAL:
			case FLOATING_POINT_LITERAL:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(436);
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
		enterRule(_localctx, 96, RULE_new_expression);
		int _la;
		try {
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__50) {
					{
					setState(439);
					match(T__50);
					}
				}

				setState(442);
				match(NEW);
				setState(443);
				type_name();
				setState(444);
				match(T__19);
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__42) | (1L << T__43) | (1L << T__47) | (1L << T__50) | (1L << T__54) | (1L << T__55))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (NEW - 87)) | (1L << (ALPHA_NUMERIC - 87)) | (1L << (HEX_LITERAL - 87)) | (1L << (DECIMAL_LITERAL - 87)) | (1L << (OCTAL_LITERAL - 87)) | (1L << (BINARY_LITERAL - 87)) | (1L << (FLOATING_POINT_LITERAL - 87)) | (1L << (CHAR - 87)) | (1L << (STRING - 87)))) != 0)) {
					{
					setState(445);
					conditional_expression();
					}
				}

				setState(448);
				match(T__20);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__50) {
					{
					setState(450);
					match(T__50);
					}
				}

				setState(453);
				match(NEW);
				setState(454);
				type_name();
				setState(455);
				match(T__47);
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__42) | (1L << T__43) | (1L << T__47) | (1L << T__50) | (1L << T__54) | (1L << T__55))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (NEW - 87)) | (1L << (ALPHA_NUMERIC - 87)) | (1L << (HEX_LITERAL - 87)) | (1L << (DECIMAL_LITERAL - 87)) | (1L << (OCTAL_LITERAL - 87)) | (1L << (BINARY_LITERAL - 87)) | (1L << (FLOATING_POINT_LITERAL - 87)) | (1L << (CHAR - 87)) | (1L << (STRING - 87)))) != 0)) {
					{
					setState(456);
					expr();
					}
				}

				setState(459);
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
		enterRule(_localctx, 98, RULE_unary_op_and_cast_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			unary_operator();
			setState(464);
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
		enterRule(_localctx, 100, RULE_sizeof_expression);
		try {
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				sizeof();
				setState(467);
				sizeof_operand2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				sizeof();
				setState(470);
				match(T__47);
				setState(471);
				sizeof_operand2();
				setState(472);
				match(T__48);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(474);
				sizeof();
				setState(475);
				match(T__47);
				setState(476);
				sizeof_operand();
				setState(477);
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
		enterRule(_localctx, 102, RULE_sizeof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(T__55);
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
		enterRule(_localctx, 104, RULE_sizeof_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			type_name();
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(484);
				ptr_operator();
				}
				}
				setState(489);
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
		enterRule(_localctx, 106, RULE_sizeof_operand2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
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
		enterRule(_localctx, 108, RULE_inc_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
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
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_postfix_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimaryOnlyContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(495);
			primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(533);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(531);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayIndexingContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(497);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(498);
						match(T__19);
						setState(499);
						expr();
						setState(500);
						match(T__20);
						}
						break;
					case 2:
						{
						_localctx = new FuncCallContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(502);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(503);
						match(T__47);
						setState(504);
						function_argument_list();
						setState(505);
						match(T__48);
						}
						break;
					case 3:
						{
						_localctx = new MemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(507);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(508);
						match(T__56);
						setState(510);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(509);
							match(TEMPLATE);
							}
						}

						{
						setState(512);
						identifier();
						}
						}
						break;
					case 4:
						{
						_localctx = new PtrMemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(513);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(514);
						match(T__46);
						setState(516);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(515);
							match(TEMPLATE);
							}
						}

						{
						setState(518);
						identifier();
						}
						}
						break;
					case 5:
						{
						_localctx = new IncDecOpContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(519);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(520);
						inc_dec();
						}
						break;
					case 6:
						{
						_localctx = new InstanceContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(521);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(522);
						match(T__57);
						setState(523);
						expr();
						setState(529);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
						case 1:
							{
							setState(524);
							match(T__6);
							setState(526);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
							case 1:
								{
								setState(525);
								function_argument_list();
								}
								break;
							}
							setState(528);
							match(T__7);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(535);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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
		enterRule(_localctx, 112, RULE_function_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__42) | (1L << T__43) | (1L << T__47) | (1L << T__50) | (1L << T__54) | (1L << T__55))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (NEW - 87)) | (1L << (ALPHA_NUMERIC - 87)) | (1L << (HEX_LITERAL - 87)) | (1L << (DECIMAL_LITERAL - 87)) | (1L << (OCTAL_LITERAL - 87)) | (1L << (BINARY_LITERAL - 87)) | (1L << (FLOATING_POINT_LITERAL - 87)) | (1L << (CHAR - 87)) | (1L << (STRING - 87)))) != 0)) {
				{
				setState(536);
				function_argument();
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__44) {
					{
					{
					setState(537);
					match(T__44);
					setState(538);
					function_argument();
					}
					}
					setState(543);
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
		public TerminalNode CPPCOMMENT() { return getToken(CommonParser.CPPCOMMENT, 0); }
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
		enterRule(_localctx, 114, RULE_function_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			assign_expr();
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT || _la==CPPCOMMENT) {
				{
				setState(547);
				_la = _input.LA(1);
				if ( !(_la==COMMENT || _la==CPPCOMMENT) ) {
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
		public TerminalNode CPPCOMMENT() { return getToken(CommonParser.CPPCOMMENT, 0); }
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
		enterRule(_localctx, 116, RULE_primary_expression);
		int _la;
		try {
			setState(563);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(550);
				identifier();
				setState(552);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(551);
					_la = _input.LA(1);
					if ( !(_la==COMMENT || _la==CPPCOMMENT) ) {
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
				enterOuterAlt(_localctx, 2);
				{
				setState(554);
				constant();
				setState(556);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(555);
					_la = _input.LA(1);
					if ( !(_la==COMMENT || _la==CPPCOMMENT) ) {
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
				setState(558);
				match(T__47);
				setState(559);
				expr();
				setState(560);
				match(T__48);
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 4);
				{
				setState(562);
				match(T__54);
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
		case 55:
			return postfix_expression_sempred((Postfix_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean postfix_expression_sempred(Postfix_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3o\u0238\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\5\b\u0088\n\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u00b2\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\5\f\u00c0\n\f\3\f\5\f\u00c3\n\f\3\f\3\f\3\f\3\f\5\f\u00c9"+
		"\n\f\3\f\5\f\u00cc\n\f\7\f\u00ce\n\f\f\f\16\f\u00d1\13\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\7\30\u00ec\n\30\f\30\16\30\u00ef"+
		"\13\30\3\30\5\30\u00f2\n\30\3\30\5\30\u00f5\n\30\3\31\3\31\3\32\5\32\u00fa"+
		"\n\32\3\32\3\32\5\32\u00fe\n\32\6\32\u0100\n\32\r\32\16\32\u0101\3\33"+
		"\3\33\3\34\3\34\5\34\u0108\n\34\3\34\5\34\u010b\n\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\7\36\u0116\n\36\f\36\16\36\u0119\13\36\3"+
		"\36\3\36\6\36\u011d\n\36\r\36\16\36\u011e\5\36\u0121\n\36\3\37\5\37\u0124"+
		"\n\37\3\37\5\37\u0127\n\37\3\37\3\37\3 \7 \u012c\n \f \16 \u012f\13 \3"+
		" \5 \u0132\n \3 \3 \3 \5 \u0137\n \3 \5 \u013a\n \3 \3 \5 \u013e\n \3"+
		" \3 \3 \3 \3 \3 \5 \u0146\n \7 \u0148\n \f \16 \u014b\13 \3 \5 \u014e"+
		"\n \3 \3 \3 \5 \u0153\n \3!\6!\u0156\n!\r!\16!\u0157\3\"\3\"\3\"\5\"\u015d"+
		"\n\"\3#\3#\3#\3#\5#\u0163\n#\3$\3$\3$\3$\3$\3$\3$\5$\u016c\n$\3%\3%\3"+
		"%\5%\u0171\n%\3&\3&\3&\5&\u0176\n&\3\'\3\'\3\'\5\'\u017b\n\'\3(\3(\3("+
		"\5(\u0180\n(\3)\3)\3)\5)\u0185\n)\3*\3*\3*\3*\5*\u018b\n*\3+\3+\3+\3+"+
		"\5+\u0191\n+\3,\3,\3,\5,\u0196\n,\3-\3-\3-\5-\u019b\n-\3.\3.\3.\5.\u01a0"+
		"\n.\3/\3/\3/\3/\3/\3/\5/\u01a8\n/\3\60\3\60\7\60\u01ac\n\60\f\60\16\60"+
		"\u01af\13\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u01b8\n\61\3\62\5"+
		"\62\u01bb\n\62\3\62\3\62\3\62\3\62\5\62\u01c1\n\62\3\62\3\62\3\62\5\62"+
		"\u01c6\n\62\3\62\3\62\3\62\3\62\5\62\u01cc\n\62\3\62\3\62\5\62\u01d0\n"+
		"\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\5\64\u01e2\n\64\3\65\3\65\3\66\3\66\7\66\u01e8\n\66\f\66"+
		"\16\66\u01eb\13\66\3\67\3\67\38\38\39\39\39\39\39\39\39\39\39\39\39\3"+
		"9\39\39\39\39\59\u0201\n9\39\39\39\39\59\u0207\n9\39\39\39\39\39\39\3"+
		"9\39\59\u0211\n9\39\59\u0214\n9\79\u0216\n9\f9\169\u0219\139\3:\3:\3:"+
		"\7:\u021e\n:\f:\16:\u0221\13:\5:\u0223\n:\3;\3;\5;\u0227\n;\3<\3<\5<\u022b"+
		"\n<\3<\3<\5<\u022f\n<\3<\3<\3<\3<\3<\5<\u0236\n<\3<\2\3p=\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^"+
		"`bdfhjlnprtv\2\35\3\2\3\b\3\2\t\f\3\2dj\4\2\r\20OO\3\2\3\4\3\2\21\24\4"+
		"\2\25\25YY\4\2\34$\'(\3\2)*\3\2\62\63\5\2\26\27\62\63^_\3\2\62\64\4\2"+
		"\t\n\62\63\3\2^_\3\2\26\27\4\2\26\27\64\64\4\2//\64\64\6\2\26\27//\62"+
		"\64^_\3\2df\3\2Z[\4\2KL\\\\\5\2JJMM]]\3\2%&\3\2\5\6\4\2\4\4\30\31\3\2"+
		"-.\4\2kkmm\2\u026e\2x\3\2\2\2\4z\3\2\2\2\6|\3\2\2\2\b~\3\2\2\2\n\u0080"+
		"\3\2\2\2\f\u0082\3\2\2\2\16\u00b1\3\2\2\2\20\u00b3\3\2\2\2\22\u00b5\3"+
		"\2\2\2\24\u00b7\3\2\2\2\26\u00bc\3\2\2\2\30\u00d2\3\2\2\2\32\u00d4\3\2"+
		"\2\2\34\u00d6\3\2\2\2\36\u00d8\3\2\2\2 \u00da\3\2\2\2\"\u00dc\3\2\2\2"+
		"$\u00de\3\2\2\2&\u00e0\3\2\2\2(\u00e2\3\2\2\2*\u00e4\3\2\2\2,\u00e6\3"+
		"\2\2\2.\u00f4\3\2\2\2\60\u00f6\3\2\2\2\62\u00ff\3\2\2\2\64\u0103\3\2\2"+
		"\2\66\u0105\3\2\2\28\u010f\3\2\2\2:\u0120\3\2\2\2<\u0123\3\2\2\2>\u0152"+
		"\3\2\2\2@\u0155\3\2\2\2B\u0159\3\2\2\2D\u015e\3\2\2\2F\u016b\3\2\2\2H"+
		"\u016d\3\2\2\2J\u0172\3\2\2\2L\u0177\3\2\2\2N\u017c\3\2\2\2P\u0181\3\2"+
		"\2\2R\u0186\3\2\2\2T\u018c\3\2\2\2V\u0192\3\2\2\2X\u0197\3\2\2\2Z\u019c"+
		"\3\2\2\2\\\u01a7\3\2\2\2^\u01a9\3\2\2\2`\u01b7\3\2\2\2b\u01cf\3\2\2\2"+
		"d\u01d1\3\2\2\2f\u01e1\3\2\2\2h\u01e3\3\2\2\2j\u01e5\3\2\2\2l\u01ec\3"+
		"\2\2\2n\u01ee\3\2\2\2p\u01f0\3\2\2\2r\u0222\3\2\2\2t\u0224\3\2\2\2v\u0235"+
		"\3\2\2\2xy\t\2\2\2y\3\3\2\2\2z{\t\3\2\2{\5\3\2\2\2|}\t\4\2\2}\7\3\2\2"+
		"\2~\177\t\5\2\2\177\t\3\2\2\2\u0080\u0081\t\6\2\2\u0081\13\3\2\2\2\u0082"+
		"\u0083\t\7\2\2\u0083\r\3\2\2\2\u0084\u0087\t\b\2\2\u0085\u0086\7\26\2"+
		"\2\u0086\u0088\7\27\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u00b2\3\2\2\2\u0089\u00b2\7\5\2\2\u008a\u00b2\7\6\2\2\u008b\u00b2\7\4"+
		"\2\2\u008c\u00b2\7\30\2\2\u008d\u00b2\7\31\2\2\u008e\u00b2\7\32\2\2\u008f"+
		"\u00b2\7\3\2\2\u0090\u00b2\7\33\2\2\u0091\u00b2\7\7\2\2\u0092\u00b2\7"+
		"\b\2\2\u0093\u00b2\7\34\2\2\u0094\u00b2\7\t\2\2\u0095\u00b2\7\n\2\2\u0096"+
		"\u00b2\7\35\2\2\u0097\u00b2\7\36\2\2\u0098\u00b2\7\37\2\2\u0099\u00b2"+
		"\7 \2\2\u009a\u00b2\7!\2\2\u009b\u00b2\7\"\2\2\u009c\u00b2\7#\2\2\u009d"+
		"\u00b2\7$\2\2\u009e\u00b2\7%\2\2\u009f\u00b2\7&\2\2\u00a0\u00b2\7\'\2"+
		"\2\u00a1\u00b2\7(\2\2\u00a2\u00b2\7)\2\2\u00a3\u00b2\7*\2\2\u00a4\u00b2"+
		"\7\13\2\2\u00a5\u00b2\7\f\2\2\u00a6\u00b2\7+\2\2\u00a7\u00b2\7,\2\2\u00a8"+
		"\u00b2\7-\2\2\u00a9\u00b2\7.\2\2\u00aa\u00b2\7/\2\2\u00ab\u00b2\7\60\2"+
		"\2\u00ac\u00b2\7\61\2\2\u00ad\u00ae\7\62\2\2\u00ae\u00b2\7\63\2\2\u00af"+
		"\u00b0\7\26\2\2\u00b0\u00b2\7\27\2\2\u00b1\u0084\3\2\2\2\u00b1\u0089\3"+
		"\2\2\2\u00b1\u008a\3\2\2\2\u00b1\u008b\3\2\2\2\u00b1\u008c\3\2\2\2\u00b1"+
		"\u008d\3\2\2\2\u00b1\u008e\3\2\2\2\u00b1\u008f\3\2\2\2\u00b1\u0090\3\2"+
		"\2\2\u00b1\u0091\3\2\2\2\u00b1\u0092\3\2\2\2\u00b1\u0093\3\2\2\2\u00b1"+
		"\u0094\3\2\2\2\u00b1\u0095\3\2\2\2\u00b1\u0096\3\2\2\2\u00b1\u0097\3\2"+
		"\2\2\u00b1\u0098\3\2\2\2\u00b1\u0099\3\2\2\2\u00b1\u009a\3\2\2\2\u00b1"+
		"\u009b\3\2\2\2\u00b1\u009c\3\2\2\2\u00b1\u009d\3\2\2\2\u00b1\u009e\3\2"+
		"\2\2\u00b1\u009f\3\2\2\2\u00b1\u00a0\3\2\2\2\u00b1\u00a1\3\2\2\2\u00b1"+
		"\u00a2\3\2\2\2\u00b1\u00a3\3\2\2\2\u00b1\u00a4\3\2\2\2\u00b1\u00a5\3\2"+
		"\2\2\u00b1\u00a6\3\2\2\2\u00b1\u00a7\3\2\2\2\u00b1\u00a8\3\2\2\2\u00b1"+
		"\u00a9\3\2\2\2\u00b1\u00aa\3\2\2\2\u00b1\u00ab\3\2\2\2\u00b1\u00ac\3\2"+
		"\2\2\u00b1\u00ad\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\17\3\2\2\2\u00b3\u00b4"+
		"\t\t\2\2\u00b4\21\3\2\2\2\u00b5\u00b6\t\n\2\2\u00b6\23\3\2\2\2\u00b7\u00b8"+
		"\7X\2\2\u00b8\u00b9\7\t\2\2\u00b9\u00ba\5\26\f\2\u00ba\u00bb\7\n\2\2\u00bb"+
		"\25\3\2\2\2\u00bc\u00c2\5@!\2\u00bd\u00bf\7\t\2\2\u00be\u00c0\5\26\f\2"+
		"\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3"+
		"\7\n\2\2\u00c2\u00bd\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00cf\3\2\2\2\u00c4"+
		"\u00c5\7/\2\2\u00c5\u00cb\5@!\2\u00c6\u00c8\7\t\2\2\u00c7\u00c9\5\26\f"+
		"\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc"+
		"\7\n\2\2\u00cb\u00c6\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00c4\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\27\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\n\13\2\2\u00d3\31"+
		"\3\2\2\2\u00d4\u00d5\n\f\2\2\u00d5\33\3\2\2\2\u00d6\u00d7\n\r\2\2\u00d7"+
		"\35\3\2\2\2\u00d8\u00d9\n\16\2\2\u00d9\37\3\2\2\2\u00da\u00db\n\17\2\2"+
		"\u00db!\3\2\2\2\u00dc\u00dd\n\20\2\2\u00dd#\3\2\2\2\u00de\u00df\n\21\2"+
		"\2\u00df%\3\2\2\2\u00e0\u00e1\n\22\2\2\u00e1\'\3\2\2\2\u00e2\u00e3\n\23"+
		"\2\2\u00e3)\3\2\2\2\u00e4\u00e5\n\f\2\2\u00e5+\3\2\2\2\u00e6\u00e7\13"+
		"\2\2\2\u00e7-\3\2\2\2\u00e8\u00ed\7]\2\2\u00e9\u00ea\7\65\2\2\u00ea\u00ec"+
		"\7]\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f2\7\66"+
		"\2\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3"+
		"\u00f5\5\f\7\2\u00f4\u00e8\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5/\3\2\2\2"+
		"\u00f6\u00f7\t\24\2\2\u00f7\61\3\2\2\2\u00f8\u00fa\7N\2\2\u00f9\u00f8"+
		"\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\5\n\6\2\u00fc"+
		"\u00fe\7\67\2\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3"+
		"\2\2\2\u00ff\u00f9\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\63\3\2\2\2\u0103\u0104\5\62\32\2\u0104\65\3\2\2\2"+
		"\u0105\u0107\7\\\2\2\u0106\u0108\58\35\2\u0107\u0106\3\2\2\2\u0107\u0108"+
		"\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u010b\5:\36\2\u010a\u0109\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\7^\2\2\u010d\u010e\b\34"+
		"\1\2\u010e\67\3\2\2\2\u010f\u0110\5.\30\2\u01109\3\2\2\2\u0111\u0112\7"+
		"8\2\2\u0112\u0117\5<\37\2\u0113\u0114\7/\2\2\u0114\u0116\5<\37\2\u0115"+
		"\u0113\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2"+
		"\2\2\u0118\u0121\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011b\t\25\2\2\u011b"+
		"\u011d\5<\37\2\u011c\u011a\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3\2"+
		"\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u0111\3\2\2\2\u0120"+
		"\u011c\3\2\2\2\u0121;\3\2\2\2\u0122\u0124\7O\2\2\u0123\u0122\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0127\5\f\7\2\u0126\u0125\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\5.\30\2\u0129"+
		"=\3\2\2\2\u012a\u012c\7N\2\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2"+
		"\2\2\u0130\u0132\t\26\2\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0139\5@!\2\u0134\u0136\7\t\2\2\u0135\u0137\5\26"+
		"\f\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u013a\7\n\2\2\u0139\u0134\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013d\3\2"+
		"\2\2\u013b\u013c\7\26\2\2\u013c\u013e\7\27\2\2\u013d\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u0149\3\2\2\2\u013f\u0140\7\65\2\2\u0140\u0145\5"+
		"@!\2\u0141\u0142\7\t\2\2\u0142\u0143\5\26\f\2\u0143\u0144\7\n\2\2\u0144"+
		"\u0146\3\2\2\2\u0145\u0141\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2"+
		"\2\2\u0147\u013f\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014e\7N"+
		"\2\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0153\3\2\2\2\u014f"+
		"\u0153\5p9\2\u0150\u0153\7K\2\2\u0151\u0153\7L\2\2\u0152\u012d\3\2\2\2"+
		"\u0152\u014f\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153?\3"+
		"\2\2\2\u0154\u0156\t\27\2\2\u0155\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158A\3\2\2\2\u0159\u015c\5D#\2\u015a"+
		"\u015b\7/\2\2\u015b\u015d\5B\"\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2"+
		"\2\u015dC\3\2\2\2\u015e\u0162\5F$\2\u015f\u0160\5\20\t\2\u0160\u0161\5"+
		"D#\2\u0161\u0163\3\2\2\2\u0162\u015f\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"E\3\2\2\2\u0164\u016c\5H%\2\u0165\u0166\5H%\2\u0166\u0167\79\2\2\u0167"+
		"\u0168\5B\"\2\u0168\u0169\78\2\2\u0169\u016a\5F$\2\u016a\u016c\3\2\2\2"+
		"\u016b\u0164\3\2\2\2\u016b\u0165\3\2\2\2\u016cG\3\2\2\2\u016d\u0170\5"+
		"J&\2\u016e\u016f\7,\2\2\u016f\u0171\5H%\2\u0170\u016e\3\2\2\2\u0170\u0171"+
		"\3\2\2\2\u0171I\3\2\2\2\u0172\u0175\5L\'\2\u0173\u0174\7+\2\2\u0174\u0176"+
		"\5J&\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176K\3\2\2\2\u0177\u017a"+
		"\5N(\2\u0178\u0179\7\33\2\2\u0179\u017b\5L\'\2\u017a\u0178\3\2\2\2\u017a"+
		"\u017b\3\2\2\2\u017bM\3\2\2\2\u017c\u017f\5P)\2\u017d\u017e\7\32\2\2\u017e"+
		"\u0180\5N(\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180O\3\2\2\2\u0181"+
		"\u0184\5R*\2\u0182\u0183\7\3\2\2\u0183\u0185\5P)\2\u0184\u0182\3\2\2\2"+
		"\u0184\u0185\3\2\2\2\u0185Q\3\2\2\2\u0186\u018a\5T+\2\u0187\u0188\5\22"+
		"\n\2\u0188\u0189\5R*\2\u0189\u018b\3\2\2\2\u018a\u0187\3\2\2\2\u018a\u018b"+
		"\3\2\2\2\u018bS\3\2\2\2\u018c\u0190\5V,\2\u018d\u018e\5\4\3\2\u018e\u018f"+
		"\5T+\2\u018f\u0191\3\2\2\2\u0190\u018d\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"U\3\2\2\2\u0192\u0195\5X-\2\u0193\u0194\t\30\2\2\u0194\u0196\5V,\2\u0195"+
		"\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196W\3\2\2\2\u0197\u019a\5Z.\2\u0198"+
		"\u0199\t\31\2\2\u0199\u019b\5X-\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2"+
		"\2\2\u019bY\3\2\2\2\u019c\u019f\5\\/\2\u019d\u019e\t\32\2\2\u019e\u01a0"+
		"\5Z.\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0[\3\2\2\2\u01a1\u01a2"+
		"\7\62\2\2\u01a2\u01a3\5^\60\2\u01a3\u01a4\7\63\2\2\u01a4\u01a5\5\\/\2"+
		"\u01a5\u01a8\3\2\2\2\u01a6\u01a8\5`\61\2\u01a7\u01a1\3\2\2\2\u01a7\u01a6"+
		"\3\2\2\2\u01a8]\3\2\2\2\u01a9\u01ad\5> \2\u01aa\u01ac\5\n\6\2\u01ab\u01aa"+
		"\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae"+
		"_\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b1\5n8\2\u01b1\u01b2\5\\/\2\u01b2"+
		"\u01b8\3\2\2\2\u01b3\u01b8\5d\63\2\u01b4\u01b8\5f\64\2\u01b5\u01b8\5b"+
		"\62\2\u01b6\u01b8\5p9\2\u01b7\u01b0\3\2\2\2\u01b7\u01b3\3\2\2\2\u01b7"+
		"\u01b4\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b6\3\2\2\2\u01b8a\3\2\2\2"+
		"\u01b9\u01bb\7\65\2\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc"+
		"\3\2\2\2\u01bc\u01bd\7Y\2\2\u01bd\u01be\5> \2\u01be\u01c0\7\26\2\2\u01bf"+
		"\u01c1\5F$\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\3\2\2"+
		"\2\u01c2\u01c3\7\27\2\2\u01c3\u01d0\3\2\2\2\u01c4\u01c6\7\65\2\2\u01c5"+
		"\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\7Y"+
		"\2\2\u01c8\u01c9\5> \2\u01c9\u01cb\7\62\2\2\u01ca\u01cc\5B\"\2\u01cb\u01ca"+
		"\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\7\63\2\2"+
		"\u01ce\u01d0\3\2\2\2\u01cf\u01ba\3\2\2\2\u01cf\u01c5\3\2\2\2\u01d0c\3"+
		"\2\2\2\u01d1\u01d2\5\2\2\2\u01d2\u01d3\5\\/\2\u01d3e\3\2\2\2\u01d4\u01d5"+
		"\5h\65\2\u01d5\u01d6\5l\67\2\u01d6\u01e2\3\2\2\2\u01d7\u01d8\5h\65\2\u01d8"+
		"\u01d9\7\62\2\2\u01d9\u01da\5l\67\2\u01da\u01db\7\63\2\2\u01db\u01e2\3"+
		"\2\2\2\u01dc\u01dd\5h\65\2\u01dd\u01de\7\62\2\2\u01de\u01df\5j\66\2\u01df"+
		"\u01e0\7\63\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01d4\3\2\2\2\u01e1\u01d7\3"+
		"\2\2\2\u01e1\u01dc\3\2\2\2\u01e2g\3\2\2\2\u01e3\u01e4\7:\2\2\u01e4i\3"+
		"\2\2\2\u01e5\u01e9\5> \2\u01e6\u01e8\5\n\6\2\u01e7\u01e6\3\2\2\2\u01e8"+
		"\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01eak\3\2\2\2"+
		"\u01eb\u01e9\3\2\2\2\u01ec\u01ed\5`\61\2\u01edm\3\2\2\2\u01ee\u01ef\t"+
		"\33\2\2\u01efo\3\2\2\2\u01f0\u01f1\b9\1\2\u01f1\u01f2\5v<\2\u01f2\u0217"+
		"\3\2\2\2\u01f3\u01f4\f\t\2\2\u01f4\u01f5\7\26\2\2\u01f5\u01f6\5B\"\2\u01f6"+
		"\u01f7\7\27\2\2\u01f7\u0216\3\2\2\2\u01f8\u01f9\f\b\2\2\u01f9\u01fa\7"+
		"\62\2\2\u01fa\u01fb\5r:\2\u01fb\u01fc\7\63\2\2\u01fc\u0216\3\2\2\2\u01fd"+
		"\u01fe\f\7\2\2\u01fe\u0200\7;\2\2\u01ff\u0201\7X\2\2\u0200\u01ff\3\2\2"+
		"\2\u0200\u0201\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0216\5.\30\2\u0203\u0204"+
		"\f\6\2\2\u0204\u0206\7\61\2\2\u0205\u0207\7X\2\2\u0206\u0205\3\2\2\2\u0206"+
		"\u0207\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0216\5.\30\2\u0209\u020a\f\5"+
		"\2\2\u020a\u0216\5n8\2\u020b\u020c\f\4\2\2\u020c\u020d\7<\2\2\u020d\u0213"+
		"\5B\"\2\u020e\u0210\7\t\2\2\u020f\u0211\5r:\2\u0210\u020f\3\2\2\2\u0210"+
		"\u0211\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0214\7\n\2\2\u0213\u020e\3\2"+
		"\2\2\u0213\u0214\3\2\2\2\u0214\u0216\3\2\2\2\u0215\u01f3\3\2\2\2\u0215"+
		"\u01f8\3\2\2\2\u0215\u01fd\3\2\2\2\u0215\u0203\3\2\2\2\u0215\u0209\3\2"+
		"\2\2\u0215\u020b\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215\3\2\2\2\u0217"+
		"\u0218\3\2\2\2\u0218q\3\2\2\2\u0219\u0217\3\2\2\2\u021a\u021f\5t;\2\u021b"+
		"\u021c\7/\2\2\u021c\u021e\5t;\2\u021d\u021b\3\2\2\2\u021e\u0221\3\2\2"+
		"\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0223\3\2\2\2\u0221\u021f"+
		"\3\2\2\2\u0222\u021a\3\2\2\2\u0222\u0223\3\2\2\2\u0223s\3\2\2\2\u0224"+
		"\u0226\5D#\2\u0225\u0227\t\34\2\2\u0226\u0225\3\2\2\2\u0226\u0227\3\2"+
		"\2\2\u0227u\3\2\2\2\u0228\u022a\5.\30\2\u0229\u022b\t\34\2\2\u022a\u0229"+
		"\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u0236\3\2\2\2\u022c\u022e\5\6\4\2\u022d"+
		"\u022f\t\34\2\2\u022e\u022d\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0236\3"+
		"\2\2\2\u0230\u0231\7\62\2\2\u0231\u0232\5B\"\2\u0232\u0233\7\63\2\2\u0233"+
		"\u0236\3\2\2\2\u0234\u0236\79\2\2\u0235\u0228\3\2\2\2\u0235\u022c\3\2"+
		"\2\2\u0235\u0230\3\2\2\2\u0235\u0234\3\2\2\2\u0236w\3\2\2\2C\u0087\u00b1"+
		"\u00bf\u00c2\u00c8\u00cb\u00cf\u00ed\u00f1\u00f4\u00f9\u00fd\u0101\u0107"+
		"\u010a\u0117\u011e\u0120\u0123\u0126\u012d\u0131\u0136\u0139\u013d\u0145"+
		"\u0149\u014d\u0152\u0157\u015c\u0162\u016b\u0170\u0175\u017a\u017f\u0184"+
		"\u018a\u0190\u0195\u019a\u019f\u01a7\u01ad\u01b7\u01ba\u01c0\u01c5\u01cb"+
		"\u01cf\u01e1\u01e9\u0200\u0206\u0210\u0213\u0215\u0217\u021f\u0222\u0226"+
		"\u022a\u022e\u0235";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}