package Taller_4_POO.Ejercicio2;

public class prueba2_Ejercicio2 {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Honda", "fit", 100);

        //System.out.println("Marca: " + coche1.velocidadMaxima());// error es private 

        System.out.println("Marca: " + coche1.getMarca());
        System.out.println("Modelo: " + coche1.getModelo());
        System.out.println("Velocidad Máxima: " + coche1.getVelocidadMaxima());

        coche1.acelerar(10);
    }


    
    
}
