package exercise;

public class FailDetector extends FailHandler {
	private DEV dev;
	private QA qa;
	private PO po;
	private ST st;

	public FailDetector() {
		this.dev = new DEV();
		this.qa = new QA();
		this.po = new PO();
		this.st = new ST();

		super.setNext(st);
		st.setNext(po);
		po.setNext(qa);
		qa.setNext(dev);
	}

	@Override
	public void catchFail(Fail fail) {
		super.getNext().catchFail(fail);
	}

}
