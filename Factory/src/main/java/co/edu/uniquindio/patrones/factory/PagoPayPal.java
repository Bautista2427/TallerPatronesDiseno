package co.edu.uniquindio.patrones.factory;

public class PagoPayPal implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Iniciando sesión de PayPal para pago de $" + monto + ".");
    }
}
