package _07_FICHEROS_PrintWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class _0700_Class_PrintWriter_Teoria {

    public static void main(String[] args) {

        /*
            * TABLA RESUMEN CLASE PrintWriter
            *
            * +------------------------------+---------------------------------------------------+---------------------------+
            * |            MÉTODO            |                    DESCRIPCIÓN                    |         DEVUELVE          |
            * +------------------------------+---------------------------------------------------+---------------------------+
            * | new PrintWriter(fileName)    | Crea un PrintWriter para un archivo               | PrintWriter               |
            * | new PrintWriter(Writer w)    | Crea un PrintWriter a partir de un Writer         | PrintWriter               |
            * | print(String s)              | Escribe texto sin salto de línea                  | void                      |
            * | println(String s)            | Escribe texto con salto de línea                  | void                      |
            * | printf(String format, ...)   | Escribe texto formateado (similar a C)            | PrintWriter               |
            * | format(String format, ...)   | Igual que printf, con formato                     | PrintWriter               |
            * | append(CharSequence csq)     | Añade texto al final                              | PrintWriter               |
            * | flush()                      | Fuerza escritura inmediata al archivo             | void                      |
            * | close()                      | Cierra el PrintWriter y libera recursos           | void                      |
            * +------------------------------+----------------------------------------------------+---------------------------+
            *
            * NOTAS:
            - PrintWriter puede envolver FileWriter o BufferedWriter
            - Muy útil para escribir texto, logs, o archivos formateados
            - println() añade automáticamente el salto de línea
            - flush() asegura que el contenido se escriba sin cerrar
            - close() llama automáticamente a flush()
            - No lanza IOException en la mayoría de métodos, pero conviene manejar errores al abrir
         
            * DIFERENCIA FileWriter / BufferedWriter / PrintWriter
            - FileWriter: Escribe directamente al disco, más básico
            - BufferedWriter: Añade un buffer para mayor eficiencia
            - PrintWriter: Añade facilidad de uso, println(), printf() y no lanza IOException en escritura
         */
        try (PrintWriter pw = new PrintWriter(new FileWriter("archivo.txt", true))) { // ",true" permite añadir sin borrar lo existente
            pw.println("Primera línea");
            pw.println("Segunda línea");
            // pw.flush(); // Opcional, close() lo hace automáticamente
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
