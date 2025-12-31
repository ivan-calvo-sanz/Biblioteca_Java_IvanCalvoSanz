package _03_Class_FileReader;

import java.io.FileReader;
import java.io.IOException;

public class _0300_Class_FileReader_Teoria {

    public static void main(String[] args) {

        /*
         * TABLA RESUMEN CLASE FileReader
         *
         * +-----------------------------+--------------------------------------------------+---------------------------+
         * |           MÉTODO            |               DESCRIPCIÓN                        |         DEVUELVE          |
         * +-----------------------------+--------------------------------------------------+---------------------------+
         * | new FileReader(file)        | Crea un FileReader para leer un archivo          | FileReader                |
         * | read()                      | Lee un carácter del archivo                       | int (carácter o -1)       |
         * | read(char[] cbuf)           | Lee varios caracteres en un buffer                | int (número de caracteres)|
         * | close()                     | Cierra el FileReader                              | void                      |
         * +-----------------------------+--------------------------------------------------+---------------------------+
         *
         * NOTAS:
         * - FileReader lee caracteres, no bytes (usa InputStreamReader si necesitas codificación)
         * - Siempre manejar IOException
         * - Combinar con BufferedReader para lectura eficiente línea a línea
         */
        // ============================================================
        // new FileReader(file) | Crea un FileReader | FileReader
        // ============================================================
        try {
            FileReader fr = new FileReader("archivo.txt");

            // ============================================================
            // read() | Lee un carácter | int
            // ============================================================
            int c;
            System.out.println("Contenido carácter a carácter:");
            while ((c = fr.read()) != -1) {
                System.out.print((char) c); // Convierte int a char
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        // ============================================================
        // read(char[] cbuf) | Lee varios caracteres en buffer | int
        // ============================================================
        // Reiniciamos FileReader para ejemplo
        try {
            FileReader fr2 = new FileReader("archivo.txt");
            char[] buffer = new char[50]; // leer hasta 50 caracteres
            int leidos = fr2.read(buffer);
            System.out.println("\n\nContenido leído con buffer (char[]):");
            System.out.println(new String(buffer, 0, leidos));
        } catch (IOException e) {
            System.out.println("Error al leer con buffer: " + e.getMessage());
        }

        // ============================================================
        // close() | Cierra FileReader | void
        // ============================================================
        // Se cierra automáticamente con try-with-resources
    }
}
