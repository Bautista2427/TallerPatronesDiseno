package co.edu.uniquindio.patrones.singleton;

// Clase Marcador con Singleton
public class Marcador {
    private static Marcador instance; // instancia única

    private int puntosEquipo1;
    private int puntosEquipo2;

    // Constructor privado
    private Marcador() {
        puntosEquipo1 = 0;
        puntosEquipo2 = 0;
    }

    // Método estático para obtener la instancia
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
