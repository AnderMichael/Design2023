package ejercicio6;

public interface Usuario {
	public void sendGlobalMessage(String message);
	
	public void sendPersonalMessage(String message, Usuario receptor);

	public void receiveMessage(String message);

	public String getNickname();

	public void setComunicationChannel(ComunicationChannel comunicationChannel);
}
