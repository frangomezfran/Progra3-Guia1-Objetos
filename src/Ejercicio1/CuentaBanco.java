package Ejercicio1;

public class CuentaBanco {
    private int id;
    private String nombre;
    private double balance;

    public CuentaBanco(int id, String nombre, double balance) {
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double credito(double deposito) {
        this.balance = balance + deposito;
        return (this.balance);
    }

    public boolean verificacionDebito(double sustraccion)
    {
        return !(this.balance < sustraccion);
    }

    public double debito(double sustraccion)
    {
        double aux = this.getBalance();

        if( verificacionDebito(sustraccion) )
            this.balance -= sustraccion;

        if ( ( aux == this.getBalance() ) &&  ( sustraccion != 0 ) )
            System.out.println(muestraErrorSustraer()); // Un print aca no me gusta
        else
            System.out.println(muestraExitoSustraer());

        return this.getBalance();
    }

    public String muestraCuenta(){
        return "ID = "+this.getId()+" | Nombre = "+this.getNombre()+" | Balance = "+this.getBalance()+" $";
    }

    public String muestraErrorSustraer() {
        return "ERROR AL SUSTRAER DINERO | BALANCE = " + this.getBalance() + " $";
    }

    public String muestraExitoSustraer() {
        return "EXITO AL SUSTRAER DINERO | BALANCE = " + this.getBalance() + " $";
    }
}

