package Taller_10_POO.Ejercicio1;

public class Prueba {
    public static void main(String[] args) {

        Figura rectangulo1 = new Rectangulo(5, 10);
        Figura triangulo1 = new Triangulo(5, 10);

        System.out.println("Rectangulo");
        rectangulo1.mostrarArea();

        System.out.println();

        System.out.println("Triangulo");
        triangulo1.mostrarArea();


    }

}
