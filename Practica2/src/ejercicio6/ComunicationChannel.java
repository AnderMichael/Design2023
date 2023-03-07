package ejercicio6;

import java.util.List;

public interface ComunicationChannel {
	public void sendMessage(String message, Usuario emisor);
	public void setComunicationType(ComunicationType comunicationType);
	public List<Usuario> getUsuarios();
}
