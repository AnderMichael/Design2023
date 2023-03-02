package example;

public class CleanBuildTask extends Task {

	public CleanBuildTask(IDE ide) {
		super(ide);
	}

	@Override
	public void execute() {
		super.getIde().cleanBuild();
	}

}
