/* The following code was generated by JFlex 1.6.1 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.*;

class MainClass {
    public static void main(String[] args) {
        FileReader fr = null;
        String input = "code.txt";
        try {
            fr = new FileReader(input);		
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Lexeme\tToken\tAttribute");
        Yylex yylex = new Yylex(fr);
        try {
            yylex.yylex();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
  

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>./lexer.lex</tt>
 */
class Yylex {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\45\1\44\1\47\1\47\1\44\31\0\1\46\2\0\1\55"+
    "\1\56\1\52\1\57\1\0\1\42\1\40\11\37\1\0\1\50\5\0"+
    "\33\54\1\41\26\54\1\43\7\54\1\32\1\0\1\33\7\0\1\47"+
    "\u057a\0\14\36\1\53\16\36\1\51\6\36\1\34\4\36\1\4\1\1"+
    "\1\36\1\11\1\12\1\36\1\16\1\10\1\26\1\36\1\2\1\36"+
    "\1\7\1\20\1\13\1\30\1\22\1\36\1\17\1\60\6\36\1\24"+
    "\1\23\1\36\1\14\1\5\1\3\1\6\1\35\65\36\1\27\13\36"+
    "\1\15\36\36\1\25\5\36\1\31\34\36\1\21\63\36\u1928\0\1\47"+
    "\1\47\udb26\0\u02b0\36\160\0\220\36\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u0110\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\16\2\1\3\1\4\1\2\1\5\1\6"+
    "\2\1\1\7\1\1\2\10\2\11\1\12\1\13\15\2"+
    "\1\14\6\2\1\15\5\0\4\2\1\16\1\2\1\17"+
    "\6\2\1\20\4\2\1\21\1\2\2\22\2\0\2\23"+
    "\1\24\2\2\1\25\1\16\3\2\1\26\1\27\1\30"+
    "\1\31\1\32\2\2\1\21\1\2\1\22\2\23\3\2"+
    "\1\33\2\2\1\34\1\35\1\36\1\2\1\37\1\40"+
    "\1\41\1\42";

