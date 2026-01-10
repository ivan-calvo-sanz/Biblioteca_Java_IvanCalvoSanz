package _20_POO_04_Herencia_Clases_Abstractas;

public class Main {

    public static void main(String[] args) {
        // Animal a =new Animal("Generico");  NO ES POSIBLE INSTANCIAR UN OBJETO DE UNA CLASE ABSTRACTA

        Animal perro = new Perro("Boby");
        Animal gato = new Gato("Misu");

        perro.hacerSonido();
        gato.hacerSonido();
        perro.dormir();
        gato.dormir();
    }
}
