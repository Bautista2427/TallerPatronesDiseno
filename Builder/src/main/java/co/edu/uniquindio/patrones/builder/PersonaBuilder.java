package co.edu.uniquindio.patrones.builder;

public class PersonaBuilder {
    private String nombre;
    private String apellido;
    private String cedula;
    private String email;
    private String telefono;
    private String direccion;
    private String edad;

    public PersonaBuilder(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public PersonaBuilder email(String email) {
        this.email = email;
        return this;
    }

    public PersonaBuilder telefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public PersonaBuilder direccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public PersonaBuilder edad(String edad) {
        this.edad = edad;
        return this;
    }

    public Persona build() {
        return new Persona(cedula, nombre, apellido, email, telefono, direccion, edad);
    }
}