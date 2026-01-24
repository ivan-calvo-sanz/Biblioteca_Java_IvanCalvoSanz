package _40_BBDD;

import java.util.Scanner;

public class Main_Comprobacion {

    public static void main(String[] args) {
        // ============================================================
        // COMPRAR FUNCIONAMIENTO DEL CRUD   _4000_BBDD_MySQL_CRUD_Basico
        // RECORDAR DE ACTIVAR Apache y MySQL
        // ============================================================

        _4000_BBDD_MySQL_CRUD_Basico.conectarBBDD();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("""
                               
                    1. Insertar empleado
                    2. Listar empleados
                    3. Actualizar salario
                    4. Eliminar empleado
                    0. Salir
                               
                    """);
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Departamento: ");
                    String dep = sc.nextLine();
                    System.out.print("Salario: ");
                    double sal = sc.nextDouble();
                    _4000_BBDD_MySQL_CRUD_Basico.insertarEmpleado(nombre, dep, sal);
                }
                case 2 ->
                    _4000_BBDD_MySQL_CRUD_Basico.listarEmpleados();
                case 3 -> {
                    System.out.print("ID empleado: ");
                    int id = sc.nextInt();
                    System.out.print("Nuevo salario: ");
                    double sal = sc.nextDouble();
                    _4000_BBDD_MySQL_CRUD_Basico.actualizarSalario(id, sal);
                }
                case 4 -> {
                    System.out.print("ID empleado: ");
                    int id = sc.nextInt();
                    _4000_BBDD_MySQL_CRUD_Basico.eliminarEmpleado(id);
                }
            }
        } while (opcion != 0);

        _4000_BBDD_MySQL_CRUD_Basico.cerrarConexion();
    }
}
