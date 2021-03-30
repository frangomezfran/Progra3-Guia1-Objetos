package Ejercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Ingrese Ejercicio \n1 - 2 - 3 - 4 - 5");
        Scanner scanner = new Scanner (System.in);
        int ejercicio = scanner.nextInt();

        switch (ejercicio) {

            case (1):
                Rectangulo rectangulo = new Rectangulo(); // A
                rectangulo.setAlto(14);
                rectangulo.setAncho(5);
                System.out.println("Primer Rectangulo\n" + rectangulo.muestraAltoAncho() + "\n" + rectangulo.muestraAreaPerimetro()); // B
                rectangulo.setAlto(20); // D
                rectangulo.setAncho(10); // D
                System.out.println("\nPrimer Rectangulo Modificado\n" + rectangulo.muestraAltoAncho() + "\n" + rectangulo.muestraAreaPerimetro()); // E
                Rectangulo rectanguloDefecto = new Rectangulo();
                System.out.println("\nRectangulo por defecto\nAlto = " + rectanguloDefecto.muestraAltoAncho() + "\n" + rectanguloDefecto.muestraAreaPerimetro()); // B
                break;

            case (2):
                Empleado empleado1 = new Empleado(23456345, "Carlos", "Gutiérrez", 25000);
                Empleado empleado2 = new Empleado(34234123, "Ana", "Sánchez", 27500);
                System.out.println(empleado1.muestraEmpleado() + "\n" + empleado2.muestraEmpleado());
                empleado1.aumentaSalario(15);
                System.out.println("\nCarlos con el salario aumentado :\n" + empleado1.muestraEmpleado());
                break;

            case (3):
                ItemVenta item = new ItemVenta(345, "Galleta-pepitos-119gr",500,65);
                System.out.println(item.imprimeItemVenta());
                break;

            case (4):
                CuentaBanco cuenta1 = new CuentaBanco(75,"FrancoGomez",15000);

                System.out.println("1° Deposito 2500$ en la cuenta");
                cuenta1.credito(2500);
                System.out.println(cuenta1.muestraCuenta());

                System.out.println("\n2° Compra de  1500$ en la cuenta");
                cuenta1.debito(1500); // retorna balance

                System.out.println("\n3° Compra de  30000$ en la cuenta");
                cuenta1.debito(30000); // retorna balance

                System.out.println("\n"+cuenta1.muestraCuenta());

                break;

            case (5):

                Hora tiempo1 = new Hora (23,59,0);
                System.out.println("Tiempo -> "+tiempo1.imprimeHora());
                tiempo1.atrasaReloj();
                System.out.println("Atrasa -> "+tiempo1.imprimeHora());
                tiempo1.atrasaReloj();
                System.out.println("Atrasa -> "+tiempo1.imprimeHora());
                tiempo1.atrasaReloj();
                System.out.println("Atrasa -> "+tiempo1.imprimeHora());

                break;
        }
    }
}
