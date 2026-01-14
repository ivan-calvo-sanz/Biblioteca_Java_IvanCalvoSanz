package _24_POO_Clases_Abstractas;

abstract class Animal {

    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Metodo abstracto (sin cuerpo se implementa en clases heredadas)
    abstract void hacerSonido();

    // Metodo concreto (ya implementado)
    void dormir() {
        System.out.println(nombre + " Esta durmiendo");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
