package ejercicio3;

import java.util.List;

public class KitColegial implements IKitMateriales {
	private Mochila mochila;
	private List<Libro> libros;
	private Computadora computadora;

	public Mochila getMochila() {
		return mochila;
	}

	public void setMochila(Mochila mochila) {
		this.mochila = mochila;
	}

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	public Computadora getComputadora() {
		return computadora;
	}

	public void setComputadora(Computadora computadora) {
		this.computadora = computadora;
	}

	@Override
	public void showInfo() {
		System.out.println("Kit Colegial");
		System.out.println("=====================");
		mochila.showInfo();
		System.out.println("\nLibros:");
		for (Libro libro : libros) {
			libro.showInfo();
		}
		computadora.showInfo();
		System.out.println("=====================");
	}

}
