/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplo1_calculos;

/**
 *
 * @author rubén
 */
public class PruebaMCI2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ModuloCalculoImpl2 mci2 = new ModuloCalculoImpl2(); 
        System.out.println( mci2.modulo(mci2.suma(2, 3), 3) );
    }
    
}
