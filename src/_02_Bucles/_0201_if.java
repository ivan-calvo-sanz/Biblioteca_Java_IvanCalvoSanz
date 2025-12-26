package _02_Bucles;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0201_if {

    // https://www.w3schools.com/java/java_conditions.asp
    // CONCEPTOS BASICOS if
    public static void main(String[] args) {

        /* ============================================================
           IF  → Ejecuta un bloque si la condición es verdadera
           ------------------------------------------------------------
         */
        int numero = 12;
        if (numero > 10) {
            System.out.println("El número es mayor que 10");
        }

        /* ============================================================
           IF - ELSE  → Ejecuta un bloque si se cumple y otro si no
           ------------------------------------------------------------
         */
        int n = 5;
        if (n % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }

        /* ============================================================
           IF - ELSE IF - ELSE  → Varias condiciones encadenadas
           ------------------------------------------------------------
         */
        int valor = 0;
        if (valor < 0) {
            System.out.println("Es negativo");
        } else if (valor == 0) {
            System.out.println("Es cero");
        } else {
            System.out.println("Es positivo");
        }

        /* ============================================================
           OPERADOR TERNARIO  → Condición en una sola línea
           ------------------------------------------------------------
         */
        int x = 120;
        String mensaje = (x > 100) ? "Mayor que 100" : "Menor o igual que 100";
        System.out.println(mensaje);
    }

}
