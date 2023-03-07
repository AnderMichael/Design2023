package ejercicio1;

public interface TextRepository {
	public void addDocumentVersion(Tesis tesis);

	public Tesis getDocumentVersion(int version);
}
