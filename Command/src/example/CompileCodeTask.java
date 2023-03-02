package example;

public class CompileCodeTask extends Task {

	public CompileCodeTask(IDE ide) {
		super(ide);
	}

	@Override
	public void execute() {
		super.getIde().compileCode();
	}

}
