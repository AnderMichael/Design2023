package exercises;

public class Client {
	private String firstName;
	private String lastName;
	private String id;

	public Client(String firstName, String lastName, String id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}

	public String presentation() {
		return completeName() + "  --->  " + id;
	}

	public String completeName() {
		return firstName + " " + lastName;
	}

}
