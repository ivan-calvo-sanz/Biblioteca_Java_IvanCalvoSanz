package _07_File_Paths_Files;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.List;

public class _0700_Class_Paths_Teoria {

    public static void main(String[] args) {


        /* CLASE Paths / Path
        - REEMPLAZO MODERNO DE LA CLASE File
        - Paths es una clase INTERFACE (solo métodos static)
        - Path representa una ruta (archivo o directorio)
        - NO maneja contenido directamente
        - Sustituye a File (java.io)
        - Se combina con la clase Files para operaciones reales
         */

 /*
           TABLA RESUMEN CLASE Paths / Path

           +-----------------------------+--------------------------------------------------+---------------------------+
           |           MÉTODO            |               DESCRIPCIÓN                        |         DEVUELVE          |
           +-----------------------------+--------------------------------------------------+---------------------------+
           | Paths.get(ruta)             | Crea un Path                                     | Path                      |
           | getFileName()               | Nombre del archivo                               | Path                      |
           | getParent()                 | Directorio padre                                 | Path                      |
           | getRoot()                   | Raíz del sistema                                 | Path                      |
           | toAbsolutePath()            | Ruta absoluta                                    | Path                      |
           | normalize()                 | Normaliza la ruta                                | Path                      |
           | resolve(path)               | Une rutas                                        | Path                      |
           | Files.exists(path)          | Comprueba si existe                              | boolean                   |
           | Files.createFile(path)      | Crea archivo físico                              | Path                      |
           | Files.createDirectories()   | Crea directorios anidados                        | Path                      |
           | Files.delete(path)          | Elimina archivo o carpeta                        | void                      |
           | Files.size(path)            | Tamaño en bytes                                  | long                      |
           | Files.readAllLines(path)    | Lee líneas de texto                              | List<String>              |
           +-----------------------------+--------------------------------------------------+---------------------------+
         */
        // ============================================================
        // Paths.get(ruta) | Crea un Path | Path
        // ============================================================
        Path ruta = Paths.get("ejemplo.txt");

        // ============================================================
        // getFileName() | Nombre del archivo | Path
        // ============================================================
        System.out.println("Nombre: " + ruta.getFileName());

        // ============================================================
        // getParent() | Directorio padre | Path
        // ============================================================
        System.out.println("Padre: " + ruta.getParent());

        // ============================================================
        // getRoot() | Raíz del sistema | Path
        // ============================================================
        System.out.println("Raíz: " + ruta.getRoot());

        // ============================================================
        // toAbsolutePath() | Ruta absoluta | Path
        // ============================================================
        System.out.println("Ruta absoluta: " + ruta.toAbsolutePath());

        // ============================================================
        // normalize() | Normaliza la ruta | Path
        // ============================================================
        Path rutaRara = Paths.get("dir1/../dir2/./archivo.txt");
        System.out.println("Ruta normalizada: " + rutaRara.normalize());

        // ============================================================
        // resolve(path) | Une rutas | Path
        // ============================================================
        Path base = Paths.get("documentos");
        Path completa = base.resolve("texto.txt");
        System.out.println("Ruta unida: " + completa);

        // ============================================================
        // Files.exists(path) | Comprueba si existe | boolean
        // ============================================================
        System.out.println("¿Existe? " + Files.exists(ruta));

        // ============================================================
        // Files.createFile(path) | Crea archivo físico | Path
        // ============================================================
        try {
            if (!Files.exists(ruta)) {
                Files.createFile(ruta);
                System.out.println("Archivo creado");
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo");
        }

        // ============================================================
        // Files.createDirectories(path) | Directorios anidados | Path
        // ============================================================
        Path carpetas = Paths.get("dirA/dirB/dirC");
        try {
            Files.createDirectories(carpetas);
            System.out.println("Directorios creados");
        } catch (IOException e) {
            System.out.println("Error creando directorios");
        }

        // ============================================================
        // Files.size(path) | Tamaño en bytes | long
        // ============================================================
        try {
            System.out.println("Tamaño: " + Files.size(ruta) + " bytes");
        } catch (IOException e) {
            System.out.println("No se pudo obtener el tamaño");
        }

        // ============================================================
        // Files.readAllLines(path) | Lee archivo de texto | List<String>
        // ============================================================
        try {
            List<String> lineas = Files.readAllLines(ruta);
            System.out.println("Contenido del archivo:");
            for (String linea : lineas) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error leyendo el archivo");
        }

        // ============================================================
        // Files.delete(path) | Elimina archivo o carpeta | void
        // ============================================================
        try {
            Files.delete(ruta);
            System.out.println("Archivo eliminado");
        } catch (IOException e) {
            System.out.println("No se pudo eliminar");
        }
    }
}
