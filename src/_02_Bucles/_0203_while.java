package _02_Bucles;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0203_while {

    public static void main(String[] args) {

        /*  ============================================================ 
            while → Ejecuta un bloque de código mientras la condición sea verdadera
            ============================================================
            INSTRUCCIONES ESPECIALES EN while
            ------------------------------------------------------------
            break    → Sale del bucle inmediatamente
            continue → Salta a la siguiente iteración
         */

        /* ------------------------------------------------------------
           WHILE SIMPLE
           ------------------------------------------------------------ 
         */
        int contador = 1;
        while (contador <= 3) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        /* ------------------------------------------------------------
           WHILE CON BREAK
           ------------------------------------------------------------ 
         */
        int i = 1;
        while (true) {
            System.out.println("i = " + i);
            if (i == 3) {
                break; // Sale del bucle
            }
            i++;
        }

        /* ------------------------------------------------------------
           WHILE CON CONTINUE
           ------------------------------------------------------------ 
         */
        int j = 0;
        while (j < 5) {
            j++;
            if (j % 2 == 0) {
                continue; // Salta los números pares
            }
            System.out.println("Número impar: " + j);
        } 
    }
}
