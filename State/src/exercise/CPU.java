package exercise;

public class CPU {
	private String cpuName;
	private double cpuConsume = 0;

	public String getCpuName() {
		return cpuName;
	}

	public void setCpuName(String cpuName) {
		this.cpuName = cpuName;
	}

	public double getCpuConsume() {
		return cpuConsume;
	}

	public void setCpuConsume(double cpuConsume) {
		this.cpuConsume = cpuConsume;
	}

	public CPU(String cpuName) {
		this.cpuName = cpuName;
	}

	public void showInfo() {
		System.out.println("***CPU***");
		System.out.println(String.format("Nombre: %s", cpuName));
		System.out.println(String.format("Consumo: %s", cpuConsume));
	}
}
