package exercise;

import template.ICommand;

public abstract class Accion implements ICommand {
	private Personaje personaje;

	public Accion(Personaje personaje) {
		this.personaje = personaje;
	}

	public Personaje getPersonaje() {
		return personaje;
	}

	public void setPersonaje(Personaje personaje) {
		this.personaje = personaje;
	}
}
