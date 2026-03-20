public class Mascota {
    // Atributos privados [cite: 451, 507-512]
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private double peso;

    // Constructor que invoca a los setters [cite: 453, 513-521]
    public Mascota(String nombre, String especie, String raza, int edad, double peso) {
        setNombre(nombre);
        setEspecie(especie);
        setRaza(raza);
        setEdad(edad);
        setPeso(peso);
    }

    // Setters con validaciones [cite: 494, 499-504]
    public void setNombre(String nombre) {
        this.nombre = (nombre == null || nombre.trim().isEmpty()) ? "Sin nombre" : nombre.trim();
    }

    public void setEspecie(String especie) {
        this.especie = (especie == null || especie.trim().isEmpty()) ? "Desconocida" : especie.trim();
    }

    public void setRaza(String raza) {
        this.raza = (raza == null || raza.trim().isEmpty()) ? "Mestizo" : raza.trim();
    }

    public void setEdad(int edad) {
        this.edad = (edad < 0) ? 0 : edad;
    }

    public void setPeso(double peso) {
        this.peso = (peso <= 0) ? 0.1 : peso;
    }

    // Getters [cite: 494]
    public String getNombre() { return nombre; }
    public String getEspecie() { return especie; }
    public String getRaza() { return raza; }
    public int getEdad() { return edad; }
    public double getPeso() { return peso; }

    // Métodos adicionales [cite: 495-498]
    public boolean esAdulto() {
        return this.edad >= 3;
    }

    public boolean estaEnPesoNormal(double pesoMin, double pesoMax) {
        return this.peso >= pesoMin && this.peso <= pesoMax;
    }

    @Override
    public String toString() {
        return "Mascota [Nombre: " + nombre + ", Especie: " + especie + 
               ", Raza: " + raza + ", Edad: " + edad + ", Peso: " + peso + "]";
    }
}