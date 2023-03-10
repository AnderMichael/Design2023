package exercises;

public class Promotion {
	private String date;
	private double realPrice;
	private double discountPrice;

	public Promotion(String date, double price) {
		this.date = date;
		this.realPrice = price;
	}

	public double currentPrice() {
		double price = realPrice - (realPrice / 100.0) * discountPrice;
		return price;
	}

	public String presentation() {
		return "Promotion --- " + date + " --- " + currentPrice();
	}
}
