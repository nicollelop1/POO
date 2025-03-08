package Taller_13_POO.Ejercicio1;

public class Prueba {

    public static void main(String[] args) {
        double monto = 3000.0;

        Descuento descuento = new DescuentoFijo(2000.0);
        Descuento descuento2 = new DescuentoPorcentaje(0.20);


       System.out.println("Descuento fijo: " + descuento.aplicarDescuento(monto));
       System.out.println("Descuento porcentaje: " + descuento2.aplicarDescuento(monto));

    }

}
