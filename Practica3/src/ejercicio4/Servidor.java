package ejercicio4;

public class Servidor implements Componente {
	private String nombre;

	public Servidor(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void presentation() {
		System.out.println(String.format("Esta siendo atendido por %s", nombre));
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
