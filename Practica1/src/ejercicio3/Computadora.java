package ejercicio3;

public class Computadora {
	private String marca;
	private String sistemaOperativo;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public Computadora(String marca, String sistemaOperativo) {
		this.marca = marca;
		this.sistemaOperativo = sistemaOperativo;
	}

	public void showInfo() {
		System.out.println("********Computadora********");
		System.out.println("Marca: " + marca);
		System.out.println("Sistema Operativo: " + sistemaOperativo);
		System.out.println("***************************");
	}

}
