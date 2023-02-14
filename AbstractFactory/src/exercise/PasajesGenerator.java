package exercise;

import java.util.HashMap;

public class PasajesGenerator {

	// Sobre el Avion
	private static Avion avion = new Avion("Boa", 20000, "LandScape", 150);
	// Sobre el Destino
	private static Destino destino = new Destino("Argentina", "Buenos Aires",
			"Aeropuerto de la ciudad de Buenos Aires");
	// Sobre el numero de vuelo
	private static int numeroVuelo = 15;
	// Sobre el Origen
	private static Origen origen = new Origen("Bolivia", "Santa Cruz", "Viru Viru");

	private static IPasaje switchPasaje(String key) {
		switch (key) {
		case "PasajeInfantes": {
			return generatePasajeInfantes();
		}

		case "PasajeSolidario": {
			return generatePasajeSolidario();
		}

		case "PasajeStandard": {
			return generatePasajeStandard();
		}
		default:
			return null;
		}

	}

	private static PasajeInfantes generatePasajeInfantes() {
		PasajeInfantes pasaje = new PasajeInfantes();
		pasaje.setAvion(avion);
		pasaje.setCostoPasajeEspecial(90.00);
		pasaje.setDestino(destino);
		pasaje.setNumeroVuelo(numeroVuelo);
		pasaje.setOrigen(origen);
		pasaje.confirm();

		return pasaje;
	}

	private static PasajeSolidario generatePasajeSolidario() {
		PasajeSolidario pasaje = new PasajeSolidario();
		pasaje.setAvion(avion);
		pasaje.setCostoPasaje(150.00);
		pasaje.setDescuento(0.20);
		pasaje.setDestino(destino);
		pasaje.setMotivoDescuento("Regalito de Navidad!");
		pasaje.setNumeroVuelo(numeroVuelo);
		pasaje.setOrigen(origen);
		pasaje.confirm();

		return pasaje;
	}

	private static PasajeStandard generatePasajeStandard() {
		PasajeStandard pasaje = new PasajeStandard();
		pasaje.setAvion(avion);
		pasaje.setCostoPasaje(150.00);
		pasaje.setDestino(destino);
		pasaje.setNumeroVuelo(numeroVuelo);
		pasaje.setOrigen(origen);
		pasaje.confirm();

		return pasaje;
	}

	public static IPasaje make(String pasajeType) {
		IPasaje pasaje = switchPasaje(pasajeType);
		return pasaje;
	}

}
