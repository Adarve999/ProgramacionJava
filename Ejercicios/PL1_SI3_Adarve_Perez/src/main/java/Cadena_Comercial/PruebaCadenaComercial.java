package Cadena_Comercial;

import java.text.DecimalFormat;
import java.time.LocalDate;

/**
 *
 * @author rubén
 */
public class PruebaCadenaComercial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###,###.##");
        LocalDate fecha1 = LocalDate.of(1988, 1, 10);
        LocalDate fecha2 = LocalDate.of(1998, 5, 6);

        CadenaComercial cadenaComercial = new CadenaComercial("Grandes Galerias", "ventas");
        EmpleadosEstandar EmpEst1 = new EmpleadosEstandar(200, "pepe", 43, "martinez", 2600, cadenaComercial);
        EmpleadosEstandar EmpEst2 = new EmpleadosEstandar(220, "juan", 34, "martinez", 5100, cadenaComercial);

        EmpleadosDestacados EmpDes1 = new EmpleadosDestacados(fecha1, "adolfo", 56, "jimenez", 25000, cadenaComercial);
        EmpleadosDestacados EmpDes2 = new EmpleadosDestacados(fecha2, "rafael", 45, "perez", 7500, cadenaComercial);
        
        System.out.println("los empleados de la cadena comercial:\n"+cadenaComercial.getEmpleados().toString());
        
        System.out.println("\n---- CALCULO DE SUELDOS ----\n");
        System.out.println("Sueldo empleado estandar 1: " + EmpEst1.toString() + " = " + df.format(EmpEst1.calcularSueldo()) + "€");
        System.out.println("Sueldo empleado estandar 2: " + EmpEst2.toString() + " = " + df.format(EmpEst2.calcularSueldo()) + "€");
        System.out.println("Sueldo empleado destacado 1: " + EmpDes1.toString() + " = " + df.format(EmpDes1.calcularSueldo()) + "€");
        System.out.println("Sueldo empleado destacado 2: " + EmpDes2.toString() + " = " + df.format(EmpDes2.calcularSueldo()) + "€");
    }

}
