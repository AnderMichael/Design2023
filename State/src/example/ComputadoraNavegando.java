package example;

public class ComputadoraNavegando implements EstadoComputadora {

	@Override
	public void cambiarPropiedades(Computadora1 computadora1) {
		int randomUse = (int) ((Math.random() * (100 - 1)) + 1);
		computadora1.getMemoryRAM().setPerformance(randomUse);
		System.out.println("Estado: Utilizando Chrome");
		computadora1.getMemoryRAM().showInfo();
		computadora1.getTarjetaVideo().showInfo();
	}

}
