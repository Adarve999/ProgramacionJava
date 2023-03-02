/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplo5_POO_VehiculosYConductores;

/**
 *
 * @author rubén
 */
public class PruebaVehiculosConductores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo v1 = new Vehiculo("1234 FCD", "Opel", "Astra"); 
        Vehiculo v2 = new Vehiculo("2345 GDT", "BMW", "S1", 80, false); 
        Vehiculo v3 = new Vehiculo("3456 HVF", "Audi", "A3", 100, true); 
        Vehiculo v4 = new Vehiculo("4567 LCD", "Mazda", "CX-30"); 
        
        Conductor c1 = new Conductor("12345678Z", "Pepe", "B"); 
        Conductor c2 = new Conductor("23456789W", "Maria", "B"); 
        
//asignamos conductores con algunos vehículos 
v1.setConductor1(c1); 
v2.setConductor1(c2); 
v1.setVelocidad(50); 
v1.setLuces(true); 
System.out.println(v1.toString()); 

v2.setModelo("X1"); 
System.out.println(v2.toString()); 

v3.setLuces(false); 
System.out.println(v3.toString()); 

//cambiamos el conductor del vehículo 2 
v2.setConductor1(c1); 
System.out.println(v2.toString());

System.out.println(v4.toString()); 
    }
    
}
