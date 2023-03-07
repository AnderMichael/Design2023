package ejercicio2;

public class AdministradorCuartel extends SuperiorEjercito {

	private General general;
	private Teniente teniente;
	private Coronel coronel;
	private Cabo cabo;

	public AdministradorCuartel() {
		general = new General();
		teniente = new Teniente();
		coronel = new Coronel();
		cabo = new Cabo();

		super.setSuperior(cabo);
		cabo.setSuperior(coronel);
		coronel.setSuperior(teniente);
		teniente.setSuperior(general);
	}

	@Override
	public void attend(String request) {
		super.getSuperior().attend(request);
	}

}
