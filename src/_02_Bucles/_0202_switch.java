package _02_Bucles;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0202_switch {

    public static void main(String[] args) {

        /*  ============================================================ 
            switch  → Evalúa un valor y ejecuta el caso que coincida
            ============================================================
            INSTRUCCIONES ESPECIALES EN switch
            ------------------------------------------------------------
            case    → Bloque que se ejecuta si coincide el valor evaluado
            break   → Sale del switch para no seguir con otros casos
            default → Se ejecuta si ninguno coincide
            ->      → Sintaxis moderna compacta
         */
 
        /* ------------------------------------------------------------
           SWITCH CON ENTEROS
           ------------------------------------------------------------
         */
        int dia = 2;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("Otro día");
                break;
        }

        /* ------------------------------------------------------------
           SWITCH CON STRING  → También funciona con texto
           ------------------------------------------------------------
         */
        String color = "rojo";
        switch (color) {
            case "rojo":
                System.out.println("Color rojo");
                break;
            case "azul":
                System.out.println("Color azul");
                break;
            default:
                System.out.println("Color no reconocido");
                break;
        }

        /* ------------------------------------------------------------
           SWITCH (->)  → Sintaxis moderna más compacta
           ------------------------------------------------------------
         */
        int opcion = 1;
        switch (opcion) {
            case 1 ->
                System.out.println("Opción 1");
            case 2 ->
                System.out.println("Opción 2");
            default ->
                System.out.println("Opción inválida");
        }
    }
}
