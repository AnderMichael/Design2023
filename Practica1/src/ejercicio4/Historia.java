package ejercicio4;

public class Historia extends Materia {

	public Historia() {
		super.setNombre("Historia");
		super.setCodigo("Faced2");
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
