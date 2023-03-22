package ejercicio4;

public class AppWeb implements Componente {
	public String nombre;

	public AppWeb(String nombre) {
		this.nombre = nombre;
	}

	public void presentacionUsuario(Usuario usuario) {
		presentation();
		System.out.println(String.format("Te hemos extraniado: %s", usuario.getNombre()));
		System.out.println("**************************");
	}

	@Override
	public void presentation() {
		System.out.println(String.format("*****Binevenido a %s*****", nombre));
	}
}
