package ejercicio1;

public class VentanillaDePago {
	private static VentanillaDePago ventanillaDePago;
	private String codigoEncargado;
	private double dineroTotal;

	private VentanillaDePago() {
		this.dineroTotal = 0;
		this.codigoEncargado = "No hay encargado disponible";
	}

	public static VentanillaDePago getVentanilla() {
		if (ventanillaDePago == null) {
			ventanillaDePago = new VentanillaDePago();
		}
		return ventanillaDePago;
	}

	public void aniadirDinero(double additional) {
		dineroTotal += additional;
	}

	public double getDineroTotal() {
		return dineroTotal; 
	}

	public String getCodigoEncargado() {
		return codigoEncargado;
	}

	public void setCodigoEncargado(String codigoEncargado) {
		this.codigoEncargado = codigoEncargado;
	}

	public void quitEncargado() {
		setCodigoEncargado("No hay encargado disponible");
	}

	public void showInfo() {
		System.out.println("******************************");
		System.out.println("Encargado: " + codigoEncargado);
		System.out.println("Dinero Total: " + dineroTotal);
		System.out.println("******************************");

	}
}
