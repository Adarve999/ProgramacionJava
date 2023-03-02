/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo8_Taller;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Vehiculo {

    private String matricula;
    private String marca;
    private String modelo;
    private ArrayList<Pieza> pieza;

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.pieza = new ArrayList<>();;
    }

    public void añadirPieza(Pieza pieza) {
        this.pieza.add(pieza);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public ArrayList<Pieza> getPieza() {
        return pieza;
    }

    public void setPieza(ArrayList<Pieza> pieza) {
        this.pieza = pieza;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", pieza=" + pieza + '}';
    }

}
