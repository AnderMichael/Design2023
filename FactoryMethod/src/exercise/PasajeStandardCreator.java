package exercise;

public class PasajeStandardCreator extends PasajeCreator {
	private Pasajero pasajero;
	private int numeroAsiento;

	public PasajeStandardCreator(Pasajero pasajero, int numeroAsiento) {
		this.pasajero = pasajero;
		this.numeroAsiento = numeroAsiento;
	}

	@Override
	public PasajeStandard createPasaje() {
		PasajeStandard pasajeStandard = new PasajeStandard();

		// Sobre el Avion
		Avion avion = new Avion("Boa", 20000, "LandScape", 150);
		// Sobre el Destino
		Destino destino = new Destino("Argentina", "Buenos Aires", "Aeropuerto de la ciudad de Buenos Aires");
		// Sobre el numero de vuelo
		int numeroVuelo = 15;
		// Sobre el origen
		Origen origen = new Origen("Bolivia", "Santa Cruz", "Viru Viru");

		pasajeStandard.setAvion(avion);
		pasajeStandard.setCostoPasaje(150.00);
		pasajeStandard.setDestino(destino);
		pasajeStandard.setNumeroAsiento(numeroAsiento);
		pasajeStandard.setNumeroVuelo(numeroVuelo);
		pasajeStandard.setOrigen(origen);
		pasajeStandard.setPasajero(pasajero);

		pasajeStandard.confirm();

		return pasajeStandard;
	}

}
