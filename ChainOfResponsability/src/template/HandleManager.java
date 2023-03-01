package template;

public class HandleManager implements IHandler {
	private IHandler next;

	@Override
	public void setNext(IHandler next) {
		this.next = next;
	}

	@Override
	public IHandler next() {
		return next;
	}

	@Override
	public void criteriaHandler(int amount) {
		ConcreteHandlerA handlerA = new ConcreteHandlerA();
		ConcreteHandlerB handlerB = new ConcreteHandlerB();
		ConcreteHandlerC handlerC = new ConcreteHandlerC();
		ConcreteHandlerD handlerD = new ConcreteHandlerD();

		// Setear la cadena de Responsibilidades
		setNext(handlerA);
		handlerA.setNext(handlerB);
		handlerB.setNext(handlerC);
		handlerC.setNext(handlerD);

		next.criteriaHandler(amount);

	}

}
