package _08_BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _0800_Class_BufferedReader_Teoria {

    public static void main(String[] args) {
        /*
            * TABLA RESUMEN CLASE BufferedReader
            *
            * +-------------------------------+----------------------------------------------------+-------------------------------------+
            * |            MÉTODO             |                    DESCRIPCIÓN                     |         DEVUELVE                    |
            * +-------------------------------+----------------------------------------------------+-------------------------------------+
            * | new BufferedReader(reader)    | Crea un BufferedReader a partir de un Reader       | BufferedReader                      |
            * | read()                        | Lee un carácter del archivo                        | int (carácter o -1)                 |
            * | read(char[] cbuf)             | Lee varios caracteres en un array                  | int (número de caracteres)          |
            * | readLine()                    | Lee una línea completa (sin salto de línea)        | String (o null si fin)              |
            * | skip(long n)                  | Salta n caracteres                                 | long (número efectivamente saltado) |
            * | ready()                       | Comprueba si se puede leer sin bloquear            | boolean                             |
            * | close()                       | Cierra el BufferedReader                           | void                                |
            * +-------------------------------+----------------------------------------------------+-------------------------------------+
            *
            * NOTAS:
            - BufferedReader NO lee bytes, solo caracteres
            - readLine() es muy útil para procesar archivos de texto línea a línea
            - Usar try-with-resources para cerrar automáticamente
            - Combinar con FileReader o InputStreamReader según la codificación
            - BufferedReader mejora la eficiencia respecto a leer directamente con FileReader
         
            * DIFERENCIA FileReader vs BufferedReader
            - FileReader: Lee directamente del disco, más lento línea a línea
            - BufferedReader: Usa un buffer en memoria, lectura más eficiente, permite readLine()
         */
        try (BufferedReader br = new BufferedReader(new FileReader("archivo.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
