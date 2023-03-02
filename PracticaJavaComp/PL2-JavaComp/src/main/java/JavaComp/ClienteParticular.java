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
public class ClienteParticular extends Cliente implements Serializable{

    private String DNI;

    /**
     *
     * @param DNI
     * @param nombre
     * @param clave
     * @param correoElectronico
     * @param direccion
     * @param tarjetaCredito
     * @param telefono
     */
    public ClienteParticular(String DNI, String nombre, String clave, String correoElectronico, Direccion direccion, TarjetaCredito tarjetaCredito, String telefono) {
        super(nombre, clave, correoElectronico, direccion, tarjetaCredito, telefono);
        this.DNI = DNI;
    }

    /**
     *
     * @return
     */
    public String getDNI() {
        return DNI;
    }

    /**
     *
     * @param DNI
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + " ClienteParticular{" + "DNI=" + DNI + '}';
    }

}
