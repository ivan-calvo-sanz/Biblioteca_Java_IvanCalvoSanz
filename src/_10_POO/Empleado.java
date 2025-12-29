package _10_POO;

// HERENCIA → Empleado
public class Empleado extends Persona implements Trabajador {

    protected double salarioBase;

    public Empleado(String nombre, int edad, double salarioBase) {
        super(nombre, edad);
        this.salarioBase = salarioBase;
    }

    @Override
    public String getRol() {
        return "Empleado";
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }
}
