package exercise;

public class TipoMoneda {
	private double valor;
	private String name;

	public TipoMoneda(double valor, String name) {
		this.valor = valor;
		this.name = name;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
