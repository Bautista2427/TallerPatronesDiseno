package co.edu.uniquindio.patrones.singleton;

public class Main {
    public static void main(String[] args) {

        Juez juez = new Juez();
        Jugador jugadorEquipo1 = new Jugador("Michael", 1);
        Jugador jugadorEquipo2 = new Jugador("Larry", 2);

        System.out.println("Comienza el partida");

        jugadorEquipo1.anotar();
        jugadorEquipo2.anotar();
        jugadorEquipo1.anotar();

        juez.consultarMarcador();

        System.out.println("\n Acaba el partido ");
        juez.finalizarJuego();

        juez.consultarMarcador();
    }
}