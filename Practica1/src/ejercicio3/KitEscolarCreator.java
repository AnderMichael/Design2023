package ejercicio3;

import java.util.List;

public class KitEscolarCreator extends KitCreator {

	@Override
	public IKitMateriales createKit() {
		KitEscolar kitEscolar = new KitEscolar();
		kitEscolar.setMochila(new Mochila(5, 30));
		kitEscolar.setDeportivo(new Deportivo("XL", "Green", 4));
		kitEscolar.setCuadernos(
				List.of(new Cuaderno("Anillado", 500), new Cuaderno("Simple", 100), new Cuaderno("Tapper", 400)));
		return kitEscolar;
	}

}
