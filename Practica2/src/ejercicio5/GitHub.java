package ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class GitHub implements GestorVersiones, GestorComunidad {

	private List<Proyecto> proyectoVersiones = new ArrayList<>();
	private List<SuscriptorGitHub> suscriptores = new ArrayList<>();

	@Override
	public void addVersionProyecto(Proyecto proyecto) {
		proyectoVersiones.add(proyecto);
		notifyComunidad(String.format("Se aniadio una %d° version al proyecto", proyectoVersiones.size()));
	}

	@Override
	public Proyecto getVersionProyecto(int version) {
		Proyecto proyecto = proyectoVersiones.get(version - 1);
		notifyComunidad(String.format("Se hizo un checkout hacia la %d° version del proyecto", version));
		return proyecto;
	}

	@Override
	public void addSuscriptor(SuscriptorGitHub suscriptorGitHub) {
		suscriptores.add(suscriptorGitHub);
	}

	@Override
	public void removeSuscriptor(SuscriptorGitHub suscriptorGitHub) {
		suscriptores.remove(suscriptorGitHub);
	}

	@Override
	public void notifyComunidad(String message) {
		for (SuscriptorGitHub suscriptor : suscriptores) {
			suscriptor.showChangesNotification(message);
		}
	}

}
