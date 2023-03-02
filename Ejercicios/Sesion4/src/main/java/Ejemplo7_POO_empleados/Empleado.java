package Ejemplo7_POO_empleados;

/**
 *
 * @author rubén
 */
public class Empleado extends Persona {

    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double sueldo;

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    private Departamento departamento;

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    private String categoria;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Empleado(String dni, String nombre, int edad, String estado, double sueldo, String categoria, Departamento departamento) {
        super(dni, nombre, edad, estado);
        this.sueldo = sueldo;
        this.categoria = categoria;
        this.departamento = departamento;
        this.departamento.altaEmpleado(this);
    }

    @Override
    public String toString() {
        return super.toString() + " # Empleado{" + "sueldo=" + sueldo + ", categoria=" + categoria + ", departamento=" + departamento + '}';
    }

}
