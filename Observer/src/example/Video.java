package example;

public class Video {
	private String id;
	private String titulo;
	private String categoria;

	public Video(String id, String titulo, String categoria) {
		this.id = id;
		this.titulo = titulo;
		this.categoria = categoria;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void showInfo() {
		System.out.println("*****Video*****");
		System.out.println(String.format("Id Video: %s", id));
		System.out.println(String.format("Titulo: %s", titulo));
		System.out.println(String.format("Categoria: %s", categoria));

	}
}
