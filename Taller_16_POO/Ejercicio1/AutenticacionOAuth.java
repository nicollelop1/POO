package Taller_16_POO.Ejercicio1;

public class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contrasena) {
        return "user".equals(usuario) && "oauth123".equals(contrasena);
    }
}