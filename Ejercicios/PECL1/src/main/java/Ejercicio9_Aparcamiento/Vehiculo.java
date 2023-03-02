package Ejercicio9_Aparcamiento;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Vehiculo {

    private String matricula;
    private LocalDateTime fechaEntrada;
    private boolean abono;

    public Vehiculo(String matricula, boolean abono) {
        this.matricula = matricula;
        this.fechaEntrada = LocalDateTime.now();
        this.abono = abono;
    }

    public Vehiculo(String matricula, LocalDateTime fechaEntrada, boolean abono) {
        this.matricula = matricula;
        this.fechaEntrada = fechaEntrada;
        this.abono = abono;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDateTime getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDateTime hechaEntrada) {
        this.fechaEntrada = hechaEntrada;
    }

    public boolean isAbono() {
        return abono;
    }

    public void setAbono(boolean abono) {
        this.abono = abono;
    }

    public abstract double calcularImporte();

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.matricula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", fechaEntrada=" + fechaEntrada + ", abono=" + abono + '}';
    }
}
