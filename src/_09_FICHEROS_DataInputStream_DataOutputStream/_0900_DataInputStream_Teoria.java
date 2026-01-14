package _09_FICHEROS_DataInputStream_DataOutputStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class _0900_DataInputStream_Teoria {

    public static void main(String[] args) {

        /*
         * TABLA RESUMEN CLASE DataInputStream
         *
         * +--------------------------------------+---------------------------------------------------+--------------------------+
         * |              MÉTODO                  |                 DESCRIPCIÓN                       |         DEVUELVE         |
         * +--------------------------------------+---------------------------------------------------+--------------------------+
         * | new DataInputStream(InputStream)    | Crea un DataInputStream                           | DataInputStream          |
         * | readInt()                            | Lee un entero                                     | int                      |
         * | readDouble()                         | Lee un double                                     | double                   |
         * | readFloat()                          | Lee un float                                      | float                    |
         * | readLong()                           | Lee un long                                       | long                     |
         * | readBoolean()                        | Lee un boolean                                    | boolean                  |
         * | readChar()                           | Lee un char                                       | char                     |
         * | readUTF()                            | Lee un String (UTF)                               | String                   |
         * | close()                              | Cierra el DataInputStream                         | void                     |
         * +--------------------------------------+---------------------------------------------------+--------------------------+
         *
         * NOTAS:
         * - DataInputStream trabaja con BINARIO
         * - Debe leerse en el MISMO ORDEN en que se escribió
         * - Se combina con FileInputStream
         * - No es legible para humanos
         */
        // ============================================================
        // new DataInputStream(InputStream) | Crear DataInputStream
        // ============================================================
        try (DataInputStream dis = new DataInputStream(new FileInputStream("D:\\00_ICALVO_ESCRITORIO\\ICSProgramacion\\0_Java\\0_Biblioteca_Java_IvanCalvoSanz\\00_PRUEBAS\\datos.bin"))) {

            // ============================================================
            // readInt() | Leer un int
            // ============================================================
            int edad = dis.readInt();

            // ============================================================
            // readDouble() | Leer un double
            // ============================================================
            double altura = dis.readDouble();

            // ============================================================
            // readBoolean() | Leer un boolean
            // ============================================================
            boolean activo = dis.readBoolean();

            // ============================================================
            // readChar() | Leer un char
            // ============================================================
            char inicial = dis.readChar();

            // ============================================================
            // readUTF() | Leer un String
            // ============================================================
            String nombre = dis.readUTF();

            System.out.println("Datos leídos del archivo:");
            System.out.println("Edad: " + edad);
            System.out.println("Altura: " + altura);
            System.out.println("Activo: " + activo);
            System.out.println("Inicial: " + inicial);
            System.out.println("Nombre: " + nombre);

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        // ============================================================
        // close() | Cierre automático
        // ============================================================
        // Se cierra automáticamente con try-with-resources
    }
}
