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
public class EjercicioPropuesto6 {
    public static boolean esBisiesto(int año){
        if ((año%4 == 0) && ((año%100 != 0) || (año%1000 == 0))){return true;}
        else{return false;}
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia,año;
        String mes;
        
        Scanner entrada = new Scanner(System.in); 
        entrada.useLocale(Locale.US);
        
        System.out.println("Introduce el mes: ");
        mes=entrada.nextLine();
        System.out.println("Introduce el dia: ");
        dia=entrada.nextInt();
        System.out.println("Introduce el año: ");
        año=entrada.nextInt();
        
        if (esBisiesto(año)){
            System.out.println("el año es bisiesto: "+dia+"/"+mes+"/"+año);
        }
        else {
          System.out.println("el año introducido no es bisiesto.");  
        }
        
    }

}