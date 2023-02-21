package ejercicio3;

public class Cuaderno {
	private String tipo;
	private int nroHojas;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNroHojas() {
		return nroHojas;
	}

	public void setNroHojas(int nroHojas) {
		this.nroHojas = nroHojas;
	}

	public Cuaderno(String tipo, int nroHojas) {
		this.tipo = tipo;
		this.nroHojas = nroHojas;
	}

	public void showInfo() {
		System.out.println("********Cuaderno********");
		System.out.println("Tipo: " + tipo);
		System.out.println("NroHojas: " + nroHojas);
		System.out.println("************************");
	}

}
