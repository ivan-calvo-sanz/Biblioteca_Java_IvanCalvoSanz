package _00_Teoria;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0001_Variables_Constantes {

    // primitive data:
    //    Data Type	Default Value	Default size
    //    boolean	false           1 bit
    //    char          '\u0000'	2 byte
    //    byte          0               1 byte
    //    short         0               2 byte
    //    int           0               4 byte
    //    long          0L              8 byte
    //    float         0.0f            4 byte
    //    double	0.0d            8 byte
    
    // Non-primitive data types: The non-primitive data types include Classes, Interfaces, and Arrays.
    public static void main(String[] args) {

        // Numeros enteros
        byte variableByte=100;
        short variableShort=1000;
        int variableInt=100000;
        long variableLong=100000000L;
        
        // Numeos reales
        float variableFloat=100.9999f;
        double variableouble=100.9999999999;
        
        // Booleanos
        boolean variableBoolean=true;
        
        // Cadenas y caracteres
        String variableString="Hola";
        char variableChar='a';
        

        // Declarar constantes
        final int PUNTUACION_SUPERAR = 3;
        
        System.out.println(PUNTUACION_SUPERAR);
    }
}
