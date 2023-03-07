package ejercicio7;

public class Persona {
	private String nombre;
	private String ci;
	private boolean garantia;

	public boolean hasGarantia() {
		return garantia;
	}

	public void setGarantia(boolean garantia) {
		this.garantia = garantia;
	}

	public Persona(String nombre, String ci) {
		this.nombre = nombre;
		this.ci = ci;
		this.garantia = true;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public void showInfo() {
		System.out.println("*****Persona*****");
		System.out.println(String.format("Nombre: %s", nombre));
		System.out.println(String.format("CI: %s", ci));
		System.out.println(String.format("Garantia: %s", garantia));
	}

	public void solicitarPrestamo(String motivo, String fecha, EncargadoPrestamos encargadoPrestamos, double total) {
		encargadoPrestamos.aniadirPrestamo(this, motivo, fecha, total);
	}
	
	public void pagarPrestamo(double ingreso, EncargadoPrestamos encargadoPrestamos) {
		encargadoPrestamos.iniciarPago(this, ingreso);
	}
}
