package _40_BBDD;

import java.sql.*;

public class _4000_BBDD_MySQL_CRUD_Basico {

    private static Connection miConexion;
    final static String SERVIDOR = "localhost";
    final static int PUERTO = 3306;
    final static String BASE_DATOS = "empleados_departamentos";
    final static String USUARIO = "root";
    final static String CLAVE = "";

    // ---------------- CONEXIÓN ----------------
    public static Connection conectarBBDD() {
        try {
            //Conexion mysql
            miConexion = DriverManager.getConnection("jdbc:mysql://" + SERVIDOR + ":" + PUERTO + "/" + BASE_DATOS + "?" + "user=" + USUARIO + "&password=" + CLAVE);
            //Conexion mariadb
            //miConexion = DriverManager.getConnection("jdbc:mariadb://" + SERVIDOR + ":" + PUERTO + "/" + BASE_DATOS + "?" + "user=" + USUARIO + "&password=" + CLAVE);
            System.out.println("Conexion correcta a la BBDD " + BASE_DATOS);
        } catch (SQLException ex) {
            System.err.println("Se ha producido un problema en la conexion. [Codigo]:" + ex.getErrorCode() + " [Error]:" + ex.getMessage());
        }
        return miConexion;
    }

    // ------------- CERRAR CONEXIÓN ------------
    public static void cerrarConexion() {
        try {
            if (miConexion != null && !miConexion.isClosed()) {
                miConexion.close();
                System.out.println("Desconexion de la BBDD realizada correctamente");
            } else {
                System.out.println("La conexion no ha sido realizada");
            }
        } catch (SQLException ex) {
            System.err.println("No se ha podido cerrar la conexion con la BBDD: " + ex.getErrorCode() + " " + ex.getMessage());
        }
    }

    // ---------------- CREATE ----------------
    public static void insertarEmpleado(String nombre, String departamento, double salario) {
        String sql = "INSERT INTO empleados (nombre, departamento, salario) VALUES (?, ?, ?)";

        try (PreparedStatement ps = miConexion.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setString(2, departamento);
            ps.setDouble(3, salario);
            ps.executeUpdate();
            System.out.println("Empleado insertado correctamente");
        } catch (SQLException ex) {
            System.err.println("Error INSERT: " + ex.getMessage());
        }
    }

    // ---------------- READ ----------------
    public static void listarEmpleados() {
        String sql = "SELECT * FROM empleados";

        try (Statement st = miConexion.createStatement(); ResultSet rs = st.executeQuery(sql)) {

            System.out.println("\nID | NOMBRE | DEPARTAMENTO | SALARIO");
            System.out.println("------------------------------------");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | "
                        + rs.getString("nombre") + " | "
                        + rs.getString("departamento") + " | "
                        + rs.getDouble("salario")
                );
            }
        } catch (SQLException ex) {
            System.err.println("Error SELECT: " + ex.getMessage());
        }
    }

    // ---------------- UPDATE ----------------
    public static void actualizarSalario(int id, double nuevoSalario) {
        String sql = "UPDATE empleados SET salario = ? WHERE id = ?";

        try (PreparedStatement ps = miConexion.prepareStatement(sql)) {
            ps.setDouble(1, nuevoSalario);
            ps.setInt(2, id);
            ps.executeUpdate();
            System.out.println("Salario actualizado");
        } catch (SQLException ex) {
            System.err.println("Error UPDATE: " + ex.getMessage());
        }
    }

    // ---------------- DELETE ----------------
    public static void eliminarEmpleado(int id) {
        String sql = "DELETE FROM empleados WHERE id = ?";

        try (PreparedStatement ps = miConexion.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Empleado eliminado");
        } catch (SQLException ex) {
            System.err.println("Error DELETE: " + ex.getMessage());
        }
    }

}
