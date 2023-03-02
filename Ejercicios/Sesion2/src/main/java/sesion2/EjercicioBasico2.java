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
public class EjercicioBasico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        double radio;
        
        double longitud;
        double area;
        
        System.out.println("\nIntroduce el Radio: "); 
        radio = Double.parseDouble(entrada.readLine());
        
        longitud = Math.round(radio * Math.PI)/1000d;
        area= Math.round(Math.PI * Math.pow(radio,2))/1000d;
        
        System.out.println("\n La longitud es "+ longitud + " y el area es "+area);
    }
    
}
