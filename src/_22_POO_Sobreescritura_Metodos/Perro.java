package _22_POO_Sobreescritura_Metodos;

// CLASE QUE HEREDA DE LA CLASE Animal
public class Perro extends Animal {

    @Override
    void hacerSonido() {
        System.out.println("El perro ladra");
    }

}
