package exercise;

public class Fail {
	private String titulo;
	private String severidad;
	private String descripcion;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSeveridad() {
		return severidad;
	}

	public void setSeveridad(String severidad) {
		this.severidad = severidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void showInfo() {
		System.out.println("\n*****Fail*****");
		System.out.format("Titulo: %s\n", titulo);
		System.out.format("Severidad: %s\n", severidad);
		System.out.format("Descripcion: %s\n", descripcion);
	}
}
