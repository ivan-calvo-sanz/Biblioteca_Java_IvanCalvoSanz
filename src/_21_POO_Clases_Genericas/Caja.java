package _21_POO_Clases_Genericas;

// CLASE GENERICA Caja
/*
 * T es el tipo genérico 
 * T se decide cuando se crea el objeto, no aquí
 */
public class Caja<Generico> {

    // ATRIBUTO
    private Generico elemento;

    // CONSTRUCTOR
    public Caja(Generico elemento) {
        this.elemento = elemento;
    }

    // METODOS
    public Generico getElemento() {
        return elemento;
    }

    public void setElemento(Generico elemento) {
        this.elemento = elemento;
    }
}
