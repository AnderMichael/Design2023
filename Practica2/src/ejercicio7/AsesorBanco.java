package ejercicio7;

public abstract class AsesorBanco implements ComponenteBanco {
	private AsesorBanco superior;

	public AsesorBanco getSuperior() {
		return superior;
	}

	public void setSuperior(AsesorBanco superior) {
		this.superior = superior;
	}

}
