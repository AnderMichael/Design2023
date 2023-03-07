package ejercicio7;

public class Supervisor extends AsesorBanco {
	private NotificadorBanco notificadorBanco;

	public Supervisor(NotificadorBanco notificadorBanco) {
		this.notificadorBanco = notificadorBanco;
	}

	@Override
	public void asesorarPrestamo(Prestamo prestamo, double ingreso) {
		double totalAcumulado = prestamo.getTotalAcumulado() + ingreso;
		double totalPrestamo = prestamo.getTotal();
		prestamo.setTotalAcumulado(totalAcumulado);
		prestamo.showInfo();
		System.out.println();

		if (totalAcumulado >= totalPrestamo) {
			notificadorBanco.cerrarPrestamo(prestamo);
		} else {
			System.out.println("El banco cuenta con otro tipo de prestamos interesantes para usted:");
			System.out.println("Prestamo vivienda");
			System.out.println("Prestamo emprendimiento");
			System.out.println("Prestamo automovil");
			System.out.println();
		}

	}

}
