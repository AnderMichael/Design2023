package template;

public interface IHandler {
	public void setNext(IHandler next);

	public IHandler next();

	public void criteriaHandler(int amount);
}
