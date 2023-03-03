package exercise;

import java.util.ArrayList;
import java.util.List;

public class COTEL implements CompaniaTelefonica {
	private String nombre = "COTEL";
	private List<Usuario> usuarios = new ArrayList<>();
	private Notificacion currentNotification;

	public COTEL() {
		System.out.println("===================================");
		System.out.println(String.format("Se creo un nuevo %s", nombre));
		System.out.println("===================================");

	}

	@Override
	public void attach(Usuario usuario) {
		usuarios.add(usuario);
	}

	@Override
	public void dettach(Usuario usuario) {
		usuarios.remove(usuario);
	}

	public void sendNotification(Notificacion notificacion) {
		currentNotification = notificacion;
		notifyUsuarios();
	}

	@Override
	public void notifyUsuarios() {
		for (Usuario usuario : usuarios) {
			if (usuario.getNotificaciones().contains(currentNotification.getType())) {
				usuario.update(currentNotification.getMessage());
			}
		}
	}

}
