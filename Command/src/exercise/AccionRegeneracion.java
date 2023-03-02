package exercise;

public class AccionRegeneracion extends Accion {

	public AccionRegeneracion(Personaje personaje) {
		super(personaje);
	}

	@Override
	public void execute() {
		super.getPersonaje().protegerse();
		super.getPersonaje().curarse();
	}
}
