/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_Taller;

import Ejercicio_Empleados.Empleado;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Vehiculo {

    private String matricula;
    private String modelo;
    private String marca;
    private ArrayList<Pieza> piezas;

    public Vehiculo(String matricula, String modelo, String marca) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
        piezas = new ArrayList<>();
    }

    public ArrayList<Pieza> getPiezas() {
        return piezas;
    }

    public void setPiezas(ArrayList<Pieza> piezas) {
        this.piezas = piezas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void altaPieza(Pieza pie) {
        if (!piezas.contains(pie)) {
            piezas.add(pie);
        }
    }
    
    public void bajaPieza(Pieza pie) {
        if (piezas.contains(pie)) {
            piezas.remove(pie);
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", modelo=" + modelo + ", marca=" + marca + ", piezas=" + piezas + '}';
    }

}
