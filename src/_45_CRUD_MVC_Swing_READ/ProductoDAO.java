package _45_CRUD_MVC_Swing_READ;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {

    private final Connection miConexion;

    public ProductoDAO() {
        this.miConexion = ConexionMysql.conectarBBDD();
    }

    // ---------------- READ ----------------
    public List<ProductoModelo> listarProducto() {
        List<ProductoModelo> listaProductos = new ArrayList<>();
        String sql = "SELECT * FROM productos";

        try (Statement st = miConexion.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                rs.toString();
                ProductoModelo producto = new ProductoModelo();
                producto.setId(rs.getInt("id"));

                producto.setNombre(rs.getString("nombre"));
                producto.setCodigo(rs.getString("codigo"));
                producto.setCategoria(rs.getString("categoria"));
                producto.setEstado(rs.getString("estado"));

                producto.setCompra(rs.getBoolean("compra"));
                producto.setVenta(rs.getBoolean("venta"));
                producto.setObsequio(rs.getBoolean("obsequio"));

                producto.setPrecio(rs.getDouble("precio"));
                listaProductos.add(producto);
            }
        } catch (SQLException ex) {
            System.err.println("Error SELECT: " + ex.getMessage());
        }
        return listaProductos;
    }

}
