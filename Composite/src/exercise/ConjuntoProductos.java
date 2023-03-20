package exercise;

public abstract class ConjuntoProductos implements Producto {
	private String nombre;
	private double precioTotal = 0;

	public ConjuntoProductos(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public double getPrecio() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public abstract void add(Producto producto);

	public abstract void remove(Producto producto);
}
