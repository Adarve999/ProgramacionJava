/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author rubén
 */
public class EjercicioBasico4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        int numero1,numero2;
        // Numero 1
        System.out.println("\n introduzca el primer numero: ");
        numero1 = Integer.parseInt(entrada.readLine());
        // Numero 2
        System.out.println("\n introduzca el primer segundo: ");
        numero2 = Integer.parseInt(entrada.readLine());
        
        if (numero1>numero2){
            System.out.println("\n El mayor es "+numero1
                    +" el menor es "+numero2
            );
            
        }
        if (numero1<numero2){
            System.out.println("\n El mayor es "+numero2
                    +" el menor es "+numero1
            );            
        }
        if (numero1==numero2){
            System.out.println(numero1 + " y "+numero2+" Son iguales");            
        }        
    }
    
}
