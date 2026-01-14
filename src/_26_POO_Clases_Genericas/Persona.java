package _26_POO_Clases_Genericas;

// Clase Persona mínima para probar la Clase Generica
public class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años)";
    }
}
