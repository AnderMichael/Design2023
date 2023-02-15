package exercise;

public class ExpertoEnsambladorComputadorasCertificadoISO {
	private BuilderComputadora builderComputadora;

	public Computadora getComputadoraEnsamblada() {
		return builderComputadora.getComputadora();
	}

	public void setBuilderComputadora(BuilderComputadora builderComputadora) {
		this.builderComputadora = builderComputadora;
	}

	public void ensamblarComputadora() {
		this.builderComputadora.ensamblarBaseComputadora();
		this.builderComputadora.buildMemoria();
		this.builderComputadora.buildMonitor();
		this.builderComputadora.buildMouse();
		this.builderComputadora.buildProcesador();
		this.builderComputadora.buildTeclado();
		this.builderComputadora.buildVideo();
	}
}
