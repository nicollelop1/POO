package Taller_15_POO.Ejercicio2;

public class Prueba {
    public static void main(String[] args) {

        PagosDeFactura pagos = new Cliente();
        pagos.pagarFactura();

        Retiros retiro = new Nequi();
        Transferencia transferencia = new Nequi();

        retiro.retirar();
        transferencia.Transferir();


    }
    
}
