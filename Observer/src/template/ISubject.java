package template;

public interface ISubject {
	public void attach(IObserver observer);

	public void dettach(IObserver observer);

	public void notifyObservers();
}
