package exercise;

public class QA extends FailHandler {

	@Override
	public void catchFail(Fail fail) {
		if (fail.getSeveridad().equals("ALTA")) {
			System.out.println("La siguiente falla debe ser derivada a el equipo de Control de Calidad:");
			fail.showInfo();
			System.out.println();
		} else {
			super.getNext().catchFail(fail);
		}
	}

}
