// Generated from /Users/hellomark/Documents/study/project/fuzzy2vec_mk/fuzzyc2cpg/src/main/antlr4/io/shiftleft/fuzzyc2cpg/Function.g4 by ANTLR 4.10.1
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
public class FunctionParser extends Parser {
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
		RULE_statements = 0, RULE_statement = 1, RULE_pre_opener = 2, RULE_pre_else = 3, 
		RULE_pre_closer = 4, RULE_comment = 5, RULE_opening_curly = 6, RULE_closing_curly = 7, 
		RULE_block_starter = 8, RULE_selection_or_iteration = 9, RULE_do_statement1 = 10, 
		RULE_for_init_statement = 11, RULE_jump_statement = 12, RULE_label = 13, 
		RULE_expr_statement = 14, RULE_condition = 15, RULE_init_declarator = 16, 
		RULE_declarator = 17, RULE_type_suffix = 18, RULE_simple_decl = 19, RULE_var_decl = 20, 
		RULE_init_declarator_list = 21, RULE_initializer = 22, RULE_initializer_list = 23, 
		RULE_param_decl_specifiers = 24, RULE_parameter_name = 25, RULE_param_type_list = 26, 
		RULE_param_type = 27, RULE_param_type_id = 28, RULE_unary_operator = 29, 
		RULE_relational_operator = 30, RULE_constant = 31, RULE_function_decl_specifiers = 32, 
		RULE_ptr_operator = 33, RULE_access_specifier = 34, RULE_operator = 35, 
		RULE_assignment_operator = 36, RULE_equality_operator = 37, RULE_template_decl = 38, 
		RULE_template_decl_param_list = 39, RULE_template_template = 40, RULE_template_decl_param = 41, 
		RULE_template_decl_keyword = 42, RULE_template_name = 43, RULE_template_args = 44, 
		RULE_template_args_param_list = 45, RULE_template_args_param = 46, RULE_no_brackets = 47, 
		RULE_no_brackets_curlies_or_squares = 48, RULE_no_brackets_or_semicolon = 49, 
		RULE_no_angle_brackets_or_brackets = 50, RULE_no_curlies = 51, RULE_no_squares = 52, 
		RULE_no_squares_or_semicolon = 53, RULE_no_comma_or_semicolon = 54, RULE_assign_water = 55, 
		RULE_assign_water_l2 = 56, RULE_water = 57, RULE_identifier = 58, RULE_number = 59, 
		RULE_ptrs = 60, RULE_func_ptrs = 61, RULE_rvalue_ref = 62, RULE_class_key = 63, 
		RULE_class_def = 64, RULE_class_name = 65, RULE_base_classes = 66, RULE_base_class = 67, 
		RULE_type_name = 68, RULE_base_type = 69, RULE_gcc_attribute = 70, RULE_expr = 71, 
		RULE_assign_expr = 72, RULE_conditional_expression = 73, RULE_or_expression = 74, 
		RULE_and_expression = 75, RULE_inclusive_or_expression = 76, RULE_exclusive_or_expression = 77, 
		RULE_bit_and_expression = 78, RULE_equality_expression = 79, RULE_relational_expression = 80, 
		RULE_shift_expression = 81, RULE_additive_expression = 82, RULE_multiplicative_expression = 83, 
		RULE_cast_expression = 84, RULE_cast_target = 85, RULE_unary_expression = 86, 
		RULE_new_expression = 87, RULE_unary_op_and_cast_expr = 88, RULE_sizeof_expression = 89, 
		RULE_sizeof = 90, RULE_sizeof_operand = 91, RULE_sizeof_operand2 = 92, 
		RULE_inc_dec = 93, RULE_postfix_expression = 94, RULE_function_argument_list = 95, 
		RULE_function_argument = 96, RULE_primary_expression = 97;
	private static String[] makeRuleNames() {
		return new String[] {
			"statements", "statement", "pre_opener", "pre_else", "pre_closer", "comment", 
			"opening_curly", "closing_curly", "block_starter", "selection_or_iteration", 
			"do_statement1", "for_init_statement", "jump_statement", "label", "expr_statement", 
			"condition", "init_declarator", "declarator", "type_suffix", "simple_decl", 
			"var_decl", "init_declarator_list", "initializer", "initializer_list", 
			"param_decl_specifiers", "parameter_name", "param_type_list", "param_type", 
			"param_type_id", "unary_operator", "relational_operator", "constant", 
			"function_decl_specifiers", "ptr_operator", "access_specifier", "operator", 
			"assignment_operator", "equality_operator", "template_decl", "template_decl_param_list", 
			"template_template", "template_decl_param", "template_decl_keyword", 
			"template_name", "template_args", "template_args_param_list", "template_args_param", 
			"no_brackets", "no_brackets_curlies_or_squares", "no_brackets_or_semicolon", 
			"no_angle_brackets_or_brackets", "no_curlies", "no_squares", "no_squares_or_semicolon", 
			"no_comma_or_semicolon", "assign_water", "assign_water_l2", "water", 
			"identifier", "number", "ptrs", "func_ptrs", "rvalue_ref", "class_key", 
			"class_def", "class_name", "base_classes", "base_class", "type_name", 
			"base_type", "gcc_attribute", "expr", "assign_expr", "conditional_expression", 
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
			null, "'('", "')'", "';'", "':'", "'='", "'['", "']'", "','", "'&'", 
			"'*'", "'+'", "'-'", "'~'", "'!'", "'<'", "'>'", "'<='", "'>='", "'inline'", 
			"'explicit'", "'friend'", "'static'", "'public'", "'private'", "'protected'", 
			"'class'", "'delete'", "'/'", "'%'", "'^'", "'|'", "'+='", "'-='", "'*='", 
			"'/='", "'%='", "'^='", "'&='", "'|='", "'>>'", "'<<'", "'>>='", "'<<='", 
			"'=='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'->*'", "'->'", "'typename'", 
			"'::'", "'[]'", "'restrict'", "'struct'", "'union'", "'enum'", "'?'", 
			"'sizeof'", "'.'", "'instanceof'", "'if'", "'else'", "'for'", "'while'", 
			"'break'", "'case'", "'continue'", "'switch'", "'do'", "'goto'", "'return'", 
			"'typedef'", "'extern'", "'void'", "'unsigned'", "'signed'", "'long'", 
			null, "'virtual'", "'try'", "'catch'", "'throw'", "'using'", "'namespace'", 
			"'auto'", "'register'", "'operator'", "'template'", "'new'", "'extends'", 
			"'implements'", "'__attribute__'", null, "'{'", "'}'", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'...'"
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
	public String getGrammarFileName() { return "Function.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	   public void preProcSkipToEnd() {
	        Stack<Object> CurlyStack = new Stack<>();
	        Object o = new Object();
	        int t = _input.LA(1);

	        while(t != EOF && !(CurlyStack.empty() && t == PRE_ENDIF)){

	            if(t == PRE_IF) CurlyStack.push(o);
	            else if(t == PRE_ENDIF) CurlyStack.pop();

	            consume();
	            t = _input.LA(1);
	        }
	        if(t != EOF) consume();
	   }



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


	public FunctionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<Pre_openerContext> pre_opener() {
			return getRuleContexts(Pre_openerContext.class);
		}
		public Pre_openerContext pre_opener(int i) {
			return getRuleContext(Pre_openerContext.class,i);
		}
		public List<Pre_closerContext> pre_closer() {
			return getRuleContexts(Pre_closerContext.class);
		}
		public Pre_closerContext pre_closer(int i) {
			return getRuleContext(Pre_closerContext.class,i);
		}
		public List<Pre_elseContext> pre_else() {
			return getRuleContexts(Pre_elseContext.class);
		}
		public Pre_elseContext pre_else(int i) {
			return getRuleContext(Pre_elseContext.class,i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << IF))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (EXTERN - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (EXTENDS - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (GCC_ATTRIBUTE - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (BINARY_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (MULTILINE_STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (LINE_COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				setState(203);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(196);
					pre_opener();
					}
					break;
				case 2:
					{
					setState(197);
					pre_closer();
					}
					break;
				case 3:
					{
					setState(198);
					pre_else();
					preProcSkipToEnd(); 
					}
					break;
				case 4:
					{
					setState(201);
					comment();
					}
					break;
				case 5:
					{
					setState(202);
					statement();
					}
					break;
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

	public static class StatementContext extends ParserRuleContext {
		public Opening_curlyContext opening_curly() {
			return getRuleContext(Opening_curlyContext.class,0);
		}
		public Closing_curlyContext closing_curly() {
			return getRuleContext(Closing_curlyContext.class,0);
		}
		public Block_starterContext block_starter() {
			return getRuleContext(Block_starterContext.class,0);
		}
		public Jump_statementContext jump_statement() {
			return getRuleContext(Jump_statementContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Simple_declContext simple_decl() {
			return getRuleContext(Simple_declContext.class,0);
		}
		public Expr_statementContext expr_statement() {
			return getRuleContext(Expr_statementContext.class,0);
		}
		public WaterContext water() {
			return getRuleContext(WaterContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				opening_curly();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				closing_curly();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				block_starter();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(211);
				jump_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(212);
				label();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(213);
				simple_decl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(214);
				expr_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(215);
				water();
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

	public static class Pre_openerContext extends ParserRuleContext {
		public TerminalNode PRE_IF() { return getToken(FunctionParser.PRE_IF, 0); }
		public Pre_openerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_opener; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_opener(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_opener(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitPre_opener(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pre_openerContext pre_opener() throws RecognitionException {
		Pre_openerContext _localctx = new Pre_openerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pre_opener);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(PRE_IF);
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

	public static class Pre_elseContext extends ParserRuleContext {
		public TerminalNode PRE_ELSE() { return getToken(FunctionParser.PRE_ELSE, 0); }
		public Pre_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitPre_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pre_elseContext pre_else() throws RecognitionException {
		Pre_elseContext _localctx = new Pre_elseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pre_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(PRE_ELSE);
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

	public static class Pre_closerContext extends ParserRuleContext {
		public TerminalNode PRE_ENDIF() { return getToken(FunctionParser.PRE_ENDIF, 0); }
		public Pre_closerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre_closer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPre_closer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPre_closer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitPre_closer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pre_closerContext pre_closer() throws RecognitionException {
		Pre_closerContext _localctx = new Pre_closerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pre_closer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(PRE_ENDIF);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(FunctionParser.COMMENT, 0); }
		public TerminalNode LINE_COMMENT() { return getToken(FunctionParser.LINE_COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
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

	public static class Opening_curlyContext extends ParserRuleContext {
		public TerminalNode OPENING_CURLY() { return getToken(FunctionParser.OPENING_CURLY, 0); }
		public Opening_curlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opening_curly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterOpening_curly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitOpening_curly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitOpening_curly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opening_curlyContext opening_curly() throws RecognitionException {
		Opening_curlyContext _localctx = new Opening_curlyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_opening_curly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(OPENING_CURLY);
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

	public static class Closing_curlyContext extends ParserRuleContext {
		public TerminalNode CLOSING_CURLY() { return getToken(FunctionParser.CLOSING_CURLY, 0); }
		public Closing_curlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closing_curly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterClosing_curly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitClosing_curly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitClosing_curly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Closing_curlyContext closing_curly() throws RecognitionException {
		Closing_curlyContext _localctx = new Closing_curlyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_closing_curly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(CLOSING_CURLY);
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

	public static class Block_starterContext extends ParserRuleContext {
		public Selection_or_iterationContext selection_or_iteration() {
			return getRuleContext(Selection_or_iterationContext.class,0);
		}
		public Block_starterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_starter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterBlock_starter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitBlock_starter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitBlock_starter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_starterContext block_starter() throws RecognitionException {
		Block_starterContext _localctx = new Block_starterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block_starter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			selection_or_iteration();
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

	public static class Selection_or_iterationContext extends ParserRuleContext {
		public Selection_or_iterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_or_iteration; }
	 
		public Selection_or_iterationContext() { }
		public void copyFrom(Selection_or_iterationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Try_statementContext extends Selection_or_iterationContext {
		public TerminalNode TRY() { return getToken(FunctionParser.TRY, 0); }
		public Try_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterTry_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitTry_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitTry_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class If_statementContext extends Selection_or_iterationContext {
		public TerminalNode IF() { return getToken(FunctionParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public If_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Catch_statementContext extends Selection_or_iterationContext {
		public TerminalNode CATCH() { return getToken(FunctionParser.CATCH, 0); }
		public Param_typeContext param_type() {
			return getRuleContext(Param_typeContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(FunctionParser.ELLIPSIS, 0); }
		public Catch_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterCatch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitCatch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitCatch_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class For_statementContext extends Selection_or_iterationContext {
		public TerminalNode FOR() { return getToken(FunctionParser.FOR, 0); }
		public For_init_statementContext for_init_statement() {
			return getRuleContext(For_init_statementContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public For_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Else_statementContext extends Selection_or_iterationContext {
		public TerminalNode ELSE() { return getToken(FunctionParser.ELSE, 0); }
		public Else_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitElse_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitElse_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Switch_statementContext extends Selection_or_iterationContext {
		public TerminalNode SWITCH() { return getToken(FunctionParser.SWITCH, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Switch_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterSwitch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitSwitch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitSwitch_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Do_statementContext extends Selection_or_iterationContext {
		public TerminalNode DO() { return getToken(FunctionParser.DO, 0); }
		public Do_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterDo_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitDo_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitDo_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class While_statementContext extends Selection_or_iterationContext {
		public TerminalNode WHILE() { return getToken(FunctionParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public While_statementContext(Selection_or_iterationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selection_or_iterationContext selection_or_iteration() throws RecognitionException {
		Selection_or_iterationContext _localctx = new Selection_or_iterationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_selection_or_iteration);
		int _la;
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRY:
				_localctx = new Try_statementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(TRY);
				}
				break;
			case CATCH:
				_localctx = new Catch_statementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(CATCH);
				setState(234);
				match(T__0);
				setState(237);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case T__55:
				case T__56:
				case T__57:
				case VOID:
				case UNSIGNED:
				case SIGNED:
				case LONG:
				case CV_QUALIFIER:
				case AUTO:
				case REGISTER:
				case ALPHA_NUMERIC:
				case HEX_LITERAL:
				case DECIMAL_LITERAL:
				case OCTAL_LITERAL:
				case BINARY_LITERAL:
				case FLOATING_POINT_LITERAL:
				case CHAR:
				case STRING:
				case MULTILINE_STRING:
					{
					setState(235);
					param_type();
					}
					break;
				case ELLIPSIS:
					{
					setState(236);
					match(ELLIPSIS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(239);
				match(T__1);
				}
				break;
			case IF:
				_localctx = new If_statementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				match(IF);
				setState(241);
				match(T__0);
				setState(242);
				condition();
				setState(243);
				match(T__1);
				}
				break;
			case ELSE:
				_localctx = new Else_statementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				match(ELSE);
				}
				break;
			case SWITCH:
				_localctx = new Switch_statementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
				match(SWITCH);
				setState(247);
				match(T__0);
				setState(248);
				condition();
				setState(249);
				match(T__1);
				}
				break;
			case FOR:
				_localctx = new For_statementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(251);
				match(FOR);
				setState(252);
				match(T__0);
				setState(255);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case T__47:
				case T__48:
				case T__52:
				case T__55:
				case T__56:
				case T__57:
				case T__59:
				case TYPEDEF:
				case VOID:
				case UNSIGNED:
				case SIGNED:
				case LONG:
				case CV_QUALIFIER:
				case AUTO:
				case TEMPLATE:
				case NEW:
				case ALPHA_NUMERIC:
				case HEX_LITERAL:
				case DECIMAL_LITERAL:
				case OCTAL_LITERAL:
				case BINARY_LITERAL:
				case FLOATING_POINT_LITERAL:
				case CHAR:
				case STRING:
				case MULTILINE_STRING:
					{
					setState(253);
					for_init_statement();
					}
					break;
				case T__2:
					{
					setState(254);
					match(T__2);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(258);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(257);
					condition();
					}
					break;
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(260);
					match(T__2);
					}
				}

				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__59))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (ALPHA_NUMERIC - 91)) | (1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)) | (1L << (BINARY_LITERAL - 91)) | (1L << (FLOATING_POINT_LITERAL - 91)) | (1L << (CHAR - 91)) | (1L << (STRING - 91)) | (1L << (MULTILINE_STRING - 91)))) != 0)) {
					{
					setState(263);
					expr();
					}
				}

				setState(266);
				match(T__1);
				}
				break;
			case DO:
				_localctx = new Do_statementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(267);
				match(DO);
				}
				break;
			case WHILE:
				_localctx = new While_statementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(268);
				match(WHILE);
				setState(269);
				match(T__0);
				setState(270);
				condition();
				setState(271);
				match(T__1);
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

	public static class Do_statement1Context extends ParserRuleContext {
		public TerminalNode DO() { return getToken(FunctionParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(FunctionParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Do_statement1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_statement1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterDo_statement1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitDo_statement1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitDo_statement1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_statement1Context do_statement1() throws RecognitionException {
		Do_statement1Context _localctx = new Do_statement1Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_do_statement1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(DO);
			setState(276);
			statement();
			setState(277);
			match(WHILE);
			setState(278);
			match(T__0);
			setState(279);
			expr();
			setState(280);
			match(T__1);
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

	public static class For_init_statementContext extends ParserRuleContext {
		public Simple_declContext simple_decl() {
			return getRuleContext(Simple_declContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public For_init_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_init_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFor_init_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFor_init_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitFor_init_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_init_statementContext for_init_statement() throws RecognitionException {
		For_init_statementContext _localctx = new For_init_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_for_init_statement);
		int _la;
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				simple_decl();
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(283);
					match(T__3);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				expr();
				setState(287);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				expr();
				setState(290);
				match(T__3);
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

	public static class Jump_statementContext extends ParserRuleContext {
		public Jump_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_statement; }
	 
		public Jump_statementContext() { }
		public void copyFrom(Jump_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ThrowStatementContext extends Jump_statementContext {
		public TerminalNode THROW() { return getToken(FunctionParser.THROW, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ThrowStatementContext(Jump_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakStatementContext extends Jump_statementContext {
		public TerminalNode BREAK() { return getToken(FunctionParser.BREAK, 0); }
		public BreakStatementContext(Jump_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueStatementContext extends Jump_statementContext {
		public TerminalNode CONTINUE() { return getToken(FunctionParser.CONTINUE, 0); }
		public ContinueStatementContext(Jump_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStatementContext extends Jump_statementContext {
		public TerminalNode RETURN() { return getToken(FunctionParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatementContext(Jump_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GotoStatementContext extends Jump_statementContext {
		public TerminalNode GOTO() { return getToken(FunctionParser.GOTO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GotoStatementContext(Jump_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterGotoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitGotoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitGotoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jump_statementContext jump_statement() throws RecognitionException {
		Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_jump_statement);
		int _la;
		try {
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(BREAK);
				setState(295);
				match(T__2);
				}
				break;
			case CONTINUE:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(CONTINUE);
				setState(297);
				match(T__2);
				}
				break;
			case GOTO:
				_localctx = new GotoStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				match(GOTO);
				setState(299);
				identifier();
				setState(300);
				match(T__2);
				}
				break;
			case RETURN:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(302);
				match(RETURN);
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__59))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (ALPHA_NUMERIC - 91)) | (1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)) | (1L << (BINARY_LITERAL - 91)) | (1L << (FLOATING_POINT_LITERAL - 91)) | (1L << (CHAR - 91)) | (1L << (STRING - 91)) | (1L << (MULTILINE_STRING - 91)))) != 0)) {
					{
					setState(303);
					expr();
					}
				}

				setState(306);
				match(T__2);
				}
				break;
			case THROW:
				_localctx = new ThrowStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(307);
				match(THROW);
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__59))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (ALPHA_NUMERIC - 91)) | (1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)) | (1L << (BINARY_LITERAL - 91)) | (1L << (FLOATING_POINT_LITERAL - 91)) | (1L << (CHAR - 91)) | (1L << (STRING - 91)) | (1L << (MULTILINE_STRING - 91)))) != 0)) {
					{
					setState(308);
					expr();
					}
				}

				setState(311);
				match(T__2);
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

	public static class LabelContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(FunctionParser.CHAR, 0); }
		public TerminalNode CASE() { return getToken(FunctionParser.CASE, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_label);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASE) {
				{
				setState(314);
				match(CASE);
				}
			}

			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case ALPHA_NUMERIC:
				{
				setState(317);
				identifier();
				}
				break;
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
				{
				setState(318);
				number();
				}
				break;
			case CHAR:
				{
				setState(319);
				match(CHAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(322);
			match(T__3);
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

	public static class Expr_statementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterExpr_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitExpr_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitExpr_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_statementContext expr_statement() throws RecognitionException {
		Expr_statementContext _localctx = new Expr_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expr_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__59))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (ALPHA_NUMERIC - 91)) | (1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)) | (1L << (BINARY_LITERAL - 91)) | (1L << (FLOATING_POINT_LITERAL - 91)) | (1L << (CHAR - 91)) | (1L << (STRING - 91)) | (1L << (MULTILINE_STRING - 91)))) != 0)) {
				{
				setState(324);
				expr();
				}
			}

			setState(327);
			match(T__2);
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

	public static class ConditionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condition);
		try {
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				type_name();
				setState(331);
				declarator();
				setState(332);
				match(T__4);
				setState(333);
				assign_expr();
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

	public static class Init_declaratorContext extends ParserRuleContext {
		public Init_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator; }
	 
		public Init_declaratorContext() { }
		public void copyFrom(Init_declaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InitDeclWithAssignContext extends Init_declaratorContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclWithAssignContext(Init_declaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterInitDeclWithAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitInitDeclWithAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitInitDeclWithAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InitDeclSimpleContext extends Init_declaratorContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitDeclSimpleContext(Init_declaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterInitDeclSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitInitDeclSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitInitDeclSimple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InitDeclWithCallContext extends Init_declaratorContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InitDeclWithCallContext(Init_declaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterInitDeclWithCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitInitDeclWithCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitInitDeclWithCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_declaratorContext init_declarator() throws RecognitionException {
		Init_declaratorContext _localctx = new Init_declaratorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_init_declarator);
		int _la;
		try {
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new InitDeclWithCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				declarator();
				setState(338);
				match(T__0);
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__59))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (ALPHA_NUMERIC - 91)) | (1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)) | (1L << (BINARY_LITERAL - 91)) | (1L << (FLOATING_POINT_LITERAL - 91)) | (1L << (CHAR - 91)) | (1L << (STRING - 91)) | (1L << (MULTILINE_STRING - 91)))) != 0)) {
					{
					setState(339);
					expr();
					}
				}

				setState(342);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new InitDeclWithAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				declarator();
				setState(345);
				match(T__4);
				setState(346);
				initializer();
				}
				break;
			case 3:
				_localctx = new InitDeclSimpleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(348);
				declarator();
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

	public static class DeclaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PtrsContext ptrs() {
			return getRuleContext(PtrsContext.class,0);
		}
		public Template_argsContext template_args() {
			return getRuleContext(Template_argsContext.class,0);
		}
		public Type_suffixContext type_suffix() {
			return getRuleContext(Type_suffixContext.class,0);
		}
		public Func_ptrsContext func_ptrs() {
			return getRuleContext(Func_ptrsContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_declarator);
		int _la;
		try {
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8 || _la==T__9 || _la==CV_QUALIFIER) {
					{
					setState(351);
					ptrs();
					}
				}

				setState(354);
				identifier();
				setState(356);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(355);
					template_args();
					}
					break;
				}
				setState(359);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(358);
					type_suffix();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8 || _la==T__9 || _la==CV_QUALIFIER) {
					{
					setState(361);
					ptrs();
					}
				}

				setState(364);
				match(T__0);
				setState(365);
				func_ptrs();
				setState(366);
				identifier();
				setState(367);
				match(T__1);
				setState(368);
				type_suffix();
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

	public static class Type_suffixContext extends ParserRuleContext {
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Param_type_listContext param_type_list() {
			return getRuleContext(Param_type_listContext.class,0);
		}
		public Type_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterType_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitType_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitType_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_suffixContext type_suffix() throws RecognitionException {
		Type_suffixContext _localctx = new Type_suffixContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type_suffix);
		int _la;
		try {
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(372);
				match(T__5);
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__59))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (ALPHA_NUMERIC - 91)) | (1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)) | (1L << (BINARY_LITERAL - 91)) | (1L << (FLOATING_POINT_LITERAL - 91)) | (1L << (CHAR - 91)) | (1L << (STRING - 91)) | (1L << (MULTILINE_STRING - 91)))) != 0)) {
					{
					setState(373);
					conditional_expression();
					}
				}

				setState(376);
				match(T__6);
				}
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				param_type_list();
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

	public static class Simple_declContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public TerminalNode TYPEDEF() { return getToken(FunctionParser.TYPEDEF, 0); }
		public Simple_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterSimple_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitSimple_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitSimple_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_declContext simple_decl() throws RecognitionException {
		Simple_declContext _localctx = new Simple_declContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_simple_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPEDEF) {
				{
				setState(380);
				match(TYPEDEF);
				}
			}

			}
			setState(383);
			var_decl();
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

	public static class Var_declContext extends ParserRuleContext {
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
	 
		public Var_declContext() { }
		public void copyFrom(Var_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclByClassContext extends Var_declContext {
		public Class_defContext class_def() {
			return getRuleContext(Class_defContext.class,0);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public DeclByClassContext(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterDeclByClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitDeclByClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitDeclByClass(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclByTypeContext extends Var_declContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public List<Template_declContext> template_decl() {
			return getRuleContexts(Template_declContext.class);
		}
		public Template_declContext template_decl(int i) {
			return getRuleContext(Template_declContext.class,i);
		}
		public DeclByTypeContext(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterDeclByType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitDeclByType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitDeclByType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_var_decl);
		int _la;
		try {
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new DeclByClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				class_def();
				setState(387);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(386);
					init_declarator_list();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new DeclByTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEMPLATE) {
					{
					{
					setState(389);
					template_decl();
					}
					}
					setState(394);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(395);
				type_name();
				setState(396);
				init_declarator_list();
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

	public static class Init_declarator_listContext extends ParserRuleContext {
		public List<Init_declaratorContext> init_declarator() {
			return getRuleContexts(Init_declaratorContext.class);
		}
		public Init_declaratorContext init_declarator(int i) {
			return getRuleContext(Init_declaratorContext.class,i);
		}
		public Init_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterInit_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitInit_declarator_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitInit_declarator_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_declarator_listContext init_declarator_list() throws RecognitionException {
		Init_declarator_listContext _localctx = new Init_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_init_declarator_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			init_declarator();
			setState(405);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(401);
					match(T__7);
					setState(402);
					init_declarator();
					}
					} 
				}
				setState(407);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(408);
				match(T__2);
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

	public static class InitializerContext extends ParserRuleContext {
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public TerminalNode OPENING_CURLY() { return getToken(FunctionParser.OPENING_CURLY, 0); }
		public Initializer_listContext initializer_list() {
			return getRuleContext(Initializer_listContext.class,0);
		}
		public TerminalNode CLOSING_CURLY() { return getToken(FunctionParser.CLOSING_CURLY, 0); }
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_initializer);
		try {
			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__47:
			case T__48:
			case T__52:
			case T__59:
			case NEW:
			case ALPHA_NUMERIC:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case BINARY_LITERAL:
			case FLOATING_POINT_LITERAL:
			case CHAR:
			case STRING:
			case MULTILINE_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				assign_expr();
				}
				break;
			case OPENING_CURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				match(OPENING_CURLY);
				setState(413);
				initializer_list();
				setState(414);
				match(CLOSING_CURLY);
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

	public static class Initializer_listContext extends ParserRuleContext {
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public Initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterInitializer_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitInitializer_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitInitializer_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initializer_listContext initializer_list() throws RecognitionException {
		Initializer_listContext _localctx = new Initializer_listContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_initializer_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			initializer();
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(419);
				match(T__7);
				setState(420);
				initializer();
				}
				}
				setState(425);
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

	public static class Param_decl_specifiersContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode AUTO() { return getToken(FunctionParser.AUTO, 0); }
		public TerminalNode REGISTER() { return getToken(FunctionParser.REGISTER, 0); }
		public Param_decl_specifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl_specifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterParam_decl_specifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitParam_decl_specifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitParam_decl_specifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_decl_specifiersContext param_decl_specifiers() throws RecognitionException {
		Param_decl_specifiersContext _localctx = new Param_decl_specifiersContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_param_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(426);
				_la = _input.LA(1);
				if ( !(_la==AUTO || _la==REGISTER) ) {
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
			setState(429);
			type_name();
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

	public static class Parameter_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterParameter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitParameter_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitParameter_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_nameContext parameter_name() throws RecognitionException {
		Parameter_nameContext _localctx = new Parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_parameter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
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

	public static class Param_type_listContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(FunctionParser.VOID, 0); }
		public List<Param_typeContext> param_type() {
			return getRuleContexts(Param_typeContext.class);
		}
		public Param_typeContext param_type(int i) {
			return getRuleContext(Param_typeContext.class,i);
		}
		public Param_type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_type_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterParam_type_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitParam_type_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitParam_type_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_type_listContext param_type_list() throws RecognitionException {
		Param_type_listContext _localctx = new Param_type_listContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_param_type_list);
		int _la;
		try {
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				match(T__0);
				setState(434);
				match(VOID);
				setState(435);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				match(T__0);
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__55) | (1L << T__56) | (1L << T__57))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (VOID - 76)) | (1L << (UNSIGNED - 76)) | (1L << (SIGNED - 76)) | (1L << (LONG - 76)) | (1L << (CV_QUALIFIER - 76)) | (1L << (AUTO - 76)) | (1L << (REGISTER - 76)) | (1L << (ALPHA_NUMERIC - 76)) | (1L << (HEX_LITERAL - 76)) | (1L << (DECIMAL_LITERAL - 76)) | (1L << (OCTAL_LITERAL - 76)) | (1L << (BINARY_LITERAL - 76)) | (1L << (FLOATING_POINT_LITERAL - 76)) | (1L << (CHAR - 76)) | (1L << (STRING - 76)) | (1L << (MULTILINE_STRING - 76)))) != 0)) {
					{
					setState(437);
					param_type();
					setState(442);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(438);
						match(T__7);
						setState(439);
						param_type();
						}
						}
						setState(444);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(447);
				match(T__1);
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

	public static class Param_typeContext extends ParserRuleContext {
		public Param_decl_specifiersContext param_decl_specifiers() {
			return getRuleContext(Param_decl_specifiersContext.class,0);
		}
		public Param_type_idContext param_type_id() {
			return getRuleContext(Param_type_idContext.class,0);
		}
		public Param_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterParam_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitParam_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitParam_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_typeContext param_type() throws RecognitionException {
		Param_typeContext _localctx = new Param_typeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_param_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			param_decl_specifiers();
			setState(451);
			param_type_id();
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

	public static class Param_type_idContext extends ParserRuleContext {
		public Param_type_idContext param_type_id() {
			return getRuleContext(Param_type_idContext.class,0);
		}
		public PtrsContext ptrs() {
			return getRuleContext(PtrsContext.class,0);
		}
		public Rvalue_refContext rvalue_ref() {
			return getRuleContext(Rvalue_refContext.class,0);
		}
		public Type_suffixContext type_suffix() {
			return getRuleContext(Type_suffixContext.class,0);
		}
		public Parameter_nameContext parameter_name() {
			return getRuleContext(Parameter_nameContext.class,0);
		}
		public Param_type_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_type_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterParam_type_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitParam_type_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitParam_type_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_type_idContext param_type_id() throws RecognitionException {
		Param_type_idContext _localctx = new Param_type_idContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_param_type_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case CV_QUALIFIER:
				{
				setState(453);
				ptrs();
				}
				break;
			case T__45:
				{
				setState(454);
				rvalue_ref();
				}
				break;
			case T__0:
			case T__1:
			case T__5:
			case T__7:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case ALPHA_NUMERIC:
				break;
			default:
				break;
			}
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(457);
				match(T__0);
				setState(458);
				param_type_id();
				setState(459);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0) || _la==ALPHA_NUMERIC) {
					{
					setState(461);
					parameter_name();
					}
				}

				}
				break;
			}
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__5) {
				{
				setState(466);
				type_suffix();
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterRelational_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitRelational_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitRelational_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_operatorContext relational_operator() throws RecognitionException {
		Relational_operatorContext _localctx = new Relational_operatorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_relational_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode HEX_LITERAL() { return getToken(FunctionParser.HEX_LITERAL, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(FunctionParser.OCTAL_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(FunctionParser.DECIMAL_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(FunctionParser.BINARY_LITERAL, 0); }
		public TerminalNode STRING() { return getToken(FunctionParser.STRING, 0); }
		public TerminalNode MULTILINE_STRING() { return getToken(FunctionParser.MULTILINE_STRING, 0); }
		public TerminalNode CHAR() { return getToken(FunctionParser.CHAR, 0); }
		public TerminalNode FLOATING_POINT_LITERAL() { return getToken(FunctionParser.FLOATING_POINT_LITERAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
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
		public TerminalNode VIRTUAL() { return getToken(FunctionParser.VIRTUAL, 0); }
		public Function_decl_specifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_decl_specifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFunction_decl_specifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFunction_decl_specifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitFunction_decl_specifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_decl_specifiersContext function_decl_specifiers() throws RecognitionException {
		Function_decl_specifiersContext _localctx = new Function_decl_specifiersContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_function_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			_la = _input.LA(1);
			if ( !(((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (T__18 - 19)) | (1L << (T__19 - 19)) | (1L << (T__20 - 19)) | (1L << (T__21 - 19)) | (1L << (VIRTUAL - 19)))) != 0)) ) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPtr_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPtr_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitPtr_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ptr_operatorContext ptr_operator() throws RecognitionException {
		Ptr_operatorContext _localctx = new Ptr_operatorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ptr_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__9) ) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAccess_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAccess_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitAccess_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_specifierContext access_specifier() throws RecognitionException {
		Access_specifierContext _localctx = new Access_specifierContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_access_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
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
		public TerminalNode NEW() { return getToken(FunctionParser.NEW, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_operator);
		int _la;
		try {
			setState(526);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(481);
				_la = _input.LA(1);
				if ( !(_la==T__26 || _la==NEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(482);
					match(T__5);
					setState(483);
					match(T__6);
					}
				}

				}
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(487);
				match(T__11);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(488);
				match(T__9);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 5);
				{
				setState(489);
				match(T__27);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 6);
				{
				setState(490);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 7);
				{
				setState(491);
				match(T__29);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 8);
				{
				setState(492);
				match(T__8);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 9);
				{
				setState(493);
				match(T__30);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 10);
				{
				setState(494);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 11);
				{
				setState(495);
				match(T__13);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 12);
				{
				setState(496);
				match(T__4);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 13);
				{
				setState(497);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 14);
				{
				setState(498);
				match(T__15);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 15);
				{
				setState(499);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 16);
				{
				setState(500);
				match(T__32);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 17);
				{
				setState(501);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 18);
				{
				setState(502);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 19);
				{
				setState(503);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 20);
				{
				setState(504);
				match(T__36);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 21);
				{
				setState(505);
				match(T__37);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 22);
				{
				setState(506);
				match(T__38);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 23);
				{
				setState(507);
				match(T__39);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 24);
				{
				setState(508);
				match(T__40);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 25);
				{
				setState(509);
				match(T__41);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 26);
				{
				setState(510);
				match(T__42);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 27);
				{
				setState(511);
				match(T__43);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 28);
				{
				setState(512);
				match(T__44);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 29);
				{
				setState(513);
				match(T__16);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 30);
				{
				setState(514);
				match(T__17);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 31);
				{
				setState(515);
				match(T__45);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 32);
				{
				setState(516);
				match(T__46);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 33);
				{
				setState(517);
				match(T__47);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 34);
				{
				setState(518);
				match(T__48);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 35);
				{
				setState(519);
				match(T__7);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 36);
				{
				setState(520);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 37);
				{
				setState(521);
				match(T__50);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 38);
				{
				setState(522);
				match(T__0);
				setState(523);
				match(T__1);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 39);
				{
				setState(524);
				match(T__5);
				setState(525);
				match(T__6);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAssignment_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitAssignment_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__41) | (1L << T__42))) != 0)) ) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterEquality_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitEquality_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitEquality_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_operatorContext equality_operator() throws RecognitionException {
		Equality_operatorContext _localctx = new Equality_operatorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_equality_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			_la = _input.LA(1);
			if ( !(_la==T__43 || _la==T__44) ) {
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
		public TerminalNode TEMPLATE() { return getToken(FunctionParser.TEMPLATE, 0); }
		public Template_decl_param_listContext template_decl_param_list() {
			return getRuleContext(Template_decl_param_listContext.class,0);
		}
		public Template_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterTemplate_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitTemplate_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitTemplate_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_declContext template_decl() throws RecognitionException {
		Template_declContext _localctx = new Template_declContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_template_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(TEMPLATE);
			setState(533);
			match(T__14);
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__51))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (CV_QUALIFIER - 80)) | (1L << (TEMPLATE - 80)) | (1L << (ALPHA_NUMERIC - 80)))) != 0)) {
				{
				setState(534);
				template_decl_param_list(0);
				}
			}

			setState(537);
			match(T__15);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterTemplate_decl_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitTemplate_decl_param_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitTemplate_decl_param_list(this);
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
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_template_decl_param_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEMPLATE:
				{
				setState(540);
				template_template();
				setState(541);
				template_decl_keyword();
				setState(542);
				template_name();
				}
				break;
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__51:
			case CV_QUALIFIER:
			case ALPHA_NUMERIC:
				{
				setState(544);
				template_decl_param();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(552);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Template_decl_param_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_template_decl_param_list);
					setState(547);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(548);
					match(T__7);
					setState(549);
					template_decl_param();
					}
					} 
				}
				setState(554);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
		public TerminalNode TEMPLATE() { return getToken(FunctionParser.TEMPLATE, 0); }
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterTemplate_template(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitTemplate_template(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitTemplate_template(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_templateContext template_template() throws RecognitionException {
		Template_templateContext _localctx = new Template_templateContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_template_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(TEMPLATE);
			setState(556);
			match(T__14);
			setState(561); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(557);
				template_decl_keyword();
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(558);
					match(T__7);
					}
				}

				}
				}
				setState(563); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__25 || _la==T__51 );
			setState(565);
			match(T__15);
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
		public TerminalNode CV_QUALIFIER() { return getToken(FunctionParser.CV_QUALIFIER, 0); }
		public Template_decl_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_decl_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterTemplate_decl_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitTemplate_decl_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitTemplate_decl_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_decl_paramContext template_decl_param() throws RecognitionException {
		Template_decl_paramContext _localctx = new Template_decl_paramContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_template_decl_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(567);
				template_decl_keyword();
				}
				break;
			case 2:
				{
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CV_QUALIFIER) {
					{
					setState(568);
					match(CV_QUALIFIER);
					}
				}

				setState(571);
				identifier();
				}
				break;
			}
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(574);
				template_name();
				}
				break;
			}
			setState(578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(577);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterTemplate_decl_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitTemplate_decl_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitTemplate_decl_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_decl_keywordContext template_decl_keyword() throws RecognitionException {
		Template_decl_keywordContext _localctx = new Template_decl_keywordContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_template_decl_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			_la = _input.LA(1);
			if ( !(_la==T__25 || _la==T__51) ) {
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
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(FunctionParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(FunctionParser.ALPHA_NUMERIC, i);
		}
		public TerminalNode ELLIPSIS() { return getToken(FunctionParser.ELLIPSIS, 0); }
		public Template_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterTemplate_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitTemplate_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitTemplate_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_nameContext template_name() throws RecognitionException {
		Template_nameContext _localctx = new Template_nameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_template_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(583); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(582);
					match(ALPHA_NUMERIC);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(585); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(587);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterTemplate_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitTemplate_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitTemplate_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_argsContext template_args() throws RecognitionException {
		Template_argsContext _localctx = new Template_argsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_template_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(T__14);
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (VOID - 76)) | (1L << (LONG - 76)) | (1L << (CV_QUALIFIER - 76)) | (1L << (AUTO - 76)) | (1L << (ALPHA_NUMERIC - 76)))) != 0)) {
				{
				setState(591);
				template_args_param_list(0);
				}
			}

			setState(594);
			match(T__15);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterTemplate_args_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitTemplate_args_param_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitTemplate_args_param_list(this);
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
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_template_args_param_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(597);
			template_args_param();
			}
			_ctx.stop = _input.LT(-1);
			setState(604);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Template_args_param_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_template_args_param_list);
					setState(599);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(600);
					match(T__7);
					setState(601);
					template_args_param();
					}
					} 
				}
				setState(606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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
		public TerminalNode CV_QUALIFIER() { return getToken(FunctionParser.CV_QUALIFIER, 0); }
		public Ptr_operatorContext ptr_operator() {
			return getRuleContext(Ptr_operatorContext.class,0);
		}
		public Template_args_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_args_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterTemplate_args_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitTemplate_args_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitTemplate_args_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_args_paramContext template_args_param() throws RecognitionException {
		Template_args_paramContext _localctx = new Template_args_paramContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_template_args_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CV_QUALIFIER) {
				{
				setState(607);
				match(CV_QUALIFIER);
				}
			}

			setState(610);
			base_type();
			setState(612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(611);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNo_brackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNo_brackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitNo_brackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_bracketsContext no_brackets() throws RecognitionException {
		No_bracketsContext _localctx = new No_bracketsContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_no_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__0 || _la==T__1) ) {
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
		public TerminalNode OPENING_CURLY() { return getToken(FunctionParser.OPENING_CURLY, 0); }
		public TerminalNode CLOSING_CURLY() { return getToken(FunctionParser.CLOSING_CURLY, 0); }
		public No_brackets_curlies_or_squaresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_brackets_curlies_or_squares; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNo_brackets_curlies_or_squares(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNo_brackets_curlies_or_squares(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitNo_brackets_curlies_or_squares(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_brackets_curlies_or_squaresContext no_brackets_curlies_or_squares() throws RecognitionException {
		No_brackets_curlies_or_squaresContext _localctx = new No_brackets_curlies_or_squaresContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_no_brackets_curlies_or_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__5) | (1L << T__6))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNo_brackets_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNo_brackets_or_semicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitNo_brackets_or_semicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_brackets_or_semicolonContext no_brackets_or_semicolon() throws RecognitionException {
		No_brackets_or_semicolonContext _localctx = new No_brackets_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_no_brackets_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) ) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNo_angle_brackets_or_brackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNo_angle_brackets_or_brackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitNo_angle_brackets_or_brackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_angle_brackets_or_bracketsContext no_angle_brackets_or_brackets() throws RecognitionException {
		No_angle_brackets_or_bracketsContext _localctx = new No_angle_brackets_or_bracketsContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_no_angle_brackets_or_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__14) | (1L << T__15))) != 0)) ) {
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
		public TerminalNode OPENING_CURLY() { return getToken(FunctionParser.OPENING_CURLY, 0); }
		public TerminalNode CLOSING_CURLY() { return getToken(FunctionParser.CLOSING_CURLY, 0); }
		public No_curliesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_curlies; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNo_curlies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNo_curlies(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitNo_curlies(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_curliesContext no_curlies() throws RecognitionException {
		No_curliesContext _localctx = new No_curliesContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_no_curlies);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNo_squares(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNo_squares(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitNo_squares(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_squaresContext no_squares() throws RecognitionException {
		No_squaresContext _localctx = new No_squaresContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_no_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__5 || _la==T__6) ) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNo_squares_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNo_squares_or_semicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitNo_squares_or_semicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_squares_or_semicolonContext no_squares_or_semicolon() throws RecognitionException {
		No_squares_or_semicolonContext _localctx = new No_squares_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_no_squares_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__6))) != 0)) ) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNo_comma_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNo_comma_or_semicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitNo_comma_or_semicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_comma_or_semicolonContext no_comma_or_semicolon() throws RecognitionException {
		No_comma_or_semicolonContext _localctx = new No_comma_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_no_comma_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__2 || _la==T__7) ) {
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
		public TerminalNode OPENING_CURLY() { return getToken(FunctionParser.OPENING_CURLY, 0); }
		public TerminalNode CLOSING_CURLY() { return getToken(FunctionParser.CLOSING_CURLY, 0); }
		public Assign_waterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_water; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAssign_water(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAssign_water(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitAssign_water(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_waterContext assign_water() throws RecognitionException {
		Assign_waterContext _localctx = new Assign_waterContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_assign_water);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
		public TerminalNode OPENING_CURLY() { return getToken(FunctionParser.OPENING_CURLY, 0); }
		public TerminalNode CLOSING_CURLY() { return getToken(FunctionParser.CLOSING_CURLY, 0); }
		public Assign_water_l2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_water_l2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAssign_water_l2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAssign_water_l2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitAssign_water_l2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_water_l2Context assign_water_l2() throws RecognitionException {
		Assign_water_l2Context _localctx = new Assign_water_l2Context(_ctx, getState());
		enterRule(_localctx, 112, RULE_assign_water_l2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__5) | (1L << T__6))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterWater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitWater(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitWater(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WaterContext water() throws RecognitionException {
		WaterContext _localctx = new WaterContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_water);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
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
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(FunctionParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(FunctionParser.ALPHA_NUMERIC, i);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_identifier);
		try {
			int _alt;
			setState(648);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(636);
				match(ALPHA_NUMERIC);
				setState(641);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(637);
						match(T__52);
						setState(638);
						match(ALPHA_NUMERIC);
						}
						} 
					}
					setState(643);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				}
				}
				setState(645);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(644);
					match(T__53);
					}
					break;
				}
				}
				break;
			case T__22:
			case T__23:
			case T__24:
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(647);
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
		public TerminalNode HEX_LITERAL() { return getToken(FunctionParser.HEX_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(FunctionParser.DECIMAL_LITERAL, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(FunctionParser.OCTAL_LITERAL, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
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
		public List<TerminalNode> CV_QUALIFIER() { return getTokens(FunctionParser.CV_QUALIFIER); }
		public TerminalNode CV_QUALIFIER(int i) {
			return getToken(FunctionParser.CV_QUALIFIER, i);
		}
		public PtrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPtrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPtrs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitPtrs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PtrsContext ptrs() throws RecognitionException {
		PtrsContext _localctx = new PtrsContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_ptrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(653);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CV_QUALIFIER) {
					{
					setState(652);
					match(CV_QUALIFIER);
					}
				}

				setState(655);
				ptr_operator();
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__54) {
					{
					setState(656);
					match(T__54);
					}
				}

				}
				}
				setState(661); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__8 || _la==T__9 || _la==CV_QUALIFIER );
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFunc_ptrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFunc_ptrs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitFunc_ptrs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_ptrsContext func_ptrs() throws RecognitionException {
		Func_ptrsContext _localctx = new Func_ptrsContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_func_ptrs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterRvalue_ref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitRvalue_ref(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitRvalue_ref(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rvalue_refContext rvalue_ref() throws RecognitionException {
		Rvalue_refContext _localctx = new Rvalue_refContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_rvalue_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(T__45);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterClass_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitClass_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitClass_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_keyContext class_key() throws RecognitionException {
		Class_keyContext _localctx = new Class_keyContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_class_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__55) | (1L << T__56) | (1L << T__57))) != 0)) ) {
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
		public TerminalNode OPENING_CURLY() { return getToken(FunctionParser.OPENING_CURLY, 0); }
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterClass_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitClass_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitClass_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEMPLATE) {
				{
				{
				setState(669);
				template_decl();
				}
				}
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(675);
			class_key();
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GCC_ATTRIBUTE) {
				{
				setState(676);
				gcc_attribute();
				}
			}

			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0) || _la==ALPHA_NUMERIC) {
				{
				setState(679);
				class_name();
				}
			}

			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(682);
				template_args();
				}
			}

			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3 || _la==EXTENDS || _la==IMPLEMENTS) {
				{
				setState(685);
				base_classes();
				}
			}

			setState(688);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterClass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitClass_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitClass_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
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
		public List<TerminalNode> EXTENDS() { return getTokens(FunctionParser.EXTENDS); }
		public TerminalNode EXTENDS(int i) {
			return getToken(FunctionParser.EXTENDS, i);
		}
		public List<TerminalNode> IMPLEMENTS() { return getTokens(FunctionParser.IMPLEMENTS); }
		public TerminalNode IMPLEMENTS(int i) {
			return getToken(FunctionParser.IMPLEMENTS, i);
		}
		public Base_classesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_classes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterBase_classes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitBase_classes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitBase_classes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_classesContext base_classes() throws RecognitionException {
		Base_classesContext _localctx = new Base_classesContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_base_classes);
		int _la;
		try {
			setState(708);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(693);
				match(T__3);
				setState(694);
				base_class();
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(695);
					match(T__7);
					setState(696);
					base_class();
					}
					}
					setState(701);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case EXTENDS:
			case IMPLEMENTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(704); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(702);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==IMPLEMENTS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(703);
					base_class();
					}
					}
					setState(706); 
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
		public TerminalNode VIRTUAL() { return getToken(FunctionParser.VIRTUAL, 0); }
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterBase_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitBase_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitBase_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_classContext base_class() throws RecognitionException {
		Base_classContext _localctx = new Base_classContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_base_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRTUAL) {
				{
				setState(710);
				match(VIRTUAL);
				}
			}

			setState(714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(713);
				access_specifier();
				}
				break;
			}
			setState(716);
			identifier();
			setState(718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(717);
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
		public List<TerminalNode> CV_QUALIFIER() { return getTokens(FunctionParser.CV_QUALIFIER); }
		public TerminalNode CV_QUALIFIER(int i) {
			return getToken(FunctionParser.CV_QUALIFIER, i);
		}
		public Class_keyContext class_key() {
			return getRuleContext(Class_keyContext.class,0);
		}
		public TerminalNode UNSIGNED() { return getToken(FunctionParser.UNSIGNED, 0); }
		public TerminalNode SIGNED() { return getToken(FunctionParser.SIGNED, 0); }
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_type_name);
		int _la;
		try {
			setState(755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CV_QUALIFIER) {
					{
					{
					setState(720);
					match(CV_QUALIFIER);
					}
					}
					setState(725);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(729);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__25:
				case T__55:
				case T__56:
				case T__57:
					{
					setState(726);
					class_key();
					}
					break;
				case UNSIGNED:
					{
					setState(727);
					match(UNSIGNED);
					}
					break;
				case SIGNED:
					{
					setState(728);
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
				setState(731);
				base_type();
				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(732);
					template_args();
					}
				}

				setState(737);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(735);
					match(T__5);
					setState(736);
					match(T__6);
					}
					break;
				}
				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__52) {
					{
					{
					setState(739);
					match(T__52);
					setState(740);
					base_type();
					setState(742);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__14) {
						{
						setState(741);
						template_args();
						}
					}

					}
					}
					setState(748);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(750);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(749);
					match(CV_QUALIFIER);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(752);
				postfix_expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(753);
				match(UNSIGNED);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(754);
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
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(FunctionParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(FunctionParser.ALPHA_NUMERIC, i);
		}
		public List<TerminalNode> AUTO() { return getTokens(FunctionParser.AUTO); }
		public TerminalNode AUTO(int i) {
			return getToken(FunctionParser.AUTO, i);
		}
		public List<TerminalNode> VOID() { return getTokens(FunctionParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(FunctionParser.VOID, i);
		}
		public List<TerminalNode> LONG() { return getTokens(FunctionParser.LONG); }
		public TerminalNode LONG(int i) {
			return getToken(FunctionParser.LONG, i);
		}
		public List<TerminalNode> ELLIPSIS() { return getTokens(FunctionParser.ELLIPSIS); }
		public TerminalNode ELLIPSIS(int i) {
			return getToken(FunctionParser.ELLIPSIS, i);
		}
		public Base_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterBase_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitBase_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitBase_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_typeContext base_type() throws RecognitionException {
		Base_typeContext _localctx = new Base_typeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_base_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(761); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(757);
					_la = _input.LA(1);
					if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (VOID - 76)) | (1L << (LONG - 76)) | (1L << (AUTO - 76)) | (1L << (ALPHA_NUMERIC - 76)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(759);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
					case 1:
						{
						setState(758);
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
				setState(763); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
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
		public TerminalNode GCC_ATTRIBUTE() { return getToken(FunctionParser.GCC_ATTRIBUTE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Gcc_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gcc_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterGcc_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitGcc_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitGcc_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gcc_attributeContext gcc_attribute() throws RecognitionException {
		Gcc_attributeContext _localctx = new Gcc_attributeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_gcc_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			match(GCC_ATTRIBUTE);
			setState(766);
			match(T__0);
			setState(767);
			match(T__0);
			setState(768);
			identifier();
			setState(769);
			match(T__1);
			setState(770);
			match(T__1);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			assign_expr();
			setState(775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(773);
				match(T__7);
				setState(774);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAssign_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAssign_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitAssign_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_exprContext assign_expr() throws RecognitionException {
		Assign_exprContext _localctx = new Assign_exprContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_assign_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			conditional_expression();
			setState(781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(778);
				assignment_operator();
				setState(779);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNormOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNormOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitNormOr(this);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterCndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitCndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitCndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_conditional_expression);
		try {
			setState(790);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				_localctx = new NormOrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				or_expression();
				}
				break;
			case 2:
				_localctx = new CndExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(784);
				or_expression();
				{
				setState(785);
				match(T__58);
				setState(786);
				expr();
				setState(787);
				match(T__3);
				setState(788);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterOr_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitOr_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitOr_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_expressionContext or_expression() throws RecognitionException {
		Or_expressionContext _localctx = new Or_expressionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_or_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			and_expression();
			setState(795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(793);
				match(T__46);
				setState(794);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAnd_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitAnd_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_and_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			inclusive_or_expression();
			setState(800);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(798);
				match(T__45);
				setState(799);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterInclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitInclusive_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitInclusive_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inclusive_or_expressionContext inclusive_or_expression() throws RecognitionException {
		Inclusive_or_expressionContext _localctx = new Inclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_inclusive_or_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			exclusive_or_expression();
			setState(805);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(803);
				match(T__30);
				setState(804);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterExclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitExclusive_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitExclusive_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exclusive_or_expressionContext exclusive_or_expression() throws RecognitionException {
		Exclusive_or_expressionContext _localctx = new Exclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_exclusive_or_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			bit_and_expression();
			setState(810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(808);
				match(T__29);
				setState(809);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterBit_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitBit_and_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitBit_and_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bit_and_expressionContext bit_and_expression() throws RecognitionException {
		Bit_and_expressionContext _localctx = new Bit_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_bit_and_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			equality_expression();
			setState(815);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(813);
				match(T__8);
				setState(814);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitEquality_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitEquality_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_equality_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			relational_expression();
			setState(821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(818);
				equality_operator();
				setState(819);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitRelational_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitRelational_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_relational_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			shift_expression();
			setState(827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(824);
				relational_operator();
				setState(825);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterShift_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitShift_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitShift_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			additive_expression();
			setState(832);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(830);
				_la = _input.LA(1);
				if ( !(_la==T__39 || _la==T__40) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(831);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterAdditive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitAdditive_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitAdditive_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			multiplicative_expression();
			setState(837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(835);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(836);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterMultiplicative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitMultiplicative_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitMultiplicative_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_multiplicative_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			cast_expression();
			setState(842);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(840);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__27) | (1L << T__28))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(841);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterCast_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitCast_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitCast_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cast_expressionContext cast_expression() throws RecognitionException {
		Cast_expressionContext _localctx = new Cast_expressionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_cast_expression);
		try {
			setState(850);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(844);
				match(T__0);
				setState(845);
				cast_target();
				setState(846);
				match(T__1);
				setState(847);
				cast_expression();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(849);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterCast_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitCast_target(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitCast_target(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cast_targetContext cast_target() throws RecognitionException {
		Cast_targetContext _localctx = new Cast_targetContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_cast_target);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			type_name();
			setState(856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__9) {
				{
				{
				setState(853);
				ptr_operator();
				}
				}
				setState(858);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitUnary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitUnary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_unary_expression);
		try {
			int _alt;
			setState(876);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__47:
			case T__48:
				enterOuterAlt(_localctx, 1);
				{
				setState(859);
				inc_dec();
				setState(860);
				cast_expression();
				}
				break;
			case T__52:
			case NEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(862);
				new_expression();
				}
				break;
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(863);
				unary_op_and_cast_expr();
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 4);
				{
				setState(864);
				sizeof_expression();
				}
				break;
			case T__0:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
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
				setState(873);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(870);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(865);
							identifier();
							setState(866);
							match(T__50);
							}
							} 
						}
						setState(872);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
					}
					}
					break;
				}
				setState(875);
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
		public TerminalNode NEW() { return getToken(FunctionParser.NEW, 0); }
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterNew_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitNew_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitNew_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_expressionContext new_expression() throws RecognitionException {
		New_expressionContext _localctx = new New_expressionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_new_expression);
		int _la;
		try {
			setState(911);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(879);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__52) {
					{
					setState(878);
					match(T__52);
					}
				}

				setState(881);
				match(NEW);
				setState(882);
				type_name();
				setState(883);
				match(T__5);
				setState(885);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__59))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (ALPHA_NUMERIC - 91)) | (1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)) | (1L << (BINARY_LITERAL - 91)) | (1L << (FLOATING_POINT_LITERAL - 91)) | (1L << (CHAR - 91)) | (1L << (STRING - 91)) | (1L << (MULTILINE_STRING - 91)))) != 0)) {
					{
					setState(884);
					conditional_expression();
					}
				}

				setState(887);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(890);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__52) {
					{
					setState(889);
					match(T__52);
					}
				}

				setState(892);
				match(NEW);
				setState(893);
				type_name();
				setState(894);
				match(T__0);
				setState(896);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__59))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (ALPHA_NUMERIC - 91)) | (1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)) | (1L << (BINARY_LITERAL - 91)) | (1L << (FLOATING_POINT_LITERAL - 91)) | (1L << (CHAR - 91)) | (1L << (STRING - 91)) | (1L << (MULTILINE_STRING - 91)))) != 0)) {
					{
					setState(895);
					expr();
					}
				}

				setState(898);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(901);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__52) {
					{
					setState(900);
					match(T__52);
					}
				}

				setState(903);
				match(NEW);
				setState(904);
				postfix_expression(0);
				setState(905);
				match(T__0);
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__59))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (ALPHA_NUMERIC - 91)) | (1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)) | (1L << (BINARY_LITERAL - 91)) | (1L << (FLOATING_POINT_LITERAL - 91)) | (1L << (CHAR - 91)) | (1L << (STRING - 91)) | (1L << (MULTILINE_STRING - 91)))) != 0)) {
					{
					setState(906);
					expr();
					}
				}

				setState(909);
				match(T__1);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterUnary_op_and_cast_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitUnary_op_and_cast_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitUnary_op_and_cast_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_op_and_cast_exprContext unary_op_and_cast_expr() throws RecognitionException {
		Unary_op_and_cast_exprContext _localctx = new Unary_op_and_cast_exprContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_unary_op_and_cast_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			unary_operator();
			setState(914);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterSizeof_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitSizeof_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitSizeof_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sizeof_expressionContext sizeof_expression() throws RecognitionException {
		Sizeof_expressionContext _localctx = new Sizeof_expressionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_sizeof_expression);
		try {
			setState(929);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(916);
				sizeof();
				setState(917);
				sizeof_operand2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(919);
				sizeof();
				setState(920);
				match(T__0);
				setState(921);
				sizeof_operand2();
				setState(922);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(924);
				sizeof();
				setState(925);
				match(T__0);
				setState(926);
				sizeof_operand();
				setState(927);
				match(T__1);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterSizeof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitSizeof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitSizeof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeofContext sizeof() throws RecognitionException {
		SizeofContext _localctx = new SizeofContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_sizeof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterSizeof_operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitSizeof_operand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitSizeof_operand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sizeof_operandContext sizeof_operand() throws RecognitionException {
		Sizeof_operandContext _localctx = new Sizeof_operandContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_sizeof_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			type_name();
			setState(937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__9) {
				{
				{
				setState(934);
				ptr_operator();
				}
				}
				setState(939);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterSizeof_operand2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitSizeof_operand2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitSizeof_operand2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sizeof_operand2Context sizeof_operand2() throws RecognitionException {
		Sizeof_operand2Context _localctx = new Sizeof_operand2Context(_ctx, getState());
		enterRule(_localctx, 184, RULE_sizeof_operand2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterInc_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitInc_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitInc_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inc_decContext inc_dec() throws RecognitionException {
		Inc_decContext _localctx = new Inc_decContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_inc_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			_la = _input.LA(1);
			if ( !(_la==T__47 || _la==T__48) ) {
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
		public TerminalNode TEMPLATE() { return getToken(FunctionParser.TEMPLATE, 0); }
		public MemberAccessContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitMemberAccess(this);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterIncDecOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitIncDecOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitIncDecOp(this);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitInstance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitInstance(this);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPrimaryOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPrimaryOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitPrimaryOnly(this);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitFuncCall(this);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterArrayIndexing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitArrayIndexing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitArrayIndexing(this);
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
		public TerminalNode TEMPLATE() { return getToken(FunctionParser.TEMPLATE, 0); }
		public PtrMemberAccessContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPtrMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPtrMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitPtrMemberAccess(this);
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
		int _startState = 188;
		enterRecursionRule(_localctx, 188, RULE_postfix_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimaryOnlyContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(945);
			primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(983);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(981);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayIndexingContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(947);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(948);
						match(T__5);
						setState(949);
						expr();
						setState(950);
						match(T__6);
						}
						break;
					case 2:
						{
						_localctx = new FuncCallContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(952);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(953);
						match(T__0);
						setState(954);
						function_argument_list();
						setState(955);
						match(T__1);
						}
						break;
					case 3:
						{
						_localctx = new MemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(957);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(958);
						match(T__60);
						setState(960);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(959);
							match(TEMPLATE);
							}
						}

						{
						setState(962);
						identifier();
						}
						}
						break;
					case 4:
						{
						_localctx = new PtrMemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(963);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(964);
						match(T__50);
						setState(966);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(965);
							match(TEMPLATE);
							}
						}

						{
						setState(968);
						identifier();
						}
						}
						break;
					case 5:
						{
						_localctx = new IncDecOpContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(969);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(970);
						inc_dec();
						}
						break;
					case 6:
						{
						_localctx = new InstanceContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(971);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(972);
						match(T__61);
						setState(973);
						expr();
						setState(979);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
						case 1:
							{
							setState(974);
							match(T__14);
							setState(976);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
							case 1:
								{
								setState(975);
								function_argument_list();
								}
								break;
							}
							setState(978);
							match(T__15);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(985);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFunction_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFunction_argument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitFunction_argument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_argument_listContext function_argument_list() throws RecognitionException {
		Function_argument_listContext _localctx = new Function_argument_listContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_function_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__47) | (1L << T__48) | (1L << T__52) | (1L << T__59))) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (NEW - 91)) | (1L << (ALPHA_NUMERIC - 91)) | (1L << (HEX_LITERAL - 91)) | (1L << (DECIMAL_LITERAL - 91)) | (1L << (OCTAL_LITERAL - 91)) | (1L << (BINARY_LITERAL - 91)) | (1L << (FLOATING_POINT_LITERAL - 91)) | (1L << (CHAR - 91)) | (1L << (STRING - 91)) | (1L << (MULTILINE_STRING - 91)))) != 0)) {
				{
				setState(986);
				function_argument();
				setState(991);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(987);
					match(T__7);
					setState(988);
					function_argument();
					}
					}
					setState(993);
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
		public TerminalNode COMMENT() { return getToken(FunctionParser.COMMENT, 0); }
		public TerminalNode LINE_COMMENT() { return getToken(FunctionParser.LINE_COMMENT, 0); }
		public Function_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterFunction_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitFunction_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitFunction_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_argumentContext function_argument() throws RecognitionException {
		Function_argumentContext _localctx = new Function_argumentContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_function_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			assign_expr();
			setState(998);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT || _la==LINE_COMMENT) {
				{
				setState(997);
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
		public TerminalNode COMMENT() { return getToken(FunctionParser.COMMENT, 0); }
		public TerminalNode LINE_COMMENT() { return getToken(FunctionParser.LINE_COMMENT, 0); }
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
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionListener ) ((FunctionListener)listener).exitPrimary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionVisitor ) return ((FunctionVisitor<? extends T>)visitor).visitPrimary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_primary_expression);
		int _la;
		try {
			setState(1012);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1000);
				identifier();
				setState(1002);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1001);
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
				setState(1004);
				constant();
				setState(1006);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(1005);
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
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(1008);
				match(T__0);
				setState(1009);
				expr();
				setState(1010);
				match(T__1);
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
		case 39:
			return template_decl_param_list_sempred((Template_decl_param_listContext)_localctx, predIndex);
		case 45:
			return template_args_param_list_sempred((Template_args_param_listContext)_localctx, predIndex);
		case 94:
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
		"\u0004\u0001r\u03f7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007^\u0002"+
		"_\u0007_\u0002`\u0007`\u0002a\u0007a\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u00cc\b\u0000"+
		"\n\u0000\f\u0000\u00cf\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00d9"+
		"\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t"+
		"\u00ee\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u0100\b\t\u0001\t\u0003\t\u0103\b\t\u0001\t\u0003\t\u0106\b\t\u0001"+
		"\t\u0003\t\u0109\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u0112\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0003\u000b\u011d\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0125"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u0131\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u0136"+
		"\b\f\u0001\f\u0003\f\u0139\b\f\u0001\r\u0003\r\u013c\b\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u0141\b\r\u0001\r\u0001\r\u0001\u000e\u0003\u000e\u0146"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0150\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u0155\b\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u015e"+
		"\b\u0010\u0001\u0011\u0003\u0011\u0161\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u0165\b\u0011\u0001\u0011\u0003\u0011\u0168\b\u0011\u0001"+
		"\u0011\u0003\u0011\u016b\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0173\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u0177\b\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u017b"+
		"\b\u0012\u0001\u0013\u0003\u0013\u017e\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u0184\b\u0014\u0001\u0014\u0005\u0014"+
		"\u0187\b\u0014\n\u0014\f\u0014\u018a\t\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u018f\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005"+
		"\u0015\u0194\b\u0015\n\u0015\f\u0015\u0197\t\u0015\u0001\u0015\u0003\u0015"+
		"\u019a\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u01a1\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u01a6\b\u0017\n\u0017\f\u0017\u01a9\t\u0017\u0001\u0018\u0003\u0018\u01ac"+
		"\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005"+
		"\u001a\u01b9\b\u001a\n\u001a\f\u001a\u01bc\t\u001a\u0003\u001a\u01be\b"+
		"\u001a\u0001\u001a\u0003\u001a\u01c1\b\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0003\u001c\u01c8\b\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01cf\b\u001c\u0003"+
		"\u001c\u01d1\b\u001c\u0001\u001c\u0003\u001c\u01d4\b\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0003#\u01e5\b#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003"+
		"#\u020f\b#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001&\u0003&\u0218"+
		"\b&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003"+
		"\'\u0222\b\'\u0001\'\u0001\'\u0001\'\u0005\'\u0227\b\'\n\'\f\'\u022a\t"+
		"\'\u0001(\u0001(\u0001(\u0001(\u0003(\u0230\b(\u0004(\u0232\b(\u000b("+
		"\f(\u0233\u0001(\u0001(\u0001)\u0001)\u0003)\u023a\b)\u0001)\u0003)\u023d"+
		"\b)\u0001)\u0003)\u0240\b)\u0001)\u0003)\u0243\b)\u0001*\u0001*\u0001"+
		"+\u0004+\u0248\b+\u000b+\f+\u0249\u0001+\u0003+\u024d\b+\u0001,\u0001"+
		",\u0003,\u0251\b,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0005-\u025b\b-\n-\f-\u025e\t-\u0001.\u0003.\u0261\b.\u0001.\u0001."+
		"\u0003.\u0265\b.\u0001/\u0001/\u00010\u00010\u00011\u00011\u00012\u0001"+
		"2\u00013\u00013\u00014\u00014\u00015\u00015\u00016\u00016\u00017\u0001"+
		"7\u00018\u00018\u00019\u00019\u0001:\u0001:\u0001:\u0005:\u0280\b:\n:"+
		"\f:\u0283\t:\u0001:\u0003:\u0286\b:\u0001:\u0003:\u0289\b:\u0001;\u0001"+
		";\u0001<\u0003<\u028e\b<\u0001<\u0001<\u0003<\u0292\b<\u0004<\u0294\b"+
		"<\u000b<\f<\u0295\u0001=\u0001=\u0001>\u0001>\u0001?\u0001?\u0001@\u0005"+
		"@\u029f\b@\n@\f@\u02a2\t@\u0001@\u0001@\u0003@\u02a6\b@\u0001@\u0003@"+
		"\u02a9\b@\u0001@\u0003@\u02ac\b@\u0001@\u0003@\u02af\b@\u0001@\u0001@"+
		"\u0001@\u0001A\u0001A\u0001B\u0001B\u0001B\u0001B\u0005B\u02ba\bB\nB\f"+
		"B\u02bd\tB\u0001B\u0001B\u0004B\u02c1\bB\u000bB\fB\u02c2\u0003B\u02c5"+
		"\bB\u0001C\u0003C\u02c8\bC\u0001C\u0003C\u02cb\bC\u0001C\u0001C\u0003"+
		"C\u02cf\bC\u0001D\u0005D\u02d2\bD\nD\fD\u02d5\tD\u0001D\u0001D\u0001D"+
		"\u0003D\u02da\bD\u0001D\u0001D\u0003D\u02de\bD\u0001D\u0001D\u0003D\u02e2"+
		"\bD\u0001D\u0001D\u0001D\u0003D\u02e7\bD\u0005D\u02e9\bD\nD\fD\u02ec\t"+
		"D\u0001D\u0003D\u02ef\bD\u0001D\u0001D\u0001D\u0003D\u02f4\bD\u0001E\u0001"+
		"E\u0003E\u02f8\bE\u0004E\u02fa\bE\u000bE\fE\u02fb\u0001F\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001G\u0001G\u0001G\u0003G\u0308\bG\u0001"+
		"H\u0001H\u0001H\u0001H\u0003H\u030e\bH\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0003I\u0317\bI\u0001J\u0001J\u0001J\u0003J\u031c\bJ\u0001"+
		"K\u0001K\u0001K\u0003K\u0321\bK\u0001L\u0001L\u0001L\u0003L\u0326\bL\u0001"+
		"M\u0001M\u0001M\u0003M\u032b\bM\u0001N\u0001N\u0001N\u0003N\u0330\bN\u0001"+
		"O\u0001O\u0001O\u0001O\u0003O\u0336\bO\u0001P\u0001P\u0001P\u0001P\u0003"+
		"P\u033c\bP\u0001Q\u0001Q\u0001Q\u0003Q\u0341\bQ\u0001R\u0001R\u0001R\u0003"+
		"R\u0346\bR\u0001S\u0001S\u0001S\u0003S\u034b\bS\u0001T\u0001T\u0001T\u0001"+
		"T\u0001T\u0001T\u0003T\u0353\bT\u0001U\u0001U\u0005U\u0357\bU\nU\fU\u035a"+
		"\tU\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0005"+
		"V\u0365\bV\nV\fV\u0368\tV\u0003V\u036a\bV\u0001V\u0003V\u036d\bV\u0001"+
		"W\u0003W\u0370\bW\u0001W\u0001W\u0001W\u0001W\u0003W\u0376\bW\u0001W\u0001"+
		"W\u0001W\u0003W\u037b\bW\u0001W\u0001W\u0001W\u0001W\u0003W\u0381\bW\u0001"+
		"W\u0001W\u0001W\u0003W\u0386\bW\u0001W\u0001W\u0001W\u0001W\u0003W\u038c"+
		"\bW\u0001W\u0001W\u0003W\u0390\bW\u0001X\u0001X\u0001X\u0001Y\u0001Y\u0001"+
		"Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001"+
		"Y\u0003Y\u03a2\bY\u0001Z\u0001Z\u0001[\u0001[\u0005[\u03a8\b[\n[\f[\u03ab"+
		"\t[\u0001\\\u0001\\\u0001]\u0001]\u0001^\u0001^\u0001^\u0001^\u0001^\u0001"+
		"^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001"+
		"^\u0003^\u03c1\b^\u0001^\u0001^\u0001^\u0001^\u0003^\u03c7\b^\u0001^\u0001"+
		"^\u0001^\u0001^\u0001^\u0001^\u0001^\u0001^\u0003^\u03d1\b^\u0001^\u0003"+
		"^\u03d4\b^\u0005^\u03d6\b^\n^\f^\u03d9\t^\u0001_\u0001_\u0001_\u0005_"+
		"\u03de\b_\n_\f_\u03e1\t_\u0003_\u03e3\b_\u0001`\u0001`\u0003`\u03e7\b"+
		"`\u0001a\u0001a\u0003a\u03eb\ba\u0001a\u0001a\u0003a\u03ef\ba\u0001a\u0001"+
		"a\u0001a\u0001a\u0003a\u03f5\ba\u0001a\u0000\u0003NZ\u00bcb\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u0000\u001d\u0001\u0000no\u0001\u0000"+
		"WX\u0001\u0000\t\u000e\u0001\u0000\u000f\u0012\u0001\u0000fm\u0002\u0000"+
		"\u0013\u0016QQ\u0001\u0000\t\n\u0001\u0000\u0017\u001a\u0002\u0000\u001b"+
		"\u001b[[\u0003\u0000\u0005\u0005 \'*+\u0001\u0000,-\u0002\u0000\u001a"+
		"\u001a44\u0001\u0000\u0001\u0002\u0003\u0000\u0001\u0002\u0006\u0007`"+
		"a\u0001\u0000\u0001\u0003\u0002\u0000\u0001\u0002\u000f\u0010\u0001\u0000"+
		"`a\u0001\u0000\u0006\u0007\u0002\u0000\u0003\u0003\u0006\u0007\u0002\u0000"+
		"\u0003\u0003\b\b\u0003\u0000\u0001\u0003\u0006\b`a\u0001\u0000fh\u0002"+
		"\u0000\u001a\u001a8:\u0001\u0000\\]\u0004\u0000LLOOWW__\u0001\u0000()"+
		"\u0001\u0000\u000b\f\u0002\u0000\n\n\u001c\u001d\u0001\u000001\u045b\u0000"+
		"\u00cd\u0001\u0000\u0000\u0000\u0002\u00d8\u0001\u0000\u0000\u0000\u0004"+
		"\u00da\u0001\u0000\u0000\u0000\u0006\u00dc\u0001\u0000\u0000\u0000\b\u00de"+
		"\u0001\u0000\u0000\u0000\n\u00e0\u0001\u0000\u0000\u0000\f\u00e2\u0001"+
		"\u0000\u0000\u0000\u000e\u00e4\u0001\u0000\u0000\u0000\u0010\u00e6\u0001"+
		"\u0000\u0000\u0000\u0012\u0111\u0001\u0000\u0000\u0000\u0014\u0113\u0001"+
		"\u0000\u0000\u0000\u0016\u0124\u0001\u0000\u0000\u0000\u0018\u0138\u0001"+
		"\u0000\u0000\u0000\u001a\u013b\u0001\u0000\u0000\u0000\u001c\u0145\u0001"+
		"\u0000\u0000\u0000\u001e\u014f\u0001\u0000\u0000\u0000 \u015d\u0001\u0000"+
		"\u0000\u0000\"\u0172\u0001\u0000\u0000\u0000$\u017a\u0001\u0000\u0000"+
		"\u0000&\u017d\u0001\u0000\u0000\u0000(\u018e\u0001\u0000\u0000\u0000*"+
		"\u0190\u0001\u0000\u0000\u0000,\u01a0\u0001\u0000\u0000\u0000.\u01a2\u0001"+
		"\u0000\u0000\u00000\u01ab\u0001\u0000\u0000\u00002\u01af\u0001\u0000\u0000"+
		"\u00004\u01c0\u0001\u0000\u0000\u00006\u01c2\u0001\u0000\u0000\u00008"+
		"\u01c7\u0001\u0000\u0000\u0000:\u01d5\u0001\u0000\u0000\u0000<\u01d7\u0001"+
		"\u0000\u0000\u0000>\u01d9\u0001\u0000\u0000\u0000@\u01db\u0001\u0000\u0000"+
		"\u0000B\u01dd\u0001\u0000\u0000\u0000D\u01df\u0001\u0000\u0000\u0000F"+
		"\u020e\u0001\u0000\u0000\u0000H\u0210\u0001\u0000\u0000\u0000J\u0212\u0001"+
		"\u0000\u0000\u0000L\u0214\u0001\u0000\u0000\u0000N\u0221\u0001\u0000\u0000"+
		"\u0000P\u022b\u0001\u0000\u0000\u0000R\u023c\u0001\u0000\u0000\u0000T"+
		"\u0244\u0001\u0000\u0000\u0000V\u0247\u0001\u0000\u0000\u0000X\u024e\u0001"+
		"\u0000\u0000\u0000Z\u0254\u0001\u0000\u0000\u0000\\\u0260\u0001\u0000"+
		"\u0000\u0000^\u0266\u0001\u0000\u0000\u0000`\u0268\u0001\u0000\u0000\u0000"+
		"b\u026a\u0001\u0000\u0000\u0000d\u026c\u0001\u0000\u0000\u0000f\u026e"+
		"\u0001\u0000\u0000\u0000h\u0270\u0001\u0000\u0000\u0000j\u0272\u0001\u0000"+
		"\u0000\u0000l\u0274\u0001\u0000\u0000\u0000n\u0276\u0001\u0000\u0000\u0000"+
		"p\u0278\u0001\u0000\u0000\u0000r\u027a\u0001\u0000\u0000\u0000t\u0288"+
		"\u0001\u0000\u0000\u0000v\u028a\u0001\u0000\u0000\u0000x\u0293\u0001\u0000"+
		"\u0000\u0000z\u0297\u0001\u0000\u0000\u0000|\u0299\u0001\u0000\u0000\u0000"+
		"~\u029b\u0001\u0000\u0000\u0000\u0080\u02a0\u0001\u0000\u0000\u0000\u0082"+
		"\u02b3\u0001\u0000\u0000\u0000\u0084\u02c4\u0001\u0000\u0000\u0000\u0086"+
		"\u02c7\u0001\u0000\u0000\u0000\u0088\u02f3\u0001\u0000\u0000\u0000\u008a"+
		"\u02f9\u0001\u0000\u0000\u0000\u008c\u02fd\u0001\u0000\u0000\u0000\u008e"+
		"\u0304\u0001\u0000\u0000\u0000\u0090\u0309\u0001\u0000\u0000\u0000\u0092"+
		"\u0316\u0001\u0000\u0000\u0000\u0094\u0318\u0001\u0000\u0000\u0000\u0096"+
		"\u031d\u0001\u0000\u0000\u0000\u0098\u0322\u0001\u0000\u0000\u0000\u009a"+
		"\u0327\u0001\u0000\u0000\u0000\u009c\u032c\u0001\u0000\u0000\u0000\u009e"+
		"\u0331\u0001\u0000\u0000\u0000\u00a0\u0337\u0001\u0000\u0000\u0000\u00a2"+
		"\u033d\u0001\u0000\u0000\u0000\u00a4\u0342\u0001\u0000\u0000\u0000\u00a6"+
		"\u0347\u0001\u0000\u0000\u0000\u00a8\u0352\u0001\u0000\u0000\u0000\u00aa"+
		"\u0354\u0001\u0000\u0000\u0000\u00ac\u036c\u0001\u0000\u0000\u0000\u00ae"+
		"\u038f\u0001\u0000\u0000\u0000\u00b0\u0391\u0001\u0000\u0000\u0000\u00b2"+
		"\u03a1\u0001\u0000\u0000\u0000\u00b4\u03a3\u0001\u0000\u0000\u0000\u00b6"+
		"\u03a5\u0001\u0000\u0000\u0000\u00b8\u03ac\u0001\u0000\u0000\u0000\u00ba"+
		"\u03ae\u0001\u0000\u0000\u0000\u00bc\u03b0\u0001\u0000\u0000\u0000\u00be"+
		"\u03e2\u0001\u0000\u0000\u0000\u00c0\u03e4\u0001\u0000\u0000\u0000\u00c2"+
		"\u03f4\u0001\u0000\u0000\u0000\u00c4\u00cc\u0003\u0004\u0002\u0000\u00c5"+
		"\u00cc\u0003\b\u0004\u0000\u00c6\u00c7\u0003\u0006\u0003\u0000\u00c7\u00c8"+
		"\u0006\u0000\uffff\uffff\u0000\u00c8\u00cc\u0001\u0000\u0000\u0000\u00c9"+
		"\u00cc\u0003\n\u0005\u0000\u00ca\u00cc\u0003\u0002\u0001\u0000\u00cb\u00c4"+
		"\u0001\u0000\u0000\u0000\u00cb\u00c5\u0001\u0000\u0000\u0000\u00cb\u00c6"+
		"\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00ca"+
		"\u0001\u0000\u0000\u0000\u00cc\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u0001"+
		"\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d9"+
		"\u0003\f\u0006\u0000\u00d1\u00d9\u0003\u000e\u0007\u0000\u00d2\u00d9\u0003"+
		"\u0010\b\u0000\u00d3\u00d9\u0003\u0018\f\u0000\u00d4\u00d9\u0003\u001a"+
		"\r\u0000\u00d5\u00d9\u0003&\u0013\u0000\u00d6\u00d9\u0003\u001c\u000e"+
		"\u0000\u00d7\u00d9\u0003r9\u0000\u00d8\u00d0\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d8\u00d2\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d8\u00d4\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d9\u0003\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0005b\u0000\u0000\u00db\u0005\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0005c\u0000\u0000\u00dd\u0007\u0001\u0000\u0000\u0000\u00de\u00df\u0005"+
		"d\u0000\u0000\u00df\t\u0001\u0000\u0000\u0000\u00e0\u00e1\u0007\u0000"+
		"\u0000\u0000\u00e1\u000b\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005`\u0000"+
		"\u0000\u00e3\r\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005a\u0000\u0000"+
		"\u00e5\u000f\u0001\u0000\u0000\u0000\u00e6\u00e7\u0003\u0012\t\u0000\u00e7"+
		"\u0011\u0001\u0000\u0000\u0000\u00e8\u0112\u0005R\u0000\u0000\u00e9\u00ea"+
		"\u0005S\u0000\u0000\u00ea\u00ed\u0005\u0001\u0000\u0000\u00eb\u00ee\u0003"+
		"6\u001b\u0000\u00ec\u00ee\u0005q\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000"+
		"\u0000\u00ef\u0112\u0005\u0002\u0000\u0000\u00f0\u00f1\u0005?\u0000\u0000"+
		"\u00f1\u00f2\u0005\u0001\u0000\u0000\u00f2\u00f3\u0003\u001e\u000f\u0000"+
		"\u00f3\u00f4\u0005\u0002\u0000\u0000\u00f4\u0112\u0001\u0000\u0000\u0000"+
		"\u00f5\u0112\u0005@\u0000\u0000\u00f6\u00f7\u0005F\u0000\u0000\u00f7\u00f8"+
		"\u0005\u0001\u0000\u0000\u00f8\u00f9\u0003\u001e\u000f\u0000\u00f9\u00fa"+
		"\u0005\u0002\u0000\u0000\u00fa\u0112\u0001\u0000\u0000\u0000\u00fb\u00fc"+
		"\u0005A\u0000\u0000\u00fc\u00ff\u0005\u0001\u0000\u0000\u00fd\u0100\u0003"+
		"\u0016\u000b\u0000\u00fe\u0100\u0005\u0003\u0000\u0000\u00ff\u00fd\u0001"+
		"\u0000\u0000\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000\u0100\u0102\u0001"+
		"\u0000\u0000\u0000\u0101\u0103\u0003\u001e\u000f\u0000\u0102\u0101\u0001"+
		"\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0105\u0001"+
		"\u0000\u0000\u0000\u0104\u0106\u0005\u0003\u0000\u0000\u0105\u0104\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0108\u0001"+
		"\u0000\u0000\u0000\u0107\u0109\u0003\u008eG\u0000\u0108\u0107\u0001\u0000"+
		"\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000"+
		"\u0000\u0000\u010a\u0112\u0005\u0002\u0000\u0000\u010b\u0112\u0005G\u0000"+
		"\u0000\u010c\u010d\u0005B\u0000\u0000\u010d\u010e\u0005\u0001\u0000\u0000"+
		"\u010e\u010f\u0003\u001e\u000f\u0000\u010f\u0110\u0005\u0002\u0000\u0000"+
		"\u0110\u0112\u0001\u0000\u0000\u0000\u0111\u00e8\u0001\u0000\u0000\u0000"+
		"\u0111\u00e9\u0001\u0000\u0000\u0000\u0111\u00f0\u0001\u0000\u0000\u0000"+
		"\u0111\u00f5\u0001\u0000\u0000\u0000\u0111\u00f6\u0001\u0000\u0000\u0000"+
		"\u0111\u00fb\u0001\u0000\u0000\u0000\u0111\u010b\u0001\u0000\u0000\u0000"+
		"\u0111\u010c\u0001\u0000\u0000\u0000\u0112\u0013\u0001\u0000\u0000\u0000"+
		"\u0113\u0114\u0005G\u0000\u0000\u0114\u0115\u0003\u0002\u0001\u0000\u0115"+
		"\u0116\u0005B\u0000\u0000\u0116\u0117\u0005\u0001\u0000\u0000\u0117\u0118"+
		"\u0003\u008eG\u0000\u0118\u0119\u0005\u0002\u0000\u0000\u0119\u0015\u0001"+
		"\u0000\u0000\u0000\u011a\u011c\u0003&\u0013\u0000\u011b\u011d\u0005\u0004"+
		"\u0000\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000"+
		"\u0000\u0000\u011d\u0125\u0001\u0000\u0000\u0000\u011e\u011f\u0003\u008e"+
		"G\u0000\u011f\u0120\u0005\u0003\u0000\u0000\u0120\u0125\u0001\u0000\u0000"+
		"\u0000\u0121\u0122\u0003\u008eG\u0000\u0122\u0123\u0005\u0004\u0000\u0000"+
		"\u0123\u0125\u0001\u0000\u0000\u0000\u0124\u011a\u0001\u0000\u0000\u0000"+
		"\u0124\u011e\u0001\u0000\u0000\u0000\u0124\u0121\u0001\u0000\u0000\u0000"+
		"\u0125\u0017\u0001\u0000\u0000\u0000\u0126\u0127\u0005C\u0000\u0000\u0127"+
		"\u0139\u0005\u0003\u0000\u0000\u0128\u0129\u0005E\u0000\u0000\u0129\u0139"+
		"\u0005\u0003\u0000\u0000\u012a\u012b\u0005H\u0000\u0000\u012b\u012c\u0003"+
		"t:\u0000\u012c\u012d\u0005\u0003\u0000\u0000\u012d\u0139\u0001\u0000\u0000"+
		"\u0000\u012e\u0130\u0005I\u0000\u0000\u012f\u0131\u0003\u008eG\u0000\u0130"+
		"\u012f\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131"+
		"\u0132\u0001\u0000\u0000\u0000\u0132\u0139\u0005\u0003\u0000\u0000\u0133"+
		"\u0135\u0005T\u0000\u0000\u0134\u0136\u0003\u008eG\u0000\u0135\u0134\u0001"+
		"\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0137\u0001"+
		"\u0000\u0000\u0000\u0137\u0139\u0005\u0003\u0000\u0000\u0138\u0126\u0001"+
		"\u0000\u0000\u0000\u0138\u0128\u0001\u0000\u0000\u0000\u0138\u012a\u0001"+
		"\u0000\u0000\u0000\u0138\u012e\u0001\u0000\u0000\u0000\u0138\u0133\u0001"+
		"\u0000\u0000\u0000\u0139\u0019\u0001\u0000\u0000\u0000\u013a\u013c\u0005"+
		"D\u0000\u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000"+
		"\u0000\u0000\u013c\u0140\u0001\u0000\u0000\u0000\u013d\u0141\u0003t:\u0000"+
		"\u013e\u0141\u0003v;\u0000\u013f\u0141\u0005k\u0000\u0000\u0140\u013d"+
		"\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u013f"+
		"\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0143"+
		"\u0005\u0004\u0000\u0000\u0143\u001b\u0001\u0000\u0000\u0000\u0144\u0146"+
		"\u0003\u008eG\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0145\u0146\u0001"+
		"\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0148\u0005"+
		"\u0003\u0000\u0000\u0148\u001d\u0001\u0000\u0000\u0000\u0149\u0150\u0003"+
		"\u008eG\u0000\u014a\u014b\u0003\u0088D\u0000\u014b\u014c\u0003\"\u0011"+
		"\u0000\u014c\u014d\u0005\u0005\u0000\u0000\u014d\u014e\u0003\u0090H\u0000"+
		"\u014e\u0150\u0001\u0000\u0000\u0000\u014f\u0149\u0001\u0000\u0000\u0000"+
		"\u014f\u014a\u0001\u0000\u0000\u0000\u0150\u001f\u0001\u0000\u0000\u0000"+
		"\u0151\u0152\u0003\"\u0011\u0000\u0152\u0154\u0005\u0001\u0000\u0000\u0153"+
		"\u0155\u0003\u008eG\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0154\u0155"+
		"\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0157"+
		"\u0005\u0002\u0000\u0000\u0157\u015e\u0001\u0000\u0000\u0000\u0158\u0159"+
		"\u0003\"\u0011\u0000\u0159\u015a\u0005\u0005\u0000\u0000\u015a\u015b\u0003"+
		",\u0016\u0000\u015b\u015e\u0001\u0000\u0000\u0000\u015c\u015e\u0003\""+
		"\u0011\u0000\u015d\u0151\u0001\u0000\u0000\u0000\u015d\u0158\u0001\u0000"+
		"\u0000\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015e!\u0001\u0000\u0000"+
		"\u0000\u015f\u0161\u0003x<\u0000\u0160\u015f\u0001\u0000\u0000\u0000\u0160"+
		"\u0161\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162"+
		"\u0164\u0003t:\u0000\u0163\u0165\u0003X,\u0000\u0164\u0163\u0001\u0000"+
		"\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0167\u0001\u0000"+
		"\u0000\u0000\u0166\u0168\u0003$\u0012\u0000\u0167\u0166\u0001\u0000\u0000"+
		"\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u0173\u0001\u0000\u0000"+
		"\u0000\u0169\u016b\u0003x<\u0000\u016a\u0169\u0001\u0000\u0000\u0000\u016a"+
		"\u016b\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c"+
		"\u016d\u0005\u0001\u0000\u0000\u016d\u016e\u0003z=\u0000\u016e\u016f\u0003"+
		"t:\u0000\u016f\u0170\u0005\u0002\u0000\u0000\u0170\u0171\u0003$\u0012"+
		"\u0000\u0171\u0173\u0001\u0000\u0000\u0000\u0172\u0160\u0001\u0000\u0000"+
		"\u0000\u0172\u016a\u0001\u0000\u0000\u0000\u0173#\u0001\u0000\u0000\u0000"+
		"\u0174\u0176\u0005\u0006\u0000\u0000\u0175\u0177\u0003\u0092I\u0000\u0176"+
		"\u0175\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177"+
		"\u0178\u0001\u0000\u0000\u0000\u0178\u017b\u0005\u0007\u0000\u0000\u0179"+
		"\u017b\u00034\u001a\u0000\u017a\u0174\u0001\u0000\u0000\u0000\u017a\u0179"+
		"\u0001\u0000\u0000\u0000\u017b%\u0001\u0000\u0000\u0000\u017c\u017e\u0005"+
		"J\u0000\u0000\u017d\u017c\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000"+
		"\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017f\u0180\u0003(\u0014"+
		"\u0000\u0180\'\u0001\u0000\u0000\u0000\u0181\u0183\u0003\u0080@\u0000"+
		"\u0182\u0184\u0003*\u0015\u0000\u0183\u0182\u0001\u0000\u0000\u0000\u0183"+
		"\u0184\u0001\u0000\u0000\u0000\u0184\u018f\u0001\u0000\u0000\u0000\u0185"+
		"\u0187\u0003L&\u0000\u0186\u0185\u0001\u0000\u0000\u0000\u0187\u018a\u0001"+
		"\u0000\u0000\u0000\u0188\u0186\u0001\u0000\u0000\u0000\u0188\u0189\u0001"+
		"\u0000\u0000\u0000\u0189\u018b\u0001\u0000\u0000\u0000\u018a\u0188\u0001"+
		"\u0000\u0000\u0000\u018b\u018c\u0003\u0088D\u0000\u018c\u018d\u0003*\u0015"+
		"\u0000\u018d\u018f\u0001\u0000\u0000\u0000\u018e\u0181\u0001\u0000\u0000"+
		"\u0000\u018e\u0188\u0001\u0000\u0000\u0000\u018f)\u0001\u0000\u0000\u0000"+
		"\u0190\u0195\u0003 \u0010\u0000\u0191\u0192\u0005\b\u0000\u0000\u0192"+
		"\u0194\u0003 \u0010\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0194\u0197"+
		"\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0195\u0196"+
		"\u0001\u0000\u0000\u0000\u0196\u0199\u0001\u0000\u0000\u0000\u0197\u0195"+
		"\u0001\u0000\u0000\u0000\u0198\u019a\u0005\u0003\u0000\u0000\u0199\u0198"+
		"\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a+\u0001"+
		"\u0000\u0000\u0000\u019b\u01a1\u0003\u0090H\u0000\u019c\u019d\u0005`\u0000"+
		"\u0000\u019d\u019e\u0003.\u0017\u0000\u019e\u019f\u0005a\u0000\u0000\u019f"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a0\u019b\u0001\u0000\u0000\u0000\u01a0"+
		"\u019c\u0001\u0000\u0000\u0000\u01a1-\u0001\u0000\u0000\u0000\u01a2\u01a7"+
		"\u0003,\u0016\u0000\u01a3\u01a4\u0005\b\u0000\u0000\u01a4\u01a6\u0003"+
		",\u0016\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a6\u01a9\u0001\u0000"+
		"\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000"+
		"\u0000\u0000\u01a8/\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000"+
		"\u0000\u01aa\u01ac\u0007\u0001\u0000\u0000\u01ab\u01aa\u0001\u0000\u0000"+
		"\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ae\u0003\u0088D\u0000\u01ae1\u0001\u0000\u0000\u0000\u01af"+
		"\u01b0\u0003t:\u0000\u01b03\u0001\u0000\u0000\u0000\u01b1\u01b2\u0005"+
		"\u0001\u0000\u0000\u01b2\u01b3\u0005L\u0000\u0000\u01b3\u01c1\u0005\u0002"+
		"\u0000\u0000\u01b4\u01bd\u0005\u0001\u0000\u0000\u01b5\u01ba\u00036\u001b"+
		"\u0000\u01b6\u01b7\u0005\b\u0000\u0000\u01b7\u01b9\u00036\u001b\u0000"+
		"\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b9\u01bc\u0001\u0000\u0000\u0000"+
		"\u01ba\u01b8\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000"+
		"\u01bb\u01be\u0001\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000"+
		"\u01bd\u01b5\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000\u0000"+
		"\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c1\u0005\u0002\u0000\u0000"+
		"\u01c0\u01b1\u0001\u0000\u0000\u0000\u01c0\u01b4\u0001\u0000\u0000\u0000"+
		"\u01c15\u0001\u0000\u0000\u0000\u01c2\u01c3\u00030\u0018\u0000\u01c3\u01c4"+
		"\u00038\u001c\u0000\u01c47\u0001\u0000\u0000\u0000\u01c5\u01c8\u0003x"+
		"<\u0000\u01c6\u01c8\u0003|>\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000"+
		"\u01c7\u01c6\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000"+
		"\u01c8\u01d0\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005\u0001\u0000\u0000"+
		"\u01ca\u01cb\u00038\u001c\u0000\u01cb\u01cc\u0005\u0002\u0000\u0000\u01cc"+
		"\u01d1\u0001\u0000\u0000\u0000\u01cd\u01cf\u00032\u0019\u0000\u01ce\u01cd"+
		"\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf\u01d1"+
		"\u0001\u0000\u0000\u0000\u01d0\u01c9\u0001\u0000\u0000\u0000\u01d0\u01ce"+
		"\u0001\u0000\u0000\u0000\u01d1\u01d3\u0001\u0000\u0000\u0000\u01d2\u01d4"+
		"\u0003$\u0012\u0000\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001"+
		"\u0000\u0000\u0000\u01d49\u0001\u0000\u0000\u0000\u01d5\u01d6\u0007\u0002"+
		"\u0000\u0000\u01d6;\u0001\u0000\u0000\u0000\u01d7\u01d8\u0007\u0003\u0000"+
		"\u0000\u01d8=\u0001\u0000\u0000\u0000\u01d9\u01da\u0007\u0004\u0000\u0000"+
		"\u01da?\u0001\u0000\u0000\u0000\u01db\u01dc\u0007\u0005\u0000\u0000\u01dc"+
		"A\u0001\u0000\u0000\u0000\u01dd\u01de\u0007\u0006\u0000\u0000\u01deC\u0001"+
		"\u0000\u0000\u0000\u01df\u01e0\u0007\u0007\u0000\u0000\u01e0E\u0001\u0000"+
		"\u0000\u0000\u01e1\u01e4\u0007\b\u0000\u0000\u01e2\u01e3\u0005\u0006\u0000"+
		"\u0000\u01e3\u01e5\u0005\u0007\u0000\u0000\u01e4\u01e2\u0001\u0000\u0000"+
		"\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u020f\u0001\u0000\u0000"+
		"\u0000\u01e6\u020f\u0005\u000b\u0000\u0000\u01e7\u020f\u0005\f\u0000\u0000"+
		"\u01e8\u020f\u0005\n\u0000\u0000\u01e9\u020f\u0005\u001c\u0000\u0000\u01ea"+
		"\u020f\u0005\u001d\u0000\u0000\u01eb\u020f\u0005\u001e\u0000\u0000\u01ec"+
		"\u020f\u0005\t\u0000\u0000\u01ed\u020f\u0005\u001f\u0000\u0000\u01ee\u020f"+
		"\u0005\r\u0000\u0000\u01ef\u020f\u0005\u000e\u0000\u0000\u01f0\u020f\u0005"+
		"\u0005\u0000\u0000\u01f1\u020f\u0005\u000f\u0000\u0000\u01f2\u020f\u0005"+
		"\u0010\u0000\u0000\u01f3\u020f\u0005 \u0000\u0000\u01f4\u020f\u0005!\u0000"+
		"\u0000\u01f5\u020f\u0005\"\u0000\u0000\u01f6\u020f\u0005#\u0000\u0000"+
		"\u01f7\u020f\u0005$\u0000\u0000\u01f8\u020f\u0005%\u0000\u0000\u01f9\u020f"+
		"\u0005&\u0000\u0000\u01fa\u020f\u0005\'\u0000\u0000\u01fb\u020f\u0005"+
		"(\u0000\u0000\u01fc\u020f\u0005)\u0000\u0000\u01fd\u020f\u0005*\u0000"+
		"\u0000\u01fe\u020f\u0005+\u0000\u0000\u01ff\u020f\u0005,\u0000\u0000\u0200"+
		"\u020f\u0005-\u0000\u0000\u0201\u020f\u0005\u0011\u0000\u0000\u0202\u020f"+
		"\u0005\u0012\u0000\u0000\u0203\u020f\u0005.\u0000\u0000\u0204\u020f\u0005"+
		"/\u0000\u0000\u0205\u020f\u00050\u0000\u0000\u0206\u020f\u00051\u0000"+
		"\u0000\u0207\u020f\u0005\b\u0000\u0000\u0208\u020f\u00052\u0000\u0000"+
		"\u0209\u020f\u00053\u0000\u0000\u020a\u020b\u0005\u0001\u0000\u0000\u020b"+
		"\u020f\u0005\u0002\u0000\u0000\u020c\u020d\u0005\u0006\u0000\u0000\u020d"+
		"\u020f\u0005\u0007\u0000\u0000\u020e\u01e1\u0001\u0000\u0000\u0000\u020e"+
		"\u01e6\u0001\u0000\u0000\u0000\u020e\u01e7\u0001\u0000\u0000\u0000\u020e"+
		"\u01e8\u0001\u0000\u0000\u0000\u020e\u01e9\u0001\u0000\u0000\u0000\u020e"+
		"\u01ea\u0001\u0000\u0000\u0000\u020e\u01eb\u0001\u0000\u0000\u0000\u020e"+
		"\u01ec\u0001\u0000\u0000\u0000\u020e\u01ed\u0001\u0000\u0000\u0000\u020e"+
		"\u01ee\u0001\u0000\u0000\u0000\u020e\u01ef\u0001\u0000\u0000\u0000\u020e"+
		"\u01f0\u0001\u0000\u0000\u0000\u020e\u01f1\u0001\u0000\u0000\u0000\u020e"+
		"\u01f2\u0001\u0000\u0000\u0000\u020e\u01f3\u0001\u0000\u0000\u0000\u020e"+
		"\u01f4\u0001\u0000\u0000\u0000\u020e\u01f5\u0001\u0000\u0000\u0000\u020e"+
		"\u01f6\u0001\u0000\u0000\u0000\u020e\u01f7\u0001\u0000\u0000\u0000\u020e"+
		"\u01f8\u0001\u0000\u0000\u0000\u020e\u01f9\u0001\u0000\u0000\u0000\u020e"+
		"\u01fa\u0001\u0000\u0000\u0000\u020e\u01fb\u0001\u0000\u0000\u0000\u020e"+
		"\u01fc\u0001\u0000\u0000\u0000\u020e\u01fd\u0001\u0000\u0000\u0000\u020e"+
		"\u01fe\u0001\u0000\u0000\u0000\u020e\u01ff\u0001\u0000\u0000\u0000\u020e"+
		"\u0200\u0001\u0000\u0000\u0000\u020e\u0201\u0001\u0000\u0000\u0000\u020e"+
		"\u0202\u0001\u0000\u0000\u0000\u020e\u0203\u0001\u0000\u0000\u0000\u020e"+
		"\u0204\u0001\u0000\u0000\u0000\u020e\u0205\u0001\u0000\u0000\u0000\u020e"+
		"\u0206\u0001\u0000\u0000\u0000\u020e\u0207\u0001\u0000\u0000\u0000\u020e"+
		"\u0208\u0001\u0000\u0000\u0000\u020e\u0209\u0001\u0000\u0000\u0000\u020e"+
		"\u020a\u0001\u0000\u0000\u0000\u020e\u020c\u0001\u0000\u0000\u0000\u020f"+
		"G\u0001\u0000\u0000\u0000\u0210\u0211\u0007\t\u0000\u0000\u0211I\u0001"+
		"\u0000\u0000\u0000\u0212\u0213\u0007\n\u0000\u0000\u0213K\u0001\u0000"+
		"\u0000\u0000\u0214\u0215\u0005Z\u0000\u0000\u0215\u0217\u0005\u000f\u0000"+
		"\u0000\u0216\u0218\u0003N\'\u0000\u0217\u0216\u0001\u0000\u0000\u0000"+
		"\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u0219\u0001\u0000\u0000\u0000"+
		"\u0219\u021a\u0005\u0010\u0000\u0000\u021aM\u0001\u0000\u0000\u0000\u021b"+
		"\u021c\u0006\'\uffff\uffff\u0000\u021c\u021d\u0003P(\u0000\u021d\u021e"+
		"\u0003T*\u0000\u021e\u021f\u0003V+\u0000\u021f\u0222\u0001\u0000\u0000"+
		"\u0000\u0220\u0222\u0003R)\u0000\u0221\u021b\u0001\u0000\u0000\u0000\u0221"+
		"\u0220\u0001\u0000\u0000\u0000\u0222\u0228\u0001\u0000\u0000\u0000\u0223"+
		"\u0224\n\u0001\u0000\u0000\u0224\u0225\u0005\b\u0000\u0000\u0225\u0227"+
		"\u0003R)\u0000\u0226\u0223\u0001\u0000\u0000\u0000\u0227\u022a\u0001\u0000"+
		"\u0000\u0000\u0228\u0226\u0001\u0000\u0000\u0000\u0228\u0229\u0001\u0000"+
		"\u0000\u0000\u0229O\u0001\u0000\u0000\u0000\u022a\u0228\u0001\u0000\u0000"+
		"\u0000\u022b\u022c\u0005Z\u0000\u0000\u022c\u0231\u0005\u000f\u0000\u0000"+
		"\u022d\u022f\u0003T*\u0000\u022e\u0230\u0005\b\u0000\u0000\u022f\u022e"+
		"\u0001\u0000\u0000\u0000\u022f\u0230\u0001\u0000\u0000\u0000\u0230\u0232"+
		"\u0001\u0000\u0000\u0000\u0231\u022d\u0001\u0000\u0000\u0000\u0232\u0233"+
		"\u0001\u0000\u0000\u0000\u0233\u0231\u0001\u0000\u0000\u0000\u0233\u0234"+
		"\u0001\u0000\u0000\u0000\u0234\u0235\u0001\u0000\u0000\u0000\u0235\u0236"+
		"\u0005\u0010\u0000\u0000\u0236Q\u0001\u0000\u0000\u0000\u0237\u023d\u0003"+
		"T*\u0000\u0238\u023a\u0005P\u0000\u0000\u0239\u0238\u0001\u0000\u0000"+
		"\u0000\u0239\u023a\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000"+
		"\u0000\u023b\u023d\u0003t:\u0000\u023c\u0237\u0001\u0000\u0000\u0000\u023c"+
		"\u0239\u0001\u0000\u0000\u0000\u023d\u023f\u0001\u0000\u0000\u0000\u023e"+
		"\u0240\u0003V+\u0000\u023f\u023e\u0001\u0000\u0000\u0000\u023f\u0240\u0001"+
		"\u0000\u0000\u0000\u0240\u0242\u0001\u0000\u0000\u0000\u0241\u0243\u0003"+
		"B!\u0000\u0242\u0241\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000\u0000"+
		"\u0000\u0243S\u0001\u0000\u0000\u0000\u0244\u0245\u0007\u000b\u0000\u0000"+
		"\u0245U\u0001\u0000\u0000\u0000\u0246\u0248\u0005_\u0000\u0000\u0247\u0246"+
		"\u0001\u0000\u0000\u0000\u0248\u0249\u0001\u0000\u0000\u0000\u0249\u0247"+
		"\u0001\u0000\u0000\u0000\u0249\u024a\u0001\u0000\u0000\u0000\u024a\u024c"+
		"\u0001\u0000\u0000\u0000\u024b\u024d\u0005q\u0000\u0000\u024c\u024b\u0001"+
		"\u0000\u0000\u0000\u024c\u024d\u0001\u0000\u0000\u0000\u024dW\u0001\u0000"+
		"\u0000\u0000\u024e\u0250\u0005\u000f\u0000\u0000\u024f\u0251\u0003Z-\u0000"+
		"\u0250\u024f\u0001\u0000\u0000\u0000\u0250\u0251\u0001\u0000\u0000\u0000"+
		"\u0251\u0252\u0001\u0000\u0000\u0000\u0252\u0253\u0005\u0010\u0000\u0000"+
		"\u0253Y\u0001\u0000\u0000\u0000\u0254\u0255\u0006-\uffff\uffff\u0000\u0255"+
		"\u0256\u0003\\.\u0000\u0256\u025c\u0001\u0000\u0000\u0000\u0257\u0258"+
		"\n\u0001\u0000\u0000\u0258\u0259\u0005\b\u0000\u0000\u0259\u025b\u0003"+
		"\\.\u0000\u025a\u0257\u0001\u0000\u0000\u0000\u025b\u025e\u0001\u0000"+
		"\u0000\u0000\u025c\u025a\u0001\u0000\u0000\u0000\u025c\u025d\u0001\u0000"+
		"\u0000\u0000\u025d[\u0001\u0000\u0000\u0000\u025e\u025c\u0001\u0000\u0000"+
		"\u0000\u025f\u0261\u0005P\u0000\u0000\u0260\u025f\u0001\u0000\u0000\u0000"+
		"\u0260\u0261\u0001\u0000\u0000\u0000\u0261\u0262\u0001\u0000\u0000\u0000"+
		"\u0262\u0264\u0003\u008aE\u0000\u0263\u0265\u0003B!\u0000\u0264\u0263"+
		"\u0001\u0000\u0000\u0000\u0264\u0265\u0001\u0000\u0000\u0000\u0265]\u0001"+
		"\u0000\u0000\u0000\u0266\u0267\b\f\u0000\u0000\u0267_\u0001\u0000\u0000"+
		"\u0000\u0268\u0269\b\r\u0000\u0000\u0269a\u0001\u0000\u0000\u0000\u026a"+
		"\u026b\b\u000e\u0000\u0000\u026bc\u0001\u0000\u0000\u0000\u026c\u026d"+
		"\b\u000f\u0000\u0000\u026de\u0001\u0000\u0000\u0000\u026e\u026f\b\u0010"+
		"\u0000\u0000\u026fg\u0001\u0000\u0000\u0000\u0270\u0271\b\u0011\u0000"+
		"\u0000\u0271i\u0001\u0000\u0000\u0000\u0272\u0273\b\u0012\u0000\u0000"+
		"\u0273k\u0001\u0000\u0000\u0000\u0274\u0275\b\u0013\u0000\u0000\u0275"+
		"m\u0001\u0000\u0000\u0000\u0276\u0277\b\u0014\u0000\u0000\u0277o\u0001"+
		"\u0000\u0000\u0000\u0278\u0279\b\r\u0000\u0000\u0279q\u0001\u0000\u0000"+
		"\u0000\u027a\u027b\t\u0000\u0000\u0000\u027bs\u0001\u0000\u0000\u0000"+
		"\u027c\u0281\u0005_\u0000\u0000\u027d\u027e\u00055\u0000\u0000\u027e\u0280"+
		"\u0005_\u0000\u0000\u027f\u027d\u0001\u0000\u0000\u0000\u0280\u0283\u0001"+
		"\u0000\u0000\u0000\u0281\u027f\u0001\u0000\u0000\u0000\u0281\u0282\u0001"+
		"\u0000\u0000\u0000\u0282\u0285\u0001\u0000\u0000\u0000\u0283\u0281\u0001"+
		"\u0000\u0000\u0000\u0284\u0286\u00056\u0000\u0000\u0285\u0284\u0001\u0000"+
		"\u0000\u0000\u0285\u0286\u0001\u0000\u0000\u0000\u0286\u0289\u0001\u0000"+
		"\u0000\u0000\u0287\u0289\u0003D\"\u0000\u0288\u027c\u0001\u0000\u0000"+
		"\u0000\u0288\u0287\u0001\u0000\u0000\u0000\u0289u\u0001\u0000\u0000\u0000"+
		"\u028a\u028b\u0007\u0015\u0000\u0000\u028bw\u0001\u0000\u0000\u0000\u028c"+
		"\u028e\u0005P\u0000\u0000\u028d\u028c\u0001\u0000\u0000\u0000\u028d\u028e"+
		"\u0001\u0000\u0000\u0000\u028e\u028f\u0001\u0000\u0000\u0000\u028f\u0291"+
		"\u0003B!\u0000\u0290\u0292\u00057\u0000\u0000\u0291\u0290\u0001\u0000"+
		"\u0000\u0000\u0291\u0292\u0001\u0000\u0000\u0000\u0292\u0294\u0001\u0000"+
		"\u0000\u0000\u0293\u028d\u0001\u0000\u0000\u0000\u0294\u0295\u0001\u0000"+
		"\u0000\u0000\u0295\u0293\u0001\u0000\u0000\u0000\u0295\u0296\u0001\u0000"+
		"\u0000\u0000\u0296y\u0001\u0000\u0000\u0000\u0297\u0298\u0003x<\u0000"+
		"\u0298{\u0001\u0000\u0000\u0000\u0299\u029a\u0005.\u0000\u0000\u029a}"+
		"\u0001\u0000\u0000\u0000\u029b\u029c\u0007\u0016\u0000\u0000\u029c\u007f"+
		"\u0001\u0000\u0000\u0000\u029d\u029f\u0003L&\u0000\u029e\u029d\u0001\u0000"+
		"\u0000\u0000\u029f\u02a2\u0001\u0000\u0000\u0000\u02a0\u029e\u0001\u0000"+
		"\u0000\u0000\u02a0\u02a1\u0001\u0000\u0000\u0000\u02a1\u02a3\u0001\u0000"+
		"\u0000\u0000\u02a2\u02a0\u0001\u0000\u0000\u0000\u02a3\u02a5\u0003~?\u0000"+
		"\u02a4\u02a6\u0003\u008cF\u0000\u02a5\u02a4\u0001\u0000\u0000\u0000\u02a5"+
		"\u02a6\u0001\u0000\u0000\u0000\u02a6\u02a8\u0001\u0000\u0000\u0000\u02a7"+
		"\u02a9\u0003\u0082A\u0000\u02a8\u02a7\u0001\u0000\u0000\u0000\u02a8\u02a9"+
		"\u0001\u0000\u0000\u0000\u02a9\u02ab\u0001\u0000\u0000\u0000\u02aa\u02ac"+
		"\u0003X,\u0000\u02ab\u02aa\u0001\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000"+
		"\u0000\u0000\u02ac\u02ae\u0001\u0000\u0000\u0000\u02ad\u02af\u0003\u0084"+
		"B\u0000\u02ae\u02ad\u0001\u0000\u0000\u0000\u02ae\u02af\u0001\u0000\u0000"+
		"\u0000\u02af\u02b0\u0001\u0000\u0000\u0000\u02b0\u02b1\u0005`\u0000\u0000"+
		"\u02b1\u02b2\u0006@\uffff\uffff\u0000\u02b2\u0081\u0001\u0000\u0000\u0000"+
		"\u02b3\u02b4\u0003t:\u0000\u02b4\u0083\u0001\u0000\u0000\u0000\u02b5\u02b6"+
		"\u0005\u0004\u0000\u0000\u02b6\u02bb\u0003\u0086C\u0000\u02b7\u02b8\u0005"+
		"\b\u0000\u0000\u02b8\u02ba\u0003\u0086C\u0000\u02b9\u02b7\u0001\u0000"+
		"\u0000\u0000\u02ba\u02bd\u0001\u0000\u0000\u0000\u02bb\u02b9\u0001\u0000"+
		"\u0000\u0000\u02bb\u02bc\u0001\u0000\u0000\u0000\u02bc\u02c5\u0001\u0000"+
		"\u0000\u0000\u02bd\u02bb\u0001\u0000\u0000\u0000\u02be\u02bf\u0007\u0017"+
		"\u0000\u0000\u02bf\u02c1\u0003\u0086C\u0000\u02c0\u02be\u0001\u0000\u0000"+
		"\u0000\u02c1\u02c2\u0001\u0000\u0000\u0000\u02c2\u02c0\u0001\u0000\u0000"+
		"\u0000\u02c2\u02c3\u0001\u0000\u0000\u0000\u02c3\u02c5\u0001\u0000\u0000"+
		"\u0000\u02c4\u02b5\u0001\u0000\u0000\u0000\u02c4\u02c0\u0001\u0000\u0000"+
		"\u0000\u02c5\u0085\u0001\u0000\u0000\u0000\u02c6\u02c8\u0005Q\u0000\u0000"+
		"\u02c7\u02c6\u0001\u0000\u0000\u0000\u02c7\u02c8\u0001\u0000\u0000\u0000"+
		"\u02c8\u02ca\u0001\u0000\u0000\u0000\u02c9\u02cb\u0003D\"\u0000\u02ca"+
		"\u02c9\u0001\u0000\u0000\u0000\u02ca\u02cb\u0001\u0000\u0000\u0000\u02cb"+
		"\u02cc\u0001\u0000\u0000\u0000\u02cc\u02ce\u0003t:\u0000\u02cd\u02cf\u0003"+
		"X,\u0000\u02ce\u02cd\u0001\u0000\u0000\u0000\u02ce\u02cf\u0001\u0000\u0000"+
		"\u0000\u02cf\u0087\u0001\u0000\u0000\u0000\u02d0\u02d2\u0005P\u0000\u0000"+
		"\u02d1\u02d0\u0001\u0000\u0000\u0000\u02d2\u02d5\u0001\u0000\u0000\u0000"+
		"\u02d3\u02d1\u0001\u0000\u0000\u0000\u02d3\u02d4\u0001\u0000\u0000\u0000"+
		"\u02d4\u02d9\u0001\u0000\u0000\u0000\u02d5\u02d3\u0001\u0000\u0000\u0000"+
		"\u02d6\u02da\u0003~?\u0000\u02d7\u02da\u0005M\u0000\u0000\u02d8\u02da"+
		"\u0005N\u0000\u0000\u02d9\u02d6\u0001\u0000\u0000\u0000\u02d9\u02d7\u0001"+
		"\u0000\u0000\u0000\u02d9\u02d8\u0001\u0000\u0000\u0000\u02d9\u02da\u0001"+
		"\u0000\u0000\u0000\u02da\u02db\u0001\u0000\u0000\u0000\u02db\u02dd\u0003"+
		"\u008aE\u0000\u02dc\u02de\u0003X,\u0000\u02dd\u02dc\u0001\u0000\u0000"+
		"\u0000\u02dd\u02de\u0001\u0000\u0000\u0000\u02de\u02e1\u0001\u0000\u0000"+
		"\u0000\u02df\u02e0\u0005\u0006\u0000\u0000\u02e0\u02e2\u0005\u0007\u0000"+
		"\u0000\u02e1\u02df\u0001\u0000\u0000\u0000\u02e1\u02e2\u0001\u0000\u0000"+
		"\u0000\u02e2\u02ea\u0001\u0000\u0000\u0000\u02e3\u02e4\u00055\u0000\u0000"+
		"\u02e4\u02e6\u0003\u008aE\u0000\u02e5\u02e7\u0003X,\u0000\u02e6\u02e5"+
		"\u0001\u0000\u0000\u0000\u02e6\u02e7\u0001\u0000\u0000\u0000\u02e7\u02e9"+
		"\u0001\u0000\u0000\u0000\u02e8\u02e3\u0001\u0000\u0000\u0000\u02e9\u02ec"+
		"\u0001\u0000\u0000\u0000\u02ea\u02e8\u0001\u0000\u0000\u0000\u02ea\u02eb"+
		"\u0001\u0000\u0000\u0000\u02eb\u02ee\u0001\u0000\u0000\u0000\u02ec\u02ea"+
		"\u0001\u0000\u0000\u0000\u02ed\u02ef\u0005P\u0000\u0000\u02ee\u02ed\u0001"+
		"\u0000\u0000\u0000\u02ee\u02ef\u0001\u0000\u0000\u0000\u02ef\u02f4\u0001"+
		"\u0000\u0000\u0000\u02f0\u02f4\u0003\u00bc^\u0000\u02f1\u02f4\u0005M\u0000"+
		"\u0000\u02f2\u02f4\u0005N\u0000\u0000\u02f3\u02d3\u0001\u0000\u0000\u0000"+
		"\u02f3\u02f0\u0001\u0000\u0000\u0000\u02f3\u02f1\u0001\u0000\u0000\u0000"+
		"\u02f3\u02f2\u0001\u0000\u0000\u0000\u02f4\u0089\u0001\u0000\u0000\u0000"+
		"\u02f5\u02f7\u0007\u0018\u0000\u0000\u02f6\u02f8\u0005q\u0000\u0000\u02f7"+
		"\u02f6\u0001\u0000\u0000\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8"+
		"\u02fa\u0001\u0000\u0000\u0000\u02f9\u02f5\u0001\u0000\u0000\u0000\u02fa"+
		"\u02fb\u0001\u0000\u0000\u0000\u02fb\u02f9\u0001\u0000\u0000\u0000\u02fb"+
		"\u02fc\u0001\u0000\u0000\u0000\u02fc\u008b\u0001\u0000\u0000\u0000\u02fd"+
		"\u02fe\u0005^\u0000\u0000\u02fe\u02ff\u0005\u0001\u0000\u0000\u02ff\u0300"+
		"\u0005\u0001\u0000\u0000\u0300\u0301\u0003t:\u0000\u0301\u0302\u0005\u0002"+
		"\u0000\u0000\u0302\u0303\u0005\u0002\u0000\u0000\u0303\u008d\u0001\u0000"+
		"\u0000\u0000\u0304\u0307\u0003\u0090H\u0000\u0305\u0306\u0005\b\u0000"+
		"\u0000\u0306\u0308\u0003\u008eG\u0000\u0307\u0305\u0001\u0000\u0000\u0000"+
		"\u0307\u0308\u0001\u0000\u0000\u0000\u0308\u008f\u0001\u0000\u0000\u0000"+
		"\u0309\u030d\u0003\u0092I\u0000\u030a\u030b\u0003H$\u0000\u030b\u030c"+
		"\u0003\u0090H\u0000\u030c\u030e\u0001\u0000\u0000\u0000\u030d\u030a\u0001"+
		"\u0000\u0000\u0000\u030d\u030e\u0001\u0000\u0000\u0000\u030e\u0091\u0001"+
		"\u0000\u0000\u0000\u030f\u0317\u0003\u0094J\u0000\u0310\u0311\u0003\u0094"+
		"J\u0000\u0311\u0312\u0005;\u0000\u0000\u0312\u0313\u0003\u008eG\u0000"+
		"\u0313\u0314\u0005\u0004\u0000\u0000\u0314\u0315\u0003\u0092I\u0000\u0315"+
		"\u0317\u0001\u0000\u0000\u0000\u0316\u030f\u0001\u0000\u0000\u0000\u0316"+
		"\u0310\u0001\u0000\u0000\u0000\u0317\u0093\u0001\u0000\u0000\u0000\u0318"+
		"\u031b\u0003\u0096K\u0000\u0319\u031a\u0005/\u0000\u0000\u031a\u031c\u0003"+
		"\u0094J\u0000\u031b\u0319\u0001\u0000\u0000\u0000\u031b\u031c\u0001\u0000"+
		"\u0000\u0000\u031c\u0095\u0001\u0000\u0000\u0000\u031d\u0320\u0003\u0098"+
		"L\u0000\u031e\u031f\u0005.\u0000\u0000\u031f\u0321\u0003\u0096K\u0000"+
		"\u0320\u031e\u0001\u0000\u0000\u0000\u0320\u0321\u0001\u0000\u0000\u0000"+
		"\u0321\u0097\u0001\u0000\u0000\u0000\u0322\u0325\u0003\u009aM\u0000\u0323"+
		"\u0324\u0005\u001f\u0000\u0000\u0324\u0326\u0003\u0098L\u0000\u0325\u0323"+
		"\u0001\u0000\u0000\u0000\u0325\u0326\u0001\u0000\u0000\u0000\u0326\u0099"+
		"\u0001\u0000\u0000\u0000\u0327\u032a\u0003\u009cN\u0000\u0328\u0329\u0005"+
		"\u001e\u0000\u0000\u0329\u032b\u0003\u009aM\u0000\u032a\u0328\u0001\u0000"+
		"\u0000\u0000\u032a\u032b\u0001\u0000\u0000\u0000\u032b\u009b\u0001\u0000"+
		"\u0000\u0000\u032c\u032f\u0003\u009eO\u0000\u032d\u032e\u0005\t\u0000"+
		"\u0000\u032e\u0330\u0003\u009cN\u0000\u032f\u032d\u0001\u0000\u0000\u0000"+
		"\u032f\u0330\u0001\u0000\u0000\u0000\u0330\u009d\u0001\u0000\u0000\u0000"+
		"\u0331\u0335\u0003\u00a0P\u0000\u0332\u0333\u0003J%\u0000\u0333\u0334"+
		"\u0003\u009eO\u0000\u0334\u0336\u0001\u0000\u0000\u0000\u0335\u0332\u0001"+
		"\u0000\u0000\u0000\u0335\u0336\u0001\u0000\u0000\u0000\u0336\u009f\u0001"+
		"\u0000\u0000\u0000\u0337\u033b\u0003\u00a2Q\u0000\u0338\u0339\u0003<\u001e"+
		"\u0000\u0339\u033a\u0003\u00a0P\u0000\u033a\u033c\u0001\u0000\u0000\u0000"+
		"\u033b\u0338\u0001\u0000\u0000\u0000\u033b\u033c\u0001\u0000\u0000\u0000"+
		"\u033c\u00a1\u0001\u0000\u0000\u0000\u033d\u0340\u0003\u00a4R\u0000\u033e"+
		"\u033f\u0007\u0019\u0000\u0000\u033f\u0341\u0003\u00a2Q\u0000\u0340\u033e"+
		"\u0001\u0000\u0000\u0000\u0340\u0341\u0001\u0000\u0000\u0000\u0341\u00a3"+
		"\u0001\u0000\u0000\u0000\u0342\u0345\u0003\u00a6S\u0000\u0343\u0344\u0007"+
		"\u001a\u0000\u0000\u0344\u0346\u0003\u00a4R\u0000\u0345\u0343\u0001\u0000"+
		"\u0000\u0000\u0345\u0346\u0001\u0000\u0000\u0000\u0346\u00a5\u0001\u0000"+
		"\u0000\u0000\u0347\u034a\u0003\u00a8T\u0000\u0348\u0349\u0007\u001b\u0000"+
		"\u0000\u0349\u034b\u0003\u00a6S\u0000\u034a\u0348\u0001\u0000\u0000\u0000"+
		"\u034a\u034b\u0001\u0000\u0000\u0000\u034b\u00a7\u0001\u0000\u0000\u0000"+
		"\u034c\u034d\u0005\u0001\u0000\u0000\u034d\u034e\u0003\u00aaU\u0000\u034e"+
		"\u034f\u0005\u0002\u0000\u0000\u034f\u0350\u0003\u00a8T\u0000\u0350\u0353"+
		"\u0001\u0000\u0000\u0000\u0351\u0353\u0003\u00acV\u0000\u0352\u034c\u0001"+
		"\u0000\u0000\u0000\u0352\u0351\u0001\u0000\u0000\u0000\u0353\u00a9\u0001"+
		"\u0000\u0000\u0000\u0354\u0358\u0003\u0088D\u0000\u0355\u0357\u0003B!"+
		"\u0000\u0356\u0355\u0001\u0000\u0000\u0000\u0357\u035a\u0001\u0000\u0000"+
		"\u0000\u0358\u0356\u0001\u0000\u0000\u0000\u0358\u0359\u0001\u0000\u0000"+
		"\u0000\u0359\u00ab\u0001\u0000\u0000\u0000\u035a\u0358\u0001\u0000\u0000"+
		"\u0000\u035b\u035c\u0003\u00ba]\u0000\u035c\u035d\u0003\u00a8T\u0000\u035d"+
		"\u036d\u0001\u0000\u0000\u0000\u035e\u036d\u0003\u00aeW\u0000\u035f\u036d"+
		"\u0003\u00b0X\u0000\u0360\u036d\u0003\u00b2Y\u0000\u0361\u0362\u0003t"+
		":\u0000\u0362\u0363\u00053\u0000\u0000\u0363\u0365\u0001\u0000\u0000\u0000"+
		"\u0364\u0361\u0001\u0000\u0000\u0000\u0365\u0368\u0001\u0000\u0000\u0000"+
		"\u0366\u0364\u0001\u0000\u0000\u0000\u0366\u0367\u0001\u0000\u0000\u0000"+
		"\u0367\u036a\u0001\u0000\u0000\u0000\u0368\u0366\u0001\u0000\u0000\u0000"+
		"\u0369\u0366\u0001\u0000\u0000\u0000\u0369\u036a\u0001\u0000\u0000\u0000"+
		"\u036a\u036b\u0001\u0000\u0000\u0000\u036b\u036d\u0003\u00bc^\u0000\u036c"+
		"\u035b\u0001\u0000\u0000\u0000\u036c\u035e\u0001\u0000\u0000\u0000\u036c"+
		"\u035f\u0001\u0000\u0000\u0000\u036c\u0360\u0001\u0000\u0000\u0000\u036c"+
		"\u0369\u0001\u0000\u0000\u0000\u036d\u00ad\u0001\u0000\u0000\u0000\u036e"+
		"\u0370\u00055\u0000\u0000\u036f\u036e\u0001\u0000\u0000\u0000\u036f\u0370"+
		"\u0001\u0000\u0000\u0000\u0370\u0371\u0001\u0000\u0000\u0000\u0371\u0372"+
		"\u0005[\u0000\u0000\u0372\u0373\u0003\u0088D\u0000\u0373\u0375\u0005\u0006"+
		"\u0000\u0000\u0374\u0376\u0003\u0092I\u0000\u0375\u0374\u0001\u0000\u0000"+
		"\u0000\u0375\u0376\u0001\u0000\u0000\u0000\u0376\u0377\u0001\u0000\u0000"+
		"\u0000\u0377\u0378\u0005\u0007\u0000\u0000\u0378\u0390\u0001\u0000\u0000"+
		"\u0000\u0379\u037b\u00055\u0000\u0000\u037a\u0379\u0001\u0000\u0000\u0000"+
		"\u037a\u037b\u0001\u0000\u0000\u0000\u037b\u037c\u0001\u0000\u0000\u0000"+
		"\u037c\u037d\u0005[\u0000\u0000\u037d\u037e\u0003\u0088D\u0000\u037e\u0380"+
		"\u0005\u0001\u0000\u0000\u037f\u0381\u0003\u008eG\u0000\u0380\u037f\u0001"+
		"\u0000\u0000\u0000\u0380\u0381\u0001\u0000\u0000\u0000\u0381\u0382\u0001"+
		"\u0000\u0000\u0000\u0382\u0383\u0005\u0002\u0000\u0000\u0383\u0390\u0001"+
		"\u0000\u0000\u0000\u0384\u0386\u00055\u0000\u0000\u0385\u0384\u0001\u0000"+
		"\u0000\u0000\u0385\u0386\u0001\u0000\u0000\u0000\u0386\u0387\u0001\u0000"+
		"\u0000\u0000\u0387\u0388\u0005[\u0000\u0000\u0388\u0389\u0003\u00bc^\u0000"+
		"\u0389\u038b\u0005\u0001\u0000\u0000\u038a\u038c\u0003\u008eG\u0000\u038b"+
		"\u038a\u0001\u0000\u0000\u0000\u038b\u038c\u0001\u0000\u0000\u0000\u038c"+
		"\u038d\u0001\u0000\u0000\u0000\u038d\u038e\u0005\u0002\u0000\u0000\u038e"+
		"\u0390\u0001\u0000\u0000\u0000\u038f\u036f\u0001\u0000\u0000\u0000\u038f"+
		"\u037a\u0001\u0000\u0000\u0000\u038f\u0385\u0001\u0000\u0000\u0000\u0390"+
		"\u00af\u0001\u0000\u0000\u0000\u0391\u0392\u0003:\u001d\u0000\u0392\u0393"+
		"\u0003\u00a8T\u0000\u0393\u00b1\u0001\u0000\u0000\u0000\u0394\u0395\u0003"+
		"\u00b4Z\u0000\u0395\u0396\u0003\u00b8\\\u0000\u0396\u03a2\u0001\u0000"+
		"\u0000\u0000\u0397\u0398\u0003\u00b4Z\u0000\u0398\u0399\u0005\u0001\u0000"+
		"\u0000\u0399\u039a\u0003\u00b8\\\u0000\u039a\u039b\u0005\u0002\u0000\u0000"+
		"\u039b\u03a2\u0001\u0000\u0000\u0000\u039c\u039d\u0003\u00b4Z\u0000\u039d"+
		"\u039e\u0005\u0001\u0000\u0000\u039e\u039f\u0003\u00b6[\u0000\u039f\u03a0"+
		"\u0005\u0002\u0000\u0000\u03a0\u03a2\u0001\u0000\u0000\u0000\u03a1\u0394"+
		"\u0001\u0000\u0000\u0000\u03a1\u0397\u0001\u0000\u0000\u0000\u03a1\u039c"+
		"\u0001\u0000\u0000\u0000\u03a2\u00b3\u0001\u0000\u0000\u0000\u03a3\u03a4"+
		"\u0005<\u0000\u0000\u03a4\u00b5\u0001\u0000\u0000\u0000\u03a5\u03a9\u0003"+
		"\u0088D\u0000\u03a6\u03a8\u0003B!\u0000\u03a7\u03a6\u0001\u0000\u0000"+
		"\u0000\u03a8\u03ab\u0001\u0000\u0000\u0000\u03a9\u03a7\u0001\u0000\u0000"+
		"\u0000\u03a9\u03aa\u0001\u0000\u0000\u0000\u03aa\u00b7\u0001\u0000\u0000"+
		"\u0000\u03ab\u03a9\u0001\u0000\u0000\u0000\u03ac\u03ad\u0003\u00acV\u0000"+
		"\u03ad\u00b9\u0001\u0000\u0000\u0000\u03ae\u03af\u0007\u001c\u0000\u0000"+
		"\u03af\u00bb\u0001\u0000\u0000\u0000\u03b0\u03b1\u0006^\uffff\uffff\u0000"+
		"\u03b1\u03b2\u0003\u00c2a\u0000\u03b2\u03d7\u0001\u0000\u0000\u0000\u03b3"+
		"\u03b4\n\u0007\u0000\u0000\u03b4\u03b5\u0005\u0006\u0000\u0000\u03b5\u03b6"+
		"\u0003\u008eG\u0000\u03b6\u03b7\u0005\u0007\u0000\u0000\u03b7\u03d6\u0001"+
		"\u0000\u0000\u0000\u03b8\u03b9\n\u0006\u0000\u0000\u03b9\u03ba\u0005\u0001"+
		"\u0000\u0000\u03ba\u03bb\u0003\u00be_\u0000\u03bb\u03bc\u0005\u0002\u0000"+
		"\u0000\u03bc\u03d6\u0001\u0000\u0000\u0000\u03bd\u03be\n\u0005\u0000\u0000"+
		"\u03be\u03c0\u0005=\u0000\u0000\u03bf\u03c1\u0005Z\u0000\u0000\u03c0\u03bf"+
		"\u0001\u0000\u0000\u0000\u03c0\u03c1\u0001\u0000\u0000\u0000\u03c1\u03c2"+
		"\u0001\u0000\u0000\u0000\u03c2\u03d6\u0003t:\u0000\u03c3\u03c4\n\u0004"+
		"\u0000\u0000\u03c4\u03c6\u00053\u0000\u0000\u03c5\u03c7\u0005Z\u0000\u0000"+
		"\u03c6\u03c5\u0001\u0000\u0000\u0000\u03c6\u03c7\u0001\u0000\u0000\u0000"+
		"\u03c7\u03c8\u0001\u0000\u0000\u0000\u03c8\u03d6\u0003t:\u0000\u03c9\u03ca"+
		"\n\u0003\u0000\u0000\u03ca\u03d6\u0003\u00ba]\u0000\u03cb\u03cc\n\u0002"+
		"\u0000\u0000\u03cc\u03cd\u0005>\u0000\u0000\u03cd\u03d3\u0003\u008eG\u0000"+
		"\u03ce\u03d0\u0005\u000f\u0000\u0000\u03cf\u03d1\u0003\u00be_\u0000\u03d0"+
		"\u03cf\u0001\u0000\u0000\u0000\u03d0\u03d1\u0001\u0000\u0000\u0000\u03d1"+
		"\u03d2\u0001\u0000\u0000\u0000\u03d2\u03d4\u0005\u0010\u0000\u0000\u03d3"+
		"\u03ce\u0001\u0000\u0000\u0000\u03d3\u03d4\u0001\u0000\u0000\u0000\u03d4"+
		"\u03d6\u0001\u0000\u0000\u0000\u03d5\u03b3\u0001\u0000\u0000\u0000\u03d5"+
		"\u03b8\u0001\u0000\u0000\u0000\u03d5\u03bd\u0001\u0000\u0000\u0000\u03d5"+
		"\u03c3\u0001\u0000\u0000\u0000\u03d5\u03c9\u0001\u0000\u0000\u0000\u03d5"+
		"\u03cb\u0001\u0000\u0000\u0000\u03d6\u03d9\u0001\u0000\u0000\u0000\u03d7"+
		"\u03d5\u0001\u0000\u0000\u0000\u03d7\u03d8\u0001\u0000\u0000\u0000\u03d8"+
		"\u00bd\u0001\u0000\u0000\u0000\u03d9\u03d7\u0001\u0000\u0000\u0000\u03da"+
		"\u03df\u0003\u00c0`\u0000\u03db\u03dc\u0005\b\u0000\u0000\u03dc\u03de"+
		"\u0003\u00c0`\u0000\u03dd\u03db\u0001\u0000\u0000\u0000\u03de\u03e1\u0001"+
		"\u0000\u0000\u0000\u03df\u03dd\u0001\u0000\u0000\u0000\u03df\u03e0\u0001"+
		"\u0000\u0000\u0000\u03e0\u03e3\u0001\u0000\u0000\u0000\u03e1\u03df\u0001"+
		"\u0000\u0000\u0000\u03e2\u03da\u0001\u0000\u0000\u0000\u03e2\u03e3\u0001"+
		"\u0000\u0000\u0000\u03e3\u00bf\u0001\u0000\u0000\u0000\u03e4\u03e6\u0003"+
		"\u0090H\u0000\u03e5\u03e7\u0007\u0000\u0000\u0000\u03e6\u03e5\u0001\u0000"+
		"\u0000\u0000\u03e6\u03e7\u0001\u0000\u0000\u0000\u03e7\u00c1\u0001\u0000"+
		"\u0000\u0000\u03e8\u03ea\u0003t:\u0000\u03e9\u03eb\u0007\u0000\u0000\u0000"+
		"\u03ea\u03e9\u0001\u0000\u0000\u0000\u03ea\u03eb\u0001\u0000\u0000\u0000"+
		"\u03eb\u03f5\u0001\u0000\u0000\u0000\u03ec\u03ee\u0003>\u001f\u0000\u03ed"+
		"\u03ef\u0007\u0000\u0000\u0000\u03ee\u03ed\u0001\u0000\u0000\u0000\u03ee"+
		"\u03ef\u0001\u0000\u0000\u0000\u03ef\u03f5\u0001\u0000\u0000\u0000\u03f0"+
		"\u03f1\u0005\u0001\u0000\u0000\u03f1\u03f2\u0003\u008eG\u0000\u03f2\u03f3"+
		"\u0005\u0002\u0000\u0000\u03f3\u03f5\u0001\u0000\u0000\u0000\u03f4\u03e8"+
		"\u0001\u0000\u0000\u0000\u03f4\u03ec\u0001\u0000\u0000\u0000\u03f4\u03f0"+
		"\u0001\u0000\u0000\u0000\u03f5\u00c3\u0001\u0000\u0000\u0000~\u00cb\u00cd"+
		"\u00d8\u00ed\u00ff\u0102\u0105\u0108\u0111\u011c\u0124\u0130\u0135\u0138"+
		"\u013b\u0140\u0145\u014f\u0154\u015d\u0160\u0164\u0167\u016a\u0172\u0176"+
		"\u017a\u017d\u0183\u0188\u018e\u0195\u0199\u01a0\u01a7\u01ab\u01ba\u01bd"+
		"\u01c0\u01c7\u01ce\u01d0\u01d3\u01e4\u020e\u0217\u0221\u0228\u022f\u0233"+
		"\u0239\u023c\u023f\u0242\u0249\u024c\u0250\u025c\u0260\u0264\u0281\u0285"+
		"\u0288\u028d\u0291\u0295\u02a0\u02a5\u02a8\u02ab\u02ae\u02bb\u02c2\u02c4"+
		"\u02c7\u02ca\u02ce\u02d3\u02d9\u02dd\u02e1\u02e6\u02ea\u02ee\u02f3\u02f7"+
		"\u02fb\u0307\u030d\u0316\u031b\u0320\u0325\u032a\u032f\u0335\u033b\u0340"+
		"\u0345\u034a\u0352\u0358\u0366\u0369\u036c\u036f\u0375\u037a\u0380\u0385"+
		"\u038b\u038f\u03a1\u03a9\u03c0\u03c6\u03d0\u03d3\u03d5\u03d7\u03df\u03e2"+
		"\u03e6\u03ea\u03ee\u03f4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}