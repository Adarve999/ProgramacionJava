package GestionAcademica;

import java.util.ArrayList;

public class Alumno extends Persona {

    private String titulacion;
    private ArrayList<AsignaturaCursada> asignaturasc;

    public Alumno(String titulacion, String dni, String nombre, String direccion) {
        super(dni, nombre, direccion);
        this.titulacion = titulacion;
        asignaturasc = new ArrayList<>();
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public ArrayList<AsignaturaCursada> getAsignaturasc() {
        return asignaturasc;
    }

    //alta de una asignatura cursada
    public void altaAsignaturac(AsignaturaCursada asignaturac) {
        if (!asignaturasc.contains(asignaturac)) {
            asignaturasc.add(asignaturac);
        }
    }

    //baja de una asignatura cursada
    public void bajaAsignaturac(AsignaturaCursada asignaturac) {
        if (asignaturasc.contains(asignaturac)) {
            asignaturasc.remove(asignaturac);
        }
    }

    public double notaMedia() {
        double media = 0;
        double notas = 0;
        for (AsignaturaCursada asignaturac : asignaturasc) {
            notas += asignaturac.getCalificacion();
        }
        return media = notas / asignaturasc.size();
    }

    @Override
    public String toString() {
        return super.toString() + "\n#Alumno{" + "titulacion=" + titulacion + '}'
                + "\nAsignaturas cursadas: " + asignaturasc.toString();
    }

}
