package ejercicio5;

public class Git implements ControlVersiones {
	private Proyecto lastVersionProyecto;

	@Override
	public Proyecto getLastVersion() {
		return lastVersionProyecto;
	}

	@Override
	public void setLastVersion(Proyecto proyecto) {
		lastVersionProyecto = proyecto.clone();
	}

}
