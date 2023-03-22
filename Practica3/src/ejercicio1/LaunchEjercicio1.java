package ejercicio1;

public class LaunchEjercicio1 {
	public static void main(String[] args) {
		Personaje personaje = new Personaje("Andersaurio");
		personaje.mostrarHabilidades();

		personaje = new PersonajeConArmas(personaje);
		personaje.mostrarHabilidades();

		personaje = new PersonajeConEscudo(personaje);
		personaje.mostrarHabilidades();

		personaje = new PersonajeConPosicionesDeCuracion(personaje);
		personaje.mostrarHabilidades();
	}
}
