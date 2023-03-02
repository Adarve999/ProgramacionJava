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
public class EjercicioBasico9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); 
        entrada.useLocale(Locale.US);
        
        int i;
        
        System.out.println("\n introduce el entero: ");
        i = entrada.nextInt();
        
        for (int y=1 ; i>=y ; y++){
            for(int r=y ; i>=r ; r++){
                System.out.print("*");
            }
            System.out.println("");
    }
    }
}
