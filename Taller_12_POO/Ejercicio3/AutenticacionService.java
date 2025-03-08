package Taller_12_POO.Ejercicio3;

public class AutenticacionService {
    public boolean autenticar(Usuario usuario, String contrasena) {
        System.out.println("El usuario a sido autenticado: " + usuario.getNombre() + " " + usuario.getContrasena());
        return usuario.getNombre().equals("admin") && contrasena.equals("1234");
    }
}
