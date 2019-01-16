package cl.accenture.programatufuturo.proyectofinal.inventario.model;

public class Usuario {

    //Atributos de la clase Usuario
    private String nombre,rut, correo, password;
    private int rol;
    private Sucursal sucursal;

    //Constructores

    public Usuario() {
        this.nombre = "";
        this.rut="";
        this.correo = "";
        this.password = "";
        this.rol = 0;
        this.sucursal = new Sucursal ();
    }

    public Usuario(String nombre,String rut, String correo, String password, int rol, Sucursal sucursal) {
        this.nombre = nombre;
        this.rut = rut;
        this.correo = correo;
        this.password = password;
        this.rol = rol;
        this.sucursal = sucursal;
    }

    //Metodos Get y Set

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public String getRut() {
        return this.rut;
    }

    public void setRut(String nuevoRut) {
        this.rut = rut;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String nuevoCorreo) {
        this.correo = nuevoCorreo;
    }

    //No existe metodo get para password por tema de seguridad
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String nuevaPassword) {
        this.password = nuevaPassword;
    }

    public int getRol() {

        return this.rol;
    }

    public void setRol(int nuevoRol) {
        this.rol = nuevoRol;
    }

    public Sucursal getSucursal() {
        return this.sucursal;
    }

    public void setSucursal(Sucursal nuevaSucursal) {
        this.sucursal = nuevaSucursal;
    }
}
