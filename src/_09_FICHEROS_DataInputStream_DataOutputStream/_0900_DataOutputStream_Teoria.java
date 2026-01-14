package _09_FICHEROS_DataInputStream_DataOutputStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _0900_DataOutputStream_Teoria {

    public static void main(String[] args) {

        /*
         * TABLA RESUMEN CLASE DataOutputStream
         *
         * +--------------------------------------+---------------------------------------------------+--------------------------+
         * |              MÉTODO                  |                 DESCRIPCIÓN                       |         DEVUELVE         |
         * +--------------------------------------+---------------------------------------------------+--------------------------+
         * | new DataOutputStream(OutputStream)  | Crea un DataOutputStream                          | DataOutputStream         |
         * | writeInt(int v)                      | Escribe un entero                                 | void                     |
         * | writeDouble(double v)                | Escribe un double                                 | void                     |
         * | writeFloat(float v)                  | Escribe un float                                  | void                     |
         * | writeLong(long v)                    | Escribe un long                                   | void                     |
         * | writeBoolean(boolean v)              | Escribe un boolean                                | void                     |
         * | writeChar(int v)                     | Escribe un char                                   | void                     |
         * | writeUTF(String s)                   | Escribe un String (UTF)                           | void                     |
         * | close()                              | Cierra el DataOutputStream                        | void                     |
         * +--------------------------------------+---------------------------------------------------+--------------------------+
         *
         * NOTAS:
         * - DataOutputStream trabaja con BINARIO (.bin)
         * - Guarda tipos primitivos de forma eficiente
         * - Se combina con FileOutputStream
         * - Los datos NO son legibles para humanos
         */
        // ============================================================
        // new DataOutputStream(OutputStream) | Crear DataOutputStream
        // ============================================================
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:\\00_ICALVO_ESCRITORIO\\ICSProgramacion\\0_Java\\0_Biblioteca_Java_IvanCalvoSanz\\00_PRUEBAS\\datos.bin"))) {

            // ============================================================
            // writeInt(int v) | Escribir un int
            // ============================================================
            dos.writeInt(30);

            // ============================================================
            // writeDouble(double v) | Escribir un double
            // ============================================================
            dos.writeDouble(1.75);

            // ============================================================
            // writeBoolean(boolean v) | Escribir un boolean
            // ============================================================
            dos.writeBoolean(true);

            // ============================================================
            // writeChar(int v) | Escribir un char
            // ============================================================
            dos.writeChar('I');

            // ============================================================
            // writeUTF(String s) | Escribir un String
            // ============================================================
            //dos.writeUTF(String.format("%-10.10s", "Iván"));
            dos.writeUTF(String.format("%-10.10s", "Fernando"));

            dos.flush();

            System.out.println("Datos escritos correctamente en datos.bin");

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }

        // ============================================================
        // close() | Cierre automático
        // ============================================================
        // Se cierra automáticamente con try-with-resources
    }
}
