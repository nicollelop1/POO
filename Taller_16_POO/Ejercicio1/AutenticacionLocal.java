package Taller_16_POO.Ejercicio1;

public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contrasena) {
        return "admin".equals(usuario) && "1234".equals(contrasena);
    }
}