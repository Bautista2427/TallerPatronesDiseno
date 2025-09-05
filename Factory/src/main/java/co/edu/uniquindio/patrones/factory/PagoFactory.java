package co.edu.uniquindio.patrones.factory;

public class PagoFactory {

    public static MetodoPago crearMetodoPago(String tipo) {
        switch (tipo.toUpperCase()) {
            case "TARJETA":
                return new PagoTarjetaCredito();
            case "PAYPAL":
                return new PagoPayPal();
            case "TRANSFERENCIA":
                return new PagoTransferenciaBancaria();
            default:
                throw new IllegalArgumentException("Método de pago no soportado: " + tipo);
        }
    }
}
