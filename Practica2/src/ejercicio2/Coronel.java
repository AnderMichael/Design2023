package ejercicio2;

public class Coronel extends SuperiorEjercito {

	@Override
	public void attend(String request) {
		if (request.equals("Desbloqueos") || request.equals("Manifestaciones")) {
			System.out.println("La solicitud debe ser atendida por un coronel!");
		} else {
			super.getSuperior().attend(request);
		}
	}

}
