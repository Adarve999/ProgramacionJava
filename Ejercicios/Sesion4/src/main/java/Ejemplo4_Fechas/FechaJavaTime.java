/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplo4_Fechas;
import java.time.LocalDateTime; 
import java.time.Month; 
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author Usuario
 */
public class FechaJavaTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDateTime hoy = LocalDateTime.now();
        System.out.println("La fecha de hoy completa es: " + hoy);
        
        // Cambiamos el formato
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy:HH:mm");
        System.out.println("Hoy es (formato corto)" + hoy.format(formatoCorto));
        
        //Establecemos una fecha
        LocalDateTime diaHora = LocalDateTime.of(2010, Month.FEBRUARY, 25, 10, 59, 59); 
        System.out.println("La fecha establecida: " + diaHora);
        
        diaHora = diaHora.plusMonths(1).minusDays(5).minusHours(3); 
        System.out.println("La fecha modificada: " + diaHora);
        
        //diferencia entre fechas
        long dias = ChronoUnit.DAYS.between(diaHora, hoy); 
        System.out.println("días: " + dias);
    } 
}
