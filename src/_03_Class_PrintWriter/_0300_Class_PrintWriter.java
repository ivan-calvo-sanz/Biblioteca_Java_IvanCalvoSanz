package _03_Class_PrintWriter;

import static _99_Serializable.FormaBinaria_bytes.f;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class _0300_Class_PrintWriter {

    public static void main(String[] args) {

        // CREAR OBJETO DE LA CLASE PrintWriter
        try {
            PrintWriter pw = new PrintWriter(f);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(_0300_Class_PrintWriter.class.getName()).log(Level.SEVERE, null, ex);
        }
        // METODOS CLASE PrintWriter
        // canRead()            Boolean     Comprueba si el archivo se puede leer o no
        // METODOS CLASE PrintWriter
        // canRead()            Boolean     Comprueba si el archivo se puede leer o no
    }
}
