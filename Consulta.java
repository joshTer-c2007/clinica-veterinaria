public class Consulta {

    // 1. ATRIBUTOS (datos de la consulta)
    private String fecha;
    private String motivo;
    private String diagnostico;
    private double costo;
    private boolean requiereCirugia;

    // 2. CONSTRUCTOR
    public Consulta(String fecha, String motivo, String diagnostico, double costo, boolean requiereCirugia) {
        setFecha(fecha);
        setMotivo(motivo);
        setDiagnostico(diagnostico);
        setCosto(costo);
        setRequiereCirugia(requiereCirugia);
    }

    // 3. SETTERS (para asignar valores con validación)

    public void setFecha(String fecha) {
        if (fecha == null || fecha.trim().isEmpty()) {
            this.fecha = "01/01/2000";
        } else {
            this.fecha = fecha;
        }
    }

    public void setMotivo(String motivo) {
        if (motivo == null || motivo.trim().isEmpty()) {
            this.motivo = "Sin motivo";
        } else {
            this.motivo = motivo;
        }
    }

    public void setDiagnostico(String diagnostico) {
        if (diagnostico == null || diagnostico.trim().isEmpty()) {
            this.diagnostico = "Pendiente";
        } else {
            this.diagnostico = diagnostico;
        }
    }

    public void setCosto(double costo) {
        if (costo <= 0) {
            this.costo = 1.0;
        } else {
            this.costo = costo;
        }
    }

    public void setRequiereCirugia(boolean requiereCirugia) {
        this.requiereCirugia = requiereCirugia;
    }

    // 4. GETTERS (para obtener valores)

    public String getFecha() {
        return fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public double getCosto() {
        return costo;
    }

    public boolean getRequiereCirugia() {
        return requiereCirugia;
    }

    // 5. MÉTODOS IMPORTANTES

    public String calcularCategoriaCosto() {
        if (costo < 50) {
            return "Bajo";
        } else if (costo < 150) {
            return "Medio";
        } else {
            return "Alto";
        }
    }

    public boolean esCritica() {
        if (requiereCirugia == true && costo > 200) {
            return true;
        } else {
            return false;
        }
    }

    // 6. MOSTRAR DATOS

    public String toString() {
        return "Consulta: Fecha=" + fecha +
               ", Motivo=" + motivo +
               ", Diagnostico=" + diagnostico +
               ", Costo=" + costo +
               ", Cirugia=" + requiereCirugia;
    }
}