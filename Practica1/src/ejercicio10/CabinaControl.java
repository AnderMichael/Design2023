package ejercicio10;

import java.util.ArrayList;
import java.util.List;

public class CabinaControl {
	private static CabinaControl cabinaControl;
	private List<Vehiculo> vehiculosTemp;
	private List<Vehiculo> vehiculosGlobal;
	private double dineroRecaudado;

	private CabinaControl() {
		this.vehiculosTemp = new ArrayList<>();
		this.vehiculosGlobal = new ArrayList<>();
	}

	public static CabinaControl getInstance() {
		if (cabinaControl == null) {
			cabinaControl = new CabinaControl();
		}
		return cabinaControl;
	}

	public void registrarVehiculo(Vehiculo vehiculo) {
		vehiculosTemp.add(vehiculo);
		vehiculosGlobal.add(vehiculo);
		if (vehiculo.isTransportePesado()) {
			dineroRecaudado += 117;
		} else {
			dineroRecaudado += 17;
		}
		if (vehiculosTemp.size() == 6) {
			System.out.println("Informe obligatorio constante de vehiculos registrados:");
			for (Vehiculo ultimoVehiculo : vehiculosTemp) {
				ultimoVehiculo.showInfo();
			}
			vehiculosTemp.clear();
			System.out.println();
		}
	}

	public void showInfo() {
		System.out.println("++++++++++Cabina de Control++++++++++");
		System.out.println("=====Ultimos vehiculos registrados:");
		for (Vehiculo ultimoVehiculo : vehiculosTemp) {
			ultimoVehiculo.showInfo();
		}
		System.out.println("=====Todos los vehiculos registrados:");
		for (Vehiculo vehiculoRegistrado : vehiculosGlobal) {
			vehiculoRegistrado.showInfo();
		}
		System.out.println("Dinero Recaudado: " + dineroRecaudado);
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		System.out.println();
	}
}
