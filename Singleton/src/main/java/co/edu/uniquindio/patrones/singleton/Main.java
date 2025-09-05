package co.edu.uniquindio.patrones.singleton;

public class Main {
    public static void main(String[] args) {
        // Se crean los actores del partido
        Juez juez = new Juez();
        Jugador jugadorEquipo1 = new Jugador("Michael", 1);
        Jugador jugadorEquipo2 = new Jugador("Larry", 2);

        System.out.println("Comienza el partida");

        // Los jugadores empiezan a anotar
        jugadorEquipo1.anotar();
        jugadorEquipo2.anotar();
        jugadorEquipo1.anotar();

        // El juez consulta el marcador en medio del juego
        juez.consultarMarcador(); // Salida esperada: Equipo 1: 6 - Equipo 2: 3

        // El partido termina, el juez reinicia el marcador
        System.out.println("\n Acaba el partido ");
        juez.finalizarJuego();

        // Se verifica que el marcador esté en cero
        juez.consultarMarcador(); // Salida esperada: Equipo 1: 0 - Equipo 2: 0
    }
}
