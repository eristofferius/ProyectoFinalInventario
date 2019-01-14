package cl.accenture.programatufuturo.proyectofinal.inventario.dao;

import cl.accenture.programatufuturo.proyectofinal.inventario.exception.SinConexionException;
import cl.accenture.programatufuturo.proyectofinal.inventario.model.Usuario;

public class UsuarioDAO {

    //Se crea atributo para la conexion, dado que sera necesaria para trabajar con los datos y tablas de SQL
    private Conexion conexion;

    //Inicializo esta clase con un constructor que permita la coneccion.
    public UsuarioDAO(){

        this.conexion=new Conexion();
    }

    //Metodo para agregar usuario, en caso de que no exista o no se pueda conectar por algun problema, no realizara nada, solo me indicara el problema.
    public void agregarUsuario(Usuario usuario) throws SinConexionException {
        try{
            //Asignaremos esta variable como final, indicando que solo tendra este unico valor, sin que se pueda modificar
            //Consulta en lenguaje SQL
            //Preguntar que referencia hacen los signos de interrogacion.
            final String SQL = "INSERT INTO usuario(idUsuario, Nombre, Correo, Password, Rol_idRol,Sucursal_idSucursal)"+ "VALUES(?,?,?,?,?,?)";
        }

    }



}
