/*
=====================================================
Persona     (ABSTRACTO, no se puede instanciar, SÍ puede implementar métodos)
=====================================================
    ATRIBUTOS:
        - protected String nombre
        - protected int edad
    METODOS:
        - abstract String getRol()      (ABSTRACTO, no implementado, obliga implementr a las clases hijas)
        - void presentarse()
        - int compareTo(Persona)
        - boolean equals(Object)
        - int hashCode()
        - Persona clone()
        - String toString()

=====================================================
Trabajador  (INTERFACE, define qué se hace, no cómo)
=====================================================
    METODOS:
        - double calcularSalario()

=====================================================
Empleado    (HEREDA "extends" de Persona, "implements" de Trabajador)
=====================================================
    ATRIBUTOS:
        - Hereda atributos de Persona (nombre,edad)
        - double salarioBase
    METODOS:
        - String getRol()               (Hereda de Persona metodo abstracto hay que implementarlo)
        - double calcularSalario()      (Implementa método de la interface Trabajador)

=====================================================
Gerente     (HEREDA "extends" de Empleado, por lo tanto HEREDA de Persona, "implements" de Trabajador)
=====================================================
    ATRIBUTOS:
        - Hereda atributos de Persona (nombre,edad)
        - Hereda atributos de Empleado (salarioBase)
        - double bonus
    METODOS:
        - String getRol()               (Hereda de Persona metodo abstracto hay que implementarlo)
        - double calcularSalario()      (Implementa método de la interface Trabajador)


****************************************
RELACIONES
****************************************
- Persona       ABSTRACTO   (NO se puede instanciar)
- Trabajador    INTERFACE   (NO se puede instanciar)

- Empleado  ->  Persona, Trabajador
- Gerente   ->  Empleado, Persona, Trabajador
*/
