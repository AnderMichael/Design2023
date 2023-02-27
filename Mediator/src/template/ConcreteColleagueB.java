package template;

public class ConcreteColleagueB extends Colleague {

	public ConcreteColleagueB(IMediator mediator) {
		super(mediator);
	}

	@Override
	public void send(String msg) {
		super.getMediator().sendMessage(msg, this);
	}

	@Override
	public void messageReceived(String msg) {
		System.out.println("Hey! Te llego el siguiente mensaje:\n" + msg);

	}

}
