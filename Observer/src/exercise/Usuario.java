package exercise;

import java.util.HashSet;
import java.util.Set;

public class Usuario implements IUsuario {
	private String nombre;
	private String ci;
	private Set<String> notificaciones = new HashSet<>();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public Set<String> getNotificaciones() {
		return notificaciones;
	}

	public void setNotificaciones(Set<String> notificaciones) {
		this.notificaciones = notificaciones;
	}

	public Usuario(String nombre, String ci) {
		this.nombre = nombre;
		this.ci = ci;
	}

	@Override
	public void update(String message) {
		System.out.println("**********Usuario***********");
		System.out.println(String.format("Buenos dias, %s! Tienes la siguiente notificacion:", nombre));
		System.out.println(String.format("De COTEL: %s", message));
		System.out.println(String.format("Para el usuario %s", ci));
		System.out.println();
	}
}
