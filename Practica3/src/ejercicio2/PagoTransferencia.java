package ejercicio2;

public class PagoTransferencia extends Pago {

	public PagoTransferencia() {
		super(5);
	}

	@Override
	public void showDetails() {
		System.out.println("El pago por transferencia cuenta con un descuento del 5 por ciento");
	}

}
