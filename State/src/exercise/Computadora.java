package exercise;

import java.util.ArrayList;
import java.util.List;

public class Computadora {
	private List<String> openPrograms = new ArrayList<>();
	private RAM ram;
	private CPU cpu;
	private ComputadoraState currentState;

	public List<String> getOpenPrograms() {
		return openPrograms;
	}

	public void setOpenPrograms(List<String> openPrograms) {
		this.openPrograms = openPrograms;
	}

	public RAM getRam() {
		return ram;
	}

	public void setRam(RAM ram) {
		this.ram = ram;
	}

	public CPU getCpu() {
		return cpu;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public Computadora(String ramName, String cpuName) {
		currentState = new ComputadoraApagada();
		ram = new RAM(ramName);
		cpu = new CPU(cpuName);
	}

	public void showInfo() {
		System.out.println("*****Computadora*****");
		System.out.println(String.format("Cantidad de programas abiertos: %d", openPrograms.size()));
		ram.showInfo();
		cpu.showInfo();
		System.out.println();
	}

	public void changeState(ComputadoraState state) {
		currentState = state;
		currentState.changeComponentsState(this);
	}
}
