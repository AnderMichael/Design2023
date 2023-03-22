package ejercicio2;

public class InstalacionElectrica extends Instalacion {

	public InstalacionElectrica(String nombre, String fecha, double precio, Pago pago) {
		super(nombre, fecha, precio, pago);
	}

	@Override
	public void showInfo() {
		System.out.println("*****Sobre la instalacion electrica*****");
		System.out.println(String.format("Nombre: %s", getNombre()));
		System.out.println(String.format("Fecha: %s", getFecha()));
		System.out.println(String.format("Precio Original: %.2f", getPrecio()));
		getPago().showDetails();
		System.out.println(String.format("Precio con Descuento: %.2f", getPago().getDiscountedPrice(getPrecio())));
		System.out.println("*************************************************");
	}

}
