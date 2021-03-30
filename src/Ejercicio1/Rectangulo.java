package Ejercicio1;

public class Rectangulo {
    private double ancho = 1;
    private double alto = 1;

    public double getAncho() {
        return ancho;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }
    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double perimetro() {
        return (this.ancho+this.alto)*2;
    }
    public double area(){
        return this.alto*this.ancho;
    }

    public String muestraAreaPerimetro(){
        return "Area = "+this.area()+" | Perimetro = "+this.perimetro() ;
    }
    public String muestraAltoAncho(){
        return "Alto = "+this.getAlto()+" | Ancho = "+this.getAncho();
    }
}
