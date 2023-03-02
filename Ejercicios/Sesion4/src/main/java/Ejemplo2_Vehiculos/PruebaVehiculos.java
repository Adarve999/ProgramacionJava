/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplo2_Vehiculos;

/**
 *
 * @author Usuario
 */
public class PruebaVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo v1=new Vehiculo("1234 FCD", "Opel", "Astra", 0, false,0);
        Vehiculo v2=new Vehiculo("2345 GDT", "BMW", "S1", 80, false,1);
        Vehiculo v3 = new Vehiculo("3456 HVF", "Audi", "A3", 100, true,3);
        Vehiculo v4 = new Vehiculo("3456 HVF", "Audi", "A3",100,true,6);
        
        System.out.println("--Iniciales--");
        System.out.println(v1.toString());
        System.out.println(v2.toString());
        System.out.println(v3.toString());
        System.out.println(v4.toString());
        
        System.out.println("--Modificados--");
        
        v1.setVelocidad(50);
        v1.setLuces(true);
        System.out.println(v1.toString());
        
        v2.setModelo("X1");
        v2.setMarcha(5);
        System.out.println(v2.toString());
        
        v3.setLuces(false);
        v3.setMarcha(2);
        System.out.println(v3.toString());
        
        v4.setMarcha(7);
        System.out.println(v4.toString());
    }
    
}
