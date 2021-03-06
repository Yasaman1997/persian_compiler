
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
/* Line 1 of "parser.y"  */

package myCompiler;
import java.io.*;


/**
 * A Bison parser, automatically generated from <tt>parser.y</tt>.
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
  public static final int BOOLEAN_CONSTANT = 266;
  /** Token number, to be returned by the scanner.  */
  public static final int SWITCH_KW = 267;
  /** Token number, to be returned by the scanner.  */
  public static final int END_KW = 268;
  /** Token number, to be returned by the scanner.  */
  public static final int DEFAULT_KW = 269;
  /** Token number, to be returned by the scanner.  */
  public static final int BREAK_KW = 270;
  /** Token number, to be returned by the scanner.  */
  public static final int RETURN_KW = 271;
  /** Token number, to be returned by the scanner.  */
  public static final int COMMA = 272;
  /** Token number, to be returned by the scanner.  */
  public static final int PROGRAM_KW = 273;
  /** Token number, to be returned by the scanner.  */
  public static final int STRUCT_KW = 274;
  /** Token number, to be returned by the scanner.  */
  public static final int CONSTANT_KW = 275;
  /** Token number, to be returned by the scanner.  */
  public static final int IF_KW = 276;
  /** Token number, to be returned by the scanner.  */
  public static final int THEN_KW = 277;
  /** Token number, to be returned by the scanner.  */
  public static final int ELSE_KW = 278;
  /** Token number, to be returned by the scanner.  */
  public static final int AND_KW = 279;
  /** Token number, to be returned by the scanner.  */
  public static final int OR_KW = 280;
  /** Token number, to be returned by the scanner.  */
  public static final int NOT_KW = 281;
  /** Token number, to be returned by the scanner.  */
  public static final int WHILE_KW = 282;
  /** Token number, to be returned by the scanner.  */
  public static final int NOGHTE_VIRGUL = 283;
  /** Token number, to be returned by the scanner.  */
  public static final int ADAD = 284;
  /** Token number, to be returned by the scanner.  */
  public static final int SHENASE = 285;
  /** Token number, to be returned by the scanner.  */
  public static final int HARFE_SABET = 286;
  /** Token number, to be returned by the scanner.  */
  public static final int KEY_KW = 287;
  /** Token number, to be returned by the scanner.  */
  public static final int MORE_THAN_KW = 288;
  /** Token number, to be returned by the scanner.  */
  public static final int NOGHTE_KW = 289;
  /** Token number, to be returned by the scanner.  */
  public static final int MULTIPLY_KW = 290;
  /** Token number, to be returned by the scanner.  */
  public static final int BRACKET_BASTE_KW = 291;
  /** Token number, to be returned by the scanner.  */
  public static final int BRACKET_BAZ_KW = 292;
  /** Token number, to be returned by the scanner.  */
  public static final int PARANTHESIS_BASTE_KW = 293;
  /** Token number, to be returned by the scanner.  */
  public static final int PARANTHESIS_BAZ_KW = 294;
  /** Token number, to be returned by the scanner.  */
  public static final int TRUE_KW = 295;
  /** Token number, to be returned by the scanner.  */
  public static final int QUESTION_KW = 296;
  /** Token number, to be returned by the scanner.  */
  public static final int EQUAL_EQUAL_KW = 297;
  /** Token number, to be returned by the scanner.  */
  public static final int EQUAL_KW = 298;
  /** Token number, to be returned by the scanner.  */
  public static final int DEVIDE_KW = 299;
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
  public static final int DEVIDE_EQUAL_KW = 314;
  /** Token number, to be returned by the scanner.  */
  public static final int LOWER_THAN_ELSE_KW = 315;



  

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
/* Line 67 of "parser.y"  */
    {
		System.out.println("Rule 1.1 ");
	};
  break;
    

  case 3:
  if (yyn == 3)
    
/* Line 353 of lalr1.java  */
/* Line 72 of "parser.y"  */
    {
		System.out.println("Rule 2.1: ");
	};
  break;
    

  case 4:
  if (yyn == 4)
    
/* Line 353 of lalr1.java  */
/* Line 75 of "parser.y"  */
    {
		System.out.println("Rule 2.2");
	};
  break;
    

  case 5:
  if (yyn == 5)
    
/* Line 353 of lalr1.java  */
/* Line 80 of "parser.y"  */
    {
		System.out.println("Rule 3.1: ");
	};
  break;
    

  case 6:
  if (yyn == 6)
    
/* Line 353 of lalr1.java  */
/* Line 83 of "parser.y"  */
    {
		System.out.println("Rule 3.2: " );
	};
  break;
    

  case 7:
  if (yyn == 7)
    
/* Line 353 of lalr1.java  */
/* Line 86 of "parser.y"  */
    {
		System.out.println("Rule 3.3: " );
	};
  break;
    

  case 8:
  if (yyn == 8)
    
/* Line 353 of lalr1.java  */
/* Line 91 of "parser.y"  */
    {
		System.out.println("Rule 4.1 ");
	};
  break;
    

  case 9:
  if (yyn == 9)
    
/* Line 353 of lalr1.java  */
/* Line 95 of "parser.y"  */
    {
		System.out.println("Rule 4.2 ");
	};
  break;
    

  case 10:
  if (yyn == 10)
    
/* Line 353 of lalr1.java  */
/* Line 100 of "parser.y"  */
    {
		System.out.println("Rule 5 ");
	};
  break;
    

  case 11:
  if (yyn == 11)
    
/* Line 353 of lalr1.java  */
/* Line 104 of "parser.y"  */
    {
		System.out.println("Rule 5 ");
	};
  break;
    

  case 12:
  if (yyn == 12)
    
/* Line 353 of lalr1.java  */
/* Line 109 of "parser.y"  */
    {
		System.out.println("Rule 6");
	};
  break;
    

  case 13:
  if (yyn == 13)
    
/* Line 353 of lalr1.java  */
/* Line 114 of "parser.y"  */
    {
		System.out.println("Rule 7.1");
	};
  break;
    

  case 14:
  if (yyn == 14)
    
/* Line 353 of lalr1.java  */
/* Line 118 of "parser.y"  */
    {
		System.out.println("Rule 7.2");
	};
  break;
    

  case 15:
  if (yyn == 15)
    
