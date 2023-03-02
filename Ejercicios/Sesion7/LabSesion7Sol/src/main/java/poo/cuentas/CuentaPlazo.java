package poo.cuentas;

import java.time.LocalDate;

public class CuentaPlazo extends CuentaAbs {

    private int numAños;

    public CuentaPlazo(String numcuenta, String titular, double saldo, int numAños) {
        super(numcuenta, titular, saldo);
        this.numAños = numAños;
    }

    public CuentaPlazo(String numcuenta, String titular, double saldo, LocalDate fechaApertura, int numAños) {
        super(numcuenta, titular, saldo, fechaApertura);
        this.numAños = numAños;
    }

    @Override
    public double calculaInteres(double saldo) {
        return saldo + (saldo * 0.05);
    }

    public int getNumAños() {
        return numAños;
    }

    public void setNumAños(int numAños) {
        this.numAños = numAños;
    }
}
