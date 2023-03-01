package exercise;

public class PO extends FailHandler {

	@Override
	public void catchFail(Fail fail) {
		if (fail.getSeveridad().equals("MEDIA")) {
			System.out.println("La siguiente falla debe ser derivada a un Product Owner:");
			fail.showInfo();
			System.out.println();
		} else {
			super.getNext().catchFail(fail);
		}
	}

}
