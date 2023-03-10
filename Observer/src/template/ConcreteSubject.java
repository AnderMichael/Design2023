package template;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements ISubject {
	private String attribute1;
	private String attribute2;
	private String attribute3;

	private List<IObserver> observers = new ArrayList<>();

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
		notifyObservers();
	}

	public List<IObserver> getObservers() {
		return observers;
	}

	public void setObservers(List<IObserver> observers) {
		this.observers = observers;
	}

	@Override
	public void attach(IObserver observer) {
		observers.add(observer);
	}

	@Override
	public void dettach(IObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (IObserver observer : observers) {
			observer.update(String.format("The third attribute has been modificated to: %s", attribute3));
		}
	}

}
