package ejercicio7;

public class ElQueSabeSabe implements IAggregate {
	private Empleado empleados[];
	private String gerente;

	public Empleado[] getEmpleado() {
		return empleados;
	}

	public void setEmpleado(Empleado[] empleado) {
		this.empleados = empleado;
	}

	public String getGerente() {
		return gerente;
	}

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}

	public ElQueSabeSabe(String gerente) {
		this.gerente = gerente;
	}

	@Override
	public Iterator getIterator() {
		Iterator iterator = new ElQueSabeSabeIterator(empleados);
		return iterator;
	}

}
