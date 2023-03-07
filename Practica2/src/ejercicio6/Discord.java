package ejercicio6;

import java.util.List;

public class Discord implements ComunicationChannel {

	private ComunicationType comunicationType;
	private List<Usuario> usuarios;

	public ComunicationType getComunicationType() {
		return comunicationType;
	}

	@Override
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	@Override
	public void setComunicationType(ComunicationType comunicationType) {
		this.comunicationType = comunicationType;
	}

	@Override
	public void sendMessage(String message, Usuario emisor) {
		comunicationType.notifyReceptors(message, emisor);
	}

}
