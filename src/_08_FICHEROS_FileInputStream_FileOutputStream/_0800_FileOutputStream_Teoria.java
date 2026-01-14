package _08_FICHEROS_FileInputStream_FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class _0800_FileOutputStream_Teoria {

    public static void main(String[] args) {

        /*
         * TABLA RESUMEN CLASE FileOutputStream
         *
         * +-----------------------------------+---------------------------------------------------+--------------------------+
         * |          MÉTODO                   |                 DESCRIPCIÓN                       |         DEVUELVE         |
         * +-----------------------------------+---------------------------------------------------+--------------------------+
         * | new FileOutputStream(file)        | Crea un FileOutputStream para escribir un archivo | FileOutputStream         |
         * | write(int b)                      | Escribe un byte en el archivo                     | void                     |
         * | write(byte[] b)                   | Escribe un array de bytes completo                | void                     |
         * | write(byte[] b, int off, int len) | Escribe parte del array de bytes                  | void                     |
         * | close()                           | Cierra el FileOutputStream                        | void                     |
         * +-----------------------------------+---------------------------------------------------+--------------------------+
         *
         * NOTAS:
         * - FileOutputStream trabaja con bytes, no caracteres
         * - Para escribir texto, normalmente se combina con OutputStreamWriter
         * - Siempre manejar IOException
         */
        // ============================================================
        // new FileOutputStream(file) | Crea un FileOutputStream
        // ============================================================
        try (FileOutputStream fos = new FileOutputStream("archivo_output.txt")) {

            // ============================================================
            // write(int b) | Escribe un byte
            // ============================================================
            String texto = "Hola FileOutputStream!\n";
            for (int i = 0; i < texto.length(); i++) {
                fos.write((byte) texto.charAt(i)); // Escribir carácter como byte
            }

            // ============================================================
            // write(byte[] b) | Escribe un array de bytes completo
            // ============================================================
            byte[] datos = "Segunda línea con write(byte[] b)\n".getBytes();
            fos.write(datos);

            // ============================================================
            // write(byte[] b, int off, int len) | Escribe parte del array
            // ============================================================
            byte[] datos2 = "Tercera línea parcial\n".getBytes();
            fos.write(datos2, 0, 13); // solo "Tercera línea"

            System.out.println("Archivo escrito correctamente.");

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }

        // ============================================================
        // close() | Cierra FileOutputStream
        // ============================================================
        // Se cierra automáticamente con try-with-resources
    }
}
