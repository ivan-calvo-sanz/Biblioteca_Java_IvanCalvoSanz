package _45_CRUD_MVC_Swing_CREATE;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductoDAO {

    private final Connection miConexion;

    public ProductoDAO() {
        this.miConexion = ConexionMysql.conectarBBDD();
    }

    // ---------------- CREATE ----------------
    public boolean registrarProducto(ProductoModelo productoModelo) {

        String sql = "INSERT INTO productos (nombre, codigo, categoria, compra, venta, obsequio, precio, estado) VALUES (?,?,?,?,?,?,?,?)";

        try (PreparedStatement ps = miConexion.prepareStatement(sql)) {
            ps.setString(1, productoModelo.getNombre());
            ps.setString(2, productoModelo.getCodigo());
            ps.setString(3, productoModelo.getCategoria());
            ps.setString(8, productoModelo.getEstado());

            ps.setBoolean(4, productoModelo.isCompra());
            ps.setBoolean(5, productoModelo.isVenta());
            ps.setBoolean(6, productoModelo.isObsequio());

            ps.setDouble(7, productoModelo.getPrecio());

            ps.executeUpdate();
            System.out.println("PRODUCTO insertado correctamente");
        } catch (SQLException ex) {
            System.err.println("Error INSERT: " + ex.getMessage());
            return false;
        }
        return true;
    }

}
