/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_CarnetConducir;

public class Conductor {

    private String dni;
    private String nombre;
    private CarnetConducir carnet;

    public Conductor(String dni, String nombre, CarnetConducir carnet) {
        this.dni = dni;
        this.nombre = nombre;
        this.carnet = carnet;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public CarnetConducir getCarnet() {
        return carnet;
    }

    public void setCarnet(CarnetConducir carnet) {
        this.carnet = carnet;
    }

    @Override
    public String toString() {
        return "Conductor{" + "dni=" + dni + ", nombre=" + nombre + ", carnet=" + carnet + '}';
    }

}
