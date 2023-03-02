package template;

public class ConcreteCommand2 implements ICommand {
	private Receiver receiver;

	public ConcreteCommand2(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		// TODO Agregar logica
		this.receiver.action2();
		// TODO Agregar logica
	}

}
