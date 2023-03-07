package ejercicio4;

public class Mensaje {
	private String contenido;
	private boolean publico;
	private Usuario receptor;

	public Mensaje(String contenido, boolean publico) {
		this.contenido = contenido;
		this.publico = publico;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public boolean isPublico() {
		return publico;
	}

	public void setPublico(boolean publico) {
		this.publico = publico;
	}

	public Usuario getReceptor() {
		return receptor;
	}

	public void setReceptor(Usuario receptor) {
		this.receptor = receptor;
	}

}
