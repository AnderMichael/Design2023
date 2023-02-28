package exercise;

import java.util.ArrayList;
import java.util.List;

public class BDPersonas {
	private List<Persona> personas = new ArrayList<>();

	public void addPersona(Persona persona) {
		personas.add(persona);
	}

	public void showInfo() {
		System.out.println("===== ListaPersonas =====");
		personas.forEach(bdPersona -> bdPersona.showInfo());
		System.out.println("=========================");
	}

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

}
