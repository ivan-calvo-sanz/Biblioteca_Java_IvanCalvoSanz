package _24_POO_Clases_Abstractas;

public class Gato extends Animal {

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    void hacerSonido() {
        System.out.println(super.getNombre() + " dice: !Miauuu!");
    }
}
