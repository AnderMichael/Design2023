package exercise;

public class LaunchPasajes {

	public static void main(String[] args) {
		Pasajero pasajeros[] = { new Pasajero("Ander", "123"), new Pasajero("Enrique", "129"),
				new Pasajero("Jose", "134"), new Pasajero("Amy", "179"), new Pasajero("Hugo", "124"),
				new Pasajero("Vivs", "189") };


		PasajeStandard pasajeStandard1 = (PasajeStandard) PasajesGenerator.make("PasajeStandard");
		pasajeStandard1.setPasajero(pasajeros[0]);
		pasajeStandard1.setNumeroAsiento(12);

		PasajeStandard pasajeStandard2 = (PasajeStandard) PasajesGenerator.make("PasajeStandard");
		pasajeStandard2.setPasajero(pasajeros[1]);
		pasajeStandard2.setNumeroAsiento(14);

		PasajeSolidario pasajeSolidario1 = (PasajeSolidario) PasajesGenerator.make("PasajeSolidario");
		pasajeSolidario1.setPasajero(pasajeros[2]);
		pasajeSolidario1.setNumeroAsiento(16);

		PasajeSolidario pasajeSolidario2 = (PasajeSolidario) PasajesGenerator.make("PasajeSolidario");
		pasajeSolidario2.setPasajero(pasajeros[3]);
		pasajeSolidario2.setNumeroAsiento(18);

		PasajeInfantes pasajeInfantes1 = (PasajeInfantes) PasajesGenerator.make("PasajeInfantes");
		pasajeInfantes1.setPasajero(pasajeros[4]);
		pasajeInfantes1.setNumeroAsiento(20);

		PasajeInfantes pasajeInfantes2 = (PasajeInfantes) PasajesGenerator.make("PasajeInfantes");
		pasajeInfantes2.setPasajero(pasajeros[5]);
		pasajeInfantes2.setNumeroAsiento(20);

		pasajeStandard1.showInfoPasaje();
		pasajeStandard2.showInfoPasaje();
		pasajeSolidario1.showInfoPasaje();
		pasajeSolidario2.showInfoPasaje();
		pasajeInfantes1.showInfoPasaje();
		pasajeInfantes2.showInfoPasaje();

	}

}
