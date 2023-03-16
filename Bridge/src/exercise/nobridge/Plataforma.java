package exercise.nobridge;

public abstract class Plataforma {

	private String arquitectura;
	private String nombre;
	private String version;

	public String getArquitectura() {
		return arquitectura;
	}

	public void setArquitectura(String arquitectura) {
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

	public Plataforma(String arquitectura, String nombre, String version) {
		this.arquitectura = arquitectura;
		this.nombre = nombre;
		this.version = version;
	}

	public abstract void showInfo();

}
