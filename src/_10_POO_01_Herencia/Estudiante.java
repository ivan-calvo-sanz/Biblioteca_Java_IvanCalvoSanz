package _10_POO_01_Herencia;

// CLASE Estudiante HEREDA DE LA CLASE Persona
public class Estudiante extends Persona {

    private int creditos;

    public Estudiante(String nombre, int edad) {
        super(nombre, edad);
        this.creditos = 60;
    }

    @Override
    public String toString() {
        return super.toString() + " Estudiante{" + "creditos=" + creditos + '}';
    }

    public int getCreditos() {
        return this.creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
}
