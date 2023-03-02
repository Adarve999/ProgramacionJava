/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_CarnetConducir;

public class Vehiculo {

    private String matricula;
    private String marca;
    private String modelo;
    private int velocidad;
    private boolean luces;
    private Conductor conductor; //asociación 

    public Vehiculo(String matricula, String marca, String modelo, int velocidad, boolean luces) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.luces = luces;
    }

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isLuces() {
        return luces;
    }

    public void setLuces(boolean luces) {
        this.luces = luces;
    }

    public Conductor getConductor() {
        return conductor;

    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    @Override
    public String toString() {
        String lucestxt = "";
        String conductortxt = "ninguno";
        if (this.luces) {
            lucestxt = "encendidas";
        } else {
            lucestxt = "apagadas";
        }
        if (conductor != null) {
            conductortxt = conductor.toString();
        }
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", velocidad=" + velocidad + ", luces=" + lucestxt + "}" + "\n***** Conductor: " + conductortxt;
    }
}
