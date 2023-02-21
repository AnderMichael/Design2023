package ejercicio3;

public class Libro {
	private String autor;
	private String tipo;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Libro(String autor, String tipo) {
		this.autor = autor;
		this.tipo = tipo;
	}

	public void showInfo() {
		System.out.println("********Libro********");
		System.out.println("Autor: " + autor);
		System.out.println("Tipo: " + tipo);
		System.out.println("*********************");
	}
}
