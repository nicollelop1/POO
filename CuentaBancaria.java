public class CuentaBancaria {

    public String numeroCuenta;
    public double saldo;
    public String tipoCuenta;

    public CuentaBancaria() {
       saldo = 2000;
       numeroCuenta = "1234";
       tipoCuenta = "desconocida";

    }

    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;

    }

    public CuentaBancaria(String numeroCuenta, String tipoCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;

    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public String toString() {
        return "numero Cuenta: " + numeroCuenta + ", saldo: " + saldo + ", tipo: " + tipoCuenta;
    }

    public void mostrarDetalles() {
        System.out.println("Tipo cuenta : " + tipoCuenta);
        System.out.println("numero cuenta: " + numeroCuenta);
        System.out.println("saldo : " + saldo);

    }

}
