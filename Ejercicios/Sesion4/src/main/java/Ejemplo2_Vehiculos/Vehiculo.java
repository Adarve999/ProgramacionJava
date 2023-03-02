/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo2_Vehiculos;

/**
 *
 * @author Usuario
 */
public class Vehiculo {
    
    private String Matricula;

    
    public String getMatricula() {
        return Matricula;
    }


    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    private String marca;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    private String modelo;


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private int velocidad;


    public int getVelocidad() {
        return velocidad;
    }


    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    private boolean luces;


    public boolean isLuces() {
        return luces;
    }


    public void setLuces(boolean luces) {
        this.luces = luces;
    }

    private int marcha;

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        if (marcha<0 || marcha >5){
            this.marcha=0;
        }
        else{
            this.marcha=marcha;
        }
        if(this.marcha==0){velocidad=0;}
        if(this.marcha==1){setVelocidad(10);}
        if(this.marcha==2){setVelocidad(30);}
        if(this.marcha==3){setVelocidad(60);}
        if(this.marcha==4){setVelocidad(90);}
        if(this.marcha==5){setVelocidad(120);}
    }

    public Vehiculo(String Matricula, String marca, String modelo, int velocidad, boolean luces,int marcha) {
        this.Matricula = Matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.luces = luces;
        this.marcha=marcha;
    }

    public Vehiculo(String Matricula, String marca, String modelo) {
        this.Matricula = Matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.marcha=0;
    }

    @Override
    public String toString() {
        String lucestxt = ""; 
        if (this.luces) { 
            lucestxt = "luces encendidas"; } 
        else { lucestxt = "luces apagadas"; }       
        
        return "Vehiculo{" + "matricula=" + Matricula + ", marca=" + marca + ", modelo=" + modelo + ", velocidad=" + velocidad + ", luces=" + lucestxt +",marcha="+marcha+ '}';
    }

}
