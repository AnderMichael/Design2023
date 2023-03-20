package exercise;

public class AutomovilTanqueDeGas implements Automovil {
	private Automovil automovil;

	public AutomovilTanqueDeGas(Automovil automovil) {
		this.automovil = automovil;
	}

	@Override
	public void avanzar() {
		System.out.println("El automovil tiene implementado un tanque de gas");
		automovil.avanzar();
	}

}
