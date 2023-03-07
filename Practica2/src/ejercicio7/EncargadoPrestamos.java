package ejercicio7;

import java.util.HashMap;
import java.util.Map;

public class EncargadoPrestamos extends AsesorBanco implements NotificadorBanco {
	private Cajero cajero;
	private AsesorDeCredito asesorDeCredito;
	private Supervisor supervisor;
	private Map<Persona, Prestamo> prestamos;

	public EncargadoPrestamos() {
		this.cajero = new Cajero();
		setSuperior(cajero);
		this.asesorDeCredito = new AsesorDeCredito();
		cajero.setSuperior(asesorDeCredito);
		this.supervisor = new Supervisor(this);
		asesorDeCredito.setSuperior(supervisor);
		prestamos = new HashMap<>();
	}

	public void aniadirPrestamo(Persona newDeudor, String motivo, String fecha, double total) {
		if (prestamos.containsKey(newDeudor)) {
			System.out.println("La siguiente persona ya cuenta con una deuda en el banco:");
			newDeudor.showInfo();
		} else {
			prestamos.put(newDeudor, new Prestamo(motivo, fecha, total, newDeudor));
			newDeudor.setGarantia(false);
		}
	}

	@Override
	public void asesorarPrestamo(Prestamo prestamo, double ingreso) {
		super.getSuperior().asesorarPrestamo(prestamo, ingreso);

	}

	@Override
	public void cerrarPrestamo(Prestamo prestamo) {
		System.out.println("Se cerro el prestamo!!!!");
		prestamos.remove(prestamo.getDeudor());
		prestamo.getDeudor().setGarantia(true);
		prestamo.getDeudor().showInfo();
		System.out.println();
	}

	public void iniciarPago(Persona persona, double ingreso) {
		if (prestamos.containsKey(persona)) {
			asesorarPrestamo(prestamos.get(persona), ingreso);
		} else {
			System.out.println("Esta persona no cuenta con ningun prestamo hecho en este banco:");
			persona.showInfo();
		}
	}

}
