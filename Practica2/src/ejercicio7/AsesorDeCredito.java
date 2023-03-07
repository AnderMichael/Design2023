package ejercicio7;

public class AsesorDeCredito extends AsesorBanco {

	@Override
	public void asesorarPrestamo(Prestamo prestamo, double ingreso) {
		double totalAcumulado = prestamo.getTotalAcumulado();
		double totalPrestamo = prestamo.getTotal();
		if (totalAcumulado < totalPrestamo * 0.5) {
			prestamo.setTotalAcumulado(totalAcumulado + ingreso);
			prestamo.showInfo();
			System.out.println("El banco puede refinanciar su prestamo si asi lo desea.\n");
		} else {
			System.out.println("La situacion del prestamo ya no puede ser atendida por un el asesor de credito.\n");
			super.getSuperior().asesorarPrestamo(prestamo, ingreso);
		}

	}

}
