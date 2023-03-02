/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo7_POO_empleados;

import java.util.ArrayList;

/**
 *
 * @author rubén
 */
public class Departamento {

    private ArrayList<Empleado> empleados;

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    private Empresa empresa;

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String localizacion;

    public String getLocalizacion() {
        return localizacion;
    }

    public void altaEmpleado(Empleado emp) {
        if (!empleados.contains(emp)) {
            empleados.add(emp);
            emp.setDepartamento(this);
        }
    }

    public void bajaEmpleado(Empleado emp) {
        if (empleados.contains(emp)) {
            empleados.remove(emp);
            emp.setDepartamento(null); //el empleado tiene que reflejar la baja 
        }
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento(String nombre, String id, String localizacion, Empresa empresa) {
        empleados = new ArrayList<>();
        this.nombre = nombre;
        this.id = id;
        this.localizacion = localizacion;
        this.empresa = empresa;
    }

    public String toString() {
        return "Departamento{" + "nombre=" + nombre + ", id=" + id + ", localizacion=" + localizacion + '}';
    }

}
