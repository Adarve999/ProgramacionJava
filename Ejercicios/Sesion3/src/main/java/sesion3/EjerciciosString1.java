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
public class EjerciciosString1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); 
        entrada.useLocale(Locale.US);
        
        String palabra;
        int veces;
        
        System.out.println("Introduzca la palabra:");
        palabra=entrada.nextLine();
        
        System.out.println("Introduzca las veces a rotar:");
        veces=entrada.nextInt();
        
        daVuelta(palabra,veces);
    }
    
    public static void daVuelta(String palabra,int rotar){
        for(int i=0;i<rotar;i++){

            palabra=palabra.charAt(palabra.length()-1)+ palabra.substring(0,palabra.length()-1);
            
        }
        System.out.println(palabra);}        
    
}
    

