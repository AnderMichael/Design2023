package ejercicio6;

import java.util.List;

public class GlobalCommunication implements ComunicationType {
	private List<Usuario> listReceptors;

	public void setListReceptors(List<Usuario> listReceptors) {
		this.listReceptors = listReceptors;
	}

	public List<Usuario> getListReceptors() {
		return listReceptors;
	}

	@Override
	public void notifyReceptors(String message, Usuario emisor) {
		message = message + "\nMensaje enviado por: " + emisor.getNickname();
		for (Usuario receptor : listReceptors) {
			if (!receptor.equals(emisor)) {
				receptor.receiveMessage(message);
			}
		}
	}

}
