package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class WordCloud implements TextRepository {
	private List<Tesis> tesisVersions = new ArrayList<>();

	@Override
	public void addDocumentVersion(Tesis tesis) {
		tesisVersions.add(tesis);
	}

	@Override
	public Tesis getDocumentVersion(int version) {
		Tesis tesis = tesisVersions.get(version - 1);
		return tesis;

	}

}
