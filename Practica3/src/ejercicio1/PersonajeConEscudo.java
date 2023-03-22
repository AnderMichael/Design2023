package ejercicio1;

public class PersonajeConEscudo extends Personaje {
	private Personaje personaje;

	public PersonajeConEscudo(Personaje personaje) {
		super(personaje.getNombre());
		this.personaje = personaje;
		super.setNivel(personaje.getNivel());
		super.setArmas(personaje.getArmas());
		super.setPorcentajeArmadura(personaje.getPorcentajeArmadura());
		super.setPuntosAtaque(personaje.getPuntosAtaque());
		super.setPuntosDefensa(personaje.getPuntosDefensa() + 35);
		super.setPorcentajeArmadura(personaje.getPorcentajeArmadura() + 10);
	}

	@Override
	public void mostrarHabilidades() {
		super.mostrarHabilidades();
		System.out.println(String.format("El personaje %s esta protegido!", personaje.getNombre()));
	}
}
