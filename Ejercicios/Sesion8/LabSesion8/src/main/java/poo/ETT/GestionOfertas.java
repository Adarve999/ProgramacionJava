package poo.ETT;

import java.util.*;
import java.util.stream.Collectors;

public class GestionOfertas {

    private static ArrayList<OfertaEmpleo> ofertas = new ArrayList<>();

    public GestionOfertas() {
    }

    public static ArrayList<OfertaEmpleo> getOfertas() {
        return ofertas;
    }

    public static void setOfertas(ArrayList<OfertaEmpleo> ofertas) {
        GestionOfertas.ofertas = ofertas;
    }

    //método para añadir ofertas
    public static String altaOfertas(OfertaEmpleo oferta) {
        try {

            if (ofertas.contains(oferta)) {
                throw new OfertasException(OfertasException.OFERTA_REPETIDA);
            }
            ofertas.add(oferta);
            return "Oferta dada de alta correctamente";
        } catch (OfertasException pe) {
            return pe.getMessage();
        }
    }

    //método búsqueda de ofertas que devuelve una lista con las oferta encontradas
    public static List<OfertaEmpleo> busquedaOfertas(String categoria, double salario) {

        List<OfertaEmpleo> ofertasBuscadas = ofertas.stream()
                .filter(oe -> (oe.getCategoria().equals(categoria) && oe.getSalario() >= salario))
                        .sorted().collect(Collectors.toList());
        /* Sin streams:
        ArrayList<OfertaEmpleo> ofertasBuscadas = new ArrayList<>();
        for (OfertaEmpleo oe : ofertas) {
                if (oe.getCategoria().equals(categoria) && oe.getSalario() >= salario) {
                    ofertasBuscadas.add(oe);
                }
        }
        return ofertasBuscadas;
        */

        return ofertasBuscadas;
    }
}
