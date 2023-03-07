package ejercicio1;

public class Tesis implements DocumentPrototype {
	private String title;
	private String id;
	private String content;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void showInfo() {
		System.out.println("*****Tesis*****");
		System.out.println(String.format("Title: %s", title));
		System.out.println(String.format("Id: %s", id));
		System.out.println(String.format("--Content--\n%s", content));
		System.out.println("***************");
	}

	@Override
	public Tesis clone() {
		Tesis tesisClone = new Tesis();
		tesisClone.setContent(content);
		tesisClone.setId(id);
		tesisClone.setTitle(title);
		return tesisClone;
	}
}
