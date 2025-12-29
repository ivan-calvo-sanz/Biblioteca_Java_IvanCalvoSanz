package _10_POO;

// HERENCIA + POLIMORFISMO → Gerente
// Polimorfismo: Un Gerente es un Empleado es una Persona
public class Gerente extends Empleado {

    private double bonus;

    public Gerente(String nombre, int edad, double salarioBase, double bonus) {
        super(nombre, edad, salarioBase);
        this.bonus = bonus;
    }

    ////////////////////////////////////////
    // SOBRESCRITURA (POLIMORFISMO)
    ////////////////////////////////////////
    @Override
    public String getRol() {
        return "Gerente";
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }
}
