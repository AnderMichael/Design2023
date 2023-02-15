package exercise;

public abstract class BuilderComputadora {
	private Computadora computadora;

	public Computadora getComputadora() {
		return computadora;
	}

	public void ensamblarBaseComputadora() {
		computadora = new Computadora();
	}

	public abstract void buildMonitor();

	public abstract void buildTeclado();

	public abstract void buildMouse();

	public abstract void buildMemoria();

	public abstract void buildProcesador();

	public abstract void buildVideo();

}
