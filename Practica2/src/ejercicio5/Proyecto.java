package ejercicio5;

public class Proyecto implements ProyectoPrototype {
	private String nombre;
	private String codigo;
	private int cambios;

	public Proyecto(String nombre) {
		this.nombre = nombre;
		this.codigo = "";
		this.cambios = 0;
	}

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

	public int getCambios() {
		return cambios;
	}

	public void setCambios(int cambios) {
		this.cambios = cambios;
	}

	public void addCodigo(String codigo) {
		this.codigo = this.codigo.concat(codigo);
		cambios++;
	}

	public void showInfo() {
		System.out.println(String.format("=== Proyecto - %s ===", nombre));
		System.out.println(String.format("Codigo:\n%s", codigo));
		System.out.println(String.format("Cambios: %d", cambios));
		System.out.println("====================");
	}

	@Override
	public Proyecto clone() {
		Proyecto clonProyecto = new Proyecto(nombre);
		clonProyecto.setCodigo(codigo);
		clonProyecto.setCambios(cambios);
		return clonProyecto;
	}

}
