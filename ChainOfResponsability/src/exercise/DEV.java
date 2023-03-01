package exercise;

public class DEV extends FailHandler {

	@Override
	public void catchFail(Fail fail) {
		if (fail.getSeveridad().equals("CRITICA")) {
			System.out.println("La siguiente falla debe ser derivada a un Desarrollador:");
			fail.showInfo();
			System.out.println();
		} else {
			System.out.println("La falla contiene un nombre de severidad invalido!");
		}
	}

}
