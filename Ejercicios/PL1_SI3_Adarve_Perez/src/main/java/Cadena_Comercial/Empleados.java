/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cadena_Comercial;

/**
 *
 * @author rubén
 */
public abstract class Empleados {

    private String nombre;
    private int edad;
    private String apellidos;
    private double importeVentas;
    private CadenaComercial cadenaComercial;

    /**
     *
     * @param nombre
     * @param edad
     * @param apellidos
     * @param importeVentas
     * @param cadenaComercial
     */
    public Empleados(String nombre, int edad, String apellidos, double importeVentas, CadenaComercial cadenaComercial) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellidos = apellidos;
        this.importeVentas = importeVentas;
        this.cadenaComercial = cadenaComercial;
    }

    /**
     *
     * @return
     */
    public CadenaComercial getCadenaComercial() {
        return cadenaComercial;
    }

    /**
     *
     * @param cadenaComercial
     */
    public void setCadenaComercial(CadenaComercial cadenaComercial) {
        this.cadenaComercial = cadenaComercial;
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
     */
    public void Cumpleaños() {
        edad++;
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
    public String getApellidos() {
        return apellidos;
    }

    /**
     *
     * @param apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     *
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     *
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     *
     * @return
     */
    public double getImporteVentas() {
        return importeVentas;
    }

    /**
     *
     * @param importeVentas
     */
    public void setImporteVentas(double importeVentas) {
        this.importeVentas = importeVentas;
    }

    /**
     *
     * @return
     */
    public abstract double calcularSueldo();

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "\nEmpleados{" + "nombre=" + nombre + ", edad=" + edad + ", apellidos=" + apellidos + ", importeVentas=" + importeVentas+'}';
    }

}
