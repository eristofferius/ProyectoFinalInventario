package cl.accenture.programatufuturo.proyectofinal.inventario.model;

public class Sucursal {

    //Atributos de la clase Usuario
    private int idTienda;
    private String ubicacion, comuna, direccion;

    //Constructores

    public Sucursal() {
        this.idTienda = 0;
        this.ubicacion = "";
        this.comuna = "";
        this.direccion = "";
    }

    public Sucursal(int idTienda, String ubicacion, String comuna, String direccion) {
        this.idTienda = idTienda;
        this.ubicacion = ubicacion;
        this.comuna = comuna;
        this.direccion = direccion;
    }

    //Metodos Get y Set

    public int getIdTienda() {
        return this.idTienda;
    }

    public void setIdTienda(int nuevoIdTienda) {

        this.idTienda = idTienda;
    }

    public String getUbicacion() {
        return this.ubicacion;
    }

    public void setUbicacion(String nuevaUbicacion) {
        this.ubicacion = nuevaUbicacion;
    }

    public String getComuna() {
        return this.comuna;
    }

    public void setComuna(String nuevaComuna) {
        this.comuna = nuevaComuna;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String nuevaDireccion) {
        this.direccion = nuevaDireccion;
    }
}
