package template;

public class LaunchObserver {

	public static void main(String[] args) {
		ConcreteSubject concreteSubject = new ConcreteSubject();

		concreteSubject.attach(new ConcreteObserverA());
		concreteSubject.attach(new ConcreteObserverB());
		concreteSubject.attach(new ConcreteObserverA());
		
		concreteSubject.setAttribute3("Holaaaa aquí esta Andersaurio!!!");
	}

}
