/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo5_POO_VehiculosYConductores;

/**
 *
 * @author rubén
 */
public class Conductor {
    
    private String dni;
    private String tipoPermiso;
    private String nombre;

    public Conductor(String dni, String tipoPermiso, String nombre) {
        this.dni = dni;
        this.tipoPermiso = tipoPermiso;
        this.nombre = nombre;
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

    public String getTipoPermiso() {
        return tipoPermiso;
    }

    public void setTipoPermiso(String tipoPermiso) {
        this.tipoPermiso = tipoPermiso;
    }
    @Override 
    public String toString() { 
    return "Conductor{" + "dni=" + dni + ", nombre=" + nombre + ", tipoPermiso=" + tipoPermiso + '}'; }
}
