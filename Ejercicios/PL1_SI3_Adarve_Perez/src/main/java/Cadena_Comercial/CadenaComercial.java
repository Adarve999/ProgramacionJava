/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cadena_Comercial;

import java.util.ArrayList;

/**
 *
 * @author rubén
 */
public class CadenaComercial {

    private String nombre;
    private String sector;
    private ArrayList<Empleados> empleados;

    /**
     *
     * @param nombre
     * @param sector
     * @param empleados
     */
    public CadenaComercial(String nombre, String sector, ArrayList<Empleados> empleados) {
        this.nombre = nombre;
        this.sector = sector;
        this.empleados = empleados;
    }

    /**
     *
     * @param nombre
     * @param sector
     */
    public CadenaComercial(String nombre, String sector) {
        this.nombre = nombre;
        this.sector = sector;
        empleados = new ArrayList<>();
    }

    /**
     *
     * @return
     */
    public ArrayList<Empleados> getEmpleados() {
        return empleados;
    }

    /**
     *
     * @param empleados
     */
    public void setEmpleados(ArrayList<Empleados> empleados) {
        this.empleados = empleados;
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
    public String getSector() {
        return sector;
    }

    /**
     *
     * @param sector
     */
    public void setSector(String sector) {
        this.sector = sector;
    }

    /**
     *
     * @param emp
     */
    public void contratarEmpleado(Empleados emp) {
        if (!empleados.contains(emp)) {
            empleados.add(emp);
        }
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "CadenaComercial{" + "nombre=" + nombre + ", sector=" + sector + ", empleados=" + empleados.toString() + '}';
    }
}
