/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo3_Lampara;

/**
 *
 * @author Usuario
 */
public class Lampara {

    private boolean encendida;

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    private int intensidad;

    public int getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(int intensidad) {
        this.intensidad = intensidad;
    }
    
    public void setIntensidad(double voltaje){
        double resultado;
        if (voltaje<1.5){setIntensidad(0);} //Valor menos que 0
        if (voltaje>12.5){setIntensidad(100);} // Valor mas que 100
        else{
            resultado=(100*voltaje)/12.5;
            
            Double newResultado = resultado;
            int value =newResultado.intValue();
            
            setIntensidad(value);
        }
    }  
    
    public void setIntensidadVoltage(double voltaje){
        double resultado;
        if (voltaje<1.5){setIntensidad(0);} //Valor menos que 0
        if (voltaje>12.5){setIntensidad(100);} // Valor mas que 100
        else{
            resultado=(100*voltaje)/12.5;
            
            Double newResultado = resultado;
            int value =newResultado.intValue();
            
            setIntensidad(value);
        }
    }

    public Lampara(boolean encendida, int intensidad) {
        this.encendida = encendida;
        this.intensidad = intensidad;
    }

    @Override
    public String toString() {
        String iluminacion;
        if (this.encendida){iluminacion="ON";}
        else{iluminacion="OFF";}
        
        return "Lampara{" + "encendida=" + iluminacion + ", intensidad=" + intensidad +"%"+ '}';
    }
    
}
