package _45_CRUD_MVC_Swing_READ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMysql {

    private static Connection miConexion;
    final static String SERVIDOR = "localhost";
    final static int PUERTO = 3306;
    final static String BASE_DATOS = "crud_java_swing";
    final static String USUARIO = "root";
    final static String CLAVE = "";

    // ---------------- CONEXIÓN ----------------
    public static Connection conectarBBDD() {
        try {
            //Conexion mysql
            miConexion = DriverManager.getConnection("jdbc:mysql://" + SERVIDOR + ":" + PUERTO + "/" + BASE_DATOS + "?" + "user=" + USUARIO + "&password=" + CLAVE);
            //Conexion mariadb
            //miConexion = DriverManager.getConnection("jdbc:mariadb://" + SERVIDOR + ":" + PUERTO + "/" + BASE_DATOS + "?" + "user=" + USUARIO + "&password=" + CLAVE);
            if (miConexion != null) {
                System.out.println("Conexion correcta a la BBDD " + BASE_DATOS);
            }
        } catch (SQLException ex) {
            System.err.println("Se ha producido un problema en la conexion. [Codigo]:" + ex.getErrorCode() + " [Error]:" + ex.getMessage());
        }
        return miConexion;
    }

}
