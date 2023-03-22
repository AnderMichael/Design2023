package ejercicio2;

public class LaunchEjercicio2 {

	public static void main(String[] args) {
		Instalacion instalacionA1 = new InstalacionAgua("Instalacion agua 1", "20/01/2022", 190, new PagoApp());
		Instalacion instalacionA2 = new InstalacionAgua("Instalacion agua 2", "20/01/2022", 190, new PagoTigoMoney());
		Instalacion instalacionA3 = new InstalacionAgua("Instalacion agua 3", "20/01/2022", 190,
				new PagoTransferencia());

		instalacionA1.showInfo();
		instalacionA2.showInfo();
		instalacionA3.showInfo();

		Instalacion instalacionAlc1 = new InstalacionAlcantarillado("Instalacion alcantarillado 1", "23/09/2022", 250,
				new PagoApp());
		Instalacion instalacionAlc2 = new InstalacionAlcantarillado("Instalacion alcantarillado 2", "23/09/2022", 250,
				new PagoTigoMoney());
		Instalacion instalacionAlc3 = new InstalacionAlcantarillado("Instalacion alcantarillado 3", "23/09/2022", 250,
				new PagoTransferencia());

		instalacionAlc1.showInfo();
		instalacionAlc2.showInfo();
		instalacionAlc3.showInfo();

		Instalacion instalacionE1 = new InstalacionElectrica("Instalacion electrica 1", "24/05/2023", 300,
				new PagoApp());
		Instalacion instalacionE2 = new InstalacionElectrica("Instalacion electrica 2", "24/05/2023", 300,
				new PagoApp());
		Instalacion instalacionE3 = new InstalacionElectrica("Instalacion electrica 3", "24/05/2023", 300,
				new PagoApp());

		instalacionE1.showInfo();
		instalacionE2.showInfo();
		instalacionE3.showInfo();
	}

}
