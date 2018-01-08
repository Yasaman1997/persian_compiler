
/* A Bison parser, made by GNU Bison 2.4.1.  */

/* Skeleton implementation for Bison LALR(1) parsers in Java
   
      Copyright (C) 2007, 2008 Free Software Foundation, Inc.
   
   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.
   
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.
   
   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.
   
   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

/* First part of user declarations.  */

/* Line 32 of lalr1.java  */
/* Line 1 of "YYParser.y"  */

import java.io.*;
import java.util.ArrayList;


/**
 * A Bison parser, automatically generated from <tt>YYParser.y</tt>.
 *
 * @author LALR (1) parser skeleton written by Paolo Bonzini.
 */
class YYParser
{
    /** Version number for the Bison executable that generated this parser.  */
  public static final String bisonVersion = "2.4.1";

  /** Name of the skeleton that generated this parser.  */
  public static final String bisonSkeleton = "lalr1.java";


  /** True if verbose error messages are enabled.  */
  public boolean errorVerbose = false;



  /** Token returned by the scanner to signal the end of its input.  */
  public static final int EOF = 0;

/* Tokens.  */
  /** Token number, to be returned by the scanner.  */
  public static final int COMMENT = 258;
  /** Token number, to be returned by the scanner.  */
  public static final int FLOAT_KW = 259;
  /** Token number, to be returned by the scanner.  */
  public static final int INT_KW = 260;
  /** Token number, to be returned by the scanner.  */
  public static final int BOOLEAN_KW = 261;
  /** Token number, to be returned by the scanner.  */
  public static final int CHAR_KW = 262;
  /** Token number, to be returned by the scanner.  */
  public static final int AKULAD_BAZ_KW = 263;
  /** Token number, to be returned by the scanner.  */
  public static final int AKULAD_BASTE_KW = 264;
  /** Token number, to be returned by the scanner.  */
  public static final int ADD_KW = 265;
  /** Token number, to be returned by the scanner.  */
  public static final int SWITCH_KW = 266;
  /** Token number, to be returned by the scanner.  */
  public static final int END_KW = 267;
  /** Token number, to be returned by the scanner.  */
  public static final int DEFAULT_KW = 268;
  /** Token number, to be returned by the scanner.  */
  public static final int BREAK_KW = 269;
  /** Token number, to be returned by the scanner.  */
  public static final int RETURN_KW = 270;
  /** Token number, to be returned by the scanner.  */
  public static final int COMMA = 271;
  /** Token number, to be returned by the scanner.  */
  public static final int PROGRAM_KW = 272;
  /** Token number, to be returned by the scanner.  */
  public static final int STRUCT_KW = 273;
  /** Token number, to be returned by the scanner.  */
  public static final int CONSTANT_KW = 274;
  /** Token number, to be returned by the scanner.  */
  public static final int IF_KW = 275;
  /** Token number, to be returned by the scanner.  */
  public static final int THEN_KW = 276;
  /** Token number, to be returned by the scanner.  */
  public static final int ELSE_KW = 277;
  /** Token number, to be returned by the scanner.  */
  public static final int AND_KW = 278;
  /** Token number, to be returned by the scanner.  */
  public static final int OR_KW = 279;
  /** Token number, to be returned by the scanner.  */
  public static final int NOT_KW = 280;
  /** Token number, to be returned by the scanner.  */
  public static final int WHILE_KW = 281;
  /** Token number, to be returned by the scanner.  */
  public static final int NOGHTE_VIRGUL = 282;
  /** Token number, to be returned by the scanner.  */
  public static final int ADAD = 283;
  /** Token number, to be returned by the scanner.  */
  public static final int SHENASE = 284;
  /** Token number, to be returned by the scanner.  */
  public static final int HARFE_SABET = 285;
  /** Token number, to be returned by the scanner.  */
  public static final int KEY_KW = 286;
  /** Token number, to be returned by the scanner.  */
  public static final int MORE_THAN_KW = 287;
  /** Token number, to be returned by the scanner.  */
  public static final int NOGHTE_KW = 288;
  /** Token number, to be returned by the scanner.  */
  public static final int MULTIPLY_KW = 289;
  /** Token number, to be returned by the scanner.  */
  public static final int BRACKET_BASTE_KW = 290;
  /** Token number, to be returned by the scanner.  */
  public static final int BRACKET_BAZ_KW = 291;
  /** Token number, to be returned by the scanner.  */
  public static final int PARANTHESIS_BASTE_KW = 292;
  /** Token number, to be returned by the scanner.  */
  public static final int PARANTHESIS_BAZ_KW = 293;
  /** Token number, to be returned by the scanner.  */
  public static final int TRUE_KW = 294;
  /** Token number, to be returned by the scanner.  */
  public static final int QUESTION_KW = 295;
  /** Token number, to be returned by the scanner.  */
  public static final int EQUAL_EQUAL_KW = 296;
  /** Token number, to be returned by the scanner.  */
  public static final int EQUAL_KW = 297;
  /** Token number, to be returned by the scanner.  */
  public static final int DEVIDE_KW = 298;
  /** Token number, to be returned by the scanner.  */
  public static final int DEVIDE_EQUAL_KW = 299;
  /** Token number, to be returned by the scanner.  */
  public static final int OR_ELSE_KW = 300;
  /** Token number, to be returned by the scanner.  */
  public static final int FALSE_KW = 301;
  /** Token number, to be returned by the scanner.  */
  public static final int AND_THEN_KW = 302;
  /** Token number, to be returned by the scanner.  */
  public static final int MINUS_KW = 303;
  /** Token number, to be returned by the scanner.  */
  public static final int DONOGHTE_KW = 304;
  /** Token number, to be returned by the scanner.  */
  public static final int LESS_EQUAL_KW = 305;
  /** Token number, to be returned by the scanner.  */
  public static final int MOD_KW = 306;
  /** Token number, to be returned by the scanner.  */
  public static final int LESS_THAN_KW = 307;
  /** Token number, to be returned by the scanner.  */
  public static final int MORE_EQUAL_KW = 308;
  /** Token number, to be returned by the scanner.  */
  public static final int PLUS_EQUAL_KW = 309;
  /** Token number, to be returned by the scanner.  */
  public static final int PLUS_PLUS_KW = 310;
  /** Token number, to be returned by the scanner.  */
  public static final int MINUS_MINUS_KW = 311;
  /** Token number, to be returned by the scanner.  */
  public static final int MINUS_EQUAL_KW = 312;
  /** Token number, to be returned by the scanner.  */
  public static final int MULTIPLY_EQUAL_KW = 313;
  /** Token number, to be returned by the scanner.  */
  public static final int ADAD_ASHARI = 314;
  /** Token number, to be returned by the scanner.  */
  public static final int MAIN_KW = 315;
  /** Token number, to be returned by the scanner.  */
  public static final int LOWER_THAN_ELSE_KW = 316;



  

  /**
   * Communication interface between the scanner and the Bison-generated
   * parser <tt>YYParser</tt>.
   */
  public interface Lexer {
    

    /**
     * Method to retrieve the semantic value of the last scanned token.
     * @return the semantic value of the last scanned token.  */
    Object getLVal ();

    /**
     * Entry point for the scanner.  Returns the token identifier corresponding
     * to the next token and prepares to return the semantic value
     * of the token. 
     * @return the token identifier corresponding to the next token. */
    int yylex () throws java.io.IOException;

    /**
     * Entry point for error reporting.  Emits an error
     * in a user-defined way.
     *
     * 
     * @param s The string for the error message.  */
     void yyerror (String s);
  }

  /** The object doing lexical analysis for us.  */
  private Lexer yylexer;
  
  



  /**
   * Instantiates the Bison-generated parser.
   * @param yylexer The scanner that will supply tokens to the parser.
   */
  public YYParser (Lexer yylexer) {
    this.yylexer = yylexer;
    
  }

  private java.io.PrintStream yyDebugStream = System.err;

  /**
   * Return the <tt>PrintStream</tt> on which the debugging output is
   * printed.
   */
  public final java.io.PrintStream getDebugStream () { return yyDebugStream; }

  /**
   * Set the <tt>PrintStream</tt> on which the debug output is printed.
   * @param s The stream that is used for debugging output.
   */
  public final void setDebugStream(java.io.PrintStream s) { yyDebugStream = s; }

  private int yydebug = 0;

  /**
   * Answer the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   */
  public final int getDebugLevel() { return yydebug; }

  /**
   * Set the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   * @param level The verbosity level for debugging output.
   */
  public final void setDebugLevel(int level) { yydebug = level; }

  private final int yylex () throws java.io.IOException {
    return yylexer.yylex ();
  }
  protected final void yyerror (String s) {
    yylexer.yyerror (s);
  }

  

  protected final void yycdebug (String s) {
    if (yydebug > 0)
      yyDebugStream.println (s);
  }

  private final class YYStack {
    private int[] stateStack = new int[16];
    
    private Object[] valueStack = new Object[16];

    public int size = 16;
    public int height = -1;
    
    public final void push (int state, Object value    	   	      	    ) {
      height++;
      if (size == height) 
        {
	  int[] newStateStack = new int[size * 2];
	  System.arraycopy (stateStack, 0, newStateStack, 0, height);
	  stateStack = newStateStack;
	  
	  
	  Object[] newValueStack = new Object[size * 2];
	  System.arraycopy (valueStack, 0, newValueStack, 0, height);
	  valueStack = newValueStack;

	  size *= 2;
	}

      stateStack[height] = state;
      
      valueStack[height] = value;
    }

    public final void pop () {
      height--;
    }

    public final void pop (int num) {
      // Avoid memory leaks... garbage collection is a white lie!
      if (num > 0) {
	java.util.Arrays.fill (valueStack, height - num + 1, height, null);
        
      }
      height -= num;
    }

    public final int stateAt (int i) {
      return stateStack[height - i];
    }

    public final Object valueAt (int i) {
      return valueStack[height - i];
    }

    // Print the state stack on the debug stream.
    public void print (java.io.PrintStream out)
    {
      out.print ("Stack now");
      
      for (int i = 0; i < height; i++)
        {
	  out.print (' ');
	  out.print (stateStack[i]);
        }
      out.println ();
    }
  }

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return success (<tt>true</tt>).  */
  public static final int YYACCEPT = 0;

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return failure (<tt>false</tt>).  */
  public static final int YYABORT = 1;

  /**
   * Returned by a Bison action in order to start error recovery without
   * printing an error message.  */
  public static final int YYERROR = 2;

  /**
   * Returned by a Bison action in order to print an error message and start
   * error recovery.  */
  public static final int YYFAIL = 3;

  private static final int YYNEWSTATE = 4;
  private static final int YYDEFAULT = 5;
  private static final int YYREDUCE = 6;
  private static final int YYERRLAB1 = 7;
  private static final int YYRETURN = 8;

  private int yyerrstatus_ = 0;

  /**
   * Return whether error recovery is being done.  In this state, the parser
   * reads token until it reaches a known state, and then restarts normal
   * operation.  */
  public final boolean recovering ()
  {
    return yyerrstatus_ == 0;
  }

