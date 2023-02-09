package exercises;

public class Bill {
	private String id;
	private String content;
	
	public Bill(String id, String content) {
		this.id = id;
		this.content = content;
	}
	
	public String presentation(){
		return id +" ---Bill--- "+content;
	}
	
	public String logo() {
		return "POLLOS HERMANOS";
	}
}
