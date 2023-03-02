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
public class EjercicioBasico6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); 
        entrada.useLocale(Locale.US);
        
        int hora,minutos,segundos;
        
        System.out.println("\n Introduce la hora: ");
        hora= entrada.nextInt();
        
        System.out.println("\n Introduce los minutos: ");
        minutos= entrada.nextInt();
        
        System.out.println("\n Introduce los segundos: ");
        segundos= entrada.nextInt();
        
        segundos++;
        
        if (segundos>=60){
            minutos++;
            segundos=00;
            System.out.println("\n la hora es ["+hora+":"+minutos+":"+segundos+"]");
        }
        if (minutos>=60){
            hora++;
            minutos=00;
            System.out.println("\n la hora es ["+hora+":"+minutos+":"+segundos+"]");
        }
        if (hora>=24){
            hora=00;
            System.out.println("\n la hora es ["+hora+":"+minutos+":"+segundos+"]");
        }        
    }
    
}
