package ejercicio2;

public class PagoApp extends Pago {

	public PagoApp() {
		super(10);
	}

	@Override
	public void showDetails() {
		System.out.println("El pago por app cuenta con un descuento del 10 por ciento");
	}

}
