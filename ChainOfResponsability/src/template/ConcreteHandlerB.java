package template;

public class ConcreteHandlerB implements IHandler {
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
		if (amount < 200) {
			// Puedo atenderlo YOOO --> El ConcreteHandlerB
			System.out.println("La situacion se está resolviendo por: ConcreteHandlerB");
		} else {
			next.criteriaHandler(amount);
		}
	}

}
