package exercise.bridge;

public class Linux extends Plataforma {

	public Linux() {
		super("Linux", "");
	}

	@Override
	public void showInfo() {
		System.out.println("=====LINUX=====");
		System.out.println("Bienvenido a Linux!");
		System.out.println("Version software libre: " + super.getVersion());
		System.out.println("Se cuenta con la siguiente arquitectura: " + super.getNombre() + super.getVersion()
				+ super.getArquitectura().getNombre());
		System.out.println("===============");
	}

}
