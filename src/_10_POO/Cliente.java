package _10_POO;

import java.time.LocalDate;

public class Cliente {

    ////////////////////////////////////////
    // ATRIBUTOS
    ////////////////////////////////////////
    private String nombre;
    private String apellidos;
    private int edad;
    private String direccion;
    private String ciudad;
    private LocalDate fNacimiento;

    ////////////////////////////////////////
    // CONSTRUCTORES
    ////////////////////////////////////////
    public Cliente() {
    }

    public Cliente(String nombre, String apellidos, int edad, String direccion, String ciudad, LocalDate fNacimiento) {
        // Validar parametros
        if (edad < 0) {
            throw new IllegalArgumentException("La edad debe ser positiva.");
        } else {
            this.edad = edad;
        }
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.fNacimiento = fNacimiento;
    }

    ////////////////////////////////////////
    // METODOS
    ////////////////////////////////////////
    public String nombreCompleto() {
        return this.nombre + " " + this.apellidos;
    }

    public String direccionCompleta() {
        return this.direccion + ", " + this.ciudad;
    }

    ////////////////////////////////////////
    // METODO toString
    ////////////////////////////////////////
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + this.nombre + ", apellidos=" + this.apellidos + ", direccion=" + this.direccion + ", ciudad=" + this.ciudad + ", fNacimiento=" + this.fNacimiento + '}';
    }

    ////////////////////////////////////////
    // METODO equals()
    ////////////////////////////////////////
    // Si no generamos el equals() Java compara objetos mediante su numero de referencia no por si tiene los mismos atributos
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
        Cliente otro = (Cliente) obj;

        // 4- Comparamos los atributos importantes que queremos que coincidan para indicar que mbos Objetos son iguales
        return this.nombre.equals(otro.nombre)
                && this.apellidos.equals(otro.apellidos)
                && this.fNacimiento.equals(otro.fNacimiento);
    }

    ////////////////////////////////////////
    // METODO hashCode()
    ////////////////////////////////////////
    // hashCode -> Es un número que Java usa para guardar y buscar el objeto en: HashSet, HashMap, HashTable
    // Regla clave importantísima. Si dos objetos son iguales con equals(), DEBEN devolver el mismo hashCode().
    @Override
    public int hashCode() {
        int hash = 17; // número inicial

        hash = 31 * hash + nombre.hashCode();
        hash = 31 * hash + apellidos.hashCode();
        hash = 31 * hash + fNacimiento.hashCode();

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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public LocalDate getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(LocalDate fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

}
