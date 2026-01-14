package _06_FICHEROS_File_Paths_Files;

import java.io.File;
import java.io.IOException;

public class _0600_Class_File_Teoria {

    public static void main(String[] args) {

        /* CLASE File
        - File NO maneja contenido, solo rutas y metadatos
        - Crear File ≠ crear archivo físico
        - createNewFile() puede lanzar IOException
        - File sirve como base para: FileReader / FileWriter y BufferedReader / BufferedWriter
         */

 /*
       TABLA RESUMEN CLASE File

       +-----------------------------+--------------------------------------------------+---------------------------+
       |           MÉTODO            |               DESCRIPCIÓN                        |         DEVUELVE          |
       +-----------------------------+--------------------------------------------------+---------------------------+
       | new File(path)              | Crea un objeto File                              | File                      |
       | exists()                    | Comprueba si existe                              | boolean                   |
       | createNewFile()             | Crea el archivo físico                           | boolean                   |
       | mkdir()                     | Crea un directorio                               | boolean                   |
       | mkdirs()                    | Crea directorios anidados                        | boolean                   |
       | delete()                    | Elimina archivo o carpeta                        | boolean                   |
       | isFile()                    | Comprueba si es archivo                          | boolean                   |
       | isDirectory()               | Comprueba si es directorio                       | boolean                   |
       | getName()                   | Devuelve el nombre del fichero (con extensión)   | String                    |
       | getPath()                   | Devuelve la ruta                                 | String                    |
       | getAbsolutePath()           | Devuelve la ruta absoluta                        | String                    |
       | length()                    | Tamaño en bytes                                  | long                      |
       | list()                      | Lista nombres de archivos                        | String[]                  |
       | listFiles()                 | Lista archivos como File                         | File[]                    |
       | canRead()                   | Permiso de lectura                               | boolean                   |
       | canWrite()                  | Permiso de escritura                             | boolean                   |
       +-----------------------------+--------------------------------------------------+---------------------------+
         */
        // ============================================================
        // new File(path) | Crea un objeto File | File
        // ============================================================
        File archivo = new File("ejemplo.txt");

        // ============================================================
        // exists() | Comprueba si existe | boolean
        // ============================================================
        System.out.println("¿Existe? " + archivo.exists());

        // ============================================================
        // createNewFile() | Crea el archivo físico | boolean
        // ============================================================
        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado");
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo");
        }

        // ============================================================
        // mkdir() | Crea un directorio | boolean
        // ============================================================
        File carpeta = new File("miCarpeta");
        if (carpeta.mkdir()) {
            System.out.println("Carpeta creada");
        }

        // ============================================================
        // mkdirs() | Crea directorios anidados | boolean
        // ============================================================
        File carpetas = new File("dir1/dir2/dir3");
        if (carpetas.mkdirs()) {
            System.out.println("Directorios anidados creados");
        }

        // ============================================================
        // delete() | Elimina archivo o carpeta | boolean
        // ============================================================
        if (archivo.delete()) {
            System.out.println("Archivo eliminado");
        }

        // ============================================================
        // isFile() | Comprueba si es archivo | boolean
        // ============================================================
        System.out.println("¿Es archivo? " + archivo.isFile());

        // ============================================================
        // isDirectory() | Comprueba si es directorio | boolean
        // ============================================================
        System.out.println("¿Es directorio? " + archivo.isDirectory());

        // ============================================================
        // getName() | Devuelve el nombre del fichero | String
        // ============================================================
        System.out.println("Nombre: " + archivo.getName());
        // archivo.getName().split("\\.")[0] → nombre sin extensión

        // ============================================================
        // getPath() | Devuelve la ruta | String
        // ============================================================
        System.out.println("Ruta: " + archivo.getPath());

        // ============================================================
        // getAbsolutePath() | Devuelve la ruta absoluta | String
        // ============================================================
        System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());

        // ============================================================
        // length() | Tamaño en bytes | long
        // ============================================================
        System.out.println("Tamaño: " + archivo.length() + " bytes");

        // ============================================================
        // list() | Lista nombres de archivos | String[]
        // ============================================================
        File directorio = new File(".");
        String[] listaNombres = directorio.list();

        System.out.println("Contenido (String[]):");
        for (String nombre : listaNombres) {
            System.out.println(nombre);
        }

        // ============================================================
        // listFiles() | Lista archivos como File | File[]
        // ============================================================
        File[] listaFiles = directorio.listFiles();

        System.out.println("Contenido (File[]):");
        for (File f : listaFiles) {
            System.out.println(f.getName() + " -> ¿Archivo? " + f.isFile());
        }

        // ============================================================
        // canRead() | Permiso de lectura | boolean
        // ============================================================
        System.out.println("¿Se puede leer? " + archivo.canRead());

        // ============================================================
        // canWrite() | Permiso de escritura | boolean
        // ============================================================
        System.out.println("¿Se puede escribir? " + archivo.canWrite());
    }
}
