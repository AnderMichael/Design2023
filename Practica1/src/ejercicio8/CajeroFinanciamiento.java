package ejercicio8;

public class CajeroFinanciamiento extends Cajero {

	@Override
	public void showInfo() {
		System.out.println("*****Cajero_Financiamiento*****");
		System.out.println("Bienvenido a " + super.getNombre() + " !");
		System.out.println("El mejor lugar para acceder a prestamos de " + super.getTipoPrestamos() + " !");
		System.out.println("Este es el prestamo que te ofrecemos: " + super.getMontoPrestamos());
		System.out.println("Porque queremos apoyarte con tu emprendimiento!");
		System.out.println("*************************");
	}

}
