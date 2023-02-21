package ejercicio7;

import java.util.Stack;

public class Hugoneta implements IAggregate {
	private Stack<Empleado> empleados;
	private String gerente;

	public Stack<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Stack<Empleado> empleados) {
		this.empleados = empleados;
	}

	public String getGerente() {
		return gerente;
	}

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}

	public Hugoneta(String gerente) {
		this.gerente = gerente;
	}

	@Override
	public Iterator getIterator() {
		Iterator iterator = new HugonetaIterator(empleados);
		return iterator;
	}

}
