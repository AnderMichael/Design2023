package ejercicio1;

public class Word implements TextEditor {
	private Tesis lastTesis;

	public Tesis getLastTesis() {
		return lastTesis;
	}

	@Override
	public Tesis createVersionDocument() {
		return lastTesis.clone();
	}

	@Override
	public void setLastVersionDocument(Tesis tesis) {
		lastTesis = tesis;
	}

}
