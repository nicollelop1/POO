package Taller_13_POO.Ejercicio1;

public class DescuentoFijo extends Descuento {
    private double descuentoFijo;

    public DescuentoFijo(double descuentoFijo) {
        this.descuentoFijo = descuentoFijo;
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto - descuentoFijo;
    }
}