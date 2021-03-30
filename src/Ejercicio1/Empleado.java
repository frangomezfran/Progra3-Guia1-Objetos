package Ejercicio1;

public class Empleado {
    private int dni;
    private String nombre;
    private String apellido;
    private double salario;

    public Empleado(int dni, String nombre, String apellido, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double salarioAnual() {
        return (this.salario*12);
    }

    public void aumentaSalario(int porcentaje){
        this.salario= salario + ( (porcentaje*salario ) / 100 );
    }

    public String muestraEmpleado(){
        return "Empleado [ DNI = "+this.getDni()+", Nombre = "+this.getNombre()+", Apellido = "+this.getApellido()+", Salario = "+this.getSalario()+"$ ]";
    }
}
