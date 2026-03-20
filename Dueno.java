public class Dueno {

    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String cedula;

    public Dueno(String nombre, String apellido, String telefono, String email, String cedula) {
        setNombre(nombre);
        setApellido(apellido);
        setTelefono(telefono);
        setEmail(email);
        setCedula(cedula);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            this.nombre = "Desconocido";
        } else {
            this.nombre = nombre.trim();
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido == null || apellido.trim().isEmpty()) {
            this.apellido = "Desconocido";
        } else {
            this.apellido = apellido.trim();
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono != null && telefono.matches("\\d{10}")) {
            this.telefono = telefono;
        } else {
            this.telefono = "0000000000";
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null) {
            email = email.trim();
            int arroba = email.indexOf("@");
            int punto = email.lastIndexOf(".");
            if (arroba > 0 && punto > arroba) {
                this.email = email;
                return;
            }
        }
        this.email = "sin@email.com";
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        if (cedula == null || cedula.trim().isEmpty()) {
            this.cedula = "0000000000";
        } else {
            this.cedula = cedula.trim();
        }
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public boolean tieneEmailValido() {
        int arroba = email.indexOf("@");
        int punto = email.lastIndexOf(".");
        return arroba > 0 && punto > arroba;
    }

    public String toString() {
        return "Dueno: " + getNombreCompleto() +
               "\nTelefono: " + telefono +
               "\nEmail: " + email +
               "\nCedula: " + cedula;
    }
}