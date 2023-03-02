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
public class Cliente implements Serializable, Comparable<Cliente> {

    private String nombre;
    private String clave;
    private String correoElectronico;
    private Direccion direccion;
    private TarjetaCredito tarjetaCredito;
    private String telefono;

    /**
     *
     */
    public Cliente() {
        clave = "admin";
        correoElectronico = "admin@javacomp.com";
        nombre = "administrador";
        direccion=null;
        tarjetaCredito=null;
        telefono=null;

    }

    /**
     *
     * @param nombre
     * @param clave
     * @param correoElectronico
     * @param direccion
     * @param tarjetaCredito
     * @param telefono
     */
    public Cliente(String nombre, String clave, String correoElectronico, Direccion direccion, TarjetaCredito tarjetaCredito, String telefono) {
        this.nombre = nombre;
        this.clave = clave;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
        this.tarjetaCredito = tarjetaCredito;
        this.telefono = telefono;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     *
     * @param correoElectronico
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    /**
     *
     * @return
     */
    public String getClave() {
        return clave;
    }

    /**
     *
     * @param clave
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     *
     * @return
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     *
     * @param direccion
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     *
     * @return
     */
    public TarjetaCredito getTarjetaCredito() {
        return tarjetaCredito;
    }

    /**
     *
     * @param tarjetaCredito
     */
    public void setTarjetaCredito(TarjetaCredito tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    /**
     *
     * @return
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     *
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return """
               Cliente{
                nombre=""" + nombre + " clave=" + clave + " correoElectronico=" + correoElectronico + " direccion=" + direccion + " tarjetaCredito=" + tarjetaCredito + " telefono=" + telefono + '}';
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if ((this.correoElectronico == null) ? (other.correoElectronico != null) : !this.correoElectronico.equals(other.correoElectronico)) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.correoElectronico != null ? this.correoElectronico.hashCode() : 0);
        return hash;
    }

    /**
     *
     * @param o
     * @return
     */
    @Override
    public int compareTo(Cliente o) {
        return this.correoElectronico.compareTo(o.getCorreoElectronico());
    }
}
