package exercise;

public class LaunchAutomoviles {
	public static void main(String[] args) {
		Automovil minibus = new Minibus();
		minibus = new AutomovilTurbo(minibus);
		minibus = new AutomovilGPS(minibus);
		minibus = new AutomovilTanqueDeGas(minibus);
		minibus.avanzar();

		Automovil taxi = new Taxi();
		taxi = new AutomovilTanqueDeGas(taxi);

		taxi.avanzar();

		Automovil vagoneta = new Vagoneta();
		vagoneta = new AutomovilTurbo(vagoneta);
		vagoneta = new AutomovilGPS(vagoneta);

		vagoneta.avanzar();
	}
}
