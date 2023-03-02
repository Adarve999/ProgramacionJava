/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9_Aparcamiento;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Usuario
 */
public class Camiones extends Vehiculo {

    private int ejes;

    public Camiones(String matricula, boolean abono, int ejes) {
        super(matricula, abono);
        this.ejes = ejes;
    }

    public Camiones(String matricula, LocalDateTime fechaEntrada, boolean abono, int ejes) {
        super(matricula, fechaEntrada, abono);
        this.ejes = ejes;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    @Override
    public double calcularImporte() {
        LocalDateTime fechaSalida = LocalDateTime.now();
        long minutos = ChronoUnit.MINUTES.between(this.getFechaEntrada(), fechaSalida);
        double tasa = 0, total = 0;
        if (ejes <= 3) {
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

    @Override
    public String toString() {
        return super.toString() + "\n # Camiones{" + "ejes=" + ejes + '}';
    }

}
