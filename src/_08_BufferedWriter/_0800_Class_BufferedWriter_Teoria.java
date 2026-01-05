package _08_BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _0800_Class_BufferedWriter_Teoria {

    public static void main(String[] args) {
        /*
            * TABLA RESUMEN CLASE BufferedWriter
            *
            * +------------------------------+-----------------------------------------------------+---------------------------+
            * |            MÉTODO            |                    DESCRIPCIÓN                      |         DEVUELVE          |
            * +------------------------------+-----------------------------------------------------+---------------------------+
            * | new BufferedWriter(writer)   | Crea un BufferedWriter a partir de un Writer        | BufferedWriter            |
            * | write(String s)              | Escribe una cadena de texto                         | void                      |
            * | write(int c)                 | Escribe un solo carácter                            | void                      |
            * | write(char[] cbuf)           | Escribe un array de caracteres                      | void                      |
            * | newLine()                    | Inserta un salto de línea independiente del SO      | void                      |
            * | flush()                      | Fuerza la escritura del buffer al archivo           | void                      |
            * | close()                      | Cierra el BufferedWriter y vacía el buffer          | void                      |
            * +------------------------------+-----------------------------------------------------+---------------------------+
            *
            * NOTAS:
            - BufferedWriter NO escribe directamente en el archivo, usa un buffer en memoria
            - Es recomendable envolver siempre un FileWriter con BufferedWriter
            - flush() es útil si quieres escribir sin cerrar el archivo
            - close() llama automáticamente a flush()
            - Usar try-with-resources para evitar archivos incompletos
         
            * DIFERENCIA FileWriter vs BufferedWriter 
            - FileWriter: Escribe directamente al disco, más lento con muchas escrituras
            - BufferedWriter: Escribe primero en memoria, mucho más eficiente, recomendado casi siempre
         */
        Path path = Paths.get("archivo.txt");
        //try (BufferedWriter bw = new BufferedWriter(new FileWriter("archivo.txt", true))) { // ",true" es del FileWriter hace que se pueda sobreescribir en el txt respetando lo ya existente
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path.toString(), true))) { // ",true" es del FileWriter hace que se pueda sobreescribir en el txt respetando lo ya existente
            bw.write("Primera línea");
            bw.newLine();                       // Salto de línea independiente del SO
            bw.write("Segunda línea");
            bw.newLine();
            bw.flush();                         // Opcional aquí (close() lo hace automáticamente)
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
