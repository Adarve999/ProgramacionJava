/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionAcademica;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Alumno extends Persona {

    private String titulacion;
    private ArrayList<AsignaturasCursadas> asignaturasc;

    public Alumno(String titulacion, String DNI, String nombre, String direccion) {
        super(DNI, nombre, direccion);
        this.titulacion = titulacion;
        asignaturasc = new ArrayList<>();
    }

    public ArrayList<AsignaturasCursadas> getAsignaturasc() {
        return asignaturasc;
    }

    public void setAsignaturasc(ArrayList<AsignaturasCursadas> asignaturasc) {
        this.asignaturasc = asignaturasc;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    // dar de alta una asignatura
    public void altaAsignaturac(AsignaturasCursadas asignaturac) {
        if (!asignaturasc.contains(asignaturac)) {
            asignaturasc.add(asignaturac);
        }
    }

    // dar de baja a una asignatura
    public void bajaAsignaturac(AsignaturasCursadas asignaturac) {
        if (asignaturasc.contains(asignaturac)) {
            asignaturasc.remove(asignaturac);
        }
    }

    public double notaMedia() {
        double media;
        double notas = 0;
        for (AsignaturasCursadas asignaturac : asignaturasc) {
            notas += asignaturac.getCalificacion();
        }
        return media = notas / asignaturasc.size();
    }

    @Override
    public String toString() {
        return super.toString() + "\n # Alumno{" + "titulacion=" + titulacion + '}';
    }

}
