package exercise;

import java.util.ArrayList;
import java.util.List;

public class Laboratorio extends ConjuntoProductos {

	public Laboratorio(String nombre, Computadora computadora1, Computadora computadora2) {
		super(nombre);
		add(computadora1);
		add(computadora2);
	}

	private List<Producto> computadoras = new ArrayList<>();

	@Override
	public void showInfo() {
		System.out.println("*****Labortorio*****");
		System.out.println(String.format("Nombre: %s", super.getNombre()));
		for (Producto computadora : computadoras) {
			computadora.showInfo();
		}
		System.out.println(String.format("Precio Laboratorio: %.2f", super.getPrecio()));
		System.out.println("********************");
	}

	@Override
	public void add(Producto computadora) {
		computadoras.add(computadora);
		setPrecioTotal(getPrecio() + computadora.getPrecio());
	}

	@Override
	public void remove(Producto computadora) {
		computadoras.remove(computadora);
	}

	public List<Producto> getComputadoras() {
		return computadoras;
	}

	public void setComputadoras(List<Producto> computadoras) {
		this.computadoras = computadoras;
	}

}
