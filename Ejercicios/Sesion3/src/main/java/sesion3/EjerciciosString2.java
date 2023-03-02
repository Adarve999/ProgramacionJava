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
public class EjerciciosString2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); 
        entrada.useLocale(Locale.US);
        
        String palabra,letra;

        
        System.out.println("Introduzca la palabra:");
        palabra=entrada.nextLine();
        
        System.out.println("Introduzca la letra para saber la posicion:");
        letra=entrada.nextLine();
        
        if (existe(obtenerPosicion(palabra,letra))){
        System.out.println(letra+", se encuentra en la posicion--> "+obtenerPosicion(palabra,letra));}
        else{
            System.out.println("La letra no esta en la cadena que estas buscando.");
        }
        
    }
    
    public static int obtenerPosicion(String palabra,String pos){
        return palabra.indexOf(pos);}
    
    public static boolean existe(int numero){
        return numero!=-1;
    }
}    
    

