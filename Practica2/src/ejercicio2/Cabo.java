package ejercicio2;

public class Cabo extends SuperiorEjercito {

	@Override
	public void attend(String request) {
		if (request.equals("Limpieza")) {
			System.out.println("La solicitud debe ser atendida por un cabo!");
		} else {
			super.getSuperior().attend(request);
		}
	}

}
