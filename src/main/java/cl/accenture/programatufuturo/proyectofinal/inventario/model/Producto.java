package cl.accenture.programatufuturo.proyectofinal.inventario.model;

public class Producto {

    //Atributos de la clase Usuario
    private int idProducto, cantidadMin, cantidadMax, precio;
    private String nombre, caracteristica, marca;
    private CategoriaProducto categoria;

    //Constructores

    public Producto() {
        this.idProducto = 0;
        this.cantidadMin = 0;
        this.cantidadMax = 0;
        this.precio = 0;
        this.nombre = "";
        this.caracteristica = "";
        this.marca = "";
        this.categoria = new CategoriaProducto();
    }

    public Producto(int idProducto, int cantidadMin, int cantidadMax, int precio, String nombre, String caracteristica, String marca, CategoriaProducto categoria) {
        this.idProducto = idProducto;
        this.cantidadMin = cantidadMin;
        this.cantidadMax = cantidadMax;
        this.precio = precio;
        this.nombre = nombre;
        this.caracteristica = caracteristica;
        this.marca = marca;
        this.categoria = categoria;
    }

    //Metodos Get y Set

    public int getIdProducto() {
        return this.idProducto;
    }

    public void setIdProducto(int nuevoIdProducto) {
        this.idProducto = nuevoIdProducto;
    }

    public int getCantidadMin() {
        return this.cantidadMin;
    }

    public void setCantidadMin(int nuevaCantidadMin) {
        this.cantidadMin = nuevaCantidadMin;
    }

    public int getCantidadMax() {
        return this.cantidadMax;
    }

    public void setCantidadMax(int nuevaCantidadMax) {
        this.cantidadMax = nuevaCantidadMax;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int nuevoPrecio) {
        this.precio = nuevoPrecio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public String getCaracteristica() {
        return this.caracteristica;
    }

    public void setCaracteristica(String nuevaCaracteristica) {
        this.caracteristica = nuevaCaracteristica;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String nuevaMarca) {
        this.marca = nuevaMarca;
    }

    public CategoriaProducto getCategoria() {
        return this.categoria;
    }

    public void setCategoria(CategoriaProducto nuevaCategoria) {
        this.categoria = nuevaCategoria;
    }
}
