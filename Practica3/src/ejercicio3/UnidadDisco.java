package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class UnidadDisco implements ObjetoGuardable {
	private int cantidadDePalabras;
	private List<ObjetoGuardable> guardables = new ArrayList<>();

	@Override
	public void showGuardable() {
		System.out.println("---Unidad de Disco---");
		System.out.println("Cantidad de palabras totales: " + cantidadDePalabras);
		System.out.println("Cantidad de guardables: " + guardables.size());
		System.out.println("Folders:");
		for (ObjetoGuardable guardable : guardables) {
			guardable.showGuardable();
		}
		System.out.println("---------------------");
	}

	public void setCantidadPalabras(int newCantidadPalabras) {
		cantidadDePalabras += newCantidadPalabras;
	}

	public int getCantidadDePalabras() {
		return cantidadDePalabras;
	}

	public void guardarFolder(Folder folder) {
		guardables.add(folder);
		setCantidadPalabras(folder.getCantidadDePalabras());
	}
}
