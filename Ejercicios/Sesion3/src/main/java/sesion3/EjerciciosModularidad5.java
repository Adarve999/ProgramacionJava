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
public class EjerciciosModularidad5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); 
        entrada.useLocale(Locale.US);
        
        double numero1,numero2,resultado;
        String operacion;
        
        System.out.println("Introduzca la operacion (+,-,*,/):");
        operacion=entrada.nextLine();        
        System.out.println("Introduzca 1º numero:");
        numero1=entrada.nextInt();
        System.out.println("Introduzca 2º numero:");
        numero2=entrada.nextInt();
        
        
        resultado=calculadora(numero1,numero2,operacion);
        System.out.println(numero1+" "+operacion+" "+numero2+" = "+resultado);
    }
    
    public static double calculadora(double n1, double n2,String operacion){
        double resultado=0;
        if("+".equals(operacion)){resultado=n1+n2;}//SUMA
        if("-".equals(operacion)){resultado=n1-n2;}//RESTA
        if("*".equals(operacion)){resultado=n1*n2;}//MULTIPLICACION
        if("/".equals(operacion)){resultado=n1/n2;}//DIVISION
        return resultado;
}
}
    

