package ejercicio2;

public class PagoTigoMoney extends Pago {

	public PagoTigoMoney() {
		super(2);
	}

	@Override
	public void showDetails() {
		System.out.println("El pago por tigo money cuenta con un descuento del 2 por ciento");
	}

}
