package _45_CRUD_MVC_Swing_CREATE;

public class ProductoController {

    private final ProductoDAO productoDAO;

    public ProductoController() {
        this.productoDAO = new ProductoDAO();
    }

    public boolean registrar(ProductoModelo productoModelo) {
        boolean respuesta = this.productoDAO.registrarProducto(productoModelo);
        return respuesta;
    }

}
