package ejercicio5;

public class Tira extends BuilderPlatoParrillero {
	@Override
	public void buildTipoDeCarne() {
		super.getPlatoParrillero().setTipoDeCarne("Tira de carne");
	}

	@Override
	public void buildSaborRefresco() {
		super.getPlatoParrillero().setSaborRefresco("Coca Cola");
	}

	@Override
	public void buildGuarniciones() {
		super.getPlatoParrillero().setGuarniciones("Fideo");
	}
}
