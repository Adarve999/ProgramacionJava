package GestionAcademica;

public class Asignatura {

    private String nombre;
    private int creditos;
    private int cuatrimestre;
    private String tipo;
    

    public Asignatura(String nombre, int creditos, int cuatrimestre, String tipo) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.cuatrimestre = cuatrimestre;
        this.tipo = tipo;
    }
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(int cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", creditos=" + creditos + ", cuatrimestre=" + cuatrimestre + ", tipo=" + tipo + '}';
    }

}
