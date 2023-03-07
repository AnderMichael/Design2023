package exercise;

public class Boliviano extends Moneda implements Intercambiable {

	public Boliviano(double monto) {
		super(monto, "Bolivia");
	}

	@Override
	public void cambiarValor(Librecambista librecambista) {
		librecambista.cambiar(this);
	}

}
