package example;

public class LaunchExample {
	public static void main(String[] args) {
		Perro perro = new Perro();
		Gato gato = new Gato();
		Caballo caballo = new Caballo();

		Veterinario veterinario = new Veterinario();

		perro.accept(veterinario);
		gato.accept(veterinario);
		caballo.accept(veterinario);
	}
}
