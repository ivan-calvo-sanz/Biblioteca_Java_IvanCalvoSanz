package _08_FICHEROS_FileInputStream_FileOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class _0800_FileInputStream_Teoria {

    public static void main(String[] args) {

        /*
         * TABLA RESUMEN CLASE FileInputStream
         *
         * +-----------------------------+--------------------------------------------------+---------------------------+
         * |           MÉTODO            |               DESCRIPCIÓN                        |         DEVUELVE          |
         * +-----------------------------+--------------------------------------------------+---------------------------+
         * | read()                      | Lee un byte del archivo                          | int (0-255 o -1)          |
         * | read(byte[] b)              | Lee varios bytes en un array                     | nº bytes leídos o -1      |
         * | read(byte[], int, int)      | Lee bytes desde una posición concreta            | nº bytes leídos o -1      |
         * | available()                 | Bytes disponibles sin bloquear                   | int                       |
         * | skip(long n)                | Salta n bytes                                    | long                      |
         * | close()                     | Cierra el flujo                                  | void                      |
         * +-----------------------------+--------------------------------------------------+---------------------------+
         *
         * CONCEPTO CLAVE:
         * - FileInputStream trabaja con BYTES
         * - Se usa para leer archivos binarios (imágenes, audio, pdf...)
         * - También puede leer texto, pero NO es lo ideal
         */

 /*
         * EJEMPLO 1: Leer un archivo byte a byte
         */
        try (FileInputStream fis = new FileInputStream("00_PRUEBAS\\gato.jpg")) {
            int byteLeido;
            while ((byteLeido = fis.read()) != -1) {
                System.out.print(byteLeido + " ");
            }
            fis.close();
        } catch (IOException e) {
            System.out.println("Error leyendo el archivo");
            e.printStackTrace();
        }

        System.out.println("\n-----------------------------");

        /*
         * EJEMPLO 2: Leer un archivo usando un array de bytes (más eficiente)
         */
        try (FileInputStream fis = new FileInputStream("00_PRUEBAS\\gato.jpg")) {
            byte[] bytes = new byte[1024];
            int numBytes;

            while ((numBytes = fis.read(bytes)) != -1) {
                for (int i = 0; i < numBytes; i++) {
                    System.out.print(bytes[i] + " ");
                }
            }
            fis.close();
        } catch (IOException e) {
            System.out.println("Error leyendo el archivo con buffer");
            e.printStackTrace();
        }

    }
}
