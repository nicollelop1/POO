package Taller_6_POO;

public class PruebaStatic {
    /*
     * String nombre = "Juan";
     * 
     * public static void modificarNombre(){
     * nombre = "maria"; El metodo es static pero el
     * atributo no es static por lo cual no permite su modificacion
     * }
     * 
     */

    static String nombre = "Juan";

    public static void modificarNombre() {
        nombre = "maria";
    }
}