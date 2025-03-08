package Taller_12_POO.Ejercicio3;

public class ValidacionService {
    public boolean validarDatos(Usuario usuario) {
        System.out.println("El usuario ha sido validado");
        return usuario.getNombre() != null && !usuario.getNombre().isEmpty() && usuario.getContrasena() != null
                && !usuario.getContrasena().isEmpty();

    }
}