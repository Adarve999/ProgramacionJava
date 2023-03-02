package GestionAcademica;

public class AsignaturaCursada extends Asignatura {

    private double calificacion;
    private int convocatoria;

    public AsignaturaCursada(Asignatura asignatura) {
        super(asignatura.getNombre(), asignatura.getCreditos(), asignatura.getCuatrimestre(), asignatura.getTipo());
    }   
    
    public AsignaturaCursada(double calificacion, int convocatoria, Asignatura asignatura) {
        super(asignatura.getNombre(), asignatura.getCreditos(), asignatura.getCuatrimestre(), asignatura.getTipo());
        this.calificacion = calificacion;
        this.convocatoria = convocatoria;
    }    
    
    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public int getConvocatoria() {
        return convocatoria;
    }

    public void setConvocatoria(int convocatoria) {
        this.convocatoria = convocatoria;
    }

    @Override
    public String toString() {
        return super.toString() + "\n#AsignaturaCursada{" + "calificacion=" + calificacion + ", convocatoria=" + convocatoria + '}';
    }    
    
}
