package exercise;

public class Computadora implements Producto {

	private String nombre;
	private double precio;

	public Computadora(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public void showInfo() {
		System.out.println("====Computadora====");
		System.out.println(String.format("Nombre : %s", nombre));
		System.out.println(String.format("Precio: %.2f $", precio));
		System.out.println("===================");
	}

}
