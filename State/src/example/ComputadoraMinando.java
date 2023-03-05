package example;

public class ComputadoraMinando implements EstadoComputadora {

	@Override
	public void cambiarPropiedades(Computadora1 computadora1) {
		int actualUse = computadora1.getTarjetaVideo().getPerformance();

		while (actualUse < 100) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			System.out.println(">>> incrementando cada 5 segundo .... <<<");
			actualUse = actualUse + 5;
			computadora1.getTarjetaVideo().setPerformance(actualUse);
			computadora1.getTarjetaVideo().showInfo();
		}

		System.out.println(">>> estamos al 100%  <<<");
		computadora1.getTarjetaVideo().showInfo();
	}

}
