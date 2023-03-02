/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioPropuesto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner entrada = new Scanner(System.in); 
        entrada.useLocale(Locale.US);
        
        int n,cocciente;
        
        System.out.println("Introduce el numero para saber el numero de cifras: ");
        n=entrada.nextInt();
        
        cocciente=n;
        int cifras=1;
        
        while (cocciente>=10){
            cifras++;
            cocciente=cocciente/10;
        }
        System.out.println("El numero "+n+" tiene "+cifras+" cifras.+");
    }
}
