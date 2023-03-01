package template;

public class ConcreteHandlerA implements IHandler {
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
		// Cadena
		if (amount < 100) {
			// Puedo atenderlo YOOO --> El ConcreteHandlerA
			System.out.println("La situacion se está resolviendo por: ConcreteHandlerA");
		} else {
			next.criteriaHandler(amount);
		}
	}

}
