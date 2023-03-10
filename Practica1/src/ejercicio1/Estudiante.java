package ejercicio1;

public class Estudiante {
	private String nombre;
	private String codigo;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Estudiante(String nombre, String codigo) {
		this.nombre = nombre;
		this.codigo = codigo;
	}

	public void pagarMatricula(VentanillaDePago ventanillaDePago, double monto) {
		ventanillaDePago.aniadirDinero(monto);
		System.out.println("Codigo: " + codigo + " Monto: " + monto);
	}
}
