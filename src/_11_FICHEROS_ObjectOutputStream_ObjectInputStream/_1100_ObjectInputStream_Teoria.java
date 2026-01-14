package _11_FICHEROS_ObjectOutputStream_ObjectInputStream;

import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class _1100_ObjectInputStream_Teoria {

    public static void main(String[] args) {

        /*
         * CLASE ObjectInputStream
         *
         * - Se utiliza para LEER OBJETOS COMPLETOS desde un archivo
         * - Los objetos deben haber sido serializados previamente
         * - Reconstruye el objeto con su estado original
         * - Se usa junto con ObjectOutputStream
         * - Es necesario hacer CAST del objeto leído
         * - La clase debe existir en el proyecto
         * - serialVersionUID debe coincidir
         * - La lectura termina cuando salta EOFException
         * - El archivo NO es legible como texto
         *
         * ------------------------------------------------------------
         * TABLA RESUMEN ObjectInputStream
         *
         * +-----------------------------------+--------------------------------------------+---------------------------+
         * | MÉTODO                            | DESCRIPCIÓN                                | DEVUELVE                  |
         * +-----------------------------------+--------------------------------------------+---------------------------+
         * | readObject()                      | Lee un objeto del fichero                  | Object                    |
         * | readInt()                         | Lee un entero                              | int                       |
         * | readDouble()                      | Lee un double                              | double                    |
         * | readBoolean()                     | Lee un boolean                             | boolean                   |
         * | close()                           | Cierra el stream                           | void                      |
         * +-----------------------------------+--------------------------------------------+---------------------------+
         *
         */
        // EJEMPLO 1: Leer un objeto desde un archivo
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persona.dat"))) {
            Persona p1 = (Persona) ois.readObject();   // DESERIALIZACIÓN
            System.out.println(p1);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // EJEMPLO 2: Leer varios objetos desde un archivo
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("personas.dat"))) {
            while (true) {
                Persona p = (Persona) ois.readObject();
                System.out.println(p);
            }
        } catch (EOFException ex) {
            // Fin del archivo: salida normal del bucle
            System.out.println("Se lanza la excepcion EOFException cuando se terminado de leer");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
