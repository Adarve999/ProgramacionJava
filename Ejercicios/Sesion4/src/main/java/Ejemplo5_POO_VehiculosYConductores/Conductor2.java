/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo5_POO_VehiculosYConductores;

/**
 *
 * @author rubén
 */
public class Conductor2 {
    
    private String dni;
    private String nombre;
    private final CarnetConducir carnet;

    public Conductor2(String dni, String nombre, CarnetConducir carnet) {
        this.dni = dni;
        this.nombre = nombre;
        this.carnet = carnet;
    }
                
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override 
    public String toString() { 
    return "Conductor{" + "dni=" + dni + ", nombre=" + nombre + ", carnet=" + carnet + '}'; }
}
