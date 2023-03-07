package ejercicio6;

public class DirectCommunication implements ComunicationType {
	private Usuario receptor;

	public Usuario getReceptor() {
		return receptor;
	}

	public void setReceptor(Usuario receptor) {
		this.receptor = receptor;
	}

	@Override
	public void notifyReceptors(String message, Usuario emisor) {
		message = message + "\nMensaje enviado por: " + emisor.getNickname();
		receptor.receiveMessage(message);
	}

}
