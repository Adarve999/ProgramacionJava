/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_Lampara;

/**
 *
 * @author Usuario
 */
public class PruebaLampara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lampara L1 = new Lampara();
        Lampara L2 = new Lampara();
        Lampara L3 = new Lampara();
        Lampara L4 = new Lampara();

        L1.setIntensidad(20);
        System.out.println(L1.toString());
        L1.setVoltaje(13);
        System.out.println(L1.toString());
        L1.setVoltaje(8);
        System.out.println(L1.toString());
        L2.setEncendida(true);
        System.out.println(L2.toString());
        System.out.println(L3.toString());
    }

}
