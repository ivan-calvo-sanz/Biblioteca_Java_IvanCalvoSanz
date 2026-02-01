package _45_CRUD_MVC_Swing_READ;

import java.util.List;

public class ProductoController {

    private final ProductoDAO productoDAO;

    public ProductoController() {
        this.productoDAO = new ProductoDAO();
    }

    // Controlamos Listar Productos
    public List<ProductoModelo> listar() {
        List<ProductoModelo> listaProductos = this.productoDAO.listarProducto();
        return listaProductos;
    }

}
