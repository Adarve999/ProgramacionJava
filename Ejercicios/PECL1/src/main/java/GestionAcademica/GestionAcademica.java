/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GestionAcademica;

/**
 *
 * @author Usuario
 */
public class GestionAcademica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Profesor p1 = new Profesor("CC", "34567890W", "Rosalía", "Escuela Politécnica");
        Profesor p2 = new Profesor("CC", "12345678Z", "Salva", "Escuela Politécnica");
        Alumno a1 = new Alumno("GII", "23456789T", "Juan", "Escuela Politécnica");
        Asignaturas asig1 = new Asignaturas("Fundamentos de Programación", 6, "1", "TRONCAL");
        Asignaturas asig2 = new Asignaturas("Programación", 6, "2", "TRONCAL");
        p1.altaAsignatura(asig1);
        p2.altaAsignatura(asig2);
        AsignaturasCursadas asig1c = new AsignaturasCursadas(asig1);
        AsignaturasCursadas asig2c = new AsignaturasCursadas(asig2);
        a1.altaAsignaturac(asig1c);
        a1.altaAsignaturac(asig2c);
        System.out.println("Calificar asignatura 1: " + p1.calificarAsignatura(asig1c, 5, 2));
        System.out.println("Calificar asignatura 2: " + p2.calificarAsignatura(asig2c, 7, 1));
        System.out.println("Nota media a1: " + a1.notaMedia());
        System.out.println("Información p1: " + p1.toString());
        System.out.println("Información p2: " + p2.toString());
        System.out.println("Información a1: " + a1.toString());
    }

}
