package ejercicio5;

public abstract class BuilderPlatoParrillero {
	private PlatoParrillero platoParrillero;

	public PlatoParrillero getPlatoParrillero() {
		return platoParrillero;
	}

	public void setBasePlatoParrillero() {
		platoParrillero = new PlatoParrillero();
	}

	public abstract void buildTipoDeCarne();

	public abstract void buildSaborRefresco();

	public abstract void buildGuarniciones();

}
