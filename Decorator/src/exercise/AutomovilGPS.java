package exercise;

public class AutomovilGPS implements Automovil {
	private Automovil automovil;

	public AutomovilGPS(Automovil automovil) {
		this.automovil = automovil;
	}

	@Override
	public void avanzar() {
		System.out.println("El automovil tiene implementado un GPS");
		automovil.avanzar();
	}

}
