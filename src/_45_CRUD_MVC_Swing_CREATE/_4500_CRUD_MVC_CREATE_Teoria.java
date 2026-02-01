package _45_CRUD_MVC_Swing_CREATE;

/* 
* MODELO-VISTA-CONTROLADOR + DAO (MVC + DAO)
* (CREATE) Se programa en sentido Primero el MODELO, DAO, CONTROLADOR finalmente la VISTA
*/

// ============================================================
// MODELO          "ProductoModelo"
// Representa los DATOS de la BBDD, el objeto que viaja por toda la aplicación
//
// (PARA CREATE) 
// 1- Se genera la Clase "ProductoModelo" con sus atributos(mismos que en la BBDD) y sus getter y setters
// ============================================================

// ============================================================
// DAO             "ProductoDAO"
// Interacciona con la BBDD, ejecuta SQL (SELECT / INSERT / UPDATE / DELETE)
//
// (PARA CREATE) 
// 1- Se realiza la conexion a la BBDD
// 2- Metodo registrar (INSERT)
// ============================================================

// ============================================================
// CONTROLADOR      "ProductoController"
// Es el cerebro de la aplicación, decide qué pasa cuando el usuario interacciona con el formulario (Vista)
// Dependiendo del botón pulsado en la VISTA el CONTROLADOR llama al método DAO que necesita pasar por parametro el MODELO
//
// (PARA CREATE) 
// 1- Genera un objeto de la Clase DAO
// 2- Se llama al método registrar de DAO
// ============================================================

// ============================================================
// VISTA            "ProductoVistaRegistrar"
// Es el formulario.
// 1- Boton Registrar -> ActionPerformed
//                       Crear un Objeto del Modelo
//                       Añadir al Objeto Modelo los datos insertados en el formulario
//                       Crear un Objeto de Controller
//                       Llamar al método registrar de Controller
// ============================================================
