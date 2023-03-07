package ejercicio1;

public class LaunchEjercicio1 {
	public static void main(String[] args) {
		Student student = new Student("Andersuario", "12830093");
		Word word = new Word();
		WordCloud cloud = new WordCloud();

		Tesis tesisAndersaurio = new Tesis();
		tesisAndersaurio.setTitle("Hugotrucos in our context!");
		tesisAndersaurio.setId("4747");
		tesisAndersaurio.setContent("1. Titulo\n");

		student.setTesis(tesisAndersaurio);
		word.setLastVersionDocument(student.getTesis());
		cloud.addDocumentVersion(word.createVersionDocument());

		student.addContent("2. Introduccion\n");
		word.setLastVersionDocument(student.getTesis());
		cloud.addDocumentVersion(word.createVersionDocument());

		student.addContent("3. Marco Teorico\n");
		word.setLastVersionDocument(student.getTesis());
		cloud.addDocumentVersion(word.createVersionDocument());

		student.addContent("4. Marco Practico\n");
		word.setLastVersionDocument(student.getTesis());
		cloud.addDocumentVersion(word.createVersionDocument());

		student.addContent("5. Conclusion\n");
		word.setLastVersionDocument(student.getTesis());
		cloud.addDocumentVersion(word.createVersionDocument());

		word.setLastVersionDocument(cloud.getDocumentVersion(3));
		word.getLastTesis().showInfo();
	}
}
