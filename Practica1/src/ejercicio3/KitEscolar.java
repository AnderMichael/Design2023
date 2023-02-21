package ejercicio3;

import java.util.List;

public class KitEscolar implements IKitMateriales {
	private Mochila mochila;
	private Deportivo deportivo;
	private List<Cuaderno> cuadernos;

	public Mochila getMochila() {
		return mochila;
	}

	public void setMochila(Mochila mochila) {
		this.mochila = mochila;
	}

	public Deportivo getDeportivo() {
		return deportivo;
	}

	public void setDeportivo(Deportivo deportivo) {
		this.deportivo = deportivo;
	}

	public List<Cuaderno> getCuadernos() {
		return cuadernos;
	}

	public void setCuadernos(List<Cuaderno> cuadernos) {
		this.cuadernos = cuadernos;
	}

	@Override
	public void showInfo() {
		System.out.println("Kit Escolar");
		System.out.println("=====================");
		mochila.showInfo();
		deportivo.showInfo();
		System.out.println("\nCuadernos:");
		for (Cuaderno cuaderno : cuadernos) {
			cuaderno.showInfo();
		}
			System.out.println("=====================");
	}

}
