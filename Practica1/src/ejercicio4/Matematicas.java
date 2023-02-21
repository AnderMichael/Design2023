package ejercicio4;

public class Matematicas extends Materia {

	public Matematicas() {
		super.setNombre("Matematicas");
		super.setCodigo("Fia1");
	}

	@Override
	public void showInfo() {
		System.out.println("*****Materia-FIA*****");
		System.out.println("Nombre: " + super.getNombre());
		System.out.println("Codigo: " + super.getCodigo());
		System.out.println("--Estudiantes--");
		for (Estudiante estudiante : super.getEstudiantesLista()) {
			estudiante.showInfo();
		}
		System.out.println("*********************");

	}

}
