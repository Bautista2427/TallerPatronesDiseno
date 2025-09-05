package co.edu.uniquindio.patrones.singleton;

public class Marcador {
    private static Marcador instance;

    private int puntosEquipo1;
    private int puntosEquipo2;

    private Marcador() {
        puntosEquipo1 = 0;
        puntosEquipo2 = 0;
    }

    public static Marcador getInstance() {
        if (instance == null) {
            instance = new Marcador();
        }
        return instance;
    }

    public void anotarEquipo1() {
        puntosEquipo1 += 3;
    }

    public void anotarEquipo2() {
        puntosEquipo2 += 3;
    }

    public String getMarcador() {
        return "Equipo 1: " + puntosEquipo1 + " - Equipo 2: " + puntosEquipo2;
    }

    public void reiniciarMarcador() {
        puntosEquipo1 = 0;
        puntosEquipo2 = 0;
    }
}