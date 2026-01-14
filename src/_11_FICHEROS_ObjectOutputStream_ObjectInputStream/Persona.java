package _11_FICHEROS_ObjectOutputStream_ObjectInputStream;

import java.io.Serializable;

/*
 * CLASE EJEMPLO SERIALIZABLE
 * - Implementa Serializable
 * - Representa un objeto que puede guardarse en disco
 */
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    String nombre;
    int edad;
    double altura;

    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }
}
