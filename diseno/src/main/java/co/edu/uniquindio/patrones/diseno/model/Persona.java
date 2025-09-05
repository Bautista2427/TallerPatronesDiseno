package co.edu.uniquindio.patrones.diseno.model;

public class Persona {
    private String nombre;
    private String apellido;
    private String cedula;

    private String email;
    private String telefono;
    private String direccion;
    private String edad;

    public Persona(String cedula, String nombre, String apellido,
                   String email, String telefono, String direccion, String edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public static class PersonaBuilder {
        public PersonaBuilder(String juan, String perez, String number) {
        }
        public Object withTelefono(String mail) {
            return null;
        }
        public Object withEmail(String mail) {
            return null;
        }
    }
}
