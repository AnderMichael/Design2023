package template;

public class ConcreteMediator implements IMediator {

	private ConcreteColleagueA colleagueA;
	private ConcreteColleagueB colleagueB;

	public ConcreteColleagueA getColleagueA() {
		return colleagueA;
	}

	public void setColleagueA(ConcreteColleagueA colleagueA) {
		this.colleagueA = colleagueA;
	}

	public ConcreteColleagueB getColleagueB() {
		return colleagueB;
	}

	public void setColleagueB(ConcreteColleagueB colleagueB) {
		this.colleagueB = colleagueB;
	}

	@Override
	public void sendMessage(String message, Colleague colleague) {
		if (colleague == colleagueA) {
			colleagueB.messageReceived(message);
		} else {
			colleagueA.messageReceived(message);
		}

	}
}
