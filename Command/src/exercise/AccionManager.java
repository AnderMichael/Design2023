package exercise;

import java.util.ArrayList;
import java.util.List;

public class AccionManager {
	private List<Accion> accionesNiveles = new ArrayList<>();

	public void addAction(Accion accion) {
		accionesNiveles.add(accion);
	}

	public void mostrarAccionesPorNivel() {
		for (int i = 0; i < accionesNiveles.size(); i++) {
			System.out.println(String.format("=== Acciones programadas -> Nivel %d ===", i + 1));
			accionesNiveles.get(i).execute();
		}
	}
}
