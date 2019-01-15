package cl.accenture.programatufuturo.proyectofinal.inventario.model;

public class Usuario {

    //Atributos de la clase Usuario
    private int idUsuario;
    private String nombre, correo, password;
    private Rol rol;
    private Sucursal sucursal;

    //Constructores

    public Usuario() {
        this.idUsuario = 0;
        this.nombre = "";
        this.correo = "";
        this.password = "";
        this.rol = new Rol();
        this.sucursal = new Sucursal ();
    }

    public Usuario(int idUsuario, String nombre, String correo, String password, Rol rol, Sucursal sucursal) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.rol = rol;
        this.sucursal = sucursal;
    }

    //Metodos Get y Set
    public int getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(int nuevoIdUsuario) {
        this.idUsuario = nuevoIdUsuario;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
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

    public Rol getRol() {
        return this.rol;
    }

    public void setRol(Rol nuevoRol) {
        this.rol = nuevoRol;
    }

    public Sucursal getSucursal() {
        return this.sucursal;
    }

    public void setSucursal(Sucursal nuevaSucursal) {
        this.sucursal = nuevaSucursal;
    }
}
