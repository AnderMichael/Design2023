package exercise;

public class LaunchJuegoDePeleas {

	public static void main(String[] args) {
		Personaje personaje = new Personaje("Andersaurio", 100);
		personaje.showInfo();

		AccionManager accionManager = new AccionManager();
		AccionCorrer accion1 = new AccionCorrer(personaje);
		AccionRegeneracion accion2 = new AccionRegeneracion(personaje);
		AccionAtacar accion3 = new AccionAtacar(personaje);
		AccionContraataque accion4 = new AccionContraataque(personaje);

		accionManager.addAction(accion1);
		accionManager.addAction(accion2);
		accionManager.addAction(accion3);
		accionManager.addAction(accion4);
		
		accionManager.mostrarAccionesPorNivel();
	}

}
