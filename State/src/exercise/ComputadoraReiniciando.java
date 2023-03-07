package exercise;

import java.util.List;

public class ComputadoraReiniciando implements ComputadoraState {

	@Override
	public void changeComponentsState(Computadora computadora) {
		System.out.println("Reiniciando computadora");
		List<String> openPrograms = computadora.getOpenPrograms();
		for (String programa : openPrograms) {
			System.out.println(String.format("Cerrando el programa: %s", programa));
		}
		computadora.getOpenPrograms().clear();
		computadora.getCpu().setCpuConsume(0);
		computadora.getRam().setRamConsume(0);
		System.out.println("Computadora reiniciada");
	}

}
