package example;

public abstract class Task implements ITask {
	private IDE ide;

	public Task(IDE ide) {
		this.ide = ide;
	}

	public IDE getIde() {
		return ide;
	}

	public void setIde(IDE ide) {
		this.ide = ide;
	}

}
