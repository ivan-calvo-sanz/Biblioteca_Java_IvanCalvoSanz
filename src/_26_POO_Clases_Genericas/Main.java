package _26_POO_Clases_Genericas;

public class Main {

    public static void main(String[] args) {

        // Caja de String
        Caja<String> cajaTexto = new Caja<>("Hola");
        String texto = cajaTexto.getElemento();   // NO casting
        System.out.println(texto);

        // Caja de Integer
        Caja<Integer> cajaNumero = new Caja<>(10);
        int numero = cajaNumero.getElemento();    // NO casting
        System.out.println(numero);

        // Caja de Persona
        Caja<Persona> cajaPersona = new Caja<>(new Persona("Iván", 35));
        Persona p = cajaPersona.getElemento();    // NO casting
        System.out.println(cajaPersona.getElemento());
    }
}
