package ejercicio4;

public class LaunchEjercicio4 {
	public static void main(String[] args) {
		AppWeb appWeb = new AppWeb("MasterChef");
		ProxyAppWeb proxyAppWeb = new ProxyAppWeb(new Servidor("Servidor Impar"), new Servidor("Servidor Par"), appWeb);

		Usuario usuario1 = new Usuario("Ander", "Chef1");
		Usuario usuario2 = new Usuario("Hugo", "Chef2");
		Usuario usuario3 = new Usuario("Enrique", "Chef3");

		proxyAppWeb.addUsuario(usuario1);
		proxyAppWeb.addUsuario(usuario2);
		proxyAppWeb.addUsuario(usuario3);

		proxyAppWeb.login("Ander", "Chef1");
		proxyAppWeb.login("Hugo", "Chef2");
		proxyAppWeb.login("Enrique", "Chef3");
		proxyAppWeb.login("Ambar", "Chef1");

	}
}
