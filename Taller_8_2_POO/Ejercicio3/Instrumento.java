package Taller_8_2_POO.Ejercicio3;

public class Instrumento {
    private String tipo; // Atributo privado al que vamos a intentar invocar

    public Instrumento(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarTipo() {
        System.out.println("Tipo de instrumento: " + tipo);
    }
    
}
