package exercise;

public class ComputadoraApagada implements ComputadoraState {

	@Override
	public void changeComponentsState(Computadora computadora) {
		System.out.println("Apagando computadora...");

		computadora.getOpenPrograms().clear();
		computadora.getCpu().setCpuConsume(1);
		computadora.getRam().setRamConsume(1);

		System.out.println("Computadora apagada");

	}

}
