package ejercicio7;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class LaunchEjercicio7 {

	public static void main(String[] args) {
		AcceptGo acceptGo = new AcceptGo("Jonathan Capra");
		List<Empleado> empleadosAcceptGo = List.of(new Empleado("Hugo", "Apaza", "AG-1"),
				new Empleado("Alejandro", "Auza", "AG-2"), new Empleado("Arianne", "Garrett", "AG-3"));
		acceptGo.setEmpleados(empleadosAcceptGo);

		ElQueSabeSabe elQueSabeSabe = new ElQueSabeSabe("Veronica Diez de Medina");
		Empleado empleadosElQueSabeSabe[] = { new Empleado("Ander", "Cayllan", "EQSS-1"),
				new Empleado("Vivian", "Marino", "EQSS-2") };
		elQueSabeSabe.setEmpleado(empleadosElQueSabeSabe);

		Entereza entereza = new Entereza("Gaston Espinoza");
		Vector<Empleado> empleadosEntereza = new Vector<>();
		empleadosEntereza.add(new Empleado("Johan", "Paredes", "E-1"));
		empleadosEntereza.add(new Empleado("Javier", "Blanco", "E-2"));
		entereza.setEmpleados(empleadosEntereza);

		Hugoneta hugoneta = new Hugoneta("Huguito Apaza");
		Stack<Empleado> empleadosHugoneta = new Stack<>();
		empleadosHugoneta.push(new Empleado("Enrique", "Vicente", "H-1"));
		empleadosHugoneta.push(new Empleado("Gigio", "Loayza", "H-2"));
		hugoneta.setEmpleados(empleadosHugoneta);

		HashMap<String, Empleado> listaGeneral = new HashMap<>();
		Iterator iterator = acceptGo.getIterator();
		while (iterator.hasNext()) {
			Empleado empleado = iterator.next();
			listaGeneral.put(empleado.getCodigo(), empleado);
		}

		iterator = elQueSabeSabe.getIterator();
		while (iterator.hasNext()) {
			Empleado empleado = iterator.next();
			listaGeneral.put(empleado.getCodigo(), empleado);
		}

		iterator = entereza.getIterator();
		while (iterator.hasNext()) {
			Empleado empleado = iterator.next();
			listaGeneral.put(empleado.getCodigo(), empleado);
		}

		iterator = hugoneta.getIterator();
		while (iterator.hasNext()) {
			Empleado empleado = iterator.next();
			listaGeneral.put(empleado.getCodigo(), empleado);
		}

		listaGeneral.get("AG-3").showInfo();
		listaGeneral.get("EQSS-2").showInfo();
		listaGeneral.get("E-1").showInfo();
		listaGeneral.get("H-2").showInfo();
	}

}
