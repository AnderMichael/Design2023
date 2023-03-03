package template;

public class ConcreteObserverA implements IObserver {

	@Override
	public void update(String update) {
		System.out.println("**********");
		System.out.println("Concrete Observer A is notifing:");
		System.out.println(update);
		System.out.println("**********");

	}

}
