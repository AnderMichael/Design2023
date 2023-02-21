package ejercicio3;

public class LaunchEjercicio3 {
	public static void main(String[] args) {
		IKitMateriales kitEscolar = new KitEscolarCreator().createKit();
		kitEscolar.showInfo();

		IKitMateriales kitColegial = new KitColegialCreator().createKit();
		kitColegial.showInfo();
	}
}
