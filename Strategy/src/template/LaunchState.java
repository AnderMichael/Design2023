package template;

public class LaunchState {

	public static void main(String[] args) {
		Context context = new Context("Attribute 1", "Attribute 2", "Attribute 3");

		context.setStrategy(new ConcreteStrategy1());
		context.request();

		context.setStrategy(new ConcreteStrategy2());
		context.request();

		context.setStrategy(new ConcreteStrategy3());
		context.request();
	}

}
