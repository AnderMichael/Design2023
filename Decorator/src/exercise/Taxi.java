package exercise;

public class Taxi implements Automovil {

	private String velocidades[] = { "15", "30", "55", "70", "85" };

	@Override
	public void avanzar() {
		System.out.println("El taxi avanza:");
		for (String velocidad : velocidades) {
			System.out.println(String.format("El taxi acelera a %s km/h", velocidad));
		}
	}

}
