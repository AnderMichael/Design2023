package ejercicio4;

public class LaunchEjercicio4 {

	public static void main(String[] args) {
		WhatsApp whatsApp = new WhatsApp();
		Usuario usuarios[] = { new Usuario("Andersuario", "757483", whatsApp),
				new Usuario("Amysan", "564739", whatsApp), new Usuario("Chefcito", "575849", whatsApp),
				new Usuario("Pablito", "473839", whatsApp), new Usuario("Emita", "574839", whatsApp),
				new Usuario("Lagu", "567548", whatsApp), new Usuario("Kat", "474839", whatsApp),
				new Usuario("BuenJose", "292930", whatsApp), new Usuario("Luty", "5748393", whatsApp),
				new Usuario("Mateo", "901020", whatsApp) };

		for (Usuario usuario : usuarios) {
			whatsApp.addUsuario(usuario);
		}

		usuarios[0].enviarMensajePrivado(usuarios[1], "No te olvides vernos en la estacion de buses!");

		usuarios[9].enviarMensajePublico("Estan listos para la Madness??!!");
	}
}
