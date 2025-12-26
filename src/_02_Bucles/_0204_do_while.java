package _02_Bucles;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0204_do_while {

    public static void main(String[] args) {

        /*  ============================================================ 
        do-while → Ejecuta el bloque de código AL MENOS UNA VEZ
        ============================================================
        INSTRUCCIONES ESPECIALES EN do-while
        ------------------------------------------------------------
        break    → Sale del bucle inmediatamente
        continue → Salta a la siguiente iteración
         */

       /* ------------------------------------------------------------
       DO-WHILE SIMPLE
       ------------------------------------------------------------ 
         */
        int contador = 1;
        do {
            System.out.println("Contador: " + contador);
            contador++;
        } while (contador <= 3);


        /* ------------------------------------------------------------
       DO-WHILE CON BREAK
       ------------------------------------------------------------ 
         */
        int i = 1;
        do {
            System.out.println("i = " + i);
            if (i == 3) {
                break; // Sale del bucle
            }
            i++;
        } while (true);


        /* ------------------------------------------------------------
       DO-WHILE CON CONTINUE
       ------------------------------------------------------------ 
         */
        int j = 0;
        do {
            j++;

            if (j % 2 == 0) {
                continue; // Salta los números pares
            }

            System.out.println("Número impar: " + j);

        } while (j < 5);
    }
}
