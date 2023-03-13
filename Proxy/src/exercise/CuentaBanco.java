package exercise;

public class CuentaBanco {
	private static CuentaBanco cuentaBanco;
	private double dinero;

	private CuentaBanco() {
		dinero = 0;
	}

	public static CuentaBanco getCuenta() {
		if (cuentaBanco == null) {
			cuentaBanco = new CuentaBanco();
		}
		return cuentaBanco;
	}

	public void addDinero(double dinero) {
		this.dinero += dinero;
	}

	public void retireDinero(double dinero) {
		this.dinero -= dinero;
	}

	public double getDinero() {
		return dinero;
	}

	public void showInfo() {
		System.out.println("Desde la cuenta de banco:");
		System.out.println(String.format("Dinero disponible: %.2f", dinero));
	}
}
