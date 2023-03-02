/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplo3_Lampara;

/**
 *
 * @author Usuario
 */
public class Lamparas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lampara L1=new Lampara(true,12);
        Lampara L2= new Lampara(false,0);
        
        System.out.println(L1.toString());
        System.out.println(L2.toString());
        
        L2.setIntensidadVoltage(0); // Valor minimo <1.5
        System.out.println(L2.toString());
        L2.setIntensidadVoltage(13); // Valor Maximo >12.5
        System.out.println(L2.toString());
        L2.setIntensidadVoltage(4);  // Valor entremedias calculado segun una regla de tres
        System.out.println(L2.toString());
    }
    
}
