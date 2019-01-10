package cl.accenture.programatufuturo.proyectofinal.inventario.model;

public class Rol {

    //Atributos de la clase Usuario
    private int idRol;
    private String nombre, descripcion;

    //Constructores

    public Rol() {
        this.idRol = 0;
        this.nombre = "";
        this.descripcion = "";
    }

    public Rol(int idRol, String nombre, String descripcion) {
        this.idRol = idRol;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    //Metodos Get y Set

    public int getIdRol() {
        return this.idRol;
    }

    public void setIdRol(int nuevoIdRol) {
        this.idRol = nuevoIdRol;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String nuevaDescripcion) {
        this.descripcion = nuevaDescripcion;
    }
}
