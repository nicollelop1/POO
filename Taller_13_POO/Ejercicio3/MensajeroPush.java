package Taller_13_POO.Ejercicio3;

public class MensajeroPush extends Mensajero {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando notificacion push: " + mensaje);
    }
}
