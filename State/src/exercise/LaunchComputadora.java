package exercise;

public class LaunchComputadora {
	public static void main(String[] args) {
		Computadora computadora = new Computadora("DDR3", "Ryzen 7");

		// Por defecto -> Apagado
		computadora.showInfo();

		// Segundo estado -> Encendido
		computadora.changeState(new ComputadoraEncendiendo());
		computadora.showInfo();

		// Tercer estado -> Reiniciado
		computadora.changeState(new ComputadoraReiniciando());
		computadora.showInfo();

		// Volviendo al primer estado
		computadora.changeState(new ComputadoraApagada());
		computadora.showInfo();
	}
}
