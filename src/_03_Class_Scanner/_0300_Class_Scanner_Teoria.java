package _03_Class_Scanner;

import java.util.Locale;
import java.util.Scanner;

public class _0300_Class_Scanner_Teoria {

    // 
    // CONCEPTOS BASICOS CLASE Scanner
    // 
    public static void main(String[] args) {

        // =============================
        // CREACIÓN DEL OBJETO Scanner
        // =============================
        Scanner sn = new Scanner(System.in); // creamos el objeto   scanner.
        sn.useLocale(Locale.US); //recomendado para cuando se piden valores decimales
        sn.useDelimiter("\n"); // recomendao cuando se piden cadenas con espacios

        /*
   TABLA RESUMEN CLASE Scanner

   +---------------------------+---------------------------------------------+------------------------------+
   |          MÉTODO           |                 DESCRIPCIÓN                 |          DEVUELVE            |
   +---------------------------+---------------------------------------------+------------------------------+
   | nextInt()                 | Lee un número entero                        | int                          |
   | nextDouble()              | Lee un número decimal                       | double                       |
   | nextFloat()               | Lee un número decimal                       | float                        |
   | nextLong()                | Lee un número entero largo                  | long                         |
   | nextBoolean()             | Lee true o false                            | boolean                      |
   | next()                    | Lee una palabra (hasta delimitador)         | String                       |
   | nextLine()                | Lee una línea completa                      | String                       |
   | hasNextInt()              | Comprueba si hay un int                     | boolean                      |
   | hasNextDouble()           | Comprueba si hay un double                  | boolean                      |
   | useLocale(Locale)         | Define formato decimal / idioma             | Scanner                      |
   | useDelimiter(String)      | Cambia el separador de datos                | Scanner                      |
   | close()                   | Cierra el Scanner                           | void                         |
   +---------------------------+---------------------------------------------+------------------------------+
         */
        // =============================
        // useLocale()
        // =============================
        // Define el formato de números decimales
        // Locale.US  -> usa punto (3.14)
        // Locale.FR  -> usa coma  (3,14)
        sn.useLocale(Locale.US);

        // =============================
        // useDelimiter()
        // =============================
        // Define el separador de datos
        // Por defecto es espacio en blanco
        sn.useDelimiter(",");   // capta lo introducido hasta la coma
        sn.useDelimiter("\n");  // capta lo introducido hasta salto de linea

        // =============================
        // EJEMPLOS DE LECTURA
        // =============================
        System.out.println("Introduce un numero entero:");
        int numero = sn.nextInt();

        System.out.println("Introduce un decimal:");
        double decimal = sn.nextDouble();

        System.out.println("Introduce una palabra:");
        String palabra = sn.next();

        // Limpieza del buffer antes de usar nextLine()
        sn.nextLine();

        System.out.println("Introduce una frase completa:");
        String frase = sn.nextLine();

        // =============================
        // COMPROBACIÓN CON hasNext
        // =============================
        if (sn.hasNextInt()) {
            int otroNumero = sn.nextInt();
            System.out.println("Numero valido: " + otroNumero);
        } else {
            System.out.println("No es un numero entero");
        }

        // =============================
        // CIERRE DEL Scanner
        // =============================
        sn.close();
    }
}