/* Line 353 of lalr1.java  */
/* Line 123 of "parser.y"  */
    {System.out.println("Rule 8.1");};
  break;
    

  case 16:
  if (yyn == 16)
    
/* Line 353 of lalr1.java  */
/* Line 124 of "parser.y"  */
    {System.out.println("Rule 8.2");};
  break;
    

  case 17:
  if (yyn == 17)
    
/* Line 353 of lalr1.java  */
/* Line 125 of "parser.y"  */
    {System.out.println("Rule 8.3");};
  break;
    

  case 18:
  if (yyn == 18)
    
/* Line 353 of lalr1.java  */
/* Line 126 of "parser.y"  */
    {System.out.println("Rule 8.4");};
  break;
    

  case 19:
  if (yyn == 19)
    
/* Line 353 of lalr1.java  */
/* Line 129 of "parser.y"  */
    {
		System.out.println("Rule 9");
	};
  break;
    

  case 20:
  if (yyn == 20)
    
/* Line 353 of lalr1.java  */
/* Line 134 of "parser.y"  */
    {
		System.out.println("Rule 10.1 ");
	};
  break;
    

  case 21:
  if (yyn == 21)
    
/* Line 353 of lalr1.java  */
/* Line 137 of "parser.y"  */
    {
		System.out.println("Rule 10.2 ");
	};
  break;
    

  case 22:
  if (yyn == 22)
    
/* Line 353 of lalr1.java  */
/* Line 142 of "parser.y"  */
    {System.out.println("Rule 11.1 ");};
  break;
    

  case 23:
  if (yyn == 23)
    
/* Line 353 of lalr1.java  */
/* Line 143 of "parser.y"  */
    {
		System.out.println("Rule 11.2 ");
	};
  break;
    

  case 24:
  if (yyn == 24)
    
/* Line 353 of lalr1.java  */
/* Line 148 of "parser.y"  */
    {
		System.out.println("Rule 12.1: " );
	};
  break;
    

  case 25:
  if (yyn == 25)
    
/* Line 353 of lalr1.java  */
/* Line 151 of "parser.y"  */
    {
		System.out.println("Rule 12.2: ");
	};
  break;
    

  case 26:
  if (yyn == 26)
    
/* Line 353 of lalr1.java  */
/* Line 156 of "parser.y"  */
    {
		System.out.println("Rule 13.1");
	};
  break;
    

  case 27:
  if (yyn == 27)
    
/* Line 353 of lalr1.java  */
/* Line 160 of "parser.y"  */
    {
		System.out.println("Rule 13.2");
	};
  break;
    

  case 28:
  if (yyn == 28)
    
/* Line 353 of lalr1.java  */
/* Line 164 of "parser.y"  */
    {System.out.println("Rule 13.3");};
  break;
    

  case 29:
  if (yyn == 29)
    
/* Line 353 of lalr1.java  */
/* Line 166 of "parser.y"  */
    {System.out.println("Rule 13.4");};
  break;
    

  case 30:
  if (yyn == 30)
    
