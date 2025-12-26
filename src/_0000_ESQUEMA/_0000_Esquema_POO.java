package _0000_ESQUEMA;

public class _0000_Esquema_POO {

    ////////////////////////////////////////
    // ATRIBUTOS
    ////////////////////////////////////////
    private String nombre;
    private String apellidos;
    private int edad;

    ////////////////////////////////////////
    // CONSTRUCTORES
    ////////////////////////////////////////
    public _0000_Esquema_POO() {
    }

    public _0000_Esquema_POO(String nombre, String apellidos, int edad) {
        // Validar parametros
        if (edad < 0) {
            throw new IllegalArgumentException("La edad debe ser positiva.");
        } else {
            this.edad = edad;
        }
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    ////////////////////////////////////////
    // METODOS
    ////////////////////////////////////////
    public String nombreCompleto() {
        return this.nombre + " " + this.apellidos;
    }

    ////////////////////////////////////////
    // METODO toString
    ////////////////////////////////////////
    @Override
    public String toString() {
        return "_0000_Esquema_POO{" + "nombre=" + this.nombre + ", apellidos=" + this.apellidos + ", edad=" + this.edad + '}';
    }

    ////////////////////////////////////////
    // METODO equals()
    ////////////////////////////////////////
    @Override
    public boolean equals(Object obj) {
        // 1- Si es el mismo objeto en memoria, son iguales
        if (this == obj) {
            return true;
        }
        // 2- Si el objeto es null o no es de tipo Cliente, no son iguales
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        // 3- Convertimos el objeto a Cliente
        _0000_Esquema_POO otro = (_0000_Esquema_POO) obj;
        // 4- Comparamos los atributos importantes que queremos que coincidan para indicar que mbos Objetos son iguales
        return this.nombre.equals(otro.nombre) && this.apellidos.equals(otro.apellidos);
    }

    ////////////////////////////////////////
    // METODO hashCode()
    ////////////////////////////////////////
    @Override
    public int hashCode() {
        int hash = 17; // número inicial

        hash = 31 * hash + nombre.hashCode();
        hash = 31 * hash + apellidos.hashCode();
        return hash;
    }

    ////////////////////////////////////////
    // GETTERS & SETTERS
    ////////////////////////////////////////
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }
}
