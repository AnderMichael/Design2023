package example;

public class Computadora1 {
	private MemoryRAM memoryRAM;
	private TarjetaVideo tarjetaVideo;
	private EstadoComputadora currentState;

	public MemoryRAM getMemoryRAM() {
		return memoryRAM;
	}

	public void setMemoryRAM(MemoryRAM memoryRAM) {
		this.memoryRAM = memoryRAM;
	}

	public TarjetaVideo getTarjetaVideo() {
		return tarjetaVideo;
	}

	public void setTarjetaVideo(TarjetaVideo tarjetaVideo) {
		this.tarjetaVideo = tarjetaVideo;
	}

	public EstadoComputadora getCurrentState() {
		return currentState;
	}

	public void setCurrentState(EstadoComputadora currentState) {
		this.currentState = currentState;
	}

	public void showInfo() {
		System.out.println("**********Computadora**********");
		memoryRAM.showInfo();
		tarjetaVideo.showInfo();
		System.out.println("*******************************");
	}

	public Computadora1(MemoryRAM memoryRAM, TarjetaVideo tarjetaVideo) {
		this.memoryRAM = memoryRAM;
		this.tarjetaVideo = tarjetaVideo;
	}

	public void useComputer() {
		currentState.cambiarPropiedades(this);
	}

}
