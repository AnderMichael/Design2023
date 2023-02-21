package ejercicio4;

public class Ingles extends Materia {

	public Ingles() {
		super.setNombre("Ingles");
		super.setCodigo("Faced3");
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
