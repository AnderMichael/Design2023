package exercise;

public class Notificacion {
	private String titulo;
	private String message;
	private String type;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Notificacion(String message, String type) {
		this.message = message;
		this.type = type;
	}

}
