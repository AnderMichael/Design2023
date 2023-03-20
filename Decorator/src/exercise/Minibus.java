package exercise;

public class Minibus implements Automovil {
	private String velocidades[] = { "15", "20", "25", "30", "35" };

	@Override
	public void avanzar() {
		System.out.println("El minibus avanza:");
		for (String velocidad : velocidades) {
			System.out.println(String.format("El minibus acelera a %s km/h", velocidad));
		}
	}

}
