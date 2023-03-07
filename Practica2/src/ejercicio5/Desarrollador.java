package ejercicio5;

public class Desarrollador implements SuscriptorGitHub {
	private String nombre;
	private String id;

	public Desarrollador(String nombre, String id) {
		this.nombre = nombre;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public void showChangesNotification(String message) {
		System.out.println(String.format("===== Bandeja de mensajes - %s =====", nombre));
		System.out.println(String.format("%s", message));
		System.out.println("===================================");
	}

}
