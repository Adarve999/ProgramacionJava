/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author rubén
 */
public class EjercicioBasico8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); 
        entrada.useLocale(Locale.US);
        
        int numero=10;
        
        for(int i=1 ; i<=numero ; i++){
            System.out.println("Tabla del "+i);
            for (int r = 1 ; r<=10 ; r++){
                System.out.println(i+" x "+r+" = "+i*r);
            }
            System.out.println("");
        }
    }
    
}
