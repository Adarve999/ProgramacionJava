/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo8_Taller;

/**
 *
 * @author Usuario
 */
public class Taller {

    private String nombre;
    private double precioHora;
    private String telefono;

    public Taller(String nombre, String telefono, double precioHora) {
        this.nombre = nombre;
        this.precioHora = precioHora;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public double repararVehiculo(Vehiculo car, double horas) {
        double precio = 0;
        for (int i = 0; i < car.getPieza().size(); i++) {
            precio += car.getPieza().get(i).getPrecio();
        }
        return precio;
    }

    @Override
    public String toString() {
        return "Taller{" + "nombre=" + nombre + ", telefono=" + telefono + ", precioHora=" + precioHora + '}';
    }
}
