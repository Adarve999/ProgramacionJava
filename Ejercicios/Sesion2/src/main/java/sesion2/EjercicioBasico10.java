/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion2;
import java.util.Random;

/**
 *
 * @author rubén
 */
public class EjercicioBasico10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand=new Random();
        double Datos[][]= new double[2][12];
        double ganancias=0;
        
        for(int i=0;i<12;i++){
            Datos[0][i]=rand.nextInt(1000,1500);
            Datos[1][i]=rand.nextDouble(0.5,1.5);
        }
        for (int i = 0; i < Datos[0].length; i++) { 
            System.out.print(Datos[0][i] + " - " + Datos[1][i] + "\n");
        }
        for (int i = 0; i < Datos[0].length; i++) { 
            ganancias += Datos[0][i] * Datos[1][i];
        }
        System.out.println("\nGanancias: " + ganancias+" €");
    }
        
    }
    
