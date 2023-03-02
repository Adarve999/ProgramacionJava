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
public class EjercicioBasico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        double numero;
        
        System.out.println("\nIntroduce el numero: "); 
        numero = Double.parseDouble(entrada.readLine());
        
        double parteDecimal = numero%1;
        double parteEntera = numero-parteDecimal;
        
        
        if (parteDecimal>=0.5){
            parteEntera++;
            System.out.println("\n El Numero es "+parteEntera);
        }
        else{
            System.out.println("\n El Numero es "+parteEntera);
        }
        
        
    }
    
}
