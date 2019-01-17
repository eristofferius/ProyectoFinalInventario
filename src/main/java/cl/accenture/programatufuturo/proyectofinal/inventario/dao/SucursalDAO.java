package cl.accenture.programatufuturo.proyectofinal.inventario.dao;

public class SucursalDAO {
    //Se crea atributo para la conexion, dado que sera necesaria para trabajar con los datos y tablas de SQL
    private Conexion conexion;

    //Inicializo esta clase con un constructor que permita la conexion.

    //CONSTRUCTOR
    public SucursalDAO(Conexion conexion){

        this.conexion=new Conexion();
    }

    // GETTERS Y SETTERS

    public Conexion getConexion() {

        return this.conexion;
    }
    public void setConexion(Conexion conexion) {

        this.conexion = conexion;
    }
}
