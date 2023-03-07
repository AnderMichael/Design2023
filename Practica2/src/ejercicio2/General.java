package ejercicio2;

public class General extends SuperiorEjercito {

	@Override
	public void attend(String request) {
		if (request.equals("Entrevistas")) {
			System.out.println("La solicitud debe ser atendida por un general!");
		} else {
			System.out.println("La solicitud no tiene un nombre correcto");
		}
	}

}
