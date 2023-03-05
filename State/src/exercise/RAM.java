package exercise;

public class RAM {
	private String ramName;
	private double ramConsume = 0;

	public String getRamName() {
		return ramName;
	}

	public void setRamName(String ramName) {
		this.ramName = ramName;
	}

	public double getRamConsume() {
		return ramConsume;
	}

	public void setRamConsume(double ramConsume) {
		this.ramConsume = ramConsume;
	}

	public RAM(String ramName) {
		this.ramName = ramName;
	}

	public void showInfo() {
		System.out.println("***RAM***");
		System.out.println(String.format("Nombre: %s", ramName));
		System.out.println(String.format("Consumo: %s", ramConsume));
	}
}
