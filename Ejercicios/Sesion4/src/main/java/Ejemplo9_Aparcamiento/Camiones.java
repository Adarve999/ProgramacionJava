/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo9_Aparcamiento;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Usuario
 */
public class Camiones extends Vehiculo {

    private int numeroEjes;

    public Camiones(int numeroEjes, String matricula, boolean abono) {
        super(matricula, abono);
        this.numeroEjes = numeroEjes;
    }

    public Camiones(int numeroEjes, String matricula, LocalDateTime fechaHora, boolean abono) {
        super(matricula, fechaHora, abono);
        this.numeroEjes = numeroEjes;
    }

    public double calcularImporte() {
        LocalDateTime fechaSalida = LocalDateTime.now();
        long minutos = ChronoUnit.MINUTES.between(this.getFechaHora(), fechaSalida);
        double tasa = 0, total = 0;
        if (numeroEjes <= 3) {
            tasa = 4.5;
        } else {
            tasa = 6.5;
        }
        total = minutos * tasa / 60;
        if (this.isAbono()) {
            total -= (total * 0.4);
        }
        return total;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    @Override
    public String toString() {
        return super.toString() + "Camiones{" + "numeroEjes=" + numeroEjes + '}';
    }
    
}
