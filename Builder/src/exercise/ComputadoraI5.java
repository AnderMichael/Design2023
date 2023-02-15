package exercise;

public class ComputadoraI5 extends BuilderComputadora {

	@Override
	public void buildMonitor() {
		super.getComputadora().setMonitor("24");
	}

	@Override
	public void buildTeclado() {
		super.getComputadora().setTeclado("Normal");
	}

	@Override
	public void buildMouse() {
		super.getComputadora().setMouse("Normal");
	}

	@Override
	public void buildMemoria() {
		super.getComputadora().setMemoria("8gb");
	}

	@Override
	public void buildProcesador() {
		super.getComputadora().setProcesador("i5");
	}

	@Override
	public void buildVideo() {
		super.getComputadora().setVideo("4");
	}
}
