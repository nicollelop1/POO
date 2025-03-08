package Taller_12_POO.Ejercicio3;

public class Prueba {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("admin", "1234");

        ValidacionService validacion = new ValidacionService();
        validacion.validarDatos(usuario);

        AutenticacionService autenticacion = new AutenticacionService();
        autenticacion.autenticar(usuario, "1234");

    }

}
