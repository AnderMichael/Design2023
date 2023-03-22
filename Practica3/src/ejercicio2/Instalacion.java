package ejercicio2;

public abstract class Instalacion {
	private String nombre;
	private String fecha;
	private double precio;
	private Pago pago;

	public Instalacion(String nombre, String fecha, double precio, Pago pago) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.precio = precio;
		this.pago = pago;
	}

	public abstract void showInfo();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Pago getPago() {
		return pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}

}
