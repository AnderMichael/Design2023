package ejercicio7;

public class Cajero extends AsesorBanco {

	@Override
	public void asesorarPrestamo(Prestamo prestamo, double ingreso) {
		double totalAcumulado = prestamo.getTotalAcumulado();
		double totalPrestamo = prestamo.getTotal();
		if (totalAcumulado < totalPrestamo * 0.25) {
			prestamo.setTotalAcumulado(totalAcumulado + ingreso);
			prestamo.showInfo();
			System.out.println();
		} else {
			System.out.println("La situacion del prestamo ya no puede ser atendida por un cajero.\n");
			super.getSuperior().asesorarPrestamo(prestamo, ingreso);
		}

	}

}
