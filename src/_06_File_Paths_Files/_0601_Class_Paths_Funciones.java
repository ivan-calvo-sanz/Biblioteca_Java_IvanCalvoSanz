package _06_File_Paths_Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class _0601_Class_Paths_Funciones {

    public static void main() {
        // COMPROBAR FUNCIONES
        try {
            String[] extensiones = {"jpg", "png", "mp3", "mp4"};

            Path fichero = pedirFichero(extensiones);
            Path directorio = pedirDirectorio();

            copiarFichero(fichero, directorio);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    // FUNCIONES Paths
    // 01-Pedir fichero al Usuario (Usuario introduce la ruta+nombre del archivo+extension mediante consola)
    // 02-Pedir directorio al Usuario (Usuario introduce la ruta del directorio mediante consola)
    // 03-Copiar ficheros (Usuario introduce la ruta del fichero a copiar y la ruta directorio donde quiere copiar)
    // 
    // 
    /*
     * 01-Pedir fichero al Usuario (Usuario introduce la ruta+nombre del archivo+extension mediante consola) 
     * String[] extensiones -> Array de String con las extensiones correctas
     * ejemplo de fichero correcto: D:\00_ICALVO_ESCRITORIO\ICSProgramacion\0_Java\0_Ejercicios_Java_CalvoSanzIvan\00_PRUEBAS\gato.jpg
     */
    public static Path pedirFichero(String[] extensiones) throws FileNotFoundException, IOException {
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");

        System.out.println("Introduce la ruta del archivo:");
        String ruta = sn.next();

        Path path = Paths.get(ruta);
        // Controlar que el archivo existe
        if (!Files.exists(path)) {
            throw new FileNotFoundException("No existe el fichero");
        }
        // Controlar que es un archivo
        if (!Files.isRegularFile(path)) {
            throw new IOException("No es un fichero");
        }
        // Controlar las extensiones
        if (extensiones != null && extensiones.length > 0) {
            boolean extensionEncontrada = false;
            for (int i = 0; i < extensiones.length && !extensionEncontrada; i++) {
                if (path.toString().endsWith(extensiones[i])) {
                    extensionEncontrada = true;
                }
            }
            if (!extensionEncontrada) {
                throw new IOException("La extension no es correcta");
            }
        }
        return path;
    }

    /*
     * 02-Pedir directorio al Usuario (Usuario introduce la ruta del directorio mediante consola)
     * ejemplo de fichero correcto: D:\00_ICALVO_ESCRITORIO\ICSProgramacion\0_Java\0_Ejercicios_Java_CalvoSanzIvan\00_PRUEBAS\prueba
     */
    public static Path pedirDirectorio() throws FileNotFoundException, IOException {
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");

        System.out.println("Introduce la ruta del directorio:");
        String ruta = sn.next();

        Path path = Paths.get(ruta);
        // Controlar que el archivo existe
        if (!Files.exists(path)) {
            throw new FileNotFoundException("No existe el directorio");
        }
        // Controlar que es un archivo
        if (!Files.isDirectory(path)) {
            throw new IOException("No es un directorio");
        }
        return path;
    }

    /*
     * 03-Copiar ficheros (Usuario introduce la ruta del fichero a copiar y la ruta directorio donde quiere copiar)
     * ejemplo de fichero correcto: D:\00_ICALVO_ESCRITORIO\ICSProgramacion\0_Java\0_Ejercicios_Java_CalvoSanzIvan\00_PRUEBAS\prueba
     */
    // Path fichero:    ruta del archivo origen (el que quieres copiar) archivo+extension
    // Path directorio: ruta del directorio destino.
    public static void copiarFichero(Path fichero, Path directorio) throws IOException {
        // creo la ruta completa final Directorio+Ficero con extension
        Path rutaFinal = Paths.get(directorio.toString(), fichero.getFileName().toString());

        //FileInputStream para leer archivos binarios , FileOutputStream para escribir archvos binarios
        try (FileInputStream fis = new FileInputStream(fichero.toString()); FileOutputStream fos = new FileOutputStream(rutaFinal.toString())) {
            byte[] bytes = new byte[4096];  // creo un buffer de lectura de 4 KB No se lee byte a byte (sería lento) Se leen bloques de datos
            int numBytes;

            int totalBytes = fis.available();   // Número de bytes totales disponibles para leer
            double progreso;
            int byteLeidos = 0;

            while ((numBytes = fis.read(bytes)) != -1) {        // Bucle de copia, lee hasta 4096 bytes Devuelve número de bytes leídos -1 cuando llega al final del archivo
                fos.write(bytes, 0, numBytes);            // Escribe los bytes leidos desde el inicio del buffer 0 hasta el numero de bytes leidos, en la ultima bloque será menos de 4096
                byteLeidos += numBytes;                           // A partir de aqui Actualizar progreso
                progreso = (double) byteLeidos * 100 / totalBytes;
                System.out.printf("Copiando: %.1f%% \n", progreso);
            }
            System.out.println("Se ha copiado el fichero");
        }
    }

}
