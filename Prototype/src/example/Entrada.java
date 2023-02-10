package example;

public class Entrada {
    private int numeroAsiento;
    private String nombre;

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Entrada(int numeroAsiento, String nombre) {
        this.numeroAsiento = numeroAsiento;
        this.nombre = nombre;
    }

    public String mostrarInfo() {
        return "Info: " + numeroAsiento + " " + nombre;
    }
}
