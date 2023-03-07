package exercise;

public class LaunchIntercambio {

	public static void main(String[] args) {
		LibrecambistaViajero viajero = new LibrecambistaViajero();

		Boliviano monto1 = new Boliviano(5600);
		Euro monto2 = new Euro(800);
		Dolar monto3 = new Dolar(700);

		monto1.cambiarValor(viajero);
		monto2.cambiarValor(viajero);
		monto3.cambiarValor(viajero);
	}

}
