package ejercicio10;

public class LaunchEjercicio10 {
	public static void main(String[] args) {
		CabinaControl cabinaControl = CabinaControl.getInstance();
		cabinaControl.showInfo();

		Vehiculo vehiculos[] = { new Vehiculo("Camioneta", "E124569", "12830093", false),
				new Vehiculo("Lamborgini", "E376564", "46583028", false),
				new Vehiculo("Alpine", "F768493", "37574839", false),
				new Vehiculo("Chevrolet", "A375748", "75849839", false),
				new Vehiculo("Fiat", "B767584", "38484940", true),
				new Vehiculo("Camioneta", "C757849", "96867859", false),
				new Vehiculo("Ford", "D757483", "47473890", false) };

		for (Vehiculo vehiculo : vehiculos) {
			cabinaControl.registrarVehiculo(vehiculo);
		}
		
		cabinaControl.showInfo();
	}
}
