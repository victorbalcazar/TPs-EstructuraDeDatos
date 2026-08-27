package tp1;

public class CuentaBancaria {

    // Atributos
    private String titular;
    private double saldo;
    private String tipoCuenta;

    // Constructor predeterminado
    public CuentaBancaria() {
        titular = "Invitado";
        saldo = 0;
        tipoCuenta = "ahorro";
    }

    // Constructor con argumentos
    public CuentaBancaria(String titular, double saldo, String tipoCuenta) {
        this.titular = titular;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    // Método depositar
    public void depositar(double monto) {

        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito realizado correctamente.");
        } else {
            System.out.println("Error: el monto a depositar debe ser positivo.");
        }
    }

    // Método retirar
    public boolean retirar(double monto) {

        if (monto <= 0) {
            System.out.println("Error: el monto a retirar debe ser positivo.");
            return false;
        }

        if (monto > saldo) {
            System.out.println("Error: saldo insuficiente.");
            return false;
        }

        saldo -= monto;
        System.out.println("Retiro realizado correctamente.");
        return true;
    }

    // Método toString
    @Override
    public String toString() {
        return String.format(
            "Titular: %s%nTipo de cuenta: %s%nSaldo actual: $%.2f",
            titular, tipoCuenta, saldo
        );
    }
}
