package exercise;

public class LibrecambistaViajero implements Librecambista {

	@Override
	public void cambiar(Boliviano boliviano) {
		System.out.println(String.format("===Pais-%s===", boliviano.getNacionalidad()));
		System.out.println(String.format("Para el monto %.2f Bs", boliviano.getMonto()));
		System.out.println(String.format("Dolares: %.2f $", boliviano.getMonto() / 7));
		System.out.println(String.format("Euro: %.2f Eur.\n", boliviano.getMonto() / 8));

	}

	@Override
	public void cambiar(Dolar dolar) {
		System.out.println(String.format("===Pais-%s===", dolar.getNacionalidad()));
		System.out.println(String.format("Para el monto %.2f $", dolar.getMonto()));
		System.out.println(String.format("Bolivianos: %.2f", dolar.getMonto() * 7));
		System.out.println(String.format("Euros: %.2f Eur.\n", dolar.getMonto() * (7.0 / 8.0)));
	}

	@Override
	public void cambiar(Euro euro) {
		System.out.println(String.format("===Pais-%s===", euro.getNacionalidad()));
		System.out.println(String.format("Para el monto %.2f Eur.", euro.getMonto()));
		System.out.println(String.format("Bolivianos: %.2f Bs", euro.getMonto() * 8));
		System.out.println(String.format("Dolares: %.2f $\n", euro.getMonto() * (8.0 / 7.0)));
	}

}
