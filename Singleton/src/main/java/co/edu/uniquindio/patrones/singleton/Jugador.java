package co.edu.uniquindio.patrones.singleton;

public class Jugador {
    private String nombre;
    private int numeroEquipo;

    public Jugador(String nombre, int numeroEquipo) {
        this.nombre = nombre;
        this.numeroEquipo = numeroEquipo;
    }

    public void anotar() {
        Marcador marcador = Marcador.getInstance();
        if (numeroEquipo == 1) {
            marcador.anotarEquipo1();
            System.out.println(nombre + " anotó 3 puntos para el Equipo 1");
        } else if (numeroEquipo == 2) {
            marcador.anotarEquipo2();
            System.out.println(nombre + " anotó 3 puntos para el Equipo 2");
        }
    }
}