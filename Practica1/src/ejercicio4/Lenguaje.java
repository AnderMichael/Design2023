package ejercicio4;

public class Lenguaje extends Materia {

	public Lenguaje() {
		super.setNombre("Lenguaje");
		super.setCodigo("Faced1");
	}

	@Override
	public void showInfo() {
		System.out.println("*****Materia-FACED*****");
		System.out.println("Nombre: " + super.getNombre());
		System.out.println("Codigo: " + super.getCodigo());
		System.out.println("--Estudiantes--");
		for (Estudiante estudiante : super.getEstudiantesLista()) {
			estudiante.showInfo();
		}
		System.out.println("***********************");
	}

}
