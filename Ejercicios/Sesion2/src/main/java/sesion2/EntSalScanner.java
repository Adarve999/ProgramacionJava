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
public class EntSalScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objeto para leer una cadena del teclado 
        Scanner entrada = new Scanner(System.in); 
        entrada.useLocale(Locale.US); //para introducir los decimales con punto y no con coma
        
        String nombre; 
        int edad; 
        double altura; 
        
        System.out.println("\nIntroduce tu nombre: "); 
        //lectura de un String 
        nombre = entrada.nextLine(); 
        
        System.out.println("\nIntroduce tu edad: "); 
        //lectura de un int 
        edad = entrada.nextInt();
        
        System.out.println("\nIntroduce tu altura (en metros): "); 
        //lectura de un double 
        altura = entrada.nextDouble(); 
            
        System.out.print(
                "\nTe llamas " + nombre+ ", tienes "+ edad + " años y mides "
                + altura + " metros.");
    }
    
}
