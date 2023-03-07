package exercise;

public class Euro extends Moneda implements Intercambiable {

	public Euro(double monto) {
		super(monto, "Europa");
	}

	@Override
	public void cambiarValor(Librecambista librecambista) {
		librecambista.cambiar(this);
	}

}
