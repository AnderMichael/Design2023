package ejercicio6;

public class Desarrollador implements Usuario {
	private String nombre;
	private String nickname;
	private ComunicationChannel comunicationChannel;

	public Desarrollador(String nombre, String nickname) {
		this.nombre = nombre;
		this.nickname = nickname;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ComunicationChannel getComunicationChannel() {
		return comunicationChannel;
	}

	@Override
	public void setComunicationChannel(ComunicationChannel comunicationChannel) {
		this.comunicationChannel = comunicationChannel;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Override
	public void receiveMessage(String message) {
		System.out.println(String.format("=== Bandeja de mensajes - %s ===", nombre));
		System.out.println(String.format("%s", message));
		System.out.println("==================================");
	}

	@Override
	public String getNickname() {
		return nickname;
	}

	@Override
	public void sendGlobalMessage(String message) {
		GlobalCommunication publicChannel = new GlobalCommunication();
		publicChannel.setListReceptors(comunicationChannel.getUsuarios());
		comunicationChannel.setComunicationType(publicChannel);
		comunicationChannel.sendMessage(message, this);
	}

	@Override
	public void sendPersonalMessage(String message, Usuario receptor) {
		DirectCommunication privateChannel = new DirectCommunication();
		privateChannel.setReceptor(receptor);
		comunicationChannel.setComunicationType(privateChannel);
		comunicationChannel.sendMessage(message, this);
	}

}
