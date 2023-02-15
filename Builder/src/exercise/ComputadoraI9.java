package exercise;

public class ComputadoraI9 extends BuilderComputadora {

	@Override
	public void buildMonitor() {
		super.getComputadora().setMonitor("45");
	}

	@Override
	public void buildTeclado() {
		super.getComputadora().setTeclado("Luminos");
	}

	@Override
	public void buildMouse() {
		super.getComputadora().setMouse("Gamer");
	}

	@Override
	public void buildMemoria() {
		super.getComputadora().setMemoria("32gb");
	}

	@Override
	public void buildProcesador() {
		super.getComputadora().setProcesador("i9");
	}

	@Override
	public void buildVideo() {
		super.getComputadora().setVideo("16");
	}

}
