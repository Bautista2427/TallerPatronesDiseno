package co.edu.uniquindio.patrones.diseno;

import co.edu.uniquindio.patrones.diseno.model.Persona;
import co.edu.uniquindio.patrones.diseno.model.builder.PersonaBuilder;

public class Main {
    public static void main(String[] args) {
        Persona personaBasica = new PersonaBuilder("Juan", "Perez", "12345678")
                .build();

        Persona personaCompleta = new PersonaBuilder("Ana", "Gomez", "87654321")
                .email("ana.gomez@email.com")
                .telefono("3123456789")
                .direccion("Calle Falsa 123")
                .edad("30")
                .build();

        System.out.println("Persona Básica: " + personaBasica.getNombre() + " " + personaBasica.getApellido());
        System.out.println("Persona Completa: " + "\n" + personaCompleta.getNombre() + personaCompleta.getApellido()+"\n"+"Cedula:"+personaCompleta.getCedula()+"\n"+"Correo:"+personaCompleta.getEmail() +"\n"+"Telefono:"+ personaCompleta.getTelefono());
    }
}
