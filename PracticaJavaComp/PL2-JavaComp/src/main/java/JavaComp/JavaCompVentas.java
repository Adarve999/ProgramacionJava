/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaComp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author rubén
 */
public class JavaCompVentas {

    private static ArrayList<Venta> venta = new ArrayList<>();
    private static Venta objvent;

    /**
     *
     * @return
     */
    public static ArrayList<Venta> getVentas() {
        //Comparador para ordenar las VENTAS por su nombre
        Comparator NomPerComp = (Object o1, Object o2) -> {
            Venta p1 = (Venta) o1;
            Venta p2 = (Venta) o2;
            return p1.getProducto().getTitulo().compareTo(p2.getProducto().getTitulo());
        };
        //Ordenamos el array
        Collections.sort(venta, NomPerComp);
        return venta;
    }
    
    /**
     *
     * @param objvent
     * @return
     */
    public static boolean altaVenta(Venta objvent) {
        if (!venta.contains(objvent)) {
            venta.add(objvent);
            return true;
        } else {
            return false;
        }
    }
        
    /**
     *
     */
    public static void cargarDatos() {
        try {
            //Lectura de los objetos de tipo VENTAS
            FileInputStream istreamPer = new FileInputStream("copiasegVent.dat");
            ObjectInputStream oisPer = new ObjectInputStream(istreamPer);
            venta = (ArrayList) oisPer.readObject();
            istreamPer.close();
        } catch (IOException ioe) {
            System.out.println("(ventas) Error de IO : " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("(ventas)Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("(ventas)Error: " + e.getMessage());
        }
    }//fin cargarDatos

    /**
     * Guarda los datos de VENTAS en el fichero
     */
    public static void guardarDatos() {
        try {
            //Si hay datos los guardamos...
            if (!venta.isEmpty()) {
                /**
                 * **** Serialización de los objetos *****
                 */
                //Serialización de las VENTAS
                FileOutputStream ostreamPer = new FileOutputStream("copiasegVent.dat");
                ObjectOutputStream oosPer = new ObjectOutputStream(ostreamPer);
                //guardamos el array de VENTAS
                oosPer.writeObject(venta);
                ostreamPer.close();
            } else {
                System.out.println("(ventas) Error: No hay datos...");
            }

        } catch (IOException ioe) {
            System.out.println("(ventas) Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("(ventas) Error: " + e.getMessage());
        }
    }
}
