package template;

public class ConcreteCommand3 implements ICommand {
	private Receiver receiver;

	public ConcreteCommand3(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		// TODO Agregar logica
		this.receiver.action3();
		// TODO Agregar logica
	}

}
