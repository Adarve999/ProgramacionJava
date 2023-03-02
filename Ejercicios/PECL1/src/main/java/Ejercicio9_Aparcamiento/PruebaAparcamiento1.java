/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio9_Aparcamiento;

/**
 *
 * @author Usuario
 */
public class PruebaAparcamiento1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automoviles a1 = new Automoviles("1111-AAA", true, "turismo");
        Automoviles a2 = new Automoviles("2222-BBB", false, "todoterreno");
        Automoviles a3 = new Automoviles("3333-CCC", false, "furgoneta");
        Camiones c1 = new Camiones("4444-DDD", true, 4);
        Camiones c2 = new Camiones("5555-EEE", false, 3);
        Camiones c3 = new Camiones("6666-FFF", false, 5);

        System.out.println(Aparcamiento.intoducirVehiculo(a1));
        System.out.println(Aparcamiento.intoducirVehiculo(a2));
        System.out.println(Aparcamiento.intoducirVehiculo(a3));

        System.out.println(Aparcamiento.intoducirVehiculo(c1));
        System.out.println(Aparcamiento.intoducirVehiculo(c2));
        System.out.println(Aparcamiento.intoducirVehiculo(c3));

        System.out.println("Vehículos: " + Aparcamiento.getMatriculasVehiculos().toString());
        
        System.out.println(Aparcamiento.sacarVehiculo(a1));
        System.out.println("Vehículos: " + Aparcamiento.getMatriculasVehiculos().toString());
        
        System.out.println(Aparcamiento.sacarVehiculo(a2));
        System.out.println("Vehículos: " + Aparcamiento.getMatriculasVehiculos().toString());
        
        System.out.println(Aparcamiento.sacarVehiculo(a3));
        System.out.println("Vehículos: " + Aparcamiento.getMatriculasVehiculos().toString());
        
        System.out.println(Aparcamiento.sacarVehiculo(c1));
        System.out.println("Vehículos: " + Aparcamiento.getMatriculasVehiculos().toString());
        
        System.out.println(Aparcamiento.sacarVehiculo(c2));
        System.out.println("Vehículos: " + Aparcamiento.getMatriculasVehiculos().toString());
        
        System.out.println(Aparcamiento.sacarVehiculo(c3));
        System.out.println("Vehículos: " + Aparcamiento.getMatriculasVehiculos().toString());
    }

}
