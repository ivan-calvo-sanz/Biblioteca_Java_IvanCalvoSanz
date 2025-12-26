package _01_BASICOS;

public class _0105_Casting {

    public static void main(String[] args) {

        /* CASTING IMPLICITO (widening)
    Lo hace Java automáticamente porque no hay pérdida de información
         */
        int x = 10;
        double y = x;  // Casting implícito

        /* CASTING EXPLICITO (narrowing) Lo haces tú manualmente porque puede haber pérdida de datos.
         */
        double a = 9.7;
        int b = (int) a;  // Casting explícito → b será 9, pierde decimales

        // CASTING EXPLICITO int->double
        int valor1 = 10;
        int valor2 = 6;
        double division = (double) valor1 / valor2;
        System.out.println(division);
        
        // CASTING char -> int
        int valor3=(int)'A';
        System.out.println(valor3);

        /* De String a entero
         */
        String texto = "123";
        int numero = Integer.parseInt(texto);

        /* De entero a String
         */
        int puntos = 250;
        String s = String.valueOf(puntos);
    }
}
