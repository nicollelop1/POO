package Taller_16_POO.Ejercicio1;

public class Prueba {
    public static void main(String[] args) {

        ServicioAutenticacion autenticacionLocal = new AutenticacionLocal();
        ServicioAutenticacion autenticacionOAuth = new AutenticacionOAuth();

        GestorAutenticacion gestor = new GestorAutenticacion(autenticacionLocal);
        boolean resultadoLocal = gestor.iniciarSesion("admin", "1234");
        System.out.println("Autenticacion local " + resultadoLocal);

        gestor = new GestorAutenticacion(autenticacionOAuth);
        boolean resultadoOAuth = gestor.iniciarSesion("user", "oauth123");
        System.out.println("Autenticacion OAuth " + resultadoOAuth);
    }

}