  private static int [] zzUnpackAction() {
    int [] result = new int[117];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\61\0\142\0\223\0\304\0\365\0\u0126\0\u0157"+
    "\0\u0188\0\u01b9\0\u01ea\0\u021b\0\u024c\0\u027d\0\u02ae\0\u02df"+
    "\0\61\0\61\0\u0310\0\u0341\0\u0372\0\u03a3\0\u03d4\0\61"+
    "\0\u0405\0\61\0\223\0\61\0\223\0\61\0\61\0\u0436"+
    "\0\u0467\0\u0498\0\u04c9\0\u04fa\0\u052b\0\u055c\0\u058d\0\u05be"+
    "\0\u05ef\0\u0620\0\u0651\0\u0682\0\223\0\u06b3\0\u06e4\0\u0715"+
    "\0\u0746\0\u0777\0\u07a8\0\61\0\u0405\0\u07d9\0\u080a\0\u083b"+
    "\0\u086c\0\u089d\0\u08ce\0\u08ff\0\u0930\0\u0961\0\u0992\0\223"+
    "\0\u09c3\0\u09f4\0\u0a25\0\u0a56\0\u0a87\0\u0ab8\0\223\0\u0ae9"+
    "\0\u0b1a\0\u0b4b\0\u0b7c\0\u0bad\0\u0bde\0\u07d9\0\61\0\u0c0f"+
    "\0\u0c40\0\u0c71\0\u0ca2\0\223\0\u0cd3\0\u0d04\0\223\0\223"+
    "\0\u0d35\0\u0d66\0\u0d97\0\223\0\223\0\223\0\223\0\223"+
    "\0\u0dc8\0\u0df9\0\223\0\u0e2a\0\u080a\0\61\0\u0c40\0\u0e5b"+
    "\0\u0e8c\0\u0ebd\0\223\0\u0eee\0\u0f1f\0\223\0\223\0\223"+
    "\0\u0f50\0\223\0\223\0\223\0\223";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[117];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\2\4\1\5\1\6\1\4\1\7\1\10"+
    "\1\11\1\12\1\13\2\4\1\14\2\4\1\15\3\4"+
    "\1\16\1\17\1\20\2\4\1\21\1\22\1\23\1\24"+
    "\1\4\2\25\1\26\1\27\3\30\1\31\1\0\1\32"+
    "\1\33\1\34\1\35\2\2\1\36\1\37\1\40\62\0"+
    "\1\4\1\41\15\4\1\42\11\4\2\0\5\4\10\0"+
    "\1\4\1\0\1\4\4\0\1\4\1\0\31\4\2\0"+
    "\5\4\10\0\1\4\1\0\1\4\4\0\1\4\1\0"+
    "\12\4\1\43\3\4\1\44\11\4\1\45\2\0\5\4"+
    "\10\0\1\4\1\0\1\4\4\0\1\4\1\0\2\4"+
    "\1\46\26\4\2\0\5\4\10\0\1\4\1\0\1\4"+
    "\4\0\1\4\1\0\3\4\1\47\25\4\2\0\5\4"+
    "\10\0\1\4\1\0\1\4\4\0\1\4\1\0\13\4"+
    "\1\50\15\4\2\0\5\4\10\0\1\4\1\0\1\4"+
    "\4\0\1\4\1\0\4\4\1\51\24\4\2\0\5\4"+
    "\10\0\1\4\1\0\1\4\4\0\1\4\1\0\3\4"+
    "\1\52\25\4\2\0\5\4\10\0\1\4\1\0\1\4"+
    "\4\0\1\4\1\0\15\4\1\53\13\4\2\0\5\4"+
    "\10\0\1\4\1\0\1\4\4\0\1\4\1\0\1\4"+
    "\1\54\27\4\2\0\5\4\10\0\1\4\1\0\1\4"+
    "\4\0\1\4\1\0\3\4\1\55\25\4\2\0\5\4"+
    "\10\0\1\4\1\0\1\4\4\0\1\4\1\0\13\4"+
    "\1\56\15\4\2\0\5\4\10\0\1\4\1\0\1\4"+
    "\4\0\1\4\1\0\1\4\1\57\27\4\2\0\5\4"+
    "\10\0\1\4\1\0\1\4\4\0\1\4\1\0\20\4"+
    "\1\60\10\4\2\0\5\4\10\0\1\4\1\0\1\4"+
    "\4\0\1\4\1\0\2\4\1\61\26\4\2\0\5\4"+
    "\10\0\1\4\1\0\1\4\4\0\1\4\1\0\22\4"+
    "\1\62\5\4\1\63\2\0\5\4\10\0\1\4\1\0"+
    "\1\4\4\0\1\4\37\0\2\25\60\0\1\64\5\0"+
    "\1\65\54\0\1\66\12\0\1\67\3\0\41\70\1\71"+
    "\2\70\1\0\2\70\1\0\11\70\1\0\13\4\1\72"+
    "\15\4\2\0\5\4\10\0\1\4\1\0\1\4\4\0"+
    "\1\4\1\0\2\4\1\73\25\4\1\74\2\0\5\4"+
    "\10\0\1\4\1\0\1\4\4\0\1\4\1\0\24\4"+
    "\1\75\4\4\2\0\5\4\10\0\1\4\1\0\1\4"+
    "\4\0\1\4\1\0\13\4\1\76\15\4\2\0\5\4"+
    "\10\0\1\4\1\0\1\4\4\0\1\4\1\0\17\4"+
    "\1\77\11\4\2\0\5\4\10\0\1\4\1\0\1\4"+
    "\4\0\1\4\1\0\1\4\1\100\27\4\2\0\5\4"+
    "\10\0\1\4\1\0\1\4\4\0\1\4\1\0\21\4"+
    "\1\101\7\4\2\0\5\4\10\0\1\4\1\0\1\4"+
    "\4\0\1\4\1\0\7\4\1\102\21\4\2\0\5\4"+
    "\10\0\1\4\1\0\1\4\4\0\1\4\1\0\3\4"+
    "\1\103\25\4\2\0\5\4\10\0\1\4\1\0\1\4"+
    "\4\0\1\4\1\0\3\4\1\104\25\4\2\0\5\4"+
    "\10\0\1\4\1\0\1\4\4\0\1\4\1\0\1\105"+
    "\30\4\2\0\5\4\10\0\1\4\1\0\1\4\4\0"+
    "\1\4\1\0\20\4\1\106\10\4\2\0\5\4\10\0"+
    "\1\4\1\0\1\4\4\0\1\4\1\0\23\4\1\107"+
    "\5\4\2\0\5\4\10\0\1\4\1\0\1\4\4\0"+
    "\1\4\1\0\20\4\1\110\10\4\2\0\5\4\10\0"+
    "\1\4\1\0\1\4\4\0\1\4\1\0\6\4\1\111"+
    "\22\4\2\0\5\4\10\0\1\4\1\0\1\4\4\0"+
    "\1\4\1\0\17\4\1\112\11\4\2\0\5\4\10\0"+
    "\1\4\1\0\1\4\4\0\1\4\1\0\30\4\1\113"+
    "\2\0\5\4\10\0\1\4\1\0\1\4\4\0\1\4"+
    "\1\0\10\4\1\114\20\4\2\0\5\4\10\0\1\4"+
    "\1\0\1\4\4\0\1\4\1\0\1\4\1\115\27\4"+
    "\2\0\5\4\10\0\1\4\1\0\1\4\4\0\1\4"+
    "\1\0\31\66\2\0\6\66\1\0\1\116\2\117\3\0"+
    "\1\66\1\0\2\66\3\0\1\66\44\67\1\0\2\67"+
    "\1\0\5\67\1\120\3\67\41\0\1\121\4\0\1\122"+
    "\12\0\44\70\1\0\1\70\1\123\1\0\11\70\1\0"+
    "\21\4\1\124\7\4\2\0\5\4\10\0\1\4\1\0"+
    "\1\4\4\0\1\4\1\0\3\4\1\125\25\4\2\0"+
    "\5\4\10\0\1\4\1\0\1\4\4\0\1\4\1\0"+
    "\1\4\1\126\27\4\2\0\5\4\10\0\1\4\1\0"+
    "\1\4\4\0\1\4\1\0\2\4\1\127\26\4\2\0"+
    "\5\4\10\0\1\4\1\0\1\4\4\0\1\4\1\0"+
    "\14\4\1\130\14\4\2\0\5\4\10\0\1\4\1\0"+
    "\1\4\4\0\1\4\1\0\3\4\1\131\25\4\2\0"+
    "\5\4\10\0\1\4\1\0\1\4\4\0\1\4\1\0"+
    "\22\4\1\132\6\4\2\0\5\4\10\0\1\4\1\0"+
    "\1\4\4\0\1\4\1\0\10\4\1\133\20\4\2\0"+
    "\5\4\10\0\1\4\1\0\1\4\4\0\1\4\1\0"+
    "\23\4\1\134\5\4\2\0\5\4\10\0\1\4\1\0"+
    "\1\4\4\0\1\4\1\0\4\4\1\135\24\4\2\0"+
    "\5\4\10\0\1\4\1\0\1\4\4\0\1\4\1\0"+
    "\10\4\1\136\20\4\2\0\5\4\10\0\1\4\1\0"+
    "\1\4\4\0\1\4\1\0\15\4\1\137\13\4\2\0"+
    "\5\4\10\0\1\4\1\0\1\4\4\0\1\4\1\0"+
    "\25\4\1\140\3\4\2\0\5\4\10\0\1\4\1\0"+
    "\1\4\4\0\1\4\1\0\10\4\1\124\20\4\2\0"+
    "\5\4\10\0\1\4\1\0\1\4\4\0\1\4\1\0"+
    "\23\4\1\141\5\4\2\0\5\4\10\0\1\4\1\0"+
    "\1\4\4\0\1\4\1\0\3\4\1\142\25\4\2\0"+
    "\5\4\10\0\1\4\1\0\1\4\4\0\1\4\1\0"+
    "\20\4\1\143\10\4\2\0\5\4\10\0\1\4\1\0"+
    "\1\4\4\0\1\4\1\0\2\4\1\144\26\4\2\0"+
    "\5\4\10\0\1\4\1\0\1\4\4\0\1\4\42\67"+
    "\1\145\1\67\1\0\2\67\1\0\5\67\1\120\3\67"+
    "\46\0\1\122\53\0\1\146\60\0\1\147\4\0\1\122"+
    "\13\0\4\4\1\150\24\4\2\0\5\4\10\0\1\4"+
    "\1\0\1\4\4\0\1\4\1\0\25\4\1\151\3\4"+
    "\2\0\5\4\10\0\1\4\1\0\1\4\4\0\1\4"+
    "\1\0\1\4\1\152\27\4\2\0\5\4\10\0\1\4"+
    "\1\0\1\4\4\0\1\4\1\0\20\4\1\153\10\4"+
    "\2\0\5\4\10\0\1\4\1\0\1\4\4\0\1\4"+
    "\1\0\3\4\1\154\25\4\2\0\5\4\10\0\1\4"+
    "\1\0\1\4\4\0\1\4\1\0\1\4\1\155\27\4"+
    "\2\0\5\4\10\0\1\4\1\0\1\4\4\0\1\4"+
    "\1\0\5\4\1\156\23\4\2\0\5\4\10\0\1\4"+
    "\1\0\1\4\4\0\1\4\1\0\5\4\1\157\23\4"+
    "\2\0\5\4\10\0\1\4\1\0\1\4\4\0\1\4"+
    "\1\0\5\4\1\160\23\4\2\0\5\4\10\0\1\4"+
    "\1\0\1\4\4\0\1\4\1\0\3\4\1\161\25\4"+
    "\2\0\5\4\10\0\1\4\1\0\1\4\4\0\1\4"+
    "\1\0\20\4\1\162\10\4\2\0\5\4\10\0\1\4"+
    "\1\0\1\4\4\0\1\4\1\0\1\4\1\163\27\4"+
    "\2\0\5\4\10\0\1\4\1\0\1\4\4\0\1\4"+
    "\1\0\27\4\1\164\1\4\2\0\5\4\10\0\1\4"+
    "\1\0\1\4\4\0\1\4\1\0\2\4\1\165\26\4"+
    "\2\0\5\4\10\0\1\4\1\0\1\4\4\0\1\4";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3969];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\16\1\2\11\5\1\1\11\1\1\1\11"+
    "\1\1\1\11\1\1\2\11\24\1\1\11\5\0\25\1"+
    "\1\11\2\0\24\1\1\11\17\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[117];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 204) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Yytoken yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { //System.out.println(yytext() + "\t" + "nothing\t" + '-');
            }
          case 35: break;
          case 2: 
            { //System.out.println(yytext() + "\t" + "shenase\t" + '-');
	return YYParser.SHENASE;
            }
          case 36: break;
          case 3: 
            { return YYParser.AKULAD_BAZ_KW;
            }
          case 37: break;
          case 4: 
            { return YYParser.AKULAD_BASTE_KW;
            }
          case 38: break;
          case 5: 
            { //System.out.println(yytext() + "\t" + "AND_KW\t" + '-');
	return YYParser.AND_KW;
            }
          case 39: break;
          case 6: 
            { //System.out.println(yytext() + "\t" + "adad\t" + '-');
	return YYParser.ADAD;
            }
          case 40: break;
          case 7: 
            { //System.out.println(yytext() + "\t" + "new_line\t" + '-');
            }
          case 41: break;
          case 8: 
            { //System.out.println(yytext() + "\t" + "noghte_virgul\t" + '-');
	return YYParser.NOGHTE_VIRGUL;
            }
          case 42: break;
          case 9: 
            { //System.out.println(yytext() + "\t" + "comma\t" + '-');
	return YYParser.COMMA;
            }
          case 43: break;
          case 10: 
            { //System.out.println(yytext() + "\t" + "ADD_KW\t" + '-');
	return YYParser.ADD_KW;
            }
          case 44: break;
          case 11: 
            { //System.out.println(yytext() + "\t" + "SUB_KW\t" + '-');
	return YYParser.SUB_KW;
            }
          case 45: break;
          case 12: 
            { //System.out.println(yytext() + "\t" + "OR_KW\t" + '-');
	return YYParser.OR_KW;
            }
          case 46: break;
          case 13: 
            { System.out.println(yytext() + "\t" + "null_char\t" + '-');
            }
          case 47: break;
          case 14: 
            { //System.out.println(yytext() + "\t" + "MAIN_KW\t" + '-');
	return YYParser.MAIN_KW;
            }
          case 48: break;
          case 15: 
            { //System.out.println(yytext() + "\t" + "IF_KW\t" + '-');
	return YYParser.IF_KW;
            }
          case 49: break;
          case 16: 
            { //System.out.println(yytext() + "\t" + "jens_kw\t" + '-');
	return YYParser.CHAR_KW;
            }
          case 50: break;
          case 17: 
            { //System.out.println(yytext() + "\t" + "while_kw\t" + '-');
	return YYParser.WHILE_KW;
            }
          case 51: break;
          case 18: 
            { //System.out.println(yytext() + "\t" + "comments\t" + '-');
	return YYParser.COMMENT;
            }
          case 52: break;
          case 19: 
            { //System.out.println(yytext() + "\t" + "harfe_sabet\t" + '-');
	return YYParser.HARFE_SABET;
            }
          case 53: break;
          case 20: 
            { //System.out.println(yytext() + "\t" + "BOOLEAN_CONSTANT\t" + '-');
	return YYParser.BOOLEAN_CONSTANT;
            }
          case 54: break;
          case 21: 
            { //System.out.println(yytext() + "\t" + "break_kw\t" + '-');
	return YYParser.BREAK_KW;
            }
          case 55: break;
          case 22: 
            { //System.out.println(yytext() + "\t" + "NOT_KW\t" + '-');
	return YYParser.NOT_KW;
            }
          case 56: break;
          case 23: 
            { //System.out.println(yytext() + "\t" + "end_kw\t" + '-');
	return YYParser.END_KW;
            }
          case 57: break;
          case 24: 
            { //System.out.println(yytext() + "\t" + "constant_kw\t" + '-');
	return YYParser.CONSTANT_KW;
            }
          case 58: break;
          case 25: 
            { //System.out.println(yytext() + "\t" + "jens_kw\t" + '-');
	return YYParser.INT_KW;
            }
          case 59: break;
          case 26: 
            { //System.out.println(yytext() + "\t" + "jens_kw\t" + '-');
	return YYParser.SWITCH_KW;
            }
          case 60: break;
          case 27: 
            { //System.out.println(yytext() + "\t" + "jens_kw\t" + '-');
	return YYParser.BOOLEAN_KW;
            }
          case 61: break;
          case 28: 
            { //System.out.println(yytext() + "\t" + "THEN_KW\t" + '-');
	return YYParser.THEN_KW;
            }
          case 62: break;
          case 29: 
            { //System.out.println(yytext() + "\t" + "ELSE_KW\t" + '-');
	return YYParser.ELSE_KW;
            }
          case 63: break;
          case 30: 
            { //System.out.println(yytext() + "\t" + "PROGRAM_KW\t" + '-');
	return YYParser.PROGRAM_KW;
            }
          case 64: break;
          case 31: 
            { //System.out.println(yytext() + "\t" + "jens_kw\t" + '-');
	return YYParser.FLOAT_KW;
            }
          case 65: break;
          case 32: 
            { //System.out.println(yytext() + "\t" + "type_kw\t" + '-');
	return YYParser.STRUCT_KW;
            }
          case 66: break;
          case 33: 
            { //System.out.println(yytext() + "\t" + "default_kw\t" + '-');
	return YYParser.DEFAULT_KW;
            }
          case 67: break;
          case 34: 
            { //System.out.println(yytext() + "\t" + "return_kw\t" + '-');
	return YYParser.RETURN_KW;
            }
          case 68: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}