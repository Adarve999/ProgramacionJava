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
public class EjerciciosArrays3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); 
        entrada.useLocale(Locale.US);
        
        int dni;
        String letra;
        
        System.out.println("Introduce los numeros del DNI(8 digitos):");
        dni=entrada.nextInt();

        letra=averiguarLetra(dni);
        System.out.println(String.valueOf(dni)+"-"+letra);
    }
    
    public static String averiguarLetra(int identidad){
        String clave[]={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        int resultado=identidad%23;
        String letraDni = clave[resultado];    
        return letraDni;}
}
