package ejercicio7;

public class Prestamo {
	private String motivo;
	private String fecha;
	private double total;
	private double totalAcumulado = 0;
	private Persona deudor;

	public Prestamo(String motivo, String fecha, double total, Persona deudor) {
		this.motivo = motivo;
		this.fecha = fecha;
		this.total = total;
		this.deudor = deudor;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getTotalAcumulado() {
		return totalAcumulado;
	}

	public void setTotalAcumulado(double totalAcumulado) {
		this.totalAcumulado = totalAcumulado;
	}

	public Persona getDeudor() {
		return deudor;
	}

	public void setDeudor(Persona deudor) {
		this.deudor = deudor;
	}

	public void showInfo() {
		System.out.println("*****Prestamo*****");
		System.out.println(String.format("Motivo %s", motivo));
		System.out.println(String.format("Fecha %s", fecha));
		System.out.println(String.format("Total %.2f", total));
		System.out.println(String.format("Total Acumulado: %.2f", totalAcumulado));
		deudor.showInfo();
	}
}
