package exercise;

public class PasajeSolidarioCreator extends PasajeCreator {
	private Pasajero pasajero;
	private int numeroAsiento;

	public PasajeSolidarioCreator(Pasajero pasajero, int numeroAsiento) {
		this.pasajero = pasajero;
		this.numeroAsiento = numeroAsiento;
	}

	@Override
	public PasajeSolidario createPasaje() {
		PasajeSolidario pasajeSolidario = new PasajeSolidario();

		// Sobre el Avion
		Avion avion = new Avion("Boa", 20000, "LandScape", 150);
		// Sobre el Destino
		Destino destino = new Destino("Argentina", "Buenos Aires", "Aeropuerto de la ciudad de Buenos Aires");
		// Sobre el numero de vuelo
		int numeroVuelo = 15;
		// Sobre el origen
		Origen origen = new Origen("Bolivia", "Santa Cruz", "Viru Viru");
		//Sobre el descuento
		double descuento = 3.00;
		
		pasajeSolidario.setAvion(avion);
		pasajeSolidario.setCostoPasaje(150.00);
		pasajeSolidario.setDescuento(descuento);
		pasajeSolidario.setDestino(destino);
		pasajeSolidario.setMotivoDescuento("Regalito de Navidad!");
		pasajeSolidario.setNumeroAsiento(numeroAsiento);
		pasajeSolidario.setNumeroVuelo(numeroVuelo);
		pasajeSolidario.setOrigen(origen);
		pasajeSolidario.setPasajero(pasajero);
		
		pasajeSolidario.confirm();
		
		return pasajeSolidario;
	}

}
