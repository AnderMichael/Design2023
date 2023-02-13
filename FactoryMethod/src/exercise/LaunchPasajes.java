package exercise;

public class LaunchPasajes {

	public static void main(String[] args) {

		PasajeStandard pasajeStandard1 = new PasajeStandardCreator(new Pasajero("Ander", "123"), 12).createPasaje();
		pasajeStandard1.showInfoPasaje();
		PasajeStandard pasajeStandard2 = new PasajeStandardCreator(new Pasajero("Hugo", "124"), 14).createPasaje();
		pasajeStandard2.showInfoPasaje();

		PasajeSolidario pasajeSolidario1 = new PasajeSolidarioCreator(new Pasajero("Enrique", "129"), 32)
				.createPasaje();
		pasajeSolidario1.showInfoPasaje();
		PasajeSolidario pasajeSolidario2 = new PasajeSolidarioCreator(new Pasajero("Jose", "134"), 30).createPasaje();
		pasajeSolidario2.showInfoPasaje();

		PasajeInfantes pasajeInfantes1 = new PasajeInfantesCreator(new Pasajero("Amy", "179"), 1).createPasaje();
		pasajeInfantes1.showInfoPasaje();
		PasajeInfantes pasajeInfantes2 = new PasajeInfantesCreator(new Pasajero("Vivs", "189"), 2).createPasaje();
		pasajeInfantes2.showInfoPasaje();
	}

}
