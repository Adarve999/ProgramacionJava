package poo.cuentas;

import java.time.LocalDate;

public class CuentaAhorro extends CuentaAbs {

    private long numTarjCred;

    public CuentaAhorro(String numcuenta, String titular, double saldo, long numTarjCred) {
        super(numcuenta, titular, saldo);
        this.numTarjCred = numTarjCred;
    }

    public CuentaAhorro(String numcuenta, String titular, double saldo, LocalDate fechaApertura, long numTarjCred) {
        super(numcuenta, titular, saldo, fechaApertura);
        this.numTarjCred = numTarjCred;
    }

    @Override
    public double calculaInteres(double saldo) {
        return saldo + (saldo * 0.02);
    }

    public long getNumTarjCred() {
        return numTarjCred;
    }

    public void setNumTarjCred(long numTarjCred) {
        this.numTarjCred = numTarjCred;
    }
}
