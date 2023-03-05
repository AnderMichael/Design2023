package template;

public class LaunchState {

	public static void main(String[] args) {
		Context context = new Context("Attribute 1", "Attribute 2", "Attribute 3");

		context.setState(new ConcreteState1());
		context.request();

		context.setState(new ConcreteState2());
		context.request();

		context.setState(new ConcreteState3());
		context.request();
	}

}
