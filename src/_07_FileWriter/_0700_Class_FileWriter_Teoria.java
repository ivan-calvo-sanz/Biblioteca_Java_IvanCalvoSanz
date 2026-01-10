package _07_FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class _0700_Class_FileWriter_Teoria {

    public static void main(String[] args) {

        /*
         * TABLA RESUMEN CLASE FileWriter
         *
         * +-----------------------------+----------------------------------------------+---------------------------+
         * |           MÉTODO            |               DESCRIPCIÓN                    |         DEVUELVE          |
         * +-----------------------------+----------------------------------------------+---------------------------+
         * | new FileWriter(file)        | Crea un FileWriter para escribir en archivo  | FileWriter                |
         * | new FileWriter(file, true)  | Append: escribir al final del archivo        | FileWriter                |
         * | write(String s)             | Escribe el contenido en el archivo           | void                      |
         * | append(String s)            | Añade contenido al final                     | FileWriter                |
         * | flush()                     | Fuerza la escritura pendiente al archivo     | void                      |
         * | close()                     | Cierra el FileWriter                         | void                      |
         * +-----------------------------+----------------------------------------------+---------------------------+
         *
         * NOTAS:
         * - FileWriter sobrescribe por defecto (sin append = true)
         * - Siempre manejar IOException
         * - Combinar con BufferedWriter para mejor eficiencia
         */
        // ============================================================
        // new FileWriter(file) | Crea un FileWriter | FileWriter
        // ============================================================
        try (FileWriter fw = new FileWriter("archivo.txt")) {

            // ============================================================
            // write(String s) | Escribe contenido | void
            // ============================================================
            fw.write("Hola, esto es un ejemplo de FileWriter.\n");

            // ============================================================
            // append(String s) | Añade contenido al final | FileWriter
            // ============================================================
            fw.append("Esto se añade al final.\n");

            // ============================================================
            // flush() | Fuerza escritura pendiente | void
            // ============================================================
            fw.flush(); // Asegura que todo se escribe en disco
            System.out.println("Se ha escrito en el fichero");
            // ============================================================
            // close() | Cierra FileWriter | void
            // ============================================================
            // Se cierra automáticamente por try-with-resources pero si quiero forzar el cierre hago el .close() hay que meterlo en un try
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }

        // ============================================================
        // new FileWriter(file, true) | Append: escribir al final | FileWriter
        // ============================================================
        try (FileWriter fwAppend = new FileWriter("archivo.txt", true)) {
            fwAppend.write("Este texto se añade al final del archivo existente.\n");
        } catch (IOException e) {
            System.out.println("Error al escribir en modo append: " + e.getMessage());
        }
    }
}
