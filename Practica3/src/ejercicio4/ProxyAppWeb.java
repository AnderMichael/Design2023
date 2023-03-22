package ejercicio4;

import java.util.HashMap;
import java.util.Map;

public class ProxyAppWeb implements Componente {
	private Servidor servidor1;
	private Servidor servidor2;
	private Map<String, Usuario> bdLogin = new HashMap<>();
	private AppWeb appWeb;
	private boolean loginPar = false;

	public ProxyAppWeb(Servidor servidor1, Servidor servidor2, AppWeb appWeb) {
		this.servidor1 = servidor1;
		this.servidor2 = servidor2;
		this.appWeb = appWeb;
	}

	public Servidor getServidor1() {
		return servidor1;
	}

	public void setServidor1(Servidor servidor1) {
		this.servidor1 = servidor1;
	}

	public Servidor getServidor2() {
		return servidor2;
	}

	public void setServidor2(Servidor servidor2) {
		this.servidor2 = servidor2;
	}

	public void addUsuario(Usuario usuario) {
		bdLogin.put(usuario.getNombre(), usuario);
	}

	public void login(String name, String password) {
		if (bdLogin.containsKey(name)) {
			Usuario usuarioToLog = bdLogin.get(name);
			if (password.equals(usuarioToLog.getPassword())) {
				if (loginPar) {
					servidor2.presentation();
				} else {
					servidor1.presentation();
				}
				appWeb.presentacionUsuario(usuarioToLog);
				loginPar = !loginPar;
			} else {
				System.out.println("Login Invalido!!!");
			}

		} else {
			System.out.println("Este usuario no existe!!!!");
		}
	}

	@Override
	public void presentation() {
		System.out.println("Debes realizar la operacion de Login para ingresar a la aplicacion");
	}
}
