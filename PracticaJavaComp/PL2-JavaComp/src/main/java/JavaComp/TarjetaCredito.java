/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaComp;

import java.io.Serializable;


/**
 *
 * @author rubén
 */
public class TarjetaCredito implements Serializable {

    private String nombreTitular;
    private String numeroTarjetaTitular;
    private String fechaCaducidad;

    /**
     *
     * @param nombreTitular
     * @param numeroTarjetaTitular
     * @param fechaCaducidad
     */
    public TarjetaCredito(String nombreTitular, String numeroTarjetaTitular, String fechaCaducidad) {
        this.nombreTitular = nombreTitular;
        this.numeroTarjetaTitular = numeroTarjetaTitular;
        this.fechaCaducidad = fechaCaducidad;
    }

    /**
     *
     * @return
     */
    public String getNombreTitular() {
        return nombreTitular;
    }

    /**
     *
     * @param nombreTitular
     */
    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    /**
     *
     * @return
     */
    public String getnumeroTarjetaTitular() {
        return numeroTarjetaTitular;
    }

    /**
     *
     * @param numeroTarjetaTitular
     */
    public void setnumeroTarjetaTitular(String numeroTarjetaTitular) {
        this.numeroTarjetaTitular = numeroTarjetaTitular;
    }

    /**
     *
     * @return
     */
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    /**
     *
     * @param fechaCaducidad
     */
    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return """
               / nombreTitular: """ + nombreTitular + "\t / numero: " + numeroTarjetaTitular + "\t / fechaCaducidad: " + fechaCaducidad;
    }

}
