/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cadena_Comercial;

/**
 *
 * @author rubén
 */
public class EmpleadosEstandar extends Empleados {

    private double horasTrabajadas;

    /**
     *
     * @param horasTrabajadas
     * @param nombre
     * @param edad
     * @param apellidos
     * @param importeVentas
     * @param cadenaComercial
     */
    public EmpleadosEstandar(double horasTrabajadas, String nombre, int edad, String apellidos, double importeVentas, CadenaComercial cadenaComercial) {
        super(nombre, edad, apellidos, importeVentas, cadenaComercial);
        this.horasTrabajadas = horasTrabajadas;
        cadenaComercial.contratarEmpleado(this);
    }

    /**
     *
     * @return
     */
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    /**
     *
     * @param horasTrabajadas
     */
    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    /**
     *
     * @return
     */
    public double getSueldo() {
        return this.horasTrabajadas * super.getImporteVentas();
    }

    /**
     *
     * @return
     */
    @Override
    public double calcularSueldo() {
        double sueldo;
        double importeVentas = super.getImporteVentas();
        if (importeVentas >= 0 && importeVentas <= 2500) {
            sueldo = (5 * this.horasTrabajadas) + (1.02 * importeVentas);
        } else if (importeVentas > 2500 && importeVentas <= 5000) {
            sueldo = (5 * this.horasTrabajadas) + (1.5 * importeVentas);
        } else if (importeVentas > 5000) {
            sueldo = (5 * this.horasTrabajadas) + (1.1 * importeVentas);
        } else {
            sueldo = 0;
        }
        return sueldo;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + "\n ## EmpleadosEstandar{" + "horasTrabajadas=" + horasTrabajadas + '}';
    }
}
