package Excepciones;

import java.io.*;

/**
 *
 * @author rubén
 */
public class Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        double media = 0, total = 0, notanum = 0;
        int contador = 0;
        String notatxt = "";
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        while (!notatxt.equals("Z")) {
            try {
                System.out.print("\n Teclee calificación (0-10), Z para terminar: ");
                notatxt = entrada.readLine().toUpperCase();
                notanum = Double.parseDouble(notatxt);
                if (notanum < 0) {
                    throw new NotaMal("No se admiten calificaciones menores que 0.");
                } else if (notanum > 10) {
                    throw new NotaMal("No se admiten calificaciones mayores que 10.");
                }
                total += notanum;
                contador++;
            } catch (NotaMal nm) {
                System.out.println("\n" + nm.getMessage());
            } catch (NumberFormatException nfe) {
                if (!notatxt.equals("Z")) {
                    System.out.println("\nError de formato numérico: " + nfe.toString());
                }
            } catch (IOException ioe) {
                System.out.println("\nError de entrada/salida: " + ioe.toString());
            } catch (Exception e) { // Captura cualquier otra excepción 
                System.out.println("Excepción: " + e.toString());
            }
        }
        if (contador != 0) {
            media = (double) total / contador;
            System.out.println("\nEl promedio del grupo es: " + media);
        } else {
            System.out.println("\nNo se introdujeron calificaciones.");
        }
    }
}

class NotaMal extends Exception {

    public NotaMal() {
        super("Excepción definida por el usuario: NOTA INCORRECTA.");
    }

    public NotaMal(String msg) {
        super("Excepción definida por el usuario: " + msg);
    }
}
