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
public class JavaCompPersonas {
    
    private static ArrayList<Cliente> personas = new ArrayList<>();
    private static Cliente objper;

    /**
     * Establece el ArrayList de personas
     *
     * @param p
     */
    public static void setPersonas(ArrayList<Cliente> p) {
        personas = p;
    }

    /**
     * @return Devuelve el ArrayList de personas
     */
    public static ArrayList<Cliente> getPersonas() {
        //Comparador para ordenar las personas por su nombre
        Comparator NomPerComp = (Object o1, Object o2) -> {
            Cliente p1 = (Cliente) o1;
            Cliente p2 = (Cliente) o2;
            return p1.getCorreoElectronico().compareTo(p2.getCorreoElectronico());
        };
        //Ordenamos el array
        Collections.sort(personas, NomPerComp);
        return personas;
    }
    
    /**
     *
     * @param Titulo
     * @return
     */
    public static Cliente getPersonasTitulo(String Titulo) {
        //Comparador para ordenar las personas por su nombre
        Comparator CodigoproComp = (Object o1, Object o2) -> {
            Cliente p1 = (Cliente) o1;
            Cliente p2 = (Cliente) o2;
            return p1.getCorreoElectronico().compareTo(p2.getCorreoElectronico());

        };
        //ordenamos el array
        Collections.sort(personas, CodigoproComp);
        //creamos una persona con el codigo a buscar
        Cliente p = new Cliente();
        p.setCorreoElectronico(Titulo);
        int pos = Collections.binarySearch(personas, p, CodigoproComp);

        if (pos >= 0) {
            objper = personas.get(pos);
        } else {
            objper = null;
        }
        return objper;
    }
    /**
     * Da de alta una persona
     *
     * @param objper
     * @return boolean
     */
    public static boolean altaPersona(Cliente objper) {
        if (!personas.contains(objper)) {
            personas.add(objper);
            guardarDatos();
            return true;
        } else {
            return false;
        }
    }

    /**
     * Da de baja una persona
     *
     * @param objper
     * @return boolean
     */
    public static boolean bajaPersona(Cliente objper) {
        if (personas.contains(objper)) {
            personas.remove(objper);
            return true;
        } else {
            return false;
        }
    }
    
    /**
     *
     * @param per
     * @param nombre
     * @param clave
     * @param correoElectronico
     * @param calle
     * @param numero
     * @param codigoPostal
     * @param ciudad
     * @param nombreTitular
     * @param numeroTarjetaTitular
     * @param fechaCaducidad
     * @param telefono
     * @param cif
     * @param web
     */
    public static void modificaPersonaEmpresa(Cliente per, String nombre, String clave, String correoElectronico, String calle, String numero, String codigoPostal, String ciudad, String nombreTitular, String numeroTarjetaTitular, String fechaCaducidad, String telefono, String cif, String web) {
        per.setNombre(nombre);
        per.setClave(clave);
        per.setCorreoElectronico(correoElectronico);
        //introducimos los datos de la dirección
        per.getDireccion().setCalle(calle);
        per.getDireccion().setNumero(numero);
        per.getDireccion().setCodigoPostal(codigoPostal);
        per.getDireccion().setCiudad(ciudad);
        //introducimos los datos de la tarjeta de credito
        per.getTarjetaCredito().setFechaCaducidad(fechaCaducidad);
        per.getTarjetaCredito().setNombreTitular(nombreTitular);
        per.getTarjetaCredito().setnumeroTarjetaTitular(numeroTarjetaTitular);
        per.setTelefono(telefono);
        ClienteEmpresas empresa = (ClienteEmpresas) per;
        empresa.setCIF(cif);
        empresa.setWeb(web);
        guardarDatos();
    }
    
    /**
     *
     * @param per
     * @param nombre
     * @param clave
     * @param correoElectronico
     * @param calle
     * @param numero
     * @param codigoPostal
     * @param ciudad
     * @param nombreTitular
     * @param numeroTarjetaTitular
     * @param fechaCaducidad
     * @param telefono
     * @param dni
     */
    public static void modificaPersonaParticular(Cliente per, String nombre, String clave, String correoElectronico,String calle, String numero, String codigoPostal, String ciudad, String nombreTitular, String numeroTarjetaTitular, String fechaCaducidad, String telefono, String dni) {
        per.setNombre(nombre);
        per.setClave(clave);
        per.setCorreoElectronico(correoElectronico);
        //introducimos los datos de la dirección
        per.getDireccion().setCalle(calle);
        per.getDireccion().setNumero(numero);
        per.getDireccion().setCodigoPostal(codigoPostal);
        per.getDireccion().setCiudad(ciudad);
        //introducimos los datos de la tarjeta de credito
        per.getTarjetaCredito().setFechaCaducidad(fechaCaducidad);
        per.getTarjetaCredito().setNombreTitular(nombreTitular);
        per.getTarjetaCredito().setnumeroTarjetaTitular(numeroTarjetaTitular);
        per.setTelefono(telefono);
        ClienteParticular particular = (ClienteParticular) per;
        particular.setDNI(dni);
        guardarDatos();
    }
    
    /**
     *
     * @param correo
     * @param clave
     * @return
     */
    public static boolean encontrarCliente(String correo, String clave) {
        boolean dentro = false;
        Cliente ve = null;
        for (Cliente v : personas) {
            if (v.getCorreoElectronico().equals(correo) && v.getClave().equals(clave)) {
                ve = v;
                dentro = true;
            }
        }
        return dentro;
    }
    
    /**
     *
     * @param correo
     * @param clave
     * @return
     */
    public static Cliente encontrarCliente2(String correo, String clave) {
        boolean dentro = false;
        Cliente ve = null;
        for (Cliente v : personas) {
            if (v.getCorreoElectronico().equals(correo) && v.getClave().equals(clave)) {
                ve = v;
                dentro = true;
            }
        }
        return ve;
    }

    /**
     * Carga los datos de personas del fichero
     */
    public static void cargarDatos() {
        try {
            //Lectura de los objetos de tipo persona
            FileInputStream istreamPer = new FileInputStream("copiasegPer.dat");
            ObjectInputStream oisPer = new ObjectInputStream(istreamPer);
            personas = (ArrayList) oisPer.readObject();
            istreamPer.close();
        } catch (IOException ioe) {
            System.out.println("(clientes) Error de IO : " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("(clientes)Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("(clientes)Error: " + e.getMessage());
        }
    }//fin cargarDatos

    /**
     * Guarda los datos de personas en el fichero
     */
    public static void guardarDatos() {
        try {
            //Si hay datos los guardamos...
            if (!personas.isEmpty()) {
                /**
                 * **** Serialización de los objetos *****
                 */
                //Serialización de las personas
                FileOutputStream ostreamPer = new FileOutputStream("copiasegPer.dat");
                ObjectOutputStream oosPer = new ObjectOutputStream(ostreamPer);
                //guardamos el array de personas
                oosPer.writeObject(personas);
                ostreamPer.close();
            } else {
                System.out.println("(clientes) Error: No hay datos...");
            }
            
        } catch (IOException ioe) {
            System.out.println("(clientes) Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("(clientes) Error: " + e.getMessage());
        }
    }
}