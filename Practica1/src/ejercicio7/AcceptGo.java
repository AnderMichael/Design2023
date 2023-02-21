package ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class AcceptGo implements IAggregate {
	private List<Empleado> empleados = new ArrayList<>();
	private String gerente;

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public String getGerente() {
		return gerente;
	}

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}

	public AcceptGo(String gerente) {
		this.gerente = gerente;
	}

	@Override
	public Iterator getIterator() {
		Iterator iterator = new AcceptGoIterator(empleados);
		return iterator;
	}

}
