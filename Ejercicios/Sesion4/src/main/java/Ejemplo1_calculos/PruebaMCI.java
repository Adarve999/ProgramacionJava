/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo1_calculos;

/**
 *
 * @author rubén
 */
public class PruebaMCI {
    
    public static void main(String[] args) {
        ModuloCalculoImpl mci = new ModuloCalculoImpl(); 
        System.out.println( mci.multiplica(mci.suma(2, 3), 8) );
    }
    
}
