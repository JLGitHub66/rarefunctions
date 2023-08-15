package io.shiftleft.fuzzyc2cpg;// $ANTLR 3.5.1 C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g 2020-08-11 10:46:45

//package com.mm.antlrv3demo;
 
import java.io.*;
import java.util.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class preprocessLexer extends Lexer {
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

	    //public static TokenStreamSelector selector; // must be assigned externally
	    protected static Integer ifState = 1; // -1: no-else false, 0:false, 1: true
	    protected static List ifStates = new ArrayList(); // holds nested if conditions
	    protected static Map globalDefineMap = new Hashtable(); // holds the globalDefineMap
	    protected Map globalDefineArgsMap = new Hashtable(); // holds the args for a macro call
	    protected List headerfiles = new ArrayList();
	    int order = 1;
	    int flag = 0;
	    int inexpr = 0;
	    int defined = 0;
	    
	    /*
	    public void uponEOF() throws TokenStreamException, CharStreamException {
	        try {
	            selector.pop(); // return to old lexer/stream
	            selector.retry();
	        } catch (NoSuchElementException e) {
	            // return a real EOF if nothing in stack
	        }
	    }
	    */
	 
	    protected static boolean isReplacingDefineContent = false;
	     
	    class SaveStruct {
	      SaveStruct(CharStream input){
	        this.input = input;
	        this.marker = input.mark();
	      }
	      public CharStream input;
	      public int marker;
	     }
	     Stack<SaveStruct> includes = new Stack<SaveStruct>();
	      
	    // class SaveStruct_defines {
	      // SaveStruct(CharStream input){
	        // this.input = input;
	        // this.marker = input.mark();
	      // }
	      // public CharStream input;
	      // public int marker;
	     // }
	     // Stack<SaveStruct_defines> definesSaveStruct = new Stack<SaveStruct_defines>();
	  
	    // We should override this method for handling EOF of included file
	     public Token nextToken(){
	       Token token = super.nextToken();
	  
	       if(token.getType() == Token.EOF && !includes.empty()){
	        // We've got EOF and have non empty stack.
	         SaveStruct ss = includes.pop();
	         setCharStream(ss.input);
	         input.rewind(ss.marker);
	         //this should be used instead of super [like below] to handle exits from nested includes
	         //it matters, when the 'include' token is the last in previous stream (using super, lexer 'crashes' returning EOF token)
	         token = this.nextToken();
	       }
	  
	      // Skip first token after switching on another input.
	      // You need to use this rather than super as there may be nested include files
	       if(((CommonToken)token).getStartIndex() < 0)
	         token = this.nextToken();
	  
	       return token;
	     }


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public preprocessLexer() {} 
	public preprocessLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public preprocessLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g"; }

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:93:5: ( ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? ) | ( '/*' ( options {greedy=false; } : . )* '*/' ) )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='/') ) {
				int LA4_1 = input.LA(2);
				if ( (LA4_1=='/') ) {
					alt4=1;
				}
				else if ( (LA4_1=='*') ) {
					alt4=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:93:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? )
					{
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:93:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? )
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:93:10: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )?
					{
					match("//"); if (state.failed) return;

					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:93:15: (~ ( '\\n' | '\\r' ) )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '\uFFFF')) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop1;
						}
					}

					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:93:29: ( '\\r' )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0=='\r') ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:93:29: '\\r'
							{
							match('\r'); if (state.failed) return;
							}
							break;

					}

					}

					}
					break;
				case 2 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:94:9: ( '/*' ( options {greedy=false; } : . )* '*/' )
					{
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:94:9: ( '/*' ( options {greedy=false; } : . )* '*/' )
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:94:10: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); if (state.failed) return;

					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:94:15: ( options {greedy=false; } : . )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0=='*') ) {
							int LA3_1 = input.LA(2);
							if ( (LA3_1=='/') ) {
								alt3=2;
							}
							else if ( ((LA3_1 >= '\u0000' && LA3_1 <= '.')||(LA3_1 >= '0' && LA3_1 <= '\uFFFF')) ) {
								alt3=1;
							}

						}
						else if ( ((LA3_0 >= '\u0000' && LA3_0 <= ')')||(LA3_0 >= '+' && LA3_0 <= '\uFFFF')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:94:43: .
							{
							matchAny(); if (state.failed) return;
							}
							break;

						default :
							break loop3;
						}
					}

					match("*/"); if (state.failed) return;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "INCLUDE"
	public final void mINCLUDE() throws RecognitionException {
		try {
			int _type = INCLUDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			CommonToken f=null;


				File 	sourceFile = null;
				File	currentDirectory=null;
				String	includeFile = null;

			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:108:6: ( '#' ( WS )* 'include' ( WS )* f= STRING | '#' ( WS )* 'include' ( WS )* '<' ( ESC_SEQ |~ ( '>' ) )* '>' | '#' ( WS )* 'include' ( WS )* RAW_IDENTIFIER )
			int alt12=3;
			alt12 = dfa12.predict(input);
			switch (alt12) {
				case 1 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:108:6: '#' ( WS )* 'include' ( WS )* f= STRING
					{
					match('#'); if (state.failed) return;
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:108:10: ( WS )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||LA5_0=='\r'||LA5_0==' ') ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
							{
							if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop5;
						}
					}

					match("include"); if (state.failed) return;

					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:108:24: ( WS )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||LA6_0=='\r'||LA6_0==' ') ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
							{
							if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop6;
						}
					}

					int fStart125 = getCharIndex();
					int fStartLine125 = getLine();
					int fStartCharPos125 = getCharPositionInLine();
					mSTRING(); if (state.failed) return;
					f = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, fStart125, getCharIndex()-1);
					f.setLine(fStartLine125);
					f.setCharPositionInLine(fStartCharPos125);

					if ( state.backtracking==0 ) {
					    
					    sourceFile = new File(String.valueOf(((ANTLRFileStream)input).getSourceName()));
					    currentDirectory = sourceFile.getParentFile();
					    String absolutePath = currentDirectory.getAbsolutePath();
					    //System.out.println(absolutePath);
					    includeFile = f.getText();
					    includeFile = includeFile.substring(1,includeFile.length()-1);
					    try{
					    File incFile = new File(absolutePath, includeFile);
					    if (incFile.exists())
					    {
					      includeFile  = incFile.getCanonicalPath();
					    }
					    } catch(Exception e){}
					    //System.out.println(headerfiles);
					    if(headerfiles.contains(includeFile)){
					     skip();
					    }
					    else{
					    File file = new File(includeFile);
					    if(!file.exists()){
					    	skip();
					    }
					    else{
					    	//System.out.println("exists");
					    	try{
					    	headerfiles.add(includeFile);
					        // save current lexer's state
					        SaveStruct ss = new SaveStruct(input);
					        includes.push(ss);
					  
					        // switch on new input stream
					        setCharStream(new ANTLRFileStream(includeFile));
					        reset();
					        } catch(Exception e){System.out.println("Can't open file " + includeFile);}
					        
					    }
					    }
					}
					}
					break;
				case 2 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:148:4: '#' ( WS )* 'include' ( WS )* '<' ( ESC_SEQ |~ ( '>' ) )* '>'
					{
					match('#'); if (state.failed) return;
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:148:8: ( WS )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= '\t' && LA7_0 <= '\n')||LA7_0=='\r'||LA7_0==' ') ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
							{
							if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop7;
						}
					}

					match("include"); if (state.failed) return;

					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:148:22: ( WS )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '\t' && LA8_0 <= '\n')||LA8_0=='\r'||LA8_0==' ') ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
							{
							if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop8;
						}
					}

					match('<'); if (state.failed) return;
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:148:32: ( ESC_SEQ |~ ( '>' ) )*
					loop9:
					while (true) {
						int alt9=3;
						int LA9_0 = input.LA(1);
						if ( (LA9_0=='\\') ) {
							int LA9_2 = input.LA(2);
							if ( (LA9_2=='\\') ) {
								alt9=1;
							}
							else if ( (LA9_2=='u') ) {
								int LA9_5 = input.LA(3);
								if ( ((LA9_5 >= '0' && LA9_5 <= '9')||(LA9_5 >= 'A' && LA9_5 <= 'F')||(LA9_5 >= 'a' && LA9_5 <= 'f')) ) {
									int LA9_9 = input.LA(4);
									if ( ((LA9_9 >= '0' && LA9_9 <= '9')||(LA9_9 >= 'A' && LA9_9 <= 'F')||(LA9_9 >= 'a' && LA9_9 <= 'f')) ) {
										int LA9_10 = input.LA(5);
										if ( ((LA9_10 >= '0' && LA9_10 <= '9')||(LA9_10 >= 'A' && LA9_10 <= 'F')||(LA9_10 >= 'a' && LA9_10 <= 'f')) ) {
											int LA9_11 = input.LA(6);
											if ( ((LA9_11 >= '0' && LA9_11 <= '9')||(LA9_11 >= 'A' && LA9_11 <= 'F')||(LA9_11 >= 'a' && LA9_11 <= 'f')) ) {
												alt9=1;
											}
											else if ( ((LA9_11 >= '\u0000' && LA9_11 <= '/')||(LA9_11 >= ':' && LA9_11 <= '@')||(LA9_11 >= 'G' && LA9_11 <= '`')||(LA9_11 >= 'g' && LA9_11 <= '\uFFFF')) ) {
												alt9=2;
											}

										}
										else if ( ((LA9_10 >= '\u0000' && LA9_10 <= '/')||(LA9_10 >= ':' && LA9_10 <= '@')||(LA9_10 >= 'G' && LA9_10 <= '`')||(LA9_10 >= 'g' && LA9_10 <= '\uFFFF')) ) {
											alt9=2;
										}

									}
									else if ( ((LA9_9 >= '\u0000' && LA9_9 <= '/')||(LA9_9 >= ':' && LA9_9 <= '@')||(LA9_9 >= 'G' && LA9_9 <= '`')||(LA9_9 >= 'g' && LA9_9 <= '\uFFFF')) ) {
										alt9=2;
									}

								}
								else if ( ((LA9_5 >= '\u0000' && LA9_5 <= '/')||(LA9_5 >= ':' && LA9_5 <= '@')||(LA9_5 >= 'G' && LA9_5 <= '`')||(LA9_5 >= 'g' && LA9_5 <= '\uFFFF')) ) {
									alt9=2;
								}

							}
							else if ( ((LA9_2 >= '0' && LA9_2 <= '3')) ) {
								alt9=1;
							}
							else if ( ((LA9_2 >= '4' && LA9_2 <= '7')) ) {
								alt9=1;
							}
							else if ( ((LA9_2 >= '\u0000' && LA9_2 <= '!')||(LA9_2 >= '#' && LA9_2 <= '&')||(LA9_2 >= '(' && LA9_2 <= '/')||(LA9_2 >= '8' && LA9_2 <= '[')||(LA9_2 >= ']' && LA9_2 <= '`')||(LA9_2 >= 'c' && LA9_2 <= 'd')||(LA9_2 >= 'g' && LA9_2 <= 'm')||(LA9_2 >= 'o' && LA9_2 <= 'q')||LA9_2=='s'||LA9_2=='w'||(LA9_2 >= 'y' && LA9_2 <= '\uFFFF')) ) {
								alt9=2;
							}
							else if ( (LA9_2=='\"'||LA9_2=='\''||(LA9_2 >= 'a' && LA9_2 <= 'b')||(LA9_2 >= 'e' && LA9_2 <= 'f')||LA9_2=='n'||LA9_2=='r'||LA9_2=='t'||LA9_2=='v'||LA9_2=='x') ) {
								alt9=1;
							}

						}
						else if ( ((LA9_0 >= '\u0000' && LA9_0 <= '=')||(LA9_0 >= '?' && LA9_0 <= '[')||(LA9_0 >= ']' && LA9_0 <= '\uFFFF')) ) {
							alt9=2;
						}

						switch (alt9) {
						case 1 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:148:33: ESC_SEQ
							{
							mESC_SEQ(); if (state.failed) return;

							}
							break;
						case 2 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:148:43: ~ ( '>' )
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '=')||(input.LA(1) >= '?' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop9;
						}
					}

					match('>'); if (state.failed) return;
					if ( state.backtracking==0 ) {skip();}
					}
					break;
				case 3 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:149:4: '#' ( WS )* 'include' ( WS )* RAW_IDENTIFIER
					{
					match('#'); if (state.failed) return;
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:149:8: ( WS )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= '\t' && LA10_0 <= '\n')||LA10_0=='\r'||LA10_0==' ') ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
							{
							if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop10;
						}
					}

					match("include"); if (state.failed) return;

					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:149:22: ( WS )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( ((LA11_0 >= '\t' && LA11_0 <= '\n')||LA11_0=='\r'||LA11_0==' ') ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
							{
							if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop11;
						}
					}

					mRAW_IDENTIFIER(); if (state.failed) return;

					if ( state.backtracking==0 ) {skip();}
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INCLUDE"

	// $ANTLR start "MACRO_TEXT"
	public final void mMACRO_TEXT() throws RecognitionException {
		try {
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:174:12: ( ( COMMENT | ( '\\\\' ( '\\r' )? '\\n' ) | (~ ( '\\r' | '\\n' ) ) )* )
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:174:17: ( COMMENT | ( '\\\\' ( '\\r' )? '\\n' ) | (~ ( '\\r' | '\\n' ) ) )*
			{
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:174:17: ( COMMENT | ( '\\\\' ( '\\r' )? '\\n' ) | (~ ( '\\r' | '\\n' ) ) )*
			loop14:
			while (true) {
				int alt14=4;
				alt14 = dfa14.predict(input);
				switch (alt14) {
				case 1 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:174:19: COMMENT
					{
					mCOMMENT(); if (state.failed) return;

					}
					break;
				case 2 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:174:28: ( '\\\\' ( '\\r' )? '\\n' )
					{
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:174:28: ( '\\\\' ( '\\r' )? '\\n' )
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:174:29: '\\\\' ( '\\r' )? '\\n'
					{
					match('\\'); if (state.failed) return;
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:174:34: ( '\\r' )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0=='\r') ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:174:34: '\\r'
							{
							match('\r'); if (state.failed) return;
							}
							break;

					}

					match('\n'); if (state.failed) return;
					}

					}
					break;
				case 3 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:174:48: (~ ( '\\r' | '\\n' ) )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop14;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MACRO_TEXT"

	// $ANTLR start "DIRECTIVE"
	public final void mDIRECTIVE() throws RecognitionException {
		try {
			int _type = DIRECTIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			CommonToken defineMacro=null;
			CommonToken defineArg0=null;
			CommonToken defineArg1=null;
			CommonToken e1=null;
			CommonToken e2=null;
			CommonToken macroText=null;


			    List args = new ArrayList();
			    boolean condition = true;
			    int skipdefine = 0;
			    String arg0Text = "";
			    String arg1Text = "";
			    String definedContent = "";
			    String defineId = "";

			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:206:5: ( ( '#' ( WS )* 'define' ( WS )* ( '\\\\' )? ( WS )* defineMacro= RAW_IDENTIFIER ( ( '(' ( WS )* ( '\\\\' )? ( WS )* ( COMMENT )? ( WS )* (defineArg0= RAW_IDENTIFIER ( WS )? )? ( COMMENT )? ( WS )* ( '\\\\' )? ( WS )* ( ',' ( WS )* ( '\\\\' )? ( WS )* ( COMMENT )? ( WS )* (defineArg1= RAW_IDENTIFIER )? ( WS )? (e1= ELLIPSIS )? ( COMMENT )? )* (e2= ELLIPSIS )? ( COMMENT )? ')' | ' ' | '\\t' | '\\f' | ( '\\\\' ( '\\r' )? '\\n' ) ) ( options {greedy=true; } : ' ' | '\\t' | '\\f' )* macroText= MACRO_TEXT )? ( '\\r' )? '\\n' ) )
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:208:5: ( '#' ( WS )* 'define' ( WS )* ( '\\\\' )? ( WS )* defineMacro= RAW_IDENTIFIER ( ( '(' ( WS )* ( '\\\\' )? ( WS )* ( COMMENT )? ( WS )* (defineArg0= RAW_IDENTIFIER ( WS )? )? ( COMMENT )? ( WS )* ( '\\\\' )? ( WS )* ( ',' ( WS )* ( '\\\\' )? ( WS )* ( COMMENT )? ( WS )* (defineArg1= RAW_IDENTIFIER )? ( WS )? (e1= ELLIPSIS )? ( COMMENT )? )* (e2= ELLIPSIS )? ( COMMENT )? ')' | ' ' | '\\t' | '\\f' | ( '\\\\' ( '\\r' )? '\\n' ) ) ( options {greedy=true; } : ' ' | '\\t' | '\\f' )* macroText= MACRO_TEXT )? ( '\\r' )? '\\n' )
			{
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:208:5: ( '#' ( WS )* 'define' ( WS )* ( '\\\\' )? ( WS )* defineMacro= RAW_IDENTIFIER ( ( '(' ( WS )* ( '\\\\' )? ( WS )* ( COMMENT )? ( WS )* (defineArg0= RAW_IDENTIFIER ( WS )? )? ( COMMENT )? ( WS )* ( '\\\\' )? ( WS )* ( ',' ( WS )* ( '\\\\' )? ( WS )* ( COMMENT )? ( WS )* (defineArg1= RAW_IDENTIFIER )? ( WS )? (e1= ELLIPSIS )? ( COMMENT )? )* (e2= ELLIPSIS )? ( COMMENT )? ')' | ' ' | '\\t' | '\\f' | ( '\\\\' ( '\\r' )? '\\n' ) ) ( options {greedy=true; } : ' ' | '\\t' | '\\f' )* macroText= MACRO_TEXT )? ( '\\r' )? '\\n' )
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:208:6: '#' ( WS )* 'define' ( WS )* ( '\\\\' )? ( WS )* defineMacro= RAW_IDENTIFIER ( ( '(' ( WS )* ( '\\\\' )? ( WS )* ( COMMENT )? ( WS )* (defineArg0= RAW_IDENTIFIER ( WS )? )? ( COMMENT )? ( WS )* ( '\\\\' )? ( WS )* ( ',' ( WS )* ( '\\\\' )? ( WS )* ( COMMENT )? ( WS )* (defineArg1= RAW_IDENTIFIER )? ( WS )? (e1= ELLIPSIS )? ( COMMENT )? )* (e2= ELLIPSIS )? ( COMMENT )? ')' | ' ' | '\\t' | '\\f' | ( '\\\\' ( '\\r' )? '\\n' ) ) ( options {greedy=true; } : ' ' | '\\t' | '\\f' )* macroText= MACRO_TEXT )? ( '\\r' )? '\\n'
			{
			match('#'); if (state.failed) return;
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:208:10: ( WS )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( ((LA15_0 >= '\t' && LA15_0 <= '\n')||LA15_0=='\r'||LA15_0==' ') ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop15;
				}
			}

			match("define"); if (state.failed) return;

			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:208:23: ( WS )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( ((LA16_0 >= '\t' && LA16_0 <= '\n')||LA16_0=='\r'||LA16_0==' ') ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop16;
				}
			}

			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:208:27: ( '\\\\' )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='\\') ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:208:27: '\\\\'
					{
					match('\\'); if (state.failed) return;
					}
					break;

			}

			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:208:33: ( WS )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( ((LA18_0 >= '\t' && LA18_0 <= '\n')||LA18_0=='\r'||LA18_0==' ') ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop18;
				}
			}

			int defineMacroStart262 = getCharIndex();
			int defineMacroStartLine262 = getLine();
			int defineMacroStartCharPos262 = getCharPositionInLine();
			mRAW_IDENTIFIER(); if (state.failed) return;
			defineMacro = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, defineMacroStart262, getCharIndex()-1);
			defineMacro.setLine(defineMacroStartLine262);
			defineMacro.setCharPositionInLine(defineMacroStartCharPos262);

			if ( state.backtracking==0 ) {
			        args.add(""); // first element will hold the macro text
			    }
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:212:9: ( ( '(' ( WS )* ( '\\\\' )? ( WS )* ( COMMENT )? ( WS )* (defineArg0= RAW_IDENTIFIER ( WS )? )? ( COMMENT )? ( WS )* ( '\\\\' )? ( WS )* ( ',' ( WS )* ( '\\\\' )? ( WS )* ( COMMENT )? ( WS )* (defineArg1= RAW_IDENTIFIER )? ( WS )? (e1= ELLIPSIS )? ( COMMENT )? )* (e2= ELLIPSIS )? ( COMMENT )? ')' | ' ' | '\\t' | '\\f' | ( '\\\\' ( '\\r' )? '\\n' ) ) ( options {greedy=true; } : ' ' | '\\t' | '\\f' )* macroText= MACRO_TEXT )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0=='\t'||LA45_0=='\f'||LA45_0==' '||LA45_0=='('||LA45_0=='\\') ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:213:13: ( '(' ( WS )* ( '\\\\' )? ( WS )* ( COMMENT )? ( WS )* (defineArg0= RAW_IDENTIFIER ( WS )? )? ( COMMENT )? ( WS )* ( '\\\\' )? ( WS )* ( ',' ( WS )* ( '\\\\' )? ( WS )* ( COMMENT )? ( WS )* (defineArg1= RAW_IDENTIFIER )? ( WS )? (e1= ELLIPSIS )? ( COMMENT )? )* (e2= ELLIPSIS )? ( COMMENT )? ')' | ' ' | '\\t' | '\\f' | ( '\\\\' ( '\\r' )? '\\n' ) ) ( options {greedy=true; } : ' ' | '\\t' | '\\f' )* macroText= MACRO_TEXT
					{
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:213:13: ( '(' ( WS )* ( '\\\\' )? ( WS )* ( COMMENT )? ( WS )* (defineArg0= RAW_IDENTIFIER ( WS )? )? ( COMMENT )? ( WS )* ( '\\\\' )? ( WS )* ( ',' ( WS )* ( '\\\\' )? ( WS )* ( COMMENT )? ( WS )* (defineArg1= RAW_IDENTIFIER )? ( WS )? (e1= ELLIPSIS )? ( COMMENT )? )* (e2= ELLIPSIS )? ( COMMENT )? ')' | ' ' | '\\t' | '\\f' | ( '\\\\' ( '\\r' )? '\\n' ) )
					int alt43=5;
					switch ( input.LA(1) ) {
					case '(':
						{
						alt43=1;
						}
						break;
					case ' ':
						{
						alt43=2;
						}
						break;
					case '\t':
						{
						alt43=3;
						}
						break;
					case '\f':
						{
						alt43=4;
						}
						break;
					case '\\':
						{
						alt43=5;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 43, 0, input);
						throw nvae;
					}
					switch (alt43) {
						case 1 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:213:15: '(' ( WS )* ( '\\\\' )? ( WS )* ( COMMENT )? ( WS )* (defineArg0= RAW_IDENTIFIER ( WS )? )? ( COMMENT )? ( WS )* ( '\\\\' )? ( WS )* ( ',' ( WS )* ( '\\\\' )? ( WS )* ( COMMENT )? ( WS )* (defineArg1= RAW_IDENTIFIER )? ( WS )? (e1= ELLIPSIS )? ( COMMENT )? )* (e2= ELLIPSIS )? ( COMMENT )? ')'
							{
							match('('); if (state.failed) return;
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:214:18: ( WS )*
							loop19:
							while (true) {
								int alt19=2;
								int LA19_0 = input.LA(1);
								if ( ((LA19_0 >= '\t' && LA19_0 <= '\n')||LA19_0=='\r'||LA19_0==' ') ) {
									alt19=1;
								}

								switch (alt19) {
								case 1 :
									// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
									{
									if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
										input.consume();
										state.failed=false;
									}
									else {
										if (state.backtracking>0) {state.failed=true; return;}
										MismatchedSetException mse = new MismatchedSetException(null,input);
										recover(mse);
										throw mse;
									}
									}
									break;

								default :
									break loop19;
								}
							}

							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:214:22: ( '\\\\' )?
							int alt20=2;
							int LA20_0 = input.LA(1);
							if ( (LA20_0=='\\') ) {
								alt20=1;
							}
							switch (alt20) {
								case 1 :
									// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:214:22: '\\\\'
									{
									match('\\'); if (state.failed) return;
									}
									break;

							}

							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:214:28: ( WS )*
							loop21:
							while (true) {
								int alt21=2;
								int LA21_0 = input.LA(1);
								if ( ((LA21_0 >= '\t' && LA21_0 <= '\n')||LA21_0=='\r'||LA21_0==' ') ) {
									alt21=1;
								}

								switch (alt21) {
								case 1 :
									// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
									{
									if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
										input.consume();
										state.failed=false;
									}
									else {
										if (state.backtracking>0) {state.failed=true; return;}
										MismatchedSetException mse = new MismatchedSetException(null,input);
										recover(mse);
										throw mse;
									}
									}
									break;

								default :
									break loop21;
								}
							}

							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:214:34: ( COMMENT )?
							int alt22=2;
							alt22 = dfa22.predict(input);
							switch (alt22) {
								case 1 :
									// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:214:34: COMMENT
									{
									mCOMMENT(); if (state.failed) return;

									}
									break;

							}

							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:214:43: ( WS )*
							loop23:
							while (true) {
								int alt23=2;
								int LA23_0 = input.LA(1);
								if ( ((LA23_0 >= '\t' && LA23_0 <= '\n')||LA23_0=='\r'||LA23_0==' ') ) {
									alt23=1;
								}

								switch (alt23) {
								case 1 :
									// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
									{
									if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
										input.consume();
										state.failed=false;
									}
									else {
										if (state.backtracking>0) {state.failed=true; return;}
										MismatchedSetException mse = new MismatchedSetException(null,input);
										recover(mse);
										throw mse;
									}
									}
									break;

								default :
									break loop23;
								}
							}

							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:214:49: (defineArg0= RAW_IDENTIFIER ( WS )? )?
							int alt25=2;
							int LA25_0 = input.LA(1);
							if ( ((LA25_0 >= 'A' && LA25_0 <= 'Z')||LA25_0=='_'||(LA25_0 >= 'a' && LA25_0 <= 'z')) ) {
								alt25=1;
							}
							switch (alt25) {
								case 1 :
									// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:214:50: defineArg0= RAW_IDENTIFIER ( WS )?
									{
									int defineArg0Start337 = getCharIndex();
									int defineArg0StartLine337 = getLine();
									int defineArg0StartCharPos337 = getCharPositionInLine();
									mRAW_IDENTIFIER(); if (state.failed) return;
									defineArg0 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, defineArg0Start337, getCharIndex()-1);
									defineArg0.setLine(defineArg0StartLine337);
									defineArg0.setCharPositionInLine(defineArg0StartCharPos337);

									// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:214:76: ( WS )?
									int alt24=2;
									int LA24_0 = input.LA(1);
									if ( ((LA24_0 >= '\t' && LA24_0 <= '\n')||LA24_0=='\r'||LA24_0==' ') ) {
										alt24=1;
									}
									switch (alt24) {
										case 1 :
											// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
											{
											if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
												input.consume();
												state.failed=false;
											}
											else {
												if (state.backtracking>0) {state.failed=true; return;}
												MismatchedSetException mse = new MismatchedSetException(null,input);
												recover(mse);
												throw mse;
											}
											}
											break;

									}

									if ( state.backtracking==0 ) {arg0Text = defineArg0.getText(); args.add(arg0Text);}
									}
									break;

							}

							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:214:139: ( COMMENT )?
							int alt26=2;
							alt26 = dfa26.predict(input);
							switch (alt26) {
								case 1 :
									// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:214:139: COMMENT
									{
									mCOMMENT(); if (state.failed) return;

									}
									break;

							}

							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:214:148: ( WS )*
							loop27:
							while (true) {
								int alt27=2;
								int LA27_0 = input.LA(1);
								if ( ((LA27_0 >= '\t' && LA27_0 <= '\n')||LA27_0=='\r'||LA27_0==' ') ) {
									alt27=1;
								}

								switch (alt27) {
								case 1 :
									// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
									{
									if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
										input.consume();
										state.failed=false;
									}
									else {
										if (state.backtracking>0) {state.failed=true; return;}
										MismatchedSetException mse = new MismatchedSetException(null,input);
										recover(mse);
										throw mse;
									}
									}
									break;

								default :
									break loop27;
								}
							}

							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:214:154: ( '\\\\' )?
							int alt28=2;
							int LA28_0 = input.LA(1);
							if ( (LA28_0=='\\') ) {
								alt28=1;
							}
							switch (alt28) {
								case 1 :
									// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:214:154: '\\\\'
									{
									match('\\'); if (state.failed) return;
									}
									break;

							}

							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:214:160: ( WS )*
							loop29:
							while (true) {
								int alt29=2;
								int LA29_0 = input.LA(1);
								if ( ((LA29_0 >= '\t' && LA29_0 <= '\n')||LA29_0=='\r'||LA29_0==' ') ) {
									alt29=1;
								}

								switch (alt29) {
								case 1 :
									// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
									{
									if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
										input.consume();
										state.failed=false;
									}
									else {
										if (state.backtracking>0) {state.failed=true; return;}
										MismatchedSetException mse = new MismatchedSetException(null,input);
										recover(mse);
										throw mse;
									}
									}
									break;

								default :
									break loop29;
								}
							}

							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:215:17: ( ',' ( WS )* ( '\\\\' )? ( WS )* ( COMMENT )? ( WS )* (defineArg1= RAW_IDENTIFIER )? ( WS )? (e1= ELLIPSIS )? ( COMMENT )? )*
							loop39:
							while (true) {
								int alt39=2;
								int LA39_0 = input.LA(1);
								if ( (LA39_0==',') ) {
									alt39=1;
								}

								switch (alt39) {
								case 1 :
									// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:215:19: ',' ( WS )* ( '\\\\' )? ( WS )* ( COMMENT )? ( WS )* (defineArg1= RAW_IDENTIFIER )? ( WS )? (e1= ELLIPSIS )? ( COMMENT )?
									{
									match(','); if (state.failed) return;
									// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:215:23: ( WS )*
									loop30:
									while (true) {
										int alt30=2;
										int LA30_0 = input.LA(1);
										if ( ((LA30_0 >= '\t' && LA30_0 <= '\n')||LA30_0=='\r'||LA30_0==' ') ) {
											alt30=1;
										}

										switch (alt30) {
										case 1 :
											// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
											{
											if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
												input.consume();
												state.failed=false;
											}
											else {
												if (state.backtracking>0) {state.failed=true; return;}
												MismatchedSetException mse = new MismatchedSetException(null,input);
												recover(mse);
												throw mse;
											}
											}
											break;

										default :
											break loop30;
										}
									}

									// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:215:29: ( '\\\\' )?
									int alt31=2;
									int LA31_0 = input.LA(1);
									if ( (LA31_0=='\\') ) {
										alt31=1;
									}
									switch (alt31) {
										case 1 :
											// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:215:29: '\\\\'
											{
											match('\\'); if (state.failed) return;
											}
											break;

									}

									// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:215:35: ( WS )*
									loop32:
									while (true) {
										int alt32=2;
										int LA32_0 = input.LA(1);
										if ( ((LA32_0 >= '\t' && LA32_0 <= '\n')||LA32_0=='\r'||LA32_0==' ') ) {
											alt32=1;
										}

										switch (alt32) {
										case 1 :
											// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
											{
											if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
												input.consume();
												state.failed=false;
											}
											else {
												if (state.backtracking>0) {state.failed=true; return;}
												MismatchedSetException mse = new MismatchedSetException(null,input);
												recover(mse);
												throw mse;
											}
											}
											break;

										default :
											break loop32;
										}
									}

									// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:215:41: ( COMMENT )?
									int alt33=2;
									alt33 = dfa33.predict(input);
									switch (alt33) {
										case 1 :
											// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:215:41: COMMENT
											{
											mCOMMENT(); if (state.failed) return;

											}
											break;

									}

									// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:215:50: ( WS )*
									loop34:
									while (true) {
										int alt34=2;
										int LA34_0 = input.LA(1);
										if ( ((LA34_0 >= '\t' && LA34_0 <= '\n')||LA34_0=='\r'||LA34_0==' ') ) {
											alt34=1;
										}

										switch (alt34) {
										case 1 :
											// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
											{
											if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
												input.consume();
												state.failed=false;
											}
											else {
												if (state.backtracking>0) {state.failed=true; return;}
												MismatchedSetException mse = new MismatchedSetException(null,input);
												recover(mse);
												throw mse;
											}
											}
											break;

										default :
											break loop34;
										}
									}

									// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:215:66: (defineArg1= RAW_IDENTIFIER )?
									int alt35=2;
									int LA35_0 = input.LA(1);
									if ( ((LA35_0 >= 'A' && LA35_0 <= 'Z')||LA35_0=='_'||(LA35_0 >= 'a' && LA35_0 <= 'z')) ) {
										alt35=1;
									}
									switch (alt35) {
										case 1 :
											// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:215:66: defineArg1= RAW_IDENTIFIER
											{
											int defineArg1Start407 = getCharIndex();
											int defineArg1StartLine407 = getLine();
											int defineArg1StartCharPos407 = getCharPositionInLine();
											mRAW_IDENTIFIER(); if (state.failed) return;
											defineArg1 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, defineArg1Start407, getCharIndex()-1);
											defineArg1.setLine(defineArg1StartLine407);
											defineArg1.setCharPositionInLine(defineArg1StartCharPos407);

											}
											break;

									}

									// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:215:83: ( WS )?
									int alt36=2;
									int LA36_0 = input.LA(1);
									if ( ((LA36_0 >= '\t' && LA36_0 <= '\n')||LA36_0=='\r'||LA36_0==' ') ) {
										alt36=1;
									}
									switch (alt36) {
										case 1 :
											// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
											{
											if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
												input.consume();
												state.failed=false;
											}
											else {
												if (state.backtracking>0) {state.failed=true; return;}
												MismatchedSetException mse = new MismatchedSetException(null,input);
												recover(mse);
												throw mse;
											}
											}
											break;

									}

									if ( state.backtracking==0 ) {if(defineArg1 != null){arg1Text = defineArg1.getText(); args.add(arg1Text);}}
									// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:215:170: (e1= ELLIPSIS )?
									int alt37=2;
									int LA37_0 = input.LA(1);
									if ( (LA37_0=='.') ) {
										int LA37_1 = input.LA(2);
										if ( (LA37_1=='.') ) {
											int LA37_3 = input.LA(3);
											if ( (LA37_3=='.') ) {
												alt37=1;
											}
										}
									}
									switch (alt37) {
										case 1 :
											// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:215:170: e1= ELLIPSIS
											{
											int e1Start420 = getCharIndex();
											int e1StartLine420 = getLine();
											int e1StartCharPos420 = getCharPositionInLine();
											mELLIPSIS(); if (state.failed) return;
											e1 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, e1Start420, getCharIndex()-1);
											e1.setLine(e1StartLine420);
											e1.setCharPositionInLine(e1StartCharPos420);

											}
											break;

									}

									if ( state.backtracking==0 ) {if(e1 != null) flag = 1;}
									// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:215:208: ( COMMENT )?
									int alt38=2;
									alt38 = dfa38.predict(input);
									switch (alt38) {
										case 1 :
											// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:215:208: COMMENT
											{
											mCOMMENT(); if (state.failed) return;

											}
											break;

									}

									}
									break;

								default :
									break loop39;
								}
							}

							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:216:20: (e2= ELLIPSIS )?
							int alt40=2;
							int LA40_0 = input.LA(1);
							if ( (LA40_0=='.') ) {
								alt40=1;
							}
							switch (alt40) {
								case 1 :
									// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:216:20: e2= ELLIPSIS
									{
									int e2Start451 = getCharIndex();
									int e2StartLine451 = getLine();
									int e2StartCharPos451 = getCharPositionInLine();
									mELLIPSIS(); if (state.failed) return;
									e2 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, e2Start451, getCharIndex()-1);
									e2.setLine(e2StartLine451);
									e2.setCharPositionInLine(e2StartCharPos451);

									}
									break;

							}

							if ( state.backtracking==0 ) {if(e2 != null) flag = 1;}
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:216:58: ( COMMENT )?
							int alt41=2;
							int LA41_0 = input.LA(1);
							if ( (LA41_0=='/') ) {
								alt41=1;
							}
							switch (alt41) {
								case 1 :
									// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:216:58: COMMENT
									{
									mCOMMENT(); if (state.failed) return;

									}
									break;

							}

							match(')'); if (state.failed) return;
							}
							break;
						case 2 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:218:15: ' '
							{
							match(' '); if (state.failed) return;
							}
							break;
						case 3 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:218:19: '\\t'
							{
							match('\t'); if (state.failed) return;
							}
							break;
						case 4 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:218:24: '\\f'
							{
							match('\f'); if (state.failed) return;
							}
							break;
						case 5 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:218:29: ( '\\\\' ( '\\r' )? '\\n' )
							{
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:218:29: ( '\\\\' ( '\\r' )? '\\n' )
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:218:30: '\\\\' ( '\\r' )? '\\n'
							{
							match('\\'); if (state.failed) return;
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:218:35: ( '\\r' )?
							int alt42=2;
							int LA42_0 = input.LA(1);
							if ( (LA42_0=='\r') ) {
								alt42=1;
							}
							switch (alt42) {
								case 1 :
									// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:218:35: '\\r'
									{
									match('\r'); if (state.failed) return;
									}
									break;

							}

							match('\n'); if (state.failed) return;
							}

							}
							break;

					}

					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:220:13: ( options {greedy=true; } : ' ' | '\\t' | '\\f' )*
					loop44:
					while (true) {
						int alt44=4;
						switch ( input.LA(1) ) {
						case ' ':
							{
							alt44=1;
							}
							break;
						case '\t':
							{
							alt44=2;
							}
							break;
						case '\f':
							{
							alt44=3;
							}
							break;
						}
						switch (alt44) {
						case 1 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:220:38: ' '
							{
							match(' '); if (state.failed) return;
							}
							break;
						case 2 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:220:42: '\\t'
							{
							match('\t'); if (state.failed) return;
							}
							break;
						case 3 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:220:47: '\\f'
							{
							match('\f'); if (state.failed) return;
							}
							break;

						default :
							break loop44;
						}
					}

					int macroTextStart574 = getCharIndex();
					int macroTextStartLine574 = getLine();
					int macroTextStartCharPos574 = getCharPositionInLine();
					mMACRO_TEXT(); if (state.failed) return;
					macroText = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, macroTextStart574, getCharIndex()-1);
					macroText.setLine(macroTextStartLine574);
					macroText.setCharPositionInLine(macroTextStartCharPos574);

					if ( state.backtracking==0 ) {
					                definedContent = macroText.getText();
					                definedContent = definedContent.replace("\\", ""); // remove mutile line define last's '\'
					                while((definedContent.indexOf("/*")>=0) && (definedContent.indexOf("*/")>=0)){
					                	String comment = definedContent.substring(definedContent.indexOf("/*"),definedContent.indexOf("*/")+2);
					                	definedContent = definedContent.replace(comment, "");
					                }
					                if(definedContent.indexOf("//")>=0){
					                	String comment = definedContent.substring(definedContent.indexOf("//"));
					                	definedContent = definedContent.replace(comment, "");
					                }
					                if(definedContent.contains(defineMacro.getText())){
					                	skipdefine = 1;
					                }
					                //System.out.println(definedContent);
					                args.set(0, definedContent);
					                //System.out.println("MacroText:" + macroText);
					            }
					}
					break;

			}

			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:241:12: ( '\\r' )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0=='\r') ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:241:12: '\\r'
					{
					match('\r'); if (state.failed) return;
					}
					break;

			}

			match('\n'); if (state.failed) return;
			if ( state.backtracking==0 ) {
			    	if((flag == 0) && (skipdefine == 0)){
			    		defineId = defineMacro.getText();
			        	globalDefineMap.put(defineId, args );
			        	skip();
			    	}
			    	else{
			    		skip();
			    	}
			    	flag = 0;
			    	
			        
			         
			        //process the define content, to check whether it contain the previous define
			        //if yes, then process it
			 
			        // // save current lexer's state
			        // SaveStruct ss = new SaveStruct(input);
			        // includes.push(ss);
			        // // switch on new input stream
			        // setCharStream(new ANTLRStringStream(definedContent));
			        // reset();
			         
			        // isReplacingDefineContent = true;
			    }
			}

			}

			state.type = _type;
			state.channel = _channel;
			if ( state.backtracking==0 ) {
			//SETTEXT(GETTEXT()->substring(GETTEXT(),1,GETTEXT()->len-1))
			//String processedTokenStr = GETTEXT();
			//String processedTokenStr = state.text;
			//String processedTokenStr = getText();
			//String processedTokenStr = this.getText();
			//System.out.println("after process, whole token string is" + processedTokenStr);
			 
			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIRECTIVE"

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			CommonToken identifier=null;
			CommonToken callArg0=null;
			CommonToken callArg1=null;


			    List define = new ArrayList();
			    List foundArgs = new ArrayList();
			    int notdefine = 0;
			    String callArg0Text = "";
			    String callArg1Text = "";

			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:306:5: (identifier= RAW_IDENTIFIER ( ({...}? => ( WS | COMMENT )? ( '(' ( WS )* callArg0= EXPR ( COMMA callArg1= EXPR )* ( WS )* ')' )? ) | ({...}? =>) ) )
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:307:5: identifier= RAW_IDENTIFIER ( ({...}? => ( WS | COMMENT )? ( '(' ( WS )* callArg0= EXPR ( COMMA callArg1= EXPR )* ( WS )* ')' )? ) | ({...}? =>) )
			{
			int identifierStart633 = getCharIndex();
			int identifierStartLine633 = getLine();
			int identifierStartCharPos633 = getCharPositionInLine();
			mRAW_IDENTIFIER(); if (state.failed) return;
			identifier = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, identifierStart633, getCharIndex()-1);
			identifier.setLine(identifierStartLine633);
			identifier.setCharPositionInLine(identifierStartCharPos633);

			if ( state.backtracking==0 ) {
			    
			        String IdText = (String)identifier.getText();
			        if(!IdText.equals("defined")){
			       	//System.out.println(order + "----" + IdText);
			     	order += 1;
			        // see if this is a macro arguument
			        define = (List)globalDefineArgsMap.get(IdText);
			        while(define != null)
			        {
			            //if define not null, then find recursively to get para's real value
			            String firstParaValue = (String)define.get(0);
			            //System.out.println(order + "----" + "macro argument: " + firstParaValue);
			            order += 1;
			            if(globalDefineArgsMap.containsKey(firstParaValue))
			            {
			                define = (List)globalDefineArgsMap.get(firstParaValue);
			                //if(firstParaValue.equals((String)define.get(0))){break;}
			                break;
			            }
			            else
			            {
			                break;
			            }
			        }
			         
			        if (define==null) {
			            // see if this is a macro call
			            define = (List)globalDefineMap.get(IdText);
			            if((define!=null) &&(define.size()>1)&&(inexpr == 1)){
			            	define = null;
			            }
			              
			        }
			        }
			        else{
			        define = null;
			        defined = 1;
			        }
			        //System.out.println("defined0:" + defined);
			    	
			    }
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:350:5: ( ({...}? => ( WS | COMMENT )? ( '(' ( WS )* callArg0= EXPR ( COMMA callArg1= EXPR )* ( WS )* ')' )? ) | ({...}? =>) )
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( ((LA52_0 >= '\t' && LA52_0 <= '\n')||LA52_0=='\r'||LA52_0==' '||LA52_0=='('||LA52_0=='/') && (((define!=null) && (define.size()>1)))) {
				alt52=1;
			}
			else if ( (((define!=null) && (define.size()>1))) ) {
				alt52=1;
			}
			else if ( ((!((define!=null) && (define.size()>1)))) ) {
				alt52=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}

			switch (alt52) {
				case 1 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:351:6: ({...}? => ( WS | COMMENT )? ( '(' ( WS )* callArg0= EXPR ( COMMA callArg1= EXPR )* ( WS )* ')' )? )
					{
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:351:6: ({...}? => ( WS | COMMENT )? ( '(' ( WS )* callArg0= EXPR ( COMMA callArg1= EXPR )* ( WS )* ')' )? )
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:351:7: {...}? => ( WS | COMMENT )? ( '(' ( WS )* callArg0= EXPR ( COMMA callArg1= EXPR )* ( WS )* ')' )?
					{
					if ( !(((define!=null) && (define.size()>1))) ) {
						if (state.backtracking>0) {state.failed=true; return;}
						throw new FailedPredicateException(input, "IDENTIFIER", "(define!=null) && (define.size()>1)");
					}
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:351:48: ( WS | COMMENT )?
					int alt47=3;
					int LA47_0 = input.LA(1);
					if ( ((LA47_0 >= '\t' && LA47_0 <= '\n')||LA47_0=='\r'||LA47_0==' ') ) {
						alt47=1;
					}
					else if ( (LA47_0=='/') ) {
						alt47=2;
					}
					switch (alt47) {
						case 1 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:351:49: WS
							{
							mWS(); if (state.failed) return;

							}
							break;
						case 2 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:351:52: COMMENT
							{
							mCOMMENT(); if (state.failed) return;

							}
							break;

					}

					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:353:9: ( '(' ( WS )* callArg0= EXPR ( COMMA callArg1= EXPR )* ( WS )* ')' )?
					int alt51=2;
					int LA51_0 = input.LA(1);
					if ( (LA51_0=='(') ) {
						alt51=1;
					}
					switch (alt51) {
						case 1 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:353:10: '(' ( WS )* callArg0= EXPR ( COMMA callArg1= EXPR )* ( WS )* ')'
							{
							match('('); if (state.failed) return;
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:354:9: ( WS )*
							loop48:
							while (true) {
								int alt48=2;
								int LA48_0 = input.LA(1);
								if ( ((LA48_0 >= '\t' && LA48_0 <= '\n')||LA48_0=='\r'||LA48_0==' ') ) {
									alt48=1;
								}

								switch (alt48) {
								case 1 :
									// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
									{
									if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
										input.consume();
										state.failed=false;
									}
									else {
										if (state.backtracking>0) {state.failed=true; return;}
										MismatchedSetException mse = new MismatchedSetException(null,input);
										recover(mse);
										throw mse;
									}
									}
									break;

								default :
									break loop48;
								}
							}

							int callArg0Start697 = getCharIndex();
							int callArg0StartLine697 = getLine();
							int callArg0StartCharPos697 = getCharPositionInLine();
							mEXPR(); if (state.failed) return;
							callArg0 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, callArg0Start697, getCharIndex()-1);
							callArg0.setLine(callArg0StartLine697);
							callArg0.setCharPositionInLine(callArg0StartCharPos697);

							if ( state.backtracking==0 ) {
							            inexpr = 0;
							            callArg0Text = callArg0.getText().trim();
							            List v = new ArrayList();
							            List d = new ArrayList();
							            v = (List)globalDefineArgsMap.get(callArg0Text);
							            if(v != null){
							            	callArg0Text = (String)v.get(0);
							            }
							            else{
							            	d = (List)globalDefineMap.get(callArg0Text);
							            	if(d != null){
							            	  callArg0Text = (String)d.get(0);
							            	}
							            }
							            //System.out.println(order + "----EXPR0:" + callArg0Text);
							            order += 1;
							            //foundArgs.add(callArg0Text);
							            //maybe whitespace, so need trim here
							            //if(!callArg0Text.isEmpty() && !callArg0Text.trim().isEmpty())
							            //{
							                foundArgs.add(callArg0Text);
							            //}
							        }
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:379:9: ( COMMA callArg1= EXPR )*
							loop49:
							while (true) {
								int alt49=2;
								int LA49_0 = input.LA(1);
								if ( (LA49_0==',') ) {
									alt49=1;
								}

								switch (alt49) {
								case 1 :
									// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:379:11: COMMA callArg1= EXPR
									{
									mCOMMA(); if (state.failed) return;

									int callArg1Start723 = getCharIndex();
									int callArg1StartLine723 = getLine();
									int callArg1StartCharPos723 = getCharPositionInLine();
									mEXPR(); if (state.failed) return;
									callArg1 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, callArg1Start723, getCharIndex()-1);
									callArg1.setLine(callArg1StartLine723);
									callArg1.setCharPositionInLine(callArg1StartCharPos723);

									if ( state.backtracking==0 ) {
									       	    inexpr = 0;
									            callArg1Text = callArg1.getText().trim();
									            //System.out.println("EXPR1length:" + callArg1Text.length());
									            List v = new ArrayList();
									            List d = new ArrayList();
									            
									            v = (List)globalDefineArgsMap.get(callArg1Text);
									            if(v != null){
									            	callArg1Text = (String)v.get(0);
									            }
									            else{
									            	d = (List)globalDefineMap.get(callArg1Text);
									            	//System.out.println(d);
									            	if(d != null){
									            	  callArg1Text = (String)d.get(0);
									            	}
									            }
									            
									            //System.out.println(order + "----EXPR1:" + callArg1Text);
									            order += 1;
									            //System.out.println("identifier:" + identifier);
									            //System.out.println(callArg1Text);
									            //foundArgs.add(callArg1Text);
									            //maybe whitespace, so need trim here
									            //if(!callArg1Text.isEmpty() && !callArg1Text.trim().isEmpty())
									            //{
									                foundArgs.add(callArg1Text);
									            //}
									        }
									}
									break;

								default :
									break loop49;
								}
							}

							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:411:9: ( WS )*
							loop50:
							while (true) {
								int alt50=2;
								int LA50_0 = input.LA(1);
								if ( ((LA50_0 >= '\t' && LA50_0 <= '\n')||LA50_0=='\r'||LA50_0==' ') ) {
									alt50=1;
								}

								switch (alt50) {
								case 1 :
									// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
									{
									if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
										input.consume();
										state.failed=false;
									}
									else {
										if (state.backtracking>0) {state.failed=true; return;}
										MismatchedSetException mse = new MismatchedSetException(null,input);
										recover(mse);
										throw mse;
									}
									}
									break;

								default :
									break loop50;
								}
							}

							match(')'); if (state.failed) return;
							}
							break;

					}

					if ( state.backtracking==0 ) {
					        	if(foundArgs.size() == 0){
					        		notdefine = 1;
					        	}
					        	else{
					        	if((define!=null) && (foundArgs.size()!=define.size()-1)){
					        		define = null;
					        	}
					        	}
					        }
					}

					}
					break;
				case 2 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:422:9: ({...}? =>)
					{
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:422:9: ({...}? =>)
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:422:10: {...}? =>
					{
					if ( !((!((define!=null) && (define.size()>1)))) ) {
						if (state.backtracking>0) {state.failed=true; return;}
						throw new FailedPredicateException(input, "IDENTIFIER", "!((define!=null) && (define.size()>1))");
					}
					}

					}
					break;

			}

			if ( state.backtracking==0 ) {
			if(notdefine == 0){
			if (define!=null) {
			    String defineText = (String)define.get(0);
			    //System.out.println("defineText:"+ defineText);
			    //System.out.println("defined1:" + defined);
			    if(defined == 1){
			    	defined = 0;
			    }
			    else{
			    	 if (define.size()==1) {
			    	 setText(defineText);
			        //only have one value in list -> the defineText is the define para content -> just need replace directly  
			        } else {
			        //add new dict pair: (para, call value)
				        for (int i=0;i<foundArgs.size();++i) {
				            // treat macro arguments similar to local defines
				            List arg = new ArrayList();
				            arg.add((String)foundArgs.get(i));
				            globalDefineArgsMap.put( (String)define.get(1+i), arg );
				        }
				 
				        // save current lexer's state
				        SaveStruct ss = new SaveStruct(input);
				        includes.push(ss);
				 
				        // switch on new input stream
				        setCharStream(new ANTLRStringStream(defineText));
				        reset();
			    	}
			    }
			   
			}
			}

			}
			}

			state.type = _type;
			state.channel = _channel;
			if ( state.backtracking==0 ) {
			//String curCallParaText = getText();
			//  if(foundArgs.size() == 0)
			//  {
			//      //remove () if no para
			//      setText("");
			//  }
			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENTIFIER"

	// $ANTLR start "RAW_IDENTIFIER"
	public final void mRAW_IDENTIFIER() throws RecognitionException {
		try {
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:464:25: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:464:27: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:464:51: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			loop53:
			while (true) {
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( ((LA53_0 >= '0' && LA53_0 <= '9')||(LA53_0 >= 'A' && LA53_0 <= 'Z')||LA53_0=='_'||(LA53_0 >= 'a' && LA53_0 <= 'z')) ) {
					alt53=1;
				}

				switch (alt53) {
				case 1 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop53;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RAW_IDENTIFIER"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:466:8: ( ( '0' .. '9' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' )* )
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:466:10: ( '0' .. '9' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' )*
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:466:21: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' )*
			loop54:
			while (true) {
				int alt54=2;
				int LA54_0 = input.LA(1);
				if ( ((LA54_0 >= '0' && LA54_0 <= '9')||(LA54_0 >= 'A' && LA54_0 <= 'Z')||LA54_0=='_'||(LA54_0 >= 'a' && LA54_0 <= 'z')) ) {
					alt54=1;
				}

				switch (alt54) {
				case 1 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop54;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "LEFT"
	public final void mLEFT() throws RecognitionException {
		try {
			int _type = LEFT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:469:7: ( '(' | '[' | '{' )
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
			{
			if ( input.LA(1)=='('||input.LA(1)=='['||input.LA(1)=='{' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEFT"

	// $ANTLR start "RIGHT"
	public final void mRIGHT() throws RecognitionException {
		try {
			int _type = RIGHT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:470:7: ( ')' | ']' | '}' )
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
			{
			if ( input.LA(1)==')'||input.LA(1)==']'||input.LA(1)=='}' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RIGHT"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:471:7: ( ',' )
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:471:9: ','
			{
			match(','); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "OPERATOR"
	public final void mOPERATOR() throws RecognitionException {
		try {
			int _type = OPERATOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:472:10: ( '#' | '!' | '$' | '%' | '&' | '*' | '+' | '-' | '.' | '/' | ':' | ';' | '<' | '=' | '>' | '?' | '@' | '\\\\' | '^' | '`' | '|' | '~' | '\\'' | '<<' | '>>' | '!=' | '<=' | '>=' | '+=' | '*=' | '&=' | '-=' | '/=' | '%=' | '^=' | '&&' | '||' )
			int alt55=37;
			switch ( input.LA(1) ) {
			case '#':
				{
				alt55=1;
				}
				break;
			case '!':
				{
				int LA55_2 = input.LA(2);
				if ( (LA55_2=='=') ) {
					alt55=26;
				}

				else {
					alt55=2;
				}

				}
				break;
			case '$':
				{
				alt55=3;
				}
				break;
			case '%':
				{
				int LA55_4 = input.LA(2);
				if ( (LA55_4=='=') ) {
					alt55=34;
				}

				else {
					alt55=4;
				}

				}
				break;
			case '&':
				{
				switch ( input.LA(2) ) {
				case '=':
					{
					alt55=31;
					}
					break;
				case '&':
					{
					alt55=36;
					}
					break;
				default:
					alt55=5;
				}
				}
				break;
			case '*':
				{
				int LA55_6 = input.LA(2);
				if ( (LA55_6=='=') ) {
					alt55=30;
				}

				else {
					alt55=6;
				}

				}
				break;
			case '+':
				{
				int LA55_7 = input.LA(2);
				if ( (LA55_7=='=') ) {
					alt55=29;
				}

				else {
					alt55=7;
				}

				}
				break;
			case '-':
				{
				int LA55_8 = input.LA(2);
				if ( (LA55_8=='=') ) {
					alt55=32;
				}

				else {
					alt55=8;
				}

				}
				break;
			case '.':
				{
				alt55=9;
				}
				break;
			case '/':
				{
				int LA55_10 = input.LA(2);
				if ( (LA55_10=='=') ) {
					alt55=33;
				}

				else {
					alt55=10;
				}

				}
				break;
			case ':':
				{
				alt55=11;
				}
				break;
			case ';':
				{
				alt55=12;
				}
				break;
			case '<':
				{
				switch ( input.LA(2) ) {
				case '<':
					{
					alt55=24;
					}
					break;
				case '=':
					{
					alt55=27;
					}
					break;
				default:
					alt55=13;
				}
				}
				break;
			case '=':
				{
				alt55=14;
				}
				break;
			case '>':
				{
				switch ( input.LA(2) ) {
				case '>':
					{
					alt55=25;
					}
					break;
				case '=':
					{
					alt55=28;
					}
					break;
				default:
					alt55=15;
				}
				}
				break;
			case '?':
				{
				alt55=16;
				}
				break;
			case '@':
				{
				alt55=17;
				}
				break;
			case '\\':
				{
				alt55=18;
				}
				break;
			case '^':
				{
				int LA55_19 = input.LA(2);
				if ( (LA55_19=='=') ) {
					alt55=35;
				}

				else {
					alt55=19;
				}

				}
				break;
			case '`':
				{
				alt55=20;
				}
				break;
			case '|':
				{
				int LA55_21 = input.LA(2);
				if ( (LA55_21=='|') ) {
					alt55=37;
				}

				else {
					alt55=21;
				}

				}
				break;
			case '~':
				{
				alt55=22;
				}
				break;
			case '\'':
				{
				alt55=23;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}
			switch (alt55) {
				case 1 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:472:12: '#'
					{
					match('#'); if (state.failed) return;
					}
					break;
				case 2 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:472:18: '!'
					{
					match('!'); if (state.failed) return;
					}
					break;
				case 3 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:472:24: '$'
					{
					match('$'); if (state.failed) return;
					}
					break;
				case 4 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:472:30: '%'
					{
					match('%'); if (state.failed) return;
					}
					break;
				case 5 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:472:36: '&'
					{
					match('&'); if (state.failed) return;
					}
					break;
				case 6 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:472:42: '*'
					{
					match('*'); if (state.failed) return;
					}
					break;
				case 7 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:472:48: '+'
					{
					match('+'); if (state.failed) return;
					}
					break;
				case 8 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:472:54: '-'
					{
					match('-'); if (state.failed) return;
					}
					break;
				case 9 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:472:60: '.'
					{
					match('.'); if (state.failed) return;
					}
					break;
				case 10 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:472:66: '/'
					{
					match('/'); if (state.failed) return;
					}
					break;
				case 11 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:472:72: ':'
					{
					match(':'); if (state.failed) return;
					}
					break;
				case 12 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:472:78: ';'
					{
					match(';'); if (state.failed) return;
					}
					break;
				case 13 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:472:84: '<'
					{
					match('<'); if (state.failed) return;
					}
					break;
				case 14 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:472:90: '='
					{
					match('='); if (state.failed) return;
					}
					break;
				case 15 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:472:96: '>'
					{
					match('>'); if (state.failed) return;
					}
					break;
				case 16 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:472:102: '?'
					{
					match('?'); if (state.failed) return;
					}
					break;
				case 17 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:472:108: '@'
					{
					match('@'); if (state.failed) return;
					}
					break;
				case 18 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:472:114: '\\\\'
					{
					match('\\'); if (state.failed) return;
					}
					break;
				case 19 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:472:121: '^'
					{
					match('^'); if (state.failed) return;
					}
					break;
				case 20 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:472:127: '`'
					{
					match('`'); if (state.failed) return;
					}
					break;
				case 21 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:472:133: '|'
					{
					match('|'); if (state.failed) return;
					}
					break;
				case 22 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:472:139: '~'
					{
					match('~'); if (state.failed) return;
					}
					break;
				case 23 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:472:145: '\\''
					{
					match('\''); if (state.failed) return;
					}
					break;
				case 24 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:473:5: '<<'
					{
					match("<<"); if (state.failed) return;

					}
					break;
				case 25 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:473:12: '>>'
					{
					match(">>"); if (state.failed) return;

					}
					break;
				case 26 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:473:19: '!='
					{
					match("!="); if (state.failed) return;

					}
					break;
				case 27 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:473:26: '<='
					{
					match("<="); if (state.failed) return;

					}
					break;
				case 28 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:473:33: '>='
					{
					match(">="); if (state.failed) return;

					}
					break;
				case 29 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:473:40: '+='
					{
					match("+="); if (state.failed) return;

					}
					break;
				case 30 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:473:47: '*='
					{
					match("*="); if (state.failed) return;

					}
					break;
				case 31 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:473:54: '&='
					{
					match("&="); if (state.failed) return;

					}
					break;
				case 32 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:473:61: '-='
					{
					match("-="); if (state.failed) return;

					}
					break;
				case 33 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:473:68: '/='
					{
					match("/="); if (state.failed) return;

					}
					break;
				case 34 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:473:75: '%='
					{
					match("%="); if (state.failed) return;

					}
					break;
				case 35 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:473:82: '^='
					{
					match("^="); if (state.failed) return;

					}
					break;
				case 36 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:473:89: '&&'
					{
					match("&&"); if (state.failed) return;

					}
					break;
				case 37 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:473:96: '||'
					{
					match("||"); if (state.failed) return;

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPERATOR"

	// $ANTLR start "ELLIPSIS"
	public final void mELLIPSIS() throws RecognitionException {
		try {
			int _type = ELLIPSIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:477:9: ( '...' )
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:477:11: '...'
			{
			match("..."); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELLIPSIS"

	// $ANTLR start "TWODOT"
	public final void mTWODOT() throws RecognitionException {
		try {
			int _type = TWODOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:478:8: ( '..' )
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:478:10: '..'
			{
			match(".."); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TWODOT"

	// $ANTLR start "EXPR"
	public final void mEXPR() throws RecognitionException {
		try {

			    inexpr = 1;

			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:485:6: ( ( WS )? ( options {backtrack=true; } : ( NUMBER | IDENTIFIER ) )? ( WS )* ( ( LEFT EXPR ( COMMA EXPR )* RIGHT | STRING | OPERATOR | IDENTIFIER | NUMBER ) EXPR )? )
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:486:7: ( WS )? ( options {backtrack=true; } : ( NUMBER | IDENTIFIER ) )? ( WS )* ( ( LEFT EXPR ( COMMA EXPR )* RIGHT | STRING | OPERATOR | IDENTIFIER | NUMBER ) EXPR )?
			{
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:486:7: ( WS )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( ((LA56_0 >= '\t' && LA56_0 <= '\n')||LA56_0=='\r'||LA56_0==' ') ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:486:13: ( options {backtrack=true; } : ( NUMBER | IDENTIFIER ) )?
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( ((LA58_0 >= '0' && LA58_0 <= '9')) ) {
				int LA58_1 = input.LA(2);
				if ( (synpred1_preprocess()) ) {
					alt58=1;
				}
			}
			else if ( ((LA58_0 >= 'A' && LA58_0 <= 'Z')||LA58_0=='_'||(LA58_0 >= 'a' && LA58_0 <= 'z')) ) {
				int LA58_2 = input.LA(2);
				if ( (synpred1_preprocess()) ) {
					alt58=1;
				}
			}
			switch (alt58) {
				case 1 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:486:39: ( NUMBER | IDENTIFIER )
					{
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:486:39: ( NUMBER | IDENTIFIER )
					int alt57=2;
					int LA57_0 = input.LA(1);
					if ( ((LA57_0 >= '0' && LA57_0 <= '9')) ) {
						alt57=1;
					}
					else if ( ((LA57_0 >= 'A' && LA57_0 <= 'Z')||LA57_0=='_'||(LA57_0 >= 'a' && LA57_0 <= 'z')) ) {
						alt57=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 57, 0, input);
						throw nvae;
					}

					switch (alt57) {
						case 1 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:486:40: NUMBER
							{
							mNUMBER(); if (state.failed) return;

							}
							break;
						case 2 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:486:47: IDENTIFIER
							{
							mIDENTIFIER(); if (state.failed) return;

							}
							break;

					}

					}
					break;

			}

			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:486:61: ( WS )*
			loop59:
			while (true) {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( ((LA59_0 >= '\t' && LA59_0 <= '\n')||LA59_0=='\r'||LA59_0==' ') ) {
					alt59=1;
				}

				switch (alt59) {
				case 1 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop59;
				}
			}

			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:487:13: ( ( LEFT EXPR ( COMMA EXPR )* RIGHT | STRING | OPERATOR | IDENTIFIER | NUMBER ) EXPR )?
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( ((LA62_0 >= '!' && LA62_0 <= '(')||(LA62_0 >= '*' && LA62_0 <= '+')||(LA62_0 >= '-' && LA62_0 <= '\\')||(LA62_0 >= '^' && LA62_0 <= '|')||LA62_0=='~') ) {
				alt62=1;
			}
			switch (alt62) {
				case 1 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:488:25: ( LEFT EXPR ( COMMA EXPR )* RIGHT | STRING | OPERATOR | IDENTIFIER | NUMBER ) EXPR
					{
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:488:25: ( LEFT EXPR ( COMMA EXPR )* RIGHT | STRING | OPERATOR | IDENTIFIER | NUMBER )
					int alt61=5;
					switch ( input.LA(1) ) {
					case '(':
					case '[':
					case '{':
						{
						alt61=1;
						}
						break;
					case '\"':
						{
						alt61=2;
						}
						break;
					case '!':
					case '#':
					case '$':
					case '%':
					case '&':
					case '\'':
					case '*':
					case '+':
					case '-':
					case '.':
					case '/':
					case ':':
					case ';':
					case '<':
					case '=':
					case '>':
					case '?':
					case '@':
					case '\\':
					case '^':
					case '`':
					case '|':
					case '~':
						{
						alt61=3;
						}
						break;
					case 'A':
					case 'B':
					case 'C':
					case 'D':
					case 'E':
					case 'F':
					case 'G':
					case 'H':
					case 'I':
					case 'J':
					case 'K':
					case 'L':
					case 'M':
					case 'N':
					case 'O':
					case 'P':
					case 'Q':
					case 'R':
					case 'S':
					case 'T':
					case 'U':
					case 'V':
					case 'W':
					case 'X':
					case 'Y':
					case 'Z':
					case '_':
					case 'a':
					case 'b':
					case 'c':
					case 'd':
					case 'e':
					case 'f':
					case 'g':
					case 'h':
					case 'i':
					case 'j':
					case 'k':
					case 'l':
					case 'm':
					case 'n':
					case 'o':
					case 'p':
					case 'q':
					case 'r':
					case 's':
					case 't':
					case 'u':
					case 'v':
					case 'w':
					case 'x':
					case 'y':
					case 'z':
						{
						alt61=4;
						}
						break;
					case '0':
					case '1':
					case '2':
					case '3':
					case '4':
					case '5':
					case '6':
					case '7':
					case '8':
					case '9':
						{
						alt61=5;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 61, 0, input);
						throw nvae;
					}
					switch (alt61) {
						case 1 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:488:27: LEFT EXPR ( COMMA EXPR )* RIGHT
							{
							mLEFT(); if (state.failed) return;

							mEXPR(); if (state.failed) return;

							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:488:37: ( COMMA EXPR )*
							loop60:
							while (true) {
								int alt60=2;
								int LA60_0 = input.LA(1);
								if ( (LA60_0==',') ) {
									alt60=1;
								}

								switch (alt60) {
								case 1 :
									// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:488:39: COMMA EXPR
									{
									mCOMMA(); if (state.failed) return;

									mEXPR(); if (state.failed) return;

									}
									break;

								default :
									break loop60;
								}
							}

							mRIGHT(); if (state.failed) return;

							}
							break;
						case 2 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:489:15: STRING
							{
							mSTRING(); if (state.failed) return;

							}
							break;
						case 3 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:490:15: OPERATOR
							{
							mOPERATOR(); if (state.failed) return;

							}
							break;
						case 4 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:491:15: IDENTIFIER
							{
							mIDENTIFIER(); if (state.failed) return;

							}
							break;
						case 5 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:492:15: NUMBER
							{
							mNUMBER(); if (state.failed) return;

							}
							break;

					}

					mEXPR(); if (state.failed) return;

					}
					break;

			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPR"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:502:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt69=3;
			alt69 = dfa69.predict(input);
			switch (alt69) {
				case 1 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:502:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:502:9: ( '0' .. '9' )+
					int cnt63=0;
					loop63:
					while (true) {
						int alt63=2;
						int LA63_0 = input.LA(1);
						if ( ((LA63_0 >= '0' && LA63_0 <= '9')) ) {
							alt63=1;
						}

						switch (alt63) {
						case 1 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt63 >= 1 ) break loop63;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(63, input);
							throw eee;
						}
						cnt63++;
					}

					match('.'); if (state.failed) return;
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:502:25: ( '0' .. '9' )*
					loop64:
					while (true) {
						int alt64=2;
						int LA64_0 = input.LA(1);
						if ( ((LA64_0 >= '0' && LA64_0 <= '9')) ) {
							alt64=1;
						}

						switch (alt64) {
						case 1 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop64;
						}
					}

					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:502:37: ( EXPONENT )?
					int alt65=2;
					int LA65_0 = input.LA(1);
					if ( (LA65_0=='E'||LA65_0=='e') ) {
						alt65=1;
					}
					switch (alt65) {
						case 1 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:502:37: EXPONENT
							{
							mEXPONENT(); if (state.failed) return;

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:503:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					match('.'); if (state.failed) return;
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:503:13: ( '0' .. '9' )+
					int cnt66=0;
					loop66:
					while (true) {
						int alt66=2;
						int LA66_0 = input.LA(1);
						if ( ((LA66_0 >= '0' && LA66_0 <= '9')) ) {
							alt66=1;
						}

						switch (alt66) {
						case 1 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt66 >= 1 ) break loop66;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(66, input);
							throw eee;
						}
						cnt66++;
					}

					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:503:25: ( EXPONENT )?
					int alt67=2;
					int LA67_0 = input.LA(1);
					if ( (LA67_0=='E'||LA67_0=='e') ) {
						alt67=1;
					}
					switch (alt67) {
						case 1 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:503:25: EXPONENT
							{
							mEXPONENT(); if (state.failed) return;

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:504:9: ( '0' .. '9' )+ EXPONENT
					{
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:504:9: ( '0' .. '9' )+
					int cnt68=0;
					loop68:
					while (true) {
						int alt68=2;
						int LA68_0 = input.LA(1);
						if ( ((LA68_0 >= '0' && LA68_0 <= '9')) ) {
							alt68=1;
						}

						switch (alt68) {
						case 1 :
							// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt68 >= 1 ) break loop68;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(68, input);
							throw eee;
						}
						cnt68++;
					}

					mEXPONENT(); if (state.failed) return;

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:507:5: ( ' ' | '\\t' | '\\r' | '\\n' )
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:517:5: ( '\"' ( ESC_SEQ |~ ( '\"' ) )* '\"' )
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:517:8: '\"' ( ESC_SEQ |~ ( '\"' ) )* '\"'
			{
			match('\"'); if (state.failed) return;
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:517:12: ( ESC_SEQ |~ ( '\"' ) )*
			loop70:
			while (true) {
				int alt70=3;
				int LA70_0 = input.LA(1);
				if ( (LA70_0=='\\') ) {
					int LA70_2 = input.LA(2);
					if ( (LA70_2=='\"') ) {
						int LA70_4 = input.LA(3);
						if ( ((LA70_4 >= '\u0000' && LA70_4 <= '\uFFFF')) ) {
							alt70=1;
						}
						else {
							alt70=2;
						}

					}
					else if ( (LA70_2=='u') ) {
						int LA70_5 = input.LA(3);
						if ( ((LA70_5 >= '0' && LA70_5 <= '9')||(LA70_5 >= 'A' && LA70_5 <= 'F')||(LA70_5 >= 'a' && LA70_5 <= 'f')) ) {
							int LA70_10 = input.LA(4);
							if ( ((LA70_10 >= '0' && LA70_10 <= '9')||(LA70_10 >= 'A' && LA70_10 <= 'F')||(LA70_10 >= 'a' && LA70_10 <= 'f')) ) {
								int LA70_11 = input.LA(5);
								if ( ((LA70_11 >= '0' && LA70_11 <= '9')||(LA70_11 >= 'A' && LA70_11 <= 'F')||(LA70_11 >= 'a' && LA70_11 <= 'f')) ) {
									int LA70_12 = input.LA(6);
									if ( ((LA70_12 >= '0' && LA70_12 <= '9')||(LA70_12 >= 'A' && LA70_12 <= 'F')||(LA70_12 >= 'a' && LA70_12 <= 'f')) ) {
										alt70=1;
									}
									else if ( ((LA70_12 >= '\u0000' && LA70_12 <= '/')||(LA70_12 >= ':' && LA70_12 <= '@')||(LA70_12 >= 'G' && LA70_12 <= '`')||(LA70_12 >= 'g' && LA70_12 <= '\uFFFF')) ) {
										alt70=2;
									}

								}
								else if ( ((LA70_11 >= '\u0000' && LA70_11 <= '/')||(LA70_11 >= ':' && LA70_11 <= '@')||(LA70_11 >= 'G' && LA70_11 <= '`')||(LA70_11 >= 'g' && LA70_11 <= '\uFFFF')) ) {
									alt70=2;
								}

							}
							else if ( ((LA70_10 >= '\u0000' && LA70_10 <= '/')||(LA70_10 >= ':' && LA70_10 <= '@')||(LA70_10 >= 'G' && LA70_10 <= '`')||(LA70_10 >= 'g' && LA70_10 <= '\uFFFF')) ) {
								alt70=2;
							}

						}
						else if ( ((LA70_5 >= '\u0000' && LA70_5 <= '/')||(LA70_5 >= ':' && LA70_5 <= '@')||(LA70_5 >= 'G' && LA70_5 <= '`')||(LA70_5 >= 'g' && LA70_5 <= '\uFFFF')) ) {
							alt70=2;
						}

					}
					else if ( ((LA70_2 >= '0' && LA70_2 <= '3')) ) {
						alt70=1;
					}
					else if ( ((LA70_2 >= '4' && LA70_2 <= '7')) ) {
						alt70=1;
					}
					else if ( (LA70_2=='\\') ) {
						alt70=1;
					}
					else if ( (LA70_2=='\''||(LA70_2 >= 'a' && LA70_2 <= 'b')||(LA70_2 >= 'e' && LA70_2 <= 'f')||LA70_2=='n'||LA70_2=='r'||LA70_2=='t'||LA70_2=='v'||LA70_2=='x') ) {
						alt70=1;
					}
					else if ( ((LA70_2 >= '\u0000' && LA70_2 <= '!')||(LA70_2 >= '#' && LA70_2 <= '&')||(LA70_2 >= '(' && LA70_2 <= '/')||(LA70_2 >= '8' && LA70_2 <= '[')||(LA70_2 >= ']' && LA70_2 <= '`')||(LA70_2 >= 'c' && LA70_2 <= 'd')||(LA70_2 >= 'g' && LA70_2 <= 'm')||(LA70_2 >= 'o' && LA70_2 <= 'q')||LA70_2=='s'||LA70_2=='w'||(LA70_2 >= 'y' && LA70_2 <= '\uFFFF')) ) {
						alt70=2;
					}

				}
				else if ( ((LA70_0 >= '\u0000' && LA70_0 <= '!')||(LA70_0 >= '#' && LA70_0 <= '[')||(LA70_0 >= ']' && LA70_0 <= '\uFFFF')) ) {
					alt70=2;
				}

				switch (alt70) {
				case 1 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:517:13: ESC_SEQ
					{
					mESC_SEQ(); if (state.failed) return;

					}
					break;
				case 2 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:517:23: ~ ( '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop70;
				}
			}

			match('\"'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:520:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )* '\\'' )
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:520:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )* '\\''
			{
			match('\''); if (state.failed) return;
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:520:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )*
			loop71:
			while (true) {
				int alt71=3;
				int LA71_0 = input.LA(1);
				if ( (LA71_0=='\\') ) {
					alt71=1;
				}
				else if ( ((LA71_0 >= '\u0000' && LA71_0 <= '&')||(LA71_0 >= '(' && LA71_0 <= '[')||(LA71_0 >= ']' && LA71_0 <= '\uFFFF')) ) {
					alt71=2;
				}

				switch (alt71) {
				case 1 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:520:15: ESC_SEQ
					{
					mESC_SEQ(); if (state.failed) return;

					}
					break;
				case 2 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:520:25: ~ ( '\\'' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop71;
				}
			}

			match('\''); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:525:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:525:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:525:22: ( '+' | '-' )?
			int alt72=2;
			int LA72_0 = input.LA(1);
			if ( (LA72_0=='+'||LA72_0=='-') ) {
				alt72=1;
			}
			switch (alt72) {
				case 1 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:525:33: ( '0' .. '9' )+
			int cnt73=0;
			loop73:
			while (true) {
				int alt73=2;
				int LA73_0 = input.LA(1);
				if ( ((LA73_0 >= '0' && LA73_0 <= '9')) ) {
					alt73=1;
				}

				switch (alt73) {
				case 1 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt73 >= 1 ) break loop73;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(73, input);
					throw eee;
				}
				cnt73++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:528:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:532:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | 'v' | 'a' | 'e' | 'x' ) | UNICODE_ESC | OCTAL_ESC )
			int alt74=3;
			int LA74_0 = input.LA(1);
			if ( (LA74_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'a':
				case 'b':
				case 'e':
				case 'f':
				case 'n':
				case 'r':
				case 't':
				case 'v':
				case 'x':
					{
					alt74=1;
					}
					break;
				case 'u':
					{
					alt74=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt74=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 74, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 74, 0, input);
				throw nvae;
			}

			switch (alt74) {
				case 1 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:532:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | 'v' | 'a' | 'e' | 'x' )
					{
					match('\\'); if (state.failed) return;
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||(input.LA(1) >= 'a' && input.LA(1) <= 'b')||(input.LA(1) >= 'e' && input.LA(1) <= 'f')||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t'||input.LA(1)=='v'||input.LA(1)=='x' ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:533:9: UNICODE_ESC
					{
					mUNICODE_ESC(); if (state.failed) return;

					}
					break;
				case 3 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:534:9: OCTAL_ESC
					{
					mOCTAL_ESC(); if (state.failed) return;

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:539:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt75=3;
			int LA75_0 = input.LA(1);
			if ( (LA75_0=='\\') ) {
				int LA75_1 = input.LA(2);
				if ( ((LA75_1 >= '0' && LA75_1 <= '3')) ) {
					int LA75_2 = input.LA(3);
					if ( ((LA75_2 >= '0' && LA75_2 <= '7')) ) {
						int LA75_4 = input.LA(4);
						if ( ((LA75_4 >= '0' && LA75_4 <= '7')) ) {
							alt75=1;
						}

						else {
							alt75=2;
						}

					}

					else {
						alt75=3;
					}

				}
				else if ( ((LA75_1 >= '4' && LA75_1 <= '7')) ) {
					int LA75_3 = input.LA(3);
					if ( ((LA75_3 >= '0' && LA75_3 <= '7')) ) {
						alt75=2;
					}

					else {
						alt75=3;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 75, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 75, 0, input);
				throw nvae;
			}

			switch (alt75) {
				case 1 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:539:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); if (state.failed) return;
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:540:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); if (state.failed) return;
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:541:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); if (state.failed) return;
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:546:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:546:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
			match('\\'); if (state.failed) return;
			match('u'); if (state.failed) return;
			mHEX_DIGIT(); if (state.failed) return;

			mHEX_DIGIT(); if (state.failed) return;

			mHEX_DIGIT(); if (state.failed) return;

			mHEX_DIGIT(); if (state.failed) return;

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	// $ANTLR start "HASH"
	public final void mHASH() throws RecognitionException {
		try {
			int _type = HASH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:552:6: ( '#' ( WS )* RAW_IDENTIFIER )
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:553:2: '#' ( WS )* RAW_IDENTIFIER
			{
			match('#'); if (state.failed) return;
			// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:553:6: ( WS )*
			loop76:
			while (true) {
				int alt76=2;
				int LA76_0 = input.LA(1);
				if ( ((LA76_0 >= '\t' && LA76_0 <= '\n')||LA76_0=='\r'||LA76_0==' ') ) {
					alt76=1;
				}

				switch (alt76) {
				case 1 :
					// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop76;
				}
			}

			mRAW_IDENTIFIER(); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HASH"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:1:8: ( COMMENT | INCLUDE | DIRECTIVE | IDENTIFIER | NUMBER | LEFT | RIGHT | COMMA | OPERATOR | ELLIPSIS | TWODOT | FLOAT | WS | STRING | CHAR | HASH )
		int alt77=16;
		alt77 = dfa77.predict(input);
		switch (alt77) {
			case 1 :
				// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:1:10: COMMENT
				{
				mCOMMENT(); if (state.failed) return;

				}
				break;
			case 2 :
				// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:1:18: INCLUDE
				{
				mINCLUDE(); if (state.failed) return;

				}
				break;
			case 3 :
				// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:1:26: DIRECTIVE
				{
				mDIRECTIVE(); if (state.failed) return;

				}
				break;
			case 4 :
				// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:1:36: IDENTIFIER
				{
				mIDENTIFIER(); if (state.failed) return;

				}
				break;
			case 5 :
				// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:1:47: NUMBER
				{
				mNUMBER(); if (state.failed) return;

				}
				break;
			case 6 :
				// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:1:54: LEFT
				{
				mLEFT(); if (state.failed) return;

				}
				break;
			case 7 :
				// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:1:59: RIGHT
				{
				mRIGHT(); if (state.failed) return;

				}
				break;
			case 8 :
				// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:1:65: COMMA
				{
				mCOMMA(); if (state.failed) return;

				}
				break;
			case 9 :
				// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:1:71: OPERATOR
				{
				mOPERATOR(); if (state.failed) return;

				}
				break;
			case 10 :
				// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:1:80: ELLIPSIS
				{
				mELLIPSIS(); if (state.failed) return;

				}
				break;
			case 11 :
				// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:1:89: TWODOT
				{
				mTWODOT(); if (state.failed) return;

				}
				break;
			case 12 :
				// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:1:96: FLOAT
				{
				mFLOAT(); if (state.failed) return;

				}
				break;
			case 13 :
				// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:1:102: WS
				{
				mWS(); if (state.failed) return;

				}
				break;
			case 14 :
				// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:1:105: STRING
				{
				mSTRING(); if (state.failed) return;

				}
				break;
			case 15 :
				// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:1:112: CHAR
				{
				mCHAR(); if (state.failed) return;

				}
				break;
			case 16 :
				// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:1:117: HASH
				{
				mHASH(); if (state.failed) return;

				}
				break;

		}
	}

	// $ANTLR start synpred1_preprocess
	public final void synpred1_preprocess_fragment() throws RecognitionException {
		// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:486:39: ( ( NUMBER | IDENTIFIER ) )
		// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:486:39: ( NUMBER | IDENTIFIER )
		{
		// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:486:39: ( NUMBER | IDENTIFIER )
		int alt78=2;
		int LA78_0 = input.LA(1);
		if ( ((LA78_0 >= '0' && LA78_0 <= '9')) ) {
			alt78=1;
		}
		else if ( ((LA78_0 >= 'A' && LA78_0 <= 'Z')||LA78_0=='_'||(LA78_0 >= 'a' && LA78_0 <= 'z')) ) {
			alt78=2;
		}

		else {
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 78, 0, input);
			throw nvae;
		}

		switch (alt78) {
			case 1 :
				// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:486:40: NUMBER
				{
				mNUMBER(); if (state.failed) return;

				}
				break;
			case 2 :
				// C:\\Users\\xidong wang\\Desktop\\bak\\preprocess.g:486:47: IDENTIFIER
				{
				mIDENTIFIER(); if (state.failed) return;

				}
				break;

		}

		}

	}
	// $ANTLR end synpred1_preprocess

	public final boolean synpred1_preprocess() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_preprocess_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA12 dfa12 = new DFA12(this);
	protected DFA14 dfa14 = new DFA14(this);
	protected DFA22 dfa22 = new DFA22(this);
	protected DFA26 dfa26 = new DFA26(this);
	protected DFA33 dfa33 = new DFA33(this);
	protected DFA38 dfa38 = new DFA38(this);
	protected DFA69 dfa69 = new DFA69(this);
	protected DFA77 dfa77 = new DFA77(this);
	static final String DFA12_eotS =
		"\16\uffff";
	static final String DFA12_eofS =
		"\16\uffff";
	static final String DFA12_minS =
		"\1\43\2\11\1\156\1\143\1\154\1\165\1\144\1\145\2\11\3\uffff";
	static final String DFA12_maxS =
		"\1\43\2\151\1\156\1\143\1\154\1\165\1\144\1\145\2\172\3\uffff";
	static final String DFA12_acceptS =
		"\13\uffff\1\1\1\2\1\3";
	static final String DFA12_specialS =
		"\16\uffff}>";
	static final String[] DFA12_transitionS = {
			"\1\1",
			"\2\2\2\uffff\1\2\22\uffff\1\2\110\uffff\1\3",
			"\2\2\2\uffff\1\2\22\uffff\1\2\110\uffff\1\3",
			"\1\4",
			"\1\5",
			"\1\6",
			"\1\7",
			"\1\10",
			"\1\11",
			"\2\12\2\uffff\1\12\22\uffff\1\12\1\uffff\1\13\31\uffff\1\14\4\uffff"+
			"\32\15\4\uffff\1\15\1\uffff\32\15",
			"\2\12\2\uffff\1\12\22\uffff\1\12\1\uffff\1\13\31\uffff\1\14\4\uffff"+
			"\32\15\4\uffff\1\15\1\uffff\32\15",
			"",
			"",
			""
	};

	static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
	static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
	static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
	static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
	static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
	static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
	static final short[][] DFA12_transition;

	static {
		int numStates = DFA12_transitionS.length;
		DFA12_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
		}
	}

	protected class DFA12 extends DFA {

		public DFA12(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 12;
			this.eot = DFA12_eot;
			this.eof = DFA12_eof;
			this.min = DFA12_min;
			this.max = DFA12_max;
			this.accept = DFA12_accept;
			this.special = DFA12_special;
			this.transition = DFA12_transition;
		}
		@Override
		public String getDescription() {
			return "101:1: INCLUDE : ( '#' ( WS )* 'include' ( WS )* f= STRING | '#' ( WS )* 'include' ( WS )* '<' ( ESC_SEQ |~ ( '>' ) )* '>' | '#' ( WS )* 'include' ( WS )* RAW_IDENTIFIER );";
		}
	}

	static final String DFA14_eotS =
		"\1\1\1\uffff\2\4\2\uffff\1\4\1\uffff\4\4\1\uffff\1\4\2\uffff\2\4\1\uffff"+
		"\6\4\1\uffff";
	static final String DFA14_eofS =
		"\32\uffff";
	static final String DFA14_minS =
		"\1\0\1\uffff\1\52\1\12\2\uffff\1\0\1\uffff\4\0\1\uffff\1\0\1\uffff\3\0"+
		"\1\uffff\6\0\1\uffff";
	static final String DFA14_maxS =
		"\1\uffff\1\uffff\1\57\1\15\2\uffff\1\uffff\1\uffff\4\uffff\1\uffff\1\uffff"+
		"\1\uffff\3\uffff\1\uffff\6\uffff\1\uffff";
	static final String DFA14_acceptS =
		"\1\uffff\1\4\2\uffff\1\3\1\1\1\uffff\1\2\4\uffff\1\1\1\uffff\1\1\3\uffff"+
		"\1\1\6\uffff\1\1";
	static final String DFA14_specialS =
		"\1\10\5\uffff\1\5\1\uffff\1\1\1\17\1\14\1\16\1\uffff\1\6\1\uffff\1\13"+
		"\1\15\1\3\1\uffff\1\0\1\4\1\7\1\2\1\11\1\12\1\uffff}>";
	static final String[] DFA14_transitionS = {
			"\12\4\1\uffff\2\4\1\uffff\41\4\1\2\54\4\1\3\uffa3\4",
			"",
			"\1\6\4\uffff\1\5",
			"\1\7\2\uffff\1\7",
			"",
			"",
			"\12\13\1\5\2\13\1\5\34\13\1\10\4\13\1\11\54\13\1\12\uffa3\13",
			"",
			"\12\13\1\14\2\13\1\14\34\13\1\10\4\13\1\14\54\13\1\12\uffa3\13",
			"\12\13\1\16\2\13\1\16\34\13\1\16\4\13\1\15\54\13\1\12\uffa3\13",
			"\12\13\1\20\2\13\1\17\34\13\1\10\4\13\1\11\54\13\1\12\uffa3\13",
			"\12\13\1\16\2\13\1\16\34\13\1\10\4\13\1\11\54\13\1\12\uffa3\13",
			"",
			"\12\25\1\22\2\25\1\24\34\25\1\22\4\25\1\21\54\25\1\23\uffa3\25",
			"",
			"\12\22\1\20\ufff5\22",
			"\12\13\1\22\2\13\1\22\34\13\1\10\4\13\1\11\54\13\1\12\uffa3\13",
			"\12\25\1\22\2\25\1\24\34\25\1\22\4\25\1\21\54\25\1\23\uffa3\25",
			"",
			"\12\25\1\20\2\25\1\26\34\25\1\30\4\25\1\27\54\25\1\23\uffa3\25",
			"\12\13\1\22\2\13\1\22\34\13\1\10\4\13\1\11\54\13\1\12\uffa3\13",
			"\12\25\1\22\2\25\1\24\34\25\1\30\4\25\1\27\54\25\1\23\uffa3\25",
			"\12\13\1\20\2\13\1\22\34\13\1\10\4\13\1\11\54\13\1\12\uffa3\13",
			"\12\25\1\22\2\25\1\24\34\25\1\22\4\25\1\21\54\25\1\23\uffa3\25",
			"\12\25\1\31\2\25\1\24\34\25\1\30\4\25\1\31\54\25\1\23\uffa3\25",
			""
	};

	static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
	static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
	static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
	static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
	static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
	static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
	static final short[][] DFA14_transition;

	static {
		int numStates = DFA14_transitionS.length;
		DFA14_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
		}
	}

	protected class DFA14 extends DFA {

		public DFA14(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 14;
			this.eot = DFA14_eot;
			this.eof = DFA14_eof;
			this.min = DFA14_min;
			this.max = DFA14_max;
			this.accept = DFA14_accept;
			this.special = DFA14_special;
			this.transition = DFA14_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 174:17: ( COMMENT | ( '\\\\' ( '\\r' )? '\\n' ) | (~ ( '\\r' | '\\n' ) ) )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA14_19 = input.LA(1);
						s = -1;
						if ( (LA14_19=='\r') ) {s = 22;}
						else if ( (LA14_19=='/') ) {s = 23;}
						else if ( (LA14_19=='\\') ) {s = 19;}
						else if ( (LA14_19=='*') ) {s = 24;}
						else if ( (LA14_19=='\n') ) {s = 16;}
						else if ( ((LA14_19 >= '\u0000' && LA14_19 <= '\t')||(LA14_19 >= '\u000B' && LA14_19 <= '\f')||(LA14_19 >= '\u000E' && LA14_19 <= ')')||(LA14_19 >= '+' && LA14_19 <= '.')||(LA14_19 >= '0' && LA14_19 <= '[')||(LA14_19 >= ']' && LA14_19 <= '\uFFFF')) ) {s = 21;}
						else s = 4;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA14_8 = input.LA(1);
						s = -1;
						if ( (LA14_8=='\n'||LA14_8=='\r'||LA14_8=='/') ) {s = 12;}
						else if ( (LA14_8=='*') ) {s = 8;}
						else if ( (LA14_8=='\\') ) {s = 10;}
						else if ( ((LA14_8 >= '\u0000' && LA14_8 <= '\t')||(LA14_8 >= '\u000B' && LA14_8 <= '\f')||(LA14_8 >= '\u000E' && LA14_8 <= ')')||(LA14_8 >= '+' && LA14_8 <= '.')||(LA14_8 >= '0' && LA14_8 <= '[')||(LA14_8 >= ']' && LA14_8 <= '\uFFFF')) ) {s = 11;}
						else s = 4;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA14_22 = input.LA(1);
						s = -1;
						if ( (LA14_22=='/') ) {s = 9;}
						else if ( (LA14_22=='\\') ) {s = 10;}
						else if ( (LA14_22=='*') ) {s = 8;}
						else if ( (LA14_22=='\n') ) {s = 16;}
						else if ( ((LA14_22 >= '\u0000' && LA14_22 <= '\t')||(LA14_22 >= '\u000B' && LA14_22 <= '\f')||(LA14_22 >= '\u000E' && LA14_22 <= ')')||(LA14_22 >= '+' && LA14_22 <= '.')||(LA14_22 >= '0' && LA14_22 <= '[')||(LA14_22 >= ']' && LA14_22 <= '\uFFFF')) ) {s = 11;}
						else if ( (LA14_22=='\r') ) {s = 18;}
						else s = 4;
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA14_17 = input.LA(1);
						s = -1;
						if ( (LA14_17=='/') ) {s = 17;}
						else if ( (LA14_17=='\n'||LA14_17=='*') ) {s = 18;}
						else if ( (LA14_17=='\\') ) {s = 19;}
						else if ( (LA14_17=='\r') ) {s = 20;}
						else if ( ((LA14_17 >= '\u0000' && LA14_17 <= '\t')||(LA14_17 >= '\u000B' && LA14_17 <= '\f')||(LA14_17 >= '\u000E' && LA14_17 <= ')')||(LA14_17 >= '+' && LA14_17 <= '.')||(LA14_17 >= '0' && LA14_17 <= '[')||(LA14_17 >= ']' && LA14_17 <= '\uFFFF')) ) {s = 21;}
						else s = 4;
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA14_20 = input.LA(1);
						s = -1;
						if ( (LA14_20=='/') ) {s = 9;}
						else if ( (LA14_20=='\\') ) {s = 10;}
						else if ( (LA14_20=='*') ) {s = 8;}
						else if ( ((LA14_20 >= '\u0000' && LA14_20 <= '\t')||(LA14_20 >= '\u000B' && LA14_20 <= '\f')||(LA14_20 >= '\u000E' && LA14_20 <= ')')||(LA14_20 >= '+' && LA14_20 <= '.')||(LA14_20 >= '0' && LA14_20 <= '[')||(LA14_20 >= ']' && LA14_20 <= '\uFFFF')) ) {s = 11;}
						else if ( (LA14_20=='\n'||LA14_20=='\r') ) {s = 18;}
						else s = 4;
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA14_6 = input.LA(1);
						s = -1;
						if ( (LA14_6=='*') ) {s = 8;}
						else if ( (LA14_6=='/') ) {s = 9;}
						else if ( (LA14_6=='\\') ) {s = 10;}
						else if ( ((LA14_6 >= '\u0000' && LA14_6 <= '\t')||(LA14_6 >= '\u000B' && LA14_6 <= '\f')||(LA14_6 >= '\u000E' && LA14_6 <= ')')||(LA14_6 >= '+' && LA14_6 <= '.')||(LA14_6 >= '0' && LA14_6 <= '[')||(LA14_6 >= ']' && LA14_6 <= '\uFFFF')) ) {s = 11;}
						else if ( (LA14_6=='\n'||LA14_6=='\r') ) {s = 5;}
						else s = 4;
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA14_13 = input.LA(1);
						s = -1;
						if ( (LA14_13=='/') ) {s = 17;}
						else if ( (LA14_13=='\n'||LA14_13=='*') ) {s = 18;}
						else if ( (LA14_13=='\\') ) {s = 19;}
						else if ( (LA14_13=='\r') ) {s = 20;}
						else if ( ((LA14_13 >= '\u0000' && LA14_13 <= '\t')||(LA14_13 >= '\u000B' && LA14_13 <= '\f')||(LA14_13 >= '\u000E' && LA14_13 <= ')')||(LA14_13 >= '+' && LA14_13 <= '.')||(LA14_13 >= '0' && LA14_13 <= '[')||(LA14_13 >= ']' && LA14_13 <= '\uFFFF')) ) {s = 21;}
						else s = 4;
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA14_21 = input.LA(1);
						s = -1;
						if ( (LA14_21=='\r') ) {s = 20;}
						else if ( (LA14_21=='/') ) {s = 23;}
						else if ( (LA14_21=='\\') ) {s = 19;}
						else if ( (LA14_21=='*') ) {s = 24;}
						else if ( ((LA14_21 >= '\u0000' && LA14_21 <= '\t')||(LA14_21 >= '\u000B' && LA14_21 <= '\f')||(LA14_21 >= '\u000E' && LA14_21 <= ')')||(LA14_21 >= '+' && LA14_21 <= '.')||(LA14_21 >= '0' && LA14_21 <= '[')||(LA14_21 >= ']' && LA14_21 <= '\uFFFF')) ) {s = 21;}
						else if ( (LA14_21=='\n') ) {s = 18;}
						else s = 4;
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA14_0 = input.LA(1);
						s = -1;
						if ( (LA14_0=='/') ) {s = 2;}
						else if ( (LA14_0=='\\') ) {s = 3;}
						else if ( ((LA14_0 >= '\u0000' && LA14_0 <= '\t')||(LA14_0 >= '\u000B' && LA14_0 <= '\f')||(LA14_0 >= '\u000E' && LA14_0 <= '.')||(LA14_0 >= '0' && LA14_0 <= '[')||(LA14_0 >= ']' && LA14_0 <= '\uFFFF')) ) {s = 4;}
						else s = 1;
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA14_23 = input.LA(1);
						s = -1;
						if ( (LA14_23=='/') ) {s = 17;}
						else if ( (LA14_23=='\n'||LA14_23=='*') ) {s = 18;}
						else if ( (LA14_23=='\\') ) {s = 19;}
						else if ( ((LA14_23 >= '\u0000' && LA14_23 <= '\t')||(LA14_23 >= '\u000B' && LA14_23 <= '\f')||(LA14_23 >= '\u000E' && LA14_23 <= ')')||(LA14_23 >= '+' && LA14_23 <= '.')||(LA14_23 >= '0' && LA14_23 <= '[')||(LA14_23 >= ']' && LA14_23 <= '\uFFFF')) ) {s = 21;}
						else if ( (LA14_23=='\r') ) {s = 20;}
						else s = 4;
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA14_24 = input.LA(1);
						s = -1;
						if ( (LA14_24=='\n'||LA14_24=='/') ) {s = 25;}
						else if ( (LA14_24=='\\') ) {s = 19;}
						else if ( (LA14_24=='*') ) {s = 24;}
						else if ( (LA14_24=='\r') ) {s = 20;}
						else if ( ((LA14_24 >= '\u0000' && LA14_24 <= '\t')||(LA14_24 >= '\u000B' && LA14_24 <= '\f')||(LA14_24 >= '\u000E' && LA14_24 <= ')')||(LA14_24 >= '+' && LA14_24 <= '.')||(LA14_24 >= '0' && LA14_24 <= '[')||(LA14_24 >= ']' && LA14_24 <= '\uFFFF')) ) {s = 21;}
						else s = 4;
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA14_15 = input.LA(1);
						s = -1;
						if ( ((LA14_15 >= '\u0000' && LA14_15 <= '\t')||(LA14_15 >= '\u000B' && LA14_15 <= '\uFFFF')) ) {s = 18;}
						else if ( (LA14_15=='\n') ) {s = 16;}
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA14_10 = input.LA(1);
						s = -1;
						if ( (LA14_10=='*') ) {s = 8;}
						else if ( (LA14_10=='\r') ) {s = 15;}
						else if ( (LA14_10=='\n') ) {s = 16;}
						else if ( (LA14_10=='/') ) {s = 9;}
						else if ( (LA14_10=='\\') ) {s = 10;}
						else if ( ((LA14_10 >= '\u0000' && LA14_10 <= '\t')||(LA14_10 >= '\u000B' && LA14_10 <= '\f')||(LA14_10 >= '\u000E' && LA14_10 <= ')')||(LA14_10 >= '+' && LA14_10 <= '.')||(LA14_10 >= '0' && LA14_10 <= '[')||(LA14_10 >= ']' && LA14_10 <= '\uFFFF')) ) {s = 11;}
						else s = 4;
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA14_16 = input.LA(1);
						s = -1;
						if ( (LA14_16=='*') ) {s = 8;}
						else if ( (LA14_16=='/') ) {s = 9;}
						else if ( (LA14_16=='\\') ) {s = 10;}
						else if ( ((LA14_16 >= '\u0000' && LA14_16 <= '\t')||(LA14_16 >= '\u000B' && LA14_16 <= '\f')||(LA14_16 >= '\u000E' && LA14_16 <= ')')||(LA14_16 >= '+' && LA14_16 <= '.')||(LA14_16 >= '0' && LA14_16 <= '[')||(LA14_16 >= ']' && LA14_16 <= '\uFFFF')) ) {s = 11;}
						else if ( (LA14_16=='\n'||LA14_16=='\r') ) {s = 18;}
						else s = 4;
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA14_11 = input.LA(1);
						s = -1;
						if ( (LA14_11=='*') ) {s = 8;}
						else if ( (LA14_11=='/') ) {s = 9;}
						else if ( (LA14_11=='\\') ) {s = 10;}
						else if ( ((LA14_11 >= '\u0000' && LA14_11 <= '\t')||(LA14_11 >= '\u000B' && LA14_11 <= '\f')||(LA14_11 >= '\u000E' && LA14_11 <= ')')||(LA14_11 >= '+' && LA14_11 <= '.')||(LA14_11 >= '0' && LA14_11 <= '[')||(LA14_11 >= ']' && LA14_11 <= '\uFFFF')) ) {s = 11;}
						else if ( (LA14_11=='\n'||LA14_11=='\r') ) {s = 14;}
						else s = 4;
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA14_9 = input.LA(1);
						s = -1;
						if ( (LA14_9=='/') ) {s = 13;}
						else if ( (LA14_9=='\n'||LA14_9=='\r'||LA14_9=='*') ) {s = 14;}
						else if ( (LA14_9=='\\') ) {s = 10;}
						else if ( ((LA14_9 >= '\u0000' && LA14_9 <= '\t')||(LA14_9 >= '\u000B' && LA14_9 <= '\f')||(LA14_9 >= '\u000E' && LA14_9 <= ')')||(LA14_9 >= '+' && LA14_9 <= '.')||(LA14_9 >= '0' && LA14_9 <= '[')||(LA14_9 >= ']' && LA14_9 <= '\uFFFF')) ) {s = 11;}
						else s = 4;
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 14, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA22_eotS =
		"\10\uffff";
	static final String DFA22_eofS =
		"\10\uffff";
	static final String DFA22_minS =
		"\1\11\1\52\2\uffff\3\0\1\uffff";
	static final String DFA22_maxS =
		"\1\172\1\57\2\uffff\3\uffff\1\uffff";
	static final String DFA22_acceptS =
		"\2\uffff\1\2\1\1\3\uffff\1\1";
	static final String DFA22_specialS =
		"\4\uffff\1\0\1\2\1\1\1\uffff}>";
	static final String[] DFA22_transitionS = {
			"\2\2\2\uffff\1\2\22\uffff\1\2\10\uffff\1\2\2\uffff\1\2\1\uffff\1\2\1"+
			"\1\21\uffff\32\2\1\uffff\1\2\2\uffff\1\2\1\uffff\32\2",
			"\1\4\4\uffff\1\3",
			"",
			"",
			"\52\6\1\5\uffd5\6",
			"\52\6\1\5\4\6\1\7\uffd0\6",
			"\52\6\1\5\uffd5\6",
			""
	};

	static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
	static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
	static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
	static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
	static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
	static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
	static final short[][] DFA22_transition;

	static {
		int numStates = DFA22_transitionS.length;
		DFA22_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
		}
	}

	protected class DFA22 extends DFA {

		public DFA22(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 22;
			this.eot = DFA22_eot;
			this.eof = DFA22_eof;
			this.min = DFA22_min;
			this.max = DFA22_max;
			this.accept = DFA22_accept;
			this.special = DFA22_special;
			this.transition = DFA22_transition;
		}
		@Override
		public String getDescription() {
			return "214:34: ( COMMENT )?";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA22_4 = input.LA(1);
						s = -1;
						if ( (LA22_4=='*') ) {s = 5;}
						else if ( ((LA22_4 >= '\u0000' && LA22_4 <= ')')||(LA22_4 >= '+' && LA22_4 <= '\uFFFF')) ) {s = 6;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA22_6 = input.LA(1);
						s = -1;
						if ( (LA22_6=='*') ) {s = 5;}
						else if ( ((LA22_6 >= '\u0000' && LA22_6 <= ')')||(LA22_6 >= '+' && LA22_6 <= '\uFFFF')) ) {s = 6;}
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA22_5 = input.LA(1);
						s = -1;
						if ( (LA22_5=='/') ) {s = 7;}
						else if ( (LA22_5=='*') ) {s = 5;}
						else if ( ((LA22_5 >= '\u0000' && LA22_5 <= ')')||(LA22_5 >= '+' && LA22_5 <= '.')||(LA22_5 >= '0' && LA22_5 <= '\uFFFF')) ) {s = 6;}
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 22, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA26_eotS =
		"\10\uffff";
	static final String DFA26_eofS =
		"\10\uffff";
	static final String DFA26_minS =
		"\1\11\1\52\2\uffff\3\0\1\uffff";
	static final String DFA26_maxS =
		"\1\134\1\57\2\uffff\3\uffff\1\uffff";
	static final String DFA26_acceptS =
		"\2\uffff\1\2\1\1\3\uffff\1\1";
	static final String DFA26_specialS =
		"\4\uffff\1\0\1\2\1\1\1\uffff}>";
	static final String[] DFA26_transitionS = {
			"\2\2\2\uffff\1\2\22\uffff\1\2\10\uffff\1\2\2\uffff\1\2\1\uffff\1\2\1"+
			"\1\54\uffff\1\2",
			"\1\4\4\uffff\1\3",
			"",
			"",
			"\52\6\1\5\uffd5\6",
			"\52\6\1\5\4\6\1\7\uffd0\6",
			"\52\6\1\5\uffd5\6",
			""
	};

	static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
	static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
	static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
	static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
	static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
	static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
	static final short[][] DFA26_transition;

	static {
		int numStates = DFA26_transitionS.length;
		DFA26_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
		}
	}

	protected class DFA26 extends DFA {

		public DFA26(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 26;
			this.eot = DFA26_eot;
			this.eof = DFA26_eof;
			this.min = DFA26_min;
			this.max = DFA26_max;
			this.accept = DFA26_accept;
			this.special = DFA26_special;
			this.transition = DFA26_transition;
		}
		@Override
		public String getDescription() {
			return "214:139: ( COMMENT )?";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA26_4 = input.LA(1);
						s = -1;
						if ( (LA26_4=='*') ) {s = 5;}
						else if ( ((LA26_4 >= '\u0000' && LA26_4 <= ')')||(LA26_4 >= '+' && LA26_4 <= '\uFFFF')) ) {s = 6;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA26_6 = input.LA(1);
						s = -1;
						if ( (LA26_6=='*') ) {s = 5;}
						else if ( ((LA26_6 >= '\u0000' && LA26_6 <= ')')||(LA26_6 >= '+' && LA26_6 <= '\uFFFF')) ) {s = 6;}
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA26_5 = input.LA(1);
						s = -1;
						if ( (LA26_5=='/') ) {s = 7;}
						else if ( (LA26_5=='*') ) {s = 5;}
						else if ( ((LA26_5 >= '\u0000' && LA26_5 <= ')')||(LA26_5 >= '+' && LA26_5 <= '.')||(LA26_5 >= '0' && LA26_5 <= '\uFFFF')) ) {s = 6;}
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 26, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA33_eotS =
		"\10\uffff";
	static final String DFA33_eofS =
		"\10\uffff";
	static final String DFA33_minS =
		"\1\11\1\52\2\uffff\3\0\1\uffff";
	static final String DFA33_maxS =
		"\1\172\1\57\2\uffff\3\uffff\1\uffff";
	static final String DFA33_acceptS =
		"\2\uffff\1\2\1\1\3\uffff\1\1";
	static final String DFA33_specialS =
		"\4\uffff\1\0\1\2\1\1\1\uffff}>";
	static final String[] DFA33_transitionS = {
			"\2\2\2\uffff\1\2\22\uffff\1\2\10\uffff\1\2\2\uffff\1\2\1\uffff\1\2\1"+
			"\1\21\uffff\32\2\4\uffff\1\2\1\uffff\32\2",
			"\1\4\4\uffff\1\3",
			"",
			"",
			"\52\6\1\5\uffd5\6",
			"\52\6\1\5\4\6\1\7\uffd0\6",
			"\52\6\1\5\uffd5\6",
			""
	};

	static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
	static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
	static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
	static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
	static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
	static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
	static final short[][] DFA33_transition;

	static {
		int numStates = DFA33_transitionS.length;
		DFA33_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
		}
	}

	protected class DFA33 extends DFA {

		public DFA33(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 33;
			this.eot = DFA33_eot;
			this.eof = DFA33_eof;
			this.min = DFA33_min;
			this.max = DFA33_max;
			this.accept = DFA33_accept;
			this.special = DFA33_special;
			this.transition = DFA33_transition;
		}
		@Override
		public String getDescription() {
			return "215:41: ( COMMENT )?";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA33_4 = input.LA(1);
						s = -1;
						if ( (LA33_4=='*') ) {s = 5;}
						else if ( ((LA33_4 >= '\u0000' && LA33_4 <= ')')||(LA33_4 >= '+' && LA33_4 <= '\uFFFF')) ) {s = 6;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA33_6 = input.LA(1);
						s = -1;
						if ( (LA33_6=='*') ) {s = 5;}
						else if ( ((LA33_6 >= '\u0000' && LA33_6 <= ')')||(LA33_6 >= '+' && LA33_6 <= '\uFFFF')) ) {s = 6;}
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA33_5 = input.LA(1);
						s = -1;
						if ( (LA33_5=='/') ) {s = 7;}
						else if ( (LA33_5=='*') ) {s = 5;}
						else if ( ((LA33_5 >= '\u0000' && LA33_5 <= ')')||(LA33_5 >= '+' && LA33_5 <= '.')||(LA33_5 >= '0' && LA33_5 <= '\uFFFF')) ) {s = 6;}
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 33, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA38_eotS =
		"\10\uffff";
	static final String DFA38_eofS =
		"\10\uffff";
	static final String DFA38_minS =
		"\1\51\1\52\2\uffff\3\0\1\uffff";
	static final String DFA38_maxS =
		"\2\57\2\uffff\3\uffff\1\uffff";
	static final String DFA38_acceptS =
		"\2\uffff\1\2\1\1\3\uffff\1\1";
	static final String DFA38_specialS =
		"\4\uffff\1\0\1\2\1\1\1\uffff}>";
	static final String[] DFA38_transitionS = {
			"\1\2\2\uffff\1\2\1\uffff\1\2\1\1",
			"\1\4\4\uffff\1\3",
			"",
			"",
			"\52\6\1\5\uffd5\6",
			"\52\6\1\5\4\6\1\7\uffd0\6",
			"\52\6\1\5\uffd5\6",
			""
	};

	static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
	static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
	static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
	static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
	static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
	static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
	static final short[][] DFA38_transition;

	static {
		int numStates = DFA38_transitionS.length;
		DFA38_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
		}
	}

	protected class DFA38 extends DFA {

		public DFA38(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 38;
			this.eot = DFA38_eot;
			this.eof = DFA38_eof;
			this.min = DFA38_min;
			this.max = DFA38_max;
			this.accept = DFA38_accept;
			this.special = DFA38_special;
			this.transition = DFA38_transition;
		}
		@Override
		public String getDescription() {
			return "215:208: ( COMMENT )?";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA38_4 = input.LA(1);
						s = -1;
						if ( (LA38_4=='*') ) {s = 5;}
						else if ( ((LA38_4 >= '\u0000' && LA38_4 <= ')')||(LA38_4 >= '+' && LA38_4 <= '\uFFFF')) ) {s = 6;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA38_6 = input.LA(1);
						s = -1;
						if ( (LA38_6=='*') ) {s = 5;}
						else if ( ((LA38_6 >= '\u0000' && LA38_6 <= ')')||(LA38_6 >= '+' && LA38_6 <= '\uFFFF')) ) {s = 6;}
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA38_5 = input.LA(1);
						s = -1;
						if ( (LA38_5=='/') ) {s = 7;}
						else if ( (LA38_5=='*') ) {s = 5;}
						else if ( ((LA38_5 >= '\u0000' && LA38_5 <= ')')||(LA38_5 >= '+' && LA38_5 <= '.')||(LA38_5 >= '0' && LA38_5 <= '\uFFFF')) ) {s = 6;}
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 38, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA69_eotS =
		"\5\uffff";
	static final String DFA69_eofS =
		"\5\uffff";
	static final String DFA69_minS =
		"\2\56\3\uffff";
	static final String DFA69_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA69_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA69_specialS =
		"\5\uffff}>";
	static final String[] DFA69_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA69_eot = DFA.unpackEncodedString(DFA69_eotS);
	static final short[] DFA69_eof = DFA.unpackEncodedString(DFA69_eofS);
	static final char[] DFA69_min = DFA.unpackEncodedStringToUnsignedChars(DFA69_minS);
	static final char[] DFA69_max = DFA.unpackEncodedStringToUnsignedChars(DFA69_maxS);
	static final short[] DFA69_accept = DFA.unpackEncodedString(DFA69_acceptS);
	static final short[] DFA69_special = DFA.unpackEncodedString(DFA69_specialS);
	static final short[][] DFA69_transition;

	static {
		int numStates = DFA69_transitionS.length;
		DFA69_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA69_transition[i] = DFA.unpackEncodedString(DFA69_transitionS[i]);
		}
	}

	protected class DFA69 extends DFA {

		public DFA69(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 69;
			this.eot = DFA69_eot;
			this.eof = DFA69_eof;
			this.min = DFA69_min;
			this.max = DFA69_max;
			this.accept = DFA69_accept;
			this.special = DFA69_special;
			this.transition = DFA69_transition;
		}
		@Override
		public String getDescription() {
			return "501:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA77_eotS =
		"\1\uffff\2\10\1\uffff\1\23\4\uffff\2\10\4\uffff\2\21\1\uffff\1\23\2\uffff"+
		"\1\23\1\34\1\uffff\2\21\1\23\2\uffff\11\21\1\uffff\1\21\1\uffff\1\50\1"+
		"\21\1\50";
	static final String DFA77_eofS =
		"\54\uffff";
	static final String DFA77_minS =
		"\1\11\1\52\1\11\1\uffff\1\56\4\uffff\1\56\1\0\3\uffff\1\11\1\156\1\145"+
		"\1\uffff\1\56\2\uffff\1\53\1\56\1\uffff\1\143\1\146\1\60\2\uffff\1\154"+
		"\1\151\1\165\1\156\1\144\2\145\2\11\1\uffff\1\11\1\uffff\1\60\1\11\1\60";
	static final String DFA77_maxS =
		"\1\176\1\57\1\172\1\uffff\1\145\4\uffff\1\71\1\uffff\3\uffff\1\172\1\156"+
		"\1\145\1\uffff\1\145\2\uffff\1\71\1\56\1\uffff\1\143\1\146\1\71\2\uffff"+
		"\1\154\1\151\1\165\1\156\1\144\2\145\2\172\1\uffff\1\172\1\uffff\3\172";
	static final String DFA77_acceptS =
		"\3\uffff\1\4\1\uffff\1\6\1\7\1\10\1\11\2\uffff\1\15\1\16\1\1\3\uffff\1"+
		"\20\1\uffff\1\5\1\14\2\uffff\1\17\3\uffff\1\12\1\13\11\uffff\1\3\1\uffff"+
		"\1\2\3\uffff";
	static final String DFA77_specialS =
		"\12\uffff\1\0\41\uffff}>";
	static final String[] DFA77_transitionS = {
			"\2\13\2\uffff\1\13\22\uffff\1\13\1\10\1\14\1\2\3\10\1\12\1\5\1\6\2\10"+
			"\1\7\1\10\1\11\1\1\12\4\7\10\32\3\1\5\1\10\1\6\1\10\1\3\1\10\32\3\1\5"+
			"\1\10\1\6\1\10",
			"\1\15\4\uffff\1\15",
			"\2\16\2\uffff\1\16\22\uffff\1\16\40\uffff\32\21\4\uffff\1\21\1\uffff"+
			"\3\21\1\20\4\21\1\17\21\21",
			"",
			"\1\24\1\uffff\12\22\13\uffff\1\25\37\uffff\1\25",
			"",
			"",
			"",
			"",
			"\1\26\1\uffff\12\24",
			"\0\27",
			"",
			"",
			"",
			"\2\16\2\uffff\1\16\22\uffff\1\16\40\uffff\32\21\4\uffff\1\21\1\uffff"+
			"\3\21\1\20\4\21\1\17\21\21",
			"\1\30",
			"\1\31",
			"",
			"\1\24\1\uffff\12\22\13\uffff\1\25\37\uffff\1\25",
			"",
			"",
			"\1\24\1\uffff\1\24\2\uffff\12\32",
			"\1\33",
			"",
			"\1\35",
			"\1\36",
			"\12\32",
			"",
			"",
			"\1\37",
			"\1\40",
			"\1\41",
			"\1\42",
			"\1\43",
			"\1\44",
			"\1\45",
			"\2\46\2\uffff\1\46\22\uffff\1\46\40\uffff\32\47\1\uffff\1\46\2\uffff"+
			"\1\47\1\uffff\32\47",
			"\2\50\2\uffff\1\50\22\uffff\1\50\1\uffff\1\50\31\uffff\1\50\4\uffff"+
			"\32\51\4\uffff\1\51\1\uffff\32\51",
			"",
			"\2\46\1\uffff\2\46\22\uffff\1\46\7\uffff\1\46\7\uffff\12\52\7\uffff"+
			"\32\52\1\uffff\1\46\2\uffff\1\52\1\uffff\32\52",
			"",
			"\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
			"\2\46\1\uffff\2\46\22\uffff\1\46\7\uffff\1\46\7\uffff\12\52\7\uffff"+
			"\32\52\1\uffff\1\46\2\uffff\1\52\1\uffff\32\52",
			"\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53"
	};

	static final short[] DFA77_eot = DFA.unpackEncodedString(DFA77_eotS);
	static final short[] DFA77_eof = DFA.unpackEncodedString(DFA77_eofS);
	static final char[] DFA77_min = DFA.unpackEncodedStringToUnsignedChars(DFA77_minS);
	static final char[] DFA77_max = DFA.unpackEncodedStringToUnsignedChars(DFA77_maxS);
	static final short[] DFA77_accept = DFA.unpackEncodedString(DFA77_acceptS);
	static final short[] DFA77_special = DFA.unpackEncodedString(DFA77_specialS);
	static final short[][] DFA77_transition;

	static {
		int numStates = DFA77_transitionS.length;
		DFA77_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA77_transition[i] = DFA.unpackEncodedString(DFA77_transitionS[i]);
		}
	}

	protected class DFA77 extends DFA {

		public DFA77(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 77;
			this.eot = DFA77_eot;
			this.eof = DFA77_eof;
			this.min = DFA77_min;
			this.max = DFA77_max;
			this.accept = DFA77_accept;
			this.special = DFA77_special;
			this.transition = DFA77_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( COMMENT | INCLUDE | DIRECTIVE | IDENTIFIER | NUMBER | LEFT | RIGHT | COMMA | OPERATOR | ELLIPSIS | TWODOT | FLOAT | WS | STRING | CHAR | HASH );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA77_10 = input.LA(1);
						s = -1;
						if ( ((LA77_10 >= '\u0000' && LA77_10 <= '\uFFFF')) ) {s = 23;}
						else s = 8;
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 77, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
