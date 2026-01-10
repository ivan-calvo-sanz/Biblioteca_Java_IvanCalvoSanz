package _07_Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _0700_Scanner_Teoria {

    public static void main(String[] args) {

        /*
         * TABLA RESUMEN CLASE Scanner (LECTURA DE ARCHIVOS)
         *
         * +-------------------------------+--------------------------------------------------+---------------------------+
         * |            MÉTODO             |               DESCRIPCIÓN                        |         DEVUELVE          |
         * +-------------------------------+--------------------------------------------------+---------------------------+
         * | new Scanner(File)             | Crea un Scanner para leer un archivo             | Scanner                   |
         * | hasNextLine()                 | Comprueba si hay más líneas                      | boolean                   |
         * | nextLine()                    | Lee una línea completa                           | String                    |
         * | hasNext()                     | Comprueba si hay más tokens                      | boolean                   |
         * | next()                        | Lee el siguiente token                           | String                    |
         * | close()                       | Cierra el Scanner                                | void                      |
         * +-------------------------------+--------------------------------------------------+---------------------------+
         *
         * NOTAS:
         * - Scanner puede leer archivos usando File
         * - Lee texto, no bytes
         * - Es más simple que FileReader + BufferedReader
         * - No es el más eficiente para archivos grandes
         * - Siempre manejar FileNotFoundException
         */
        // ============================================================
        // new Scanner(File) | Crea un Scanner para leer un archivo
        // ============================================================
        try {
            File archivo = new File("archivo.txt");
            Scanner sc = new Scanner(archivo);

            // ============================================================
            // hasNextLine() / nextLine() | Lectura línea a línea
            // ============================================================
            System.out.println("Contenido del archivo (línea a línea):");
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                System.out.println(linea);
            }

            // ============================================================
            // close() | Cierra Scanner
            // ============================================================
            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        }

        // ============================================================
        // Ejemplo alternativo: lectura por tokens (palabras)
        // ============================================================
        try {
            Scanner sc2 = new Scanner(new File("archivo.txt"));

            System.out.println("\nContenido del archivo (token a token):");
            while (sc2.hasNext()) {
                String token = sc2.next();
                System.out.println(token);
            }

            sc2.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error al leer tokens: " + e.getMessage());
        }
    }
}
