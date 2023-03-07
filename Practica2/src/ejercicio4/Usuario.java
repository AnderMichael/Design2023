package ejercicio4;

public class Usuario {
	private String nombre;
	private String numero;
	private RedSocial redSocial;

	public Usuario(String nombre, String numero, RedSocial redSocial) {
		this.numero = numero;
		this.nombre = nombre;
		this.redSocial = redSocial;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void enviarMensajePublico(String contenido) {
		redSocial.notificar(this, new Mensaje(contenido, true));
	}

	public void enviarMensajePrivado(Usuario receptor, String contenido) {
		Mensaje mensaje = new Mensaje(contenido, false);
		mensaje.setReceptor(receptor);
		redSocial.notificar(this, mensaje);
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Usuario) {
			Usuario usuario = (Usuario) o;
			return usuario.numero.equals(this.numero);
		} else {
			return false;
		}
	}

	public void recibirMensaje(Usuario usuario, Mensaje mensaje) {
		System.out.println(String.format("Bandeja de mensajes de: %s", nombre));
		System.out.println(String.format("Mensaje de: %s - %s ", usuario.getNombre(), usuario.getNumero()));
		System.out.println(String.format("Mensaje:\n%s\n", mensaje.getContenido()));
	}
}
