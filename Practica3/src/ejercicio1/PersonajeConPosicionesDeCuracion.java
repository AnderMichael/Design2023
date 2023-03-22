package ejercicio1;

public class PersonajeConPosicionesDeCuracion extends Personaje {
	private Personaje personaje;

	public PersonajeConPosicionesDeCuracion(Personaje personaje) {
		super(personaje.getNombre());
		this.personaje = personaje;
		super.setNivel(personaje.getNivel());
		super.setRegeneracion(personaje.getRegeneracion() + 80);
		super.setPorcentajeArmadura(personaje.getPorcentajeArmadura());
		super.setPuntosAtaque(personaje.getPuntosAtaque());
		super.setPuntosDefensa(personaje.getPuntosDefensa());
		super.setArmas(personaje.getArmas());
	}

	@Override
	public void mostrarHabilidades() {
		super.mostrarHabilidades();
		System.out.println(String.format("El personaje %s puede regenerarse!", personaje.getNombre()));
	}
}
