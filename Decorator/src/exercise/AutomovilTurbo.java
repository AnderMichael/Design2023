package exercise;

public class AutomovilTurbo implements Automovil {
	private Automovil automovil;

	public AutomovilTurbo(Automovil automovil) {
		this.automovil = automovil;
	}

	@Override
	public void avanzar() {
		System.out.println("El automovil con el modo turbo");
		automovil.avanzar();
	}

}
