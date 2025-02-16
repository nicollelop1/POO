package Taller_4_2_POO;

public class Utilidades {

    public double suma(double a, double b) {
        return a + b;

    }

    public double resta(double a, double b) {
        return a - b;

    }

    public double multiplicacion(double a, double b) {
        return a * b;

    }

    public double division(double a, double b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("No se puede dividir entre 0");
            return 0;
        }

    }
}