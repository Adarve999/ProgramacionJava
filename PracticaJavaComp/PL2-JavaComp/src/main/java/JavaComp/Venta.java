/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaComp;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author rubén
 */
public class Venta implements Serializable{

    private LocalDate FechaVenta;
    private ProductoVenta producto;
    private Cliente comprador;
    private int cantidad;

    /**
     *
     * @param producto
     * @param comprador
     */
    public Venta(ProductoVenta producto, Cliente comprador) {
        this.producto = producto;
        this.comprador = comprador;
        FechaVenta = LocalDate.now();
    }

    /**
     *
     * @return
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     *
     * @param cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     *
     * @return
     */
    public LocalDate getFechaVenta() {
        return FechaVenta;
    }

    /**
     *
     * @param FechaVenta
     */
    public void setFechaVenta(LocalDate FechaVenta) {
        this.FechaVenta = FechaVenta;
    }

    /**
     *
     * @return
     */
    public Cliente getComprador() {
        return comprador;
    }

    /**
     *
     * @param comprador
     */
    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    /**
     *
     * @return
     */
    public ProductoVenta getProducto() {
        return producto;
    }

    /**
     *
     * @param producto
     */
    public void setProducto(ProductoVenta producto) {
        this.producto = producto;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Venta{" + "FechaVenta=" + FechaVenta + ", producto=" + producto + ", comprador=" + comprador + ", cantidad=" + cantidad + '}';
    }

 

}
