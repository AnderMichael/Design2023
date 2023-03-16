package exercise.bridge;

public class Windows extends Plataforma {

	public Windows(String version) {
		super("Windows", version);
	}

	@Override
	public void showInfo() {
		System.out.println("=====WINDOWS=====");
		System.out.println("Bienvenido a Windows!");
		System.out.println("Usted tiene en sus manos la version: " + super.getVersion());
		System.out.println("Cuenta con la arquitectura: " + super.getNombre() + super.getVersion()
				+ super.getArquitectura().getNombre());
		System.out.println("=================");
	}

}
