package exercise;

public class PasajeSolidario implements IPasaje {
	private int numeroVuelo;
	private Destino destino;
	private Origen origen;
	private Avion avion;
	private Pasajero pasajero;
	private int numeroAsiento;
	private double costoPasaje;
	private double descuento;
	private String motivoDescuento;

	@Override
	public void confirm() {
		System.out.println();
		System.out.println("Se esta creando un pasaje solidario...");
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
		System.out.println("Costo del Pasaje: " + costoPasaje);
		System.out.println("Descuento: " + descuento);
		System.out.println("Motivo del descuento: " + motivoDescuento);

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

	public double getCostoPasaje() {
		return costoPasaje;
	}

	public void setCostoPasaje(double costoPasaje) {
		this.costoPasaje = costoPasaje;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public String getMotivoDescuento() {
		return motivoDescuento;
	}

	public void setMotivoDescuento(String motivoDescuento) {
		this.motivoDescuento = motivoDescuento;
	}
}
