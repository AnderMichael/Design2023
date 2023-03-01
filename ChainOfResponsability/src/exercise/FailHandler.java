package exercise;

public abstract class FailHandler {
	private FailHandler next;

	public FailHandler getNext() {
		return next;
	}

	public void setNext(FailHandler next) {
		this.next = next;
	}

	public abstract void catchFail(Fail fail);
}
