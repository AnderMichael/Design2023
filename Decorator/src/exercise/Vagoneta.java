package exercise;

public class Vagoneta implements Automovil {
	private String velocidades[] = { "15", "20", "25", "30" };

	@Override
	public void avanzar() {
		System.out.println("El vagoneta avanza:");
		for (String velocidad : velocidades) {
			System.out.println(String.format("La vagoneta acelera a %s km/h", velocidad));
		}
	}

}
