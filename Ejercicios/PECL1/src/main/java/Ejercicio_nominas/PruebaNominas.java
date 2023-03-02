/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_nominas;

import Ejercicio_Empleados.*;

/**
 *
 * @author Usuario
 */
public class PruebaNominas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//1 - creamos la empresa 
        Empresa e1 = new Empresa("Indra", "1234567");
//2 - creamos el departamento 
        Departamento d1 = new Departamento("Informática", "1", "Madrid", e1);
//3 - creamos los empleados que asignamos al departamento 
        Empleado emp1 = new Empleado("1234", "Pepe", 25, "soltero", 1500, "programador", d1);
        Empleado emp2 = new Empleado("4567", "Laura", 35, "casada", 2000, "analista", d1);
//4 - creamos las nóminas de los empleados 
        Nomina n1 = new Nomina(e1, d1, emp1, 20);
        Nomina n2 = new Nomina(e1, d1, emp2, 25);
        System.out.println(n1.toString());
        System.out.println(n2.toString());
    }

}
