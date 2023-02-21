package ejercicio8;

public class CajeroCreditos extends Cajero {

	@Override
	public void showInfo() {
		System.out.println("*****Cajero_Creditos*****");
		System.out.println("Bienvenido a " + super.getNombre() + " !");
		System.out.println("El mejor lugar para acceder a prestamos de " + super.getTipoPrestamos() + " !");
		System.out.println("Este es el prestamo que te ofrecemos: " + super.getMontoPrestamos());
		System.out.println("El banco con el mejor servicio de crédito!");
		System.out.println("*************************");
	}

}
