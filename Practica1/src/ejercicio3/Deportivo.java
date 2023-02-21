package ejercicio3;

public class Deportivo {
	private String talla;
	private String color;
	private int numeroDePrendas;

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumeroDePrendas() {
		return numeroDePrendas;
	}

	public void setNumeroDePrendas(int numeroDePrendas) {
		this.numeroDePrendas = numeroDePrendas;
	}

	public Deportivo(String talla, String color, int numeroDePrendas) {
		this.talla = talla;
		this.color = color;
		this.numeroDePrendas = numeroDePrendas;
	}

	public void showInfo() {
		System.out.println("********Deportivo********");
		System.out.println("Talla: " + talla);
		System.out.println("Color: " + color);
		System.out.println("NroDePrendas: " + numeroDePrendas);
		System.out.println("*************************");
	}
}
