package template;

public class ConcreteHandlerD implements IHandler {
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
		if (amount < 400) {
			// Puedo atenderlo YOOO --> El ConcreteHandlerD
			System.out.println("La situacion se está resolviendo por: ConcreteHandlerD");
		} else {
			next.criteriaHandler(amount);
		}
	}

}
