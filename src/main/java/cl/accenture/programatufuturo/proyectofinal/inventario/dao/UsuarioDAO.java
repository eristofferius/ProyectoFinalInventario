package cl.accenture.programatufuturo.proyectofinal.inventario.dao;

import cl.accenture.programatufuturo.proyectofinal.inventario.exception.DriverErrorException;
import cl.accenture.programatufuturo.proyectofinal.inventario.exception.SinConexionException;
import cl.accenture.programatufuturo.proyectofinal.inventario.exception.UsuarioOContraseñaIncorrectos;
import cl.accenture.programatufuturo.proyectofinal.inventario.model.Usuario;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {


    //Se crea atributo para la conexion, dado que sera necesaria para trabajar con los datos y tablas de SQL
    private Conexion conexion;

    //Inicializo esta clase con un constructor que permita la coneccion.
    public UsuarioDAO(){

        this.conexion=new Conexion();
    }

    //Metodo para agregar usuario, en caso de que no exista o no se pueda conectar por algun problema, no realizara nada, solo me indicara el problema.
    public void agregarUsuario(Usuario usuario) throws SinConexionException, DriverErrorException {
        try{
            //Asignaremos esta variable como final, indicando que solo tendra este unico valor, sin que se pueda modificar
            //Consulta en lenguaje SQL
            //Preguntar que referencia hacen los signos de interrogacion.
            //Values los declaro como parametros,
            final String SQL = "INSERT INTO usuario(idUsuario, Nombre, Correo, Password, Rol_idRol,Sucursal_idSucursal)"+ "VALUES(?,?,?,?,?,?)";

            //Creo una variable que al ingresar a la coneccion, me permita agregar los datos cuando se cree una nueva clase de tipo usuario
            PreparedStatement ps= conexion.obtenetConnection().prepareStatement(SQL);
            //Los datos seran agregados y separados por su posicion en la base de datos.
            ps.setInt(1,usuario.getIdUsuario());
            ps.setString(2,usuario.getNombre());
            ps.setString(3,usuario.getCorreo());
            ps.setString(4,usuario.getPassword());
            ps.setInt(5,usuario.getRol().getIdRol());
            ps.setInt(6,usuario.getSucursal().getIdTienda());
            ps.executeUpdate();

            //de haber algun error, se arrojara una exception
        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

    public boolean login(String usuario, String password) throws UsuarioOContraseñaIncorrectos, SQLException, DriverErrorException, SinConexionException {
        try {

            final String SQL = "SELECT * FROM usuario.inventarioPF WHERE Nombre = "+ usuario+ " AND Password = "+password;

            //Creo una variable que al ingresar a la coneccion, me permita agregar los datos cuando se cree una nueva clase de tipo usuario
            PreparedStatement ps= conexion.obtenetConnection().prepareStatement(SQL);
        }catch (SQLException e ) {
            throw new UsuarioOContraseñaIncorrectos("Ocurrio un error al establecer la conexion con el nombre o password : " + e.getMessage(), e);

    }



}
