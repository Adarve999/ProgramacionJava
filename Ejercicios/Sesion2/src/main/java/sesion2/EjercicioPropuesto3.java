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
public class EjercicioPropuesto3 {
    
    public static boolean esTriangulo(double y, double x1, double x2){
    return (y > Math.abs(x1 - x2)) && (y < (x1 + x2)); 
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); 
        entrada.useLocale(Locale.US);
        
        double x1,x2,y;
        
        System.out.println("Introduce lado a: ");
        y = entrada.nextDouble();
        
        System.out.println("Introduce lado b: ");
        x1 = entrada.nextDouble();
        
        System.out.println("Introduce lado c: ");
        x2 = entrada.nextDouble();
        
if (esTriangulo(y,x1,x2)) {
    System.out.println("Existe un triángulo con lados "+y+","+x1+","+x2);
}
else{
    System.out.println("NO se puede construir un triangulo con lados "+y+","+x1+","+x2);}
    }
}

