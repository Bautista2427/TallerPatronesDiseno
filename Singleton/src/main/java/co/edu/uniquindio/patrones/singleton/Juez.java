package co.edu.uniquindio.patrones.singleton;

public class Juez {

    public void consultarMarcador() {
        Marcador marcador = Marcador.getInstance();
        System.out.println("Marcador actual -> " + marcador.getMarcador());
    }

    public void finalizarJuego() {
        Marcador marcador = Marcador.getInstance();
        marcador.reiniciarMarcador();
        System.out.println("El marcador ha sido reiniciado.");
    }
}