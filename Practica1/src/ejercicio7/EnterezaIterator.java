package ejercicio7;

import java.util.Vector;

public class EnterezaIterator implements Iterator {
	private Vector<Empleado> empleados;
	private int position = 0;

	public EnterezaIterator(Vector<Empleado> empleados) {
		this.empleados = empleados;
	}

	@Override
	public boolean hasNext() {
		boolean itHasNext = this.empleados.size() != 0 && position < this.empleados.size();
		return itHasNext;
	}

	@Override
	public Empleado next() {
		Empleado empleado = this.empleados.get(position++);
		return empleado;
	}

}
