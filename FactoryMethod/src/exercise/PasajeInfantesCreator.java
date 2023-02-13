package exercise;

public class PasajeInfantesCreator extends PasajeCreator {
	private Pasajero pasajero;
	private int numeroAsiento;

	public PasajeInfantesCreator(Pasajero pasajero, int numeroAsiento) {
		this.pasajero = pasajero;
		this.numeroAsiento = numeroAsiento;
	}

	@Override
	public PasajeInfantes createPasaje() {
		PasajeInfantes pasajeInfantes = new PasajeInfantes();

		// Sobre el Avion
		Avion avion = new Avion("Boa", 20000, "LandScape", 150);
		// Sobre el Destino
		Destino destino = new Destino("Argentina", "Buenos Aires", "Aeropuerto de la ciudad de Buenos Aires");
		// Sobre el numero de vuelo
		int numeroVuelo = 15;
		// Sobre el Origen
		Origen origen = new Origen("Bolivia", "Santa Cruz", "Viru Viru");

		pasajeInfantes.setAvion(avion);
		pasajeInfantes.setCostoPasajeEspecial(90.00);
		pasajeInfantes.setDestino(destino);
		pasajeInfantes.setNumeroAsiento(numeroAsiento);
		pasajeInfantes.setNumeroVuelo(numeroVuelo);
		pasajeInfantes.setOrigen(origen);
		pasajeInfantes.setPasajero(pasajero);
		
		pasajeInfantes.confirm();
		
		return pasajeInfantes;
	}

}
