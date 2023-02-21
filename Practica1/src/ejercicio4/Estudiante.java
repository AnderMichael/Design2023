package ejercicio4;

public class Estudiante {
	private String nombre;
	private String ci;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public Estudiante(String nombre, String ci) {
		this.nombre = nombre;
		this.ci = ci;
	}

	public void showInfo() {
		System.out.println("--Estudiante--");
		System.out.println("Nombre: " + nombre);
		System.out.println("CI:" + ci);
		System.out.println("--------------");
	}

}
