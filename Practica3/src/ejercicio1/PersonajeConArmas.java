package ejercicio1;

public class PersonajeConArmas extends Personaje {
	private Personaje personaje;

	public PersonajeConArmas(Personaje personaje) {
		super(personaje.getNombre());
		this.personaje = personaje;
		super.setArmas(personaje.getArmas());
		super.addArma("Espada");
		super.addArma("Escopeta");
		super.addArma("Hacha");
		super.setNivel(personaje.getNivel() * 2);
		super.setPuntosAtaque(personaje.getPuntosAtaque() + 30);
		super.setPorcentajeArmadura(personaje.getPorcentajeArmadura());
		super.setPuntosDefensa(personaje.getPuntosDefensa());
		super.setRegeneracion(personaje.getRegeneracion());
	}

	@Override
	public void mostrarHabilidades() {
		super.mostrarHabilidades();
		System.out.println(String.format("El personaje %s esta armado!", personaje.getNombre()));
	}
}
