/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo9_Aparcamiento;

import java.time.LocalDateTime;

/**
 *
 * @author Usuario
 */
public abstract class Vehiculo {

    private String matricula;
    private LocalDateTime fechaHora;
    private boolean abono;

    public Vehiculo(String matricula, boolean abono) {
        this.matricula = matricula;
        this.fechaHora = LocalDateTime.now();
        this.abono = abono;
    }

    public Vehiculo(String matricula, LocalDateTime fechaHora, boolean abono) {
        this.matricula = matricula;
        this.fechaHora = fechaHora;
        this.abono = abono;
    }

    public boolean isAbono() {
        return abono;
    }

    public abstract double calcularImporte();

    public void setAbono(boolean abono) {
        this.abono = abono;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    @Override
    public String toString() {
        return "vehiculo{" + "matricula=" + matricula + ", fechaHora=" + fechaHora + ", abono=" + abono + '}';
    }

}
