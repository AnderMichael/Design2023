package ejercicio8;

public class CajeroVivienda extends Cajero {

	@Override
	public void showInfo() {
		System.out.println("*****Cajero_Vivienda*****");
		System.out.println("Bienvenido a " + super.getNombre() + " !");
		System.out.println("El mejor lugar para acceder a prestamos de " + super.getTipoPrestamos() + " !");
		System.out.println("Este es el prestamo que te ofrecemos: " + super.getMontoPrestamos());
		System.out.println("Porque pensamos en tu vivienda!");
		System.out.println("*************************");
	}

}
