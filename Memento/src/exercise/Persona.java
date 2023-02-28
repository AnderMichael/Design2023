package exercise;

public class Persona {
	private String nombre;
	private String ci;
	private int edad;

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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Persona(String nombre, String ci, int edad) {
		this.nombre = nombre;
		this.ci = ci.replace(".", "").replace("/", "").substring(3);
		this.edad = edad / 100;
	}

	public void showInfo() {
		System.out.println("*****Persona******");
		System.out.format("Nombre: %s\n", nombre);
		System.out.format("CI: %s\n", ci);
		System.out.format("Edad: %d\n", edad);
		System.out.println();
	}
}
