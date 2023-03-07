package ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class LaunchDiscord {

	public static void main(String[] args) {
		Discord discord = new Discord();

		List<Usuario> desarrolladores = new ArrayList<>();
		discord.setUsuarios(desarrolladores);
		desarrolladores.add(new Desarrollador("Ander", "Andersaurio"));
		desarrolladores.add(new Desarrollador("Enrique", "eavm"));
		desarrolladores.add(new Desarrollador("Hugo", "Huguito"));
		desarrolladores.add(new Desarrollador("Ambar", "Amy"));
		desarrolladores.add(new Desarrollador("Jose", "BuenJose"));

		for (Usuario desarrollador : desarrolladores) {
			desarrollador.setComunicationChannel(discord);
		}

		desarrolladores.get(0).sendGlobalMessage("Voy a realizar mi parte en cuanto me libre del trabajo");

		desarrolladores.get(0).sendPersonalMessage("Ya terminaste el informe?", desarrolladores.get(4));

	}

}
