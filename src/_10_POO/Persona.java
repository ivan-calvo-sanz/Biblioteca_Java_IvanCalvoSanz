package _10_POO;

// CLASE ABSTRACTA BASE → Persona
/*
    IDEAS CLAVE
        abstract    →   no se puede instanciar
        Comparable  →   permite ordenar
        Cloneable   →   permite clonar
        protected   →   accesible desde hijas
 */
public abstract class Persona implements Comparable<Persona>, Cloneable {

    ////////////////////////////////////////
    // ATRIBUTOS
    ////////////////////////////////////////
    protected String nombre;
    protected int edad;

    ////////////////////////////////////////
    // CONSTRUCTOR
    ////////////////////////////////////////
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    ////////////////////////////////////////
    // MÉTODO ABSTRACTO (obliga a las hijas)
    ////////////////////////////////////////
    public abstract String getRol();

    ////////////////////////////////////////
    // MÉTODO COMÚN
    ////////////////////////////////////////
    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años");
    }

    ////////////////////////////////////////
    // compareTo() → orden por edad
    ////////////////////////////////////////
    @Override
    public int compareTo(Persona otra) {
        if (this.edad < otra.edad) {
            return -1;
        }
        if (this.edad > otra.edad) {
            return 1;
        }
        return 0;
    }

    ////////////////////////////////////////
    // equals()
    ////////////////////////////////////////
    // Si no generamos el equals() Java compara objetos mediante su numero de referencia no por si tiene los mismos atributos
    @Override
    public boolean equals(Object obj) {
        // 1- Si es el mismo objeto en memoria, son iguales
        if (this == obj) {
            return true;
        }
        // 2- Si el objeto no es instancia de Persona, no son iguales
        if (!(obj instanceof Persona)) {
            return false;
        }
        // 3- Convertimos el objeto a Persona
        Persona otra = (Persona) obj;
        // 4- Comparamos los atributos importantes que queremos que coincidan para indicar que mbos Objetos son iguales
        return this.nombre.equals(otra.nombre) && this.edad == otra.edad;
    }

    ////////////////////////////////////////
    // METODO hashCode()
    ////////////////////////////////////////
    // hashCode -> Es un número que Java usa para guardar y buscar el objeto en: HashSet, HashMap, HashTable
    // Regla clave importantísima: Si dos objetos son iguales con equals(), DEBEN devolver el mismo hashCode().
    @Override
    public int hashCode() {
        int hash = 17; // número inicial
        // Combinamos los hashCode de los atributos importantes
        hash = 31 * hash + nombre.hashCode() + edad;
        return hash;
    }

    ////////////////////////////////////////
    // clone()
    ////////////////////////////////////////
    @Override
    public Persona clone() {
        try {
            return (Persona) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return getRol() + " [nombre=" + nombre + ", edad=" + edad + "]";
    }
}
