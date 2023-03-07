package ejercicio3;

public class Cellphone {
	private String model;
	private String producer;
	private String gama;
	private double price;

	public Cellphone(String model, String producer, String gama, double price) {
		this.model = model;
		this.producer = producer;
		this.gama = gama;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getGama() {
		return gama;
	}

	public void setGama(String gama) {
		this.gama = gama;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void showInfo() {
		System.out.println(String.format("Cellphone -> %s", model));
		System.out.println(String.format("Producer: %s", producer));
		System.out.println(String.format("Gama: %s", gama));
		System.out.println(String.format("Price: %.2f\n", price));

	}

}
