/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author rubén
 */
public class EjerciciosModularidad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); 
        entrada.useLocale(Locale.US);
        
        int mayor,menor;
        
        System.out.println("Introduzca el limite inferior:");
        menor=entrada.nextInt();
        System.out.println("Introduzca el limite superior:");
        mayor=entrada.nextInt();
        
        limite(mayor,menor);

    }
    public static void limite(int superior,int inferior){
        if (inferior<superior){
            System.out.println("Números");
            for (int i=inferior; i<= superior;i++){
                System.out.print(i+", ");
            }
        }
        else{
            System.out.println("Los limites estan mal introducidos");
        }
    }
}

