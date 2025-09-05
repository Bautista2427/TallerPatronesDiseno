package co.edu.uniquindio.patrones.builder;

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

        System.out.println("Persona Básica: " +"\n"+ personaBasica.getNombre() + " " + personaBasica.getApellido() +"\n");
        System.out.println("Persona Completa: " +"\n"+ personaCompleta.getNombre() + personaCompleta.getApellido()
                +"\n"+ "Cedula:"+personaCompleta.getCedula()
                +"\n"+ "Correo:"+personaCompleta.getEmail()
                +"\n"+ "Telefono:"+ personaCompleta.getTelefono());
    }
}