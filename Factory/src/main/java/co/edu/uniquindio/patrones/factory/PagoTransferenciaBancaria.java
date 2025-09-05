package co.edu.uniquindio.patrones.factory;

public class PagoTransferenciaBancaria implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Generando referencia para transferencia bancaria por $" + monto + ".");
    }
}
