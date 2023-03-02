/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaComp;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author rubén
 */
public class JavaCompProductos {

    private static String modificar;
    private static ArrayList<ProductoVenta> productos = new ArrayList<>();
    private static ProductoVenta objper;

    /**
     * Establece el ArrayList de PRODUCTOS
     *
     * @param p
     */
    public static void setProductos(ArrayList<ProductoVenta> p) {
        productos = p;
    }


    /**
     * @return Devuelve el ArrayList de PRODUCTOS
     */
    public static ArrayList<ProductoVenta> getProductos() {
        //Comparador para ordenar las personas por su nombre
        Comparator NomPerComp = (Object o1, Object o2) -> {
            ProductoVenta p1 = (ProductoVenta) o1;
            ProductoVenta p2 = (ProductoVenta) o2;
            return p1.getTitulo().compareTo(p2.getTitulo());
        };
        //Ordenamos el array
        Collections.sort(productos, NomPerComp);
        return productos;
    }

    /**
     *
     * @param Titulo
     * @return
     */
    public static ProductoVenta getProductosTitulo(String Titulo) {
        //Comparador para ordenar las PRODUCTOS por su nombre
        Comparator CodigoproComp = (Object o1, Object o2) -> {
            ProductoVenta p1 = (ProductoVenta) o1;
            ProductoVenta p2 = (ProductoVenta) o2;
            return p1.getTitulo().compareTo(p2.getTitulo());

        };
        //ordenamos el array
        Collections.sort(productos, CodigoproComp);
        //creamos un producto con el codigo a buscar
        ProductoVenta p = new ProductoVenta();
        p.setTitulo(Titulo);
        int pos = Collections.binarySearch(productos, p, CodigoproComp);

        if (pos >= 0) {
            objper = productos.get(pos);
        } else {
            objper = null;
        }
        return objper;
    }

    /**
     * Da de alta un PRODUCTOS
     *
     * @param objper
     * @return boolean
     */
    public static boolean altaProducto(ProductoVenta objper) {
        if (!productos.contains(objper)) {
            productos.add(objper);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Da de baja un PRODUCTOS
     *
     * @param objper
     * @return boolean
     */
    public static boolean bajaProducto(ProductoVenta objper) {
        if (productos.contains(objper)) {
            productos.remove(objper);
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @param per
     * @param titulo
     * @param caracteristicas
     * @param categoria
     * @param precio
     * @param stock
     * @param fechaEntrada
     * @param comentario
     * @param calificacion
     */
    public static void guardarProductoModificado(ProductoVenta per, String titulo, String caracteristicas, String categoria, double precio, int stock, String fechaEntrada, String comentario, int calificacion) {

        per.setTitulo(titulo);
        per.setCaracteristicas(caracteristicas);
        per.setCategoria(categoria);
        per.setPrecio(precio);
        per.setStock(stock);
        per.setFechaEntrada(fechaEntrada);
        per.getOpiniones().setCalificacion(calificacion);
        per.getOpiniones().setComentario(comentario);
        per.getOpiniones().setFechaRealizacion(LocalDate.now());
        guardarDatos();
    }

    /**
     * Carga los datos de PRODUCTOS del fichero
     */
    public static void cargarDatos() {
        try {
            //Lectura de los objetos de tipo persona
            FileInputStream istreamPer = new FileInputStream("copiasegPro.dat");
            ObjectInputStream oisPer = new ObjectInputStream(istreamPer);
            productos = (ArrayList) oisPer.readObject();
            istreamPer.close();
        } catch (IOException ioe) {
            System.out.println("(productos) Error de IO : " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("(productos)Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("(productos)Error: " + e.getMessage());
        }
    }//fin cargarDatos

    /**
     * Guarda los datos de PRODUCTOS en el fichero
     */
    public static void guardarDatos() {
        try {
            //Si hay datos los guardamos...
            if (!productos.isEmpty()) {
                /**
                 * **** Serialización de los objetos *****
                 */
                //Serialización de los PRODUCTOS
                FileOutputStream ostreamPer = new FileOutputStream("copiasegPro.dat");
                ObjectOutputStream oosPer = new ObjectOutputStream(ostreamPer);
                //guardamos el array de PRODUCTOS
                oosPer.writeObject(productos);
                ostreamPer.close();
            } else {
                System.out.println("(productos) Error: No hay datos...");
            }

        } catch (IOException ioe) {
            System.out.println("(productos) Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("(productos) Error: " + e.getMessage());
        }
    }
//fin guardarDatos

    /**
     * Crea un fichero de texto con los datos de un PRODUCTOS
     *
     * @param per
     * @param producto
     * @param value
     * @throws java.io.IOException
     */
    public static void generaFactura(Cliente per, ProductoVenta producto, int value) throws IOException {
        Double precio = (producto.getPrecio() * value) + 5;
        try ( PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter(per.getNombre() + "-" + LocalDate.now() + "-" + ".txt")))) {
            salida.println("-------------------------------- Factura de Compra JavaComp --------------------------------");
            salida.println("\n");
            salida.println("Hora de emision de la factura: " + LocalDate.now());
            salida.println("\n");
            salida.println("nombre: " + per.getNombre());
            salida.println("\n");
            salida.println("correo electronico: " + per.getCorreoElectronico());
            salida.println("\n");
            salida.println("direccion: ( " + per.getDireccion().toString());
            salida.println("\n");
            salida.println("Tfno: " + per.getTelefono());
            salida.println("\n");

            if (per.getClass().getSimpleName().equals("ClienteParticular")) {
                ClienteParticular alu = (ClienteParticular) per;
                salida.println("*** Cliente Particular ***");
                salida.println("\n");
                salida.println("Dni: " + alu.getDNI());
            } else {
                ClienteEmpresas pro = (ClienteEmpresas) per;
                salida.println("*** Cliente Empresas ***");
                salida.println("\n");
                salida.println("CIF: " + pro.getCIF());
                salida.println("\n");
                salida.println("web: " + pro.getWeb());
            }
            salida.println("\n");
            salida.println("nombre Producto:" + producto.getTitulo());
            salida.println("\n");
            salida.println("caracteristicas: " + producto.getCaracteristicas());
            salida.println("\n");
            salida.println("categoria: " + producto.getCategoria());
            salida.println("\n");
            salida.println("Calificación: " + producto.getOpiniones().getCalificacion());
            salida.println("\n");
            salida.println("Comentario: " + producto.getOpiniones().getComentario());
            salida.println("\n");
            salida.println("Precio de la compra total de los producto/s: " + producto.getPrecio() * value + "€");
            salida.println("\n");
            salida.println("Precio + gastos envío (5 €) : " + precio + "€");
            salida.println("\n");
            salida.println("-------------------------------------------------------------------------------");
        }
    }

}
