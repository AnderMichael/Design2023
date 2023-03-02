package example;

public class RunUnitTestTask extends Task {

	public RunUnitTestTask(IDE ide) {
		super(ide);
	}

	@Override
	public void execute() {
		super.getIde().runUnitTest();
	}

}
