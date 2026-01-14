package _10_FICHEROS_RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class _1000_RandomAccessFile_Teoria {

    public static void main(String[] args) {

        /*
        * NOTAS PRINCIPALES SOBRE RandomAccessFile
        *
        * - Permite acceso ALEATORIO a un archivo, no solo secuencial.
        * - Ideal para trabajar con REGISTROS DE TAMAÑO FIJO.
        * - Combina la funcionalidad de DataInputStream (lectura de tipos primitivos)
        *   y DataOutputStream (escritura de tipos primitivos) en la misma clase.
        * - Permite moverse dentro del archivo con seek() a cualquier posición.
        * - No es legible para humanos si escribes tipos primitivos o Strings en binario.
        * - Útil para “mini bases de datos” donde quieras leer/escribir, actualizar
        *   o buscar registros específicos.
        * - A diferencia de DataInput/OutputStream, RandomAccessFile permite
        *   modificar un registro sin reescribir todo el archivo.
        *
        * MODOS DE APERTURA DEL ARCHIVO:
        *
        * - "r"   → Solo LECTURA
        *          • El archivo debe existir
        *          • No permite escritura
        *
        * - "rw"  → LECTURA y ESCRITURA
        *          • Crea el archivo si no existe
        *          • Permite modificar cualquier parte del archivo
        *          • Es el modo MÁS UTILIZADO
        *
        * - "rws" → LECTURA y ESCRITURA (sincronización completa)
        *          • Los datos y metadatos se escriben inmediatamente a disco
        *          • Más seguro, pero más lento
        *
        * - "rwd" → LECTURA y ESCRITURA (sincroniza solo los datos)
        *          • No garantiza metadatos
        *          • Equilibrio entre seguridad y rendimiento
        *
        * EJEMPLO DE USO:
        * - Guardar varias personas con la misma estructura: nombre, edad,
        *   fechaNacimiento, residencia.
        * - Acceder directamente al quinto registro sin leer los anteriores.
         */
        // ============================================================
        // TABLA RESUMEN MÉTODOS RandomAccessFile
        // ============================================================
        /*
         * +--------------------------------------+---------------------------------------------------+--------------------------+
         * |              MÉTODO                  |                 DESCRIPCIÓN                       |         DEVUELVE         |
         * +--------------------------------------+---------------------------------------------------+--------------------------+
         * | new RandomAccessFile(file, mode)     | Abre un archivo en modo lectura/escritura         | RandomAccessFile         |
         * | writeInt(int v)                      | Escribe un int                                    | void                     |
         * | writeLong(long v)                    | Escribe un long                                   | void                     |
         * | writeChar(int v)                     | Escribe un char                                   | void                     |
         * | writeUTF(String s)                   | Escribe un String (UTF)                           | void                     |
         * | readInt()                            | Lee un int                                        | int                      |
         * | readLong()                           | Lee un long                                       | long                     |
         * | readChar()                           | Lee un char                                       | char                     |
         * | readUTF()                            | Lee un String (UTF)                               | String                   |
         * | seek(long pos)                       | Mueve el puntero a una posición                   | void                     |
         * | getFilePointer()                     | Posición actual del puntero                       | long                     |
         * | length()                             | Tamaño del archivo                                | long                     |
         * | close()                              | Cierra el archivo                                 | void                     |
         * +--------------------------------------+---------------------------------------------------+--------------------------+
         */
        // ============================================================
        // DEFINICIÓN DEL TAMAÑO DEL REGISTRO (FIJO)
        // ============================================================
        final int NOMBRE_CHARS = 20;       // 20 chars -> 40 bytes
        final int RESIDENCIA_CHARS = 30;   // 30 chars -> 60 bytes

        final int TAM_REGISTRO
                = (NOMBRE_CHARS * Character.BYTES) // nombre
                + Integer.BYTES // edad
                + Long.BYTES // fechaNacimiento
                + (RESIDENCIA_CHARS * Character.BYTES); // residencia

        // ============================================================
        // EJEMPLO DE USO: CREAR Y LEER REGISTROS ALEATORIOS
        // ============================================================
        try (RandomAccessFile raf = new RandomAccessFile("D:\\00_ICALVO_ESCRITORIO\\ICSProgramacion\\0_Java\\0_Biblioteca_Java_IvanCalvoSanz\\00_PRUEBAS\\personas.dat", "rw")) {

            //raf.setLength(0);      // Limpia los Registros existentes en el archvo
            raf.seek(raf.length());     // Si quiero seguir añadiendo Registros sin borrar los existentes

            // Escribir varios registros
            escribirPersona(raf, "Ana", 25, 915148800000L, "Madrid");
            escribirPersona(raf, "Luis", 30, 852076800000L, "Valladolid");
            escribirPersona(raf, "Marta", 28, 883612800000L, "Burgos");
            escribirPersona(raf, "Carlos", 40, 599616000000L, "Aranda");
            escribirPersona(raf, "Iván", 35, 662688000000L, "Valladolid");

            // LEER UN REGISTRO EN CONCRETO
            // Acceder al quinto registro directamente (índice 4)
            int registroBuscado = 4;
            raf.seek((long) registroBuscado * TAM_REGISTRO);
            // Leer registro
            String nombre = leerStringFijo(raf, NOMBRE_CHARS);
            int edad = raf.readInt();
            long fecha = raf.readLong();
            String residencia = leerStringFijo(raf, RESIDENCIA_CHARS);

            System.out.println("REGISTRO ENCONTRADO:");
            System.out.println(nombre + " | " + edad + " | " + residencia);

            // LEER TODOS LOS REGISTROS
            System.out.println("TODOS LOS REGISTROS:");
            raf.seek(0); // me posiciono al inicio del archivo
            while (raf.getFilePointer() < raf.length()) {
                nombre = leerStringFijo(raf, NOMBRE_CHARS);
                edad = raf.readInt();
                fecha = raf.readLong();
                residencia = leerStringFijo(raf, RESIDENCIA_CHARS);
                System.out.println(nombre + " | " + edad + " | " + residencia);
            }
        } catch (IOException e) {
            System.out.println("Error RandomAccessFile: " + e.getMessage());
        }
    }

    // ============================================================
    // MÉTODO: escribirPersona
    // ============================================================
    private static void escribirPersona(RandomAccessFile raf,
            String nombre,
            int edad,
            long fechaNacimiento,
            String residencia) throws IOException {

        escribirStringFijo(raf, nombre, 20);
        raf.writeInt(edad);
        raf.writeLong(fechaNacimiento);
        escribirStringFijo(raf, residencia, 30);
    }

    // ============================================================
    // MÉTODO: escribirStringFijo
    // ============================================================
    private static void escribirStringFijo(RandomAccessFile raf,
            String texto,
            int longitud) throws IOException {

        StringBuilder sb = new StringBuilder(texto);
        sb.setLength(longitud); // rellena con '\0'
        raf.writeChars(sb.toString());
    }

    // ============================================================
    // MÉTODO: leerStringFijo
    // ============================================================
    private static String leerStringFijo(RandomAccessFile raf,
            int longitud) throws IOException {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            sb.append(raf.readChar());
        }
        return sb.toString().trim();
    }
}
