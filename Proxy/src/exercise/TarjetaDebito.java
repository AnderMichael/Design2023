package exercise;

public class TarjetaDebito {
	CuentaBanco cuentaBanco;

	public TarjetaDebito(CuentaBanco cuentaBanco) {
		this.cuentaBanco = cuentaBanco;
	}

	public CuentaBanco getCuentaBanco() {
		return cuentaBanco;
	}

	public void setCuentaBanco(CuentaBanco cuentaBanco) {
		this.cuentaBanco = cuentaBanco;
	}

	public void giveMoney(TipoMoneda tipoMoneda) {
		if (tipoMoneda.getName().equals("Bs")) {
			retireDinero(tipoMoneda.getValor());
		} else {
			double newDineroBs = changeMoneda(tipoMoneda);
			retireDinero(newDineroBs);
		}
	}

	public void retireDinero(double monto) {
		if (cuentaBanco.getDinero() - monto >= 0) {
			cuentaBanco.retireDinero(monto);
		} else {
			System.out.println("Tarjeta denegada!");
		}
	}

	public double changeMoneda(TipoMoneda tipoMoneda) {
		switch (tipoMoneda.getName()) {
		case "$us":
			double dolares = tipoMoneda.getValor() * 7;
			return dolares;
		case "Euro":
			double euros = tipoMoneda.getValor() * 8;
			return euros;
		default:
			return 0;
		}
	}

	public void showInfo() {
		System.out.println("***TarjetaDebito***");
		cuentaBanco.showInfo();
	}
}
