/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion3;

import java.util.*;
import java.util.*;

/**
 *
 * @author Usuario
 */
public class EjerciciosArrays1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); 
        entrada.useLocale(Locale.US);
        
        int numeros[]=new int [110];
        numeros=insercionArray();
        letraArray(numeros);
        
    }
    
    public static int[] insercionArray(){
        int i=0;
        Random rand=new Random();
        int array[]=new int [110];
        while(i!=110){
            array[i]=rand.nextInt(1,500);
            i++;
        }
        Arrays.sort(array);
        return array;
    }
    public static void letraArray(int[] array){
        int i=0;
        while(i!=110){
            if(i%11==0){System.out.println("");}
            else{
                if(array[i]%2==0){System.out.print(array[i]+"p - ");}
                else{System.out.print(array[i]+"i - ");}
                }
        i++;}
    }    
}
    

