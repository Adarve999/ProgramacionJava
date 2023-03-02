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
public class Profesor extends Persona {

    private String departamento;
    private ArrayList<Asignaturas> asignaturas;

    public Profesor(String departamento, String DNI, String nombre, String direccion) {
        super(DNI, nombre, direccion);
        this.departamento = departamento;
        asignaturas = new ArrayList<>();
    }

    public ArrayList<Asignaturas> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignaturas> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    //alta de una asignatura
    public void altaAsignatura(Asignaturas asignatura) {
        if (!asignaturas.contains(asignatura)) {
            asignaturas.add(asignatura);
        }
    }
    //baja de una asignatura
    public void bajaAsignatura(Asignaturas asignatura) {
        if (asignaturas.contains(asignatura)) {
            asignaturas.remove(asignatura);
        }
    }
  public String calificarAsignatura(AsignaturasCursadas asignaturac, double nota, int convocatoria) {
        asignaturac.setCalificacion(nota);
        asignaturac.setConvocatoria(convocatoria);
        
        if (nota >= 0 && nota < 5) {
            return "SUSPENSO";
        } else if (nota >= 5 && nota < 7) {
            return "APROBADO";
        } else if (nota >= 7 && nota < 9) {
            return "NOTABLE";
        } else if (nota >= 9 && nota <= 10) {
            return "SOBRESALIENTE";
        }
        return "ERROR";
    }   
    
    @Override
    public String toString() {
        return super.toString() + "* Profesor{" + "departamento=" + departamento + '}';
    }

}
