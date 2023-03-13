package template;

public class Proxy implements ISubject {
	private String attribute1;
	private String attribute2;

	private RealSubject realSubject = new RealSubject();

	public String getAttribute1() {
		return attribute1;
	}

	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
	}

	public String getAttribute2() {
		return attribute2;
	}

	public void setAttribute2(String attribute2) {
		this.attribute2 = attribute2;
	}

	@Override
	public void request() {
		// Condiciones
		// Restricciones
		if (attribute1.equals("Admin")) {
			realSubject.setAttribute1(attribute1);
			realSubject.request();
		} else {
			System.out.println("No puedes acceder al objeto real, no cumples con los requrimientos!!");
		}
	}

}
