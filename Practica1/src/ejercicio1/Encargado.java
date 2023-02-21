package ejercicio1;

public class Encargado {
	private String nombre;
	private String codigo;
	private VentanillaDePago ventanillaDePago;

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

	public Encargado(String nombre, String codigo) {
		this.nombre = nombre;
		this.codigo = codigo;
	}

	public void ingresarVentanila(VentanillaDePago ventanillaDePago) {
		this.ventanillaDePago = ventanillaDePago;
		this.ventanillaDePago.setCodigoEncargado(codigo);
		System.out.println("Inicio de sesión exitoso");
	}

	public void salirVentanilla() {
		ventanillaDePago.quitEncargado();
		ventanillaDePago = null;
		System.out.println("Cerrado de sesión exitoso");
	}
}
