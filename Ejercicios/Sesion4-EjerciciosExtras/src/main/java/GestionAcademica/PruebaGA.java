package GestionAcademica;

public class PruebaGA {

    public static void main(String[] args) {        
        Profesor p1 = new Profesor("CC", "34567890W", "Rosalía", "Escuela Politécnica");
        Profesor p2 = new Profesor("CC", "12345678Z", "Salva", "Escuela Politécnica");
        
        Alumno a1 = new Alumno("GII", "23456789T", "Juan", "Escuela Politécnica");   
        
        Asignatura asig1 = new Asignatura("Fundamentos de Programación", 6, 1, "TRONCAL");
        Asignatura asig2 = new Asignatura("Programación", 6, 2, "TRONCAL");
        
        p1.altaAsignatura(asig1);
        p2.altaAsignatura(asig2);
        
        AsignaturaCursada asig1c = new AsignaturaCursada(asig1);
        AsignaturaCursada asig2c = new AsignaturaCursada(asig2);
        
        a1.altaAsignaturac(asig1c);
        a1.altaAsignaturac(asig2c);
        
        System.out.println("Calificar asignatura 1: " + p1.calificarAsignatura(asig1c, 5, 2));
        System.out.println("Calificar asignatura 2: " + p2.calificarAsignatura(asig2c, 7, 1));
        
        System.out.println("Nota media a1: " + a1.notaMedia() );
        
        System.out.println("Información p1: " + p1.toString());
        
        System.out.println("Información p2: " + p2.toString());
        
        System.out.println("Información a1: " + a1.toString());        
    }
    
}
