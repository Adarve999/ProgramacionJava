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
public class EjercicioBasico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        int numero;
        System.out.println("\n Introduce el numero: ");
        numero = Integer.parseInt(entrada.readLine());
        
        if (numero%2==0){
            System.out.println(numero+ " es par.");
        }
        else{
            System.out.println(numero+ " es impar.");
        }
    }
    
}
