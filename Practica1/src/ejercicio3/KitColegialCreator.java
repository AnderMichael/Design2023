package ejercicio3;

import java.util.List;

public class KitColegialCreator extends KitCreator {

	@Override
	public IKitMateriales createKit() {
		KitColegial kitColegial = new KitColegial();
		kitColegial.setMochila(new Mochila(7, 60));
		kitColegial.setLibros(List.of(new Libro("Jaime Aduana", "Patriotico"), new Libro("Adela Zamudio", "Historico"),
				new Libro("Vanessa Giacoman", "Terror")));
		kitColegial.setComputadora(new Computadora("Dell", "Windows 10"));
		return kitColegial;
	}

}
