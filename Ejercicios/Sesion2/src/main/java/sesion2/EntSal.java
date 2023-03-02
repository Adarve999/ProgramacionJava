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
public class EntSal {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)throws IOException {
        //Objeto para leer una cadena del teclado 
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String nombre;
        int edad;
        double altura;
        
        System.out.println("\n introduce tu nombre:");
        nombre = entrada.readLine();
        
        System.out.println("\nIntroduce tu edad: "); 
        edad = Integer.parseInt(entrada.readLine()); //conversión de cadena a número
        
        System.out.println("\nIntroduce tu altura (en metros): "); //decimal con punto 
        altura = Double.parseDouble(entrada.readLine());
        
        System.out.print(
                "\nTe llamas " + nombre
                + ", tienes " + edad  
                + " años y mides "+ altura + " metros.");   
    }
    
}