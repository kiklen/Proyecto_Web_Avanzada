/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatos.beans;

/**
 *
 * @author Admin
 */
public class Producto {
    
    private String nombre, proveedor,descripcion,categoria,imagen;
    private int id_proveedor,id_categoria,cantidad,compra,venta,garantia;

    public Producto(String nombre, String proveedor, String descripcion, String categoria, int cantidad, int compra, int venta, int garantia) {
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.compra = compra;
        this.venta = venta;
        this.garantia = garantia;
    }

    public Producto(String nombre, String descripcion, String imagen, int id_proveedor, int id_categoria, int cantidad, int compra, int venta, int garantia) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.id_proveedor = id_proveedor;
        this.id_categoria = id_categoria;
        this.cantidad = cantidad;
        this.compra = compra;
        this.venta = venta;
        this.garantia = garantia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCompra() {
        return compra;
    }

    public void setCompra(int compra) {
        this.compra = compra;
    }

    public int getVenta() {
        return venta;
    }

    public void setVenta(int venta) {
        this.venta = venta;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
    
    
    
}
