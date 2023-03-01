package exercise;

public class ST extends FailHandler {

	@Override
	public void catchFail(Fail fail) {
		if (fail.getSeveridad().equals("BAJA")) {
			System.out.println("La siguiente falla debe ser derivada a el Equipo de Soporte:");
			fail.showInfo();
			System.out.println();
		} else {
			super.getNext().catchFail(fail);
		}
	}

}
