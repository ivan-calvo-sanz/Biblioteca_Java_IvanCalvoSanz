package _02_Bucles;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0205_for {

    public static void main(String[] args) {

        /*  ============================================================ 
            for → Bucle que se repite un número determinado de veces
            ============================================================
            PARTES DEL FOR
            ------------------------------------------------------------
            for (declaración 1; declaración 2; declaración 3) {
            
            declaración 1 → Se ejecuta (una vez) antes de la ejecución del bloque de código.
            declaración 2 → Define la condición para ejecutar el bloque de código.
            declaración 3 → Se ejecuta (cada vez) después de que se haya ejecutado el bloque de código.
            
            INSTRUCCIONES ESPECIALES EN for
            break          → Sale del bucle inmediatamente
            continue       → Salta a la siguiente iteración
         */

           /* ------------------------------------------------------------
           FOR SIMPLE
           ------------------------------------------------------------ 
         */
        for (int i = 1; i <= 3; i++) { // declaración 1: int i = 1; declaración 2: i <= 3; declaración 3: i++
            System.out.println("i = " + i);
        }

        /* ------------------------------------------------------------
           FOR CON BREAK
           ------------------------------------------------------------ 
         */
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // Sale del bucle
            }
            System.out.println("Número antes de break: " + i);
        }

        /* ------------------------------------------------------------
           FOR CON CONTINUE
           ------------------------------------------------------------ 
         */
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                continue; // Salta los números pares
            }
            System.out.println("Número impar: " + i);
        }
    }
}




