package poo.ejercicios;

import java.io.File;

public class PruebaListadoFicheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File directorio = new File("imagenes");
        if (directorio.exists() && directorio.isDirectory()) {
            String listado[] = directorio.list();
            System.out.println("\n- Listado del directorio:");
            for (int i = 0; i < listado.length; i++) {
                System.out.println(listado[i] + "\n");
            }
        }

    }
}
