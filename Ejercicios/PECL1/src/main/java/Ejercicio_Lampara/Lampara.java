/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_Lampara;

/**
 *
 * @author Usuario
 */
public class Lampara {

    private boolean encendida;
    private int intensidad;

    public Lampara() {
        this.encendida = false;
        this.intensidad = 0;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    public int getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(int intensidad) {
        if (intensidad >= 0 && intensidad <= 100) {
            this.intensidad = intensidad;
        } else {
            this.intensidad = 0;
        }
    }

    public void setVoltaje(double voltaje) {
        if (voltaje < 1.5) {
            this.intensidad = 0;
        }
        if (voltaje > 12.5) {
            this.intensidad = 100;
        }
        if (voltaje > 1.5 && voltaje < 12.5) {
            this.intensidad = (int) ((int) (100 * voltaje) / 12.5);
        }
    }

    @Override
    public String toString() {
        String luz;
        if (this.encendida) {
            luz = "ON";
        } else {
            luz = "OFF";
        }
        return "Lampara{" + "encendida=" + luz + ", intensidad=" + intensidad + "%" + '}';
    }
}
