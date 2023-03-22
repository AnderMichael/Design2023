package ejercicio2;

public abstract class Pago {
	private double descuento;

	public Pago(double descuento) {
		this.descuento = descuento;
	}

	public abstract void showDetails();

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public double getDiscountedPrice(double prize) {
		double newPrice = prize - prize * descuento / 100;
		return newPrice;
	}

}
