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
public class EjercicioPropuesto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                // TODO code application logic here
        Scanner entrada = new Scanner(System.in); 
        entrada.useLocale(Locale.US);
        
        int i;
        int factorial=1;
        
        System.out.println("Introduce un numero mayor que 0: ");
        i=entrada.nextInt();
        
        for (int y=0 ; i>y ; i--){
            factorial*=i;
        }
        System.out.println("La suma es: "+factorial);
    }
}
    
