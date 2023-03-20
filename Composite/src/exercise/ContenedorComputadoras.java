package exercise;

import java.util.ArrayList;
import java.util.List;

public class ContenedorComputadoras extends ConjuntoProductos {

	public ContenedorComputadoras(String nombre, Laboratorio laboratorio1, Laboratorio laboratorio2) {
		super(nombre);
		add(laboratorio1);
		add(laboratorio2);
	}

	private List<Producto> laboratorios = new ArrayList<>();

	@Override
	public void showInfo() {
		System.out.println("+++++Contenedor Computadora+++++");
		for (Producto laboratorio : laboratorios) {
			laboratorio.showInfo();
		}
		System.out.println(String.format("Precio Total: %.2f", super.getPrecio()));
		System.out.println("++++++++++++++++++++++++++++++++");
	}

	@Override
	public void add(Producto laboratorio) {
		laboratorios.add(laboratorio);
		setPrecioTotal(getPrecio() + laboratorio.getPrecio());
	}

	@Override
	public void remove(Producto laboratorio) {
		laboratorios.remove(laboratorio);
		setPrecioTotal(getPrecio() - laboratorio.getPrecio());

	}

	public List<Producto> getComputadoras() {
		return laboratorios;
	}

	public void setComputadoras(List<Producto> laboratorio) {
		this.laboratorios = laboratorio;
	}

}
