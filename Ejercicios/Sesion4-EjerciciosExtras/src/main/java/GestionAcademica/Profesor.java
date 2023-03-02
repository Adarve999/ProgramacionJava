package GestionAcademica;

import java.util.ArrayList;

public class Profesor extends Persona {

    private String departamento;
    private ArrayList<Asignatura> asignaturas;

    public Profesor(String departamento, String dni, String nombre, String direccion) {
        super(dni, nombre, direccion);
        this.departamento = departamento;
        asignaturas = new ArrayList<>();
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    //alta de una asignatura
    public void altaAsignatura(Asignatura asignatura) {
        if (!asignaturas.contains(asignatura)) {
            asignaturas.add(asignatura);
        }
    }

    //baja de una asignatura
    public void bajaAsignatura(Asignatura asignatura) {
        if (asignaturas.contains(asignatura)) {
            asignaturas.remove(asignatura);
        }
    }

    public String calificarAsignatura(AsignaturaCursada asignaturac, double nota, int convocatoria) {
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
        return super.toString() + "#Profesor{" + "departamento=" + departamento + '}'
                + "\nAsignaturas impartidas: " + asignaturas.toString();
    }

}
