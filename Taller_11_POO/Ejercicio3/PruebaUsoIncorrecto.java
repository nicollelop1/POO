package Taller_11_POO.Ejercicio3;

public class PruebaUsoIncorrecto {

    public static void main(String[] args) {
        
        Figura  figura = new Circulo();
        figura.calcularArea();
        /*figura.mostrarCirculo(); manera incorrecta el 
        metodo mostrarCirculo solo existe en la clase Circulo
        
*/
    }
    
}
