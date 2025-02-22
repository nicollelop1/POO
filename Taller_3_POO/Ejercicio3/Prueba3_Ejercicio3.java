package Taller_3_POO.Ejercicio3;

public class Prueba3_Ejercicio3 {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Marta", 17);

        //System.out.println("El nombre es " + persona1.nombre);// error
        System.out.println("El nombre es " + persona1.getNombre());

        System.out.println("La edad es: " + persona1.edad );


    }

}
