package Taller_7_POO.Ejercicio1;

public class Prueba {
    public static void main(String[] args) {

        Figura rectangulo1 = new Rectangulo(3, 5);
        Figura circulo1 = new Circulo(6);

        System.out.println("Rectangulo");
        rectangulo1.mostrarArea();

        System.out.println();

        System.out.println("Circulo");
        circulo1.mostrarArea();

    }

}
