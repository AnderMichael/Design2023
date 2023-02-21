package ejercicio5;

public class LaunchEjercicio5 {

	public static void main(String[] args) {
		Cocinero cocinero = new Cocinero();

		Client cliente1 = new Client("Brenda", "17474899");
		String orden = "Bife";

		cliente1.ordenar(cocinero, orden);
		PlatoParrillero plato1 = cocinero.platoCocinado();
		cliente1.showInfo();
		plato1.showInfo(orden);

		Client cliente2 = new Client("Enrique", "67573483");
		orden = "Lomito";

		cliente2.ordenar(cocinero, orden);
		PlatoParrillero plato2 = cocinero.platoCocinado();
		cliente2.showInfo();
		plato2.showInfo(orden);

		Client cliente3 = new Client("Huguito", "64738290");
		orden = "Tira";

		cliente3.ordenar(cocinero, orden);
		PlatoParrillero plato3 = cocinero.platoCocinado();
		cliente3.showInfo();
		plato3.showInfo(orden);

	}

}
