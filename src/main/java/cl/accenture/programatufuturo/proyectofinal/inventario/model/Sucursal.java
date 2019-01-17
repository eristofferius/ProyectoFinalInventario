package cl.accenture.programatufuturo.proyectofinal.inventario.model;

import java.util.ArrayList;

public class Sucursal {

    //Atributos de la clase Sucursal
    private String ubicacion, comuna, direccion;
    //Para representar la relacion de muchos a muchos con producto se crea una lista, una socursal posee muchos productos
    private ArrayList<Producto> listaProductos;

    //Constructores

    public Sucursal() {
        this.ubicacion = "";
        this.comuna = "";
        this.direccion = "";
        this.listaProductos=new ArrayList<Producto>();
    }

    public Sucursal(String ubicacion, String comuna, String direccion,ArrayList<Producto> productos) {
        this.ubicacion = ubicacion;
        this.comuna = comuna;
        this.direccion = direccion;
        this.listaProductos=productos;
    }

    //Metodos Get y Set


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

    public ArrayList<Producto> getProductos() {
        return this.listaProductos;
    }

    public void setProductos(ArrayList<Producto> nuevaListaProductos) {
        this.listaProductos = nuevaListaProductos;
    }
}
