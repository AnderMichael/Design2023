package ejercicio3;

public class Mochila {
	private int nroBolsillos;
	private int tamanio;

	public int getNroBolsillos() {
		return nroBolsillos;
	}

	public void setNroBolsillos(int nroBolsillos) {
		this.nroBolsillos = nroBolsillos;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public Mochila(int nroBolsillos, int tamanio) {
		this.nroBolsillos = nroBolsillos;
		this.tamanio = tamanio;
	}

	public void showInfo() {
		System.out.println("********Mochila********");
		System.out.println("Nro Bolsillos: " + nroBolsillos);
		System.out.println("Tamanio: " + tamanio);
		System.out.println("***********************");
	}
}
