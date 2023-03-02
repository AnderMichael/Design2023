package example;

public class BuildProjectTask extends Task {

	public BuildProjectTask(IDE ide) {
		super(ide);
	}

	@Override
	public void execute() {
		super.getIde().buildProject();
	}

}
