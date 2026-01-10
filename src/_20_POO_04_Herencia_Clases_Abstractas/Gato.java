package _20_POO_04_Herencia_Clases_Abstractas;

public class Gato extends Animal {

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    void hacerSonido() {
        System.out.println(super.getNombre() + " dice: !Miauuu!");
    }
}
