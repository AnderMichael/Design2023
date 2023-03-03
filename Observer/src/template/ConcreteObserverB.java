package template;

public class ConcreteObserverB implements IObserver {

	@Override
	public void update(String update) {
		System.out.println("**********");
		System.out.println("Concrete Observer B is notifing:");
		System.out.println(update);
		System.out.println("**********");

	}

}
