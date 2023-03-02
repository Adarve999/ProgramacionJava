/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_Taller;

/**
 *
 * @author Usuario
 */
public class PruebaTaller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Taller t1 = new Taller("T1", "918873642", 15.50);
        Taller t2 = new Taller("T2", "968147850", 20.30);
        Taller t3 = new Taller("T3", "932876642", 30.20);
        Pieza p1 = new Pieza("Correa de distribución", 500.0);
        Pieza p2 = new Pieza("Carburador", 400.0);
        Pieza p3 = new Pieza("Discos de freno", 150.0);
        Pieza p4 = new Pieza("Zapata", 20.0);
        Pieza p5 = new Pieza("Tubo de escape", 250.0);
        Vehiculo v1 = new Vehiculo("1773BTB", "Opel", "Corsa");
        Vehiculo v2 = new Vehiculo("9234CTC", "Ford", "Focus");
        Vehiculo v3 = new Vehiculo("4381CVB", "Mazda", "CX-5");
        Vehiculo v4 = new Vehiculo("4952GZV", "Nissan", "Juke");
        v1.altaPieza(p4);
        v1.altaPieza(p2);
        v2.altaPieza(p1);
        v2.altaPieza(p2);
        v2.altaPieza(p3);
        v2.altaPieza(p4);
        v3.altaPieza(p3);
        v4.altaPieza(p5);
        System.out.println("Coche 1, Taller 2, Reparación: " + t2.repararVehiculo(v1, 5.0));
        System.out.println("Coche 1, Taller 3, Reparación: " + t3.repararVehiculo(v1, 5.0));
        System.out.println("Coche 2, Taller 1, Reparación: " + t1.repararVehiculo(v2, 10.0));
        System.out.println("Coche 3, Taller 3, Reparación: " + t3.repararVehiculo(v3, 5.0));
        System.out.println("Coche 4, Taller 2, Reparación: " + t2.repararVehiculo(v4, 3.0));
    }

}
