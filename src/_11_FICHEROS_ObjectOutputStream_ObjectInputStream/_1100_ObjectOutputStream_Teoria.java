package _11_FICHEROS_ObjectOutputStream_ObjectInputStream;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _1100_ObjectOutputStream_Teoria {

    public static void main(String[] args) {

        /*
         * CLASE ObjectOutputStream
         *
         * - Se utiliza para ESCRIBIR OBJETOS COMPLETOS en un archivo
         * - Los objetos deben implementar la interfaz Serializable
         * - Guarda el estado del objeto (atributos)
         * - Los atributos static NO se serializan
         * - Se puede usar serialVersionUID para control de versiones
         * - El archivo resultante NO es legible como texto
         * - Forma parte de los "Object Streams"
         * - Se usa junto con ObjectInputStream para leerlos
         *
         * ------------------------------------------------------------
         * TABLA RESUMEN ObjectOutputStream
         *
         * +-----------------------------------+--------------------------------------------+------------------+
         * | MÉTODO                            | DESCRIPCIÓN                                | DEVUELVE         |
         * +-----------------------------------+--------------------------------------------+------------------+
         * | writeObject(Object obj)           | Escribe un objeto en el fichero            | void             |
         * | writeInt(int v)                   | Escribe un entero                          | void             |
         * | writeDouble(double v)             | Escribe un double                          | void             |
         * | writeBoolean(boolean v)           | Escribe un boolean                         | void             |
         * | flush()                           | Fuerza la escritura al archivo             | void             |
         * | close()                           | Cierra el stream                           | void             |
         * +-----------------------------------+--------------------------------------------+------------------+
         *
         * ------------------------------------------------------------
         */
        // EJEMPLO 1: Guardar un objeto en un archivo
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persona.dat"))) {
            Persona p1 = new Persona("Iván", 35, 1.75);
            oos.writeObject(p1);   // SERIALIZACIÓN
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
