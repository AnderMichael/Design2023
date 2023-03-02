package template;

public class ConcreteCommand1 implements ICommand {
	private Receiver receiver;

	public ConcreteCommand1(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		// TODO Agregar logica
		this.receiver.action1();
		// TODO Agregar logica
	}

}
