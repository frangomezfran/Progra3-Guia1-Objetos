package Ejercicio1;

public class ItemVenta {

    private int id;
    private String descripcion;
    private int cantidad;
    private double pUnitario;

    public ItemVenta(int idr, String descripcion, int cantidad, double pUnitario) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.pUnitario = pUnitario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getpUnitario() {
        return pUnitario;
    }

    public void setpUnitario(double pUnitario) {
        this.pUnitario = pUnitario;
    }

    public double precioTotal(){
        return (this.pUnitario*this.cantidad) ;
    }

    public String imprimeItemVenta(){
        return "ItemVenta [ Id = "+this.getId()+" , Descripción = "+this.getDescripcion()+" , Cantidad = "+this.getCantidad()+" , pUnitario = "+this.getpUnitario()+"$ , pTotal="+this.precioTotal()+"$ ]" ;
    }
}
