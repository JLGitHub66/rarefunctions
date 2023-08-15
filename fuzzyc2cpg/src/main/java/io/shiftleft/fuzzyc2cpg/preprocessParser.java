package io.shiftleft.fuzzyc2cpg;// $ANTLR 3.5.1 C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g 2020-08-11 10:46:45

//package com.mm.antlrv3demo;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class preprocessParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMA", "COMMENT", "DIRECTIVE", 
		"ELLIPSIS", "ESC_SEQ", "EXPONENT", "EXPR", "FLOAT", "HASH", "HEX_DIGIT", 
		"IDENTIFIER", "INCLUDE", "LEFT", "MACRO_TEXT", "NUMBER", "OCTAL_ESC", 
		"OPERATOR", "RAW_IDENTIFIER", "RIGHT", "STRING", "TWODOT", "UNICODE_ESC", 
		"WS"
	};
	public static final int EOF=-1;
	public static final int CHAR=4;
	public static final int COMMA=5;
	public static final int COMMENT=6;
	public static final int DIRECTIVE=7;
	public static final int ELLIPSIS=8;
	public static final int ESC_SEQ=9;
	public static final int EXPONENT=10;
	public static final int EXPR=11;
	public static final int FLOAT=12;
	public static final int HASH=13;
	public static final int HEX_DIGIT=14;
	public static final int IDENTIFIER=15;
	public static final int INCLUDE=16;
	public static final int LEFT=17;
	public static final int MACRO_TEXT=18;
	public static final int NUMBER=19;
	public static final int OCTAL_ESC=20;
	public static final int OPERATOR=21;
	public static final int RAW_IDENTIFIER=22;
	public static final int RIGHT=23;
	public static final int STRING=24;
	public static final int TWODOT=25;
	public static final int UNICODE_ESC=26;
	public static final int WS=27;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public preprocessParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public preprocessParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return preprocessParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g"; }


	public static class code_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "code"
	// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:555:1: code : (ws= WS |hash= HASH |ellipsis= ELLIPSIS |twodot= TWODOT |operator= OPERATOR |string= STRING |identifier= IDENTIFIER |cha= CHAR |floa= FLOAT |comma= COMMA |left= LEFT |right= RIGHT |number= NUMBER |comment= COMMENT )* ;
	public final code_return code() throws RecognitionException {
		code_return retval = new code_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ws=null;
		Token hash=null;
		Token ellipsis=null;
		Token twodot=null;
		Token operator=null;
		Token string=null;
		Token identifier=null;
		Token cha=null;
		Token floa=null;
		Token comma=null;
		Token left=null;
		Token right=null;
		Token number=null;
		Token comment=null;

		Object ws_tree=null;
		Object hash_tree=null;
		Object ellipsis_tree=null;
		Object twodot_tree=null;
		Object operator_tree=null;
		Object string_tree=null;
		Object identifier_tree=null;
		Object cha_tree=null;
		Object floa_tree=null;
		Object comma_tree=null;
		Object left_tree=null;
		Object right_tree=null;
		Object number_tree=null;
		Object comment_tree=null;

		try {
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:556:4: ( (ws= WS |hash= HASH |ellipsis= ELLIPSIS |twodot= TWODOT |operator= OPERATOR |string= STRING |identifier= IDENTIFIER |cha= CHAR |floa= FLOAT |comma= COMMA |left= LEFT |right= RIGHT |number= NUMBER |comment= COMMENT )* )
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:556:4: (ws= WS |hash= HASH |ellipsis= ELLIPSIS |twodot= TWODOT |operator= OPERATOR |string= STRING |identifier= IDENTIFIER |cha= CHAR |floa= FLOAT |comma= COMMA |left= LEFT |right= RIGHT |number= NUMBER |comment= COMMENT )*
			{
			root_0 = (Object)adaptor.nil();


			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:556:4: (ws= WS |hash= HASH |ellipsis= ELLIPSIS |twodot= TWODOT |operator= OPERATOR |string= STRING |identifier= IDENTIFIER |cha= CHAR |floa= FLOAT |comma= COMMA |left= LEFT |right= RIGHT |number= NUMBER |comment= COMMENT )*
			loop1:
			while (true) {
				int alt1=15;
				switch ( input.LA(1) ) {
				case WS:
					{
					alt1=1;
					}
					break;
				case HASH:
					{
					alt1=2;
					}
					break;
				case ELLIPSIS:
					{
					alt1=3;
					}
					break;
				case TWODOT:
					{
					alt1=4;
					}
					break;
				case OPERATOR:
					{
					alt1=5;
					}
					break;
				case STRING:
					{
					alt1=6;
					}
					break;
				case IDENTIFIER:
					{
					alt1=7;
					}
					break;
				case CHAR:
					{
					alt1=8;
					}
					break;
				case FLOAT:
					{
					alt1=9;
					}
					break;
				case COMMA:
					{
					alt1=10;
					}
					break;
				case LEFT:
					{
					alt1=11;
					}
					break;
				case RIGHT:
					{
					alt1=12;
					}
					break;
				case NUMBER:
					{
					alt1=13;
					}
					break;
				case COMMENT:
					{
					alt1=14;
					}
					break;
				}
				switch (alt1) {
				case 1 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:557:3: ws= WS
					{
					ws=(Token)match(input,WS,FOLLOW_WS_in_code1878); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ws_tree = (Object)adaptor.create(ws);
					adaptor.addChild(root_0, ws_tree);
					}

					if ( state.backtracking==0 ) {System.out.print(ws.getText());}
					}
					break;
				case 2 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:558:3: hash= HASH
					{
					hash=(Token)match(input,HASH,FOLLOW_HASH_in_code1888); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					hash_tree = (Object)adaptor.create(hash);
					adaptor.addChild(root_0, hash_tree);
					}

					if ( state.backtracking==0 ) {System.out.print(hash.getText());}
					}
					break;
				case 3 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:559:3: ellipsis= ELLIPSIS
					{
					ellipsis=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_code1898); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ellipsis_tree = (Object)adaptor.create(ellipsis);
					adaptor.addChild(root_0, ellipsis_tree);
					}

					if ( state.backtracking==0 ) {System.out.print(ellipsis.getText());}
					}
					break;
				case 4 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:560:3: twodot= TWODOT
					{
					twodot=(Token)match(input,TWODOT,FOLLOW_TWODOT_in_code1908); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					twodot_tree = (Object)adaptor.create(twodot);
					adaptor.addChild(root_0, twodot_tree);
					}

					if ( state.backtracking==0 ) {System.out.print(twodot.getText());}
					}
					break;
				case 5 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:561:3: operator= OPERATOR
					{
					operator=(Token)match(input,OPERATOR,FOLLOW_OPERATOR_in_code1918); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					operator_tree = (Object)adaptor.create(operator);
					adaptor.addChild(root_0, operator_tree);
					}

					if ( state.backtracking==0 ) {System.out.print(operator.getText());}
					}
					break;
				case 6 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:562:3: string= STRING
					{
					string=(Token)match(input,STRING,FOLLOW_STRING_in_code1928); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_tree = (Object)adaptor.create(string);
					adaptor.addChild(root_0, string_tree);
					}

					if ( state.backtracking==0 ) {System.out.print(string.getText());}
					}
					break;
				case 7 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:563:3: identifier= IDENTIFIER
					{
					identifier=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_code1938); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					identifier_tree = (Object)adaptor.create(identifier);
					adaptor.addChild(root_0, identifier_tree);
					}

					if ( state.backtracking==0 ) {System.out.print(identifier.getText());}
					}
					break;
				case 8 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:564:3: cha= CHAR
					{
					cha=(Token)match(input,CHAR,FOLLOW_CHAR_in_code1948); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					cha_tree = (Object)adaptor.create(cha);
					adaptor.addChild(root_0, cha_tree);
					}

					if ( state.backtracking==0 ) {System.out.print(cha.getText());}
					}
					break;
				case 9 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:565:3: floa= FLOAT
					{
					floa=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_code1958); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					floa_tree = (Object)adaptor.create(floa);
					adaptor.addChild(root_0, floa_tree);
					}

					if ( state.backtracking==0 ) {System.out.print(floa.getText());}
					}
					break;
				case 10 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:566:3: comma= COMMA
					{
					comma=(Token)match(input,COMMA,FOLLOW_COMMA_in_code1968); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					comma_tree = (Object)adaptor.create(comma);
					adaptor.addChild(root_0, comma_tree);
					}

					if ( state.backtracking==0 ) {System.out.print(comma.getText());}
					}
					break;
				case 11 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:567:3: left= LEFT
					{
					left=(Token)match(input,LEFT,FOLLOW_LEFT_in_code1978); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					left_tree = (Object)adaptor.create(left);
					adaptor.addChild(root_0, left_tree);
					}

					if ( state.backtracking==0 ) {System.out.print(left.getText());}
					}
					break;
				case 12 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:568:3: right= RIGHT
					{
					right=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_code1988); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					right_tree = (Object)adaptor.create(right);
					adaptor.addChild(root_0, right_tree);
					}

					if ( state.backtracking==0 ) {System.out.print(right.getText());}
					}
					break;
				case 13 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:569:3: number= NUMBER
					{
					number=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_code1998); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					number_tree = (Object)adaptor.create(number);
					adaptor.addChild(root_0, number_tree);
					}

					if ( state.backtracking==0 ) {System.out.print(number.getText());}
					}
					break;
				case 14 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:570:3: comment= COMMENT
					{
					comment=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_code2008); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					comment_tree = (Object)adaptor.create(comment);
					adaptor.addChild(root_0, comment_tree);
					}

					if ( state.backtracking==0 ) {System.out.print(comment.getText());}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "code"

	// Delegated rules



	public static final BitSet FOLLOW_WS_in_code1878 = new BitSet(new long[]{0x000000000BAAB172L});
	public static final BitSet FOLLOW_HASH_in_code1888 = new BitSet(new long[]{0x000000000BAAB172L});
	public static final BitSet FOLLOW_ELLIPSIS_in_code1898 = new BitSet(new long[]{0x000000000BAAB172L});
	public static final BitSet FOLLOW_TWODOT_in_code1908 = new BitSet(new long[]{0x000000000BAAB172L});
	public static final BitSet FOLLOW_OPERATOR_in_code1918 = new BitSet(new long[]{0x000000000BAAB172L});
	public static final BitSet FOLLOW_STRING_in_code1928 = new BitSet(new long[]{0x000000000BAAB172L});
	public static final BitSet FOLLOW_IDENTIFIER_in_code1938 = new BitSet(new long[]{0x000000000BAAB172L});
	public static final BitSet FOLLOW_CHAR_in_code1948 = new BitSet(new long[]{0x000000000BAAB172L});
	public static final BitSet FOLLOW_FLOAT_in_code1958 = new BitSet(new long[]{0x000000000BAAB172L});
	public static final BitSet FOLLOW_COMMA_in_code1968 = new BitSet(new long[]{0x000000000BAAB172L});
	public static final BitSet FOLLOW_LEFT_in_code1978 = new BitSet(new long[]{0x000000000BAAB172L});
	public static final BitSet FOLLOW_RIGHT_in_code1988 = new BitSet(new long[]{0x000000000BAAB172L});
	public static final BitSet FOLLOW_NUMBER_in_code1998 = new BitSet(new long[]{0x000000000BAAB172L});
	public static final BitSet FOLLOW_COMMENT_in_code2008 = new BitSet(new long[]{0x000000000BAAB172L});
}
