package GestionAcademica;

public class AsignaturasCursadas extends Asignaturas {

    private double calificacion;
    private int convocatoria;

    public AsignaturasCursadas(Asignaturas asignaturas) {
        super(asignaturas.getNombre(), asignaturas.getnCreditos(), asignaturas.getCuatrimestre(),asignaturas.getTipo());
    }

    public AsignaturasCursadas(double calificacion, int convocatoria,Asignaturas asignaturas) {
        super(asignaturas.getNombre(), asignaturas.getnCreditos(), asignaturas.getCuatrimestre(),asignaturas.getTipo());
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
        return super.toString() + "\n# AsignaturasCursadas{" + "calificacion=" + calificacion + ", convocatoria=" + convocatoria + '}';
    }

}
