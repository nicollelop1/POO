package Taller_13_POO.Ejercicio3;

public class Prueba {

    public static void main(String[] args) {

        Mensajero push = new MensajeroPush();
        Mensajero sms = new MensajeroSMS();

        sms.enviarMensaje("Mensaje sms");
        push.enviarMensaje("Mensaje push");

        
    }
    
}
