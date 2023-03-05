package example;

public class MemoryRAM {
	private int performance;
	private String total;
	private String description;

	public MemoryRAM(int performance, String total, String description) {
		this.performance = performance;
		this.total = total;
		this.description = description;
	}

	public int getPerformance() {
		return performance;
	}

	public void setPerformance(int performance) {
		this.performance = performance;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void showInfo() {
		System.out.println("*******RAM********");
		System.out.println(String.format("Performance: %d", performance));
		System.out.println(String.format("Total: %s", total));
		System.out.println(String.format("Description: %s", description));
		System.out.println();
	}

}
