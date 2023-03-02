/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cadena_Comercial;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author rubén
 */
public class EmpleadosDestacados extends Empleados {

    private LocalDate tiempoTrabajo;

    /**
     *
     * @param tiempoTrabajo
     * @param nombre
     * @param edad
     * @param apellidos
     * @param importeVentas
     * @param cadenaComercial
     */
    public EmpleadosDestacados(LocalDate tiempoTrabajo, String nombre, int edad, String apellidos, double importeVentas, CadenaComercial cadenaComercial) {
        super(nombre, edad, apellidos, importeVentas, cadenaComercial);
        this.tiempoTrabajo = tiempoTrabajo;
        cadenaComercial.contratarEmpleado(this);
    }

    /**
     *
     * @return
     */
    public LocalDate getTiempoTrabajo() {
        return tiempoTrabajo;
    }

    /**
     *
     * @param tiempoTrabajo
     */
    public void setTiempoTrabajo(LocalDate tiempoTrabajo) {
        this.tiempoTrabajo = tiempoTrabajo;
    }

    /**
     *
     * @return
     */
    @Override
    public double calcularSueldo() {
        LocalDateTime fechaSalida = LocalDateTime.now();
        long años = ChronoUnit.YEARS.between(this.getTiempoTrabajo(), fechaSalida);
        double importeVentas=super.getImporteVentas();
        double sueldo;

        if (importeVentas >= 0 && importeVentas <= 5000) {
            sueldo = (años / 3) * 100 + (1.1 * importeVentas);
        }
        else if (importeVentas > 5000 && importeVentas <= 15000) {
            sueldo = (años / 3) * 100 + (1.15 * importeVentas);
        }
        else if (importeVentas > 15000) {
            sueldo = (años / 3) * 100 + (1.2 * importeVentas);
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
        return super.toString() +"\n ## EmpleadosDestacados{" + "tiempoTrabajo=" + tiempoTrabajo + '}';
    }
}
