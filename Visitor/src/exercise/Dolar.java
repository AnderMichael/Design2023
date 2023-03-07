package exercise;

public class Dolar extends Moneda implements Intercambiable {

	public Dolar(double monto) {
		super(monto, "EE.UU");
	}

	@Override
	public void cambiarValor(Librecambista librecambista) {
		librecambista.cambiar(this);
	}

}
