package exercise;

public class LaunchClientBanco {

	public static void main(String[] args) {
		CuentaBanco cuentaBanco = CuentaBanco.getCuenta();

		cuentaBanco.addDinero(5000);

		TarjetaDebito tarjetaDebito = new TarjetaDebito(cuentaBanco);
		tarjetaDebito.showInfo();

		tarjetaDebito.giveMoney(new Bolivianos(1000));

		tarjetaDebito.giveMoney(new Dolar(100));

		tarjetaDebito.giveMoney(new Euro(200));

		tarjetaDebito.showInfo();
	}

}
