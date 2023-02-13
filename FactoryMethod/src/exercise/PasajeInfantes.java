package exercise;

public class PasajeInfantes implements IPasaje {
	private int numeroVuelo;
	private Destino destino;
	private Origen origen;
	private Avion avion;
	private Pasajero pasajero;
	private int numeroAsiento;
	private double costoPasajeEspecial;

	@Override
	public void confirm() {
		System.out.println();
		System.out.println("Se esta creando un pasaje de infantes...");
		System.out.println();
	}

	@Override
	public void showInfoPasaje() {
		System.out.println("Numero de Vuelo: " + numeroVuelo);
		System.out.println("Destino...");
		destino.showInfo();
		System.out.println("Origen...");
		origen.showInfo();
		System.out.println("Avion...");
		avion.showInfo();
		System.out.println("Pasajero...");
		pasajero.showInfo();
		System.out.println("Numero de asiento: " + numeroAsiento);
		System.out.println("Costo del Pasaje Especial: " + costoPasajeEspecial);
	}

	public int getNumeroVuelo() {
		return numeroVuelo;
	}

	public void setNumeroVuelo(int numeroVuelo) {
		this.numeroVuelo = numeroVuelo;
	}

	public Destino getDestino() {
		return destino;
	}

	public void setDestino(Destino destino) {
		this.destino = destino;
	}

	public Origen getOrigen() {
		return origen;
	}

	public void setOrigen(Origen origen) {
		this.origen = origen;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	public int getNumeroAsiento() {
		return numeroAsiento;
	}

	public void setNumeroAsiento(int numeroAsiento) {
		this.numeroAsiento = numeroAsiento;
	}

	public double getCostoPasajeEspecial() {
		return costoPasajeEspecial;
	}

	public void setCostoPasajeEspecial(double costoPasajeEspecial) {
		this.costoPasajeEspecial = costoPasajeEspecial;
	}
}
