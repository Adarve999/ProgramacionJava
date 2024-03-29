/*
 * InformaticoAbs.java
 *
 */
package poo.informaticos;

public abstract class InformaticoAbs {

    //Atributos
    private String empresa;
    private double sueldo;

    //Constructor
    public InformaticoAbs(String empresa) {
        this.empresa = empresa;
    }

    //Métodos
    public String getEmpresa() {
        return this.empresa;
    }

    public void setEmpresa(String nueva) {
        this.empresa = nueva;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double euros) {
        this.sueldo = euros;
    }

    @Override
    public String toString() {
        return "Empresa: " + this.empresa + " - Sueldo: " + this.sueldo;
    }

    //método abstracto
    public abstract double pagarSueldo(int horas);
}
