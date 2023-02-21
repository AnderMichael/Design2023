package ejercicio5;

public class Lomito extends BuilderPlatoParrillero {

	@Override
	public void buildTipoDeCarne() {
		super.getPlatoParrillero().setTipoDeCarne("Lomo");
	}

	@Override
	public void buildSaborRefresco() {
		super.getPlatoParrillero().setSaborRefresco("Pepsi");
	}

	@Override
	public void buildGuarniciones() {
		super.getPlatoParrillero().setGuarniciones("Arroz");
	}
}
