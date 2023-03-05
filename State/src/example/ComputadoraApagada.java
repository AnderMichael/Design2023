package example;

public class ComputadoraApagada implements EstadoComputadora {

	@Override
	public void cambiarPropiedades(Computadora1 computadora1) {
		computadora1.getMemoryRAM().setPerformance(0);
		computadora1.getTarjetaVideo().setPerformance(0);
		System.out.println("Estado: Apagado");
		computadora1.getMemoryRAM().showInfo();
		computadora1.getTarjetaVideo().showInfo();
	}

}
