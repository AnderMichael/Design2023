package exercise;

public class AccionContraataque extends Accion {

	public AccionContraataque(Personaje personaje) {
		super(personaje);
	}

	@Override
	public void execute() {
		super.getPersonaje().correr();
		super.getPersonaje().saltar();
		super.getPersonaje().correr();
		super.getPersonaje().saltar();
		super.getPersonaje().protegerse();
		super.getPersonaje().golpear();
		super.getPersonaje().curarse();
		super.getPersonaje().correr();
	}
}
