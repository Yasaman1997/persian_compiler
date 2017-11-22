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
 * from the specification file <tt>./lexer.flex</tt>
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
    "\11\0\1\44\1\43\1\46\1\46\1\43\27\0\1\73\1\0\1\45"+
    "\1\61\1\62\1\54\1\74\1\51\1\65\1\56\1\41\1\37\11\36"+
    "\1\71\1\47\1\55\1\70\1\72\1\66\1\0\32\53\1\57\1\40"+
    "\1\60\25\53\1\42\7\53\1\31\1\0\1\32\7\0\1\46\u057a\0"+
    "\14\35\1\52\16\35\1\50\3\35\1\67\2\35\1\33\4\35\1\4"+
    "\1\1\1\35\1\11\1\12\1\35\1\14\1\10\1\30\1\35\1\2"+
    "\1\35\1\7\1\17\1\13\1\25\1\21\1\35\1\16\1\63\6\35"+
    "\1\20\1\22\1\35\1\23\1\5\1\3\1\6\1\34\65\35\1\24"+
    "\7\35\1\64\42\35\1\26\5\35\1\27\34\35\1\15\63\35\u1928\0"+
    "\1\46\1\46\udb26\0\u02b0\35\160\0\220\35\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u0110\0";

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
    "\1\1\1\7\1\10\1\1\2\11\2\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\2\1\22\2\23"+
    "\1\24\1\25\1\26\1\27\1\30\14\2\1\31\7\2"+
    "\1\32\3\0\1\33\2\0\1\34\1\35\1\2\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\4\2\1\44\6\2"+
    "\1\45\7\2\1\46\1\2\2\47\2\0\2\50\1\51"+
    "\2\2\1\52\3\2\1\53\1\54\1\55\1\56\1\57"+
    "\2\2\1\60\1\61\2\2\1\46\1\2\1\47\2\50"+
    "\3\2\1\62\3\2\1\63\1\2\1\64\1\65\1\2"+
    "\1\66\1\67\1\2\1\70\1\2\1\71\1\72\1\73";

  private static int [] zzUnpackAction() {
    int [] result = new int[151];
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
    "\0\0\0\75\0\172\0\267\0\364\0\u0131\0\u016e\0\u01ab"+
    "\0\u01e8\0\u0225\0\u0262\0\u029f\0\u02dc\0\u0319\0\u0356\0\u0393"+
    "\0\75\0\75\0\u03d0\0\u040d\0\u044a\0\u0487\0\u04c4\0\75"+
    "\0\u0501\0\75\0\267\0\75\0\267\0\u053e\0\u057b\0\75"+
    "\0\75\0\75\0\75\0\75\0\u05b8\0\u05f5\0\75\0\267"+
    "\0\u0632\0\75\0\u066f\0\75\0\u06ac\0\u06e9\0\u0726\0\u0763"+
    "\0\u07a0\0\u07dd\0\u081a\0\u0857\0\u0894\0\u08d1\0\u090e\0\u094b"+
    "\0\u0988\0\u09c5\0\u0a02\0\u0a3f\0\u0a7c\0\u0ab9\0\u0af6\0\u0b33"+
    "\0\u0b70\0\75\0\u0501\0\u0bad\0\u0bea\0\75\0\u0c27\0\u0c64"+
    "\0\75\0\75\0\u0ca1\0\75\0\75\0\75\0\75\0\75"+
    "\0\75\0\u0cde\0\u0d1b\0\u0d58\0\u0d95\0\267\0\u0dd2\0\u0e0f"+
    "\0\u0e4c\0\u0e89\0\u0ec6\0\u0f03\0\267\0\u0f40\0\u0f7d\0\u0fba"+
    "\0\u0ff7\0\u1034\0\u1071\0\u10ae\0\u10eb\0\u1128\0\u0bad\0\75"+
    "\0\u1165\0\u11a2\0\u11df\0\u121c\0\267\0\u1259\0\u1296\0\267"+
    "\0\u12d3\0\u1310\0\u134d\0\267\0\267\0\267\0\267\0\267"+
    "\0\u138a\0\u13c7\0\267\0\267\0\u1404\0\u1441\0\267\0\u147e"+
    "\0\u0bea\0\75\0\u11a2\0\u14bb\0\u14f8\0\u1535\0\267\0\u1572"+
    "\0\u15af\0\u15ec\0\267\0\u1629\0\267\0\267\0\u1666\0\267"+
    "\0\267\0\u16a3\0\267\0\u16e0\0\267\0\267\0\267";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[151];
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
    "\1\11\1\12\1\13\1\14\1\15\6\4\1\16\1\4"+
    "\1\17\1\4\1\20\1\21\1\22\1\23\1\24\1\4"+
    "\2\25\1\26\1\27\3\30\1\31\1\0\1\32\1\33"+
    "\1\34\1\35\1\2\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\4\1\46\1\47\1\50\1\51"+
    "\1\52\1\53\1\54\1\55\76\0\1\4\1\56\14\4"+
    "\1\57\11\4\2\0\5\4\10\0\1\4\1\0\1\4"+
    "\10\0\2\4\2\0\1\4\6\0\30\4\2\0\5\4"+
    "\10\0\1\4\1\0\1\4\10\0\2\4\2\0\1\4"+
    "\6\0\15\4\1\60\10\4\1\61\1\4\2\0\5\4"+
    "\10\0\1\4\1\0\1\4\10\0\2\4\2\0\1\4"+
    "\6\0\2\4\1\62\25\4\2\0\5\4\10\0\1\4"+
    "\1\0\1\4\10\0\2\4\2\0\1\4\6\0\3\4"+
    "\1\63\24\4\2\0\5\4\10\0\1\4\1\0\1\4"+
    "\10\0\2\4\2\0\1\4\6\0\22\4\1\64\5\4"+
    "\2\0\5\4\10\0\1\4\1\0\1\4\10\0\2\4"+
    "\2\0\1\4\6\0\4\4\1\65\23\4\2\0\5\4"+
    "\10\0\1\4\1\0\1\4\10\0\2\4\2\0\1\4"+
    "\6\0\3\4\1\66\24\4\2\0\5\4\10\0\1\4"+
    "\1\0\1\4\10\0\2\4\2\0\1\4\6\0\13\4"+
    "\1\67\14\4\2\0\5\4\10\0\1\4\1\0\1\4"+
    "\10\0\2\4\2\0\1\4\6\0\1\4\1\70\1\4"+
    "\1\71\24\4\2\0\5\4\10\0\1\4\1\0\1\4"+
    "\10\0\2\4\2\0\1\4\6\0\3\4\1\72\24\4"+
    "\2\0\5\4\10\0\1\4\1\0\1\4\10\0\2\4"+
    "\2\0\1\4\6\0\14\4\1\73\13\4\2\0\5\4"+
    "\10\0\1\4\1\0\1\4\10\0\2\4\2\0\1\4"+
    "\6\0\22\4\1\74\5\4\2\0\5\4\10\0\1\4"+
    "\1\0\1\4\10\0\2\4\2\0\1\4\6\0\1\4"+
    "\1\75\26\4\2\0\5\4\10\0\1\4\1\0\1\4"+
    "\10\0\2\4\2\0\1\4\6\0\2\4\1\76\25\4"+
    "\2\0\5\4\10\0\1\4\1\0\1\4\10\0\2\4"+
    "\2\0\1\4\6\0\5\4\1\77\13\4\1\100\4\4"+
    "\1\101\1\4\2\0\5\4\10\0\1\4\1\0\1\4"+
    "\10\0\2\4\2\0\1\4\43\0\2\25\74\0\1\102"+
    "\5\0\1\103\70\0\1\104\12\0\1\105\13\0\1\106"+
    "\4\0\40\107\1\110\2\107\1\0\2\107\1\0\26\107"+
    "\70\0\1\111\74\0\1\112\5\0\22\4\1\113\5\4"+
    "\2\0\5\4\10\0\1\4\1\0\1\4\10\0\2\4"+
    "\2\0\1\4\72\0\1\114\2\0\1\115\74\0\1\116"+
    "\74\0\1\117\74\0\1\120\3\0\1\121\1\0\2\4"+
    "\1\122\23\4\1\123\1\4\2\0\5\4\10\0\1\4"+
    "\1\0\1\4\10\0\2\4\2\0\1\4\6\0\25\4"+
    "\1\124\2\4\2\0\5\4\10\0\1\4\1\0\1\4"+
    "\10\0\2\4\2\0\1\4\6\0\16\4\1\125\11\4"+
    "\2\0\5\4\10\0\1\4\1\0\1\4\10\0\2\4"+
    "\2\0\1\4\6\0\1\4\1\126\26\4\2\0\5\4"+
    "\10\0\1\4\1\0\1\4\10\0\2\4\2\0\1\4"+
    "\6\0\20\4\1\127\7\4\2\0\5\4\10\0\1\4"+
    "\1\0\1\4\10\0\2\4\2\0\1\4\6\0\7\4"+
    "\1\130\20\4\2\0\5\4\10\0\1\4\1\0\1\4"+
    "\10\0\2\4\2\0\1\4\6\0\3\4\1\131\24\4"+
    "\2\0\5\4\10\0\1\4\1\0\1\4\10\0\2\4"+
    "\2\0\1\4\6\0\3\4\1\132\24\4\2\0\5\4"+
    "\10\0\1\4\1\0\1\4\10\0\2\4\2\0\1\4"+
    "\6\0\1\133\27\4\2\0\5\4\10\0\1\4\1\0"+
    "\1\4\10\0\2\4\2\0\1\4\6\0\14\4\1\134"+
    "\13\4\2\0\5\4\10\0\1\4\1\0\1\4\10\0"+
    "\2\4\2\0\1\4\6\0\17\4\1\135\10\4\2\0"+
    "\5\4\10\0\1\4\1\0\1\4\10\0\2\4\2\0"+
    "\1\4\6\0\22\4\1\136\5\4\2\0\5\4\10\0"+
    "\1\4\1\0\1\4\10\0\2\4\2\0\1\4\6\0"+
    "\30\4\2\0\1\4\1\137\3\4\10\0\1\4\1\0"+
    "\1\4\10\0\2\4\2\0\1\4\6\0\16\4\1\140"+
    "\11\4\2\0\5\4\10\0\1\4\1\0\1\4\10\0"+
    "\2\4\2\0\1\4\6\0\14\4\1\141\13\4\2\0"+
    "\5\4\10\0\1\4\1\0\1\4\10\0\2\4\2\0"+
    "\1\4\6\0\6\4\1\142\21\4\2\0\5\4\10\0"+
    "\1\4\1\0\1\4\10\0\2\4\2\0\1\4\6\0"+
    "\26\4\1\143\1\4\2\0\5\4\10\0\1\4\1\0"+
    "\1\4\10\0\2\4\2\0\1\4\6\0\4\4\1\144"+
    "\23\4\2\0\5\4\10\0\1\4\1\0\1\4\10\0"+
    "\2\4\2\0\1\4\6\0\10\4\1\145\17\4\2\0"+
    "\5\4\10\0\1\4\1\0\1\4\10\0\2\4\2\0"+
    "\1\4\6\0\1\4\1\146\26\4\2\0\5\4\10\0"+
    "\1\4\1\0\1\4\10\0\2\4\2\0\1\4\6\0"+
    "\30\104\2\0\6\104\1\0\1\147\2\150\3\0\1\104"+
    "\1\0\2\104\3\0\2\104\2\0\2\104\2\0\1\104"+
    "\5\0\43\105\1\0\2\105\1\0\5\105\1\151\20\105"+
    "\40\0\1\152\4\0\1\153\27\0\43\107\1\0\1\107"+
    "\1\154\1\0\26\107\1\0\20\4\1\155\7\4\2\0"+
    "\5\4\10\0\1\4\1\0\1\4\10\0\2\4\2\0"+
    "\1\4\6\0\3\4\1\156\24\4\2\0\5\4\10\0"+
    "\1\4\1\0\1\4\10\0\2\4\2\0\1\4\6\0"+
    "\1\4\1\157\26\4\2\0\5\4\10\0\1\4\1\0"+
    "\1\4\10\0\2\4\2\0\1\4\6\0\2\4\1\160"+
    "\25\4\2\0\5\4\10\0\1\4\1\0\1\4\10\0"+
    "\2\4\2\0\1\4\6\0\3\4\1\161\24\4\2\0"+
    "\5\4\10\0\1\4\1\0\1\4\10\0\2\4\2\0"+
    "\1\4\6\0\21\4\1\162\6\4\2\0\5\4\10\0"+
    "\1\4\1\0\1\4\10\0\2\4\2\0\1\4\6\0"+
    "\10\4\1\163\17\4\2\0\5\4\10\0\1\4\1\0"+
    "\1\4\10\0\2\4\2\0\1\4\6\0\17\4\1\164"+
    "\10\4\2\0\5\4\10\0\1\4\1\0\1\4\10\0"+
    "\2\4\2\0\1\4\6\0\4\4\1\165\23\4\2\0"+
    "\5\4\10\0\1\4\1\0\1\4\10\0\2\4\2\0"+
    "\1\4\6\0\10\4\1\166\17\4\2\0\5\4\10\0"+
    "\1\4\1\0\1\4\10\0\2\4\2\0\1\4\6\0"+
    "\13\4\1\167\14\4\2\0\5\4\10\0\1\4\1\0"+
    "\1\4\10\0\2\4\2\0\1\4\6\0\10\4\1\170"+
    "\17\4\2\0\5\4\10\0\1\4\1\0\1\4\10\0"+
    "\2\4\2\0\1\4\6\0\26\4\1\171\1\4\2\0"+
    "\5\4\10\0\1\4\1\0\1\4\10\0\2\4\2\0"+
    "\1\4\6\0\17\4\1\172\10\4\2\0\5\4\10\0"+
    "\1\4\1\0\1\4\10\0\2\4\2\0\1\4\6\0"+
    "\27\4\1\173\2\0\5\4\10\0\1\4\1\0\1\4"+
    "\10\0\2\4\2\0\1\4\6\0\10\4\1\174\17\4"+
    "\2\0\5\4\10\0\1\4\1\0\1\4\10\0\2\4"+
    "\2\0\1\4\6\0\3\4\1\175\24\4\2\0\5\4"+
    "\10\0\1\4\1\0\1\4\10\0\2\4\2\0\1\4"+
    "\6\0\30\4\2\0\5\4\10\0\1\4\1\0\1\4"+
    "\10\0\1\4\1\176\2\0\1\4\6\0\14\4\1\177"+
    "\13\4\2\0\5\4\10\0\1\4\1\0\1\4\10\0"+
    "\2\4\2\0\1\4\6\0\2\4\1\200\25\4\2\0"+
    "\5\4\10\0\1\4\1\0\1\4\10\0\2\4\2\0"+
    "\1\4\5\0\41\105\1\201\1\105\1\0\2\105\1\0"+
    "\5\105\1\151\20\105\45\0\1\153\67\0\1\202\74\0"+
    "\1\203\4\0\1\153\30\0\4\4\1\204\23\4\2\0"+
    "\5\4\10\0\1\4\1\0\1\4\10\0\2\4\2\0"+
    "\1\4\6\0\27\4\1\205\2\0\5\4\10\0\1\4"+
    "\1\0\1\4\10\0\2\4\2\0\1\4\6\0\1\4"+
    "\1\206\26\4\2\0\5\4\10\0\1\4\1\0\1\4"+
    "\10\0\2\4\2\0\1\4\6\0\14\4\1\207\13\4"+
    "\2\0\5\4\10\0\1\4\1\0\1\4\10\0\2\4"+
    "\2\0\1\4\6\0\3\4\1\210\24\4\2\0\5\4"+
    "\10\0\1\4\1\0\1\4\10\0\2\4\2\0\1\4"+
    "\6\0\1\4\1\211\26\4\2\0\5\4\10\0\1\4"+
    "\1\0\1\4\10\0\2\4\2\0\1\4\6\0\1\4"+
    "\1\212\26\4\2\0\5\4\10\0\1\4\1\0\1\4"+
    "\10\0\2\4\2\0\1\4\6\0\5\4\1\213\22\4"+
    "\2\0\5\4\10\0\1\4\1\0\1\4\10\0\2\4"+
    "\2\0\1\4\6\0\2\4\1\214\25\4\2\0\5\4"+
    "\10\0\1\4\1\0\1\4\10\0\2\4\2\0\1\4"+
    "\6\0\5\4\1\215\22\4\2\0\5\4\10\0\1\4"+
    "\1\0\1\4\10\0\2\4\2\0\1\4\6\0\5\4"+
    "\1\216\22\4\2\0\5\4\10\0\1\4\1\0\1\4"+
    "\10\0\2\4\2\0\1\4\6\0\3\4\1\217\24\4"+
    "\2\0\5\4\10\0\1\4\1\0\1\4\10\0\2\4"+
    "\2\0\1\4\6\0\14\4\1\220\13\4\2\0\5\4"+
    "\10\0\1\4\1\0\1\4\10\0\2\4\2\0\1\4"+
    "\6\0\1\4\1\221\26\4\2\0\5\4\10\0\1\4"+
    "\1\0\1\4\10\0\2\4\2\0\1\4\6\0\2\4"+
    "\1\222\25\4\2\0\5\4\10\0\1\4\1\0\1\4"+
    "\10\0\2\4\2\0\1\4\6\0\24\4\1\223\3\4"+
    "\2\0\5\4\10\0\1\4\1\0\1\4\10\0\2\4"+
    "\2\0\1\4\6\0\14\4\1\224\13\4\2\0\5\4"+
    "\10\0\1\4\1\0\1\4\10\0\2\4\2\0\1\4"+
    "\6\0\2\4\1\225\25\4\2\0\5\4\10\0\1\4"+
    "\1\0\1\4\10\0\2\4\2\0\1\4\6\0\5\4"+
    "\1\226\22\4\2\0\5\4\10\0\1\4\1\0\1\4"+
    "\10\0\2\4\2\0\1\4\6\0\2\4\1\227\25\4"+
    "\2\0\5\4\10\0\1\4\1\0\1\4\10\0\2\4"+
    "\2\0\1\4\5\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5917];
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
    "\1\1\1\11\3\1\5\11\2\1\1\11\2\1\1\11"+
    "\1\1\1\11\25\1\1\11\3\0\1\11\2\0\2\11"+
    "\1\1\6\11\26\1\1\11\2\0\27\1\1\11\25\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[151];
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
    while (i < 226) {
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
          case 60: break;
          case 2: 
            { //System.out.println(yytext() + "\t" + "shenase\t" + '-');
	return YYParser.SHENASE;
            }
          case 61: break;
          case 3: 
            { return YYParser.AKULAD_BAZ_KW;
            }
          case 62: break;
          case 4: 
            { return YYParser.AKULAD_BASTE_KW;
            }
          case 63: break;
          case 5: 
            { //System.out.println(yytext() + "\t" + "AND_KW\t" + '-');
	return YYParser.AND_KW;
            }
          case 64: break;
          case 6: 
            { //System.out.println(yytext() + "\t" + "adad\t" + '-');
	return YYParser.ADAD;
            }
          case 65: break;
          case 7: 
            { return YYParser.DEVIDE_KW ;
	//System.out.println(yytext() + "\t" + "DEVIDE_KW\t" + '-');
            }
          case 66: break;
          case 8: 
            { //System.out.println(yytext() + "\t" + "new line\t" + '-');
            }
          case 67: break;
          case 9: 
            { //System.out.println(yytext() + "\t" + "noghte_virgul\t" + '-');
	return YYParser.NOGHTE_VIRGUL;
            }
          case 68: break;
          case 10: 
            { //System.out.println(yytext() + "\t" + "comma\t" + '-');
	return YYParser.COMMA;
            }
          case 69: break;
          case 11: 
            { return YYParser.MULTIPLY_KW ;
	//System.out.println(yytext() + "\t" + "MULTIPLY_KW\t" + '-');
            }
          case 70: break;
          case 12: 
            { return YYParser.MORE_THAN_KW ;
	S//ystem.out.println(yytext() + "\t" + "MORE_THAN_KW\t" + '-');
            }
          case 71: break;
          case 13: 
            { return YYParser.NOGHTE_KW ;
	//System.out.println(yytext() + "\t" + "NOGHTE_KW\t" + '-');
            }
          case 72: break;
          case 14: 
            { return YYParser.BRACKET_BASTE_KW ;
	//System.out.println(yytext() + "\t" + "BRACKET_BASTE_KW\t" + '-');
            }
          case 73: break;
          case 15: 
            { return YYParser.BRACKET_BAZ_KW ;
	//System.out.println(yytext() + "\t" + "BRACKET_BAZ_KW\t" + '-');
            }
          case 74: break;
          case 16: 
            { return YYParser.PARANTHESIS_BASTE_KW ;
	//System.out.println(yytext() + "\t" + "PARANTHESIS_BASTE_KW\t" + '-');
            }
          case 75: break;
          case 17: 
            { return YYParser.PARANTHESIS_BAZ_KW ;
	//System.out.println(yytext() + "\t" + "PARANTHESIS_BAZ_KW\t" + '-');
            }
          case 76: break;
          case 18: 
            { return YYParser.MINUS_KW ;
	System.out.println(yytext() + "\t" + "MINUS_KW\t" + '-');
            }
          case 77: break;
          case 19: 
            { return YYParser.QUESTION_KW ;
	//System.out.println(yytext() + "\t" + "QUESTION_KW\t" + '-');
            }
          case 78: break;
          case 20: 
            { return YYParser.EQUAL_KW ;
	//System.out.println(yytext() + "\t" + "EQUAL_KW\t" + '-');
            }
          case 79: break;
          case 21: 
            { return YYParser.DONOGHTE_KW ;
	//System.out.println(yytext() + "\t" + "DONOGHTE_KW\t" + '-');
            }
          case 80: break;
          case 22: 
            { return YYParser.LESS_THAN_KW ;
	//System.out.println(yytext() + "\t" + "LESS_THAN_KW\t" + '-');
            }
          case 81: break;
          case 23: 
            { return YYParser.MOD_KW ;
	//System.out.println(yytext() + "\t" + "MOD_KW\t" + '-');
            }
          case 82: break;
          case 24: 
            { //System.out.println(yytext() + "\t" + "ADD_KW\t" + '-');
	return YYParser.ADD_KW;
            }
          case 83: break;
          case 25: 
            { //System.out.println(yytext() + "\t" + "OR_KW\t" + '-');
	return YYParser.OR_KW;
            }
          case 84: break;
          case 26: 
            { System.out.println(yytext() + "\t" + "null_char\t" + '-');
            }
          case 85: break;
          case 27: 
            { return YYParser.DEVIDE_EQUAL_KW ;
	//System.out.println(yytext() + "\t" + "DEVIDE_EQUAL_KW\t" + '-');
            }
          case 86: break;
          case 28: 
            { return YYParser.MULTIPLY_EQUAL_KW ;
	//System.out.println(yytext() + "\t" + "MULTIPLY_EQUAL_KW\t" + '-');
            }
          case 87: break;
          case 29: 
            { return YYParser.MORE_EQUAL_KW ;
	//System.out.println(yytext() + "\t" + "MORE_EQUAL_KW\t" + '-');
            }
          case 88: break;
          case 30: 
            { return YYParser.MINUS_MINUS_KW ;
	//System.out.println(yytext() + "\t" + "MINUS_MINUS_KW\t" + '-');
            }
          case 89: break;
          case 31: 
            { return YYParser.MINUS_EQUAL_KW ;
	//System.out.println(yytext() + "\t" + "MINU_EQUAL_KW\t" + '-');
            }
          case 90: break;
          case 32: 
            { return YYParser.EQUAL_EQUAL_KW ;
	//System.out.println(yytext() + "\t" + "EQUAL_EQUAL_KW\t" + '-');
            }
          case 91: break;
          case 33: 
            { return YYParser.LESS_EQUAL_KW ;
	//System.out.println(yytext() + "\t" + "LESS_EQUAL_KW\t" + '-');
            }
          case 92: break;
          case 34: 
            { return YYParser.PLUS_EQUAL_KW ;
	//System.out.println(yytext() + "\t" + "PLUS_EQUAL_KW\t" + '-');
            }
          case 93: break;
          case 35: 
            { return YYParser.PLUS_PLUS_KW ;
	//System.out.println(yytext() + "\t" + "PLUS_PLUS_KW\t" + '-');
            }
          case 94: break;
          case 36: 
            { //System.out.println(yytext() + "\t" + "IF_KW\t" + '-');
	return YYParser.IF_KW;
            }
          case 95: break;
          case 37: 
            { //System.out.println(yytext() + "\t" + "CHAR_KW\t" + '-');
	return YYParser.CHAR_KW;
            }
          case 96: break;
          case 38: 
            { //System.out.println(yytext() + "\t" + "while_kw\t" + '-');
	return YYParser.WHILE_KW;
            }
          case 97: break;
          case 39: 
            { //System.out.println(yytext() + "\t" + "comments\t" + '-');
	return YYParser.COMMENT;
            }
          case 98: break;
          case 40: 
            { //System.out.println(yytext() + "\t" + "harfe_sabet\t" + '-');
	return YYParser.HARFE_SABET;
            }
          case 99: break;
          case 41: 
            { return YYParser.FALSE_KW ;
	//System.out.println(yytext() + "\t" + "FALSE_KW\t" + '-');
            }
          case 100: break;
          case 42: 
            { //System.out.println(yytext() + "\t" + "break_kw\t" + '-');
	return YYParser.BREAK_KW;
            }
          case 101: break;
          case 43: 
            { //System.out.println(yytext() + "\t" + "NOT_KW\t" + '-');
	return YYParser.NOT_KW;
            }
          case 102: break;
          case 44: 
            { //System.out.println(yytext() + "\t" + "end_kw\t" + '-');
	return YYParser.END_KW;
            }
          case 103: break;
          case 45: 
            { //System.out.println(yytext() + "\t" + "constant_kw\t" + '-');
	return YYParser.CONSTANT_KW;
            }
          case 104: break;
          case 46: 
            { //System.out.println(yytext() + "\t" + "INT_KW\t" + '-');
	return YYParser.INT_KW;
            }
          case 105: break;
          case 47: 
            { //System.out.println(yytext() + "\t" + "SWITCH_KW\t" + '-');
	return YYParser.SWITCH_KW;
            }
          case 106: break;
          case 48: 
            { //System.out.println(yytext() + "\t" + "KEY_KW\t" + '-');
	return YYParser.KEY_KW ;
            }
          case 107: break;
          case 49: 
            { return YYParser.TRUE_KW ;
	//System.out.println(yytext() + "\t" + "TRUE_KW\t" + '-');
            }
          case 108: break;
          case 50: 
            { //System.out.println(yytext() + "\t" + "BOOLEAN_KW\t" + '-');
	return YYParser.BOOLEAN_KW;
            }
          case 109: break;
          case 51: 
            { //System.out.println(yytext() + "\t" + "THEN_KW\t" + '-');
	return YYParser.THEN_KW;
            }
          case 110: break;
          case 52: 
            { //System.out.println(yytext() + "\t" + "ELSE_KW\t" + '-');
	return YYParser.ELSE_KW;
            }
          case 111: break;
          case 53: 
            { //System.out.println(yytext() + "\t" + "PROGRAM_KW\t" + '-');
	return YYParser.PROGRAM_KW;
            }
          case 112: break;
          case 54: 
            { //System.out.println(yytext() + "\t" + "FLOAT_KW\t" + '-');
	return YYParser.FLOAT_KW;
            }
          case 113: break;
          case 55: 
            { //System.out.println(yytext() + "\t" + "type_kw\t" + '-');
	return YYParser.STRUCT_KW;
            }
          case 114: break;
          case 56: 
            { //System.out.println(yytext() + "\t" + "default_kw\t" + '-');
	return YYParser.DEFAULT_KW;
            }
          case 115: break;
          case 57: 
            { //System.out.println(yytext() + "\t" + "return_kw\t" + '-');
	return YYParser.RETURN_KW;
            }
          case 116: break;
          case 58: 
            { return YYParser.OR_ELSE_KW ;
	System.out.println(yytext() + "\t" + "OR_ELSE_KW\t" + '-');
            }
          case 117: break;
          case 59: 
            { return YYParser.AND_THEN_KW ;
	//System.out.println(yytext() + "\t" + "AND_THEN_KW\t" + '-');
            }
          case 118: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
