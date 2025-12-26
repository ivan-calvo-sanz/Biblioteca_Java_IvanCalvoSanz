package _00_Teoria;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0002_Scope {

    /*
 ============================================================
 SCOPE EN JAVA 
 ============================================================
 Tipos de scope:
 1. De bloque       → Dentro de { } (if, for, while). Existe solo dentro de las llaves.
 2. De método       → Variables locales de un método. Mueren cuando termina el método.
 3. De clase        → Atributos accesibles en todos los métodos de la clase.
 4. Static          → A nivel de clase. Existen mientras el programa se ejecuta.

 Errores típicos:
 - Usar una variable fuera del bloque donde se declaró.
 - Declarar variables sin llaves tras if o for.
 - Creer que una variable de bucle existe fuera.
 - Shadowing sin querer (misma variable en scope interno y externo).
 - Confundir variables static y de instancia.
 ============================================================
     */
 /* ============================================================ 
       SCOPE DE CLASE (atributos)
       ------------------------------------------------------------
       - Se declaran dentro de la clase, fuera de cualquier método.
       - Se pueden usar en cualquier método de la clase.
    ============================================================ */
    static int contadorGlobal = 0;
    int valorInstancia = 100;

    public static void main(String[] args) {

        /* ============================================================ 
           1. SCOPE DE BLOQUE: variables dentro de { }
        ============================================================ */
        if (true) {
            int numero = 10;
            System.out.println("numero dentro del bloque = " + numero);
        }
        // System.out.println(numero); // ❌ ERROR: "numero" no existe fuera del bloque


        /* ------------------------------------------------------------
           SCOPE EN BUCLES
        ------------------------------------------------------------ */
        for (int i = 0; i < 3; i++) {
            System.out.println("i dentro del for = " + i);
        }
        // System.out.println(i); // ❌ ERROR: i no existe fuera del bucle


        /* ============================================================ 
           2. SCOPE DE MÉTODO: variable local
        ============================================================ */
        metodoLocal();
        // System.out.println(numMetodo); // ❌ ERROR: no existe aquí


        /* ============================================================ 
           3. SCOPE EN TRY-CATCH
        ============================================================ */
        try {
            int dato = 5;
            System.out.println("dato en try = " + dato);
        } catch (Exception e) {
            // System.out.println(dato); // ❌ ERROR: no existe aquí
            System.out.println("Error capturado");
        }


        /* ============================================================ 
           4. MAL USO TÍPICO DEL SCOPE
        ============================================================ */
        int total = 0;
        for (int k = 1; k <= 3; k++) {
            int parcial = k * 10;
            total += parcial;
        }
        // System.out.println(parcial); // ❌ ERROR: parcial no existe fuera
        System.out.println("total = " + total);


        /* ============================================================ 
           7. USAR VARIABLES FUERA DEL SCOPE → ERROR CLÁSICO
        ============================================================ */
        // if (false)
        //     int u = 10; // ❌ ERROR: no se puede declarar sin llaves en "if"
        if (false) {
            int u = 10; // ✔️ Esto sí tiene scope válido
        }
    }


    /* ============================================================ 
       MÉTODO PARA MOSTRAR SCOPE DE MÉTODO
    ============================================================ */
    public static void metodoLocal() {
        int numMetodo = 50;
        System.out.println("numMetodo dentro del método = " + numMetodo);
    }


    /* ============================================================ 
       MÉTODO QUE USA VARIABLES DE CLASE
    ============================================================ */
    public void mostrarAtributos() {
        System.out.println("contadorGlobal (static) = " + contadorGlobal);
        System.out.println("valorInstancia (no static) = " + valorInstancia);
    }
}