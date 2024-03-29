package template;

public class Context {
// Este es como nuestro objeto concreto, aquel que va a cambiar a trav�s de estados
	private String attribute1;
	private String attribute2;
	private String attribute3;

	private IStrategy strategy;

	public Context(String attribute1, String attribute2, String attribute3) {
		this.attribute1 = attribute1;
		this.attribute2 = attribute2;
		this.attribute3 = attribute3;
	}

	public String getAttribute1() {
		return attribute1;
	}

	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
	}

	public String getAttribute2() {
		return attribute2;
	}

	public void setAttribute2(String attribute2) {
		this.attribute2 = attribute2;
	}

	public String getAttribute3() {
		return attribute3;
	}

	public void setAttribute3(String attribute3) {
		this.attribute3 = attribute3;
	}

	public IStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}

	public void request() {
		strategy.handler();
		// logica
	}
}
