package ejercicio4;

import java.util.HashSet;
import java.util.Set;

public abstract class Materia {
	private Set<Estudiante> estudiantesLista;
	private String nombre;
	private String codigo;

	public Materia() {
		this.estudiantesLista = new HashSet<Estudiante>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Set<Estudiante> getEstudiantesLista() {
		return estudiantesLista;
	}

	public void inscribirEstudiante(Estudiante estudiante) {
		if (estudiantesLista.contains(estudiante)) {
			System.out.println("Estudiante ya inscrito!");
		} else {
			estudiantesLista.add(estudiante);

		}
	}

	public abstract void showInfo();
}
