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
public class EjercicioBasico7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); 
        entrada.useLocale(Locale.US);
        
        int i;
        String cadena;
        
        System.out.println("\n Introduce la cadena");
        cadena = entrada.nextLine();        
        
        System.out.println("\n Introduce un entero");
        i = entrada.nextInt();
        
        while(i>0){
            System.out.println(cadena);
            i--;
        }
    }
    
}
