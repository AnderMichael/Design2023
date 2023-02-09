package exercises;

public class Product {
	private String name;
	private double prize;
	private String provider;

	public String getProvider() {
		return provider;
	}

	public Product(String name, double prize) {
		this.name = name;
		this.prize = prize;
	}

	public String presentation() {
		return name + " ---> " + prize;
	}

}
