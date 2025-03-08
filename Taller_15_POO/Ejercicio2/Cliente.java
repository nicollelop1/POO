package Taller_15_POO.Ejercicio2;

public class Cliente implements PagosDeFactura{

    @Override
    public void pagarFactura() {
       System.out.println("El cliente ha pagado la factura");
    }
    
}
