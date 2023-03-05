package example;

public class Client {
	public static void main(String[] args) {
		MemoryRAM memoryRAM = new MemoryRAM(0, "16G", "DDR4");
		TarjetaVideo targetaVideo = new TarjetaVideo(0, "32G", "MSI");
		Computadora1 pc = new Computadora1(memoryRAM, targetaVideo);

		pc.setCurrentState(new ComputadoraApagada());
		pc.useComputer();

		pc.setCurrentState(new ComputadoraNavegando());
		pc.useComputer();

		pc.setCurrentState(new ComputadoraMinando());
		pc.useComputer();
	}
}
