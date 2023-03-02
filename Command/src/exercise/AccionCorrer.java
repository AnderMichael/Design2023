package exercise;

public class AccionCorrer extends Accion {

	public AccionCorrer(Personaje personaje) {
		super(personaje);
	}

	@Override
	public void execute() {
		super.getPersonaje().correr();
	}
}
