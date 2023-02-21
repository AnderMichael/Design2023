package ejercicio8;

public class CajeroNegocios extends Cajero {

	@Override
	public void showInfo() {
		System.out.println("*****Cajero_Negocios*****");
		System.out.println("Bienvenido a " + super.getNombre() + " !");
		System.out.println("El mejor lugar para acceder a prestamos de " + super.getTipoPrestamos() + " !");
		System.out.println("Este es el prestamo que te ofrecemos: " + super.getMontoPrestamos());
		System.out.println("Porque pensamos en tu negocio!");
		System.out.println("*************************");
	}

}
