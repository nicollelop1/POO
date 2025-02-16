package Taller_3_POO.Vehiculos;

class Vehiculo {

    String tipo;

    Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    void mostrarTipo() {
        System.out.println("Tipo de vehiculo: " + tipo);
    }

}
