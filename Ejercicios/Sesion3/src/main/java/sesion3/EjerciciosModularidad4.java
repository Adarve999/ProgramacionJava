/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjerciciosModularidad4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); 
        entrada.useLocale(Locale.US);
        
        int numero1,numero2,numero3,mayor;
        
        
        System.out.println("Introduzca 1º numero:");
        numero1=entrada.nextInt();
        System.out.println("Introduzca 2º numero:");
        numero2=entrada.nextInt();
        System.out.println("Introduzca 3º numero:");
        numero3=entrada.nextInt();
        
        mayor=esMayor(numero1,numero2);
        mayor=esMayor(numero3,mayor);
        System.out.println("El numero mayor es: "+mayor);

    }
    
    public static int esMayor(int n1, int n2){
        if(n1>n2){
            
        return n1;}
        
        else{
            
            return n2;}
    } 

}
