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
public class ClienteEmpresas extends Cliente implements Serializable{

    private String CIF;
    private String web;

    /**
     *
     * @param CIF
     * @param web
     * @param nombre
     * @param clave
     * @param correoElectronico
     * @param direccion
     * @param tarjetaCredito
     * @param telefono
     */
    public ClienteEmpresas(String CIF, String web, String nombre, String clave, String correoElectronico, Direccion direccion, TarjetaCredito tarjetaCredito, String telefono) {
        super(nombre, clave, correoElectronico, direccion, tarjetaCredito, telefono);
        this.CIF = CIF;
        this.web = web;
    }

    /**
     *
     * @return
     */
    public String getCIF() {
        return CIF;
    }

    /**
     *
     * @param CIF
     */
    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    /**
     *
     * @return
     */
    public String getWeb() {
        return web;
    }

    /**
     *
     * @param web
     */
    public void setWeb(String web) {
        this.web = web;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + " ClienteEmpresas{" + " CIF=" + CIF + "\n web=" + web + '}';
    }

}
