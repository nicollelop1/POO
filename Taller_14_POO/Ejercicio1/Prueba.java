package Taller_14_POO.Ejercicio1;

public class Prueba {

    public static void main(String[] args) {

        Figura circulo = new Circulo(2.0);
        Figura rectangulo = new Rectangulo(3.0, 5.0);

        System.out.println("Area del circulo: " + circulo.calcularArea());
        System.out.println("Area del rectángulo: " + rectangulo.calcularArea());

      

    }
    
}
