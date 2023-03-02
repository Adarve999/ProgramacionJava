/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplo6_ArrayList;

import java.util.*;

/**
 *
 * @author rubén
 */
public class PruebaArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> colores = new ArrayList<>();
        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");
        colores.add("amarillo");
// imprimimos el contenido 
        System.out.println(colores.toString());
// primer y último elemento 
        System.out.println("Primer elemento: " + colores.get(0));
        System.out.println("Último elemento: " + colores.get(colores.size() - 1));

        colores.set(2, "azul claro");
        System.out.println(colores.toString());

        if (colores.contains("rojo")) {
            System.out.println("\n\"rojo\" encontrado en el índice " + colores.indexOf("rojo") + "\n");
        } else {
            System.out.println("\n\"rojo\" no encontrado\n");
        }
// borrar un elemento 
        colores.remove("amarillo");
// ordenamos el array 
        Collections.sort(colores);
        System.out.println(colores.toString());
//recorremos el array
        for (String c : colores) {
            System.out.println(c);
        }
    }

}
