package exercise.nobridge;

public class Linux extends Plataforma {

	public Linux(String arquitectura) {
		super(arquitectura, "Linux", "");
	}

	@Override
	public void showInfo() {
		System.out.println("=====LINUX=====");
		System.out.println("Bienvenido a Linux!");
		System.out.println("Version software libre: " + super.getVersion());
		System.out.println("Se cuenta con la siguiente arquitectura: " + super.getNombre() + super.getVersion()
				+ super.getArquitectura());
		System.out.println("===============");
	}

}
