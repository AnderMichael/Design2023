package template;

public class ConcreteHandlerC implements IHandler {
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
		if (amount < 300) {
			// Puedo atenderlo YOOO --> El ConcreteHandlerC
			System.out.println("La situacion se está resolviendo por: ConcreteHandlerC");
		} else {
			next.criteriaHandler(amount);
		}
	}

}
