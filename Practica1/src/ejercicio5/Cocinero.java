package ejercicio5;

public class Cocinero {
	private BuilderPlatoParrillero builderPlatoParrillero;

	public PlatoParrillero platoCocinado() {
		return builderPlatoParrillero.getPlatoParrillero();
	}

	public void setBuilderPlatoParrillero(BuilderPlatoParrillero builderPlatoParrillero) {
		this.builderPlatoParrillero = builderPlatoParrillero;
	}

	public void cocinar(String plato) {
		switch (plato) {
		case "Bife":
			setBuilderPlatoParrillero(new Bife());
			break;
		case "Lomito":
			setBuilderPlatoParrillero(new Lomito());
			break;
		case "Tira":
			setBuilderPlatoParrillero(new Tira());
			break;
		default:
			setBuilderPlatoParrillero(null);
		}
		builderPlatoParrillero.setBasePlatoParrillero();
		builderPlatoParrillero.buildTipoDeCarne();
		builderPlatoParrillero.buildSaborRefresco();
		builderPlatoParrillero.buildGuarniciones();
	}
}
