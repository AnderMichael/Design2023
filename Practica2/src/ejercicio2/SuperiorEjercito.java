package ejercicio2;

public abstract class SuperiorEjercito implements ElementoEjercito {
	private SuperiorEjercito superior;

	public SuperiorEjercito getSuperior() {
		return superior;
	}

	public void setSuperior(SuperiorEjercito superior) {
		this.superior = superior;
	}

}
