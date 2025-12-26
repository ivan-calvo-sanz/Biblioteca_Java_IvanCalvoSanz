package _0000_ESQUEMA;

import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class _0000_Esquema_Basicos {

    /* ============================================================
       ENUM
       ============================================================
     */
    enum Dia {
        LUNES, MARTES, MIERCOLES
    }

    public static void main(String[] args) {
        /* ============================================================
           VARIABLES
           ============================================================
         */
        int numero = 15;
        double precio = 9.99;
        String texto = "Hola";
        boolean activo = true;

        /* ============================================================
           ARRAY
           ============================================================
         */
        // paso por Referencia (es decir, NO es una copia, cambias el propio array)
        int[] numeros = {10, 20, 30};
        System.out.println(numeros[0]);

        /* ============================================================
           FOR
           ============================================================
         */
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }

        /* ============================================================
           FOR EACH
           ============================================================
         */
        for (int n : numeros) {
            System.out.println(n);
        }

        /* ============================================================
           DO - WHILE
           ============================================================
         */
        int contador = 0;
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while (contador < 3);

        /* ============================================================
           SWITCH
           ============================================================
         */
        int diaNumero = 1;
        switch (diaNumero) {
            case 1:
                System.out.println("Lunes");
                break;
            default:
                System.out.println("Otro día");
        }

        /* ============================================================
            IF, IF-ELSE, ELSE-IF
            ============================================================
         */
        int x = 15;
        // IF simple
        if (x > 10) {
            System.out.println("IF simple: El numero es mayor que 10");
        }

        // IF-ELSE
        if (x % 2 == 0) {
            System.out.println("IF-ELSE: El numero es par");
        } else {
            System.out.println("IF-ELSE: El numero es impar");
        }

        // ELSE-IF
        if (x < 0) {
            System.out.println("ELSE-IF: Numero negativo");
        } else if (x <= 10) {
            System.out.println("ELSE-IF: Numero entre 0 y 10");
        } else {
            System.out.println("ELSE-IF: Numero mayor que 10");
        }

        // OPERADOR TERNARIO
        String mensaje = (x > 100) ? "Mayor que 100" : "Menor o igual que 100";
        System.out.println(mensaje);

        /* ============================================================
           STRING
           ============================================================
         */
        String nombre = "Ivan";
        System.out.println(nombre.length());        // longitud
        System.out.println(nombre.toUpperCase());   // mayúsculas
        System.out.println(nombre.charAt(0));   // primer carácter

        /* ============================================================
           MATH
           ============================================================
         */
        double valor = -5.7;
        System.out.println(Math.abs(valor));    // valor absoluto
        System.out.println(Math.round(valor));  // redondeo
        System.out.println(Math.random());        // número aleatorio

        /* ============================================================
           ENUM USO
           ============================================================
         */
        Dia hoy = Dia.LUNES;
        if (hoy == Dia.LUNES) {
            System.out.println("Hoy es lunes");
        }

        /* ============================================================
           SCANNER
           ============================================================
         */
        Scanner sn = new Scanner(System.in);
        sn.useLocale(Locale.US); //recomendado para cuando se piden valores decimales
        sn.useDelimiter("\n"); // recomendao cuando se piden cadenas con espacios
        System.out.print("Introduce un numero: ");
        int entrada = sn.nextInt();
        System.out.println("Has introducido: " + entrada);

        /* ============================================================
           TRY - CATCH (EXCEPCIONES)
           ============================================================
         */
        // Exception                        (Excepción general, padre de todas)
        // ArithmeticException              (Errores aritméticos, ej: división por cero)
        // InputMismatchException           (Scanner recibe un tipo de dato incorrecto)
        // NumberFormatException            (Error al convertir String a número)
        // ArrayIndexOutOfBoundsException   (Acceso a posición inexistente en un array)
        // IllegalArgumentException         (Argumento inválido pasado a un método)
        // NullPointerException             (Uso de un objeto que es null)

        /* ===== ArithmeticException =====
           Se lanza cuando ocurre un error matemático
           Ejemplo típico: división por cero
         */
        try {
            int resultado = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: división por cero");
        }

        /* ===== InputMismatchException =====
           Se lanza cuando Scanner recibe un tipo incorrecto
           Ejemplo: pedir int y escribir texto
         */
        try {
            System.out.print("Introduce un número entero: ");
            numero = sn.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: tipo de dato incorrecto");
            sn.next(); // Limpia el buffer del Scanner
        }

        /* ===== ArrayIndexOutOfBoundsException =====
           Se lanza al acceder a una posición inexistente de un array (índices válidos: 0 a length-1)
         */
        try {
            int[] n = {10, 20, 30};
            System.out.println(n[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: índice fuera de rango");
        }

        /* ===== NumberFormatException =====
           Se lanza al convertir un String a número cuando el formato no es válido
         */
        try {
            String txt = "abc";
            int number = Integer.parseInt(txt);
        } catch (NumberFormatException e) {
            System.out.println("Error: formato numérico incorrecto");
        }

        /* ===== IllegalArgumentException =====
           Se lanza cuando un método recibe un argumento inválido
         */
        try {
            calcularEdad(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: argumento no válido");
        }

        /* ===== NullPointerException =====
           Se lanza cuando se usa un objeto que es null
         */
        try {
            String nulo = null;
            System.out.println(nulo.length());
        } catch (NullPointerException e) {
            System.out.println("Error: objeto null");
        }

        /* ===== Exception (General) =====
           Captura cualquier excepción no controlada anteriormente. Se recomienda usarla al final
         */
        try {
            int[] datos = new int[3];
            System.out.println(datos[10]);
        } catch (Exception e) {
            System.out.println("Error general capturado");
        }
        sn.close();


        /* ============================================================
           TIPOS DE CONVERSION
           ============================================================
         */
        // int a double
        int entero = 10;
        double aDouble = (double) entero;

        System.out.println("int a double: " + aDouble);

        // double a int
        double decimal = 9.99;
        int aInt = (int) decimal;

        System.out.println("double a int: " + aInt);

        // int a float
        float aFloat = (float) entero;

        System.out.println("int a float: " + aFloat);

        // String a int
        String strNumero = "123";
        int strAInt = Integer.parseInt(strNumero);

        System.out.println("String a int: " + strAInt);

        // String a double
        String strDecimal = "45.67";
        double strADouble = Double.parseDouble(strDecimal);

        System.out.println("String a double: " + strADouble);

        // char a String
        char letraChar = 'A';
        String charAString = Character.toString(letraChar);

        System.out.println("char a String: " + charAString);

        // String a char (primer carácter)
        String palabra = "Hola";
        char stringAChar = palabra.charAt(0);

        System.out.println("String a char: " + stringAChar);

        /* ============================================================
           TIPOS DE CONVERSION + TABLA ASCII
           ============================================================
         */
        // char a int (valor ASCII)
        int ascii = (int) letraChar;  // reutilizamos letraChar

        System.out.println("Char a ASCII: " + letraChar + " = " + ascii);

        // int a char (valor ASCII)
        int codigo = 66;
        char deAscii = (char) codigo;

        System.out.println("ASCII a Char: " + codigo + " = " + deAscii);

        // Mostrar un mini-rango de la tabla ASCII (letras mayúsculas)
        System.out.println("Tabla ASCII A-Z:");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println(c + " = " + (int) c);
        }
    }

// Método para IllegalArgumentException
    static void calcularEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        System.out.println("Edad válida: " + edad);
    }
}
