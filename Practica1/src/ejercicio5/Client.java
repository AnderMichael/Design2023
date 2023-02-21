package ejercicio5;

public class Client {
	private String nombre;
	private String ci;

	public Client(String nombre, String ci) {
		this.nombre = nombre;
		this.ci = ci;
	}

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

	public void ordenar(Cocinero cocinero, String orden) {
		cocinero.cocinar(orden);
	}

	public void showInfo() {
		System.out.println("----------Cliente-----------");
		System.out.println("Nombre: " + nombre);
		System.out.println("CI: " + ci);
		System.out.println("----------------------------");
	}

}
