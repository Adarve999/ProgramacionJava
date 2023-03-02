/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaComp;

import java.io.Serializable;

/**
 *
 * @author rubén
 */
public class ProductoVenta implements Serializable,Comparable<ProductoVenta> {

    private String titulo;
    private String caracteristicas;
    private String categoria;
    private double precio;
    private String fotografia;
    private int stock;
    private String fechaEntrada;
    private Opiniones opiniones;

    /**
     *
     */
    public ProductoVenta() {
    }

    /**
     *
     * @param titulo
     * @param caracteristicas
     * @param categoria
     * @param precio
     * @param stock
     * @param fechaEntrada
     * @param opiniones
     */
    public ProductoVenta(String titulo, String caracteristicas, String categoria, double precio, int stock, String fechaEntrada, Opiniones opiniones) {
        this.titulo = titulo;
        this.caracteristicas = caracteristicas;
        this.categoria = categoria;
        this.precio = precio;
        this.fotografia = null;
        this.stock = stock;
        this.fechaEntrada = fechaEntrada;
        this.opiniones = opiniones;
    }
// para dar de alta un producto si es nuevo no puede tener ninguna opinion

    /**
     *
     * @param titulo
     * @param caracteristicas
     * @param categoria
     * @param precio
     * @param stock
     * @param fechaEntrada
     */
    public ProductoVenta(String titulo, String caracteristicas, String categoria, double precio, int stock, String fechaEntrada) {
        this.titulo = titulo;
        this.caracteristicas = caracteristicas;
        this.categoria = categoria;
        this.precio = precio;
        this.fotografia = null;
        this.stock = stock;
        this.fechaEntrada = fechaEntrada;
        opiniones = null;
    }

    /**
     *
     * @return
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     *
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     *
     * @return
     */
    public String getCaracteristicas() {
        return caracteristicas;
    }

    /**
     *
     * @param caracteristicas
     */
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    /**
     *
     * @return
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     *
     * @param categoria
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     *
     * @return
     */
    public double getPrecio() {
        return precio;
    }

    /**
     *
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     *
     * @return
     */
    public String getFotografia() {
        return fotografia;
    }

    /**
     *
     * @param fotografia
     */
    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    /**
     *
     * @return
     */
    public int getStock() {
        return stock;
    }

    /**
     *
     * @param stock
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     *
     * @return
     */
    public String getFechaEntrada() {
        return fechaEntrada;
    }

    /**
     *
     * @param fechaEntrada
     */
    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    /**
     *
     * @return
     */
    public Opiniones getOpiniones() {
        return opiniones;
    }

    /**
     *
     * @param opiniones
     */
    public void setOpiniones(Opiniones opiniones) {
        this.opiniones = opiniones;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return """
                titulo: """ + titulo + "     caracteristicas: " + caracteristicas + "        categoria: " + categoria + "        fecha Entrada: " + fechaEntrada +"       calificacion: "+ getOpiniones().getCalificacion()+"         precio: " + precio + "     stock: " + stock;
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProductoVenta other = (ProductoVenta) obj;
        if ((this.titulo == null) ? (other.titulo != null) : !this.titulo.equals(other.titulo)) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.titulo != null ? this.titulo.hashCode() : 0);
        return hash;
    }

    /**
     *
     * @param o
     * @return
     */
    @Override
    public int compareTo(ProductoVenta o) {
        return this.titulo.compareTo(o.getTitulo());
    }
    
}
