/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_nominas;

import Ejercicio_Empleados.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Usuario
 */
public class Nomina {

    private Empresa empresa;
    private Departamento departamento;
    private Empleado empleado;
    private LocalDate fecha;
    private double salarioBruto;
    private double retencion;
    private double salarioNeto;

    public Nomina(Empresa empresa, Departamento departamento, Empleado empleado, double retencion) {
        this.empresa = empresa;
        this.departamento = departamento;
        this.empleado = empleado;
        this.fecha = LocalDate.now();
        this.salarioBruto = empleado.getSueldo();
        this.retencion = retencion;
        this.salarioNeto = calculaSalarioNeto();
    }

    public Nomina(Empleado empleado, double retencion) {
        this.empleado = empleado;
        this.departamento = empleado.getDepartamento();
        this.empresa = empleado.getDepartamento().getEmpresa();
        this.fecha = LocalDate.now();
        this.salarioBruto = empleado.getSueldo();
        this.retencion = retencion;
        this.salarioNeto = calculaSalarioNeto();
    }

    private double calculaSalarioNeto() {
        return this.salarioBruto - (this.salarioBruto * (this.retencion / 100));
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getFechaString() {
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String hoystr = fecha.format(formatoCorto);
        return hoystr;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
        this.calculaSalarioNeto();
    }

    public double getRetencion() {
        return retencion;
    }

    public void setRetencion(double retencion) {
        this.retencion = retencion;
        this.calculaSalarioNeto();
    }

    public double getSalarioNeto() {
        return salarioNeto;
    }

    public String toString() {
        return "*** Nómina ***\n " + this.empleado + " \n " + this.empresa + " \n " + this.getFechaString() + " \n " + this.salarioNeto;
    }

}
