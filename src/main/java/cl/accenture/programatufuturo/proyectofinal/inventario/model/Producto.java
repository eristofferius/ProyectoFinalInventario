package cl.accenture.programatufuturo.proyectofinal.inventario.model;

import java.util.ArrayList;

public class Producto {

    //Atributos de la clase Usuario
    private String nombre, caracteristica;
    private int cantidadMin, cantidadMax, precio;
    private String  marca, categoria;
    //Para representar la relacion de muchos a muchos con producto se crea una lista, una socursal posee muchos productos
    ArrayList<Sucursal> listaSucursales;
    ArrayList<Venta> listaDeVentas;

    //Constructores

    public Producto() {
        this.nombre = "";
        this.caracteristica = "";
        this.cantidadMin = 0;
        this.cantidadMax = 0;
        this.precio = 0;
        this.marca = "";
        this.categoria = "";
        this.listaSucursales= new ArrayList<Sucursal>();
        this.listaDeVentas= new ArrayList<Venta>();
    }


    public Producto(String nombre, String caracteristica, int cantidadMin, int cantidadMax, int precio, String marca, String categoria, ArrayList<Sucursal> sucursales, ArrayList<Venta> listaDeVentas) {
        this.nombre = nombre;
        this.caracteristica = caracteristica;
        this.cantidadMin = cantidadMin;
        this.cantidadMax = cantidadMax;
        this.precio = precio;
        this.marca = marca;
        this.categoria = categoria;
        this.listaSucursales= sucursales;
        this.listaDeVentas= listaDeVentas;
    }

    public Producto(String nombre, String caracteristica, int cantidadMin, int cantidadMax, int precio, String marca, String categoria) {
        this.nombre = nombre;
        this.caracteristica = caracteristica;
        this.cantidadMin = cantidadMin;
        this.cantidadMax = cantidadMax;
        this.precio = precio;
        this.marca = marca;
        this.categoria = categoria;
    }


    //Metodos Get y Set

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

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String nuevaCategoria) {
        this.categoria = categoria;
    }

    public ArrayList<Sucursal> getListaSucursales() {
        return this.listaSucursales;
    }

    public void setListaSucursales(ArrayList<Sucursal> nuevaListaSucursales) {
        this.listaSucursales = nuevaListaSucursales;
    }

    public ArrayList<Venta> getListaDeVentas() {
        return this.listaDeVentas;
    }

    public void setListaDeVentas(ArrayList<Venta> listaDeVentas) {
        this.listaDeVentas = listaDeVentas;
    }
}