/* Line 353 of lalr1.java  */
/* Line 169 of "parser.y"  */
    {System.out.println("Rule 15.1"};
  break;
    

  case 31:
  if (yyn == 31)
    
/* Line 353 of lalr1.java  */
/* Line 171 of "parser.y"  */
    {System.out.println("Rule 15.2");};
  break;
    

  case 32:
  if (yyn == 32)
    
/* Line 353 of lalr1.java  */
/* Line 174 of "parser.y"  */
    {System.out.println("Rule 16");};
  break;
    

  case 33:
  if (yyn == 33)
    
/* Line 353 of lalr1.java  */
/* Line 177 of "parser.y"  */
    {System.out.println("Rule 17.1");};
  break;
    

  case 34:
  if (yyn == 34)
    
/* Line 353 of lalr1.java  */
/* Line 179 of "parser.y"  */
    {System.out.println("Rule 17.2");};
  break;
    

  case 35:
  if (yyn == 35)
    
/* Line 353 of lalr1.java  */
/* Line 182 of "parser.y"  */
    {System.out.println("Rule 18.1");};
  break;
    

  case 36:
  if (yyn == 36)
    
/* Line 353 of lalr1.java  */
/* Line 183 of "parser.y"  */
    {System.out.println("Rule 18.2");};
  break;
    

  case 37:
  if (yyn == 37)
    
/* Line 353 of lalr1.java  */
/* Line 186 of "parser.y"  */
    {System.out.println("Rule 19.1");};
  break;
    

  case 38:
  if (yyn == 38)
    
/* Line 353 of lalr1.java  */
/* Line 188 of "parser.y"  */
    {System.out.println("Rule 19.2");};
  break;
    

  case 39:
  if (yyn == 39)
    
/* Line 353 of lalr1.java  */
/* Line 190 of "parser.y"  */
    {System.out.println("Rule 19.3");};
  break;
    

  case 40:
  if (yyn == 40)
    
/* Line 353 of lalr1.java  */
/* Line 192 of "parser.y"  */
    {System.out.println("Rule 19.4");};
  break;
    

  case 41:
  if (yyn == 41)
    
/* Line 353 of lalr1.java  */
/* Line 194 of "parser.y"  */
    {System.out.println("Rule 19.5");};
  break;
    

  case 42:
  if (yyn == 42)
    
/* Line 353 of lalr1.java  */
/* Line 196 of "parser.y"  */
    {System.out.println("Rule 19.6");};
  break;
    

  case 43:
  if (yyn == 43)
    
/* Line 353 of lalr1.java  */
/* Line 199 of "parser.y"  */
    {
		System.out.println("Rule 20.1");
	};
  break;
    

  case 44:
  if (yyn == 44)
    
/* Line 353 of lalr1.java  */
/* Line 203 of "parser.y"  */
    {
		System.out.println("Rule 20.2");
	};
  break;
    

  case 45:
  if (yyn == 45)
    
/* Line 353 of lalr1.java  */
/* Line 207 of "parser.y"  */
    {
		System.out.println("Rule 20.3");
	};
  break;
    

  case 46:
  if (yyn == 46)
    
/* Line 353 of lalr1.java  */
/* Line 211 of "parser.y"  */
    {
		System.out.println("Rule 20.4");
	};
  break;
    

  case 47:
  if (yyn == 47)
    
/* Line 353 of lalr1.java  */
/* Line 216 of "parser.y"  */
    {System.out.println("Rule 21.1");};
  break;
    

  case 48:
  if (yyn == 48)
    
/* Line 353 of lalr1.java  */
/* Line 218 of "parser.y"  */
    {System.out.println("Rule 21.2");};
  break;
    

  case 49:
  if (yyn == 49)
    
/* Line 353 of lalr1.java  */
/* Line 222 of "parser.y"  */
    {
		System.out.println("Rule 22.1");
	};
  break;
    

  case 50:
  if (yyn == 50)
    
/* Line 353 of lalr1.java  */
/* Line 226 of "parser.y"  */
    {System.out.println("Rule 22.2");};
  break;
    

  case 51:
  if (yyn == 51)
    
/* Line 353 of lalr1.java  */
/* Line 229 of "parser.y"  */
    {System.out.println("Rule 23.1");};
  break;
    

  case 52:
  if (yyn == 52)
    
/* Line 353 of lalr1.java  */
/* Line 231 of "parser.y"  */
    {System.out.println("Rule 23.2");};
  break;
    

  case 53:
  if (yyn == 53)
    
/* Line 353 of lalr1.java  */
/* Line 233 of "parser.y"  */
    {System.out.println("Rule 23.3");};
  break;
    

  case 54:
  if (yyn == 54)
    
/* Line 353 of lalr1.java  */
/* Line 235 of "parser.y"  */
    {System.out.println("Rule 23.4");};
  break;
    

  case 55:
  if (yyn == 55)
    
/* Line 353 of lalr1.java  */
/* Line 239 of "parser.y"  */
    { System.out.println("Rule 24.1"); };
  break;
    

  case 56:
  if (yyn == 56)
    
/* Line 353 of lalr1.java  */
/* Line 241 of "parser.y"  */
    {System.out.println("Rule 24.2");};
  break;
    

  case 57:
  if (yyn == 57)
    
/* Line 353 of lalr1.java  */
/* Line 244 of "parser.y"  */
    {System.out.println("Rule 25");};
  break;
    

  case 58:
  if (yyn == 58)
    
/* Line 353 of lalr1.java  */
/* Line 247 of "parser.y"  */
    {System.out.println("Rule 26");};
  break;
    

  case 59:
  if (yyn == 59)
    
/* Line 353 of lalr1.java  */
/* Line 250 of "parser.y"  */
    {System.out.println("Rule 27.1");};
  break;
    

  case 60:
  if (yyn == 60)
    
/* Line 353 of lalr1.java  */
/* Line 252 of "parser.y"  */
    {System.out.println("Rule 27.2");};
  break;
    

  case 61:
  if (yyn == 61)
    
/* Line 353 of lalr1.java  */
/* Line 255 of "parser.y"  */
    {System.out.println("Rule 28");};
  break;
    

  case 62:
  if (yyn == 62)
    
/* Line 353 of lalr1.java  */
/* Line 258 of "parser.y"  */
    {System.out.println("Rule 29.1");};
  break;
    

  case 63:
  if (yyn == 63)
    
/* Line 353 of lalr1.java  */
/* Line 260 of "parser.y"  */
    {System.out.println("Rule 29.2");};
  break;
    

  case 64:
  if (yyn == 64)
    
/* Line 353 of lalr1.java  */
/* Line 262 of "parser.y"  */
    {System.out.println("Rule 29.3");};
  break;
    

  case 65:
  if (yyn == 65)
    
/* Line 353 of lalr1.java  */
/* Line 264 of "parser.y"  */
    {System.out.println("Rule 29.4");};
  break;
    

  case 66:
  if (yyn == 66)
    
/* Line 353 of lalr1.java  */
/* Line 266 of "parser.y"  */
    {System.out.println("Rule 29.5");};
  break;
    

  case 67:
  if (yyn == 67)
    
/* Line 353 of lalr1.java  */
/* Line 268 of "parser.y"  */
    {System.out.println("Rule 29.6");};
  break;
    

  case 68:
  if (yyn == 68)
    
/* Line 353 of lalr1.java  */
/* Line 270 of "parser.y"  */
    {System.out.println("Rule 29.7");};
  break;
    

  case 69:
  if (yyn == 69)
    
/* Line 353 of lalr1.java  */
/* Line 272 of "parser.y"  */
    {System.out.println(" Rule 29.8");};
  break;
    

  case 70:
  if (yyn == 70)
    
/* Line 353 of lalr1.java  */
/* Line 275 of "parser.y"  */
    {System.out.println("Rule 30.1");};
  break;
    

  case 71:
  if (yyn == 71)
    
/* Line 353 of lalr1.java  */
/* Line 277 of "parser.y"  */
    {System.out.println("Rule 30.2");};
  break;
    

  case 72:
  if (yyn == 72)
    
/* Line 353 of lalr1.java  */
/* Line 279 of "parser.y"  */
    {System.out.println("Rule 30.3");};
  break;
    

  case 73:
  if (yyn == 73)
    
/* Line 353 of lalr1.java  */
/* Line 281 of "parser.y"  */
    {System.out.println("Rule 30.4");};
  break;
    

  case 74:
  if (yyn == 74)
    
/* Line 353 of lalr1.java  */
/* Line 283 of "parser.y"  */
    {System.out.println("Rule 30.5");};
  break;
    

  case 75:
  if (yyn == 75)
    
/* Line 353 of lalr1.java  */
/* Line 285 of "parser.y"  */
    {System.out.println("Rule 30.6");};
  break;
    

  case 76:
  if (yyn == 76)
    
/* Line 353 of lalr1.java  */
/* Line 288 of "parser.y"  */
    {System.out.println("Rule 31.1");};
  break;
    

  case 77:
  if (yyn == 77)
    
/* Line 353 of lalr1.java  */
/* Line 290 of "parser.y"  */
    {System.out.println("Rule 31.2");};
  break;
    

  case 78:
  if (yyn == 78)
    
/* Line 353 of lalr1.java  */
/* Line 293 of "parser.y"  */
    {System.out.println("Rule 32.1");};
  break;
    

  case 79:
  if (yyn == 79)
    
/* Line 353 of lalr1.java  */
/* Line 295 of "parser.y"  */
    {System.out.println("Rule 32.2");};
  break;
    

  case 80:
  if (yyn == 80)
    
/* Line 353 of lalr1.java  */
/* Line 297 of "parser.y"  */
    {System.out.println("Rule 32.3");};
  break;
    

  case 81:
  if (yyn == 81)
    
/* Line 353 of lalr1.java  */
/* Line 299 of "parser.y"  */
    {System.out.println("Rule 32.4");};
  break;
    

  case 82:
  if (yyn == 82)
    
/* Line 353 of lalr1.java  */
/* Line 301 of "parser.y"  */
    {System.out.println("Rule 32.5");};
  break;
    

  case 83:
  if (yyn == 83)
    
/* Line 353 of lalr1.java  */
/* Line 304 of "parser.y"  */
    {System.out.println("Rule 33.1");};
  break;
    

  case 84:
  if (yyn == 84)
    
/* Line 353 of lalr1.java  */
/* Line 306 of "parser.y"  */
    {System.out.println("Rule 33.2");};
  break;
    

  case 85:
  if (yyn == 85)
    
/* Line 353 of lalr1.java  */
/* Line 308 of "parser.y"  */
    {System.out.println("Rule 33.2");};
  break;
    

  case 86:
  if (yyn == 86)
    
/* Line 353 of lalr1.java  */
/* Line 310 of "parser.y"  */
    {System.out.println("Rule 33.2");};
  break;
    

  case 87:
  if (yyn == 87)
    
/* Line 353 of lalr1.java  */
/* Line 312 of "parser.y"  */
    {System.out.println("Rule 33.2");};
  break;
    

  case 88:
  if (yyn == 88)
    
/* Line 353 of lalr1.java  */
/* Line 314 of "parser.y"  */
    {System.out.println("Rule 33.2");};
  break;
    

  case 89:
  if (yyn == 89)
    
/* Line 353 of lalr1.java  */
/* Line 318 of "parser.y"  */
    {System.out.println("Rule 35.1");};
  break;
    

  case 90:
  if (yyn == 90)
    
/* Line 353 of lalr1.java  */
/* Line 320 of "parser.y"  */
    {System.out.println("Rule 35.2");};
  break;
    

  case 91:
  if (yyn == 91)
    
/* Line 353 of lalr1.java  */
/* Line 323 of "parser.y"  */
    {System.out.println("Rule 36.1");};
  break;
    

  case 92:
  if (yyn == 92)
    
/* Line 353 of lalr1.java  */
/* Line 325 of "parser.y"  */
    {System.out.println("Rule 36.2");};
  break;
    

  case 93:
  if (yyn == 93)
    
/* Line 353 of lalr1.java  */
/* Line 327 of "parser.y"  */
    {System.out.println("Rule 36.3");};
  break;
    

  case 94:
  if (yyn == 94)
    
/* Line 353 of lalr1.java  */
/* Line 330 of "parser.y"  */
    {System.out.println("Rule 37.1");};
  break;
    

  case 95:
  if (yyn == 95)
    
/* Line 353 of lalr1.java  */
/* Line 332 of "parser.y"  */
    {System.out.println("Rule 37.2");};
  break;
    

  case 96:
  if (yyn == 96)
    
/* Line 353 of lalr1.java  */
/* Line 335 of "parser.y"  */
    {System.out.println("Rule 38.1");};
  break;
    

  case 97:
  if (yyn == 97)
    
/* Line 353 of lalr1.java  */
/* Line 337 of "parser.y"  */
    {System.out.println("Rule 38.2");};
  break;
    

  case 98:
  if (yyn == 98)
    
/* Line 353 of lalr1.java  */
/* Line 339 of "parser.y"  */
    {System.out.println("Rule 38.3");};
  break;
    

  case 99:
  if (yyn == 99)
    
/* Line 353 of lalr1.java  */
/* Line 342 of "parser.y"  */
    {System.out.println("Rule 39.1");};
  break;
    

  case 100:
  if (yyn == 100)
    
/* Line 353 of lalr1.java  */
/* Line 344 of "parser.y"  */
    {System.out.println("Rule 39.2");};
  break;
    

  case 101:
  if (yyn == 101)
    
/* Line 353 of lalr1.java  */
/* Line 346 of "parser.y"  */
    {System.out.println("Rule 39.3");};
  break;
    

  case 102:
  if (yyn == 102)
    
/* Line 353 of lalr1.java  */
/* Line 349 of "parser.y"  */
    {System.out.println("Rule 40.1");};
  break;
    

  case 103:
  if (yyn == 103)
    
/* Line 353 of lalr1.java  */
/* Line 351 of "parser.y"  */
    {System.out.println("Rule 40.2");};
  break;
    

  case 104:
  if (yyn == 104)
    
/* Line 353 of lalr1.java  */
/* Line 354 of "parser.y"  */
    {System.out.println("Rule 42.1");};
  break;
    

  case 105:
  if (yyn == 105)
    
/* Line 353 of lalr1.java  */
/* Line 356 of "parser.y"  */
    {System.out.println("Rule 42.2");};
  break;
    

  case 106:
  if (yyn == 106)
    
/* Line 353 of lalr1.java  */
/* Line 359 of "parser.y"  */
    {System.out.println("Rule 43.1");};
  break;
    

  case 107:
  if (yyn == 107)
    
/* Line 353 of lalr1.java  */
/* Line 361 of "parser.y"  */
    {System.out.println("Rule 43.1");};
  break;
    

  case 108:
  if (yyn == 108)
    
/* Line 353 of lalr1.java  */
/* Line 363 of "parser.y"  */
    {System.out.println("Rule 43.2");};
  break;
    

  case 109:
  if (yyn == 109)
    
/* Line 353 of lalr1.java  */
/* Line 365 of "parser.y"  */
    {System.out.println("Rule 43.3");};
  break;
    

  case 110:
  if (yyn == 110)
    
/* Line 353 of lalr1.java  */
/* Line 367 of "parser.y"  */
    {System.out.println("Rule 43.4");};
  break;
    



/* Line 353 of lalr1.java  */
/* Line 1432 of "parser.java"  */
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
  private static final short yypact_ninf_ = -43;
  private static final short yypact_[] =
  {
        -4,     8,    20,   122,   -43,   -43,   -43,   -43,   -43,    21,
      16,   122,   -43,   -43,    33,   -43,   -43,    42,     2,   -43,
      27,     7,   -43,    30,   384,   254,    50,    29,   -43,    55,
      11,    60,   -43,   302,   -43,   173,   390,   -43,    60,   -43,
     -43,   116,    57,   268,   302,    53,   -43,   -43,    54,   -43,
      61,   -43,   302,   -43,   -43,   -43,   -43,   -43,   -43,   -43,
     -43,   -43,   -43,   -43,    74,   114,   -43,    -5,   -43,   302,
     -43,   301,   -43,   -43,   -43,    68,    90,   -43,   173,   254,
      72,   254,    34,    73,   -43,   114,    -8,   -43,   -43,   -43,
      25,    81,   -43,   167,   -43,   196,   -43,   -43,    85,   327,
     302,   288,   302,    76,   -43,   302,   302,   302,   302,   302,
     302,   -43,   302,   -43,   302,   302,   -43,   302,   -43,   -43,
     302,   -43,   100,   302,   302,   302,   -43,   -43,   302,   302,
     302,    98,    50,   -43,   -43,   -43,   -43,   254,   -43,   -43,
     225,   -43,   -43,   -43,   254,   337,   -43,   -43,    -6,   340,
     -43,   109,    -3,   109,    -3,   109,   -10,   -43,   -43,   -10,
     -43,    17,   -43,   106,   -43,   -43,   -43,   -43,   -43,   -43,
     -43,   -43,   -43,   127,   254,   302,   -43,   141,   -43,   254,
     -43,   -43,   129,   104,   -43,   111,   134,   -43,   117,   155,
     254,   120,   254,   -43,   153,   254,   156,   -43,   157,   -43,
     -43
  };

  /* YYDEFACT[S] -- default rule to reduce with in state S when YYTABLE
     doesn't specify something else to do.  Zero means the default is an
     error.  */
  private static final byte yydefact_[] =
  {
         0,     0,     0,     0,     1,    16,    15,    18,    17,     0,
       0,     2,     4,     5,     0,     6,     7,     0,     0,     3,
      24,     0,    20,    22,     0,     0,     0,     0,    31,     0,
       0,     0,    19,     0,     9,     0,     0,    11,     0,    14,
     107,     0,     0,     0,     0,     0,    50,   106,    96,   108,
       0,    92,     0,   109,    93,   110,    91,    29,    37,    38,
      39,    40,    41,    42,     0,    69,    75,    76,    83,     0,
      90,    94,    95,   100,   101,    35,    32,    34,     0,     0,
       0,     0,     0,    24,    21,    23,    94,    13,     8,    10,
       0,   107,    46,     0,    48,     0,    61,    59,     0,     0,
       0,     0,     0,     0,    49,     0,     0,     0,     0,     0,
       0,    80,     0,    82,     0,     0,    79,     0,    78,    81,
       0,    89,     0,     0,     0,     0,    67,    68,     0,     0,
       0,     0,     0,    30,    28,    25,    27,     0,    12,    44,
       0,    45,    47,    60,     0,     0,   103,   105,     0,     0,
      99,    71,    70,    74,    72,    73,    84,    86,    87,    85,
      88,    77,    98,     0,    62,    63,    64,    65,    66,    36,
      33,    26,    43,    51,     0,     0,   102,     0,    97,     0,
      58,   104,     0,     0,    52,     0,     0,    54,     0,     0,
       0,     0,     0,    53,     0,     0,     0,    55,     0,    57,
      56
  };

  /* YYPGOTO[NTERM-NUM].  */
  private static final short yypgoto_[] =
  {
       -43,   -43,   -43,   175,   -43,   148,   -33,   -43,     1,   -43,
     152,   160,   -43,   -43,   162,   115,   -43,    69,   -25,   -43,
     110,   -43,   -43,   -43,   -43,   -43,   -43,   -43,   -42,   -31,
     -43,   -43,   291,   140,   -43,   -43,   -11,   -43,   -43,   -43,
     -43
  };

  /* YYDEFGOTO[NTERM-NUM].  */
  private static final short
  yydefgoto_[] =
  {
        -1,     2,    11,    12,    13,    36,    37,    38,    39,    15,
      21,    22,    23,    16,    27,    28,    76,    77,    94,    58,
      95,    59,    60,   183,   189,    61,    62,    63,    64,    65,
      66,   120,    67,    68,    69,    70,    71,    72,    73,   148,
      74
  };

  /* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
     positive, shift that token.  If negative, reduce the rule which
     number is the opposite.  If zero, do what YYDEFACT says.  */
  private static final short yytable_ninf_ = -17;
  private static final short
  yytable_[] =
  {
        57,    98,    85,    89,    14,   110,     5,     6,     7,     8,
     103,   175,    14,    99,     1,     5,     6,     7,     8,    26,
       4,   105,    86,   107,    31,   112,   122,   110,   111,   123,
     112,    26,   176,    86,   114,    32,    87,   113,     3,   114,
      25,   117,    31,   115,   109,   116,   117,   118,   119,    81,
      24,    17,   112,   138,   134,    18,   136,    78,    86,   147,
      89,   114,    78,    20,    29,   115,    30,    79,   117,   145,
     142,   149,   137,    33,   151,   152,   153,   154,   155,    26,
      75,   163,   164,   165,    80,    96,   166,   167,   168,    86,
      83,    86,   100,   101,    86,    86,    86,    86,    86,    86,
     102,    86,   104,    86,    86,   131,    86,   132,   135,    86,
      29,   -16,   171,   143,   150,   142,   186,   187,   188,   173,
      91,     6,     7,     8,    41,    92,     5,     6,     7,     8,
     162,    42,    43,   181,   169,   107,    35,    44,   105,   106,
     107,     9,   178,    45,    46,    47,    48,    49,    50,   180,
     179,    51,    10,   182,   184,    52,    53,    54,   185,   108,
     190,   109,    55,   191,    56,   194,   192,   196,   193,   195,
     198,    91,     6,     7,     8,    41,   139,     5,     6,     7,
       8,   197,    42,    43,   199,   200,    19,    35,    44,    93,
      90,    84,    82,   133,    45,    46,    47,    48,    49,    50,
      40,   170,    51,   140,    41,   141,    52,    53,    54,   121,
       0,    42,    43,    55,     0,    56,     0,    44,     0,     0,
       0,     0,     0,    45,    46,    47,    48,    49,    50,    40,
       0,    51,     0,    41,   172,    52,    53,    54,     0,     0,
      42,    43,    55,     0,    56,     0,    44,     0,     0,     0,
       0,     0,    45,    46,    47,    48,    49,    50,    40,     0,
      51,     0,    41,     0,    52,    53,    54,     0,     0,    42,
      43,    55,    40,    56,     0,    44,     0,     0,     0,     0,
       0,    45,    46,    47,    48,    49,    50,     0,     0,    51,
       0,     0,    40,    52,    53,    54,    97,    47,    48,    49,
      55,     0,    56,    51,     0,     0,    40,    52,    53,    54,
       0,     0,     0,     0,    55,     0,    56,    47,    48,    49,
       0,     0,     0,    51,     0,     0,   146,    52,    53,    54,
       0,    47,    48,    49,    55,   122,    56,    51,   123,     0,
       0,    52,    53,    54,   124,     0,     0,     0,    55,   144,
      56,   105,   106,   107,     0,   125,   126,   127,   128,   129,
     130,   105,   106,   107,   105,   106,   107,     0,     0,     0,
       0,     0,   108,     0,   109,   174,     0,     0,   177,     0,
       0,     0,   108,     0,   109,   108,     0,   109,     5,     6,
       7,     8,     0,    34,     5,     6,     7,     8,     0,    88,
       0,   156,     0,   157,    35,   158,   159,     0,   160,     0,
      35,   161
  };

  /* YYCHECK.  */
  private static final short
  yycheck_[] =
  {
        25,    43,    33,    36,     3,    10,     4,     5,     6,     7,
      52,    17,    11,    44,    18,     4,     5,     6,     7,    18,
       0,    24,    33,    26,    17,    35,    34,    10,    33,    37,
      35,    30,    38,    44,    44,    28,    35,    42,    30,    44,
      38,    51,    17,    48,    47,    50,    51,    52,    53,    38,
       8,    30,    35,    28,    79,    39,    81,    28,    69,   101,
      93,    44,    28,    30,    37,    48,    39,    38,    51,   100,
      95,   102,    38,    43,   105,   106,   107,   108,   109,    78,
      30,   123,   124,   125,    29,    28,   128,   129,   130,   100,
      30,   102,    39,    39,   105,   106,   107,   108,   109,   110,
      39,   112,    28,   114,   115,    37,   117,    17,    36,   120,
      37,    30,   137,    28,    38,   140,    12,    13,    14,   144,
       4,     5,     6,     7,     8,     9,     4,     5,     6,     7,
      30,    15,    16,   175,    36,    26,    20,    21,    24,    25,
      26,    19,    36,    27,    28,    29,    30,    31,    32,   174,
      23,    35,    30,    12,   179,    39,    40,    41,    29,    45,
      49,    47,    46,    29,    48,   190,    49,   192,    13,    49,
     195,     4,     5,     6,     7,     8,     9,     4,     5,     6,
       7,    28,    15,    16,    28,    28,    11,    20,    21,    41,
      38,    31,    30,    78,    27,    28,    29,    30,    31,    32,
       4,   132,    35,    93,     8,     9,    39,    40,    41,    69,
      -1,    15,    16,    46,    -1,    48,    -1,    21,    -1,    -1,
      -1,    -1,    -1,    27,    28,    29,    30,    31,    32,     4,
      -1,    35,    -1,     8,     9,    39,    40,    41,    -1,    -1,
      15,    16,    46,    -1,    48,    -1,    21,    -1,    -1,    -1,
      -1,    -1,    27,    28,    29,    30,    31,    32,     4,    -1,
      35,    -1,     8,    -1,    39,    40,    41,    -1,    -1,    15,
      16,    46,     4,    48,    -1,    21,    -1,    -1,    -1,    -1,
      -1,    27,    28,    29,    30,    31,    32,    -1,    -1,    35,
      -1,    -1,     4,    39,    40,    41,    28,    29,    30,    31,
      46,    -1,    48,    35,    -1,    -1,     4,    39,    40,    41,
      -1,    -1,    -1,    -1,    46,    -1,    48,    29,    30,    31,
      -1,    -1,    -1,    35,    -1,    -1,    38,    39,    40,    41,
      -1,    29,    30,    31,    46,    34,    48,    35,    37,    -1,
      -1,    39,    40,    41,    43,    -1,    -1,    -1,    46,    22,
      48,    24,    25,    26,    -1,    54,    55,    56,    57,    58,
      59,    24,    25,    26,    24,    25,    26,    -1,    -1,    -1,
      -1,    -1,    45,    -1,    47,    38,    -1,    -1,    38,    -1,
      -1,    -1,    45,    -1,    47,    45,    -1,    47,     4,     5,
       6,     7,    -1,     9,     4,     5,     6,     7,    -1,     9,
      -1,   110,    -1,   112,    20,   114,   115,    -1,   117,    -1,
      20,   120
  };

  /* STOS_[STATE-NUM] -- The (internal number of the) accessing
     symbol of state STATE-NUM.  */
  private static final byte
  yystos_[] =
  {
         0,    18,    62,    30,     0,     4,     5,     6,     7,    19,
      30,    63,    64,    65,    69,    70,    74,    30,    39,    64,
      30,    71,    72,    73,     8,    38,    69,    75,    76,    37,
      39,    17,    28,    43,     9,    20,    66,    67,    68,    69,
       4,     8,    15,    16,    21,    27,    28,    29,    30,    31,
      32,    35,    39,    40,    41,    46,    48,    79,    80,    82,
      83,    86,    87,    88,    89,    90,    91,    93,    94,    95,
      96,    97,    98,    99,   101,    30,    77,    78,    28,    38,
      29,    38,    75,    30,    72,    90,    97,    69,     9,    67,
      71,     4,     9,    66,    79,    81,    28,    28,    89,    90,
      39,    39,    39,    89,    28,    24,    25,    26,    45,    47,
      10,    33,    35,    42,    44,    48,    50,    51,    52,    53,
      92,    94,    34,    37,    43,    54,    55,    56,    57,    58,
      59,    37,    17,    76,    79,    36,    79,    38,    28,     9,
      81,     9,    79,    28,    22,    90,    38,    89,   100,    90,
      38,    90,    90,    90,    90,    90,    93,    93,    93,    93,
      93,    93,    30,    89,    89,    89,    89,    89,    89,    36,
      78,    79,     9,    79,    38,    17,    38,    38,    36,    23,
      79,    89,    12,    84,    79,    29,    12,    13,    14,    85,
      49,    29,    49,    13,    79,    49,    79,    28,    79,    28,
      28
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
     315
  };

  /* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
  private static final byte
  yyr1_[] =
  {
         0,    61,    62,    63,    63,    64,    64,    64,    65,    65,
      66,    66,    67,    68,    68,    69,    69,    69,    69,    70,
      71,    71,    72,    72,    73,    73,    74,    74,    74,    74,
      75,    75,    76,    77,    77,    78,    78,    79,    79,    79,
      79,    79,    79,    80,    80,    80,    80,    81,    81,    82,
      82,    83,    83,    83,    83,    84,    84,    85,    86,    87,
      87,    88,    89,    89,    89,    89,    89,    89,    89,    89,
      90,    90,    90,    90,    90,    90,    91,    91,    92,    92,
      92,    92,    92,    93,    93,    93,    93,    93,    93,    94,
      94,    95,    95,    95,    96,    96,    97,    97,    97,    98,
      98,    98,    99,    99,   100,   100,   101,   101,   101,   101,
     101
  };

  /* YYR2[YYN] -- Number of symbols composing right hand side of rule YYN.  */
  private static final byte
  yyr2_[] =
  {
         0,     2,     3,     2,     1,     1,     1,     1,     5,     4,
       2,     1,     3,     2,     1,     1,     1,     1,     1,     3,
       1,     3,     1,     3,     1,     4,     6,     5,     5,     4,
       3,     1,     2,     3,     1,     1,     3,     1,     1,     1,
       1,     1,     1,     4,     3,     3,     2,     2,     1,     2,
       1,     4,     6,     7,     6,     5,     6,     4,     5,     2,
       3,     2,     3,     3,     3,     3,     3,     2,     2,     1,
       3,     3,     3,     3,     3,     1,     1,     3,     1,     1,
       1,     1,     1,     1,     3,     3,     3,     3,     3,     2,
       1,     1,     1,     1,     1,     1,     1,     4,     3,     3,
       1,     1,     4,     3,     3,     1,     1,     1,     1,     1,
       1
  };

  /* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
     First, the terminals, then, starting at \a yyntokens_, nonterminals.  */
  private static final String yytname_[] =
  {
    "$end", "error", "$undefined", "COMMENT", "FLOAT_KW", "INT_KW",
  "BOOLEAN_KW", "CHAR_KW", "AKULAD_BAZ_KW", "AKULAD_BASTE_KW", "ADD_KW",
  "BOOLEAN_CONSTANT", "SWITCH_KW", "END_KW", "DEFAULT_KW", "BREAK_KW",
  "RETURN_KW", "COMMA", "PROGRAM_KW", "STRUCT_KW", "CONSTANT_KW", "IF_KW",
  "THEN_KW", "ELSE_KW", "AND_KW", "OR_KW", "NOT_KW", "WHILE_KW",
  "NOGHTE_VIRGUL", "ADAD", "SHENASE", "HARFE_SABET", "KEY_KW",
  "MORE_THAN_KW", "NOGHTE_KW", "MULTIPLY_KW", "BRACKET_BASTE_KW",
  "BRACKET_BAZ_KW", "PARANTHESIS_BASTE_KW", "PARANTHESIS_BAZ_KW",
  "TRUE_KW", "QUESTION_KW", "EQUAL_EQUAL_KW", "EQUAL_KW", "DEVIDE_KW",
  "OR_ELSE_KW", "FALSE_KW", "AND_THEN_KW", "MINUS_KW", "DONOGHTE_KW",
  "LESS_EQUAL_KW", "MOD_KW", "LESS_THAN_KW", "MORE_EQUAL_KW",
  "PLUS_EQUAL_KW", "PLUS_PLUS_KW", "MINUS_MINUS_KW", "MINUS_EQUAL_KW",
  "MULTIPLY_EQUAL_KW", "DEVIDE_EQUAL_KW", "LOWER_THAN_ELSE_KW", "$accept",
  "barnameh", "tarifha", "tarif", "tarifeSakhtar", "tarifhayeMahalli",
  "tarifeMoteghayyerMahdud", "jenseMahdud", "jens", "tarifeMoteghayyer",
  "tarifhayeMoteghayyerha", "tarifeMeghdareAvalie",
  "tarifeShenaseMoteghayer", "tarifeTabe", "vorudiha", "jensVorudiha",
  "shenaseyeVorudiha", "shenaseyeVorudi", "jomle", "jomleyeMorakkab",
  "jomleha", "jomleyeEbarat", "jomleyeEntekhab", "onsoreHalat",
  "onsorePishfarz", "jomleyeTekrar", "jomleyeBazgasht", "jomleyeShekast",
  "ebarat", "ebarateSade", "ebarateRabetei", "amalgareRabetei",
  "ebarateRiaziManteghi", "ebarateYegani", "amalgareYegani", "amel",
  "taghirpazir", "taghirnapazir", "sedaZadan", "bordareVorudiha",
  "meghdareSabet", null
  };

  /* YYRHS -- A `-1'-separated list of the rules' RHS.  */
  private static final byte yyrhs_[] =
  {
        62,     0,    -1,    18,    30,    63,    -1,    63,    64,    -1,
      64,    -1,    65,    -1,    70,    -1,    74,    -1,    19,    30,
       8,    66,     9,    -1,    19,    30,     8,     9,    -1,    66,
      67,    -1,    67,    -1,    68,    71,    28,    -1,    20,    69,
      -1,    69,    -1,     5,    -1,     4,    -1,     7,    -1,     6,
      -1,    69,    71,    28,    -1,    72,    -1,    71,    17,    72,
      -1,    73,    -1,    73,    43,    90,    -1,    30,    -1,    30,
      37,    29,    36,    -1,    69,    30,    39,    75,    38,    79,
      -1,    69,    30,    39,    38,    79,    -1,    30,    39,    75,
      38,    79,    -1,    30,    39,    38,    79,    -1,    75,    28,
      76,    -1,    76,    -1,    69,    77,    -1,    77,    17,    78,
      -1,    78,    -1,    30,    -1,    30,    37,    36,    -1,    80,
      -1,    82,    -1,    83,    -1,    86,    -1,    87,    -1,    88,
      -1,     8,    66,    81,     9,    -1,     8,    66,     9,    -1,
       8,    81,     9,    -1,     8,     9,    -1,    81,    79,    -1,
      79,    -1,    89,    28,    -1,    28,    -1,    21,    90,    22,
      79,    -1,    21,    90,    22,    79,    23,    79,    -1,    32,
      39,    90,    38,    84,    85,    13,    -1,    32,    39,    90,
      38,    84,    13,    -1,    12,    29,    49,    79,    28,    -1,
      84,    12,    29,    49,    79,    28,    -1,    14,    49,    79,
      28,    -1,    27,    39,    90,    38,    79,    -1,    16,    28,
      -1,    16,    89,    28,    -1,    15,    28,    -1,    97,    43,
      89,    -1,    97,    54,    89,    -1,    97,    57,    89,    -1,
      97,    58,    89,    -1,    97,    59,    89,    -1,    97,    55,
      -1,    97,    56,    -1,    90,    -1,    90,    25,    90,    -1,
      90,    24,    90,    -1,    90,    45,    90,    -1,    90,    47,
      90,    -1,    90,    26,    90,    -1,    91,    -1,    93,    -1,
      93,    92,    93,    -1,    52,    -1,    50,    -1,    33,    -1,
      53,    -1,    42,    -1,    94,    -1,    93,    10,    93,    -1,
      93,    48,    93,    -1,    93,    35,    93,    -1,    93,    44,
      93,    -1,    93,    51,    93,    -1,    95,    94,    -1,    96,
      -1,    48,    -1,    35,    -1,    41,    -1,    97,    -1,    98,
      -1,    30,    -1,    97,    37,    89,    36,    -1,    97,    34,
      30,    -1,    39,    89,    38,    -1,    99,    -1,   101,    -1,
      30,    39,   100,    38,    -1,    30,    39,    38,    -1,   100,
      17,    89,    -1,    89,    -1,    29,    -1,     4,    -1,    31,
      -1,    40,    -1,    46,    -1
  };

  /* YYPRHS[YYN] -- Index of the first RHS symbol of rule number YYN in
     YYRHS.  */
  private static final short yyprhs_[] =
  {
         0,     0,     3,     7,    10,    12,    14,    16,    18,    24,
      29,    32,    34,    38,    41,    43,    45,    47,    49,    51,
      55,    57,    61,    63,    67,    69,    74,    81,    87,    93,
      98,   102,   104,   107,   111,   113,   115,   119,   121,   123,
     125,   127,   129,   131,   136,   140,   144,   147,   150,   152,
     155,   157,   162,   169,   177,   184,   190,   197,   202,   208,
     211,   215,   218,   222,   226,   230,   234,   238,   241,   244,
     246,   250,   254,   258,   262,   266,   268,   270,   274,   276,
     278,   280,   282,   284,   286,   290,   294,   298,   302,   306,
     309,   311,   313,   315,   317,   319,   321,   323,   328,   332,
     336,   338,   340,   345,   349,   353,   355,   357,   359,   361,
     363
  };

  /* YYRLINE[YYN] -- Source line where rule number YYN was defined.  */
  private static final short yyrline_[] =
  {
         0,    67,    67,    72,    75,    80,    83,    86,    91,    95,
     100,   104,   109,   114,   118,   123,   124,   125,   126,   129,
     134,   137,   142,   143,   148,   151,   156,   160,   164,   166,
     169,   171,   174,   177,   179,   182,   183,   186,   188,   190,
     192,   194,   196,   199,   203,   207,   211,   216,   218,   222,
     226,   229,   231,   233,   235,   239,   241,   244,   247,   250,
     252,   255,   258,   260,   262,   264,   266,   268,   270,   272,
     275,   277,   279,   281,   283,   285,   288,   290,   293,   295,
     297,   299,   301,   304,   306,   308,   310,   312,   314,   318,
     320,   323,   325,   327,   330,   332,   335,   337,   339,   342,
     344,   346,   349,   351,   354,   356,   359,   361,   363,   365,
     367
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
      55,    56,    57,    58,    59,    60
  };

  private static final byte yytranslate_ (int t)
  {
    if (t >= 0 && t <= yyuser_token_number_max_)
      return yytranslate_table_[t];
    else
      return yyundef_token_;
  }

  private static final int yylast_ = 411;
  private static final int yynnts_ = 41;
  private static final int yyempty_ = -2;
  private static final int yyfinal_ = 4;
  private static final int yyterror_ = 1;
  private static final int yyerrcode_ = 256;
  private static final int yyntokens_ = 61;

  private static final int yyuser_token_number_max_ = 315;
  private static final int yyundef_token_ = 2;

/* User implementation code.  */
/* Unqualified %code blocks.  */

/* Line 875 of lalr1.java  */
/* Line 15 of "parser.y"  */

	static PrintStream writer;

    public static void main(String args[]) throws IOException, FileNotFoundException {
        YYParser yyparser;
        final Yylex lexer;

        writer = new PrintStream(new File("output.txt"));
        lexer = new Yylex(new InputStreamReader(new FileInputStream("java_code.txt")));

        yyparser = new YYParser(new Lexer() {

            @Override
            public int yylex() {
                int yyl_return = -1;
                try {

                    yyl_return = lexer.yylex();
                } catch (IOException e) {
                    System.err.println("IO error :" + e);
                }
                return yyl_return;
            }

            @Override
            public void yyerror(String error) {
                System.err.println("Error : " + error);
            }

            @Override
            public Object getLVal() {
                return null;
            }
        });
        yyparser.parse();

        return;
    }



/* Line 875 of lalr1.java  */
/* Line 2266 of "parser.java"  */

}


