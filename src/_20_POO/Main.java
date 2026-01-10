package _20_POO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        // ============================================================
        // CREACIÓN DE OBJETOS (polimorfismo)
        // ============================================================
        Persona p1 = new Empleado("Ana", 30, 1800);
        Persona p2 = new Gerente("Luis", 45, 2500, 800);
        Persona p3 = new Empleado("Ana", 30, 1800);

        // ============================================================
        // instanceof + casting seguro
        // ============================================================
        if (p2 instanceof Gerente) {
            Gerente g = (Gerente) p2;
            System.out.println("Salario gerente: " + g.calcularSalario());  //3300
        }

        // ============================================================
        // equals / == / hashCode
        // ============================================================
        System.out.println("p1 == p3: " + (p1 == p3));              // false
        System.out.println("p1.equals(p3): " + p1.equals(p3));   // true
        System.out.println("hash p1: " + p1.hashCode());            // 66529
        System.out.println("hash p3: " + p3.hashCode());            // 66529

        // ============================================================
        // clone()
        // ============================================================
        Persona copia = p1.clone();
        System.out.println("Copia clonada: " + copia);              // [nombre=Ana, edad=30]

        // ============================================================
        // ARRAY de objetos
        // ============================================================
        Persona[] personas = {p1, p2, p3};

        int empleados = 0;
        int gerentes = 0;
        for (Persona p : personas) {
            if (p instanceof Gerente) {
                gerentes++;
            } else if (p instanceof Empleado) {
                empleados++;
            }
        }
        System.out.println("Empleados: " + empleados);
        System.out.println("Gerentes: " + gerentes);

        // ============================================================
        // ORDENAR ARRAY (Comparable → compareTo)
        // ============================================================
        Arrays.sort(personas);
        System.out.println("Ordenados por edad:");
        for (Persona p : personas) {
            System.out.println(p);
        }

        // ============================================================
        // ARRAYLIST de objetos
        // ============================================================
        ArrayList<Persona> lista = new ArrayList<>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        // ============================================================
        // SORT ArrayList
        // ============================================================
        Collections.sort(lista);

        // ============================================================
        // compareTo directo
        // ============================================================
        int r = p1.compareTo(p2);
        System.out.println("p1.compareTo(p2): " + r);
    }
}