  private int yyaction (int yyn, YYStack yystack, int yylen) 
  {
    Object yyval;
    

    /* If YYLEN is nonzero, implement the default value of the action:
       `$$ = $1'.  Otherwise, use the top of the stack.
    
       Otherwise, the following line sets YYVAL to garbage.
       This behavior is undocumented and Bison
       users should not rely upon it.  */
    if (yylen > 0)
      yyval = yystack.valueAt (yylen - 1);
    else
      yyval = yystack.valueAt (0);
    
    yy_reduce_print (yyn, yystack);

    switch (yyn)
      {
	  case 2:
  if (yyn == 2)
    
/* Line 353 of lalr1.java  */
/* Line 220 of "YYParser.y"  */
    {
		System.out.println("Rule 1.1 ");
		exportIntermediateCode();
	};
  break;
    

  case 3:
  if (yyn == 3)
    
/* Line 353 of lalr1.java  */
/* Line 226 of "YYParser.y"  */
    {
		System.out.println("Rule 2.1: ");
	};
  break;
    

  case 4:
  if (yyn == 4)
    
/* Line 353 of lalr1.java  */
/* Line 229 of "YYParser.y"  */
    {
		System.out.println("Rule 2.2");
	};
  break;
    

  case 5:
  if (yyn == 5)
    
/* Line 353 of lalr1.java  */
/* Line 234 of "YYParser.y"  */
    {
		System.out.println("Rule 3.1: ");
	};
  break;
    

  case 6:
  if (yyn == 6)
    
/* Line 353 of lalr1.java  */
/* Line 237 of "YYParser.y"  */
    {
		System.out.println("Rule 3.2: " );
	};
  break;
    

  case 7:
  if (yyn == 7)
    
/* Line 353 of lalr1.java  */
/* Line 240 of "YYParser.y"  */
    {
		System.out.println("Rule 3.3: " );
	};
  break;
    

  case 8:
  if (yyn == 8)
    
/* Line 353 of lalr1.java  */
/* Line 245 of "YYParser.y"  */
    {
		System.out.println("Rule 4.1 ");
		symbolTable.addToSymbolTable(((EVal)(yystack.valueAt (5-(2)))).place, EVal.TYPE_CODE_INTEGER, false);
	};
  break;
    

  case 9:
  if (yyn == 9)
    
/* Line 353 of lalr1.java  */
/* Line 250 of "YYParser.y"  */
    {
		System.out.println("Rule 4.2 ");
		symbolTable.addToSymbolTable(((EVal)(yystack.valueAt (4-(2)))).place, EVal.TYPE_CODE_INTEGER, false);
	};
  break;
    

  case 10:
  if (yyn == 10)
    
/* Line 353 of lalr1.java  */
/* Line 256 of "YYParser.y"  */
    {
		System.out.println("Rule 5 ");
	};
  break;
    

  case 11:
  if (yyn == 11)
    
/* Line 353 of lalr1.java  */
/* Line 260 of "YYParser.y"  */
    {
		System.out.println("Rule 5 ");
	};
  break;
    

  case 12:
  if (yyn == 12)
    
/* Line 353 of lalr1.java  */
/* Line 265 of "YYParser.y"  */
    {
		System.out.println("Rule 6 eha");
		System.out.println("Rule 9");
		
		System.out.println("Rule 3: " +
			"declarations: type_specifiers declarator_list");
		//System.out.println($1.type+" "+$2.type);
		if(((EVal)(yystack.valueAt (3-(2)))).type == EVal.TYPE_CODE_UNKNOWN || ((EVal)(yystack.valueAt (3-(1)))).type >= ((EVal)(yystack.valueAt (3-(2)))).type) {
			for(int i = 0; i < ((EVal)(yystack.valueAt (3-(2)))).initializersList.size(); i++) {
				if(symbolTable.lookUp(sizeStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place) == SymbolTable.NOT_IN_SYMBOL_TABLE) {
					symbolTable.addToSymbolTable(((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, ((EVal)(yystack.valueAt (3-(1)))).type, false);
					if(((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i) != null && ((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i).size() == 1) {
						//if($1.type != EVal.TYPE_CODE_BOOLEAN) {
							emit(":=", ((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i).get(0).place, null, ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
							switch (((EVal)(yystack.valueAt (3-(1)))).type) {
								case EVal.TYPE_CODE_INTEGER:
									emit("iprint", null, null, ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
									break;
								case EVal.TYPE_CODE_REAL:
									emit("rprint", null, null, ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
									break;
								case EVal.TYPE_CODE_CHAR:
									emit("cprint", null, null, ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
									break;
								case EVal.TYPE_CODE_BOOLEAN:
									emit("bprint", null, null, ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
									break;
							}
						//} else {
							// backpatch($2.initializersList.get(i).get(0).falseList, nextQuad());
							// backpatch($2.initializersList.get(i).get(0).trueList, nextQuad() + 2);
						//	emit(":=", "0", null, $2.declareds.get(i).place);
						//	emit("goto", null, null, String.valueOf(nextQuad() + 2));
						//	emit(":=", "1", null, $2.declareds.get(i).place);
						//	emit("bprint", null, null, $2.declareds.get(i).place);
						//}
					} else if(((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i) != null) {
						System.err.println("Error! Initializer number mismatch. (Expected: 1" + ", Number: " + ((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i).size() + ")");
						return YYABORT;
					}
				} else {
					symbolTable.addToSymbolTable(((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, ((EVal)(yystack.valueAt (3-(1)))).type, true);
					emit("malloc", getTypeString(((EVal)(yystack.valueAt (3-(1)))).type), sizeStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
					if(((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i) != null) {
						for(int j = 0; j < ((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i).size(); j++) {
							EVal.arrayIndexOutOfBoundList.add(nextQuad() + 1);
							emit(">=", String.valueOf(j), sizeStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
							emit("check", condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, null, String.valueOf(nextQuad() + 2)); // Result will be backpatched.
							//if($1.type != EVal.TYPE_CODE_BOOLEAN) {
								emit("[]=", ((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i).get(j).place, String.valueOf(j), ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
								emit("+", startStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, String.valueOf(j), condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
								switch (((EVal)(yystack.valueAt (3-(1)))).type) {
									case EVal.TYPE_CODE_INTEGER:
										emit("aiprint", condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, String.valueOf(j), ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
										break;
									case EVal.TYPE_CODE_REAL:
										emit("arprint", condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, String.valueOf(j), ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
										break;
									case EVal.TYPE_CODE_CHAR:
										emit("acprint", condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, String.valueOf(j), ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
										break;
								}
							//} else {
								// backpatch($2.initializersList.get(i).get(j).falseList, nextQuad());
								// backpatch($2.initializersList.get(i).get(j).trueList, nextQuad() + 2);
							//	emit("[]=", "0", String.valueOf(j), $2.declareds.get(i).place);
							//	emit("goto", null, null, String.valueOf(nextQuad() + 2));
							//	emit("[]=", "1", String.valueOf(j), $2.declareds.get(i).place);
							//	emit("abprint", condStr + $2.declareds.get(i).place, String.valueOf(j), $2.declareds.get(i).place);
							//}
						}
					}
				}
			}
		} else {
			/*System.err.println("Error! Type specifier type mismatch. (" + $1.type + ", " + $2.type + ")");
			return YYABORT;*/
		}
	};
  break;
    

  case 13:
  if (yyn == 13)
    
/* Line 353 of lalr1.java  */
/* Line 346 of "YYParser.y"  */
    {
	System.out.println("Rule 8.1");
	
		yyval = new EVal();
		((EVal)yyval).type = EVal.TYPE_CODE_INTEGER;
		((EVal)yyval).nextList = EVal.makeList(nextQuad());
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result will be backpatched.
	};
  break;
    

  case 14:
  if (yyn == 14)
    
/* Line 353 of lalr1.java  */
/* Line 354 of "YYParser.y"  */
    {
	System.out.println("Rule 8.2");
		yyval = new EVal();
		((EVal)yyval).type = EVal.TYPE_CODE_REAL;
		((EVal)yyval).nextList = EVal.makeList(nextQuad());
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result will be backpatched.
	};
  break;
    

  case 15:
  if (yyn == 15)
    
/* Line 353 of lalr1.java  */
/* Line 361 of "YYParser.y"  */
    {
		System.out.println("Rule 8.3");
		yyval = new EVal();
		((EVal)yyval).type = EVal.TYPE_CODE_CHAR;
		((EVal)yyval).nextList = EVal.makeList(nextQuad());
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result will be backpatched.
	};
  break;
    

  case 16:
  if (yyn == 16)
    
/* Line 353 of lalr1.java  */
/* Line 368 of "YYParser.y"  */
    {
		System.out.println("Rule 8.4");
		yyval = new EVal();
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)yyval).nextList = EVal.makeList(nextQuad());
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result will be backpatched.
	};
  break;
    

  case 17:
  if (yyn == 17)
    
/* Line 353 of lalr1.java  */
/* Line 377 of "YYParser.y"  */
    {
		System.out.println("Rule 9");
		
		System.out.println("Rule 3: " +
			"declarations: type_specifiers declarator_list");
		System.out.println(((EVal)(yystack.valueAt (3-(1)))).type+" "+((EVal)(yystack.valueAt (3-(2)))).type);
		if(((EVal)(yystack.valueAt (3-(2)))).type == EVal.TYPE_CODE_UNKNOWN || ((EVal)(yystack.valueAt (3-(1)))).type == ((EVal)(yystack.valueAt (3-(2)))).type) {
			for(int i = 0; i < ((EVal)(yystack.valueAt (3-(2)))).initializersList.size(); i++) {
				if(symbolTable.lookUp(sizeStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place) == SymbolTable.NOT_IN_SYMBOL_TABLE) {
					symbolTable.addToSymbolTable(((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, ((EVal)(yystack.valueAt (3-(1)))).type, false);
					if(((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i) != null && ((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i).size() == 1) {
						//if($1.type != EVal.TYPE_CODE_BOOLEAN) {
							emit(":=", ((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i).get(0).place, null, ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
							switch (((EVal)(yystack.valueAt (3-(1)))).type) {
								case EVal.TYPE_CODE_INTEGER:
									emit("iprint", null, null, ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
									break;
								case EVal.TYPE_CODE_REAL:
									emit("rprint", null, null, ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
									break;
								case EVal.TYPE_CODE_CHAR:
									emit("cprint", null, null, ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
									break;
							}
						//} else {
							// backpatch($2.initializersList.get(i).get(0).falseList, nextQuad());
							// backpatch($2.initializersList.get(i).get(0).trueList, nextQuad() + 2);
						//	emit(":=", "0", null, $2.declareds.get(i).place);
						//	emit("goto", null, null, String.valueOf(nextQuad() + 2));
						//	emit(":=", "1", null, $2.declareds.get(i).place);
						//	emit("bprint", null, null, $2.declareds.get(i).place);
						//}
					} else if(((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i) != null) {
						//System.err.println("Error! Initializer number mismatch. (Expected: //1" + ", Number: " + $2.initializersList.get(i).size() + ")");
						//return YYABORT;
					}
				} else {
					symbolTable.addToSymbolTable(((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, ((EVal)(yystack.valueAt (3-(1)))).type, true);
					emit("malloc", getTypeString(((EVal)(yystack.valueAt (3-(1)))).type), sizeStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
					if(((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i) != null) {
						for(int j = 0; j < ((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i).size(); j++) {
							EVal.arrayIndexOutOfBoundList.add(nextQuad() + 1);
							emit(">=", String.valueOf(j), sizeStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
							emit("check", condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, null, String.valueOf(nextQuad() + 2)); // Result will be backpatched.
							//if($1.type != EVal.TYPE_CODE_BOOLEAN) {
								emit("[]=", ((EVal)(yystack.valueAt (3-(2)))).initializersList.get(i).get(j).place, String.valueOf(j), ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
								emit("+", startStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, String.valueOf(j), condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
								switch (((EVal)(yystack.valueAt (3-(1)))).type) {
									case EVal.TYPE_CODE_INTEGER:
										emit("aiprint", condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, String.valueOf(j), ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
										break;
									case EVal.TYPE_CODE_REAL:
										emit("arprint", condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, String.valueOf(j), ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
										break;
									case EVal.TYPE_CODE_CHAR:
										emit("acprint", condStr + ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place, String.valueOf(j), ((EVal)(yystack.valueAt (3-(2)))).declareds.get(i).place);
										break;
								}
							//} else {
								// backpatch($2.initializersList.get(i).get(j).falseList, nextQuad());
								// backpatch($2.initializersList.get(i).get(j).trueList, nextQuad() + 2);
							//	emit("[]=", "0", String.valueOf(j), $2.declareds.get(i).place);
							//	emit("goto", null, null, String.valueOf(nextQuad() + 2));
							//	emit("[]=", "1", String.valueOf(j), $2.declareds.get(i).place);
							//	emit("abprint", condStr + $2.declareds.get(i).place, String.valueOf(j), $2.declareds.get(i).place);
							//}
						}
					}
				}
			}
		} else {
			System.out.println("Error! Type specifier type mismatch. (" + ((EVal)(yystack.valueAt (3-(1)))).type + ", " + ((EVal)(yystack.valueAt (3-(2)))).type + ")");
			//return YYABORT;
		}
	};
  break;
    

  case 18:
  if (yyn == 18)
    
/* Line 353 of lalr1.java  */
/* Line 454 of "YYParser.y"  */
    {
		System.out.println("Rule 10.1 ");
		
		System.out.println("Rule 5.2: " +
			"delarator_list: declarator_end 00");
		yyval = new EVal();
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
		((EVal)yyval).declareds = EVal.makeInitializersOrDeclareds(((EVal)(yystack.valueAt (1-(1)))));
		((EVal)yyval).initializersList = EVal.makeInitializersList(((EVal)(yystack.valueAt (1-(1)))).initializers);
	};
  break;
    

  case 19:
  if (yyn == 19)
    
/* Line 353 of lalr1.java  */
/* Line 466 of "YYParser.y"  */
    {
		System.out.println("Rule 5.1: " +
			"declarator_list: declarator_list declarator");
		if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_UNKNOWN
			|| ((EVal)(yystack.valueAt (3-(1)))).type == ((EVal)(yystack.valueAt (3-(3)))).type) {
			yyval = new EVal();
			((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(3)))).type;
			((EVal)yyval).declareds = ((EVal)(yystack.valueAt (3-(1)))).declareds;
			((EVal)yyval).declareds.add(((EVal)(yystack.valueAt (3-(3)))));
			((EVal)yyval).initializersList = ((EVal)(yystack.valueAt (3-(1)))).initializersList;
			((EVal)yyval).initializersList.add(((EVal)(yystack.valueAt (3-(3)))).initializers);
		} else {
			//System.err.println("Error! Declarator type mismatch.");
			//return YYABORT;
		}
	};
  break;
    

  case 20:
  if (yyn == 20)
    
/* Line 353 of lalr1.java  */
/* Line 484 of "YYParser.y"  */
    {
	System.out.println("Rule 11.1 ");
		yyval = new EVal();
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).array = false;
	};
  break;
    

  case 21:
  if (yyn == 21)
    
/* Line 353 of lalr1.java  */
/* Line 490 of "YYParser.y"  */
    {
		System.out.println("Rule 11.2 ");
		/*if($1.array != $3.array) {
			System.err.println("Error! Array mismatch: " + $1.place + " and " + $3.place + " are not the same.");
			return YYABORT;
		}*/
		
		if(((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN){
		backpatch(((EVal)(yystack.valueAt (3-(3)))).trueList, nextQuad() );
		backpatch(((EVal)(yystack.valueAt (3-(3)))).falseList, nextQuad() + 2);
		
		emit(":=", "1", null, ((EVal)(yystack.valueAt (3-(1)))).place);
		emit("goto", null, null, String.valueOf(nextQuad() + 2));
		emit(":=", "0", null, ((EVal)(yystack.valueAt (3-(1)))).place);
		yyval = new EVal();
		((EVal)yyval).place = ((EVal)(yystack.valueAt (3-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(3)))).type;
		((EVal)yyval).array = ((EVal)(yystack.valueAt (3-(1)))).array;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (3-(3)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (3-(3)))).falseList;
		((EVal)yyval).initializers = ((EVal)(yystack.valueAt (3-(3)))).initializers;
		
		}
		else{
		yyval = new EVal();
		((EVal)yyval).place = ((EVal)(yystack.valueAt (3-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(3)))).type;
		((EVal)yyval).array = ((EVal)(yystack.valueAt (3-(1)))).array;
		((EVal)yyval).initializers = ((EVal)(yystack.valueAt (3-(3)))).initializers;
		emit(":=", ((EVal)(yystack.valueAt (3-(3)))).place, null, ((EVal)(yystack.valueAt (3-(1)))).place);
		}
	};
  break;
    

  case 22:
  if (yyn == 22)
    
/* Line 353 of lalr1.java  */
/* Line 524 of "YYParser.y"  */
    {
		System.out.println("Rule 8.1: " +
			"dec: saved_identifier");
		yyval = new EVal();
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).array = false;
	};
  break;
    

  case 23:
  if (yyn == 23)
    
/* Line 353 of lalr1.java  */
/* Line 531 of "YYParser.y"  */
    {
		
		System.out.println("Rule 8.3: " +
			"dec: saved_identifier LB_KW saved_integer RB_KW");
		yyval = new EVal();
		((EVal)yyval).place = ((EVal)(yystack.valueAt (4-(1)))).place;
		((EVal)yyval).array = true;

		symbolTable.addToSymbolTable(startStr + ((EVal)yyval).place, EVal.TYPE_CODE_INTEGER, false);
		emit(":=", "0", null , startStr + ((EVal)yyval).place);

		symbolTable.addToSymbolTable(sizeStr + ((EVal)yyval).place, EVal.TYPE_CODE_INTEGER, false);
		emit(":=", ((EVal)(yystack.valueAt (4-(3)))).place, null , sizeStr + ((EVal)yyval).place);

		symbolTable.addToSymbolTable(indexStr + ((EVal)yyval).place, EVal.TYPE_CODE_INTEGER, false);
		symbolTable.addToSymbolTable(condStr + ((EVal)yyval).place, EVal.TYPE_CODE_INTEGER, false);
	};
  break;
    

  case 24:
  if (yyn == 24)
    
/* Line 353 of lalr1.java  */
/* Line 550 of "YYParser.y"  */
    {
	
		emit(":=", "sp", null, "top");
	};
  break;
    

  case 25:
  if (yyn == 25)
    
/* Line 353 of lalr1.java  */
/* Line 556 of "YYParser.y"  */
    {
		yyval = new EVal();
		((EVal)yyval).place = ((EVal)(yystack.valueAt (2-(1)))).place;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (2-(1)))).nextList;
		
		top++;
		function_names[top] = ((EVal)(yystack.valueAt (2-(1)))).place;
		System.out.println(function_names[top]);
		
	};
  break;
    

  case 26:
  if (yyn == 26)
    
/* Line 353 of lalr1.java  */
/* Line 569 of "YYParser.y"  */
    {
		System.out.println("Rule 13.1");
		backpatch(((EVal)(yystack.valueAt (4-(1)))).nextList, (quadruples.size()));
		
		symbolTable.addFunction(((EVal)(yystack.valueAt (4-(2)))).place, ((EVal)(yystack.valueAt (4-(1)))).nextList.get(0)+1);
		
		top--;
		
	};
  break;
    

  case 27:
  if (yyn == 27)
    
/* Line 353 of lalr1.java  */
/* Line 579 of "YYParser.y"  */
    {
		System.out.println("Rule 13.2");
		backpatch(((EVal)(yystack.valueAt (4-(1)))).nextList, (quadruples.size()));
		System.out.println(((EVal)(yystack.valueAt (4-(1)))).nextList.get(0)+1);
		symbolTable.addFunction(((EVal)(yystack.valueAt (4-(2)))).place, ((EVal)(yystack.valueAt (4-(1)))).nextList.get(0)+1);
	};
  break;
    

  case 28:
  if (yyn == 28)
    
/* Line 353 of lalr1.java  */
/* Line 587 of "YYParser.y"  */
    {
		System.out.println("Rule 13.3");
		backpatch(((EVal)(yystack.valueAt (3-(1)))).nextList, (quadruples.size()));
		
		symbolTable.addFunction(((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(1)))).nextList.get(0)+1);
	};
  break;
    

  case 29:
  if (yyn == 29)
    
/* Line 353 of lalr1.java  */
/* Line 594 of "YYParser.y"  */
    {
	System.out.println("Rule 13.4");
	
		backpatch(((EVal)(yystack.valueAt (3-(1)))).nextList, (quadruples.size()));
		System.out.println(((EVal)(yystack.valueAt (3-(1)))).nextList.get(0)+1);
		symbolTable.addFunction(((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(1)))).nextList.get(0)+1);
	};
  break;
    

  case 30:
  if (yyn == 30)
    
/* Line 353 of lalr1.java  */
/* Line 603 of "YYParser.y"  */
    {System.out.println("Rule 15.1");};
  break;
    

  case 31:
  if (yyn == 31)
    
/* Line 353 of lalr1.java  */
/* Line 605 of "YYParser.y"  */
    {System.out.println("Rule 15.2");};
  break;
    

  case 32:
  if (yyn == 32)
    
/* Line 353 of lalr1.java  */
/* Line 608 of "YYParser.y"  */
    {System.out.println("Rule 16");};
  break;
    

  case 33:
  if (yyn == 33)
    
/* Line 353 of lalr1.java  */
/* Line 611 of "YYParser.y"  */
    {System.out.println("Rule 17.1");};
  break;
    

  case 34:
  if (yyn == 34)
    
/* Line 353 of lalr1.java  */
/* Line 613 of "YYParser.y"  */
    {System.out.println("Rule 17.2");};
  break;
    

  case 35:
  if (yyn == 35)
    
/* Line 353 of lalr1.java  */
/* Line 616 of "YYParser.y"  */
    {
		System.out.println("Rule 18.1");
		symbolTable.addToSymbolTable(((EVal)(yystack.valueAt (1-(1)))).place, ((EVal)(yystack.valueAt (1-(1)))).type, false);
		emit(":=","stack[top]" , null, ((EVal)(yystack.valueAt (1-(1)))).place);
		emit("-", "top", "1", "top");
		};
  break;
    

  case 36:
  if (yyn == 36)
    
/* Line 353 of lalr1.java  */
/* Line 622 of "YYParser.y"  */
    {System.out.println("Rule 18.2");};
  break;
    

  case 37:
  if (yyn == 37)
    
/* Line 353 of lalr1.java  */
/* Line 625 of "YYParser.y"  */
    {
		System.out.println("jomle: matched N");
		yyval = new EVal();
	(	(EVal)yyval).nextList = ((EVal)(yystack.valueAt (2-(1)))).nextList;
	};
  break;
    

  case 38:
  if (yyn == 38)
    
/* Line 353 of lalr1.java  */
/* Line 630 of "YYParser.y"  */
    {
		System.out.println("jomle: unmatched");
		yyval = new EVal();
	((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
	};
  break;
    

  case 39:
  if (yyn == 39)
    
/* Line 353 of lalr1.java  */
/* Line 638 of "YYParser.y"  */
    {System.out.println("Rule 19.1");
	yyval = new EVal();
	((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
	};
  break;
    

  case 40:
  if (yyn == 40)
    
/* Line 353 of lalr1.java  */
/* Line 643 of "YYParser.y"  */
    {System.out.println("Rule 19.2");
	yyval = new EVal();
	((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;};
  break;
    

  case 41:
  if (yyn == 41)
    
/* Line 353 of lalr1.java  */
/* Line 647 of "YYParser.y"  */
    {System.out.println("Rule 19.3");
	yyval = new EVal();
	((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;};
  break;
    

  case 42:
  if (yyn == 42)
    
/* Line 353 of lalr1.java  */
/* Line 651 of "YYParser.y"  */
    {System.out.println("Rule 19.4");
	yyval = new EVal();
	((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;};
  break;
    

  case 43:
  if (yyn == 43)
    
/* Line 353 of lalr1.java  */
/* Line 655 of "YYParser.y"  */
    {System.out.println("Rule 19.5");
	yyval = new EVal();
	((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;};
  break;
    

  case 44:
  if (yyn == 44)
    
/* Line 353 of lalr1.java  */
/* Line 659 of "YYParser.y"  */
    {System.out.println("Rule 19.6");
	yyval = new EVal();
	((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;};
  break;
    

  case 45:
  if (yyn == 45)
    
/* Line 353 of lalr1.java  */
/* Line 664 of "YYParser.y"  */
    {
		System.out.println("Rule 20.1");
		yyval = new EVal();
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (4-(3)))).nextList;
	};
  break;
    

  case 46:
  if (yyn == 46)
    
/* Line 353 of lalr1.java  */
/* Line 670 of "YYParser.y"  */
    {
		System.out.println("Rule 20.2");
		yyval = new EVal();
		((EVal)yyval).nextList = EVal.makeList(0);		
	};
  break;
    

  case 47:
  if (yyn == 47)
    
/* Line 353 of lalr1.java  */
/* Line 676 of "YYParser.y"  */
    {
		System.out.println("Rule 20.3");
		yyval = new EVal();
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (3-(2)))).nextList;
		
	};
  break;
    

  case 48:
  if (yyn == 48)
    
/* Line 353 of lalr1.java  */
/* Line 683 of "YYParser.y"  */
    {
		System.out.println("Rule 20.4");
	};
  break;
    

  case 49:
  if (yyn == 49)
    
/* Line 353 of lalr1.java  */
/* Line 688 of "YYParser.y"  */
    {
	System.out.println("Rule 21.1 jomleha : jomleha M jomle");
	yyval = new EVal();
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (3-(3)))).nextList;
		backpatch(((EVal)(yystack.valueAt (3-(1)))).nextList, ((EVal)(yystack.valueAt (3-(2)))).quad);
	};
  break;
    

  case 50:
  if (yyn == 50)
    
/* Line 353 of lalr1.java  */
/* Line 695 of "YYParser.y"  */
    {
	System.out.println("Rule 21.2 jomleha : jomle");
	yyval = new EVal();
	((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
	};
  break;
    

  case 51:
  if (yyn == 51)
    
/* Line 353 of lalr1.java  */
/* Line 703 of "YYParser.y"  */
    {
		System.out.println("Rule 22.1 jomleyeEbarat : ebarat NOGHTE_VIRGUL M");
		yyval = new EVal();
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (3-(1)))).nextList;
	
	};
  break;
    

  case 52:
  if (yyn == 52)
    
/* Line 353 of lalr1.java  */
/* Line 710 of "YYParser.y"  */
    {
	System.out.println("Rule 22.2 jomleyeEbarat : NOGHTE_VIRGUL M");
	yyval = new EVal();
	((EVal)yyval).nextList = EVal.makeList(((EVal)(yystack.valueAt (2-(2)))).quad);
	};
  break;
    

  case 53:
  if (yyn == 53)
    
/* Line 353 of lalr1.java  */
/* Line 716 of "YYParser.y"  */
    {
		System.out.println("Rule 23.2 jomleyeEntekhab : IF_KW ebarateRiaziManteghi THEN_KW M jomle N ELSE_KW M jomle ");
		yyval = new EVal();
		backpatch(((EVal)(yystack.valueAt (9-(2)))).trueList, ((EVal)(yystack.valueAt (9-(4)))).quad);
		backpatch(((EVal)(yystack.valueAt (9-(2)))).falseList, ((EVal)(yystack.valueAt (9-(8)))).quad);
		((EVal)yyval).nextList = EVal.merge(((EVal)(yystack.valueAt (9-(5)))).nextList, ((EVal)(yystack.valueAt (9-(6)))).nextList);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).nextList, ((EVal)(yystack.valueAt (9-(9)))).nextList);

	};
  break;
    

  case 54:
  if (yyn == 54)
    
/* Line 353 of lalr1.java  */
/* Line 726 of "YYParser.y"  */
    {
		System.out.println("Rule otherjomle " +
			"statement: otherjomle");
		yyval = new EVal();
	((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
	};
  break;
    

  case 55:
  if (yyn == 55)
    
/* Line 353 of lalr1.java  */
/* Line 733 of "YYParser.y"  */
    {
		System.out.println("Rule 21.1: " +
			"unmatched: IF_KW ebarateSade THEN_KW M matched N ELSE_KW M unmatched");
		yyval = new EVal();
		backpatch(((EVal)(yystack.valueAt (9-(2)))).trueList, ((EVal)(yystack.valueAt (9-(4)))).quad);
		backpatch(((EVal)(yystack.valueAt (9-(2)))).falseList, ((EVal)(yystack.valueAt (9-(8)))).quad);
		((EVal)yyval).nextList = EVal.merge(((EVal)(yystack.valueAt (9-(5)))).nextList, ((EVal)(yystack.valueAt (9-(6)))).nextList);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).nextList, ((EVal)(yystack.valueAt (9-(9)))).nextList);
	};
  break;
    

  case 56:
  if (yyn == 56)
    
/* Line 353 of lalr1.java  */
/* Line 742 of "YYParser.y"  */
    {
		System.out.println("Rule 21.2: " +
			"unmatched: IF_KW ebarateSade THEN_KW M statement");
		yyval = new EVal();
		backpatch(((EVal)(yystack.valueAt (5-(2)))).trueList, ((EVal)(yystack.valueAt (5-(4)))).quad);
		((EVal)yyval).nextList = EVal.merge(((EVal)(yystack.valueAt (5-(2)))).falseList, ((EVal)(yystack.valueAt (5-(5)))).nextList);
	};
  break;
    

  case 57:
  if (yyn == 57)
    
/* Line 353 of lalr1.java  */
/* Line 752 of "YYParser.y"  */
    {
	System.out.println("Rule 23.3 jomleyeEntekhab : KEY_KW PARANTHESIS_BAZ_KW ebarateSade PARANTHESIS_BASTE onsoreHalat onsorePishfarz END_KW ");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_INTEGER, false);
		((EVal)yyval).nextList = EVal.merge(((EVal)(yystack.valueAt (8-(6)))).nextList, ((EVal)(yystack.valueAt (8-(7)))).nextList);

		int last = ((EVal)(yystack.valueAt (8-(6)))).falseList.size() - 1;
		backpatch(((EVal)(yystack.valueAt (8-(5)))).nextList, ((EVal)(yystack.valueAt (8-(6)))).initList.get(0));
		backpatch(((EVal)(yystack.valueAt (8-(6)))).falseList.get(last), nextQuad());
		for(int i = 0; i < ((EVal)(yystack.valueAt (8-(6)))).declareds.size() - 1; i++) {
			backpatch(((EVal)(yystack.valueAt (8-(6)))).falseList.get(i), ((EVal)(yystack.valueAt (8-(6)))).initList.get(i + 1));

			emit("=", ((EVal)(yystack.valueAt (8-(3)))).place, ((EVal)(yystack.valueAt (8-(6)))).declareds.get(i).place, ((EVal)yyval).place);
			emit("check", ((EVal)yyval).place, null, String.valueOf(((EVal)(yystack.valueAt (8-(6)))).trueList.get(i))); // result will not be backpatched.
		}
		emit("=", ((EVal)(yystack.valueAt (8-(3)))).place, ((EVal)(yystack.valueAt (8-(6)))).declareds.get(last).place, ((EVal)yyval).place);
		emit("check", ((EVal)yyval).place, null, String.valueOf(((EVal)(yystack.valueAt (8-(6)))).trueList.get(last))); // result will not be backpatched.

		emit("goto", null, null, String.valueOf(((EVal)(yystack.valueAt (8-(7)))).quad)); // result will not be backpatched.


	};
  break;
    

  case 58:
  if (yyn == 58)
    
/* Line 353 of lalr1.java  */
/* Line 776 of "YYParser.y"  */
    {
		System.out.println("Rule 23.4");
		
		System.out.println("Rule 22.5.2: " +
			"other_statement: SWITCH_KW expressions N caseelement END_KW");
		if(((EVal)(yystack.valueAt (7-(5)))).type != EVal.TYPE_CODE_INTEGER) {
			System.err.println("Error! Switch expression type mismatch. (\"" + ((EVal)(yystack.valueAt (7-(3)))).place + "\" is not integer.)");
			return YYABORT;
		}
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_INTEGER, false);
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (7-(6)))).nextList;

		int last = ((EVal)(yystack.valueAt (7-(6)))).falseList.size() - 1;
		backpatch(((EVal)(yystack.valueAt (7-(5)))).nextList, ((EVal)(yystack.valueAt (7-(6)))).initList.get(0));
		backpatch(((EVal)(yystack.valueAt (7-(6)))).falseList.get(last), nextQuad());
		for(int i = 0; i < ((EVal)(yystack.valueAt (7-(6)))).declareds.size() - 1; i++) {
			backpatch(((EVal)(yystack.valueAt (7-(6)))).falseList.get(i), ((EVal)(yystack.valueAt (7-(6)))).initList.get(i + 1));

			emit("=", ((EVal)(yystack.valueAt (7-(3)))).place, ((EVal)(yystack.valueAt (7-(6)))).declareds.get(i).place, ((EVal)yyval).place);
			emit("check", ((EVal)yyval).place, null, String.valueOf(((EVal)(yystack.valueAt (7-(6)))).trueList.get(i))); // result will not be backpatched.
		}
		emit("=", ((EVal)(yystack.valueAt (7-(3)))).place, ((EVal)(yystack.valueAt (7-(6)))).declareds.get(last).place, ((EVal)yyval).place);
		
		emit("check", ((EVal)yyval).place, null, String.valueOf(((EVal)(yystack.valueAt (7-(6)))).trueList.get(last))); // result will not be backpatched.

		((EVal)yyval).nextList.add(nextQuad());
		emit("goto", null, null, String.valueOf(nextQuad())); // result will be backpatched.
	};
  break;
    

  case 59:
  if (yyn == 59)
    
/* Line 353 of lalr1.java  */
/* Line 809 of "YYParser.y"  */
    { System.out.println("Rule 24.1 onsoreHalat : SWITCH_KW M saved_integer N  DONOGHTE_KW M jomle NOGHTE_VIRGUL");
	yyval = new EVal();
		((EVal)yyval).initList = EVal.makeList(((EVal)(yystack.valueAt (7-(2)))).quad); // Starting point of saving saved_integer is stored in initList;
		((EVal)yyval).declareds = EVal.makeInitializersOrDeclareds(((EVal)(yystack.valueAt (7-(3))))); // saved_integer value is stored in declareds.
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (7-(4)))).nextList; // If there is another init point this will be backpatched to next init point, else to test point.
		((EVal)yyval).trueList = EVal.makeList(((EVal)(yystack.valueAt (7-(6)))).quad); // Starting point of block is stored in trueList;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (7-(7)))).nextList;

	 };
  break;
    

  case 60:
  if (yyn == 60)
    
/* Line 353 of lalr1.java  */
/* Line 819 of "YYParser.y"  */
    {System.out.println("Rule 24.2 onsoreHalat : onsoreHalat SWITCH_KW M saved_integer N DONOGHTE_KW M jomle NOGHTE_VIRGUL");
	yyval = new EVal();
		((EVal)yyval).initList = ((EVal)(yystack.valueAt (8-(1)))).initList;
		((EVal)yyval).initList.add(((EVal)(yystack.valueAt (8-(3)))).quad);
		((EVal)yyval).declareds = ((EVal)(yystack.valueAt (8-(1)))).declareds;
		((EVal)yyval).declareds.add(((EVal)(yystack.valueAt (8-(4)))));
		((EVal)yyval).falseList = EVal.merge(((EVal)(yystack.valueAt (8-(1)))).falseList, ((EVal)(yystack.valueAt (8-(5)))).nextList);
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (8-(1)))).trueList;
		((EVal)yyval).trueList.add(((EVal)(yystack.valueAt (8-(7)))).quad);
		((EVal)yyval).nextList = EVal.merge(((EVal)(yystack.valueAt (8-(1)))).nextList, ((EVal)(yystack.valueAt (8-(8)))).nextList);
};
  break;
    

  case 61:
  if (yyn == 61)
    
/* Line 353 of lalr1.java  */
/* Line 832 of "YYParser.y"  */
    {System.out.println("Rule 25 onsorePishfarz: DEFAULT_KW DONOGHTE_KW M jomle N NOGHTE_VIRGUL");
	yyval = new EVal();
		((EVal)yyval).quad = ((EVal)(yystack.valueAt (5-(3)))).quad;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (5-(5)))).nextList;
		};
  break;
    

  case 62:
  if (yyn == 62)
    
/* Line 353 of lalr1.java  */
/* Line 839 of "YYParser.y"  */
    {System.out.println("Rule 26 jomleyeTekrar: WHILE_KW PARANTHESIS_BAZ_KW M ebarateSade PARANTHESIS_BASTE_KW M jomle ");
	
		backpatch(((EVal)(yystack.valueAt (7-(7)))).nextList, ((EVal)(yystack.valueAt (7-(3)))).quad);
		backpatch(((EVal)(yystack.valueAt (7-(4)))).trueList, ((EVal)(yystack.valueAt (7-(6)))).quad);
		yyval = new EVal();
		
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (7-(4)))).falseList;
		emit("goto", null, null, String.valueOf(nextQuad() + 1));

	};
  break;
    

  case 63:
  if (yyn == 63)
    
/* Line 353 of lalr1.java  */
/* Line 852 of "YYParser.y"  */
    {System.out.println("Rule 27.1");
	yyval = new EVal();
	((EVal)yyval).nextList = ((EVal)(yystack.valueAt (3-(2)))).nextList;};
  break;
    

  case 64:
  if (yyn == 64)
    
/* Line 353 of lalr1.java  */
/* Line 856 of "YYParser.y"  */
    {
	System.out.println("Rule 27.2");
	yyval = new EVal();
	((EVal)yyval).nextList = ((EVal)(yystack.valueAt (3-(2)))).nextList;
	emit(":=",((EVal)(yystack.valueAt (3-(2)))).place , null, "stack[sp + 1]");
	emit("+","sp" , "2", "top");
	emit(":=","*sp", null, "sp");
	emit(":=","*top", null, "L");
	emit("+","top" , "1", "top");
	emit("+","*top" , "top", "top");
	emit("+","1" , "top", "top");
	emit ("goto",null,null,"L");
	};
  break;
    

  case 65:
  if (yyn == 65)
    
/* Line 353 of lalr1.java  */
/* Line 872 of "YYParser.y"  */
    {System.out.println("Rule 28");
	yyval = new EVal();
	((EVal)yyval).nextList = ((EVal)(yystack.valueAt (3-(2)))).nextList;};
  break;
    

  case 66:
  if (yyn == 66)
    
/* Line 353 of lalr1.java  */
/* Line 877 of "YYParser.y"  */
    {
	System.out.println("Rule 29.1");
		int index = symbolTable.lookUp(((EVal)(yystack.valueAt (3-(1)))).place);
		if (index == SymbolTable.NOT_IN_SYMBOL_TABLE) {
			System.err.println("Error! \"" + ((EVal)(yystack.valueAt (3-(1)))).place + "\" is not declared.");
			return YYABORT;
		}
		String srcPlace = ((EVal)(yystack.valueAt (3-(3)))).place;
		if((symbolTable.types.get(index) != ((EVal)(yystack.valueAt (3-(3)))).type)
			&& !((symbolTable.types.get(index) == EVal.TYPE_CODE_INTEGER
					|| symbolTable.types.get(index) == EVal.TYPE_CODE_CHAR
					|| symbolTable.types.get(index) == EVal.TYPE_CODE_BOOLEAN)
				&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER
					|| ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR
					|| ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))) {
			if((symbolTable.types.get(index) == EVal.TYPE_CODE_REAL)
				&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER
					|| ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR
					|| ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
				srcPlace = newTemp(EVal.TYPE_CODE_REAL, false);
				emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, srcPlace);
			} else if((symbolTable.types.get(index) == EVal.TYPE_CODE_INTEGER
					|| symbolTable.types.get(index) == EVal.TYPE_CODE_CHAR
					|| symbolTable.types.get(index) == EVal.TYPE_CODE_BOOLEAN)
				&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL)) {
				srcPlace = newTemp(symbolTable.types.get(index), false);
				emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, getTypeString(symbolTable.types.get(index)), srcPlace);
			} else {
				System.err.println("Error! Type mismatch: " + ((EVal)(yystack.valueAt (3-(1)))).place + ", " + ((EVal)(yystack.valueAt (3-(3)))).place);
				return YYABORT;
			}
		}
		if (symbolTable.arrays.get(index)) {
			System.err.println("Error! \"" + lexIdentifier + "\" is an array, it can not be used without index.");
			return YYABORT;
		}
		yyval = new EVal();
		((EVal)yyval).place = symbolTable.names.get(index);
		((EVal)yyval).type = symbolTable.types.get(index);
		if(symbolTable.types.get(index) != EVal.TYPE_CODE_BOOLEAN) {
			((EVal)yyval).nextList = ((EVal)(yystack.valueAt (3-(1)))).nextList;
			emit(":=", srcPlace, null, ((EVal)(yystack.valueAt (3-(1)))).place);
			switch (symbolTable.types.get(index)) {
				case EVal.TYPE_CODE_INTEGER:
					emit("iprint", null, null, ((EVal)(yystack.valueAt (3-(1)))).place);
					break;
				case EVal.TYPE_CODE_REAL:
					emit("rprint", null, null, ((EVal)(yystack.valueAt (3-(1)))).place);
					break;
				case EVal.TYPE_CODE_CHAR:
					emit("cprint", null, null, ((EVal)(yystack.valueAt (3-(1)))).place);
					break;
			}
		} else {
			backpatch(((EVal)(yystack.valueAt (3-(3)))).falseList, nextQuad());
			backpatch(((EVal)(yystack.valueAt (3-(3)))).trueList, nextQuad() + 2);
			emit(":=", "0", null, ((EVal)yyval).place);
			emit("goto", null, null, String.valueOf(nextQuad() + 2));
			emit(":=", "1", null, ((EVal)yyval).place);
			emit("bprint", null, null, ((EVal)(yystack.valueAt (3-(1)))).place);
		}
		((EVal)yyval).nextList = EVal.makeList(nextQuad());
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result will be backpatched.
	
		
	};
  break;
    

  case 67:
  if (yyn == 67)
    
/* Line 353 of lalr1.java  */
/* Line 947 of "YYParser.y"  */
    {
	
		System.out.println("Rule 29.1: " +
			"arithmatic_expressions: expressions ADD_KW expressions");
		if(((((EVal)yyval).type == EVal.TYPE_CODE_INTEGER || ((EVal)yyval).type == EVal.TYPE_CODE_CHAR || ((EVal)yyval).type == EVal.TYPE_CODE_BOOLEAN)
				&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
			|| (((EVal)yyval).type == EVal.TYPE_CODE_REAL && ((EVal)yyval).type == EVal.TYPE_CODE_REAL)) {
			emit("+", ((EVal)yyval).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if((((EVal)yyval).type == EVal.TYPE_CODE_INTEGER || ((EVal)yyval).type == EVal.TYPE_CODE_CHAR || ((EVal)yyval).type == EVal.TYPE_CODE_BOOLEAN)
			&& ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)yyval).place, TYPE_STRING_REAL, tmp);
			emit("+", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if(((EVal)yyval).type == EVal.TYPE_CODE_REAL
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
			emit("+", ((EVal)yyval).place, tmp, ((EVal)yyval).place);
		} else {
			System.err.println("Error! Invalid type for \"+\" operation.");
			return YYABORT;
		}

		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 68:
  if (yyn == 68)
    
/* Line 353 of lalr1.java  */
/* Line 982 of "YYParser.y"  */
    {
	
		System.out.println("Rule 29.1: " +
			"arithmatic_expressions: expressions ADD_KW expressions");
		if(((((EVal)yyval).type == EVal.TYPE_CODE_INTEGER || ((EVal)yyval).type == EVal.TYPE_CODE_CHAR || ((EVal)yyval).type == EVal.TYPE_CODE_BOOLEAN)
				&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
			|| (((EVal)yyval).type == EVal.TYPE_CODE_REAL && ((EVal)yyval).type == EVal.TYPE_CODE_REAL)) {
			emit("-", ((EVal)yyval).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if((((EVal)yyval).type == EVal.TYPE_CODE_INTEGER || ((EVal)yyval).type == EVal.TYPE_CODE_CHAR || ((EVal)yyval).type == EVal.TYPE_CODE_BOOLEAN)
			&& ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)yyval).place, TYPE_STRING_REAL, tmp);
			emit("-", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if(((EVal)yyval).type == EVal.TYPE_CODE_REAL
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
			emit("-", ((EVal)yyval).place, tmp, ((EVal)yyval).place);
		} else {
			System.err.println("Error! Invalid type for \"+\" operation.");
			return YYABORT;
		}

		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 69:
  if (yyn == 69)
    
/* Line 353 of lalr1.java  */
/* Line 1017 of "YYParser.y"  */
    {
	
		System.out.println("Rule 29.1: " +
			"arithmatic_expressions: expressions ADD_KW expressions");
		if(((((EVal)yyval).type == EVal.TYPE_CODE_INTEGER || ((EVal)yyval).type == EVal.TYPE_CODE_CHAR || ((EVal)yyval).type == EVal.TYPE_CODE_BOOLEAN)
				&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
			|| (((EVal)yyval).type == EVal.TYPE_CODE_REAL && ((EVal)yyval).type == EVal.TYPE_CODE_REAL)) {
			emit("*", ((EVal)yyval).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if((((EVal)yyval).type == EVal.TYPE_CODE_INTEGER || ((EVal)yyval).type == EVal.TYPE_CODE_CHAR || ((EVal)yyval).type == EVal.TYPE_CODE_BOOLEAN)
			&& ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)yyval).place, TYPE_STRING_REAL, tmp);
			emit("*", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if(((EVal)yyval).type == EVal.TYPE_CODE_REAL
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
			emit("*", ((EVal)yyval).place, tmp, ((EVal)yyval).place);
		} else {
			System.err.println("Error! Invalid type for \"+\" operation.");
			return YYABORT;
		}

		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 70:
  if (yyn == 70)
    
/* Line 353 of lalr1.java  */
/* Line 1052 of "YYParser.y"  */
    {
	
		System.out.println("Rule 29.1: " +
			"arithmatic_expressions: expressions ADD_KW expressions");
		if(((((EVal)yyval).type == EVal.TYPE_CODE_INTEGER || ((EVal)yyval).type == EVal.TYPE_CODE_CHAR || ((EVal)yyval).type == EVal.TYPE_CODE_BOOLEAN)
				&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
			|| (((EVal)yyval).type == EVal.TYPE_CODE_REAL && ((EVal)yyval).type == EVal.TYPE_CODE_REAL)) {
			emit("/", ((EVal)yyval).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if((((EVal)yyval).type == EVal.TYPE_CODE_INTEGER || ((EVal)yyval).type == EVal.TYPE_CODE_CHAR || ((EVal)yyval).type == EVal.TYPE_CODE_BOOLEAN)
			&& ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)yyval).place, TYPE_STRING_REAL, tmp);
			emit("/", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if(((EVal)yyval).type == EVal.TYPE_CODE_REAL
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
			emit("/", ((EVal)yyval).place, tmp, ((EVal)yyval).place);
		} else {
			System.err.println("Error! Invalid type for \"+\" operation.");
			return YYABORT;
		}

		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 71:
  if (yyn == 71)
    
/* Line 353 of lalr1.java  */
/* Line 1087 of "YYParser.y"  */
    {System.out.println("Rule 29.6");};
  break;
    

  case 72:
  if (yyn == 72)
    
/* Line 353 of lalr1.java  */
/* Line 1089 of "YYParser.y"  */
    {System.out.println("Rule 29.7");};
  break;
    

  case 73:
  if (yyn == 73)
    
/* Line 353 of lalr1.java  */
/* Line 1091 of "YYParser.y"  */
    {System.out.println(" Rule 29.8 ebarateSade to ebarat");
	yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
		
	};
  break;
    

  case 74:
  if (yyn == 74)
    
/* Line 353 of lalr1.java  */
/* Line 1102 of "YYParser.y"  */
    {
		System.out.println("Rule 30.1: " +
			"bool_expressions: expressions OR_KW M expressions");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		backpatch(((EVal)(yystack.valueAt (4-(1)))).falseList, ((EVal)(yystack.valueAt (4-(3)))).quad);
		((EVal)yyval).trueList = EVal.merge(((EVal)(yystack.valueAt (4-(1)))).trueList, ((EVal)(yystack.valueAt (4-(4)))).trueList);
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (4-(4)))).falseList;
	};
  break;
    

  case 75:
  if (yyn == 75)
    
/* Line 353 of lalr1.java  */
/* Line 1113 of "YYParser.y"  */
    {
		System.out.println("Rule 30.2: " +
			"bool_expressions: expressions AND_KW M expressions");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		backpatch(((EVal)(yystack.valueAt (4-(1)))).trueList, ((EVal)(yystack.valueAt (4-(3)))).quad);
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (4-(4)))).trueList;
		((EVal)yyval).falseList = EVal.merge(((EVal)(yystack.valueAt (4-(1)))).falseList, ((EVal)(yystack.valueAt (4-(4)))).falseList);
	};
  break;
    

  case 76:
  if (yyn == 76)
    
/* Line 353 of lalr1.java  */
/* Line 1124 of "YYParser.y"  */
    {
		System.out.println("Rule 30.3: " +
			"bool_expressions: expressions OR_ELSE_KW M expressions");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		
		backpatch(((EVal)(yystack.valueAt (4-(1)))).trueList, nextQuad());
		emit(":=", "1", null, ((EVal)yyval).place);
		emit("goto", null, null, String.valueOf(((EVal)(yystack.valueAt (4-(3)))).quad));
		backpatch(((EVal)(yystack.valueAt (4-(1)))).falseList, nextQuad());
		emit(":=", "0", null, ((EVal)yyval).place);
		emit("goto", null, null, String.valueOf(((EVal)(yystack.valueAt (4-(3)))).quad));
		backpatch(((EVal)(yystack.valueAt (4-(4)))).trueList, nextQuad());
		backpatch(((EVal)(yystack.valueAt (4-(4)))).falseList, nextQuad());
		emit("+", ((EVal)yyval).place, ((EVal)(yystack.valueAt (4-(4)))).place, ((EVal)yyval).place);
		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2));
		//emit("goto", null, null, String.valueOf(nextQuad() + 1));
	};
  break;
    

  case 77:
  if (yyn == 77)
    
/* Line 353 of lalr1.java  */
/* Line 1146 of "YYParser.y"  */
    {
		System.out.println("Rule 30.4: " +
			"bool_expressions: expressions AND_THEN_KW M expressions");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		
		backpatch(((EVal)(yystack.valueAt (4-(1)))).trueList, nextQuad());
		emit(":=", "1", null, ((EVal)yyval).place);
		emit("goto", null, null, String.valueOf(((EVal)(yystack.valueAt (4-(3)))).quad));
		backpatch(((EVal)(yystack.valueAt (4-(1)))).falseList, nextQuad());
		emit(":=", "0", null, ((EVal)yyval).place);
		emit("goto", null, null, String.valueOf(((EVal)(yystack.valueAt (4-(3)))).quad));
		backpatch(((EVal)(yystack.valueAt (4-(4)))).trueList, nextQuad());
		backpatch(((EVal)(yystack.valueAt (4-(4)))).falseList, nextQuad());
		emit("*", ((EVal)yyval).place, ((EVal)(yystack.valueAt (4-(4)))).place, ((EVal)yyval).place);
		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2));// result will be backpatched
		//emit("goto", null, null, String.valueOf(nextQuad() + 1));// result will be backpatched
	};
  break;
    

  case 78:
  if (yyn == 78)
    
/* Line 353 of lalr1.java  */
/* Line 1168 of "YYParser.y"  */
    {
		System.out.println("Rule 30.5: " +
			"bool_expressions: NOT_KW expressions");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (2-(2)))).falseList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (2-(2)))).trueList;
	};
  break;
    

  case 79:
  if (yyn == 79)
    
/* Line 353 of lalr1.java  */
/* Line 1178 of "YYParser.y"  */
    {
		System.out.println("Rule 30.6 ebarateRabetei to ebarateSade");
		yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
	};
  break;
    

  case 80:
  if (yyn == 80)
    
/* Line 353 of lalr1.java  */
/* Line 1189 of "YYParser.y"  */
    {
		System.out.println("Rule 31.1 ebarateRiaziManteghi to ebarateRabetei");
		yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
		if(((EVal)yyval).nextList == null){
			System.out.println("null is here");
		}
	};
  break;
    

  case 81:
  if (yyn == 81)
    
/* Line 353 of lalr1.java  */
/* Line 1202 of "YYParser.y"  */
    {
		System.out.println("Rule 31.2: " +
			"bool_expressions: expressions LT_KW expressions");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);

		emit("<", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		emit("check", ((EVal)yyval).place, null, "-"); // result will be backpatched.
		emit("goto", null, null, "-"); // result will be backpatched.
	};
  break;
    

  case 82:
  if (yyn == 82)
    
/* Line 353 of lalr1.java  */
/* Line 1216 of "YYParser.y"  */
    {
		System.out.println("Rule 31.3: " +
			"bool_expressions: expressions LE_KW expressions");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);

		emit("<=", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		emit("check", ((EVal)yyval).place, null, "-"); // result will be backpatched.
		emit("goto", null, null, "-"); // result will be backpatched.
	};
  break;
    

  case 83:
  if (yyn == 83)
    
/* Line 353 of lalr1.java  */
/* Line 1230 of "YYParser.y"  */
    {
		System.out.println("Rule 31.4: " +
			"bool_expressions: expressions GT_KW expressions");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);

		emit(">", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		emit("check", ((EVal)yyval).place, null, "-"); // result will be backpatched.
		emit("goto", null, null, "-"); // result will be backpatched.
	};
  break;
    

  case 84:
  if (yyn == 84)
    
/* Line 353 of lalr1.java  */
/* Line 1244 of "YYParser.y"  */
    {
		System.out.println("Rule 31.5: " +
			"bool_expressions: expressions GE_KW expressions");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);

		emit(">=", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		emit("check", ((EVal)yyval).place, null, "-"); // result will be backpatched.
		emit("goto", null, null, "-"); // result will be backpatched.
	};
  break;
    

  case 85:
  if (yyn == 85)
    
/* Line 353 of lalr1.java  */
/* Line 1258 of "YYParser.y"  */
    {
		System.out.println("Rule 31.6: " +
			"bool_expressions: expressions EQ_KW expressions");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);

		emit("==", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		emit("check", ((EVal)yyval).place, null, "-"); // result will be backpatched.
		emit("goto", null, null, "-"); // result will be backpatched.
	};
  break;
    

  case 86:
  if (yyn == 86)
    
/* Line 353 of lalr1.java  */
/* Line 1273 of "YYParser.y"  */
    {
		if(((EVal)(yystack.valueAt (1-(1)))).type == EVal.TYPE_CODE_BOOLEAN){
			System.out.println("Rule 27.4: " +
			"constant_expressions: saved_boolean");
			yyval = new EVal();
			((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
			((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
			((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
			((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
			((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
		}
		else{
		System.out.println("Rule 26.4: " +
			"expressions: saved_identifier");
		int index = symbolTable.lookUp(((EVal)(yystack.valueAt (1-(1)))).place);
		
		boolean isFunction =  false;
		if(!symbolTable.findFunction(((EVal)(yystack.valueAt (1-(1)))).place).equals("not_found")){
			isFunction = true;
		}
		if (index == SymbolTable.NOT_IN_SYMBOL_TABLE
			&& !isFunction) {
			System.out.println("Error! \"" + ((EVal)(yystack.valueAt (1-(1)))).place + "\" is not declared.");
			return YYABORT;
		}
		if (!isFunction && symbolTable.arrays.get(index)) {
			System.out.println("Error! \"" + lexIdentifier + "\" is an array, it can not be used without index.");
			return YYABORT;
		}
		//System.out.println("found: "+index);
		yyval = new EVal();
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		//symbolTable.names.get(index);
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;//symbolTable.types.get(index);

		
		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);
		System.out.println("we have nextlist");

		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result will be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result will be backpatched.
		}
	};
  break;
    

  case 87:
  if (yyn == 87)
    
/* Line 353 of lalr1.java  */
/* Line 1319 of "YYParser.y"  */
    {
	
		System.out.println("Rule 29.1: " +
			"arithmatic_expressions: expressions ADD_KW expressions");
		if(((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
				&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
			|| (((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL)) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(((EVal)(yystack.valueAt (3-(1)))).type, false);
			((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(1)))).type;
			emit("+", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
			&& ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(1)))).place, TYPE_STRING_REAL, tmp);
			emit("+", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
			emit("+", ((EVal)(yystack.valueAt (3-(1)))).place, tmp, ((EVal)yyval).place);
		} else {
			System.err.println("Error! Invalid type for \"+\" operation.");
			return YYABORT;
		}

		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 88:
  if (yyn == 88)
    
/* Line 353 of lalr1.java  */
/* Line 1359 of "YYParser.y"  */
    {
		System.out.println("Rule 29.2: " +
			"arithmatic_expressions: expressions SUB_KW expressions");
		if(((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
				&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
			|| (((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL)) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(((EVal)(yystack.valueAt (3-(1)))).type, false);
			((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(1)))).type;
			emit("-", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
			&& ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(1)))).place, TYPE_STRING_REAL, tmp);
			emit("-", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
			emit("-", ((EVal)(yystack.valueAt (3-(1)))).place, tmp, ((EVal)yyval).place);
		} else {
			System.err.println("Error! Invalid type for \"-\" operation.");
			return YYABORT;
		}

		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 89:
  if (yyn == 89)
    
/* Line 353 of lalr1.java  */
/* Line 1398 of "YYParser.y"  */
    {
		System.out.println("Rule 29.3: " +
			"arithmatic_expressions: expressions MUL_KW expressions");
		if(((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
				&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
			|| (((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL)) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(((EVal)(yystack.valueAt (3-(1)))).type, false);
			((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(1)))).type;
			emit("*", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
			&& ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(1)))).place, TYPE_STRING_REAL, tmp);
			emit("*", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
			emit("*", ((EVal)(yystack.valueAt (3-(1)))).place, tmp, ((EVal)yyval).place);
		} else {
			System.err.println("Error! Invalid type for \"*\" operation.");
			return YYABORT;
		}

		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 90:
  if (yyn == 90)
    
/* Line 353 of lalr1.java  */
/* Line 1437 of "YYParser.y"  */
    {
	
		System.out.println("Rule 29.4: " +
			"arithmatic_expressions: expressions DIV_KW expressions");
		if(((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
				&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN))
			|| (((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL && ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL)) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(((EVal)(yystack.valueAt (3-(1)))).type, false);
			((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(1)))).type;
			emit("/", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
			&& ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(1)))).place, TYPE_STRING_REAL, tmp);
			emit("/", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR || ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_REAL;
			String tmp = newTemp(EVal.TYPE_CODE_REAL, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_REAL, tmp);
			emit("/", ((EVal)(yystack.valueAt (3-(1)))).place, tmp, ((EVal)yyval).place);
		} else {
			System.err.println("Error! Invalid type for \"/\" operation.");
			return YYABORT;
		}

		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 91:
  if (yyn == 91)
    
/* Line 353 of lalr1.java  */
/* Line 1477 of "YYParser.y"  */
    {
		System.out.println("Rule 29.5: " +
			"arithmatic_expressions: expressions MOD_KW expressions");
		if((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER
				|| ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR
				|| ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER
				|| ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR
				|| ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_INTEGER, false);
			((EVal)yyval).type = EVal.TYPE_CODE_INTEGER;
			emit("%", ((EVal)(yystack.valueAt (3-(1)))).place, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else if((((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_INTEGER
				|| ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_CHAR
				|| ((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_BOOLEAN)
			&& ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_REAL) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_INTEGER;
			String tmp = newTemp(EVal.TYPE_CODE_INTEGER, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(3)))).place, TYPE_STRING_INTEGER, tmp);
			emit("%", ((EVal)(yystack.valueAt (3-(1)))).place, tmp, ((EVal)yyval).place);
		} else if(((EVal)(yystack.valueAt (3-(1)))).type == EVal.TYPE_CODE_REAL
			&& (((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_INTEGER
				|| ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_CHAR
				|| ((EVal)(yystack.valueAt (3-(3)))).type == EVal.TYPE_CODE_BOOLEAN)) {
			yyval = new EVal();
			((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
			((EVal)yyval).type = EVal.TYPE_CODE_INTEGER;
			String tmp = newTemp(EVal.TYPE_CODE_INTEGER, false);
			emit("cast", ((EVal)(yystack.valueAt (3-(1)))).place, TYPE_STRING_INTEGER, tmp);
			emit("%", tmp, ((EVal)(yystack.valueAt (3-(3)))).place, ((EVal)yyval).place);
		} else {
			System.err.println("Error! Invalid type for \"%\" operation.");
			return YYABORT;
		}

		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
	};
  break;
    

  case 92:
  if (yyn == 92)
    
/* Line 353 of lalr1.java  */
/* Line 1525 of "YYParser.y"  */
    {System.out.println("Rule 35.1");};
  break;
    

  case 93:
  if (yyn == 93)
    
/* Line 353 of lalr1.java  */
/* Line 1527 of "YYParser.y"  */
    {
		System.out.println("Rule 35.2 amel to ebarateYegani");
		yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
	};
  break;
    

  case 94:
  if (yyn == 94)
    
/* Line 353 of lalr1.java  */
/* Line 1538 of "YYParser.y"  */
    {System.out.println("Rule 36.1");};
  break;
    

  case 95:
  if (yyn == 95)
    
/* Line 353 of lalr1.java  */
/* Line 1540 of "YYParser.y"  */
    {System.out.println("Rule 36.2");};
  break;
    

  case 96:
  if (yyn == 96)
    
/* Line 353 of lalr1.java  */
/* Line 1542 of "YYParser.y"  */
    {System.out.println("Rule 36.3");};
  break;
    

  case 97:
  if (yyn == 97)
    
/* Line 353 of lalr1.java  */
/* Line 1545 of "YYParser.y"  */
    {
		System.out.println("Rule 37.1 taghirpazir to amel");
		yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
		};
  break;
    

  case 98:
  if (yyn == 98)
    
/* Line 353 of lalr1.java  */
/* Line 1556 of "YYParser.y"  */
    {System.out.println("Rule 37.2 taghirnapazir to amel");
					yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
		};
  break;
    

  case 99:
  if (yyn == 99)
    
/* Line 353 of lalr1.java  */
/* Line 1566 of "YYParser.y"  */
    {
		System.out.println("Rule 38.1 saved_identifier to taghirpazir");
		yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
	};
  break;
    

  case 100:
  if (yyn == 100)
    
/* Line 353 of lalr1.java  */
/* Line 1577 of "YYParser.y"  */
    {System.out.println("Rule 38.2");
	int index = symbolTable.lookUp(((EVal)(yystack.valueAt (4-(1)))).place);
		if (index == SymbolTable.NOT_IN_SYMBOL_TABLE) {
			System.err.println("Error! \"" + lexIdentifier + "\" is not declared.");
			return YYABORT;
		}
		if (!symbolTable.arrays.get(index)) {
			System.err.println("Error! \"" + lexIdentifier + "\" is not an array, it can not be used with index.");
			return YYABORT;
		}
		yyval = new EVal();
		((EVal)yyval).place = newTemp(symbolTable.types.get(index), false);
		((EVal)yyval).type = symbolTable.types.get(index);
		EVal.arrayIndexOutOfBoundList.add(nextQuad() + 2);
		EVal.arrayIndexOutOfBoundList.add(nextQuad() + 4);
		emit("-", ((EVal)(yystack.valueAt (4-(3)))).place, startStr + ((EVal)(yystack.valueAt (4-(1)))).place, indexStr + ((EVal)(yystack.valueAt (4-(1)))).place);
		emit(">=", indexStr + ((EVal)(yystack.valueAt (4-(1)))).place, sizeStr + ((EVal)(yystack.valueAt (4-(1)))).place, condStr + ((EVal)(yystack.valueAt (4-(1)))).place);
		emit("check", condStr + ((EVal)(yystack.valueAt (4-(1)))).place, null, String.valueOf(nextQuad() + 3)); // Result will be backpatched.
		emit("<", indexStr + ((EVal)(yystack.valueAt (4-(1)))).place, "0", condStr + ((EVal)(yystack.valueAt (4-(1)))).place);
		emit("check", condStr + ((EVal)(yystack.valueAt (4-(1)))).place, null, String.valueOf(nextQuad() + 1)); // Result will be backpatched.

		emit("=[]", ((EVal)(yystack.valueAt (4-(1)))).place, indexStr + ((EVal)(yystack.valueAt (4-(1)))).place, ((EVal)yyval).place);

		((EVal)yyval).trueList = EVal.makeList(nextQuad());
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		emit("check", ((EVal)yyval).place, null, String.valueOf(nextQuad() + 2)); // result will be backpatched.
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); //result will be backpatche
		};
  break;
    

  case 101:
  if (yyn == 101)
    
/* Line 353 of lalr1.java  */
/* Line 1608 of "YYParser.y"  */
    {
		System.out.println("Rule 38.3");
		
		if(symbolTable.lookUp(((EVal)(yystack.valueAt (3-(1)))).place)==-1){
			System.err.println("struct not defined.");

		}
		yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (3-(3)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(3)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (3-(3)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (3-(3)))).falseList;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (3-(3)))).nextList;
		};
  break;
    

  case 102:
  if (yyn == 102)
    
/* Line 353 of lalr1.java  */
/* Line 1625 of "YYParser.y"  */
    {System.out.println("Rule 39.1");
		yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (3-(2)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (3-(2)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (3-(2)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (3-(2)))).falseList;};
  break;
    

  case 103:
  if (yyn == 103)
    
/* Line 353 of lalr1.java  */
/* Line 1632 of "YYParser.y"  */
    {System.out.println("Rule 39.2");};
  break;
    

  case 104:
  if (yyn == 104)
    
/* Line 353 of lalr1.java  */
/* Line 1634 of "YYParser.y"  */
    {
		System.out.println("Rule 39.3: meghdareSabet to taghirnapazir");
		yyval = new EVal();	
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
	};
  break;
    

  case 105:
  if (yyn == 105)
    
/* Line 353 of lalr1.java  */
/* Line 1645 of "YYParser.y"  */
    {System.out.println("Rule 40.1");
	
	emit("-", "top", "1", "top");
	emit(":=",String.valueOf(n) , null, "stack[top]");
	emit("-", "top", "1", "top");
	emit(":=",String.valueOf(nextQuad() + 8) , null, "stack[top]");
	emit("-", "top", "1", "top");
	emit("-", "top", "1", "top");
	emit(":=","sp" , null, "stack[top]");
	emit(":=","top" , null, "sp");
	emit("+", "top", "3", "top");
	emit("+", "top", "*top", "top");
	emit ("goto",null,null,symbolTable.addFunction(((EVal)(yystack.valueAt (4-(1)))).place,0));
	};
  break;
    

  case 106:
  if (yyn == 106)
    
/* Line 353 of lalr1.java  */
/* Line 1660 of "YYParser.y"  */
    {System.out.println("Rule 40.2");};
  break;
    

  case 107:
  if (yyn == 107)
    
/* Line 353 of lalr1.java  */
/* Line 1663 of "YYParser.y"  */
    {
	  System.out.println("Rule 42.1");
	  emit("-", "top", "1", "top");
	  emit(":=",((EVal)(yystack.valueAt (3-(3)))).place , null, "stack[top]");
	  n++;
	  };
  break;
    

  case 108:
  if (yyn == 108)
    
/* Line 353 of lalr1.java  */
/* Line 1670 of "YYParser.y"  */
    {
	n = 1;
	System.out.println("Rule 42.2");
	emit("-", "top", "1", "top");
	emit(":=",((EVal)(yystack.valueAt (1-(1)))).place , null, "stack[top]");
	};
  break;
    

  case 109:
  if (yyn == 109)
    
/* Line 353 of lalr1.java  */
/* Line 1678 of "YYParser.y"  */
    {
		System.out.println("Rule 43.1: " +
			"constant_expressions: saved_integer");
		yyval = new EVal();
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
	};
  break;
    

  case 110:
  if (yyn == 110)
    
/* Line 353 of lalr1.java  */
/* Line 1689 of "YYParser.y"  */
    {
		System.out.println("Rule 43.2: " +
			"constant_expressions: saved_real");
		yyval = new EVal();
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
	};
  break;
    

  case 111:
  if (yyn == 111)
    
/* Line 353 of lalr1.java  */
/* Line 1700 of "YYParser.y"  */
    {
		System.out.println("Rule 43.3: " +
			"constant_expressions: saved_char");
		yyval = new EVal();
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
	};
  break;
    

  case 112:
  if (yyn == 112)
    
/* Line 353 of lalr1.java  */
/* Line 1711 of "YYParser.y"  */
    {
		System.out.println("Rule 43.4: " +
			"constant_expressions: saved_boolean");
		yyval = new EVal();
		((EVal)yyval).place = ((EVal)(yystack.valueAt (1-(1)))).place;
		((EVal)yyval).type = ((EVal)(yystack.valueAt (1-(1)))).type;
		((EVal)yyval).trueList = ((EVal)(yystack.valueAt (1-(1)))).trueList;
		((EVal)yyval).falseList = ((EVal)(yystack.valueAt (1-(1)))).falseList;
		((EVal)yyval).nextList = ((EVal)(yystack.valueAt (1-(1)))).nextList;
	};
  break;
    

  case 113:
  if (yyn == 113)
    
/* Line 353 of lalr1.java  */
/* Line 1723 of "YYParser.y"  */
    {
		System.out.println("Rule 30: " +
			"saved_identifier: IDENTIFIER");
		yyval = new EVal();
		
		if(top>-1){
		
			((EVal)yyval).place = function_names[top] + lexIdentifier;
		}
		
		else{
			((EVal)yyval).place = lexIdentifier;
		}
		//((EVal)$$).trueList = EVal.makeList(nextQuad() + 1);
		//((EVal)$$).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)yyval).nextList = //EVal.merge(((EVal)$$).trueList, ((EVal)$$).falseList);
		((EVal)yyval).nextList = EVal.makeList(nextQuad());
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result will be backpatched.
	};
  break;
    

  case 114:
  if (yyn == 114)
    
/* Line 353 of lalr1.java  */
/* Line 1743 of "YYParser.y"  */
    {
		System.out.println("Rule 31: " +
			"saved_identifier: MAIN_KW");
		yyval = new EVal();
		if(top>-1){
		
			((EVal)yyval).place = function_names[top] + lexIdentifier;
		}
		
		else{
			((EVal)yyval).place = lexIdentifier;
		}
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);
		main_address = quadruples.size();
	};
  break;
    

  case 115:
  if (yyn == 115)
    
/* Line 353 of lalr1.java  */
/* Line 1762 of "YYParser.y"  */
    {
		System.out.println("Rule 31: " +
			"saved_integer: INTEGER_CONSTANT");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_INTEGER, false);
		((EVal)yyval).type = EVal.TYPE_CODE_INTEGER;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);
		
		emit(":=", String.valueOf(lexInt), null, ((EVal)yyval).place);
		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.

};
  break;
    

  case 116:
  if (yyn == 116)
    
/* Line 353 of lalr1.java  */
/* Line 1779 of "YYParser.y"  */
    {
		System.out.println("Rule 32: " +
			"saved_real: REAL_CONSTANT");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_REAL, false);
		((EVal)yyval).type = EVal.TYPE_CODE_REAL;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		emit(":=", String.valueOf(lexReal), null, ((EVal)yyval).place);
		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
};
  break;
    

  case 117:
  if (yyn == 117)
    
/* Line 353 of lalr1.java  */
/* Line 1795 of "YYParser.y"  */
    {
		System.out.println("saved_char: HARFE_SABET");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_CHAR, false);
		((EVal)yyval).type = EVal.TYPE_CODE_CHAR;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);

		emit(":=", "'" + String.valueOf(lexChar) + "'", null, ((EVal)yyval).place);
		//emit("check", ((EVal)$$).place, null, String.valueOf(nextQuad() + 2)); // result may be backpatched.
		//emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result may be backpatched.
};
  break;
    

  case 118:
  if (yyn == 118)
    
/* Line 353 of lalr1.java  */
/* Line 1810 of "YYParser.y"  */
    {
		System.out.println("Rule 34.1: " +
			"saved_boolean: TRUE_KW");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);
		
		emit(":=", "1", null, ((EVal)yyval).place);
		
		emit("check", ((EVal)yyval).place, null, "-"); // result may be backpatched.
		emit("goto", null, null, "-"); // result may be backpatched.
	};
  break;
    

  case 119:
  if (yyn == 119)
    
/* Line 353 of lalr1.java  */
/* Line 1825 of "YYParser.y"  */
    {
		System.out.println("Rule 34.2: " +
			"saved_boolean: FALSE_KW");
		yyval = new EVal();
		((EVal)yyval).place = newTemp(EVal.TYPE_CODE_BOOLEAN, false);
		((EVal)yyval).type = EVal.TYPE_CODE_BOOLEAN;
		((EVal)yyval).trueList = EVal.makeList(nextQuad() + 1);
		((EVal)yyval).falseList = EVal.makeList(nextQuad() + 2);
		((EVal)yyval).nextList = EVal.merge(((EVal)yyval).trueList, ((EVal)yyval).falseList);
		
		emit(":=", "0", null, ((EVal)yyval).place);

		
		emit("check", ((EVal)yyval).place, null, "-"); // result may be backpatched.
		emit("goto", null, null, "-"); // result may be backpatched.

	};
  break;
    

  case 120:
  if (yyn == 120)
    
/* Line 353 of lalr1.java  */
/* Line 1844 of "YYParser.y"  */
    {
		System.out.println("Rule 35: " +
			"M: ");
		yyval = new EVal();
		((EVal)yyval).quad = nextQuad();
	};
  break;
    

  case 121:
  if (yyn == 121)
    
/* Line 353 of lalr1.java  */
/* Line 1852 of "YYParser.y"  */
    {
		System.out.println("Rule 36: " +
			"N: ");
		yyval = new EVal();
		((EVal)yyval).nextList = EVal.makeList(nextQuad());
		emit("goto", null, null, String.valueOf(nextQuad() + 1)); // result will be backpatched.
};
  break;
    



/* Line 353 of lalr1.java  */
/* Line 2830 of "YYParser.java"  */
	default: break;
      }

    yy_symbol_print ("-> $$ =", yyr1_[yyn], yyval);

    yystack.pop (yylen);
    yylen = 0;

    /* Shift the result of the reduction.  */
    yyn = yyr1_[yyn];
    int yystate = yypgoto_[yyn - yyntokens_] + yystack.stateAt (0);
    if (0 <= yystate && yystate <= yylast_
	&& yycheck_[yystate] == yystack.stateAt (0))
      yystate = yytable_[yystate];
    else
      yystate = yydefgoto_[yyn - yyntokens_];

    yystack.push (yystate, yyval);
    return YYNEWSTATE;
  }

  /* Return YYSTR after stripping away unnecessary quotes and
     backslashes, so that it's suitable for yyerror.  The heuristic is
     that double-quoting is unnecessary unless the string contains an
     apostrophe, a comma, or backslash (other than backslash-backslash).
     YYSTR is taken from yytname.  */
  private final String yytnamerr_ (String yystr)
  {
    if (yystr.charAt (0) == '"')
      {
        StringBuffer yyr = new StringBuffer ();
        strip_quotes: for (int i = 1; i < yystr.length (); i++)
          switch (yystr.charAt (i))
            {
            case '\'':
            case ',':
              break strip_quotes;

            case '\\':
	      if (yystr.charAt(++i) != '\\')
                break strip_quotes;
              /* Fall through.  */
            default:
              yyr.append (yystr.charAt (i));
              break;

            case '"':
              return yyr.toString ();
            }
      }
    else if (yystr.equals ("$end"))
      return "end of input";

    return yystr;
  }

  /*--------------------------------.
  | Print this symbol on YYOUTPUT.  |
  `--------------------------------*/

  private void yy_symbol_print (String s, int yytype,
			         Object yyvaluep				 )
  {
    if (yydebug > 0)
    yycdebug (s + (yytype < yyntokens_ ? " token " : " nterm ")
	      + yytname_[yytype] + " ("
	      + (yyvaluep == null ? "(null)" : yyvaluep.toString ()) + ")");
  }

  /**
   * Parse input from the scanner that was specified at object construction
   * time.  Return whether the end of the input was reached successfully.
   *
   * @return <tt>true</tt> if the parsing succeeds.  Note that this does not
   *          imply that there were no syntax errors.
   */
  public boolean parse () throws java.io.IOException
  {
    /// Lookahead and lookahead in internal form.
    int yychar = yyempty_;
    int yytoken = 0;

    /* State.  */
    int yyn = 0;
    int yylen = 0;
    int yystate = 0;

    YYStack yystack = new YYStack ();

    /* Error handling.  */
    int yynerrs_ = 0;
    

    /// Semantic value of the lookahead.
    Object yylval = null;

    int yyresult;

    yycdebug ("Starting parse\n");
    yyerrstatus_ = 0;


    /* Initialize the stack.  */
    yystack.push (yystate, yylval);

    int label = YYNEWSTATE;
    for (;;)
      switch (label)
      {
        /* New state.  Unlike in the C/C++ skeletons, the state is already
	   pushed when we come here.  */
      case YYNEWSTATE:
        yycdebug ("Entering state " + yystate + "\n");
        if (yydebug > 0)
          yystack.print (yyDebugStream);
    
        /* Accept?  */
        if (yystate == yyfinal_)
          return true;
    
        /* Take a decision.  First try without lookahead.  */
        yyn = yypact_[yystate];
        if (yyn == yypact_ninf_)
          {
            label = YYDEFAULT;
	    break;
          }
    
        /* Read a lookahead token.  */
        if (yychar == yyempty_)
          {
	    yycdebug ("Reading a token: ");
	    yychar = yylex ();
            
            yylval = yylexer.getLVal ();
          }
    
        /* Convert token to internal form.  */
        if (yychar <= EOF)
          {
	    yychar = yytoken = EOF;
	    yycdebug ("Now at end of input.\n");
          }
        else
          {
	    yytoken = yytranslate_ (yychar);
	    yy_symbol_print ("Next token is", yytoken,
	    		     yylval);
          }
    
        /* If the proper action on seeing token YYTOKEN is to reduce or to
           detect an error, take that action.  */
        yyn += yytoken;
        if (yyn < 0 || yylast_ < yyn || yycheck_[yyn] != yytoken)
          label = YYDEFAULT;
    
        /* <= 0 means reduce or error.  */
        else if ((yyn = yytable_[yyn]) <= 0)
          {
	    if (yyn == 0 || yyn == yytable_ninf_)
	      label = YYFAIL;
	    else
	      {
	        yyn = -yyn;
	        label = YYREDUCE;
	      }
          }
    
        else
          {
            /* Shift the lookahead token.  */
	    yy_symbol_print ("Shifting", yytoken,
	    		     yylval);
    
            /* Discard the token being shifted.  */
            yychar = yyempty_;
    
            /* Count tokens shifted since error; after three, turn off error
               status.  */
            if (yyerrstatus_ > 0)
              --yyerrstatus_;
    
            yystate = yyn;
            yystack.push (yystate, yylval);
            label = YYNEWSTATE;
          }
        break;
    
      /*-----------------------------------------------------------.
      | yydefault -- do the default action for the current state.  |
      `-----------------------------------------------------------*/
      case YYDEFAULT:
        yyn = yydefact_[yystate];
        if (yyn == 0)
          label = YYFAIL;
        else
          label = YYREDUCE;
        break;
    
      /*-----------------------------.
      | yyreduce -- Do a reduction.  |
      `-----------------------------*/
      case YYREDUCE:
        yylen = yyr2_[yyn];
        label = yyaction (yyn, yystack, yylen);
	yystate = yystack.stateAt (0);
        break;
    
      /*------------------------------------.
      | yyerrlab -- here on detecting error |
      `------------------------------------*/
      case YYFAIL:
        /* If not already recovering from an error, report this error.  */
        if (yyerrstatus_ == 0)
          {
	    ++yynerrs_;
	    yyerror (yysyntax_error (yystate, yytoken));
          }
    
        
        if (yyerrstatus_ == 3)
          {
	    /* If just tried and failed to reuse lookahead token after an
	     error, discard it.  */
    
	    if (yychar <= EOF)
	      {
	      /* Return failure if at end of input.  */
	      if (yychar == EOF)
	        return false;
	      }
	    else
	      yychar = yyempty_;
          }
    
        /* Else will try to reuse lookahead token after shifting the error
           token.  */
        label = YYERRLAB1;
        break;
    
      /*---------------------------------------------------.
      | errorlab -- error raised explicitly by YYERROR.  |
      `---------------------------------------------------*/
      case YYERROR:
    
        
        /* Do not reclaim the symbols of the rule which action triggered
           this YYERROR.  */
        yystack.pop (yylen);
        yylen = 0;
        yystate = yystack.stateAt (0);
        label = YYERRLAB1;
        break;
    
      /*-------------------------------------------------------------.
      | yyerrlab1 -- common code for both syntax error and YYERROR.  |
      `-------------------------------------------------------------*/
      case YYERRLAB1:
        yyerrstatus_ = 3;	/* Each real token shifted decrements this.  */
    
        for (;;)
          {
	    yyn = yypact_[yystate];
	    if (yyn != yypact_ninf_)
	      {
	        yyn += yyterror_;
	        if (0 <= yyn && yyn <= yylast_ && yycheck_[yyn] == yyterror_)
	          {
	            yyn = yytable_[yyn];
	            if (0 < yyn)
		      break;
	          }
	      }
    
	    /* Pop the current state because it cannot handle the error token.  */
	    if (yystack.height == 1)
	      return false;
    
	    
	    yystack.pop ();
	    yystate = yystack.stateAt (0);
	    if (yydebug > 0)
	      yystack.print (yyDebugStream);
          }
    
	

        /* Shift the error token.  */
        yy_symbol_print ("Shifting", yystos_[yyn],
			 yylval);
    
        yystate = yyn;
	yystack.push (yyn, yylval);
        label = YYNEWSTATE;
        break;
    
        /* Accept.  */
      case YYACCEPT:
        return true;
    
        /* Abort.  */
      case YYABORT:
        return false;
      }
  }

  // Generate an error message.
  private String yysyntax_error (int yystate, int tok)
  {
    if (errorVerbose)
      {
        int yyn = yypact_[yystate];
        if (yypact_ninf_ < yyn && yyn <= yylast_)
          {
	    StringBuffer res;

	    /* Start YYX at -YYN if negative to avoid negative indexes in
	       YYCHECK.  */
	    int yyxbegin = yyn < 0 ? -yyn : 0;

	    /* Stay within bounds of both yycheck and yytname.  */
	    int yychecklim = yylast_ - yyn + 1;
	    int yyxend = yychecklim < yyntokens_ ? yychecklim : yyntokens_;
	    int count = 0;
	    for (int x = yyxbegin; x < yyxend; ++x)
	      if (yycheck_[x + yyn] == x && x != yyterror_)
	        ++count;

	    // FIXME: This method of building the message is not compatible
	    // with internationalization.
	    res = new StringBuffer ("syntax error, unexpected ");
	    res.append (yytnamerr_ (yytname_[tok]));
	    if (count < 5)
	      {
	        count = 0;
	        for (int x = yyxbegin; x < yyxend; ++x)
	          if (yycheck_[x + yyn] == x && x != yyterror_)
		    {
		      res.append (count++ == 0 ? ", expecting " : " or ");
		      res.append (yytnamerr_ (yytname_[x]));
		    }
	      }
	    return res.toString ();
          }
      }

    return "syntax error";
  }


  /* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
     STATE-NUM.  */
  private static final short yypact_ninf_ = -175;
  private static final short yypact_[] =
  {
       -10,   -28,    24,    28,  -175,  -175,  -175,  -175,  -175,   -16,
    -175,  -175,    28,  -175,  -175,   -16,  -175,    32,  -175,    -9,
      62,  -175,    40,  -175,   -12,    78,    89,   298,   -16,   298,
      67,  -175,  -175,   211,   -16,  -175,   346,   298,   298,    45,
     224,  -175,   346,   346,   346,    53,  -175,  -175,  -175,    54,
    -175,   346,  -175,  -175,  -175,  -175,  -175,  -175,  -175,  -175,
    -175,  -175,  -175,  -175,  -175,  -175,  -175,    85,   126,  -175,
      11,  -175,    80,  -175,   354,  -175,  -175,  -175,    75,  -175,
    -175,  -175,  -175,   105,  -175,    88,  -175,   187,  -175,  -175,
     217,  -175,   -16,  -175,    98,   126,    22,  -175,  -175,   106,
    -175,   271,  -175,   138,   124,   125,   128,   121,  -175,  -175,
    -175,    80,   111,  -175,  -175,  -175,  -175,  -175,  -175,    80,
      80,    80,    80,    80,    80,    80,    80,    80,    80,  -175,
     -16,   346,   346,   346,   346,  -175,  -175,   346,   346,   322,
     -16,   122,  -175,  -175,  -175,    84,  -175,  -175,   150,  -175,
     298,  -175,  -175,  -175,  -175,   346,    38,  -175,  -175,   346,
     346,   346,   346,    56,    17,  -175,    17,  -175,    56,    17,
    -175,    17,    17,  -175,   135,  -175,  -175,  -175,  -175,  -175,
    -175,  -175,    50,  -175,  -175,  -175,  -175,  -175,   298,   109,
    -175,  -175,    27,    27,  -175,  -175,   346,  -175,  -175,  -175,
    -175,   163,  -175,   154,   298,  -175,   152,  -175,  -175,    45,
    -175,  -175,   129,   168,   298,  -175,    45,  -175,  -175,  -175,
    -175,   132,  -175,   298,  -175,   134,  -175,   298,  -175,  -175,
    -175,   298,  -175
  };

  /* YYDEFACT[S] -- default rule to reduce with in state S when YYTABLE
     doesn't specify something else to do.  Zero means the default is an
     error.  */
  private static final byte yydefact_[] =
  {
         0,     0,     0,     0,     1,    14,    13,    16,    15,     0,
     113,   114,     2,     4,     5,     0,     6,     0,     7,     0,
       0,     3,     0,    18,    20,     0,    22,     0,     0,     0,
       0,    31,    25,     0,     0,    17,     0,     0,     0,     0,
       0,   120,   120,     0,     0,     0,   120,   115,   117,     0,
      95,     0,   118,    96,   119,    94,   116,    29,    54,    39,
      40,   121,    38,    41,    42,    43,    44,     0,    73,    79,
      80,    86,     0,    93,    97,    98,   103,   104,    99,   109,
     110,   111,   112,    32,    34,    35,    28,     0,    24,     9,
       0,    11,     0,    19,    22,    21,    97,    27,    26,     0,
      48,     0,    50,   120,     0,     0,     0,     0,    78,   120,
      52,     0,     0,    37,   120,   120,   120,   120,   120,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,    92,
       0,     0,     0,     0,     0,    71,    72,     0,     0,     0,
       0,     0,    30,     8,    10,     0,    23,    46,   120,    47,
       0,    65,    64,    63,   120,     0,     0,   102,    51,     0,
       0,     0,     0,    87,    83,    89,    85,    90,    88,    82,
      91,    81,    84,   101,     0,    66,    70,    67,    68,    69,
     106,   108,     0,    33,    36,    12,    45,    49,     0,     0,
     121,    75,    74,    76,    77,   100,     0,   105,    56,   121,
     120,     0,   107,    37,     0,   120,     0,   120,    62,     0,
     120,    58,     0,     0,     0,   121,     0,   120,    57,    53,
      55,     0,   121,     0,   120,     0,   121,     0,   120,    61,
      59,     0,    60
  };

  /* YYPGOTO[NTERM-NUM].  */
  private static final short yypgoto_[] =
  {
      -175,  -175,  -175,   172,  -175,   145,    16,     6,  -175,    95,
     155,  -175,   170,   173,  -175,  -175,   112,  -175,    58,   -27,
    -175,  -175,   100,  -175,  -174,   -11,  -175,  -175,  -175,  -175,
    -175,  -175,   -36,   -24,  -175,   296,   130,  -175,  -175,    86,
    -175,  -175,  -175,  -175,    13,   -34,  -175,  -175,  -175,   -38,
    -173
  };

  /* YYDEFGOTO[NTERM-NUM].  */
  private static final short
  yydefgoto_[] =
  {
        -1,     2,    12,    13,    14,    90,    91,    92,    16,    22,
      23,    24,    29,    17,    18,    30,    31,    83,    84,   102,
      58,    59,   103,    60,    61,    62,    63,   206,   213,    64,
      65,    66,    67,    68,    69,    70,    71,    72,    73,    74,
      75,    76,   182,    77,    78,    79,    80,    81,    82,   150,
     113
  };

  /* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
     positive, shift that token.  If negative, reduce the rule which
     number is the opposite.  If zero, do what YYDEFACT says.  */
  private static final short yytable_ninf_ = -1;
  private static final short
  yytable_[] =
  {
        57,     3,    86,   104,   106,    99,   105,     1,   110,    15,
      97,    98,    95,    10,   199,   112,    19,   201,    15,   107,
     108,   119,    20,    28,     4,    19,   203,   119,    26,    32,
      36,    28,     5,     6,     7,     8,     5,     6,     7,     8,
     219,    85,   221,   120,    11,   121,     9,    94,   119,   225,
     115,   121,   122,   229,   123,   130,    34,    10,   131,   124,
     123,   125,   126,   127,   128,   124,   196,    35,   126,    27,
      33,   155,   121,    47,   118,   190,   158,   159,   160,   161,
     162,   123,     5,     6,     7,     8,   124,   197,    11,   126,
     121,   109,   111,    28,    87,   174,   175,   176,   177,   123,
      34,   178,   179,   181,    88,    94,   144,   126,    47,    10,
      48,   185,   114,   139,    50,    37,   188,   144,    51,    52,
      53,   140,    96,   187,   141,    39,    54,    32,    55,    96,
      96,   189,   115,   116,    39,   191,   192,   193,   194,    56,
      11,   146,   154,   173,   115,   116,   200,   149,   157,   115,
     116,   151,   152,    85,   117,   153,   118,   184,    96,   186,
     202,   198,   204,   210,   211,   212,   117,   209,   118,   214,
     195,   117,   216,   118,   205,   215,   207,   208,   217,   223,
     218,   224,   222,   228,    21,   101,   227,   145,    25,    93,
     231,     5,     6,     7,     8,    38,   226,    96,   183,   142,
     230,   148,   129,   220,   232,    96,    96,    96,    96,    96,
      96,    96,    96,    96,    96,     5,     6,     7,     8,     0,
      89,     5,     6,     7,     8,     0,   143,     0,     5,     6,
       7,     8,    40,   100,     0,     0,     0,     0,    41,    42,
       0,    96,     0,     0,    43,    96,    96,    96,    96,    44,
      45,    46,    47,    10,    48,    49,     0,     0,    50,     0,
       0,     0,    51,    52,    53,     0,     0,     0,     0,     0,
      54,     0,    55,     0,     0,     5,     6,     7,     8,    40,
     147,     0,     0,    56,    11,    41,    42,     0,     0,     0,
       0,    43,     0,     0,     0,     0,    44,    45,    46,    47,
      10,    48,    49,     0,     0,    50,    40,     0,     0,    51,
      52,    53,    41,    42,     0,     0,     0,    54,    43,    55,
       0,     0,     0,    44,    45,    46,    47,    10,    48,    49,
      56,    11,    50,     0,     0,     0,    51,    52,    53,     0,
       0,     0,     0,     0,    54,     0,    55,    44,     0,     0,
      47,    10,    48,     0,     0,     0,    50,    56,    11,   180,
      51,    52,    53,     0,     0,     0,     0,     0,    54,     0,
      55,    44,     0,     0,    47,    10,    48,     0,     0,     0,
      50,    56,    11,     0,    51,    52,    53,   130,     0,     0,
     131,     0,    54,     0,    55,     0,   132,     0,   133,     0,
       0,     0,     0,     0,     0,    56,    11,   156,   134,   135,
     136,   137,   138,     0,     0,   163,   164,   165,   166,   167,
     168,   169,   170,   171,   172
  };

  /* YYCHECK.  */
  private static final short
  yycheck_[] =
  {
        27,    29,    29,    41,    42,    39,    42,    17,    46,     3,
      37,    38,    36,    29,   188,    51,     3,   190,    12,    43,
      44,    10,     9,    17,     0,    12,   199,    10,    15,    38,
      42,    25,     4,     5,     6,     7,     4,     5,     6,     7,
     214,    28,   215,    32,    60,    34,    18,    34,    10,   222,
      23,    34,    41,   226,    43,    33,    16,    29,    36,    48,
      43,    50,    51,    52,    53,    48,    16,    27,    51,    37,
       8,   109,    34,    28,    47,    37,   114,   115,   116,   117,
     118,    43,     4,     5,     6,     7,    48,    37,    60,    51,
      34,    38,    38,    87,    27,   131,   132,   133,   134,    43,
      16,   137,   138,   139,    37,    92,    90,    51,    28,    29,
      30,    27,    27,    38,    34,    37,   154,   101,    38,    39,
      40,    16,    36,   150,    36,    36,    46,    38,    48,    43,
      44,   155,    23,    24,    36,   159,   160,   161,   162,    59,
      60,    35,    21,   130,    23,    24,    37,     9,    37,    23,
      24,    27,    27,   140,    45,    27,    47,    35,    72,     9,
     196,   188,   200,    11,    12,    13,    45,   205,    47,   207,
      35,    45,   210,    47,    11,   209,    22,   204,    49,   217,
      12,    49,   216,    49,    12,    40,   224,    92,    15,    34,
     228,     4,     5,     6,     7,    25,   223,   111,   140,    87,
     227,   101,    72,   214,   231,   119,   120,   121,   122,   123,
     124,   125,   126,   127,   128,     4,     5,     6,     7,    -1,
       9,     4,     5,     6,     7,    -1,     9,    -1,     4,     5,
       6,     7,     8,     9,    -1,    -1,    -1,    -1,    14,    15,
      -1,   155,    -1,    -1,    20,   159,   160,   161,   162,    25,
      26,    27,    28,    29,    30,    31,    -1,    -1,    34,    -1,
      -1,    -1,    38,    39,    40,    -1,    -1,    -1,    -1,    -1,
      46,    -1,    48,    -1,    -1,     4,     5,     6,     7,     8,
       9,    -1,    -1,    59,    60,    14,    15,    -1,    -1,    -1,
      -1,    20,    -1,    -1,    -1,    -1,    25,    26,    27,    28,
      29,    30,    31,    -1,    -1,    34,     8,    -1,    -1,    38,
      39,    40,    14,    15,    -1,    -1,    -1,    46,    20,    48,
      -1,    -1,    -1,    25,    26,    27,    28,    29,    30,    31,
      59,    60,    34,    -1,    -1,    -1,    38,    39,    40,    -1,
      -1,    -1,    -1,    -1,    46,    -1,    48,    25,    -1,    -1,
      28,    29,    30,    -1,    -1,    -1,    34,    59,    60,    37,
      38,    39,    40,    -1,    -1,    -1,    -1,    -1,    46,    -1,
      48,    25,    -1,    -1,    28,    29,    30,    -1,    -1,    -1,
      34,    59,    60,    -1,    38,    39,    40,    33,    -1,    -1,
      36,    -1,    46,    -1,    48,    -1,    42,    -1,    44,    -1,
      -1,    -1,    -1,    -1,    -1,    59,    60,   111,    54,    55,
      56,    57,    58,    -1,    -1,   119,   120,   121,   122,   123,
     124,   125,   126,   127,   128
  };

  /* STOS_[STATE-NUM] -- The (internal number of the) accessing
     symbol of state STATE-NUM.  */
  private static final byte
  yystos_[] =
  {
         0,    17,    63,    29,     0,     4,     5,     6,     7,    18,
      29,    60,    64,    65,    66,    69,    70,    75,    76,   106,
     106,    65,    71,    72,    73,    75,   106,    37,    69,    74,
      77,    78,    38,     8,    16,    27,    42,    37,    74,    36,
       8,    14,    15,    20,    25,    26,    27,    28,    30,    31,
      34,    38,    39,    40,    46,    48,    59,    81,    82,    83,
      85,    86,    87,    88,    91,    92,    93,    94,    95,    96,
      97,    98,    99,   100,   101,   102,   103,   105,   106,   107,
     108,   109,   110,    79,    80,   106,    81,    27,    37,     9,
      67,    68,    69,    72,   106,    95,   101,    81,    81,   107,
       9,    67,    81,    84,   111,    94,   111,    95,    95,    38,
     111,    38,    94,   112,    27,    23,    24,    45,    47,    10,
      32,    34,    41,    43,    48,    50,    51,    52,    53,    98,
      33,    36,    42,    44,    54,    55,    56,    57,    58,    38,
      16,    36,    78,     9,    68,    71,    35,     9,    84,     9,
     111,    27,    27,    27,    21,   111,    97,    37,   111,   111,
     111,   111,   111,    97,    97,    97,    97,    97,    97,    97,
      97,    97,    97,   106,    94,    94,    94,    94,    94,    94,
      37,    94,   104,    80,    35,    27,     9,    81,   111,    95,
      37,    95,    95,    95,    95,    35,    16,    37,    81,    86,
      37,   112,    94,   112,   111,    11,    89,    22,    81,   111,
      11,    12,    13,    90,   111,   107,   111,    49,    12,    86,
      87,   112,   107,   111,    49,   112,    81,   111,    49,   112,
      81,   111,    81
  };

  /* TOKEN_NUMBER_[YYLEX-NUM] -- Internal symbol number corresponding
     to YYLEX-NUM.  */
  private static final short
  yytoken_number_[] =
  {
         0,   256,   257,   258,   259,   260,   261,   262,   263,   264,
     265,   266,   267,   268,   269,   270,   271,   272,   273,   274,
     275,   276,   277,   278,   279,   280,   281,   282,   283,   284,
     285,   286,   287,   288,   289,   290,   291,   292,   293,   294,
     295,   296,   297,   298,   299,   300,   301,   302,   303,   304,
     305,   306,   307,   308,   309,   310,   311,   312,   313,   314,
     315,   316
  };

  /* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
  private static final byte
  yyr1_[] =
  {
         0,    62,    63,    64,    64,    65,    65,    65,    66,    66,
      67,    67,    68,    69,    69,    69,    69,    70,    71,    71,
      72,    72,    73,    73,    74,    75,    76,    76,    76,    76,
      77,    77,    78,    79,    79,    80,    80,    81,    81,    82,
      82,    82,    82,    82,    82,    83,    83,    83,    83,    84,
      84,    85,    85,    86,    86,    87,    87,    88,    88,    89,
      89,    90,    91,    92,    92,    93,    94,    94,    94,    94,
      94,    94,    94,    94,    95,    95,    95,    95,    95,    95,
      96,    96,    96,    96,    96,    96,    97,    97,    97,    97,
      97,    97,    98,    98,    99,    99,    99,   100,   100,   101,
     101,   101,   102,   102,   102,   103,   103,   104,   104,   105,
     105,   105,   105,   106,   106,   107,   108,   109,   110,   110,
     111,   112
  };

  /* YYR2[YYN] -- Number of symbols composing right hand side of rule YYN.  */
  private static final byte
  yyr2_[] =
  {
         0,     2,     3,     2,     1,     1,     1,     1,     5,     4,
       2,     1,     3,     1,     1,     1,     1,     3,     1,     3,
       1,     3,     1,     4,     2,     2,     4,     4,     3,     3,
       3,     1,     2,     3,     1,     1,     3,     2,     1,     1,
       1,     1,     1,     1,     1,     4,     3,     3,     2,     3,
       1,     3,     2,     9,     1,     9,     5,     8,     7,     7,
       8,     5,     7,     3,     3,     3,     3,     3,     3,     3,
       3,     2,     2,     1,     4,     4,     4,     4,     2,     1,
       1,     3,     3,     3,     3,     3,     1,     3,     3,     3,
       3,     3,     2,     1,     1,     1,     1,     1,     1,     1,
       4,     3,     3,     1,     1,     4,     3,     3,     1,     1,
       1,     1,     1,     1,     1,     1,     1,     1,     1,     1,
       0,     0
  };

  /* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
     First, the terminals, then, starting at \a yyntokens_, nonterminals.  */
  private static final String yytname_[] =
  {
    "$end", "error", "$undefined", "COMMENT", "FLOAT_KW", "INT_KW",
  "BOOLEAN_KW", "CHAR_KW", "AKULAD_BAZ_KW", "AKULAD_BASTE_KW", "ADD_KW",
  "SWITCH_KW", "END_KW", "DEFAULT_KW", "BREAK_KW", "RETURN_KW", "COMMA",
  "PROGRAM_KW", "STRUCT_KW", "CONSTANT_KW", "IF_KW", "THEN_KW", "ELSE_KW",
  "AND_KW", "OR_KW", "NOT_KW", "WHILE_KW", "NOGHTE_VIRGUL", "ADAD",
  "SHENASE", "HARFE_SABET", "KEY_KW", "MORE_THAN_KW", "NOGHTE_KW",
  "MULTIPLY_KW", "BRACKET_BASTE_KW", "BRACKET_BAZ_KW",
  "PARANTHESIS_BASTE_KW", "PARANTHESIS_BAZ_KW", "TRUE_KW", "QUESTION_KW",
  "EQUAL_EQUAL_KW", "EQUAL_KW", "DEVIDE_KW", "DEVIDE_EQUAL_KW",
  "OR_ELSE_KW", "FALSE_KW", "AND_THEN_KW", "MINUS_KW", "DONOGHTE_KW",
  "LESS_EQUAL_KW", "MOD_KW", "LESS_THAN_KW", "MORE_EQUAL_KW",
  "PLUS_EQUAL_KW", "PLUS_PLUS_KW", "MINUS_MINUS_KW", "MINUS_EQUAL_KW",
  "MULTIPLY_EQUAL_KW", "ADAD_ASHARI", "MAIN_KW", "LOWER_THAN_ELSE_KW",
  "$accept", "barnameh", "tarifha", "tarif", "tarifeSakhtar",
  "tarifhayeMahalli", "tarifeMoteghayyerMahdud", "jens",
  "tarifeMoteghayyer", "tarifhayeMoteghayyerha", "tarifeMeghdareAvalie",
  "tarifeShenaseMoteghayer", "function_input", "function_name",
  "tarifeTabe", "vorudiha", "jensVorudiha", "shenaseyeVorudiha",
  "shenaseyeVorudi", "jomle", "otherjomle", "jomleyeMorakkab", "jomleha",
  "jomleyeEbarat", "matched", "unmatched", "jomleyeEntekhab",
  "onsoreHalat", "onsorePishfarz", "jomleyeTekrar", "jomleyeBazgasht",
  "jomleyeShekast", "ebarat", "ebarateSade", "ebarateRabetei",
  "ebarateRiaziManteghi", "ebarateYegani", "amalgareYegani", "amel",
  "taghirpazir", "taghirnapazir", "sedaZadan", "bordareVorudiha",
  "meghdareSabet", "saved_identifier", "saved_integer", "saved_real",
  "saved_char", "saved_boolean", "M", "N", null
  };

  /* YYRHS -- A `-1'-separated list of the rules' RHS.  */
  private static final byte yyrhs_[] =
  {
        63,     0,    -1,    17,    29,    64,    -1,    64,    65,    -1,
      65,    -1,    66,    -1,    70,    -1,    76,    -1,    18,   106,
       8,    67,     9,    -1,    18,   106,     8,     9,    -1,    67,
      68,    -1,    68,    -1,    69,    71,    27,    -1,     5,    -1,
       4,    -1,     7,    -1,     6,    -1,    69,    71,    27,    -1,
      72,    -1,    71,    16,    72,    -1,    73,    -1,    73,    42,
      95,    -1,   106,    -1,   106,    36,   107,    35,    -1,    77,
      37,    -1,   106,    38,    -1,    69,    75,    74,    81,    -1,
      69,    75,    37,    81,    -1,    75,    74,    81,    -1,    75,
      37,    81,    -1,    77,    27,    78,    -1,    78,    -1,    69,
      79,    -1,    79,    16,    80,    -1,    80,    -1,   106,    -1,
     106,    36,    35,    -1,    86,   112,    -1,    87,    -1,    83,
      -1,    85,    -1,    88,    -1,    91,    -1,    92,    -1,    93,
      -1,     8,    67,    84,     9,    -1,     8,    67,     9,    -1,
       8,    84,     9,    -1,     8,     9,    -1,    84,   111,    81,
      -1,    81,    -1,    94,    27,   111,    -1,    27,   111,    -1,
      20,    95,    21,   111,    86,   112,    22,   111,    86,    -1,
      82,    -1,    20,    95,    21,   111,    86,   112,    22,   111,
      87,    -1,    20,    95,    21,   111,    81,    -1,    31,    38,
      97,    37,   112,    89,    90,    12,    -1,    31,    38,    97,
      37,   112,    89,    12,    -1,    11,   111,   107,   112,    49,
     111,    81,    -1,    89,    11,   111,   107,   112,    49,   111,
      81,    -1,    13,    49,   111,    81,   112,    -1,    26,    38,
     111,    95,    37,   111,    81,    -1,    15,   111,    27,    -1,
      15,    94,    27,    -1,    14,   111,    27,    -1,   101,    42,
      94,    -1,   101,    54,    94,    -1,   101,    57,    94,    -1,
     101,    58,    94,    -1,   101,    44,    94,    -1,   101,    55,
      -1,   101,    56,    -1,    95,    -1,    95,    24,   111,    95,
      -1,    95,    23,   111,    95,    -1,    95,    45,   111,    95,
      -1,    95,    47,   111,    95,    -1,    25,    95,    -1,    96,
      -1,    97,    -1,    97,    52,    97,    -1,    97,    50,    97,
      -1,    97,    32,    97,    -1,    97,    53,    97,    -1,    97,
      41,    97,    -1,    98,    -1,    97,    10,    97,    -1,    97,
      48,    97,    -1,    97,    34,    97,    -1,    97,    43,    97,
      -1,    97,    51,    97,    -1,    99,    98,    -1,   100,    -1,
      48,    -1,    34,    -1,    40,    -1,   101,    -1,   102,    -1,
     106,    -1,   101,    36,    94,    35,    -1,   101,    33,   106,
      -1,    38,    94,    37,    -1,   103,    -1,   105,    -1,   106,
      38,   104,    37,    -1,   106,    38,    37,    -1,   104,    16,
      94,    -1,    94,    -1,   107,    -1,   108,    -1,   109,    -1,
     110,    -1,    29,    -1,    60,    -1,    28,    -1,    59,    -1,
      30,    -1,    39,    -1,    46,    -1,    -1,    -1
  };

  /* YYPRHS[YYN] -- Index of the first RHS symbol of rule number YYN in
     YYRHS.  */
  private static final short yyprhs_[] =
  {
         0,     0,     3,     7,    10,    12,    14,    16,    18,    24,
      29,    32,    34,    38,    40,    42,    44,    46,    50,    52,
      56,    58,    62,    64,    69,    72,    75,    80,    85,    89,
      93,    97,    99,   102,   106,   108,   110,   114,   117,   119,
     121,   123,   125,   127,   129,   131,   136,   140,   144,   147,
     151,   153,   157,   160,   170,   172,   182,   188,   197,   205,
     213,   222,   228,   236,   240,   244,   248,   252,   256,   260,
     264,   268,   271,   274,   276,   281,   286,   291,   296,   299,
     301,   303,   307,   311,   315,   319,   323,   325,   329,   333,
     337,   341,   345,   348,   350,   352,   354,   356,   358,   360,
     362,   367,   371,   375,   377,   379,   384,   388,   392,   394,
     396,   398,   400,   402,   404,   406,   408,   410,   412,   414,
     416,   417
  };

  /* YYRLINE[YYN] -- Source line where rule number YYN was defined.  */
  private static final short yyrline_[] =
  {
         0,   220,   220,   226,   229,   234,   237,   240,   245,   250,
     256,   260,   265,   346,   354,   361,   368,   377,   454,   466,
     484,   490,   524,   531,   550,   556,   569,   579,   587,   594,
     603,   605,   608,   611,   613,   616,   622,   625,   630,   638,
     643,   647,   651,   655,   659,   664,   670,   676,   683,   688,
     695,   703,   710,   716,   726,   733,   742,   752,   776,   809,
     819,   832,   839,   852,   856,   872,   877,   947,   982,  1017,
    1052,  1087,  1089,  1091,  1102,  1113,  1124,  1146,  1168,  1178,
    1189,  1202,  1216,  1230,  1244,  1258,  1273,  1319,  1359,  1398,
    1437,  1477,  1525,  1527,  1538,  1540,  1542,  1545,  1556,  1566,
    1577,  1608,  1625,  1632,  1634,  1645,  1660,  1663,  1670,  1678,
    1689,  1700,  1711,  1723,  1743,  1762,  1779,  1795,  1810,  1825,
    1844,  1852
  };

  // Report on the debug stream that the rule yyrule is going to be reduced.
  private void yy_reduce_print (int yyrule, YYStack yystack)
  {
    if (yydebug == 0)
      return;

    int yylno = yyrline_[yyrule];
    int yynrhs = yyr2_[yyrule];
    /* Print the symbols being reduced, and their result.  */
    yycdebug ("Reducing stack by rule " + (yyrule - 1)
	      + " (line " + yylno + "), ");

    /* The symbols being reduced.  */
    for (int yyi = 0; yyi < yynrhs; yyi++)
      yy_symbol_print ("   $" + (yyi + 1) + " =",
		       yyrhs_[yyprhs_[yyrule] + yyi],
		       ((yystack.valueAt (yynrhs-(yyi + 1)))));
  }

  /* YYTRANSLATE(YYLEX) -- Bison symbol number corresponding to YYLEX.  */
  private static final byte yytranslate_table_[] =
  {
         0,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     1,     2,     3,     4,
       5,     6,     7,     8,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,    23,    24,
      25,    26,    27,    28,    29,    30,    31,    32,    33,    34,
      35,    36,    37,    38,    39,    40,    41,    42,    43,    44,
      45,    46,    47,    48,    49,    50,    51,    52,    53,    54,
      55,    56,    57,    58,    59,    60,    61
  };

  private static final byte yytranslate_ (int t)
  {
    if (t >= 0 && t <= yyuser_token_number_max_)
      return yytranslate_table_[t];
    else
      return yyundef_token_;
  }

  private static final int yylast_ = 424;
  private static final int yynnts_ = 51;
  private static final int yyempty_ = -2;
  private static final int yyfinal_ = 4;
  private static final int yyterror_ = 1;
  private static final int yyerrcode_ = 256;
  private static final int yyntokens_ = 62;

  private static final int yyuser_token_number_max_ = 316;
  private static final int yyundef_token_ = 2;

/* User implementation code.  */
/* Unqualified %code blocks.  */

/* Line 875 of lalr1.java  */
/* Line 24 of "YYParser.y"  */


	public static final String TYPE_STRING_INTEGER = "int";
	public static final String TYPE_STRING_REAL = "double";
	public static final String TYPE_STRING_CHAR = "char";
	public static final String TYPE_STRING_BOOLEAN = "int";

	private static final String tempStr = "tempVar";
	public static final String startStr = "StartVar";
	public static final String sizeStr = "SizeVar";
	public static final String indexStr = "IndexVar";
	public static final String condStr = "ConditionVar";
	
	public static String lexIdentifier;
	public static int lexInt;
	public static double lexReal;
	public static boolean lexBoolean;
	public static char lexChar;
	int n;
	int main_address;
	
	String[] function_names = new String[1000];
	int top = -1;

	private ArrayList<Quadruple> quadruples = new ArrayList<>();
	private SymbolTable symbolTable = new SymbolTable();
	public static PrintStream writer;

	private int tempCounter = 0;

	public String fileAddress;

	public static void main(String args[]) throws IOException {
        YYParser yyparser;
        final Yylex lexer;

        String inputCode = "code.txt";
        String outputCode = "out.c";
        String output = "output.txt";

        if (args.length == 1) {
            inputCode = args[0];
            outputCode = args[0] + ".c";
            output = args[0] + ".txt";
        }
        if (args.length == 2) {
            inputCode = args[0];
            outputCode = args[1];
            output = args[0] + ".txt";
        }
        if (args.length == 3) {
            inputCode = args[0];
            outputCode = args[1];
            output = args[2];
        }

        writer = new PrintStream(new File(output));
        lexer = new Yylex(new InputStreamReader(new FileInputStream(inputCode)));

        yyparser = new YYParser(new Lexer() {

            @Override
            public int yylex() {
                int yyl_return = -1;
                try {
                    yyl_return = lexer.yylex();
                } catch (IOException EVal) {
                    System.err.println("IO error: " + EVal);
                }
                return yyl_return;
            }

            @Override
            public void yyerror(String error) {
                System.err.println("Error! " + error);
            }

            @Override
            public Object getLVal() {
                return null;
            }
        });
        yyparser.fileAddress = outputCode;
        yyparser.parse();

        return;
	}

	private void emit(String operation, String arg0, String arg1, String result) {
		quadruples.add(new Quadruple(operation, arg0, arg1, result));
	}

	private void backpatch(ArrayList<Integer> list, int quadNumber) {
		for (int i = 0; i < list.size(); i++)
			quadruples.get(list.get(i)).result = String.valueOf(quadNumber);
	}

	private void backpatch(int quadNumber, int destination) {
		quadruples.get(quadNumber).result = String.valueOf(destination);
	}

	private String newTemp(int type, boolean array) {
		String name = tempStr + tempCounter++;
		symbolTable.addToSymbolTable(name, type, array);
		return name;
	}

	private int nextQuad() {
		return quadruples.size();
	}

	private String getTypeString(int typeCode){
		switch(typeCode){
			case EVal.TYPE_CODE_INTEGER:
				return TYPE_STRING_INTEGER;
			case EVal.TYPE_CODE_REAL:
				return TYPE_STRING_REAL;
			case EVal.TYPE_CODE_CHAR:
				return TYPE_STRING_CHAR;
			case EVal.TYPE_CODE_BOOLEAN:
				return TYPE_STRING_BOOLEAN;
			case EVal.TYPE_CODE_UNKNOWN:
			case EVal.TYPE_CODE_RANGE:
			default:
				return null;
		}
	}

	private void exportIntermediateCode() {
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(new FileOutputStream(fileAddress));
		} catch (FileNotFoundException EVal) {
			EVal.printStackTrace();
		}

		try {
			dos.writeBytes("#include <stdio.h>\n\nint main() {\n\n");
			dos.writeBytes(symbolTable.toString());
			dos.writeBytes("\n\t\n");
			// Backpatch of error controllers.
			backpatch(EVal.arrayIndexOutOfBoundList, (quadruples.size() + 1)); // Array index out of bound error.
			backpatch(EVal.invalidArraySizeList, (quadruples.size() + 2)); // Invalid array size error.
			for (int i = 0; i < quadruples.size() && i < 100; i++) {
				dos.writeBytes(Quadruple.LINE_STR + i + ":" + "\t\t" + quadruples.get(i) + "\n");
			}
			for (int i = 100; i < quadruples.size(); i++) {
				dos.writeBytes(Quadruple.LINE_STR + i + ":" + "\t\t" + quadruples.get(i) + "\n");
			}
			// Normal Finish
			if(quadruples.size() < 100){
			
				dos.writeBytes(Quadruple.LINE_STR + quadruples.size() + ":" + "\t\tgoto "+main_address+";\n");
				
				dos.writeBytes(Quadruple.LINE_STR + quadruples.size() + ":" + "\t\tprintf(\"Process is terminated with no error.\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\t\treturn 0;\n");}
			else
				dos.writeBytes(Quadruple.LINE_STR + quadruples.size() + ":" + "\t\tprintf(\"Process is terminated with no error.\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\t\treturn 0;\n");

			// Array index out of bound error.
			if(quadruples.size() < 100)
				dos.writeBytes(Quadruple.LINE_STR + (quadruples.size() + 1) + ":" + "\t\tprintf(\"Array Error: Index out of bound!\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\treturn -1;\n");
			else
				dos.writeBytes(Quadruple.LINE_STR + (quadruples.size() + 1) + ":" + "\t\tprintf(\"Array Error: Index out of bound!\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\treturn -1;\n");

			// Invalid array size error.
			if(quadruples.size() < 100)
				dos.writeBytes(Quadruple.LINE_STR + (quadruples.size() + 2) + ":" + "\t\tprintf(\"Array Error: Invalid array size!\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\treturn -2;\n");
			else
				dos.writeBytes(Quadruple.LINE_STR + (quadruples.size() + 2) + ":" + "\t\tprintf(\"Array Error: Invalid array size!\\n\");\n" +
					"\t\t\t\tgetchar();\n\t\t\treturn -2;\n");

			dos.writeBytes("}\n");
		} catch (IOException EVal) {
			EVal.printStackTrace();
		}

	}



/* Line 875 of lalr1.java  */
/* Line 3832 of "YYParser.java"  */

}


/* Line 879 of lalr1.java  */
/* Line 1860 of "YYParser.y"  */

class EVal {

	public static final int TYPE_CODE_UNKNOWN = -1;
	public static final int TYPE_CODE_INTEGER = 0;
	public static final int TYPE_CODE_REAL = 1;
	public static final int TYPE_CODE_CHAR = 2;
	public static final int TYPE_CODE_BOOLEAN = 3;
	public static final int TYPE_CODE_RANGE = 4;
	public static final int TYPE_CODE_STRUCT = 5;	

	public String place;
	public int type;
	public boolean array;

	public int quad;

	public static ArrayList<Integer> arrayIndexOutOfBoundList = new ArrayList<>();
	public static ArrayList<Integer> invalidArraySizeList = new ArrayList<>();
	public ArrayList<Integer> initList;
	public ArrayList<Integer> nextList;
	public ArrayList<Integer> trueList;
	public ArrayList<Integer> falseList;

	public ArrayList<ArrayList<EVal>> initializersList;
	public ArrayList<EVal> declareds;

	public ArrayList<EVal> initializers;

	public EVal() {
	}

	public static ArrayList<Integer> makeList(int number) {
		ArrayList<Integer> result = new ArrayList<>();
		result.add(number);
		return result;
	}

	public static ArrayList<Integer> merge(ArrayList<Integer> al1, ArrayList<Integer> al2) {
		ArrayList<Integer> result = new ArrayList<>();
		
		if(al1 == null){
			result = al2;
		}
		
		if(al2 == null){
			result = al1;
		}
		else{
		result.addAll(al1);
		result.addAll(al2);
		
		}
		return result;
	}

	public static ArrayList<ArrayList<EVal>> makeInitializersList(ArrayList<EVal> initializers) {
		ArrayList<ArrayList<EVal>> result = new ArrayList<>();
		result.add(initializers);
		return result;
	}

	public static ArrayList<EVal> makeInitializersOrDeclareds(EVal initializerOrdDeclared) {
		ArrayList<EVal> result = new ArrayList<>();
		result.add(initializerOrdDeclared);
		return result;
	}
}

class Quadruple {

	public static final String LINE_STR = "Line";

	public String operation;
	public String arg0;
	public String arg1;
	public String result;

	public Quadruple(String operation, String arg0, String arg1, String result) {
		this.operation = operation;
		this.arg0 = arg0;
		this.arg1 = arg1;
		this.result = result;
	}

	@Override
	public String toString() {
		switch(operation.toLowerCase()){
			case "goto":
				return operation + " " + LINE_STR + result + ";";
			case "check":
				return "if (" + arg0 + ") goto " + LINE_STR + result + ";";
			case "==":
			case "<":
			case "<=":
			case ">":
			case ">=":
			case "+":
			case "-":
			case "*":
			case "/":
			case "%":
				return result + " = " + arg0 + " " + operation + " " + arg1 + ";";
			case "=":
				return result + " = " + arg0 + " " + "==" + " " + arg1 + ";";
			case "<>":
				return result + " != " + arg0 + " " + "==" + " " + arg1 + ";";
			case "usub":
				return result + " = -" + arg0 + ";";
			case ":=":
				return result + " = " + arg0 + ";";
			case "cast":
				return result + " = (" + arg1 + ") " + arg0 + ";";
			case "init":
				return arg1 + " " + result + ";";
			case "iprint":
				return "printf(\"%s = %d\\n\", \"" + result + "\", " + result + ");";
			case "rprint":
				return "printf(\"%s = %f\\n\", \"" + result + "\", " + result + ");";
			case "cprint":
				return "printf(\"%s = '%c'\\n\", \"" + result + "\", " + result + ");";
			case "bprint":
				return "printf(\"%s = %s\\n\", \"" + result + "\", " + result + " ? \"true\" : \"false\");";
			case "aiprint":
				return "printf(\"%s[%d] = %d\\n\", \"" + result + "\", " + arg0 + ", " + result + "[" + arg1 + "]);";
			case "arprint":
				return "printf(\"%s[%d] = %f\\n\", \"" + result + "\", " + arg0 + ", " + result + "[" + arg1 + "]);";
			case "acprint":
				return "printf(\"%s[%d] = '%c'\\n\", \"" + result + "\", " + arg0 + ", " + result + "[" + arg1 + "]);";
			case "abprint":
				return "printf(\"%s[%d] = %s\\n\", \"" + result + "\", " + arg0 + ", " + result + "[" + arg1 + "] ? \"true\" : \"false\");";
			case "[]=":
				return "*(" + result + " + " + arg1 + ") = " + arg0 + ";";
			case "=[]":
				return result + " = *(" + arg0 + " + " + arg1 + ");";
			case "malloc":
				return result + " = " + "malloc(sizeof(" + arg0 + ") * " + arg1+ ");";
			default:
				return null;
		}
	}
}

class SymbolTable {

	public static final int NOT_IN_SYMBOL_TABLE = -1;

	public ArrayList<String> names;
	public ArrayList<Integer> types;
	public ArrayList<Boolean> arrays;
	public ArrayList<String[]>functions;

	public SymbolTable() {
		names = new ArrayList<>();
		types = new ArrayList<>();
		arrays = new ArrayList<>();
		functions = new ArrayList<>();
	}

	public int lookUp(String name) {
		return names.indexOf(name);
	}

	public String addFunction(String name, int address) {
		
		for(String[] str: functions){
			if(str[0].equals(name)){
				return str[1];
			}
		}
		String str[] = new String[2];
		str[0] = name;
		str[1] = Integer.toString(address);
		functions.add(str);
		return "not_found";
	}
	
	public String findFunction(String name){
	
		for(String[] str: functions){
			if(str[0].equals(name)){
				return str[1];
			}
		}
		return "not_found";
	}

	public boolean addToSymbolTable(String name, int type, boolean array) {
		if (lookUp(name) == -1) {
			System.out.println(name+" added");
			names.add(name);
			types.add(type);
			arrays.add(array);
			return true;
		}
		return false;
	}

	@Override
    public String toString() {
        if(names.size() == 0)
            return null;
        String res = "";
        for(int i = 0; i < names.size(); i++) {
            switch (types.get(i)) {
                case EVal.TYPE_CODE_INTEGER:
                    res += "\t" + YYParser.TYPE_STRING_INTEGER;
                    break;
                case EVal.TYPE_CODE_REAL:
                    res += "\t" + YYParser.TYPE_STRING_REAL;
                    break;
                case EVal.TYPE_CODE_CHAR:
                    res += "\t" + YYParser.TYPE_STRING_CHAR;
                    break;
                case EVal.TYPE_CODE_BOOLEAN:
                    res += "\t" + YYParser.TYPE_STRING_BOOLEAN;
                    break;
                case EVal.TYPE_CODE_RANGE:
                    continue;
            }
            res += (arrays.get(i) ? " *" : " ") + names.get(i) + ";\n";
        }
        return res;
	}

}


