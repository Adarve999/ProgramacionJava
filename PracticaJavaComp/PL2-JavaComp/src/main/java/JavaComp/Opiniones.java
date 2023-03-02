/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaComp;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author rubén
 */
public class Opiniones implements Serializable {

    private int calificacion;
    private String comentario;
    private LocalDate fechaRealizacion;

    /**
     *
     * @param calificacion
     * @param comentario
     */
    public Opiniones(int calificacion, String comentario) {
        this.calificacion = calificacion;
        this.comentario = comentario;
        fechaRealizacion = LocalDate.now();
    }

    /**
     *
     * @param calificacion
     * @param comentario
     * @param fechaRealizacion
     */
    public Opiniones(int calificacion, String comentario, LocalDate fechaRealizacion) {
        this.calificacion = calificacion;
        this.comentario = comentario;
        this.fechaRealizacion = fechaRealizacion;
    }

    /**
     *
     * @return
     */
    public int getCalificacion() {
        return calificacion;
    }

    /**
     *
     * @param calificacion
     */
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    /**
     *
     * @return
     */
    public String getComentario() {
        return comentario;
    }

    /**
     *
     * @param comentario
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     *
     * @return
     */
    public LocalDate getFechaRealizacion() {
        return fechaRealizacion;
    }

    /**
     *
     * @param fechaRealizacion
     */
    public void setFechaRealizacion(LocalDate fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return """
               / calificacion:""" + calificacion + "\t    / comentario:    " + comentario + "\t / fechaRealizacion:  " + fechaRealizacion;
    }

    /**
     *
     * @param e
     * @return
     */
    public int compareTo(ProductoVenta e) {
        if (e.getOpiniones().getCalificacion() > calificacion) {
            return 1;
        } else if (e.getOpiniones().getCalificacion() == calificacion) {
            return 0;
        } else {
            return -1;
        }
    }
}
