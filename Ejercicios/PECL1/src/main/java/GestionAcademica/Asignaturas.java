/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionAcademica;

/**
 *
 * @author Usuario
 */
public class Asignaturas {

    private String nombre;
    private int nCreditos;
    private String cuatrimestre;
    private String tipo;

    public Asignaturas(String nombre, int nCreditos, String cuatrimestre, String tipo) {
        this.nombre = nombre;
        this.nCreditos = nCreditos;
        this.cuatrimestre = cuatrimestre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnCreditos() {
        return nCreditos;
    }

    public void setnCreditos(int nCreditos) {
        this.nCreditos = nCreditos;
    }

    public String getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(String cuatrimestre) {
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
        return "Asignaturas{" + "nombre=" + nombre + ", nCreditos=" + nCreditos + ", cuatrimestre=" + cuatrimestre + ", tipo=" + tipo + '}';
    }

}
