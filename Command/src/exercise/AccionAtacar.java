package exercise;

public class AccionAtacar extends Accion {

	public AccionAtacar(Personaje personaje) {
		super(personaje);
	}

	@Override
	public void execute() {
		super.getPersonaje().saltar();
		super.getPersonaje().correr();
		super.getPersonaje().golpear();
	}
}
