package exercise;

import java.util.List;
import java.util.Random;

public class ComputadoraEncendiendo implements ComputadoraState {

	@Override
	public void changeComponentsState(Computadora computadora) {
		System.out.println("Encendiendo computadora");

		List<String> programasComputadora = List.of("Anki", "Spotify", "Photoshop", "Steam", "Chrome", "PSEint",
				"CodeBlocks", "Premiere", "Edge", "TexMaker");

		Random rnd = new Random();
		int programasParaAbrir = (int) rnd.nextInt(9) + 1;
		double currentCpuConsume = computadora.getCpu().getCpuConsume();
		double currentRamConsume = computadora.getRam().getRamConsume();

		String openProgram;

		for (int p = 0; p < programasParaAbrir; p++) {
			openProgram = programasComputadora.get(p);
			System.out.println(String.format("Abriendo el programa: %s", openProgram));
			computadora.getOpenPrograms().add(openProgram);
			try {
				Thread.sleep(500);
				currentCpuConsume += 5;
				computadora.getCpu().setCpuConsume(currentCpuConsume);
				currentRamConsume += 5;
				computadora.getRam().setRamConsume(currentRamConsume);
				computadora.showInfo();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Computadora encendida");

	}

}
