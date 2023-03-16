package exercise.bridge;

public abstract class Plataforma {

	private Arquitectura arquitectura;
	private String nombre;
	private String version;

	public Arquitectura getArquitectura() {
		return arquitectura;
	}

	public void setArquitectura(Arquitectura arquitectura) {
		this.arquitectura = arquitectura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Plataforma(String nombre, String version) {
		this.nombre = nombre;
		this.version = version;
	}
	
	public abstract void showInfo();

}
