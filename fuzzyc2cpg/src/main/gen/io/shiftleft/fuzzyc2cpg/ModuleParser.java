// Generated from /Users/hellomark/Documents/study/project/fuzzy2vec_mk/fuzzyc2cpg/src/main/antlr4/io/shiftleft/fuzzyc2cpg/Module.g4 by ANTLR 4.10.1
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
public class ModuleParser extends Parser {
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
		T__59=60, T__60=61, T__61=62, T__62=63, IF=64, ELSE=65, FOR=66, WHILE=67, 
		BREAK=68, CASE=69, CONTINUE=70, SWITCH=71, DO=72, GOTO=73, RETURN=74, 
		TYPEDEF=75, EXTERN=76, VOID=77, UNSIGNED=78, SIGNED=79, LONG=80, CV_QUALIFIER=81, 
		VIRTUAL=82, TRY=83, CATCH=84, THROW=85, USING=86, NAMESPACE=87, AUTO=88, 
		REGISTER=89, OPERATOR=90, TEMPLATE=91, NEW=92, EXTENDS=93, IMPLEMENTS=94, 
		GCC_ATTRIBUTE=95, ALPHA_NUMERIC=96, OPENING_CURLY=97, CLOSING_CURLY=98, 
		PRE_IF=99, PRE_ELSE=100, PRE_ENDIF=101, PRE_DEFINE=102, HEX_LITERAL=103, 
		DECIMAL_LITERAL=104, OCTAL_LITERAL=105, BINARY_LITERAL=106, FLOATING_POINT_LITERAL=107, 
		CHAR=108, STRING=109, MULTILINE_STRING=110, COMMENT=111, LINE_COMMENT=112, 
		WHITESPACE=113, ELLIPSIS=114, OTHER=115;
	public static final int
		RULE_code = 0, RULE_using_directive = 1, RULE_function_decl = 2, RULE_function_def = 3, 
		RULE_return_type = 4, RULE_function_param_list = 5, RULE_parameter_decl_clause = 6, 
		RULE_parameter_ptrs = 7, RULE_parameter_decl = 8, RULE_parameter_id = 9, 
		RULE_default_parameter_value = 10, RULE_compound_statement = 11, RULE_ctor_list = 12, 
		RULE_ctor_initializer = 13, RULE_initializer_id = 14, RULE_ctor_expr = 15, 
		RULE_function_name = 16, RULE_exception_specification = 17, RULE_type_id_list = 18, 
		RULE_init_declarator = 19, RULE_declarator = 20, RULE_type_suffix = 21, 
		RULE_assign_expr_w_ = 22, RULE_assign_expr_w__l2 = 23, RULE_constant_expr_w_ = 24, 
		RULE_simple_decl = 25, RULE_storage_class_specifier = 26, RULE_var_decl = 27, 
		RULE_init_declarator_list = 28, RULE_initializer = 29, RULE_initializer_list = 30, 
		RULE_param_decl_specifiers = 31, RULE_parameter_name = 32, RULE_param_type_list = 33, 
		RULE_param_type = 34, RULE_param_type_id = 35, RULE_unary_operator = 36, 
		RULE_relational_operator = 37, RULE_constant = 38, RULE_function_decl_specifiers = 39, 
		RULE_ptr_operator = 40, RULE_access_specifier = 41, RULE_operator = 42, 
		RULE_assignment_operator = 43, RULE_equality_operator = 44, RULE_template_decl = 45, 
		RULE_template_decl_param_list = 46, RULE_template_template = 47, RULE_template_decl_param = 48, 
		RULE_template_decl_keyword = 49, RULE_template_name = 50, RULE_template_args = 51, 
		RULE_template_args_param_list = 52, RULE_template_args_param = 53, RULE_no_brackets = 54, 
		RULE_no_brackets_curlies_or_squares = 55, RULE_no_brackets_or_semicolon = 56, 
		RULE_no_angle_brackets_or_brackets = 57, RULE_no_curlies = 58, RULE_no_squares = 59, 
		RULE_no_squares_or_semicolon = 60, RULE_no_comma_or_semicolon = 61, RULE_assign_water = 62, 
		RULE_assign_water_l2 = 63, RULE_water = 64, RULE_identifier = 65, RULE_number = 66, 
		RULE_ptrs = 67, RULE_func_ptrs = 68, RULE_rvalue_ref = 69, RULE_class_key = 70, 
		RULE_class_def = 71, RULE_class_name = 72, RULE_base_classes = 73, RULE_base_class = 74, 
		RULE_type_name = 75, RULE_base_type = 76, RULE_gcc_attribute = 77, RULE_expr = 78, 
		RULE_assign_expr = 79, RULE_conditional_expression = 80, RULE_or_expression = 81, 
		RULE_and_expression = 82, RULE_inclusive_or_expression = 83, RULE_exclusive_or_expression = 84, 
		RULE_bit_and_expression = 85, RULE_equality_expression = 86, RULE_relational_expression = 87, 
		RULE_shift_expression = 88, RULE_additive_expression = 89, RULE_multiplicative_expression = 90, 
		RULE_cast_expression = 91, RULE_cast_target = 92, RULE_unary_expression = 93, 
		RULE_new_expression = 94, RULE_unary_op_and_cast_expr = 95, RULE_sizeof_expression = 96, 
		RULE_sizeof = 97, RULE_sizeof_operand = 98, RULE_sizeof_operand2 = 99, 
		RULE_inc_dec = 100, RULE_postfix_expression = 101, RULE_function_argument_list = 102, 
		RULE_function_argument = 103, RULE_primary_expression = 104;
	private static String[] makeRuleNames() {
		return new String[] {
			"code", "using_directive", "function_decl", "function_def", "return_type", 
			"function_param_list", "parameter_decl_clause", "parameter_ptrs", "parameter_decl", 
			"parameter_id", "default_parameter_value", "compound_statement", "ctor_list", 
			"ctor_initializer", "initializer_id", "ctor_expr", "function_name", "exception_specification", 
			"type_id_list", "init_declarator", "declarator", "type_suffix", "assign_expr_w_", 
			"assign_expr_w__l2", "constant_expr_w_", "simple_decl", "storage_class_specifier", 
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
			null, "';'", "'throws'", "','", "'('", "')'", "'='", "':'", "'::'", "'['", 
			"']'", "'&'", "'*'", "'+'", "'-'", "'~'", "'!'", "'<'", "'>'", "'<='", 
			"'>='", "'inline'", "'explicit'", "'friend'", "'static'", "'public'", 
			"'private'", "'protected'", "'class'", "'delete'", "'/'", "'%'", "'^'", 
			"'|'", "'+='", "'-='", "'*='", "'/='", "'%='", "'^='", "'&='", "'|='", 
			"'>>'", "'<<'", "'>>='", "'<<='", "'=='", "'!='", "'&&'", "'||'", "'++'", 
			"'--'", "'->*'", "'->'", "'typename'", "'[]'", "'restrict'", "'struct'", 
			"'union'", "'enum'", "'?'", "'sizeof'", "'.'", "'instanceof'", "'if'", 
			"'else'", "'for'", "'while'", "'break'", "'case'", "'continue'", "'switch'", 
			"'do'", "'goto'", "'return'", "'typedef'", "'extern'", "'void'", "'unsigned'", 
			"'signed'", "'long'", null, "'virtual'", "'try'", "'catch'", "'throw'", 
			"'using'", "'namespace'", "'auto'", "'register'", "'operator'", "'template'", 
			"'new'", "'extends'", "'implements'", "'__attribute__'", null, "'{'", 
			"'}'", null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'...'"
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
			null, null, null, null, "IF", "ELSE", "FOR", "WHILE", "BREAK", "CASE", 
			"CONTINUE", "SWITCH", "DO", "GOTO", "RETURN", "TYPEDEF", "EXTERN", "VOID", 
			"UNSIGNED", "SIGNED", "LONG", "CV_QUALIFIER", "VIRTUAL", "TRY", "CATCH", 
			"THROW", "USING", "NAMESPACE", "AUTO", "REGISTER", "OPERATOR", "TEMPLATE", 
			"NEW", "EXTENDS", "IMPLEMENTS", "GCC_ATTRIBUTE", "ALPHA_NUMERIC", "OPENING_CURLY", 
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
	public String getGrammarFileName() { return "Module.g4"; }

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


	public ModuleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CodeContext extends ParserRuleContext {
		public List<Function_declContext> function_decl() {
			return getRuleContexts(Function_declContext.class);
		}
		public Function_declContext function_decl(int i) {
			return getRuleContext(Function_declContext.class,i);
		}
		public List<Function_defContext> function_def() {
			return getRuleContexts(Function_defContext.class);
		}
		public Function_defContext function_def(int i) {
			return getRuleContext(Function_defContext.class,i);
		}
		public List<Simple_declContext> simple_decl() {
			return getRuleContexts(Simple_declContext.class);
		}
		public Simple_declContext simple_decl(int i) {
			return getRuleContext(Simple_declContext.class,i);
		}
		public List<Using_directiveContext> using_directive() {
			return getRuleContexts(Using_directiveContext.class);
		}
		public Using_directiveContext using_directive(int i) {
			return getRuleContext(Using_directiveContext.class,i);
		}
		public List<WaterContext> water() {
			return getRuleContexts(WaterContext.class);
		}
		public WaterContext water(int i) {
			return getRuleContext(WaterContext.class,i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (EXTERN - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (EXTENDS - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (GCC_ATTRIBUTE - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (BINARY_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (MULTILINE_STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (LINE_COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				setState(215);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(210);
					function_decl();
					}
					break;
				case 2:
					{
					setState(211);
					function_def();
					}
					break;
				case 3:
					{
					setState(212);
					simple_decl();
					}
					break;
				case 4:
					{
					setState(213);
					using_directive();
					}
					break;
				case 5:
					{
					setState(214);
					water();
					}
					break;
				}
				}
				setState(219);
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

	public static class Using_directiveContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(ModuleParser.USING, 0); }
		public TerminalNode NAMESPACE() { return getToken(ModuleParser.NAMESPACE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Using_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterUsing_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitUsing_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitUsing_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Using_directiveContext using_directive() throws RecognitionException {
		Using_directiveContext _localctx = new Using_directiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_using_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(USING);
			setState(221);
			match(NAMESPACE);
			setState(222);
			identifier();
			setState(223);
			match(T__0);
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

	public static class Function_declContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Function_param_listContext function_param_list() {
			return getRuleContext(Function_param_listContext.class,0);
		}
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public Ctor_listContext ctor_list() {
			return getRuleContext(Ctor_listContext.class,0);
		}
		public TerminalNode EXTERN() { return getToken(ModuleParser.EXTERN, 0); }
		public List<Template_declContext> template_decl() {
			return getRuleContexts(Template_declContext.class);
		}
		public Template_declContext template_decl(int i) {
			return getRuleContext(Template_declContext.class,i);
		}
		public Function_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunction_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunction_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitFunction_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declContext function_decl() throws RecognitionException {
		Function_declContext _localctx = new Function_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTERN) {
					{
					setState(225);
					match(EXTERN);
					}
				}

				}
				break;
			case 2:
				{
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEMPLATE) {
					{
					{
					setState(228);
					template_decl();
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(236);
				return_type();
				}
				break;
			}
			setState(239);
			function_name();
			setState(240);
			function_param_list();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(241);
				ctor_list();
				}
			}

			setState(244);
			match(T__0);
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

	public static class Function_defContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Function_param_listContext function_param_list() {
			return getRuleContext(Function_param_listContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public List<Template_declContext> template_decl() {
			return getRuleContexts(Template_declContext.class);
		}
		public Template_declContext template_decl(int i) {
			return getRuleContext(Template_declContext.class,i);
		}
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public Ctor_listContext ctor_list() {
			return getRuleContext(Ctor_listContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Function_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunction_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunction_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitFunction_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEMPLATE) {
				{
				{
				setState(246);
				template_decl();
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(252);
				return_type();
				}
				break;
			}
			setState(255);
			function_name();
			setState(256);
			function_param_list();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(257);
				ctor_list();
				}
			}

			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(260);
				match(T__1);
				setState(261);
				identifier();
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(262);
					match(T__2);
					setState(263);
					identifier();
					}
					}
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(271);
			compound_statement();
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

	public static class Return_typeContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Ptr_operatorContext> ptr_operator() {
			return getRuleContexts(Ptr_operatorContext.class);
		}
		public Ptr_operatorContext ptr_operator(int i) {
			return getRuleContext(Ptr_operatorContext.class,i);
		}
		public List<Function_decl_specifiersContext> function_decl_specifiers() {
			return getRuleContexts(Function_decl_specifiersContext.class);
		}
		public Function_decl_specifiersContext function_decl_specifiers(int i) {
			return getRuleContext(Function_decl_specifiersContext.class,i);
		}
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitReturn_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitReturn_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_return_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (T__20 - 21)) | (1L << (T__21 - 21)) | (1L << (T__22 - 21)) | (1L << (T__23 - 21)) | (1L << (VIRTUAL - 21)))) != 0)) {
				{
				{
				setState(273);
				function_decl_specifiers();
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279);
			type_name();
			}
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10 || _la==T__11) {
				{
				{
				setState(281);
				ptr_operator();
				}
				}
				setState(286);
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

	public static class Function_param_listContext extends ParserRuleContext {
		public Parameter_decl_clauseContext parameter_decl_clause() {
			return getRuleContext(Parameter_decl_clauseContext.class,0);
		}
		public List<TerminalNode> CV_QUALIFIER() { return getTokens(ModuleParser.CV_QUALIFIER); }
		public TerminalNode CV_QUALIFIER(int i) {
			return getToken(ModuleParser.CV_QUALIFIER, i);
		}
		public Exception_specificationContext exception_specification() {
			return getRuleContext(Exception_specificationContext.class,0);
		}
		public Function_param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunction_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunction_param_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitFunction_param_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_param_listContext function_param_list() throws RecognitionException {
		Function_param_listContext _localctx = new Function_param_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(T__3);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (LONG - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (BINARY_LITERAL - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)) | (1L << (MULTILINE_STRING - 77)))) != 0)) {
				{
				setState(288);
				parameter_decl_clause();
				}
			}

			setState(291);
			match(T__4);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CV_QUALIFIER) {
				{
				{
				setState(292);
				match(CV_QUALIFIER);
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROW) {
				{
				setState(298);
				exception_specification();
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

	public static class Parameter_decl_clauseContext extends ParserRuleContext {
		public List<Parameter_declContext> parameter_decl() {
			return getRuleContexts(Parameter_declContext.class);
		}
		public Parameter_declContext parameter_decl(int i) {
			return getRuleContext(Parameter_declContext.class,i);
		}
		public TerminalNode ELLIPSIS() { return getToken(ModuleParser.ELLIPSIS, 0); }
		public TerminalNode VOID() { return getToken(ModuleParser.VOID, 0); }
		public Parameter_decl_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_decl_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParameter_decl_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParameter_decl_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitParameter_decl_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_decl_clauseContext parameter_decl_clause() throws RecognitionException {
		Parameter_decl_clauseContext _localctx = new Parameter_decl_clauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameter_decl_clause);
		int _la;
		try {
			int _alt;
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(301);
				parameter_decl();
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(302);
						match(T__2);
						setState(303);
						parameter_decl();
						}
						} 
					}
					setState(308);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				}
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(309);
					match(T__2);
					setState(310);
					match(ELLIPSIS);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				match(VOID);
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

	public static class Parameter_ptrsContext extends ParserRuleContext {
		public PtrsContext ptrs() {
			return getRuleContext(PtrsContext.class,0);
		}
		public Rvalue_refContext rvalue_ref() {
			return getRuleContext(Rvalue_refContext.class,0);
		}
		public Parameter_ptrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_ptrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParameter_ptrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParameter_ptrs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitParameter_ptrs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_ptrsContext parameter_ptrs() throws RecognitionException {
		Parameter_ptrsContext _localctx = new Parameter_ptrsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameter_ptrs);
		try {
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__11:
			case CV_QUALIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				ptrs();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				rvalue_ref();
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

	public static class Parameter_declContext extends ParserRuleContext {
		public Param_decl_specifiersContext param_decl_specifiers() {
			return getRuleContext(Param_decl_specifiersContext.class,0);
		}
		public Parameter_idContext parameter_id() {
			return getRuleContext(Parameter_idContext.class,0);
		}
		public Parameter_ptrsContext parameter_ptrs() {
			return getRuleContext(Parameter_ptrsContext.class,0);
		}
		public Parameter_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParameter_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParameter_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitParameter_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_declContext parameter_decl() throws RecognitionException {
		Parameter_declContext _localctx = new Parameter_declContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameter_decl);
		int _la;
		try {
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				param_decl_specifiers();
				setState(321);
				parameter_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				param_decl_specifiers();
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__47))) != 0) || _la==CV_QUALIFIER) {
					{
					setState(324);
					parameter_ptrs();
					}
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

	public static class Parameter_idContext extends ParserRuleContext {
		public Parameter_idContext parameter_id() {
			return getRuleContext(Parameter_idContext.class,0);
		}
		public Parameter_nameContext parameter_name() {
			return getRuleContext(Parameter_nameContext.class,0);
		}
		public Parameter_ptrsContext parameter_ptrs() {
			return getRuleContext(Parameter_ptrsContext.class,0);
		}
		public Type_suffixContext type_suffix() {
			return getRuleContext(Type_suffixContext.class,0);
		}
		public Default_parameter_valueContext default_parameter_value() {
			return getRuleContext(Default_parameter_valueContext.class,0);
		}
		public Parameter_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParameter_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParameter_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitParameter_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_idContext parameter_id() throws RecognitionException {
		Parameter_idContext _localctx = new Parameter_idContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameter_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__47))) != 0) || _la==CV_QUALIFIER) {
				{
				setState(329);
				parameter_ptrs();
				}
			}

			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(332);
				match(T__3);
				setState(333);
				parameter_id();
				setState(334);
				match(T__4);
				}
				break;
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case ALPHA_NUMERIC:
				{
				setState(336);
				parameter_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3 || _la==T__8) {
				{
				setState(339);
				type_suffix();
				}
			}

			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(342);
				default_parameter_value();
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

	public static class Default_parameter_valueContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Default_parameter_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_parameter_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterDefault_parameter_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitDefault_parameter_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitDefault_parameter_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_parameter_valueContext default_parameter_value() throws RecognitionException {
		Default_parameter_valueContext _localctx = new Default_parameter_valueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_default_parameter_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(T__5);
			setState(346);
			expr();
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

	public static class Compound_statementContext extends ParserRuleContext {
		public TerminalNode OPENING_CURLY() { return getToken(ModuleParser.OPENING_CURLY, 0); }
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCompound_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCompound_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitCompound_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_compound_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
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

	public static class Ctor_listContext extends ParserRuleContext {
		public List<Ctor_initializerContext> ctor_initializer() {
			return getRuleContexts(Ctor_initializerContext.class);
		}
		public Ctor_initializerContext ctor_initializer(int i) {
			return getRuleContext(Ctor_initializerContext.class,i);
		}
		public Ctor_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctor_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCtor_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCtor_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitCtor_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ctor_listContext ctor_list() throws RecognitionException {
		Ctor_listContext _localctx = new Ctor_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ctor_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(T__6);
			setState(352);
			ctor_initializer();
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(353);
				match(T__2);
				setState(354);
				ctor_initializer();
				}
				}
				setState(359);
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

	public static class Ctor_initializerContext extends ParserRuleContext {
		public Initializer_idContext initializer_id() {
			return getRuleContext(Initializer_idContext.class,0);
		}
		public Ctor_exprContext ctor_expr() {
			return getRuleContext(Ctor_exprContext.class,0);
		}
		public Ctor_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctor_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCtor_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCtor_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitCtor_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ctor_initializerContext ctor_initializer() throws RecognitionException {
		Ctor_initializerContext _localctx = new Ctor_initializerContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ctor_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			initializer_id();
			setState(361);
			ctor_expr();
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

	public static class Initializer_idContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Initializer_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInitializer_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInitializer_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitInitializer_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initializer_idContext initializer_id() throws RecognitionException {
		Initializer_idContext _localctx = new Initializer_idContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_initializer_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(363);
				match(T__7);
				}
			}

			setState(366);
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

	public static class Ctor_exprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Ctor_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctor_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCtor_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCtor_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitCtor_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ctor_exprContext ctor_expr() throws RecognitionException {
		Ctor_exprContext _localctx = new Ctor_exprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ctor_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(T__3);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__49) | (1L << T__50) | (1L << T__60))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (NEW - 92)) | (1L << (ALPHA_NUMERIC - 92)) | (1L << (HEX_LITERAL - 92)) | (1L << (DECIMAL_LITERAL - 92)) | (1L << (OCTAL_LITERAL - 92)) | (1L << (BINARY_LITERAL - 92)) | (1L << (FLOATING_POINT_LITERAL - 92)) | (1L << (CHAR - 92)) | (1L << (STRING - 92)) | (1L << (MULTILINE_STRING - 92)))) != 0)) {
				{
				setState(369);
				expr();
				}
			}

			setState(372);
			match(T__4);
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

	public static class Function_nameContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPERATOR() { return getToken(ModuleParser.OPERATOR, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function_name);
		try {
			setState(381);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				match(T__3);
				setState(375);
				function_name();
				setState(376);
				match(T__4);
				}
				break;
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				identifier();
				}
				break;
			case OPERATOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(379);
				match(OPERATOR);
				setState(380);
				operator();
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

	public static class Exception_specificationContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(ModuleParser.THROW, 0); }
		public Type_id_listContext type_id_list() {
			return getRuleContext(Type_id_listContext.class,0);
		}
		public Exception_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterException_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitException_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitException_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exception_specificationContext exception_specification() throws RecognitionException {
		Exception_specificationContext _localctx = new Exception_specificationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exception_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(THROW);
			setState(384);
			match(T__3);
			setState(385);
			type_id_list();
			setState(386);
			match(T__4);
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

	public static class Type_id_listContext extends ParserRuleContext {
		public List<No_bracketsContext> no_brackets() {
			return getRuleContexts(No_bracketsContext.class);
		}
		public No_bracketsContext no_brackets(int i) {
			return getRuleContext(No_bracketsContext.class,i);
		}
		public List<Type_id_listContext> type_id_list() {
			return getRuleContexts(Type_id_listContext.class);
		}
		public Type_id_listContext type_id_list(int i) {
			return getRuleContext(Type_id_listContext.class,i);
		}
		public Type_id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterType_id_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitType_id_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitType_id_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_id_listContext type_id_list() throws RecognitionException {
		Type_id_listContext _localctx = new Type_id_listContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type_id_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (EXTERN - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (EXTENDS - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (GCC_ATTRIBUTE - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (BINARY_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (MULTILINE_STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (LINE_COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(388);
				no_brackets();
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(394);
				match(T__3);
				setState(395);
				type_id_list();
				setState(396);
				match(T__4);
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (EXTERN - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (EXTENDS - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (GCC_ATTRIBUTE - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (BINARY_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (MULTILINE_STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (LINE_COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(397);
					no_brackets();
					}
					}
					setState(402);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(407);
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

	public static class Init_declaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Assign_expr_w_Context assign_expr_w_() {
			return getRuleContext(Assign_expr_w_Context.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Init_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInit_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInit_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitInit_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_declaratorContext init_declarator() throws RecognitionException {
		Init_declaratorContext _localctx = new Init_declaratorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_init_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			declarator();
			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				{
				setState(409);
				match(T__3);
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__49) | (1L << T__50) | (1L << T__60))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (NEW - 92)) | (1L << (ALPHA_NUMERIC - 92)) | (1L << (HEX_LITERAL - 92)) | (1L << (DECIMAL_LITERAL - 92)) | (1L << (OCTAL_LITERAL - 92)) | (1L << (BINARY_LITERAL - 92)) | (1L << (FLOATING_POINT_LITERAL - 92)) | (1L << (CHAR - 92)) | (1L << (STRING - 92)) | (1L << (MULTILINE_STRING - 92)))) != 0)) {
					{
					setState(410);
					expr();
					}
				}

				setState(413);
				match(T__4);
				}
				}
				break;
			case T__5:
				{
				{
				setState(414);
				match(T__5);
				setState(415);
				assign_expr_w_();
				}
				}
				break;
			case T__0:
			case T__2:
				break;
			default:
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declarator);
		int _la;
		try {
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10 || _la==T__11 || _la==CV_QUALIFIER) {
					{
					setState(418);
					ptrs();
					}
				}

				setState(421);
				identifier();
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(422);
					template_args();
					}
				}

				setState(426);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(425);
					type_suffix();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10 || _la==T__11 || _la==CV_QUALIFIER) {
					{
					setState(428);
					ptrs();
					}
				}

				setState(431);
				match(T__3);
				setState(432);
				func_ptrs();
				setState(433);
				identifier();
				setState(434);
				match(T__4);
				setState(435);
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
		public List<Constant_expr_w_Context> constant_expr_w_() {
			return getRuleContexts(Constant_expr_w_Context.class);
		}
		public Constant_expr_w_Context constant_expr_w_(int i) {
			return getRuleContext(Constant_expr_w_Context.class,i);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterType_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitType_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitType_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_suffixContext type_suffix() throws RecognitionException {
		Type_suffixContext _localctx = new Type_suffixContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_type_suffix);
		int _la;
		try {
			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(443); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(439);
					match(T__8);
					setState(440);
					constant_expr_w_();
					setState(441);
					match(T__9);
					}
					}
					setState(445); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__8 );
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
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

	public static class Assign_expr_w_Context extends ParserRuleContext {
		public List<Assign_waterContext> assign_water() {
			return getRuleContexts(Assign_waterContext.class);
		}
		public Assign_waterContext assign_water(int i) {
			return getRuleContext(Assign_waterContext.class,i);
		}
		public List<TerminalNode> OPENING_CURLY() { return getTokens(ModuleParser.OPENING_CURLY); }
		public TerminalNode OPENING_CURLY(int i) {
			return getToken(ModuleParser.OPENING_CURLY, i);
		}
		public List<Assign_expr_w__l2Context> assign_expr_w__l2() {
			return getRuleContexts(Assign_expr_w__l2Context.class);
		}
		public Assign_expr_w__l2Context assign_expr_w__l2(int i) {
			return getRuleContext(Assign_expr_w__l2Context.class,i);
		}
		public List<TerminalNode> CLOSING_CURLY() { return getTokens(ModuleParser.CLOSING_CURLY); }
		public TerminalNode CLOSING_CURLY(int i) {
			return getToken(ModuleParser.CLOSING_CURLY, i);
		}
		public Assign_expr_w_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expr_w_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAssign_expr_w_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAssign_expr_w_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitAssign_expr_w_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_expr_w_Context assign_expr_w_() throws RecognitionException {
		Assign_expr_w_Context _localctx = new Assign_expr_w_Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_assign_expr_w_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (EXTERN - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (EXTENDS - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (GCC_ATTRIBUTE - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (BINARY_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (MULTILINE_STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (LINE_COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(450);
				assign_water();
				}
				}
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__8 || _la==OPENING_CURLY) {
				{
				{
				setState(468);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPENING_CURLY:
					{
					setState(456);
					match(OPENING_CURLY);
					setState(457);
					assign_expr_w__l2();
					setState(458);
					match(CLOSING_CURLY);
					}
					break;
				case T__3:
					{
					setState(460);
					match(T__3);
					setState(461);
					assign_expr_w__l2();
					setState(462);
					match(T__4);
					}
					break;
				case T__8:
					{
					setState(464);
					match(T__8);
					setState(465);
					assign_expr_w__l2();
					setState(466);
					match(T__9);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (EXTERN - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (EXTENDS - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (GCC_ATTRIBUTE - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (BINARY_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (MULTILINE_STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (LINE_COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(470);
					assign_water();
					}
					}
					setState(475);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(480);
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

	public static class Assign_expr_w__l2Context extends ParserRuleContext {
		public List<Assign_water_l2Context> assign_water_l2() {
			return getRuleContexts(Assign_water_l2Context.class);
		}
		public Assign_water_l2Context assign_water_l2(int i) {
			return getRuleContext(Assign_water_l2Context.class,i);
		}
		public List<TerminalNode> OPENING_CURLY() { return getTokens(ModuleParser.OPENING_CURLY); }
		public TerminalNode OPENING_CURLY(int i) {
			return getToken(ModuleParser.OPENING_CURLY, i);
		}
		public List<Assign_expr_w__l2Context> assign_expr_w__l2() {
			return getRuleContexts(Assign_expr_w__l2Context.class);
		}
		public Assign_expr_w__l2Context assign_expr_w__l2(int i) {
			return getRuleContext(Assign_expr_w__l2Context.class,i);
		}
		public List<TerminalNode> CLOSING_CURLY() { return getTokens(ModuleParser.CLOSING_CURLY); }
		public TerminalNode CLOSING_CURLY(int i) {
			return getToken(ModuleParser.CLOSING_CURLY, i);
		}
		public Assign_expr_w__l2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expr_w__l2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAssign_expr_w__l2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAssign_expr_w__l2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitAssign_expr_w__l2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_expr_w__l2Context assign_expr_w__l2() throws RecognitionException {
		Assign_expr_w__l2Context _localctx = new Assign_expr_w__l2Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_assign_expr_w__l2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (EXTERN - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (EXTENDS - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (GCC_ATTRIBUTE - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (BINARY_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (MULTILINE_STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (LINE_COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(481);
				assign_water_l2();
				}
				}
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__8 || _la==OPENING_CURLY) {
				{
				{
				setState(499);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPENING_CURLY:
					{
					setState(487);
					match(OPENING_CURLY);
					setState(488);
					assign_expr_w__l2();
					setState(489);
					match(CLOSING_CURLY);
					}
					break;
				case T__3:
					{
					setState(491);
					match(T__3);
					setState(492);
					assign_expr_w__l2();
					setState(493);
					match(T__4);
					}
					break;
				case T__8:
					{
					setState(495);
					match(T__8);
					setState(496);
					assign_expr_w__l2();
					setState(497);
					match(T__9);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (EXTERN - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (EXTENDS - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (GCC_ATTRIBUTE - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (BINARY_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (MULTILINE_STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (LINE_COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(501);
					assign_water_l2();
					}
					}
					setState(506);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(511);
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

	public static class Constant_expr_w_Context extends ParserRuleContext {
		public List<No_squaresContext> no_squares() {
			return getRuleContexts(No_squaresContext.class);
		}
		public No_squaresContext no_squares(int i) {
			return getRuleContext(No_squaresContext.class,i);
		}
		public List<Constant_expr_w_Context> constant_expr_w_() {
			return getRuleContexts(Constant_expr_w_Context.class);
		}
		public Constant_expr_w_Context constant_expr_w_(int i) {
			return getRuleContext(Constant_expr_w_Context.class,i);
		}
		public Constant_expr_w_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_expr_w_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterConstant_expr_w_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitConstant_expr_w_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitConstant_expr_w_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_expr_w_Context constant_expr_w_() throws RecognitionException {
		Constant_expr_w_Context _localctx = new Constant_expr_w_Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_constant_expr_w_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (EXTERN - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (EXTENDS - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (GCC_ATTRIBUTE - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (BINARY_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (MULTILINE_STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (LINE_COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(512);
				no_squares();
				}
				}
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(518);
				match(T__8);
				setState(519);
				constant_expr_w_();
				setState(520);
				match(T__9);
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IF - 64)) | (1L << (ELSE - 64)) | (1L << (FOR - 64)) | (1L << (WHILE - 64)) | (1L << (BREAK - 64)) | (1L << (CASE - 64)) | (1L << (CONTINUE - 64)) | (1L << (SWITCH - 64)) | (1L << (DO - 64)) | (1L << (GOTO - 64)) | (1L << (RETURN - 64)) | (1L << (TYPEDEF - 64)) | (1L << (EXTERN - 64)) | (1L << (VOID - 64)) | (1L << (UNSIGNED - 64)) | (1L << (SIGNED - 64)) | (1L << (LONG - 64)) | (1L << (CV_QUALIFIER - 64)) | (1L << (VIRTUAL - 64)) | (1L << (TRY - 64)) | (1L << (CATCH - 64)) | (1L << (THROW - 64)) | (1L << (USING - 64)) | (1L << (NAMESPACE - 64)) | (1L << (AUTO - 64)) | (1L << (REGISTER - 64)) | (1L << (OPERATOR - 64)) | (1L << (TEMPLATE - 64)) | (1L << (NEW - 64)) | (1L << (EXTENDS - 64)) | (1L << (IMPLEMENTS - 64)) | (1L << (GCC_ATTRIBUTE - 64)) | (1L << (ALPHA_NUMERIC - 64)) | (1L << (OPENING_CURLY - 64)) | (1L << (CLOSING_CURLY - 64)) | (1L << (PRE_IF - 64)) | (1L << (PRE_ELSE - 64)) | (1L << (PRE_ENDIF - 64)) | (1L << (PRE_DEFINE - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (BINARY_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)) | (1L << (MULTILINE_STRING - 64)) | (1L << (COMMENT - 64)) | (1L << (LINE_COMMENT - 64)) | (1L << (WHITESPACE - 64)) | (1L << (ELLIPSIS - 64)) | (1L << (OTHER - 64)))) != 0)) {
					{
					{
					setState(521);
					no_squares();
					}
					}
					setState(526);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(531);
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

	public static class Simple_declContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public List<Storage_class_specifierContext> storage_class_specifier() {
			return getRuleContexts(Storage_class_specifierContext.class);
		}
		public Storage_class_specifierContext storage_class_specifier(int i) {
			return getRuleContext(Storage_class_specifierContext.class,i);
		}
		public Simple_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterSimple_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitSimple_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitSimple_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_declContext simple_decl() throws RecognitionException {
		Simple_declContext _localctx = new Simple_declContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_simple_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPEDEF || _la==EXTERN) {
				{
				{
				setState(532);
				storage_class_specifier();
				}
				}
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(538);
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

	public static class Storage_class_specifierContext extends ParserRuleContext {
		public TerminalNode EXTERN() { return getToken(ModuleParser.EXTERN, 0); }
		public TerminalNode TYPEDEF() { return getToken(ModuleParser.TYPEDEF, 0); }
		public Storage_class_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storage_class_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterStorage_class_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitStorage_class_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitStorage_class_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Storage_class_specifierContext storage_class_specifier() throws RecognitionException {
		Storage_class_specifierContext _localctx = new Storage_class_specifierContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_storage_class_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			_la = _input.LA(1);
			if ( !(_la==TYPEDEF || _la==EXTERN) ) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterDeclByClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitDeclByClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitDeclByClass(this);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterDeclByType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitDeclByType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitDeclByType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_var_decl);
		int _la;
		try {
			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				_localctx = new DeclByClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				class_def();
				setState(544);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(543);
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
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEMPLATE) {
					{
					{
					setState(546);
					template_decl();
					}
					}
					setState(551);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(552);
				type_name();
				setState(553);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInit_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInit_declarator_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitInit_declarator_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_declarator_listContext init_declarator_list() throws RecognitionException {
		Init_declarator_listContext _localctx = new Init_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_init_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			init_declarator();
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(558);
				match(T__2);
				setState(559);
				init_declarator();
				}
				}
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(565);
			match(T__0);
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
		public TerminalNode OPENING_CURLY() { return getToken(ModuleParser.OPENING_CURLY, 0); }
		public Initializer_listContext initializer_list() {
			return getRuleContext(Initializer_listContext.class,0);
		}
		public TerminalNode CLOSING_CURLY() { return getToken(ModuleParser.CLOSING_CURLY, 0); }
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_initializer);
		try {
			setState(572);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__7:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__49:
			case T__50:
			case T__60:
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
				setState(567);
				assign_expr();
				}
				break;
			case OPENING_CURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
				match(OPENING_CURLY);
				setState(569);
				initializer_list();
				setState(570);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInitializer_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInitializer_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitInitializer_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initializer_listContext initializer_list() throws RecognitionException {
		Initializer_listContext _localctx = new Initializer_listContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_initializer_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			initializer();
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(575);
				match(T__2);
				setState(576);
				initializer();
				}
				}
				setState(581);
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
		public TerminalNode AUTO() { return getToken(ModuleParser.AUTO, 0); }
		public TerminalNode REGISTER() { return getToken(ModuleParser.REGISTER, 0); }
		public Param_decl_specifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl_specifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParam_decl_specifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParam_decl_specifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitParam_decl_specifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_decl_specifiersContext param_decl_specifiers() throws RecognitionException {
		Param_decl_specifiersContext _localctx = new Param_decl_specifiersContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_param_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(582);
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
			setState(585);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParameter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParameter_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitParameter_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_nameContext parameter_name() throws RecognitionException {
		Parameter_nameContext _localctx = new Parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_parameter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
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
		public TerminalNode VOID() { return getToken(ModuleParser.VOID, 0); }
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParam_type_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParam_type_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitParam_type_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_type_listContext param_type_list() throws RecognitionException {
		Param_type_listContext _localctx = new Param_type_listContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_param_type_list);
		int _la;
		try {
			setState(604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				match(T__3);
				setState(590);
				match(VOID);
				setState(591);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				match(T__3);
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (VOID - 77)) | (1L << (UNSIGNED - 77)) | (1L << (SIGNED - 77)) | (1L << (LONG - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (AUTO - 77)) | (1L << (REGISTER - 77)) | (1L << (ALPHA_NUMERIC - 77)) | (1L << (HEX_LITERAL - 77)) | (1L << (DECIMAL_LITERAL - 77)) | (1L << (OCTAL_LITERAL - 77)) | (1L << (BINARY_LITERAL - 77)) | (1L << (FLOATING_POINT_LITERAL - 77)) | (1L << (CHAR - 77)) | (1L << (STRING - 77)) | (1L << (MULTILINE_STRING - 77)))) != 0)) {
					{
					setState(593);
					param_type();
					setState(598);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(594);
						match(T__2);
						setState(595);
						param_type();
						}
						}
						setState(600);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(603);
				match(T__4);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParam_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParam_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitParam_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_typeContext param_type() throws RecognitionException {
		Param_typeContext _localctx = new Param_typeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_param_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			param_decl_specifiers();
			setState(607);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterParam_type_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitParam_type_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitParam_type_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_type_idContext param_type_id() throws RecognitionException {
		Param_type_idContext _localctx = new Param_type_idContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_param_type_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10 || _la==T__11 || _la==CV_QUALIFIER) {
				{
				setState(609);
				ptrs();
				}
			}

			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(612);
				match(T__3);
				setState(613);
				param_type_id();
				setState(614);
				match(T__4);
				}
				break;
			case 2:
				{
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0) || _la==ALPHA_NUMERIC) {
					{
					setState(616);
					parameter_name();
					}
				}

				}
				break;
			}
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3 || _la==T__8) {
				{
				setState(621);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterRelational_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitRelational_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitRelational_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_operatorContext relational_operator() throws RecognitionException {
		Relational_operatorContext _localctx = new Relational_operatorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_relational_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
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
		public TerminalNode HEX_LITERAL() { return getToken(ModuleParser.HEX_LITERAL, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(ModuleParser.OCTAL_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ModuleParser.DECIMAL_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(ModuleParser.BINARY_LITERAL, 0); }
		public TerminalNode STRING() { return getToken(ModuleParser.STRING, 0); }
		public TerminalNode MULTILINE_STRING() { return getToken(ModuleParser.MULTILINE_STRING, 0); }
		public TerminalNode CHAR() { return getToken(ModuleParser.CHAR, 0); }
		public TerminalNode FLOATING_POINT_LITERAL() { return getToken(ModuleParser.FLOATING_POINT_LITERAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			_la = _input.LA(1);
			if ( !(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (HEX_LITERAL - 103)) | (1L << (DECIMAL_LITERAL - 103)) | (1L << (OCTAL_LITERAL - 103)) | (1L << (BINARY_LITERAL - 103)) | (1L << (FLOATING_POINT_LITERAL - 103)) | (1L << (CHAR - 103)) | (1L << (STRING - 103)) | (1L << (MULTILINE_STRING - 103)))) != 0)) ) {
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
		public TerminalNode VIRTUAL() { return getToken(ModuleParser.VIRTUAL, 0); }
		public Function_decl_specifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_decl_specifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunction_decl_specifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunction_decl_specifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitFunction_decl_specifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_decl_specifiersContext function_decl_specifiers() throws RecognitionException {
		Function_decl_specifiersContext _localctx = new Function_decl_specifiersContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_function_decl_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			_la = _input.LA(1);
			if ( !(((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (T__20 - 21)) | (1L << (T__21 - 21)) | (1L << (T__22 - 21)) | (1L << (T__23 - 21)) | (1L << (VIRTUAL - 21)))) != 0)) ) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPtr_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPtr_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitPtr_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ptr_operatorContext ptr_operator() throws RecognitionException {
		Ptr_operatorContext _localctx = new Ptr_operatorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_ptr_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__11) ) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAccess_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAccess_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitAccess_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_specifierContext access_specifier() throws RecognitionException {
		Access_specifierContext _localctx = new Access_specifierContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_access_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
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
		public TerminalNode NEW() { return getToken(ModuleParser.NEW, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_operator);
		int _la;
		try {
			setState(681);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(636);
				_la = _input.LA(1);
				if ( !(_la==T__28 || _la==NEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(639);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(637);
					match(T__8);
					setState(638);
					match(T__9);
					}
				}

				}
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(641);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(642);
				match(T__13);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(643);
				match(T__11);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 5);
				{
				setState(644);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 6);
				{
				setState(645);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 7);
				{
				setState(646);
				match(T__31);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 8);
				{
				setState(647);
				match(T__10);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 9);
				{
				setState(648);
				match(T__32);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 10);
				{
				setState(649);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 11);
				{
				setState(650);
				match(T__15);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 12);
				{
				setState(651);
				match(T__5);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 13);
				{
				setState(652);
				match(T__16);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 14);
				{
				setState(653);
				match(T__17);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 15);
				{
				setState(654);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 16);
				{
				setState(655);
				match(T__34);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 17);
				{
				setState(656);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 18);
				{
				setState(657);
				match(T__36);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 19);
				{
				setState(658);
				match(T__37);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 20);
				{
				setState(659);
				match(T__38);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 21);
				{
				setState(660);
				match(T__39);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 22);
				{
				setState(661);
				match(T__40);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 23);
				{
				setState(662);
				match(T__41);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 24);
				{
				setState(663);
				match(T__42);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 25);
				{
				setState(664);
				match(T__43);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 26);
				{
				setState(665);
				match(T__44);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 27);
				{
				setState(666);
				match(T__45);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 28);
				{
				setState(667);
				match(T__46);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 29);
				{
				setState(668);
				match(T__18);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 30);
				{
				setState(669);
				match(T__19);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 31);
				{
				setState(670);
				match(T__47);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 32);
				{
				setState(671);
				match(T__48);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 33);
				{
				setState(672);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 34);
				{
				setState(673);
				match(T__50);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 35);
				{
				setState(674);
				match(T__2);
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 36);
				{
				setState(675);
				match(T__51);
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 37);
				{
				setState(676);
				match(T__52);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 38);
				{
				setState(677);
				match(T__3);
				setState(678);
				match(T__4);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 39);
				{
				setState(679);
				match(T__8);
				setState(680);
				match(T__9);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAssignment_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitAssignment_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__43) | (1L << T__44))) != 0)) ) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterEquality_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitEquality_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitEquality_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_operatorContext equality_operator() throws RecognitionException {
		Equality_operatorContext _localctx = new Equality_operatorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_equality_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			_la = _input.LA(1);
			if ( !(_la==T__45 || _la==T__46) ) {
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
		public TerminalNode TEMPLATE() { return getToken(ModuleParser.TEMPLATE, 0); }
		public Template_decl_param_listContext template_decl_param_list() {
			return getRuleContext(Template_decl_param_listContext.class,0);
		}
		public Template_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterTemplate_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitTemplate_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitTemplate_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_declContext template_decl() throws RecognitionException {
		Template_declContext _localctx = new Template_declContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_template_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(TEMPLATE);
			setState(688);
			match(T__16);
			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__53))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (CV_QUALIFIER - 81)) | (1L << (TEMPLATE - 81)) | (1L << (ALPHA_NUMERIC - 81)))) != 0)) {
				{
				setState(689);
				template_decl_param_list(0);
				}
			}

			setState(692);
			match(T__17);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterTemplate_decl_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitTemplate_decl_param_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitTemplate_decl_param_list(this);
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
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_template_decl_param_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEMPLATE:
				{
				setState(695);
				template_template();
				setState(696);
				template_decl_keyword();
				setState(697);
				template_name();
				}
				break;
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__53:
			case CV_QUALIFIER:
			case ALPHA_NUMERIC:
				{
				setState(699);
				template_decl_param();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(707);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Template_decl_param_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_template_decl_param_list);
					setState(702);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(703);
					match(T__2);
					setState(704);
					template_decl_param();
					}
					} 
				}
				setState(709);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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
		public TerminalNode TEMPLATE() { return getToken(ModuleParser.TEMPLATE, 0); }
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterTemplate_template(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitTemplate_template(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitTemplate_template(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_templateContext template_template() throws RecognitionException {
		Template_templateContext _localctx = new Template_templateContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_template_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(TEMPLATE);
			setState(711);
			match(T__16);
			setState(716); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(712);
				template_decl_keyword();
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(713);
					match(T__2);
					}
				}

				}
				}
				setState(718); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__27 || _la==T__53 );
			setState(720);
			match(T__17);
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
		public TerminalNode CV_QUALIFIER() { return getToken(ModuleParser.CV_QUALIFIER, 0); }
		public Template_decl_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_decl_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterTemplate_decl_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitTemplate_decl_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitTemplate_decl_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_decl_paramContext template_decl_param() throws RecognitionException {
		Template_decl_paramContext _localctx = new Template_decl_paramContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_template_decl_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(722);
				template_decl_keyword();
				}
				break;
			case 2:
				{
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CV_QUALIFIER) {
					{
					setState(723);
					match(CV_QUALIFIER);
					}
				}

				setState(726);
				identifier();
				}
				break;
			}
			setState(730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(729);
				template_name();
				}
				break;
			}
			setState(733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(732);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterTemplate_decl_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitTemplate_decl_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitTemplate_decl_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_decl_keywordContext template_decl_keyword() throws RecognitionException {
		Template_decl_keywordContext _localctx = new Template_decl_keywordContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_template_decl_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			_la = _input.LA(1);
			if ( !(_la==T__27 || _la==T__53) ) {
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
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(ModuleParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(ModuleParser.ALPHA_NUMERIC, i);
		}
		public TerminalNode ELLIPSIS() { return getToken(ModuleParser.ELLIPSIS, 0); }
		public Template_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterTemplate_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitTemplate_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitTemplate_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_nameContext template_name() throws RecognitionException {
		Template_nameContext _localctx = new Template_nameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_template_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(738); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(737);
					match(ALPHA_NUMERIC);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(740); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(743);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(742);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterTemplate_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitTemplate_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitTemplate_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_argsContext template_args() throws RecognitionException {
		Template_argsContext _localctx = new Template_argsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_template_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			match(T__16);
			setState(747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (VOID - 77)) | (1L << (LONG - 77)) | (1L << (CV_QUALIFIER - 77)) | (1L << (AUTO - 77)) | (1L << (ALPHA_NUMERIC - 77)))) != 0)) {
				{
				setState(746);
				template_args_param_list(0);
				}
			}

			setState(749);
			match(T__17);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterTemplate_args_param_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitTemplate_args_param_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitTemplate_args_param_list(this);
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
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_template_args_param_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(752);
			template_args_param();
			}
			_ctx.stop = _input.LT(-1);
			setState(759);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Template_args_param_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_template_args_param_list);
					setState(754);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(755);
					match(T__2);
					setState(756);
					template_args_param();
					}
					} 
				}
				setState(761);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
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
		public TerminalNode CV_QUALIFIER() { return getToken(ModuleParser.CV_QUALIFIER, 0); }
		public Ptr_operatorContext ptr_operator() {
			return getRuleContext(Ptr_operatorContext.class,0);
		}
		public Template_args_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_args_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterTemplate_args_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitTemplate_args_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitTemplate_args_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_args_paramContext template_args_param() throws RecognitionException {
		Template_args_paramContext _localctx = new Template_args_paramContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_template_args_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CV_QUALIFIER) {
				{
				setState(762);
				match(CV_QUALIFIER);
				}
			}

			setState(765);
			base_type();
			setState(767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(766);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_brackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_brackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitNo_brackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_bracketsContext no_brackets() throws RecognitionException {
		No_bracketsContext _localctx = new No_bracketsContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_no_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__3 || _la==T__4) ) {
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
		public TerminalNode OPENING_CURLY() { return getToken(ModuleParser.OPENING_CURLY, 0); }
		public TerminalNode CLOSING_CURLY() { return getToken(ModuleParser.CLOSING_CURLY, 0); }
		public No_brackets_curlies_or_squaresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_brackets_curlies_or_squares; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_brackets_curlies_or_squares(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_brackets_curlies_or_squares(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitNo_brackets_curlies_or_squares(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_brackets_curlies_or_squaresContext no_brackets_curlies_or_squares() throws RecognitionException {
		No_brackets_curlies_or_squaresContext _localctx = new No_brackets_curlies_or_squaresContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_no_brackets_curlies_or_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__8) | (1L << T__9))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_brackets_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_brackets_or_semicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitNo_brackets_or_semicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_brackets_or_semicolonContext no_brackets_or_semicolon() throws RecognitionException {
		No_brackets_or_semicolonContext _localctx = new No_brackets_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_no_brackets_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4))) != 0)) ) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_angle_brackets_or_brackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_angle_brackets_or_brackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitNo_angle_brackets_or_brackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_angle_brackets_or_bracketsContext no_angle_brackets_or_brackets() throws RecognitionException {
		No_angle_brackets_or_bracketsContext _localctx = new No_angle_brackets_or_bracketsContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_no_angle_brackets_or_brackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__16) | (1L << T__17))) != 0)) ) {
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
		public TerminalNode OPENING_CURLY() { return getToken(ModuleParser.OPENING_CURLY, 0); }
		public TerminalNode CLOSING_CURLY() { return getToken(ModuleParser.CLOSING_CURLY, 0); }
		public No_curliesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no_curlies; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_curlies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_curlies(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitNo_curlies(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_curliesContext no_curlies() throws RecognitionException {
		No_curliesContext _localctx = new No_curliesContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_no_curlies);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_squares(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_squares(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitNo_squares(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_squaresContext no_squares() throws RecognitionException {
		No_squaresContext _localctx = new No_squaresContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_no_squares);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__8 || _la==T__9) ) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_squares_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_squares_or_semicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitNo_squares_or_semicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_squares_or_semicolonContext no_squares_or_semicolon() throws RecognitionException {
		No_squares_or_semicolonContext _localctx = new No_squares_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_no_squares_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__9))) != 0)) ) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNo_comma_or_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNo_comma_or_semicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitNo_comma_or_semicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final No_comma_or_semicolonContext no_comma_or_semicolon() throws RecognitionException {
		No_comma_or_semicolonContext _localctx = new No_comma_or_semicolonContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_no_comma_or_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__0 || _la==T__2) ) {
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
		public TerminalNode OPENING_CURLY() { return getToken(ModuleParser.OPENING_CURLY, 0); }
		public TerminalNode CLOSING_CURLY() { return getToken(ModuleParser.CLOSING_CURLY, 0); }
		public Assign_waterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_water; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAssign_water(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAssign_water(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitAssign_water(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_waterContext assign_water() throws RecognitionException {
		Assign_waterContext _localctx = new Assign_waterContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_assign_water);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__8) | (1L << T__9))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
		public TerminalNode OPENING_CURLY() { return getToken(ModuleParser.OPENING_CURLY, 0); }
		public TerminalNode CLOSING_CURLY() { return getToken(ModuleParser.CLOSING_CURLY, 0); }
		public Assign_water_l2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_water_l2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAssign_water_l2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAssign_water_l2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitAssign_water_l2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_water_l2Context assign_water_l2() throws RecognitionException {
		Assign_water_l2Context _localctx = new Assign_water_l2Context(_ctx, getState());
		enterRule(_localctx, 126, RULE_assign_water_l2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__8) | (1L << T__9))) != 0) || _la==OPENING_CURLY || _la==CLOSING_CURLY) ) {
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterWater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitWater(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitWater(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WaterContext water() throws RecognitionException {
		WaterContext _localctx = new WaterContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_water);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
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
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(ModuleParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(ModuleParser.ALPHA_NUMERIC, i);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_identifier);
		try {
			int _alt;
			setState(803);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(791);
				match(ALPHA_NUMERIC);
				setState(796);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(792);
						match(T__7);
						setState(793);
						match(ALPHA_NUMERIC);
						}
						} 
					}
					setState(798);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				}
				}
				setState(800);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(799);
					match(T__54);
					}
					break;
				}
				}
				break;
			case T__24:
			case T__25:
			case T__26:
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(802);
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
		public TerminalNode HEX_LITERAL() { return getToken(ModuleParser.HEX_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ModuleParser.DECIMAL_LITERAL, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(ModuleParser.OCTAL_LITERAL, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			_la = _input.LA(1);
			if ( !(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (HEX_LITERAL - 103)) | (1L << (DECIMAL_LITERAL - 103)) | (1L << (OCTAL_LITERAL - 103)))) != 0)) ) {
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
		public List<TerminalNode> CV_QUALIFIER() { return getTokens(ModuleParser.CV_QUALIFIER); }
		public TerminalNode CV_QUALIFIER(int i) {
			return getToken(ModuleParser.CV_QUALIFIER, i);
		}
		public PtrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPtrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPtrs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitPtrs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PtrsContext ptrs() throws RecognitionException {
		PtrsContext _localctx = new PtrsContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_ptrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CV_QUALIFIER) {
					{
					setState(807);
					match(CV_QUALIFIER);
					}
				}

				setState(810);
				ptr_operator();
				setState(812);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__55) {
					{
					setState(811);
					match(T__55);
					}
				}

				}
				}
				setState(816); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__10 || _la==T__11 || _la==CV_QUALIFIER );
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunc_ptrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunc_ptrs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitFunc_ptrs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_ptrsContext func_ptrs() throws RecognitionException {
		Func_ptrsContext _localctx = new Func_ptrsContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_func_ptrs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterRvalue_ref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitRvalue_ref(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitRvalue_ref(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rvalue_refContext rvalue_ref() throws RecognitionException {
		Rvalue_refContext _localctx = new Rvalue_refContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_rvalue_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			match(T__47);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterClass_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitClass_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitClass_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_keyContext class_key() throws RecognitionException {
		Class_keyContext _localctx = new Class_keyContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_class_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0)) ) {
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
		public TerminalNode OPENING_CURLY() { return getToken(ModuleParser.OPENING_CURLY, 0); }
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterClass_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitClass_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitClass_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEMPLATE) {
				{
				{
				setState(824);
				template_decl();
				}
				}
				setState(829);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(830);
			class_key();
			setState(832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GCC_ATTRIBUTE) {
				{
				setState(831);
				gcc_attribute();
				}
			}

			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0) || _la==ALPHA_NUMERIC) {
				{
				setState(834);
				class_name();
				}
			}

			setState(838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(837);
				template_args();
				}
			}

			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6 || _la==EXTENDS || _la==IMPLEMENTS) {
				{
				setState(840);
				base_classes();
				}
			}

			setState(843);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterClass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitClass_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitClass_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
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
		public List<TerminalNode> EXTENDS() { return getTokens(ModuleParser.EXTENDS); }
		public TerminalNode EXTENDS(int i) {
			return getToken(ModuleParser.EXTENDS, i);
		}
		public List<TerminalNode> IMPLEMENTS() { return getTokens(ModuleParser.IMPLEMENTS); }
		public TerminalNode IMPLEMENTS(int i) {
			return getToken(ModuleParser.IMPLEMENTS, i);
		}
		public Base_classesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_classes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterBase_classes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitBase_classes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitBase_classes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_classesContext base_classes() throws RecognitionException {
		Base_classesContext _localctx = new Base_classesContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_base_classes);
		int _la;
		try {
			setState(863);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(848);
				match(T__6);
				setState(849);
				base_class();
				setState(854);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(850);
					match(T__2);
					setState(851);
					base_class();
					}
					}
					setState(856);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case EXTENDS:
			case IMPLEMENTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(859); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(857);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==IMPLEMENTS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(858);
					base_class();
					}
					}
					setState(861); 
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
		public TerminalNode VIRTUAL() { return getToken(ModuleParser.VIRTUAL, 0); }
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterBase_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitBase_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitBase_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_classContext base_class() throws RecognitionException {
		Base_classContext _localctx = new Base_classContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_base_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRTUAL) {
				{
				setState(865);
				match(VIRTUAL);
				}
			}

			setState(869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(868);
				access_specifier();
				}
				break;
			}
			setState(871);
			identifier();
			setState(873);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(872);
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
		public List<TerminalNode> CV_QUALIFIER() { return getTokens(ModuleParser.CV_QUALIFIER); }
		public TerminalNode CV_QUALIFIER(int i) {
			return getToken(ModuleParser.CV_QUALIFIER, i);
		}
		public Class_keyContext class_key() {
			return getRuleContext(Class_keyContext.class,0);
		}
		public TerminalNode UNSIGNED() { return getToken(ModuleParser.UNSIGNED, 0); }
		public TerminalNode SIGNED() { return getToken(ModuleParser.SIGNED, 0); }
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_type_name);
		int _la;
		try {
			setState(910);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(878);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CV_QUALIFIER) {
					{
					{
					setState(875);
					match(CV_QUALIFIER);
					}
					}
					setState(880);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(884);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__27:
				case T__56:
				case T__57:
				case T__58:
					{
					setState(881);
					class_key();
					}
					break;
				case UNSIGNED:
					{
					setState(882);
					match(UNSIGNED);
					}
					break;
				case SIGNED:
					{
					setState(883);
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
				setState(886);
				base_type();
				setState(888);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(887);
					template_args();
					}
				}

				setState(892);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(890);
					match(T__8);
					setState(891);
					match(T__9);
					}
					break;
				}
				setState(901);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(894);
					match(T__7);
					setState(895);
					base_type();
					setState(897);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__16) {
						{
						setState(896);
						template_args();
						}
					}

					}
					}
					setState(903);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(905);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(904);
					match(CV_QUALIFIER);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(907);
				postfix_expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(908);
				match(UNSIGNED);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(909);
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
		public List<TerminalNode> ALPHA_NUMERIC() { return getTokens(ModuleParser.ALPHA_NUMERIC); }
		public TerminalNode ALPHA_NUMERIC(int i) {
			return getToken(ModuleParser.ALPHA_NUMERIC, i);
		}
		public List<TerminalNode> AUTO() { return getTokens(ModuleParser.AUTO); }
		public TerminalNode AUTO(int i) {
			return getToken(ModuleParser.AUTO, i);
		}
		public List<TerminalNode> VOID() { return getTokens(ModuleParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(ModuleParser.VOID, i);
		}
		public List<TerminalNode> LONG() { return getTokens(ModuleParser.LONG); }
		public TerminalNode LONG(int i) {
			return getToken(ModuleParser.LONG, i);
		}
		public List<TerminalNode> ELLIPSIS() { return getTokens(ModuleParser.ELLIPSIS); }
		public TerminalNode ELLIPSIS(int i) {
			return getToken(ModuleParser.ELLIPSIS, i);
		}
		public Base_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterBase_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitBase_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitBase_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_typeContext base_type() throws RecognitionException {
		Base_typeContext _localctx = new Base_typeContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_base_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(916); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(912);
					_la = _input.LA(1);
					if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (VOID - 77)) | (1L << (LONG - 77)) | (1L << (AUTO - 77)) | (1L << (ALPHA_NUMERIC - 77)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(914);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
					case 1:
						{
						setState(913);
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
				setState(918); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
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
		public TerminalNode GCC_ATTRIBUTE() { return getToken(ModuleParser.GCC_ATTRIBUTE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Gcc_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gcc_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterGcc_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitGcc_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitGcc_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gcc_attributeContext gcc_attribute() throws RecognitionException {
		Gcc_attributeContext _localctx = new Gcc_attributeContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_gcc_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			match(GCC_ATTRIBUTE);
			setState(921);
			match(T__3);
			setState(922);
			match(T__3);
			setState(923);
			identifier();
			setState(924);
			match(T__4);
			setState(925);
			match(T__4);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			assign_expr();
			setState(930);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(928);
				match(T__2);
				setState(929);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAssign_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAssign_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitAssign_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_exprContext assign_expr() throws RecognitionException {
		Assign_exprContext _localctx = new Assign_exprContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_assign_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			conditional_expression();
			setState(936);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(933);
				assignment_operator();
				setState(934);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNormOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNormOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitNormOr(this);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitCndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_conditional_expression);
		try {
			setState(945);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				_localctx = new NormOrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(938);
				or_expression();
				}
				break;
			case 2:
				_localctx = new CndExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(939);
				or_expression();
				{
				setState(940);
				match(T__59);
				setState(941);
				expr();
				setState(942);
				match(T__6);
				setState(943);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterOr_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitOr_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitOr_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_expressionContext or_expression() throws RecognitionException {
		Or_expressionContext _localctx = new Or_expressionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_or_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
			and_expression();
			setState(950);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(948);
				match(T__48);
				setState(949);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAnd_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitAnd_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_and_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			inclusive_or_expression();
			setState(955);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(953);
				match(T__47);
				setState(954);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInclusive_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitInclusive_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inclusive_or_expressionContext inclusive_or_expression() throws RecognitionException {
		Inclusive_or_expressionContext _localctx = new Inclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_inclusive_or_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			exclusive_or_expression();
			setState(960);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(958);
				match(T__32);
				setState(959);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterExclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitExclusive_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitExclusive_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exclusive_or_expressionContext exclusive_or_expression() throws RecognitionException {
		Exclusive_or_expressionContext _localctx = new Exclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_exclusive_or_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			bit_and_expression();
			setState(965);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(963);
				match(T__31);
				setState(964);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterBit_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitBit_and_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitBit_and_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bit_and_expressionContext bit_and_expression() throws RecognitionException {
		Bit_and_expressionContext _localctx = new Bit_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_bit_and_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			equality_expression();
			setState(970);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(968);
				match(T__10);
				setState(969);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitEquality_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitEquality_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_equality_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972);
			relational_expression();
			setState(976);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(973);
				equality_operator();
				setState(974);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitRelational_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitRelational_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_relational_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			shift_expression();
			setState(982);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(979);
				relational_operator();
				setState(980);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterShift_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitShift_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitShift_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			additive_expression();
			setState(987);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(985);
				_la = _input.LA(1);
				if ( !(_la==T__41 || _la==T__42) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(986);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterAdditive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitAdditive_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitAdditive_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_additive_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			multiplicative_expression();
			setState(992);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(990);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__13) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(991);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterMultiplicative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitMultiplicative_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitMultiplicative_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_multiplicative_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			cast_expression();
			setState(997);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(995);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__29) | (1L << T__30))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(996);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCast_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCast_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitCast_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cast_expressionContext cast_expression() throws RecognitionException {
		Cast_expressionContext _localctx = new Cast_expressionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_cast_expression);
		try {
			setState(1005);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(999);
				match(T__3);
				setState(1000);
				cast_target();
				setState(1001);
				match(T__4);
				setState(1002);
				cast_expression();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1004);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterCast_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitCast_target(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitCast_target(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cast_targetContext cast_target() throws RecognitionException {
		Cast_targetContext _localctx = new Cast_targetContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_cast_target);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007);
			type_name();
			setState(1011);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10 || _la==T__11) {
				{
				{
				setState(1008);
				ptr_operator();
				}
				}
				setState(1013);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitUnary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitUnary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_unary_expression);
		try {
			int _alt;
			setState(1031);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__49:
			case T__50:
				enterOuterAlt(_localctx, 1);
				{
				setState(1014);
				inc_dec();
				setState(1015);
				cast_expression();
				}
				break;
			case T__7:
			case NEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(1017);
				new_expression();
				}
				break;
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(1018);
				unary_op_and_cast_expr();
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 4);
				{
				setState(1019);
				sizeof_expression();
				}
				break;
			case T__3:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
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
				setState(1028);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(1025);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1020);
							identifier();
							setState(1021);
							match(T__52);
							}
							} 
						}
						setState(1027);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
					}
					}
					break;
				}
				setState(1030);
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
		public TerminalNode NEW() { return getToken(ModuleParser.NEW, 0); }
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterNew_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitNew_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitNew_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_expressionContext new_expression() throws RecognitionException {
		New_expressionContext _localctx = new New_expressionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_new_expression);
		int _la;
		try {
			setState(1066);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1034);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1033);
					match(T__7);
					}
				}

				setState(1036);
				match(NEW);
				setState(1037);
				type_name();
				setState(1038);
				match(T__8);
				setState(1040);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__49) | (1L << T__50) | (1L << T__60))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (NEW - 92)) | (1L << (ALPHA_NUMERIC - 92)) | (1L << (HEX_LITERAL - 92)) | (1L << (DECIMAL_LITERAL - 92)) | (1L << (OCTAL_LITERAL - 92)) | (1L << (BINARY_LITERAL - 92)) | (1L << (FLOATING_POINT_LITERAL - 92)) | (1L << (CHAR - 92)) | (1L << (STRING - 92)) | (1L << (MULTILINE_STRING - 92)))) != 0)) {
					{
					setState(1039);
					conditional_expression();
					}
				}

				setState(1042);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1045);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1044);
					match(T__7);
					}
				}

				setState(1047);
				match(NEW);
				setState(1048);
				type_name();
				setState(1049);
				match(T__3);
				setState(1051);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__49) | (1L << T__50) | (1L << T__60))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (NEW - 92)) | (1L << (ALPHA_NUMERIC - 92)) | (1L << (HEX_LITERAL - 92)) | (1L << (DECIMAL_LITERAL - 92)) | (1L << (OCTAL_LITERAL - 92)) | (1L << (BINARY_LITERAL - 92)) | (1L << (FLOATING_POINT_LITERAL - 92)) | (1L << (CHAR - 92)) | (1L << (STRING - 92)) | (1L << (MULTILINE_STRING - 92)))) != 0)) {
					{
					setState(1050);
					expr();
					}
				}

				setState(1053);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1056);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(1055);
					match(T__7);
					}
				}

				setState(1058);
				match(NEW);
				setState(1059);
				postfix_expression(0);
				setState(1060);
				match(T__3);
				setState(1062);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__49) | (1L << T__50) | (1L << T__60))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (NEW - 92)) | (1L << (ALPHA_NUMERIC - 92)) | (1L << (HEX_LITERAL - 92)) | (1L << (DECIMAL_LITERAL - 92)) | (1L << (OCTAL_LITERAL - 92)) | (1L << (BINARY_LITERAL - 92)) | (1L << (FLOATING_POINT_LITERAL - 92)) | (1L << (CHAR - 92)) | (1L << (STRING - 92)) | (1L << (MULTILINE_STRING - 92)))) != 0)) {
					{
					setState(1061);
					expr();
					}
				}

				setState(1064);
				match(T__4);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterUnary_op_and_cast_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitUnary_op_and_cast_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitUnary_op_and_cast_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_op_and_cast_exprContext unary_op_and_cast_expr() throws RecognitionException {
		Unary_op_and_cast_exprContext _localctx = new Unary_op_and_cast_exprContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_unary_op_and_cast_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1068);
			unary_operator();
			setState(1069);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterSizeof_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitSizeof_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitSizeof_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sizeof_expressionContext sizeof_expression() throws RecognitionException {
		Sizeof_expressionContext _localctx = new Sizeof_expressionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_sizeof_expression);
		try {
			setState(1084);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1071);
				sizeof();
				setState(1072);
				sizeof_operand2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1074);
				sizeof();
				setState(1075);
				match(T__3);
				setState(1076);
				sizeof_operand2();
				setState(1077);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1079);
				sizeof();
				setState(1080);
				match(T__3);
				setState(1081);
				sizeof_operand();
				setState(1082);
				match(T__4);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterSizeof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitSizeof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitSizeof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeofContext sizeof() throws RecognitionException {
		SizeofContext _localctx = new SizeofContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_sizeof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1086);
			match(T__60);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterSizeof_operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitSizeof_operand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitSizeof_operand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sizeof_operandContext sizeof_operand() throws RecognitionException {
		Sizeof_operandContext _localctx = new Sizeof_operandContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_sizeof_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1088);
			type_name();
			setState(1092);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10 || _la==T__11) {
				{
				{
				setState(1089);
				ptr_operator();
				}
				}
				setState(1094);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterSizeof_operand2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitSizeof_operand2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitSizeof_operand2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sizeof_operand2Context sizeof_operand2() throws RecognitionException {
		Sizeof_operand2Context _localctx = new Sizeof_operand2Context(_ctx, getState());
		enterRule(_localctx, 198, RULE_sizeof_operand2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1095);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInc_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInc_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitInc_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inc_decContext inc_dec() throws RecognitionException {
		Inc_decContext _localctx = new Inc_decContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_inc_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1097);
			_la = _input.LA(1);
			if ( !(_la==T__49 || _la==T__50) ) {
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
		public TerminalNode TEMPLATE() { return getToken(ModuleParser.TEMPLATE, 0); }
		public MemberAccessContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitMemberAccess(this);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterIncDecOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitIncDecOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitIncDecOp(this);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitInstance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitInstance(this);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPrimaryOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPrimaryOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitPrimaryOnly(this);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitFuncCall(this);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterArrayIndexing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitArrayIndexing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitArrayIndexing(this);
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
		public TerminalNode TEMPLATE() { return getToken(ModuleParser.TEMPLATE, 0); }
		public PtrMemberAccessContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPtrMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPtrMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitPtrMemberAccess(this);
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
		int _startState = 202;
		enterRecursionRule(_localctx, 202, RULE_postfix_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimaryOnlyContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1100);
			primary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1136);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayIndexingContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1102);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1103);
						match(T__8);
						setState(1104);
						expr();
						setState(1105);
						match(T__9);
						}
						break;
					case 2:
						{
						_localctx = new FuncCallContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1107);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1108);
						match(T__3);
						setState(1109);
						function_argument_list();
						setState(1110);
						match(T__4);
						}
						break;
					case 3:
						{
						_localctx = new MemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1112);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1113);
						match(T__61);
						setState(1115);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(1114);
							match(TEMPLATE);
							}
						}

						{
						setState(1117);
						identifier();
						}
						}
						break;
					case 4:
						{
						_localctx = new PtrMemberAccessContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1118);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1119);
						match(T__52);
						setState(1121);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==TEMPLATE) {
							{
							setState(1120);
							match(TEMPLATE);
							}
						}

						{
						setState(1123);
						identifier();
						}
						}
						break;
					case 5:
						{
						_localctx = new IncDecOpContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1124);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1125);
						inc_dec();
						}
						break;
					case 6:
						{
						_localctx = new InstanceContext(new Postfix_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expression);
						setState(1126);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1127);
						match(T__62);
						setState(1128);
						expr();
						setState(1134);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
						case 1:
							{
							setState(1129);
							match(T__16);
							setState(1131);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
							case 1:
								{
								setState(1130);
								function_argument_list();
								}
								break;
							}
							setState(1133);
							match(T__17);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunction_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunction_argument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitFunction_argument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_argument_listContext function_argument_list() throws RecognitionException {
		Function_argument_listContext _localctx = new Function_argument_listContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_function_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__49) | (1L << T__50) | (1L << T__60))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (NEW - 92)) | (1L << (ALPHA_NUMERIC - 92)) | (1L << (HEX_LITERAL - 92)) | (1L << (DECIMAL_LITERAL - 92)) | (1L << (OCTAL_LITERAL - 92)) | (1L << (BINARY_LITERAL - 92)) | (1L << (FLOATING_POINT_LITERAL - 92)) | (1L << (CHAR - 92)) | (1L << (STRING - 92)) | (1L << (MULTILINE_STRING - 92)))) != 0)) {
				{
				setState(1141);
				function_argument();
				setState(1146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1142);
					match(T__2);
					setState(1143);
					function_argument();
					}
					}
					setState(1148);
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
		public TerminalNode COMMENT() { return getToken(ModuleParser.COMMENT, 0); }
		public TerminalNode LINE_COMMENT() { return getToken(ModuleParser.LINE_COMMENT, 0); }
		public Function_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterFunction_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitFunction_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitFunction_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_argumentContext function_argument() throws RecognitionException {
		Function_argumentContext _localctx = new Function_argumentContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_function_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			assign_expr();
			setState(1153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT || _la==LINE_COMMENT) {
				{
				setState(1152);
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
		public TerminalNode COMMENT() { return getToken(ModuleParser.COMMENT, 0); }
		public TerminalNode LINE_COMMENT() { return getToken(ModuleParser.LINE_COMMENT, 0); }
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
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModuleListener ) ((ModuleListener)listener).exitPrimary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ModuleVisitor ) return ((ModuleVisitor<? extends T>)visitor).visitPrimary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_primary_expression);
		int _la;
		try {
			setState(1167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case ALPHA_NUMERIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(1155);
				identifier();
				setState(1157);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
				case 1:
					{
					setState(1156);
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
				setState(1159);
				constant();
				setState(1161);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					{
					setState(1160);
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
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1163);
				match(T__3);
				setState(1164);
				expr();
				setState(1165);
				match(T__4);
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
		case 46:
			return template_decl_param_list_sempred((Template_decl_param_listContext)_localctx, predIndex);
		case 52:
			return template_args_param_list_sempred((Template_args_param_listContext)_localctx, predIndex);
		case 101:
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
		"\u0004\u0001s\u0492\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007c\u0002"+
		"d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007h\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u00d8"+
		"\b\u0000\n\u0000\f\u0000\u00db\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0003\u0002\u00e3\b\u0002\u0001\u0002"+
		"\u0005\u0002\u00e6\b\u0002\n\u0002\f\u0002\u00e9\t\u0002\u0003\u0002\u00eb"+
		"\b\u0002\u0001\u0002\u0003\u0002\u00ee\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u00f3\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0005\u0003\u00f8\b\u0003\n\u0003\f\u0003\u00fb\t\u0003\u0001\u0003\u0003"+
		"\u0003\u00fe\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0103"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0109"+
		"\b\u0003\n\u0003\f\u0003\u010c\t\u0003\u0003\u0003\u010e\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0005\u0004\u0113\b\u0004\n\u0004\f\u0004"+
		"\u0116\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u011b\b"+
		"\u0004\n\u0004\f\u0004\u011e\t\u0004\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u0122\b\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0126\b\u0005\n\u0005"+
		"\f\u0005\u0129\t\u0005\u0001\u0005\u0003\u0005\u012c\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u0131\b\u0006\n\u0006\f\u0006\u0134"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0138\b\u0006\u0001\u0006"+
		"\u0003\u0006\u013b\b\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u013f\b"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0146\b\b\u0003"+
		"\b\u0148\b\b\u0001\t\u0003\t\u014b\b\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0003\t\u0152\b\t\u0001\t\u0003\t\u0155\b\t\u0001\t\u0003\t\u0158"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\f\u0164\b\f\n\f\f\f\u0167\t\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\u000e\u0003\u000e\u016d\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u0173\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u017e\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0005\u0012\u0186\b\u0012\n"+
		"\u0012\f\u0012\u0189\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u018f\b\u0012\n\u0012\f\u0012\u0192\t\u0012\u0005\u0012"+
		"\u0194\b\u0012\n\u0012\f\u0012\u0197\t\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u019c\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u01a1\b\u0013\u0001\u0014\u0003\u0014\u01a4\b\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u01a8\b\u0014\u0001\u0014\u0003\u0014\u01ab\b"+
		"\u0014\u0001\u0014\u0003\u0014\u01ae\b\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01b6\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0004\u0015\u01bc\b\u0015\u000b"+
		"\u0015\f\u0015\u01bd\u0001\u0015\u0003\u0015\u01c1\b\u0015\u0001\u0016"+
		"\u0005\u0016\u01c4\b\u0016\n\u0016\f\u0016\u01c7\t\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01d5"+
		"\b\u0016\u0001\u0016\u0005\u0016\u01d8\b\u0016\n\u0016\f\u0016\u01db\t"+
		"\u0016\u0005\u0016\u01dd\b\u0016\n\u0016\f\u0016\u01e0\t\u0016\u0001\u0017"+
		"\u0005\u0017\u01e3\b\u0017\n\u0017\f\u0017\u01e6\t\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01f4"+
		"\b\u0017\u0001\u0017\u0005\u0017\u01f7\b\u0017\n\u0017\f\u0017\u01fa\t"+
		"\u0017\u0005\u0017\u01fc\b\u0017\n\u0017\f\u0017\u01ff\t\u0017\u0001\u0018"+
		"\u0005\u0018\u0202\b\u0018\n\u0018\f\u0018\u0205\t\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u020b\b\u0018\n\u0018\f\u0018"+
		"\u020e\t\u0018\u0005\u0018\u0210\b\u0018\n\u0018\f\u0018\u0213\t\u0018"+
		"\u0001\u0019\u0005\u0019\u0216\b\u0019\n\u0019\f\u0019\u0219\t\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u0221\b\u001b\u0001\u001b\u0005\u001b\u0224\b\u001b\n\u001b\f\u001b"+
		"\u0227\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u022c\b"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0231\b\u001c\n"+
		"\u001c\f\u001c\u0234\t\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u023d\b\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0242\b\u001e\n\u001e\f\u001e"+
		"\u0245\t\u001e\u0001\u001f\u0003\u001f\u0248\b\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!"+
		"\u0005!\u0255\b!\n!\f!\u0258\t!\u0003!\u025a\b!\u0001!\u0003!\u025d\b"+
		"!\u0001\"\u0001\"\u0001\"\u0001#\u0003#\u0263\b#\u0001#\u0001#\u0001#"+
		"\u0001#\u0001#\u0003#\u026a\b#\u0003#\u026c\b#\u0001#\u0003#\u026f\b#"+
		"\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001"+
		"(\u0001)\u0001)\u0001*\u0001*\u0001*\u0003*\u0280\b*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u02aa\b*\u0001"+
		"+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001-\u0003-\u02b3\b-\u0001-\u0001"+
		"-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u02bd\b.\u0001.\u0001"+
		".\u0001.\u0005.\u02c2\b.\n.\f.\u02c5\t.\u0001/\u0001/\u0001/\u0001/\u0003"+
		"/\u02cb\b/\u0004/\u02cd\b/\u000b/\f/\u02ce\u0001/\u0001/\u00010\u0001"+
		"0\u00030\u02d5\b0\u00010\u00030\u02d8\b0\u00010\u00030\u02db\b0\u0001"+
		"0\u00030\u02de\b0\u00011\u00011\u00012\u00042\u02e3\b2\u000b2\f2\u02e4"+
		"\u00012\u00032\u02e8\b2\u00013\u00013\u00033\u02ec\b3\u00013\u00013\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00054\u02f6\b4\n4\f4\u02f9\t4\u0001"+
		"5\u00035\u02fc\b5\u00015\u00015\u00035\u0300\b5\u00016\u00016\u00017\u0001"+
		"7\u00018\u00018\u00019\u00019\u0001:\u0001:\u0001;\u0001;\u0001<\u0001"+
		"<\u0001=\u0001=\u0001>\u0001>\u0001?\u0001?\u0001@\u0001@\u0001A\u0001"+
		"A\u0001A\u0005A\u031b\bA\nA\fA\u031e\tA\u0001A\u0003A\u0321\bA\u0001A"+
		"\u0003A\u0324\bA\u0001B\u0001B\u0001C\u0003C\u0329\bC\u0001C\u0001C\u0003"+
		"C\u032d\bC\u0004C\u032f\bC\u000bC\fC\u0330\u0001D\u0001D\u0001E\u0001"+
		"E\u0001F\u0001F\u0001G\u0005G\u033a\bG\nG\fG\u033d\tG\u0001G\u0001G\u0003"+
		"G\u0341\bG\u0001G\u0003G\u0344\bG\u0001G\u0003G\u0347\bG\u0001G\u0003"+
		"G\u034a\bG\u0001G\u0001G\u0001G\u0001H\u0001H\u0001I\u0001I\u0001I\u0001"+
		"I\u0005I\u0355\bI\nI\fI\u0358\tI\u0001I\u0001I\u0004I\u035c\bI\u000bI"+
		"\fI\u035d\u0003I\u0360\bI\u0001J\u0003J\u0363\bJ\u0001J\u0003J\u0366\b"+
		"J\u0001J\u0001J\u0003J\u036a\bJ\u0001K\u0005K\u036d\bK\nK\fK\u0370\tK"+
		"\u0001K\u0001K\u0001K\u0003K\u0375\bK\u0001K\u0001K\u0003K\u0379\bK\u0001"+
		"K\u0001K\u0003K\u037d\bK\u0001K\u0001K\u0001K\u0003K\u0382\bK\u0005K\u0384"+
		"\bK\nK\fK\u0387\tK\u0001K\u0003K\u038a\bK\u0001K\u0001K\u0001K\u0003K"+
		"\u038f\bK\u0001L\u0001L\u0003L\u0393\bL\u0004L\u0395\bL\u000bL\fL\u0396"+
		"\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001N\u0001N\u0001"+
		"N\u0003N\u03a3\bN\u0001O\u0001O\u0001O\u0001O\u0003O\u03a9\bO\u0001P\u0001"+
		"P\u0001P\u0001P\u0001P\u0001P\u0001P\u0003P\u03b2\bP\u0001Q\u0001Q\u0001"+
		"Q\u0003Q\u03b7\bQ\u0001R\u0001R\u0001R\u0003R\u03bc\bR\u0001S\u0001S\u0001"+
		"S\u0003S\u03c1\bS\u0001T\u0001T\u0001T\u0003T\u03c6\bT\u0001U\u0001U\u0001"+
		"U\u0003U\u03cb\bU\u0001V\u0001V\u0001V\u0001V\u0003V\u03d1\bV\u0001W\u0001"+
		"W\u0001W\u0001W\u0003W\u03d7\bW\u0001X\u0001X\u0001X\u0003X\u03dc\bX\u0001"+
		"Y\u0001Y\u0001Y\u0003Y\u03e1\bY\u0001Z\u0001Z\u0001Z\u0003Z\u03e6\bZ\u0001"+
		"[\u0001[\u0001[\u0001[\u0001[\u0001[\u0003[\u03ee\b[\u0001\\\u0001\\\u0005"+
		"\\\u03f2\b\\\n\\\f\\\u03f5\t\\\u0001]\u0001]\u0001]\u0001]\u0001]\u0001"+
		"]\u0001]\u0001]\u0001]\u0005]\u0400\b]\n]\f]\u0403\t]\u0003]\u0405\b]"+
		"\u0001]\u0003]\u0408\b]\u0001^\u0003^\u040b\b^\u0001^\u0001^\u0001^\u0001"+
		"^\u0003^\u0411\b^\u0001^\u0001^\u0001^\u0003^\u0416\b^\u0001^\u0001^\u0001"+
		"^\u0001^\u0003^\u041c\b^\u0001^\u0001^\u0001^\u0003^\u0421\b^\u0001^\u0001"+
		"^\u0001^\u0001^\u0003^\u0427\b^\u0001^\u0001^\u0003^\u042b\b^\u0001_\u0001"+
		"_\u0001_\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001"+
		"`\u0001`\u0001`\u0001`\u0001`\u0003`\u043d\b`\u0001a\u0001a\u0001b\u0001"+
		"b\u0005b\u0443\bb\nb\fb\u0446\tb\u0001c\u0001c\u0001d\u0001d\u0001e\u0001"+
		"e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001"+
		"e\u0001e\u0001e\u0001e\u0001e\u0003e\u045c\be\u0001e\u0001e\u0001e\u0001"+
		"e\u0003e\u0462\be\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001e\u0001"+
		"e\u0003e\u046c\be\u0001e\u0003e\u046f\be\u0005e\u0471\be\ne\fe\u0474\t"+
		"e\u0001f\u0001f\u0001f\u0005f\u0479\bf\nf\ff\u047c\tf\u0003f\u047e\bf"+
		"\u0001g\u0001g\u0003g\u0482\bg\u0001h\u0001h\u0003h\u0486\bh\u0001h\u0001"+
		"h\u0003h\u048a\bh\u0001h\u0001h\u0001h\u0001h\u0003h\u0490\bh\u0001h\u0000"+
		"\u0003\\h\u00cai\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfh"+
		"jlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u0000\u001e\u0001\u0000KL\u0001"+
		"\u0000XY\u0001\u0000\u000b\u0010\u0001\u0000\u0011\u0014\u0001\u0000g"+
		"n\u0002\u0000\u0015\u0018RR\u0001\u0000\u000b\f\u0001\u0000\u0019\u001c"+
		"\u0002\u0000\u001d\u001d\\\\\u0003\u0000\u0006\u0006\"),-\u0001\u0000"+
		"./\u0002\u0000\u001c\u001c66\u0001\u0000\u0004\u0005\u0003\u0000\u0004"+
		"\u0005\t\nab\u0002\u0000\u0001\u0001\u0004\u0005\u0002\u0000\u0004\u0005"+
		"\u0011\u0012\u0001\u0000ab\u0001\u0000\t\n\u0002\u0000\u0001\u0001\t\n"+
		"\u0002\u0000\u0001\u0001\u0003\u0003\u0004\u0000\u0001\u0001\u0003\u0005"+
		"\t\nab\u0001\u0000gi\u0002\u0000\u001c\u001c9;\u0001\u0000]^\u0004\u0000"+
		"MMPPXX``\u0001\u0000*+\u0001\u0000\r\u000e\u0002\u0000\f\f\u001e\u001f"+
		"\u0001\u000023\u0001\u0000op\u04fa\u0000\u00d9\u0001\u0000\u0000\u0000"+
		"\u0002\u00dc\u0001\u0000\u0000\u0000\u0004\u00ea\u0001\u0000\u0000\u0000"+
		"\u0006\u00f9\u0001\u0000\u0000\u0000\b\u0114\u0001\u0000\u0000\u0000\n"+
		"\u011f\u0001\u0000\u0000\u0000\f\u013a\u0001\u0000\u0000\u0000\u000e\u013e"+
		"\u0001\u0000\u0000\u0000\u0010\u0147\u0001\u0000\u0000\u0000\u0012\u014a"+
		"\u0001\u0000\u0000\u0000\u0014\u0159\u0001\u0000\u0000\u0000\u0016\u015c"+
		"\u0001\u0000\u0000\u0000\u0018\u015f\u0001\u0000\u0000\u0000\u001a\u0168"+
		"\u0001\u0000\u0000\u0000\u001c\u016c\u0001\u0000\u0000\u0000\u001e\u0170"+
		"\u0001\u0000\u0000\u0000 \u017d\u0001\u0000\u0000\u0000\"\u017f\u0001"+
		"\u0000\u0000\u0000$\u0187\u0001\u0000\u0000\u0000&\u0198\u0001\u0000\u0000"+
		"\u0000(\u01b5\u0001\u0000\u0000\u0000*\u01c0\u0001\u0000\u0000\u0000,"+
		"\u01c5\u0001\u0000\u0000\u0000.\u01e4\u0001\u0000\u0000\u00000\u0203\u0001"+
		"\u0000\u0000\u00002\u0217\u0001\u0000\u0000\u00004\u021c\u0001\u0000\u0000"+
		"\u00006\u022b\u0001\u0000\u0000\u00008\u022d\u0001\u0000\u0000\u0000:"+
		"\u023c\u0001\u0000\u0000\u0000<\u023e\u0001\u0000\u0000\u0000>\u0247\u0001"+
		"\u0000\u0000\u0000@\u024b\u0001\u0000\u0000\u0000B\u025c\u0001\u0000\u0000"+
		"\u0000D\u025e\u0001\u0000\u0000\u0000F\u0262\u0001\u0000\u0000\u0000H"+
		"\u0270\u0001\u0000\u0000\u0000J\u0272\u0001\u0000\u0000\u0000L\u0274\u0001"+
		"\u0000\u0000\u0000N\u0276\u0001\u0000\u0000\u0000P\u0278\u0001\u0000\u0000"+
		"\u0000R\u027a\u0001\u0000\u0000\u0000T\u02a9\u0001\u0000\u0000\u0000V"+
		"\u02ab\u0001\u0000\u0000\u0000X\u02ad\u0001\u0000\u0000\u0000Z\u02af\u0001"+
		"\u0000\u0000\u0000\\\u02bc\u0001\u0000\u0000\u0000^\u02c6\u0001\u0000"+
		"\u0000\u0000`\u02d7\u0001\u0000\u0000\u0000b\u02df\u0001\u0000\u0000\u0000"+
		"d\u02e2\u0001\u0000\u0000\u0000f\u02e9\u0001\u0000\u0000\u0000h\u02ef"+
		"\u0001\u0000\u0000\u0000j\u02fb\u0001\u0000\u0000\u0000l\u0301\u0001\u0000"+
		"\u0000\u0000n\u0303\u0001\u0000\u0000\u0000p\u0305\u0001\u0000\u0000\u0000"+
		"r\u0307\u0001\u0000\u0000\u0000t\u0309\u0001\u0000\u0000\u0000v\u030b"+
		"\u0001\u0000\u0000\u0000x\u030d\u0001\u0000\u0000\u0000z\u030f\u0001\u0000"+
		"\u0000\u0000|\u0311\u0001\u0000\u0000\u0000~\u0313\u0001\u0000\u0000\u0000"+
		"\u0080\u0315\u0001\u0000\u0000\u0000\u0082\u0323\u0001\u0000\u0000\u0000"+
		"\u0084\u0325\u0001\u0000\u0000\u0000\u0086\u032e\u0001\u0000\u0000\u0000"+
		"\u0088\u0332\u0001\u0000\u0000\u0000\u008a\u0334\u0001\u0000\u0000\u0000"+
		"\u008c\u0336\u0001\u0000\u0000\u0000\u008e\u033b\u0001\u0000\u0000\u0000"+
		"\u0090\u034e\u0001\u0000\u0000\u0000\u0092\u035f\u0001\u0000\u0000\u0000"+
		"\u0094\u0362\u0001\u0000\u0000\u0000\u0096\u038e\u0001\u0000\u0000\u0000"+
		"\u0098\u0394\u0001\u0000\u0000\u0000\u009a\u0398\u0001\u0000\u0000\u0000"+
		"\u009c\u039f\u0001\u0000\u0000\u0000\u009e\u03a4\u0001\u0000\u0000\u0000"+
		"\u00a0\u03b1\u0001\u0000\u0000\u0000\u00a2\u03b3\u0001\u0000\u0000\u0000"+
		"\u00a4\u03b8\u0001\u0000\u0000\u0000\u00a6\u03bd\u0001\u0000\u0000\u0000"+
		"\u00a8\u03c2\u0001\u0000\u0000\u0000\u00aa\u03c7\u0001\u0000\u0000\u0000"+
		"\u00ac\u03cc\u0001\u0000\u0000\u0000\u00ae\u03d2\u0001\u0000\u0000\u0000"+
		"\u00b0\u03d8\u0001\u0000\u0000\u0000\u00b2\u03dd\u0001\u0000\u0000\u0000"+
		"\u00b4\u03e2\u0001\u0000\u0000\u0000\u00b6\u03ed\u0001\u0000\u0000\u0000"+
		"\u00b8\u03ef\u0001\u0000\u0000\u0000\u00ba\u0407\u0001\u0000\u0000\u0000"+
		"\u00bc\u042a\u0001\u0000\u0000\u0000\u00be\u042c\u0001\u0000\u0000\u0000"+
		"\u00c0\u043c\u0001\u0000\u0000\u0000\u00c2\u043e\u0001\u0000\u0000\u0000"+
		"\u00c4\u0440\u0001\u0000\u0000\u0000\u00c6\u0447\u0001\u0000\u0000\u0000"+
		"\u00c8\u0449\u0001\u0000\u0000\u0000\u00ca\u044b\u0001\u0000\u0000\u0000"+
		"\u00cc\u047d\u0001\u0000\u0000\u0000\u00ce\u047f\u0001\u0000\u0000\u0000"+
		"\u00d0\u048f\u0001\u0000\u0000\u0000\u00d2\u00d8\u0003\u0004\u0002\u0000"+
		"\u00d3\u00d8\u0003\u0006\u0003\u0000\u00d4\u00d8\u00032\u0019\u0000\u00d5"+
		"\u00d8\u0003\u0002\u0001\u0000\u00d6\u00d8\u0003\u0080@\u0000\u00d7\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d3\u0001\u0000\u0000\u0000\u00d7\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u0001"+
		"\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0005V\u0000\u0000\u00dd\u00de\u0005W\u0000\u0000\u00de\u00df\u0003\u0082"+
		"A\u0000\u00df\u00e0\u0005\u0001\u0000\u0000\u00e0\u0003\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e3\u0005L\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00eb\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e6\u0003Z-\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e9"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e8\u00eb\u0001\u0000\u0000\u0000\u00e9\u00e7"+
		"\u0001\u0000\u0000\u0000\u00ea\u00e2\u0001\u0000\u0000\u0000\u00ea\u00e7"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000\u00ec\u00ee"+
		"\u0003\b\u0004\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f0\u0003"+
		" \u0010\u0000\u00f0\u00f2\u0003\n\u0005\u0000\u00f1\u00f3\u0003\u0018"+
		"\f\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005\u0001\u0000"+
		"\u0000\u00f5\u0005\u0001\u0000\u0000\u0000\u00f6\u00f8\u0003Z-\u0000\u00f7"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fe\u0003\b\u0004\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100"+
		"\u0003 \u0010\u0000\u0100\u0102\u0003\n\u0005\u0000\u0101\u0103\u0003"+
		"\u0018\f\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000"+
		"\u0000\u0000\u0103\u010d\u0001\u0000\u0000\u0000\u0104\u0105\u0005\u0002"+
		"\u0000\u0000\u0105\u010a\u0003\u0082A\u0000\u0106\u0107\u0005\u0003\u0000"+
		"\u0000\u0107\u0109\u0003\u0082A\u0000\u0108\u0106\u0001\u0000\u0000\u0000"+
		"\u0109\u010c\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000"+
		"\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010e\u0001\u0000\u0000\u0000"+
		"\u010c\u010a\u0001\u0000\u0000\u0000\u010d\u0104\u0001\u0000\u0000\u0000"+
		"\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000"+
		"\u010f\u0110\u0003\u0016\u000b\u0000\u0110\u0007\u0001\u0000\u0000\u0000"+
		"\u0111\u0113\u0003N\'\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0113"+
		"\u0116\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114"+
		"\u0115\u0001\u0000\u0000\u0000\u0115\u0117\u0001\u0000\u0000\u0000\u0116"+
		"\u0114\u0001\u0000\u0000\u0000\u0117\u0118\u0003\u0096K\u0000\u0118\u011c"+
		"\u0001\u0000\u0000\u0000\u0119\u011b\u0003P(\u0000\u011a\u0119\u0001\u0000"+
		"\u0000\u0000\u011b\u011e\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000"+
		"\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\t\u0001\u0000\u0000"+
		"\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011f\u0121\u0005\u0004\u0000"+
		"\u0000\u0120\u0122\u0003\f\u0006\u0000\u0121\u0120\u0001\u0000\u0000\u0000"+
		"\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000"+
		"\u0123\u0127\u0005\u0005\u0000\u0000\u0124\u0126\u0005Q\u0000\u0000\u0125"+
		"\u0124\u0001\u0000\u0000\u0000\u0126\u0129\u0001\u0000\u0000\u0000\u0127"+
		"\u0125\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128"+
		"\u012b\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u012a"+
		"\u012c\u0003\"\u0011\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012b\u012c"+
		"\u0001\u0000\u0000\u0000\u012c\u000b\u0001\u0000\u0000\u0000\u012d\u0132"+
		"\u0003\u0010\b\u0000\u012e\u012f\u0005\u0003\u0000\u0000\u012f\u0131\u0003"+
		"\u0010\b\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0131\u0134\u0001\u0000"+
		"\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000"+
		"\u0000\u0000\u0133\u0137\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000"+
		"\u0000\u0000\u0135\u0136\u0005\u0003\u0000\u0000\u0136\u0138\u0005r\u0000"+
		"\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000"+
		"\u0000\u0138\u013b\u0001\u0000\u0000\u0000\u0139\u013b\u0005M\u0000\u0000"+
		"\u013a\u012d\u0001\u0000\u0000\u0000\u013a\u0139\u0001\u0000\u0000\u0000"+
		"\u013b\r\u0001\u0000\u0000\u0000\u013c\u013f\u0003\u0086C\u0000\u013d"+
		"\u013f\u0003\u008aE\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013e\u013d"+
		"\u0001\u0000\u0000\u0000\u013f\u000f\u0001\u0000\u0000\u0000\u0140\u0141"+
		"\u0003>\u001f\u0000\u0141\u0142\u0003\u0012\t\u0000\u0142\u0148\u0001"+
		"\u0000\u0000\u0000\u0143\u0145\u0003>\u001f\u0000\u0144\u0146\u0003\u000e"+
		"\u0007\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000"+
		"\u0000\u0000\u0146\u0148\u0001\u0000\u0000\u0000\u0147\u0140\u0001\u0000"+
		"\u0000\u0000\u0147\u0143\u0001\u0000\u0000\u0000\u0148\u0011\u0001\u0000"+
		"\u0000\u0000\u0149\u014b\u0003\u000e\u0007\u0000\u014a\u0149\u0001\u0000"+
		"\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u0151\u0001\u0000"+
		"\u0000\u0000\u014c\u014d\u0005\u0004\u0000\u0000\u014d\u014e\u0003\u0012"+
		"\t\u0000\u014e\u014f\u0005\u0005\u0000\u0000\u014f\u0152\u0001\u0000\u0000"+
		"\u0000\u0150\u0152\u0003@ \u0000\u0151\u014c\u0001\u0000\u0000\u0000\u0151"+
		"\u0150\u0001\u0000\u0000\u0000\u0152\u0154\u0001\u0000\u0000\u0000\u0153"+
		"\u0155\u0003*\u0015\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0154\u0155"+
		"\u0001\u0000\u0000\u0000\u0155\u0157\u0001\u0000\u0000\u0000\u0156\u0158"+
		"\u0003\u0014\n\u0000\u0157\u0156\u0001\u0000\u0000\u0000\u0157\u0158\u0001"+
		"\u0000\u0000\u0000\u0158\u0013\u0001\u0000\u0000\u0000\u0159\u015a\u0005"+
		"\u0006\u0000\u0000\u015a\u015b\u0003\u009cN\u0000\u015b\u0015\u0001\u0000"+
		"\u0000\u0000\u015c\u015d\u0005a\u0000\u0000\u015d\u015e\u0006\u000b\uffff"+
		"\uffff\u0000\u015e\u0017\u0001\u0000\u0000\u0000\u015f\u0160\u0005\u0007"+
		"\u0000\u0000\u0160\u0165\u0003\u001a\r\u0000\u0161\u0162\u0005\u0003\u0000"+
		"\u0000\u0162\u0164\u0003\u001a\r\u0000\u0163\u0161\u0001\u0000\u0000\u0000"+
		"\u0164\u0167\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000"+
		"\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0019\u0001\u0000\u0000\u0000"+
		"\u0167\u0165\u0001\u0000\u0000\u0000\u0168\u0169\u0003\u001c\u000e\u0000"+
		"\u0169\u016a\u0003\u001e\u000f\u0000\u016a\u001b\u0001\u0000\u0000\u0000"+
		"\u016b\u016d\u0005\b\u0000\u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016c"+
		"\u016d\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e"+
		"\u016f\u0003\u0082A\u0000\u016f\u001d\u0001\u0000\u0000\u0000\u0170\u0172"+
		"\u0005\u0004\u0000\u0000\u0171\u0173\u0003\u009cN\u0000\u0172\u0171\u0001"+
		"\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0174\u0001"+
		"\u0000\u0000\u0000\u0174\u0175\u0005\u0005\u0000\u0000\u0175\u001f\u0001"+
		"\u0000\u0000\u0000\u0176\u0177\u0005\u0004\u0000\u0000\u0177\u0178\u0003"+
		" \u0010\u0000\u0178\u0179\u0005\u0005\u0000\u0000\u0179\u017e\u0001\u0000"+
		"\u0000\u0000\u017a\u017e\u0003\u0082A\u0000\u017b\u017c\u0005Z\u0000\u0000"+
		"\u017c\u017e\u0003T*\u0000\u017d\u0176\u0001\u0000\u0000\u0000\u017d\u017a"+
		"\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017e!\u0001"+
		"\u0000\u0000\u0000\u017f\u0180\u0005U\u0000\u0000\u0180\u0181\u0005\u0004"+
		"\u0000\u0000\u0181\u0182\u0003$\u0012\u0000\u0182\u0183\u0005\u0005\u0000"+
		"\u0000\u0183#\u0001\u0000\u0000\u0000\u0184\u0186\u0003l6\u0000\u0185"+
		"\u0184\u0001\u0000\u0000\u0000\u0186\u0189\u0001\u0000\u0000\u0000\u0187"+
		"\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188"+
		"\u0195\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u018a"+
		"\u018b\u0005\u0004\u0000\u0000\u018b\u018c\u0003$\u0012\u0000\u018c\u0190"+
		"\u0005\u0005\u0000\u0000\u018d\u018f\u0003l6\u0000\u018e\u018d\u0001\u0000"+
		"\u0000\u0000\u018f\u0192\u0001\u0000\u0000\u0000\u0190\u018e\u0001\u0000"+
		"\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191\u0194\u0001\u0000"+
		"\u0000\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0193\u018a\u0001\u0000"+
		"\u0000\u0000\u0194\u0197\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000"+
		"\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196%\u0001\u0000\u0000"+
		"\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0198\u01a0\u0003(\u0014\u0000"+
		"\u0199\u019b\u0005\u0004\u0000\u0000\u019a\u019c\u0003\u009cN\u0000\u019b"+
		"\u019a\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c"+
		"\u019d\u0001\u0000\u0000\u0000\u019d\u01a1\u0005\u0005\u0000\u0000\u019e"+
		"\u019f\u0005\u0006\u0000\u0000\u019f\u01a1\u0003,\u0016\u0000\u01a0\u0199"+
		"\u0001\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a0\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a1\'\u0001\u0000\u0000\u0000\u01a2\u01a4\u0003"+
		"\u0086C\u0000\u01a3\u01a2\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a7\u0003\u0082"+
		"A\u0000\u01a6\u01a8\u0003f3\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01aa\u0001\u0000\u0000\u0000"+
		"\u01a9\u01ab\u0003*\u0015\u0000\u01aa\u01a9\u0001\u0000\u0000\u0000\u01aa"+
		"\u01ab\u0001\u0000\u0000\u0000\u01ab\u01b6\u0001\u0000\u0000\u0000\u01ac"+
		"\u01ae\u0003\u0086C\u0000\u01ad\u01ac\u0001\u0000\u0000\u0000\u01ad\u01ae"+
		"\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01b0"+
		"\u0005\u0004\u0000\u0000\u01b0\u01b1\u0003\u0088D\u0000\u01b1\u01b2\u0003"+
		"\u0082A\u0000\u01b2\u01b3\u0005\u0005\u0000\u0000\u01b3\u01b4\u0003*\u0015"+
		"\u0000\u01b4\u01b6\u0001\u0000\u0000\u0000\u01b5\u01a3\u0001\u0000\u0000"+
		"\u0000\u01b5\u01ad\u0001\u0000\u0000\u0000\u01b6)\u0001\u0000\u0000\u0000"+
		"\u01b7\u01b8\u0005\t\u0000\u0000\u01b8\u01b9\u00030\u0018\u0000\u01b9"+
		"\u01ba\u0005\n\u0000\u0000\u01ba\u01bc\u0001\u0000\u0000\u0000\u01bb\u01b7"+
		"\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd\u01bb"+
		"\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01be\u01c1"+
		"\u0001\u0000\u0000\u0000\u01bf\u01c1\u0003B!\u0000\u01c0\u01bb\u0001\u0000"+
		"\u0000\u0000\u01c0\u01bf\u0001\u0000\u0000\u0000\u01c1+\u0001\u0000\u0000"+
		"\u0000\u01c2\u01c4\u0003|>\u0000\u01c3\u01c2\u0001\u0000\u0000\u0000\u01c4"+
		"\u01c7\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c5"+
		"\u01c6\u0001\u0000\u0000\u0000\u01c6\u01de\u0001\u0000\u0000\u0000\u01c7"+
		"\u01c5\u0001\u0000\u0000\u0000\u01c8\u01c9\u0005a\u0000\u0000\u01c9\u01ca"+
		"\u0003.\u0017\u0000\u01ca\u01cb\u0005b\u0000\u0000\u01cb\u01d5\u0001\u0000"+
		"\u0000\u0000\u01cc\u01cd\u0005\u0004\u0000\u0000\u01cd\u01ce\u0003.\u0017"+
		"\u0000\u01ce\u01cf\u0005\u0005\u0000\u0000\u01cf\u01d5\u0001\u0000\u0000"+
		"\u0000\u01d0\u01d1\u0005\t\u0000\u0000\u01d1\u01d2\u0003.\u0017\u0000"+
		"\u01d2\u01d3\u0005\n\u0000\u0000\u01d3\u01d5\u0001\u0000\u0000\u0000\u01d4"+
		"\u01c8\u0001\u0000\u0000\u0000\u01d4\u01cc\u0001\u0000\u0000\u0000\u01d4"+
		"\u01d0\u0001\u0000\u0000\u0000\u01d5\u01d9\u0001\u0000\u0000\u0000\u01d6"+
		"\u01d8\u0003|>\u0000\u01d7\u01d6\u0001\u0000\u0000\u0000\u01d8\u01db\u0001"+
		"\u0000\u0000\u0000\u01d9\u01d7\u0001\u0000\u0000\u0000\u01d9\u01da\u0001"+
		"\u0000\u0000\u0000\u01da\u01dd\u0001\u0000\u0000\u0000\u01db\u01d9\u0001"+
		"\u0000\u0000\u0000\u01dc\u01d4\u0001\u0000\u0000\u0000\u01dd\u01e0\u0001"+
		"\u0000\u0000\u0000\u01de\u01dc\u0001\u0000\u0000\u0000\u01de\u01df\u0001"+
		"\u0000\u0000\u0000\u01df-\u0001\u0000\u0000\u0000\u01e0\u01de\u0001\u0000"+
		"\u0000\u0000\u01e1\u01e3\u0003~?\u0000\u01e2\u01e1\u0001\u0000\u0000\u0000"+
		"\u01e3\u01e6\u0001\u0000\u0000\u0000\u01e4\u01e2\u0001\u0000\u0000\u0000"+
		"\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01fd\u0001\u0000\u0000\u0000"+
		"\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e7\u01e8\u0005a\u0000\u0000\u01e8"+
		"\u01e9\u0003.\u0017\u0000\u01e9\u01ea\u0005b\u0000\u0000\u01ea\u01f4\u0001"+
		"\u0000\u0000\u0000\u01eb\u01ec\u0005\u0004\u0000\u0000\u01ec\u01ed\u0003"+
		".\u0017\u0000\u01ed\u01ee\u0005\u0005\u0000\u0000\u01ee\u01f4\u0001\u0000"+
		"\u0000\u0000\u01ef\u01f0\u0005\t\u0000\u0000\u01f0\u01f1\u0003.\u0017"+
		"\u0000\u01f1\u01f2\u0005\n\u0000\u0000\u01f2\u01f4\u0001\u0000\u0000\u0000"+
		"\u01f3\u01e7\u0001\u0000\u0000\u0000\u01f3\u01eb\u0001\u0000\u0000\u0000"+
		"\u01f3\u01ef\u0001\u0000\u0000\u0000\u01f4\u01f8\u0001\u0000\u0000\u0000"+
		"\u01f5\u01f7\u0003~?\u0000\u01f6\u01f5\u0001\u0000\u0000\u0000\u01f7\u01fa"+
		"\u0001\u0000\u0000\u0000\u01f8\u01f6\u0001\u0000\u0000\u0000\u01f8\u01f9"+
		"\u0001\u0000\u0000\u0000\u01f9\u01fc\u0001\u0000\u0000\u0000\u01fa\u01f8"+
		"\u0001\u0000\u0000\u0000\u01fb\u01f3\u0001\u0000\u0000\u0000\u01fc\u01ff"+
		"\u0001\u0000\u0000\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fd\u01fe"+
		"\u0001\u0000\u0000\u0000\u01fe/\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001"+
		"\u0000\u0000\u0000\u0200\u0202\u0003v;\u0000\u0201\u0200\u0001\u0000\u0000"+
		"\u0000\u0202\u0205\u0001\u0000\u0000\u0000\u0203\u0201\u0001\u0000\u0000"+
		"\u0000\u0203\u0204\u0001\u0000\u0000\u0000\u0204\u0211\u0001\u0000\u0000"+
		"\u0000\u0205\u0203\u0001\u0000\u0000\u0000\u0206\u0207\u0005\t\u0000\u0000"+
		"\u0207\u0208\u00030\u0018\u0000\u0208\u020c\u0005\n\u0000\u0000\u0209"+
		"\u020b\u0003v;\u0000\u020a\u0209\u0001\u0000\u0000\u0000\u020b\u020e\u0001"+
		"\u0000\u0000\u0000\u020c\u020a\u0001\u0000\u0000\u0000\u020c\u020d\u0001"+
		"\u0000\u0000\u0000\u020d\u0210\u0001\u0000\u0000\u0000\u020e\u020c\u0001"+
		"\u0000\u0000\u0000\u020f\u0206\u0001\u0000\u0000\u0000\u0210\u0213\u0001"+
		"\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000\u0211\u0212\u0001"+
		"\u0000\u0000\u0000\u02121\u0001\u0000\u0000\u0000\u0213\u0211\u0001\u0000"+
		"\u0000\u0000\u0214\u0216\u00034\u001a\u0000\u0215\u0214\u0001\u0000\u0000"+
		"\u0000\u0216\u0219\u0001\u0000\u0000\u0000\u0217\u0215\u0001\u0000\u0000"+
		"\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u021a\u0001\u0000\u0000"+
		"\u0000\u0219\u0217\u0001\u0000\u0000\u0000\u021a\u021b\u00036\u001b\u0000"+
		"\u021b3\u0001\u0000\u0000\u0000\u021c\u021d\u0007\u0000\u0000\u0000\u021d"+
		"5\u0001\u0000\u0000\u0000\u021e\u0220\u0003\u008eG\u0000\u021f\u0221\u0003"+
		"8\u001c\u0000\u0220\u021f\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000"+
		"\u0000\u0000\u0221\u022c\u0001\u0000\u0000\u0000\u0222\u0224\u0003Z-\u0000"+
		"\u0223\u0222\u0001\u0000\u0000\u0000\u0224\u0227\u0001\u0000\u0000\u0000"+
		"\u0225\u0223\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000\u0000"+
		"\u0226\u0228\u0001\u0000\u0000\u0000\u0227\u0225\u0001\u0000\u0000\u0000"+
		"\u0228\u0229\u0003\u0096K\u0000\u0229\u022a\u00038\u001c\u0000\u022a\u022c"+
		"\u0001\u0000\u0000\u0000\u022b\u021e\u0001\u0000\u0000\u0000\u022b\u0225"+
		"\u0001\u0000\u0000\u0000\u022c7\u0001\u0000\u0000\u0000\u022d\u0232\u0003"+
		"&\u0013\u0000\u022e\u022f\u0005\u0003\u0000\u0000\u022f\u0231\u0003&\u0013"+
		"\u0000\u0230\u022e\u0001\u0000\u0000\u0000\u0231\u0234\u0001\u0000\u0000"+
		"\u0000\u0232\u0230\u0001\u0000\u0000\u0000\u0232\u0233\u0001\u0000\u0000"+
		"\u0000\u0233\u0235\u0001\u0000\u0000\u0000\u0234\u0232\u0001\u0000\u0000"+
		"\u0000\u0235\u0236\u0005\u0001\u0000\u0000\u02369\u0001\u0000\u0000\u0000"+
		"\u0237\u023d\u0003\u009eO\u0000\u0238\u0239\u0005a\u0000\u0000\u0239\u023a"+
		"\u0003<\u001e\u0000\u023a\u023b\u0005b\u0000\u0000\u023b\u023d\u0001\u0000"+
		"\u0000\u0000\u023c\u0237\u0001\u0000\u0000\u0000\u023c\u0238\u0001\u0000"+
		"\u0000\u0000\u023d;\u0001\u0000\u0000\u0000\u023e\u0243\u0003:\u001d\u0000"+
		"\u023f\u0240\u0005\u0003\u0000\u0000\u0240\u0242\u0003:\u001d\u0000\u0241"+
		"\u023f\u0001\u0000\u0000\u0000\u0242\u0245\u0001\u0000\u0000\u0000\u0243"+
		"\u0241\u0001\u0000\u0000\u0000\u0243\u0244\u0001\u0000\u0000\u0000\u0244"+
		"=\u0001\u0000\u0000\u0000\u0245\u0243\u0001\u0000\u0000\u0000\u0246\u0248"+
		"\u0007\u0001\u0000\u0000\u0247\u0246\u0001\u0000\u0000\u0000\u0247\u0248"+
		"\u0001\u0000\u0000\u0000\u0248\u0249\u0001\u0000\u0000\u0000\u0249\u024a"+
		"\u0003\u0096K\u0000\u024a?\u0001\u0000\u0000\u0000\u024b\u024c\u0003\u0082"+
		"A\u0000\u024cA\u0001\u0000\u0000\u0000\u024d\u024e\u0005\u0004\u0000\u0000"+
		"\u024e\u024f\u0005M\u0000\u0000\u024f\u025d\u0005\u0005\u0000\u0000\u0250"+
		"\u0259\u0005\u0004\u0000\u0000\u0251\u0256\u0003D\"\u0000\u0252\u0253"+
		"\u0005\u0003\u0000\u0000\u0253\u0255\u0003D\"\u0000\u0254\u0252\u0001"+
		"\u0000\u0000\u0000\u0255\u0258\u0001\u0000\u0000\u0000\u0256\u0254\u0001"+
		"\u0000\u0000\u0000\u0256\u0257\u0001\u0000\u0000\u0000\u0257\u025a\u0001"+
		"\u0000\u0000\u0000\u0258\u0256\u0001\u0000\u0000\u0000\u0259\u0251\u0001"+
		"\u0000\u0000\u0000\u0259\u025a\u0001\u0000\u0000\u0000\u025a\u025b\u0001"+
		"\u0000\u0000\u0000\u025b\u025d\u0005\u0005\u0000\u0000\u025c\u024d\u0001"+
		"\u0000\u0000\u0000\u025c\u0250\u0001\u0000\u0000\u0000\u025dC\u0001\u0000"+
		"\u0000\u0000\u025e\u025f\u0003>\u001f\u0000\u025f\u0260\u0003F#\u0000"+
		"\u0260E\u0001\u0000\u0000\u0000\u0261\u0263\u0003\u0086C\u0000\u0262\u0261"+
		"\u0001\u0000\u0000\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263\u026b"+
		"\u0001\u0000\u0000\u0000\u0264\u0265\u0005\u0004\u0000\u0000\u0265\u0266"+
		"\u0003F#\u0000\u0266\u0267\u0005\u0005\u0000\u0000\u0267\u026c\u0001\u0000"+
		"\u0000\u0000\u0268\u026a\u0003@ \u0000\u0269\u0268\u0001\u0000\u0000\u0000"+
		"\u0269\u026a\u0001\u0000\u0000\u0000\u026a\u026c\u0001\u0000\u0000\u0000"+
		"\u026b\u0264\u0001\u0000\u0000\u0000\u026b\u0269\u0001\u0000\u0000\u0000"+
		"\u026c\u026e\u0001\u0000\u0000\u0000\u026d\u026f\u0003*\u0015\u0000\u026e"+
		"\u026d\u0001\u0000\u0000\u0000\u026e\u026f\u0001\u0000\u0000\u0000\u026f"+
		"G\u0001\u0000\u0000\u0000\u0270\u0271\u0007\u0002\u0000\u0000\u0271I\u0001"+
		"\u0000\u0000\u0000\u0272\u0273\u0007\u0003\u0000\u0000\u0273K\u0001\u0000"+
		"\u0000\u0000\u0274\u0275\u0007\u0004\u0000\u0000\u0275M\u0001\u0000\u0000"+
		"\u0000\u0276\u0277\u0007\u0005\u0000\u0000\u0277O\u0001\u0000\u0000\u0000"+
		"\u0278\u0279\u0007\u0006\u0000\u0000\u0279Q\u0001\u0000\u0000\u0000\u027a"+
		"\u027b\u0007\u0007\u0000\u0000\u027bS\u0001\u0000\u0000\u0000\u027c\u027f"+
		"\u0007\b\u0000\u0000\u027d\u027e\u0005\t\u0000\u0000\u027e\u0280\u0005"+
		"\n\u0000\u0000\u027f\u027d\u0001\u0000\u0000\u0000\u027f\u0280\u0001\u0000"+
		"\u0000\u0000\u0280\u02aa\u0001\u0000\u0000\u0000\u0281\u02aa\u0005\r\u0000"+
		"\u0000\u0282\u02aa\u0005\u000e\u0000\u0000\u0283\u02aa\u0005\f\u0000\u0000"+
		"\u0284\u02aa\u0005\u001e\u0000\u0000\u0285\u02aa\u0005\u001f\u0000\u0000"+
		"\u0286\u02aa\u0005 \u0000\u0000\u0287\u02aa\u0005\u000b\u0000\u0000\u0288"+
		"\u02aa\u0005!\u0000\u0000\u0289\u02aa\u0005\u000f\u0000\u0000\u028a\u02aa"+
		"\u0005\u0010\u0000\u0000\u028b\u02aa\u0005\u0006\u0000\u0000\u028c\u02aa"+
		"\u0005\u0011\u0000\u0000\u028d\u02aa\u0005\u0012\u0000\u0000\u028e\u02aa"+
		"\u0005\"\u0000\u0000\u028f\u02aa\u0005#\u0000\u0000\u0290\u02aa\u0005"+
		"$\u0000\u0000\u0291\u02aa\u0005%\u0000\u0000\u0292\u02aa\u0005&\u0000"+
		"\u0000\u0293\u02aa\u0005\'\u0000\u0000\u0294\u02aa\u0005(\u0000\u0000"+
		"\u0295\u02aa\u0005)\u0000\u0000\u0296\u02aa\u0005*\u0000\u0000\u0297\u02aa"+
		"\u0005+\u0000\u0000\u0298\u02aa\u0005,\u0000\u0000\u0299\u02aa\u0005-"+
		"\u0000\u0000\u029a\u02aa\u0005.\u0000\u0000\u029b\u02aa\u0005/\u0000\u0000"+
		"\u029c\u02aa\u0005\u0013\u0000\u0000\u029d\u02aa\u0005\u0014\u0000\u0000"+
		"\u029e\u02aa\u00050\u0000\u0000\u029f\u02aa\u00051\u0000\u0000\u02a0\u02aa"+
		"\u00052\u0000\u0000\u02a1\u02aa\u00053\u0000\u0000\u02a2\u02aa\u0005\u0003"+
		"\u0000\u0000\u02a3\u02aa\u00054\u0000\u0000\u02a4\u02aa\u00055\u0000\u0000"+
		"\u02a5\u02a6\u0005\u0004\u0000\u0000\u02a6\u02aa\u0005\u0005\u0000\u0000"+
		"\u02a7\u02a8\u0005\t\u0000\u0000\u02a8\u02aa\u0005\n\u0000\u0000\u02a9"+
		"\u027c\u0001\u0000\u0000\u0000\u02a9\u0281\u0001\u0000\u0000\u0000\u02a9"+
		"\u0282\u0001\u0000\u0000\u0000\u02a9\u0283\u0001\u0000\u0000\u0000\u02a9"+
		"\u0284\u0001\u0000\u0000\u0000\u02a9\u0285\u0001\u0000\u0000\u0000\u02a9"+
		"\u0286\u0001\u0000\u0000\u0000\u02a9\u0287\u0001\u0000\u0000\u0000\u02a9"+
		"\u0288\u0001\u0000\u0000\u0000\u02a9\u0289\u0001\u0000\u0000\u0000\u02a9"+
		"\u028a\u0001\u0000\u0000\u0000\u02a9\u028b\u0001\u0000\u0000\u0000\u02a9"+
		"\u028c\u0001\u0000\u0000\u0000\u02a9\u028d\u0001\u0000\u0000\u0000\u02a9"+
		"\u028e\u0001\u0000\u0000\u0000\u02a9\u028f\u0001\u0000\u0000\u0000\u02a9"+
		"\u0290\u0001\u0000\u0000\u0000\u02a9\u0291\u0001\u0000\u0000\u0000\u02a9"+
		"\u0292\u0001\u0000\u0000\u0000\u02a9\u0293\u0001\u0000\u0000\u0000\u02a9"+
		"\u0294\u0001\u0000\u0000\u0000\u02a9\u0295\u0001\u0000\u0000\u0000\u02a9"+
		"\u0296\u0001\u0000\u0000\u0000\u02a9\u0297\u0001\u0000\u0000\u0000\u02a9"+
		"\u0298\u0001\u0000\u0000\u0000\u02a9\u0299\u0001\u0000\u0000\u0000\u02a9"+
		"\u029a\u0001\u0000\u0000\u0000\u02a9\u029b\u0001\u0000\u0000\u0000\u02a9"+
		"\u029c\u0001\u0000\u0000\u0000\u02a9\u029d\u0001\u0000\u0000\u0000\u02a9"+
		"\u029e\u0001\u0000\u0000\u0000\u02a9\u029f\u0001\u0000\u0000\u0000\u02a9"+
		"\u02a0\u0001\u0000\u0000\u0000\u02a9\u02a1\u0001\u0000\u0000\u0000\u02a9"+
		"\u02a2\u0001\u0000\u0000\u0000\u02a9\u02a3\u0001\u0000\u0000\u0000\u02a9"+
		"\u02a4\u0001\u0000\u0000\u0000\u02a9\u02a5\u0001\u0000\u0000\u0000\u02a9"+
		"\u02a7\u0001\u0000\u0000\u0000\u02aaU\u0001\u0000\u0000\u0000\u02ab\u02ac"+
		"\u0007\t\u0000\u0000\u02acW\u0001\u0000\u0000\u0000\u02ad\u02ae\u0007"+
		"\n\u0000\u0000\u02aeY\u0001\u0000\u0000\u0000\u02af\u02b0\u0005[\u0000"+
		"\u0000\u02b0\u02b2\u0005\u0011\u0000\u0000\u02b1\u02b3\u0003\\.\u0000"+
		"\u02b2\u02b1\u0001\u0000\u0000\u0000\u02b2\u02b3\u0001\u0000\u0000\u0000"+
		"\u02b3\u02b4\u0001\u0000\u0000\u0000\u02b4\u02b5\u0005\u0012\u0000\u0000"+
		"\u02b5[\u0001\u0000\u0000\u0000\u02b6\u02b7\u0006.\uffff\uffff\u0000\u02b7"+
		"\u02b8\u0003^/\u0000\u02b8\u02b9\u0003b1\u0000\u02b9\u02ba\u0003d2\u0000"+
		"\u02ba\u02bd\u0001\u0000\u0000\u0000\u02bb\u02bd\u0003`0\u0000\u02bc\u02b6"+
		"\u0001\u0000\u0000\u0000\u02bc\u02bb\u0001\u0000\u0000\u0000\u02bd\u02c3"+
		"\u0001\u0000\u0000\u0000\u02be\u02bf\n\u0001\u0000\u0000\u02bf\u02c0\u0005"+
		"\u0003\u0000\u0000\u02c0\u02c2\u0003`0\u0000\u02c1\u02be\u0001\u0000\u0000"+
		"\u0000\u02c2\u02c5\u0001\u0000\u0000\u0000\u02c3\u02c1\u0001\u0000\u0000"+
		"\u0000\u02c3\u02c4\u0001\u0000\u0000\u0000\u02c4]\u0001\u0000\u0000\u0000"+
		"\u02c5\u02c3\u0001\u0000\u0000\u0000\u02c6\u02c7\u0005[\u0000\u0000\u02c7"+
		"\u02cc\u0005\u0011\u0000\u0000\u02c8\u02ca\u0003b1\u0000\u02c9\u02cb\u0005"+
		"\u0003\u0000\u0000\u02ca\u02c9\u0001\u0000\u0000\u0000\u02ca\u02cb\u0001"+
		"\u0000\u0000\u0000\u02cb\u02cd\u0001\u0000\u0000\u0000\u02cc\u02c8\u0001"+
		"\u0000\u0000\u0000\u02cd\u02ce\u0001\u0000\u0000\u0000\u02ce\u02cc\u0001"+
		"\u0000\u0000\u0000\u02ce\u02cf\u0001\u0000\u0000\u0000\u02cf\u02d0\u0001"+
		"\u0000\u0000\u0000\u02d0\u02d1\u0005\u0012\u0000\u0000\u02d1_\u0001\u0000"+
		"\u0000\u0000\u02d2\u02d8\u0003b1\u0000\u02d3\u02d5\u0005Q\u0000\u0000"+
		"\u02d4\u02d3\u0001\u0000\u0000\u0000\u02d4\u02d5\u0001\u0000\u0000\u0000"+
		"\u02d5\u02d6\u0001\u0000\u0000\u0000\u02d6\u02d8\u0003\u0082A\u0000\u02d7"+
		"\u02d2\u0001\u0000\u0000\u0000\u02d7\u02d4\u0001\u0000\u0000\u0000\u02d8"+
		"\u02da\u0001\u0000\u0000\u0000\u02d9\u02db\u0003d2\u0000\u02da\u02d9\u0001"+
		"\u0000\u0000\u0000\u02da\u02db\u0001\u0000\u0000\u0000\u02db\u02dd\u0001"+
		"\u0000\u0000\u0000\u02dc\u02de\u0003P(\u0000\u02dd\u02dc\u0001\u0000\u0000"+
		"\u0000\u02dd\u02de\u0001\u0000\u0000\u0000\u02dea\u0001\u0000\u0000\u0000"+
		"\u02df\u02e0\u0007\u000b\u0000\u0000\u02e0c\u0001\u0000\u0000\u0000\u02e1"+
		"\u02e3\u0005`\u0000\u0000\u02e2\u02e1\u0001\u0000\u0000\u0000\u02e3\u02e4"+
		"\u0001\u0000\u0000\u0000\u02e4\u02e2\u0001\u0000\u0000\u0000\u02e4\u02e5"+
		"\u0001\u0000\u0000\u0000\u02e5\u02e7\u0001\u0000\u0000\u0000\u02e6\u02e8"+
		"\u0005r\u0000\u0000\u02e7\u02e6\u0001\u0000\u0000\u0000\u02e7\u02e8\u0001"+
		"\u0000\u0000\u0000\u02e8e\u0001\u0000\u0000\u0000\u02e9\u02eb\u0005\u0011"+
		"\u0000\u0000\u02ea\u02ec\u0003h4\u0000\u02eb\u02ea\u0001\u0000\u0000\u0000"+
		"\u02eb\u02ec\u0001\u0000\u0000\u0000\u02ec\u02ed\u0001\u0000\u0000\u0000"+
		"\u02ed\u02ee\u0005\u0012\u0000\u0000\u02eeg\u0001\u0000\u0000\u0000\u02ef"+
		"\u02f0\u00064\uffff\uffff\u0000\u02f0\u02f1\u0003j5\u0000\u02f1\u02f7"+
		"\u0001\u0000\u0000\u0000\u02f2\u02f3\n\u0001\u0000\u0000\u02f3\u02f4\u0005"+
		"\u0003\u0000\u0000\u02f4\u02f6\u0003j5\u0000\u02f5\u02f2\u0001\u0000\u0000"+
		"\u0000\u02f6\u02f9\u0001\u0000\u0000\u0000\u02f7\u02f5\u0001\u0000\u0000"+
		"\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8i\u0001\u0000\u0000\u0000"+
		"\u02f9\u02f7\u0001\u0000\u0000\u0000\u02fa\u02fc\u0005Q\u0000\u0000\u02fb"+
		"\u02fa\u0001\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000\u0000\u0000\u02fc"+
		"\u02fd\u0001\u0000\u0000\u0000\u02fd\u02ff\u0003\u0098L\u0000\u02fe\u0300"+
		"\u0003P(\u0000\u02ff\u02fe\u0001\u0000\u0000\u0000\u02ff\u0300\u0001\u0000"+
		"\u0000\u0000\u0300k\u0001\u0000\u0000\u0000\u0301\u0302\b\f\u0000\u0000"+
		"\u0302m\u0001\u0000\u0000\u0000\u0303\u0304\b\r\u0000\u0000\u0304o\u0001"+
		"\u0000\u0000\u0000\u0305\u0306\b\u000e\u0000\u0000\u0306q\u0001\u0000"+
		"\u0000\u0000\u0307\u0308\b\u000f\u0000\u0000\u0308s\u0001\u0000\u0000"+
		"\u0000\u0309\u030a\b\u0010\u0000\u0000\u030au\u0001\u0000\u0000\u0000"+
		"\u030b\u030c\b\u0011\u0000\u0000\u030cw\u0001\u0000\u0000\u0000\u030d"+
		"\u030e\b\u0012\u0000\u0000\u030ey\u0001\u0000\u0000\u0000\u030f\u0310"+
		"\b\u0013\u0000\u0000\u0310{\u0001\u0000\u0000\u0000\u0311\u0312\b\u0014"+
		"\u0000\u0000\u0312}\u0001\u0000\u0000\u0000\u0313\u0314\b\r\u0000\u0000"+
		"\u0314\u007f\u0001\u0000\u0000\u0000\u0315\u0316\t\u0000\u0000\u0000\u0316"+
		"\u0081\u0001\u0000\u0000\u0000\u0317\u031c\u0005`\u0000\u0000\u0318\u0319"+
		"\u0005\b\u0000\u0000\u0319\u031b\u0005`\u0000\u0000\u031a\u0318\u0001"+
		"\u0000\u0000\u0000\u031b\u031e\u0001\u0000\u0000\u0000\u031c\u031a\u0001"+
		"\u0000\u0000\u0000\u031c\u031d\u0001\u0000\u0000\u0000\u031d\u0320\u0001"+
		"\u0000\u0000\u0000\u031e\u031c\u0001\u0000\u0000\u0000\u031f\u0321\u0005"+
		"7\u0000\u0000\u0320\u031f\u0001\u0000\u0000\u0000\u0320\u0321\u0001\u0000"+
		"\u0000\u0000\u0321\u0324\u0001\u0000\u0000\u0000\u0322\u0324\u0003R)\u0000"+
		"\u0323\u0317\u0001\u0000\u0000\u0000\u0323\u0322\u0001\u0000\u0000\u0000"+
		"\u0324\u0083\u0001\u0000\u0000\u0000\u0325\u0326\u0007\u0015\u0000\u0000"+
		"\u0326\u0085\u0001\u0000\u0000\u0000\u0327\u0329\u0005Q\u0000\u0000\u0328"+
		"\u0327\u0001\u0000\u0000\u0000\u0328\u0329\u0001\u0000\u0000\u0000\u0329"+
		"\u032a\u0001\u0000\u0000\u0000\u032a\u032c\u0003P(\u0000\u032b\u032d\u0005"+
		"8\u0000\u0000\u032c\u032b\u0001\u0000\u0000\u0000\u032c\u032d\u0001\u0000"+
		"\u0000\u0000\u032d\u032f\u0001\u0000\u0000\u0000\u032e\u0328\u0001\u0000"+
		"\u0000\u0000\u032f\u0330\u0001\u0000\u0000\u0000\u0330\u032e\u0001\u0000"+
		"\u0000\u0000\u0330\u0331\u0001\u0000\u0000\u0000\u0331\u0087\u0001\u0000"+
		"\u0000\u0000\u0332\u0333\u0003\u0086C\u0000\u0333\u0089\u0001\u0000\u0000"+
		"\u0000\u0334\u0335\u00050\u0000\u0000\u0335\u008b\u0001\u0000\u0000\u0000"+
		"\u0336\u0337\u0007\u0016\u0000\u0000\u0337\u008d\u0001\u0000\u0000\u0000"+
		"\u0338\u033a\u0003Z-\u0000\u0339\u0338\u0001\u0000\u0000\u0000\u033a\u033d"+
		"\u0001\u0000\u0000\u0000\u033b\u0339\u0001\u0000\u0000\u0000\u033b\u033c"+
		"\u0001\u0000\u0000\u0000\u033c\u033e\u0001\u0000\u0000\u0000\u033d\u033b"+
		"\u0001\u0000\u0000\u0000\u033e\u0340\u0003\u008cF\u0000\u033f\u0341\u0003"+
		"\u009aM\u0000\u0340\u033f\u0001\u0000\u0000\u0000\u0340\u0341\u0001\u0000"+
		"\u0000\u0000\u0341\u0343\u0001\u0000\u0000\u0000\u0342\u0344\u0003\u0090"+
		"H\u0000\u0343\u0342\u0001\u0000\u0000\u0000\u0343\u0344\u0001\u0000\u0000"+
		"\u0000\u0344\u0346\u0001\u0000\u0000\u0000\u0345\u0347\u0003f3\u0000\u0346"+
		"\u0345\u0001\u0000\u0000\u0000\u0346\u0347\u0001\u0000\u0000\u0000\u0347"+
		"\u0349\u0001\u0000\u0000\u0000\u0348\u034a\u0003\u0092I\u0000\u0349\u0348"+
		"\u0001\u0000\u0000\u0000\u0349\u034a\u0001\u0000\u0000\u0000\u034a\u034b"+
		"\u0001\u0000\u0000\u0000\u034b\u034c\u0005a\u0000\u0000\u034c\u034d\u0006"+
		"G\uffff\uffff\u0000\u034d\u008f\u0001\u0000\u0000\u0000\u034e\u034f\u0003"+
		"\u0082A\u0000\u034f\u0091\u0001\u0000\u0000\u0000\u0350\u0351\u0005\u0007"+
		"\u0000\u0000\u0351\u0356\u0003\u0094J\u0000\u0352\u0353\u0005\u0003\u0000"+
		"\u0000\u0353\u0355\u0003\u0094J\u0000\u0354\u0352\u0001\u0000\u0000\u0000"+
		"\u0355\u0358\u0001\u0000\u0000\u0000\u0356\u0354\u0001\u0000\u0000\u0000"+
		"\u0356\u0357\u0001\u0000\u0000\u0000\u0357\u0360\u0001\u0000\u0000\u0000"+
		"\u0358\u0356\u0001\u0000\u0000\u0000\u0359\u035a\u0007\u0017\u0000\u0000"+
		"\u035a\u035c\u0003\u0094J\u0000\u035b\u0359\u0001\u0000\u0000\u0000\u035c"+
		"\u035d\u0001\u0000\u0000\u0000\u035d\u035b\u0001\u0000\u0000\u0000\u035d"+
		"\u035e\u0001\u0000\u0000\u0000\u035e\u0360\u0001\u0000\u0000\u0000\u035f"+
		"\u0350\u0001\u0000\u0000\u0000\u035f\u035b\u0001\u0000\u0000\u0000\u0360"+
		"\u0093\u0001\u0000\u0000\u0000\u0361\u0363\u0005R\u0000\u0000\u0362\u0361"+
		"\u0001\u0000\u0000\u0000\u0362\u0363\u0001\u0000\u0000\u0000\u0363\u0365"+
		"\u0001\u0000\u0000\u0000\u0364\u0366\u0003R)\u0000\u0365\u0364\u0001\u0000"+
		"\u0000\u0000\u0365\u0366\u0001\u0000\u0000\u0000\u0366\u0367\u0001\u0000"+
		"\u0000\u0000\u0367\u0369\u0003\u0082A\u0000\u0368\u036a\u0003f3\u0000"+
		"\u0369\u0368\u0001\u0000\u0000\u0000\u0369\u036a\u0001\u0000\u0000\u0000"+
		"\u036a\u0095\u0001\u0000\u0000\u0000\u036b\u036d\u0005Q\u0000\u0000\u036c"+
		"\u036b\u0001\u0000\u0000\u0000\u036d\u0370\u0001\u0000\u0000\u0000\u036e"+
		"\u036c\u0001\u0000\u0000\u0000\u036e\u036f\u0001\u0000\u0000\u0000\u036f"+
		"\u0374\u0001\u0000\u0000\u0000\u0370\u036e\u0001\u0000\u0000\u0000\u0371"+
		"\u0375\u0003\u008cF\u0000\u0372\u0375\u0005N\u0000\u0000\u0373\u0375\u0005"+
		"O\u0000\u0000\u0374\u0371\u0001\u0000\u0000\u0000\u0374\u0372\u0001\u0000"+
		"\u0000\u0000\u0374\u0373\u0001\u0000\u0000\u0000\u0374\u0375\u0001\u0000"+
		"\u0000\u0000\u0375\u0376\u0001\u0000\u0000\u0000\u0376\u0378\u0003\u0098"+
		"L\u0000\u0377\u0379\u0003f3\u0000\u0378\u0377\u0001\u0000\u0000\u0000"+
		"\u0378\u0379\u0001\u0000\u0000\u0000\u0379\u037c\u0001\u0000\u0000\u0000"+
		"\u037a\u037b\u0005\t\u0000\u0000\u037b\u037d\u0005\n\u0000\u0000\u037c"+
		"\u037a\u0001\u0000\u0000\u0000\u037c\u037d\u0001\u0000\u0000\u0000\u037d"+
		"\u0385\u0001\u0000\u0000\u0000\u037e\u037f\u0005\b\u0000\u0000\u037f\u0381"+
		"\u0003\u0098L\u0000\u0380\u0382\u0003f3\u0000\u0381\u0380\u0001\u0000"+
		"\u0000\u0000\u0381\u0382\u0001\u0000\u0000\u0000\u0382\u0384\u0001\u0000"+
		"\u0000\u0000\u0383\u037e\u0001\u0000\u0000\u0000\u0384\u0387\u0001\u0000"+
		"\u0000\u0000\u0385\u0383\u0001\u0000\u0000\u0000\u0385\u0386\u0001\u0000"+
		"\u0000\u0000\u0386\u0389\u0001\u0000\u0000\u0000\u0387\u0385\u0001\u0000"+
		"\u0000\u0000\u0388\u038a\u0005Q\u0000\u0000\u0389\u0388\u0001\u0000\u0000"+
		"\u0000\u0389\u038a\u0001\u0000\u0000\u0000\u038a\u038f\u0001\u0000\u0000"+
		"\u0000\u038b\u038f\u0003\u00cae\u0000\u038c\u038f\u0005N\u0000\u0000\u038d"+
		"\u038f\u0005O\u0000\u0000\u038e\u036e\u0001\u0000\u0000\u0000\u038e\u038b"+
		"\u0001\u0000\u0000\u0000\u038e\u038c\u0001\u0000\u0000\u0000\u038e\u038d"+
		"\u0001\u0000\u0000\u0000\u038f\u0097\u0001\u0000\u0000\u0000\u0390\u0392"+
		"\u0007\u0018\u0000\u0000\u0391\u0393\u0005r\u0000\u0000\u0392\u0391\u0001"+
		"\u0000\u0000\u0000\u0392\u0393\u0001\u0000\u0000\u0000\u0393\u0395\u0001"+
		"\u0000\u0000\u0000\u0394\u0390\u0001\u0000\u0000\u0000\u0395\u0396\u0001"+
		"\u0000\u0000\u0000\u0396\u0394\u0001\u0000\u0000\u0000\u0396\u0397\u0001"+
		"\u0000\u0000\u0000\u0397\u0099\u0001\u0000\u0000\u0000\u0398\u0399\u0005"+
		"_\u0000\u0000\u0399\u039a\u0005\u0004\u0000\u0000\u039a\u039b\u0005\u0004"+
		"\u0000\u0000\u039b\u039c\u0003\u0082A\u0000\u039c\u039d\u0005\u0005\u0000"+
		"\u0000\u039d\u039e\u0005\u0005\u0000\u0000\u039e\u009b\u0001\u0000\u0000"+
		"\u0000\u039f\u03a2\u0003\u009eO\u0000\u03a0\u03a1\u0005\u0003\u0000\u0000"+
		"\u03a1\u03a3\u0003\u009cN\u0000\u03a2\u03a0\u0001\u0000\u0000\u0000\u03a2"+
		"\u03a3\u0001\u0000\u0000\u0000\u03a3\u009d\u0001\u0000\u0000\u0000\u03a4"+
		"\u03a8\u0003\u00a0P\u0000\u03a5\u03a6\u0003V+\u0000\u03a6\u03a7\u0003"+
		"\u009eO\u0000\u03a7\u03a9\u0001\u0000\u0000\u0000\u03a8\u03a5\u0001\u0000"+
		"\u0000\u0000\u03a8\u03a9\u0001\u0000\u0000\u0000\u03a9\u009f\u0001\u0000"+
		"\u0000\u0000\u03aa\u03b2\u0003\u00a2Q\u0000\u03ab\u03ac\u0003\u00a2Q\u0000"+
		"\u03ac\u03ad\u0005<\u0000\u0000\u03ad\u03ae\u0003\u009cN\u0000\u03ae\u03af"+
		"\u0005\u0007\u0000\u0000\u03af\u03b0\u0003\u00a0P\u0000\u03b0\u03b2\u0001"+
		"\u0000\u0000\u0000\u03b1\u03aa\u0001\u0000\u0000\u0000\u03b1\u03ab\u0001"+
		"\u0000\u0000\u0000\u03b2\u00a1\u0001\u0000\u0000\u0000\u03b3\u03b6\u0003"+
		"\u00a4R\u0000\u03b4\u03b5\u00051\u0000\u0000\u03b5\u03b7\u0003\u00a2Q"+
		"\u0000\u03b6\u03b4\u0001\u0000\u0000\u0000\u03b6\u03b7\u0001\u0000\u0000"+
		"\u0000\u03b7\u00a3\u0001\u0000\u0000\u0000\u03b8\u03bb\u0003\u00a6S\u0000"+
		"\u03b9\u03ba\u00050\u0000\u0000\u03ba\u03bc\u0003\u00a4R\u0000\u03bb\u03b9"+
		"\u0001\u0000\u0000\u0000\u03bb\u03bc\u0001\u0000\u0000\u0000\u03bc\u00a5"+
		"\u0001\u0000\u0000\u0000\u03bd\u03c0\u0003\u00a8T\u0000\u03be\u03bf\u0005"+
		"!\u0000\u0000\u03bf\u03c1\u0003\u00a6S\u0000\u03c0\u03be\u0001\u0000\u0000"+
		"\u0000\u03c0\u03c1\u0001\u0000\u0000\u0000\u03c1\u00a7\u0001\u0000\u0000"+
		"\u0000\u03c2\u03c5\u0003\u00aaU\u0000\u03c3\u03c4\u0005 \u0000\u0000\u03c4"+
		"\u03c6\u0003\u00a8T\u0000\u03c5\u03c3\u0001\u0000\u0000\u0000\u03c5\u03c6"+
		"\u0001\u0000\u0000\u0000\u03c6\u00a9\u0001\u0000\u0000\u0000\u03c7\u03ca"+
		"\u0003\u00acV\u0000\u03c8\u03c9\u0005\u000b\u0000\u0000\u03c9\u03cb\u0003"+
		"\u00aaU\u0000\u03ca\u03c8\u0001\u0000\u0000\u0000\u03ca\u03cb\u0001\u0000"+
		"\u0000\u0000\u03cb\u00ab\u0001\u0000\u0000\u0000\u03cc\u03d0\u0003\u00ae"+
		"W\u0000\u03cd\u03ce\u0003X,\u0000\u03ce\u03cf\u0003\u00acV\u0000\u03cf"+
		"\u03d1\u0001\u0000\u0000\u0000\u03d0\u03cd\u0001\u0000\u0000\u0000\u03d0"+
		"\u03d1\u0001\u0000\u0000\u0000\u03d1\u00ad\u0001\u0000\u0000\u0000\u03d2"+
		"\u03d6\u0003\u00b0X\u0000\u03d3\u03d4\u0003J%\u0000\u03d4\u03d5\u0003"+
		"\u00aeW\u0000\u03d5\u03d7\u0001\u0000\u0000\u0000\u03d6\u03d3\u0001\u0000"+
		"\u0000\u0000\u03d6\u03d7\u0001\u0000\u0000\u0000\u03d7\u00af\u0001\u0000"+
		"\u0000\u0000\u03d8\u03db\u0003\u00b2Y\u0000\u03d9\u03da\u0007\u0019\u0000"+
		"\u0000\u03da\u03dc\u0003\u00b0X\u0000\u03db\u03d9\u0001\u0000\u0000\u0000"+
		"\u03db\u03dc\u0001\u0000\u0000\u0000\u03dc\u00b1\u0001\u0000\u0000\u0000"+
		"\u03dd\u03e0\u0003\u00b4Z\u0000\u03de\u03df\u0007\u001a\u0000\u0000\u03df"+
		"\u03e1\u0003\u00b2Y\u0000\u03e0\u03de\u0001\u0000\u0000\u0000\u03e0\u03e1"+
		"\u0001\u0000\u0000\u0000\u03e1\u00b3\u0001\u0000\u0000\u0000\u03e2\u03e5"+
		"\u0003\u00b6[\u0000\u03e3\u03e4\u0007\u001b\u0000\u0000\u03e4\u03e6\u0003"+
		"\u00b4Z\u0000\u03e5\u03e3\u0001\u0000\u0000\u0000\u03e5\u03e6\u0001\u0000"+
		"\u0000\u0000\u03e6\u00b5\u0001\u0000\u0000\u0000\u03e7\u03e8\u0005\u0004"+
		"\u0000\u0000\u03e8\u03e9\u0003\u00b8\\\u0000\u03e9\u03ea\u0005\u0005\u0000"+
		"\u0000\u03ea\u03eb\u0003\u00b6[\u0000\u03eb\u03ee\u0001\u0000\u0000\u0000"+
		"\u03ec\u03ee\u0003\u00ba]\u0000\u03ed\u03e7\u0001\u0000\u0000\u0000\u03ed"+
		"\u03ec\u0001\u0000\u0000\u0000\u03ee\u00b7\u0001\u0000\u0000\u0000\u03ef"+
		"\u03f3\u0003\u0096K\u0000\u03f0\u03f2\u0003P(\u0000\u03f1\u03f0\u0001"+
		"\u0000\u0000\u0000\u03f2\u03f5\u0001\u0000\u0000\u0000\u03f3\u03f1\u0001"+
		"\u0000\u0000\u0000\u03f3\u03f4\u0001\u0000\u0000\u0000\u03f4\u00b9\u0001"+
		"\u0000\u0000\u0000\u03f5\u03f3\u0001\u0000\u0000\u0000\u03f6\u03f7\u0003"+
		"\u00c8d\u0000\u03f7\u03f8\u0003\u00b6[\u0000\u03f8\u0408\u0001\u0000\u0000"+
		"\u0000\u03f9\u0408\u0003\u00bc^\u0000\u03fa\u0408\u0003\u00be_\u0000\u03fb"+
		"\u0408\u0003\u00c0`\u0000\u03fc\u03fd\u0003\u0082A\u0000\u03fd\u03fe\u0005"+
		"5\u0000\u0000\u03fe\u0400\u0001\u0000\u0000\u0000\u03ff\u03fc\u0001\u0000"+
		"\u0000\u0000\u0400\u0403\u0001\u0000\u0000\u0000\u0401\u03ff\u0001\u0000"+
		"\u0000\u0000\u0401\u0402\u0001\u0000\u0000\u0000\u0402\u0405\u0001\u0000"+
		"\u0000\u0000\u0403\u0401\u0001\u0000\u0000\u0000\u0404\u0401\u0001\u0000"+
		"\u0000\u0000\u0404\u0405\u0001\u0000\u0000\u0000\u0405\u0406\u0001\u0000"+
		"\u0000\u0000\u0406\u0408\u0003\u00cae\u0000\u0407\u03f6\u0001\u0000\u0000"+
		"\u0000\u0407\u03f9\u0001\u0000\u0000\u0000\u0407\u03fa\u0001\u0000\u0000"+
		"\u0000\u0407\u03fb\u0001\u0000\u0000\u0000\u0407\u0404\u0001\u0000\u0000"+
		"\u0000\u0408\u00bb\u0001\u0000\u0000\u0000\u0409\u040b\u0005\b\u0000\u0000"+
		"\u040a\u0409\u0001\u0000\u0000\u0000\u040a\u040b\u0001\u0000\u0000\u0000"+
		"\u040b\u040c\u0001\u0000\u0000\u0000\u040c\u040d\u0005\\\u0000\u0000\u040d"+
		"\u040e\u0003\u0096K\u0000\u040e\u0410\u0005\t\u0000\u0000\u040f\u0411"+
		"\u0003\u00a0P\u0000\u0410\u040f\u0001\u0000\u0000\u0000\u0410\u0411\u0001"+
		"\u0000\u0000\u0000\u0411\u0412\u0001\u0000\u0000\u0000\u0412\u0413\u0005"+
		"\n\u0000\u0000\u0413\u042b\u0001\u0000\u0000\u0000\u0414\u0416\u0005\b"+
		"\u0000\u0000\u0415\u0414\u0001\u0000\u0000\u0000\u0415\u0416\u0001\u0000"+
		"\u0000\u0000\u0416\u0417\u0001\u0000\u0000\u0000\u0417\u0418\u0005\\\u0000"+
		"\u0000\u0418\u0419\u0003\u0096K\u0000\u0419\u041b\u0005\u0004\u0000\u0000"+
		"\u041a\u041c\u0003\u009cN\u0000\u041b\u041a\u0001\u0000\u0000\u0000\u041b"+
		"\u041c\u0001\u0000\u0000\u0000\u041c\u041d\u0001\u0000\u0000\u0000\u041d"+
		"\u041e\u0005\u0005\u0000\u0000\u041e\u042b\u0001\u0000\u0000\u0000\u041f"+
		"\u0421\u0005\b\u0000\u0000\u0420\u041f\u0001\u0000\u0000\u0000\u0420\u0421"+
		"\u0001\u0000\u0000\u0000\u0421\u0422\u0001\u0000\u0000\u0000\u0422\u0423"+
		"\u0005\\\u0000\u0000\u0423\u0424\u0003\u00cae\u0000\u0424\u0426\u0005"+
		"\u0004\u0000\u0000\u0425\u0427\u0003\u009cN\u0000\u0426\u0425\u0001\u0000"+
		"\u0000\u0000\u0426\u0427\u0001\u0000\u0000\u0000\u0427\u0428\u0001\u0000"+
		"\u0000\u0000\u0428\u0429\u0005\u0005\u0000\u0000\u0429\u042b\u0001\u0000"+
		"\u0000\u0000\u042a\u040a\u0001\u0000\u0000\u0000\u042a\u0415\u0001\u0000"+
		"\u0000\u0000\u042a\u0420\u0001\u0000\u0000\u0000\u042b\u00bd\u0001\u0000"+
		"\u0000\u0000\u042c\u042d\u0003H$\u0000\u042d\u042e\u0003\u00b6[\u0000"+
		"\u042e\u00bf\u0001\u0000\u0000\u0000\u042f\u0430\u0003\u00c2a\u0000\u0430"+
		"\u0431\u0003\u00c6c\u0000\u0431\u043d\u0001\u0000\u0000\u0000\u0432\u0433"+
		"\u0003\u00c2a\u0000\u0433\u0434\u0005\u0004\u0000\u0000\u0434\u0435\u0003"+
		"\u00c6c\u0000\u0435\u0436\u0005\u0005\u0000\u0000\u0436\u043d\u0001\u0000"+
		"\u0000\u0000\u0437\u0438\u0003\u00c2a\u0000\u0438\u0439\u0005\u0004\u0000"+
		"\u0000\u0439\u043a\u0003\u00c4b\u0000\u043a\u043b\u0005\u0005\u0000\u0000"+
		"\u043b\u043d\u0001\u0000\u0000\u0000\u043c\u042f\u0001\u0000\u0000\u0000"+
		"\u043c\u0432\u0001\u0000\u0000\u0000\u043c\u0437\u0001\u0000\u0000\u0000"+
		"\u043d\u00c1\u0001\u0000\u0000\u0000\u043e\u043f\u0005=\u0000\u0000\u043f"+
		"\u00c3\u0001\u0000\u0000\u0000\u0440\u0444\u0003\u0096K\u0000\u0441\u0443"+
		"\u0003P(\u0000\u0442\u0441\u0001\u0000\u0000\u0000\u0443\u0446\u0001\u0000"+
		"\u0000\u0000\u0444\u0442\u0001\u0000\u0000\u0000\u0444\u0445\u0001\u0000"+
		"\u0000\u0000\u0445\u00c5\u0001\u0000\u0000\u0000\u0446\u0444\u0001\u0000"+
		"\u0000\u0000\u0447\u0448\u0003\u00ba]\u0000\u0448\u00c7\u0001\u0000\u0000"+
		"\u0000\u0449\u044a\u0007\u001c\u0000\u0000\u044a\u00c9\u0001\u0000\u0000"+
		"\u0000\u044b\u044c\u0006e\uffff\uffff\u0000\u044c\u044d\u0003\u00d0h\u0000"+
		"\u044d\u0472\u0001\u0000\u0000\u0000\u044e\u044f\n\u0007\u0000\u0000\u044f"+
		"\u0450\u0005\t\u0000\u0000\u0450\u0451\u0003\u009cN\u0000\u0451\u0452"+
		"\u0005\n\u0000\u0000\u0452\u0471\u0001\u0000\u0000\u0000\u0453\u0454\n"+
		"\u0006\u0000\u0000\u0454\u0455\u0005\u0004\u0000\u0000\u0455\u0456\u0003"+
		"\u00ccf\u0000\u0456\u0457\u0005\u0005\u0000\u0000\u0457\u0471\u0001\u0000"+
		"\u0000\u0000\u0458\u0459\n\u0005\u0000\u0000\u0459\u045b\u0005>\u0000"+
		"\u0000\u045a\u045c\u0005[\u0000\u0000\u045b\u045a\u0001\u0000\u0000\u0000"+
		"\u045b\u045c\u0001\u0000\u0000\u0000\u045c\u045d\u0001\u0000\u0000\u0000"+
		"\u045d\u0471\u0003\u0082A\u0000\u045e\u045f\n\u0004\u0000\u0000\u045f"+
		"\u0461\u00055\u0000\u0000\u0460\u0462\u0005[\u0000\u0000\u0461\u0460\u0001"+
		"\u0000\u0000\u0000\u0461\u0462\u0001\u0000\u0000\u0000\u0462\u0463\u0001"+
		"\u0000\u0000\u0000\u0463\u0471\u0003\u0082A\u0000\u0464\u0465\n\u0003"+
		"\u0000\u0000\u0465\u0471\u0003\u00c8d\u0000\u0466\u0467\n\u0002\u0000"+
		"\u0000\u0467\u0468\u0005?\u0000\u0000\u0468\u046e\u0003\u009cN\u0000\u0469"+
		"\u046b\u0005\u0011\u0000\u0000\u046a\u046c\u0003\u00ccf\u0000\u046b\u046a"+
		"\u0001\u0000\u0000\u0000\u046b\u046c\u0001\u0000\u0000\u0000\u046c\u046d"+
		"\u0001\u0000\u0000\u0000\u046d\u046f\u0005\u0012\u0000\u0000\u046e\u0469"+
		"\u0001\u0000\u0000\u0000\u046e\u046f\u0001\u0000\u0000\u0000\u046f\u0471"+
		"\u0001\u0000\u0000\u0000\u0470\u044e\u0001\u0000\u0000\u0000\u0470\u0453"+
		"\u0001\u0000\u0000\u0000\u0470\u0458\u0001\u0000\u0000\u0000\u0470\u045e"+
		"\u0001\u0000\u0000\u0000\u0470\u0464\u0001\u0000\u0000\u0000\u0470\u0466"+
		"\u0001\u0000\u0000\u0000\u0471\u0474\u0001\u0000\u0000\u0000\u0472\u0470"+
		"\u0001\u0000\u0000\u0000\u0472\u0473\u0001\u0000\u0000\u0000\u0473\u00cb"+
		"\u0001\u0000\u0000\u0000\u0474\u0472\u0001\u0000\u0000\u0000\u0475\u047a"+
		"\u0003\u00ceg\u0000\u0476\u0477\u0005\u0003\u0000\u0000\u0477\u0479\u0003"+
		"\u00ceg\u0000\u0478\u0476\u0001\u0000\u0000\u0000\u0479\u047c\u0001\u0000"+
		"\u0000\u0000\u047a\u0478\u0001\u0000\u0000\u0000\u047a\u047b\u0001\u0000"+
		"\u0000\u0000\u047b\u047e\u0001\u0000\u0000\u0000\u047c\u047a\u0001\u0000"+
		"\u0000\u0000\u047d\u0475\u0001\u0000\u0000\u0000\u047d\u047e\u0001\u0000"+
		"\u0000\u0000\u047e\u00cd\u0001\u0000\u0000\u0000\u047f\u0481\u0003\u009e"+
		"O\u0000\u0480\u0482\u0007\u001d\u0000\u0000\u0481\u0480\u0001\u0000\u0000"+
		"\u0000\u0481\u0482\u0001\u0000\u0000\u0000\u0482\u00cf\u0001\u0000\u0000"+
		"\u0000\u0483\u0485\u0003\u0082A\u0000\u0484\u0486\u0007\u001d\u0000\u0000"+
		"\u0485\u0484\u0001\u0000\u0000\u0000\u0485\u0486\u0001\u0000\u0000\u0000"+
		"\u0486\u0490\u0001\u0000\u0000\u0000\u0487\u0489\u0003L&\u0000\u0488\u048a"+
		"\u0007\u001d\u0000\u0000\u0489\u0488\u0001\u0000\u0000\u0000\u0489\u048a"+
		"\u0001\u0000\u0000\u0000\u048a\u0490\u0001\u0000\u0000\u0000\u048b\u048c"+
		"\u0005\u0004\u0000\u0000\u048c\u048d\u0003\u009cN\u0000\u048d\u048e\u0005"+
		"\u0005\u0000\u0000\u048e\u0490\u0001\u0000\u0000\u0000\u048f\u0483\u0001"+
		"\u0000\u0000\u0000\u048f\u0487\u0001\u0000\u0000\u0000\u048f\u048b\u0001"+
		"\u0000\u0000\u0000\u0490\u00d1\u0001\u0000\u0000\u0000\u0098\u00d7\u00d9"+
		"\u00e2\u00e7\u00ea\u00ed\u00f2\u00f9\u00fd\u0102\u010a\u010d\u0114\u011c"+
		"\u0121\u0127\u012b\u0132\u0137\u013a\u013e\u0145\u0147\u014a\u0151\u0154"+
		"\u0157\u0165\u016c\u0172\u017d\u0187\u0190\u0195\u019b\u01a0\u01a3\u01a7"+
		"\u01aa\u01ad\u01b5\u01bd\u01c0\u01c5\u01d4\u01d9\u01de\u01e4\u01f3\u01f8"+
		"\u01fd\u0203\u020c\u0211\u0217\u0220\u0225\u022b\u0232\u023c\u0243\u0247"+
		"\u0256\u0259\u025c\u0262\u0269\u026b\u026e\u027f\u02a9\u02b2\u02bc\u02c3"+
		"\u02ca\u02ce\u02d4\u02d7\u02da\u02dd\u02e4\u02e7\u02eb\u02f7\u02fb\u02ff"+
		"\u031c\u0320\u0323\u0328\u032c\u0330\u033b\u0340\u0343\u0346\u0349\u0356"+
		"\u035d\u035f\u0362\u0365\u0369\u036e\u0374\u0378\u037c\u0381\u0385\u0389"+
		"\u038e\u0392\u0396\u03a2\u03a8\u03b1\u03b6\u03bb\u03c0\u03c5\u03ca\u03d0"+
		"\u03d6\u03db\u03e0\u03e5\u03ed\u03f3\u0401\u0404\u0407\u040a\u0410\u0415"+
		"\u041b\u0420\u0426\u042a\u043c\u0444\u045b\u0461\u046b\u046e\u0470\u0472"+
		"\u047a\u047d\u0481\u0485\u0489\u048f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}