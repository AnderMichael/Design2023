package ejercicio4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WhatsApp implements RedSocial {
	private Set<Usuario> usuarios = new HashSet<Usuario>();
	private Map<String, Usuario> mapUsuarios = new HashMap<String, Usuario>();

	public void addUsuario(Usuario usuario) {
		usuarios.add(usuario);
		mapUsuarios.put(usuario.getNumero(), usuario);
	}

	@Override
	public void notificar(Usuario emisor, Mensaje mensaje) {
		if (mensaje.isPublico()) {
			for (Usuario usuario : usuarios) {
				if (!emisor.equals(usuario)) {
					usuario.recibirMensaje(emisor, mensaje);
				}
			}
		} else {
			if (usuarios.contains(mensaje.getReceptor()) && !emisor.equals(mensaje.getReceptor())) {
				Usuario receptor = mapUsuarios.get(mensaje.getReceptor().getNumero());
				receptor.recibirMensaje(emisor, mensaje);
			} else {
				System.out.println("No existe el numero receptor en la lista de contactos!");
			}
		}
	}

}
