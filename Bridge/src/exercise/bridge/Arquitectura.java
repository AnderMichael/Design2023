package exercise.bridge;

public abstract class Arquitectura {

	private String nombre;

	public Arquitectura(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
