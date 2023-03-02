/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_CarnetConducir;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Usuario
 */
public class CarnetConducir {

    private String tipoPermiso;
    private LocalDate fechaExpedicion;

    public CarnetConducir(String tipoPermiso, LocalDate fechaExpedicion) {
        this.tipoPermiso = tipoPermiso;
        this.fechaExpedicion = LocalDate.now();
    }

    public String getTipoPermiso() {
        return tipoPermiso;
    }

    public void setTipoPermiso(String tipoPermiso) {
        this.tipoPermiso = tipoPermiso;
    }

    public LocalDate getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(LocalDate fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public LocalDate fechaCaducidad(int años) {
        return fechaExpedicion.plusYears(años);
    }

    public String toString() {
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "CarnetConducir{" + "tipoPermiso=" + tipoPermiso + ", fechaExpedicion=" + fechaExpedicion.format(formatoCorto) + '}';
    }
}
