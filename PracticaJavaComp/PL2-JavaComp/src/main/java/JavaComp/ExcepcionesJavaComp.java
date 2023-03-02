/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaComp;

/**
 *
 * @author rubén
 */
public class ExcepcionesJavaComp extends Exception {

    /**
     *
     */
    public static String Producto_DENTRO = "El producto se encuentra dentro de la lista.";

    /**
     *
     */
    public static String Producto_FUERA = "El producto no se encuentra en el lista.";

    /**
     *
     */
    public ExcepcionesJavaComp() {
        super("Se ha producido una excepción en la aplicación.");
    }

    /**
     *
     * @param txt
     */
    public ExcepcionesJavaComp(String txt) {
        super(txt); 
    }
    
}
