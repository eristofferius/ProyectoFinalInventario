package cl.accenture.programatufuturo.proyectofinal.inventario.model;

public class CategoriaProducto {

    //Atributos de la clase Categoria Producto
    private int idCategoria;
    private String nombre;

    //Constructores

    public CategoriaProducto() {
        this.idCategoria = 0;
        this.nombre = "";
    }

    public CategoriaProducto(int idCategoria, String nombre) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
    }

    //Metodos Get y Set


    public int getIdCategoria() {
        return this.idCategoria;
    }

    public void setIdCategoria(int nuevoIdCategoria) {
        this.idCategoria = nuevoIdCategoria;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
}
