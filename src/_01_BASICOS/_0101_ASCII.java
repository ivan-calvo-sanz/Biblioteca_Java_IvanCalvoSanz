package _01_BASICOS;

/**
 *
 * @author Iván Calvo Sans
 *
 */
public class _0101_ASCII {

    // https://elcodigoascii.com.ar/
    // espacio en blanco            32
    // ! " # $ % & ' ( ) * + , . /  33-47
    // 0-9                          48-57
    // : ; < = > ? @                58-64
    // A-Z                          65-90   (longitud del abecedario = 26) (la Ñ no está incluida)
    // [ \ ] ^ _ `                  91-96
    // a-z                          97-122  (longitud del abecedario = 26) (la ñ no está incluida)
    // { | } ~                      123 124 125 126 (pulsando Alt+numero)
    /*
====================================================================
                 TABLA ASCII (DEC | CHAR)
====================================================================

 DEC | CHAR   DEC | CHAR   DEC | CHAR   DEC | CHAR   DEC | CHAR
-----+-----  -----+-----  -----+-----  -----+-----  -----+-----
  0  | NUL     26  | SUB     52  | 4       78  | N      104 | h
  1  | SOH     27  | ESC     53  | 5       79  | O      105 | i
  2  | STX     28  | FS      54  | 6       80  | P      106 | j
  3  | ETX     29  | GS      55  | 7       81  | Q      107 | k
  4  | EOT     30  | RS      56  | 8       82  | R      108 | l
  5  | ENQ     31  | US      57  | 9       83  | S      109 | m
  6  | ACK     32  | ' '     58  | :       84  | T      110 | n
  7  | BEL     33  | !       59  | ;       85  | U      111 | o
  8  | BS      34  | "       60  | <       86  | V      112 | p
  9  | TAB     35  | #       61  | =       87  | W      113 | q
 10  | LF      36  | $       62  | >       88  | X      114 | r
 11  | VT      37  | %       63  | ?       89  | Y      115 | s
 12  | FF      38  | &       64  | @       90  | Z      116 | t
 13  | CR      39  | '       65  | A       91  | [      117 | u
 14  | SO      40  | (       66  | B       92  | \      118 | v
 15  | SI      41  | )       67  | C       93  | ]      119 | w
 16  | DLE     42  | *       68  | D       94  | ^      120 | x
 17  | DC1     43  | +       69  | E       95  | _      121 | y
 18  | DC2     44  | ,       70  | F       96  | `      122 | z
 19  | DC3     45  | -       71  | G       97  | a      123 | {
 20  | DC4     46  | .       72  | H       98  | b      124 | |
 21  | NAK     47  | /       73  | I       99  | c      125 | }
 22  | SYN     48  | 0       74  | J      100  | d      126 | ~
 23  | ETB     49  | 1       75  | K      101  | e      127 | DEL
 24  | CAN     50  | 2       76  | L      102  | f
 25  | EM      51  | 3       77  | M      103  | g

====================================================================
     */
    public static void main(String[] args) {
    }

    // FUNCIONES
    /**
     * Genera un Array con las letras del abecedario
     *
     * @param
     * @return char[]
     */
    public static char[] generaAbecedario() {
        char abecedario[] = new char[91 - 65];
        for (int i = 65, indice = 0; i < 91; i++, indice++) {
            abecedario[indice] = (char) i;
        }
        return abecedario;
    }

    /**
     * Genera un Array de char con caracteres con el intervalo de caracteres que
     * indiquemos de la Tabla ASCII
     *
     * @param inicio inicio del intervalo de la Tabla ASCII
     * @param fin fin del intervalo de la Tabla ASCII
     * @return char[]
     */
    // char[] abecedarioMinusculas = generaCaracteres(97, 122);
    public static char[] generaCaracteresTablaASCII(int inicio, int fin) {
        char[] caracteres = new char[fin - inicio + 1];
        for (int i = 0, j = inicio; i < caracteres.length; i++, j++) {
            caracteres[i] = (char) j;
        }
        return caracteres;
    }

}
