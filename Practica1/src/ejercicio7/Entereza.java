package ejercicio7;

import java.util.Vector;

public class Entereza implements IAggregate {
	private Vector<Empleado> empleados = new Vector<>();
	private String gerente;

	public Vector<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Vector<Empleado> empleados) {
		this.empleados = empleados;
	}

	public String getGerente() {
		return gerente;
	}

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}

	public Entereza(String gerente) {
		this.gerente = gerente;
	}

	@Override
	public Iterator getIterator() {
		Iterator iterator = new EnterezaIterator(empleados);
		return iterator;
	}

}
