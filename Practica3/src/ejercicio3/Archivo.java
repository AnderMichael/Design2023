package ejercicio3;

public class Archivo implements ObjetoGuardable {
	private String contenido;
	private int cantidadPalabras;

	public Archivo(String contenido) {
		this.contenido = contenido;
		setCantidadPalabras(contenido.split(" ").length);
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
		setCantidadPalabras(contenido.split(" ").length);
	}

	public int getCantidadPalabras() {
		return cantidadPalabras;
	}

	public void setCantidadPalabras(int cantidadPalabras) {
		this.cantidadPalabras = cantidadPalabras;
	}

	@Override
	public void showGuardable() {
		System.out.println("=====Archivo=====");
		System.out.println("Contenido: " + contenido);
		System.out.println("Cantidad de palabras: " + cantidadPalabras);
		System.out.println("=================");
	}

}
