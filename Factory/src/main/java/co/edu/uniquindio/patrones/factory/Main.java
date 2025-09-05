package co.edu.uniquindio.patrones.factory;

public class Main {
    public static void main(String[] args) {
        realizarPago("TARJETA", 150.75);
        realizarPago("PAYPAL", 88.50);

        try {
            realizarPago("BITCOIN", 500.00); // Método no válido
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void realizarPago(String tipoPago, double monto) {
        MetodoPago metodo = PagoFactory.crearMetodoPago(tipoPago);
        metodo.procesarPago(monto);
    }
}
