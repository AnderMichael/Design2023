package template;

public class ConcreteColleagueA extends Colleague {

	public ConcreteColleagueA(IMediator mediator) {
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
