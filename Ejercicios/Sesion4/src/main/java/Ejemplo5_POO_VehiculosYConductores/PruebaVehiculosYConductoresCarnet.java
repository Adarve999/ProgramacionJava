/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplo5_POO_VehiculosYConductores;
import java.time.LocalDate; 
import java.time.Month; 
import java.time.format.DateTimeFormatter;
/**
 *
 * @author rubén
 */
public class PruebaVehiculosYConductoresCarnet {

    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo v1 = new Vehiculo("1234 FCD", "Opel", "Astra"); 
        Vehiculo v2 = new Vehiculo("2345 GDT", "BMW", "S1", 80, false); 
        Vehiculo v3 = new Vehiculo("3456 HVF", "Audi", "A3", 100, true);
        
        //creamos los carnets de conducir
        LocalDate f1 = LocalDate.of(2015, Month.MARCH, 12); 
        CarnetConducir cc1 = new CarnetConducir("B", f1); 
        
        LocalDate f2 = LocalDate.of(2018, Month.JULY, 25); 
        CarnetConducir cc2 = new CarnetConducir("B", f2);
        
        //creamos los conductores con sus carnets
        Conductor2 c1 = new Conductor2("12345678Z", "Pepe", cc1); 
        Conductor2 c2 = new Conductor2("23456789W", "Maria", cc2);
        
        //asignamos conductores con algunos vehículos
        v1.setConductor(c1);
        v2.setConductor(c2);
        System.out.println(v1.toString()); 
        System.out.println(v2.toString());
        
        //calculamos la fecha de caducidad de los carnets

        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
        System.out.println("La fecha de caducidad del carnet1 en 10 años es: " + cc1.fechaCaducidad(10).format(formatoCorto)); 
        System.out.println("La fecha de caducidad del carnet2 en 5 años es: " + cc2.fechaCaducidad(5).format(formatoCorto));
        System.out.println(v3);
    }
    
}
