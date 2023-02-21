package ejercicio5;

public class Bife extends BuilderPlatoParrillero {

	@Override
	public void buildTipoDeCarne() {
		super.getPlatoParrillero().setTipoDeCarne("Bife");
	}

	@Override
	public void buildSaborRefresco() {
		super.getPlatoParrillero().setSaborRefresco("Coca Cola");
	}

	@Override
	public void buildGuarniciones() {
		super.getPlatoParrillero().setGuarniciones("Papas Fritas");
	}
}
