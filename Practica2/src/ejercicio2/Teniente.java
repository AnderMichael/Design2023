package ejercicio2;

public class Teniente extends SuperiorEjercito {

	@Override
	public void attend(String request) {
		if (request.equals("Disciplina")) {
			System.out.println("La solicitud debe ser atendida por un teniente!");
		} else {
			super.getSuperior().attend(request);
		}
	}

}
