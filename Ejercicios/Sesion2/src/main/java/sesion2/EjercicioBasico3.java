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
public class EjercicioBasico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        double x1,y1,x2,y2,pendiente;
        
        
        System.out.println("\n Introduce x1: ");
        x1=Double.parseDouble(entrada.readLine());
        
        System.out.println("\n Introduce y1: ");
        y1=Double.parseDouble(entrada.readLine());
        
        System.out.println("\n Introduce x2: ");
        x2=Double.parseDouble(entrada.readLine());
        
        System.out.println("\n Introduce y2: ");
        y2=Double.parseDouble(entrada.readLine());
        
        pendiente =Math.round((y2-y1) / (x2-x1))/1000d;
        
        System.out.println("\n La pendiente de esta recta es "+ pendiente);
    }
    
}
