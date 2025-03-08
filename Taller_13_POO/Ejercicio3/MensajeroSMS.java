package Taller_13_POO.Ejercicio3;

public class MensajeroSMS extends Mensajero {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }
}
