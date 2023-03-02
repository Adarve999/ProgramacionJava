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
public class Automoviles extends Vehiculo {

    private String tipo;

    public Automoviles(String tipo, String matricula, boolean abono) {
        super(matricula, abono);
        this.tipo = tipo;
    }

    public Automoviles(String matricula, LocalDateTime fechaHora, boolean abono) {
        super(matricula, fechaHora, abono);
    }

    public String getTipo() {
        return tipo;
    }

    public double calcularImporte() {
        LocalDateTime fechaSalida = LocalDateTime.now();
        long minutos = ChronoUnit.MINUTES.between(this.getFechaHora(), fechaSalida);
        double tasa = 0, total = 0;
        switch (tipo) {
            case "turismo":
                tasa = 1.5;
                break;
            case "todoterreno":
                tasa = 2.5;
                break;
            case "furgoneta":
                tasa = 3.5;
                break;
        }
        total = minutos * tasa / 60;
        if (this.isAbono()) {
            total -= (total * 0.4);
        }
        return total;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString()+ "Automoviles{" + "tipo=" + tipo + '}';
    }

}
