package _40_BBDD_conexion_mediante_POO;

public class ConexionSQLite extends ConexionBBDD {

    public ConexionSQLite(String ruta) {
        super("org.sqlite.JDBC", "jdbc:sqlite:" + ruta);
    }

}
