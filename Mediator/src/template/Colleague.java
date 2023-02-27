package template;

public abstract class Colleague {
	private IMediator mediator;

	public Colleague(IMediator mediator) {
		this.mediator = mediator;
	}

	public IMediator getMediator() {
		return mediator;
	}

	public void setMediator(IMediator mediator) {
		this.mediator = mediator;
	}

	public abstract void send(String msg);

	public abstract void messageReceived(String msg);

}
