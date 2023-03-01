package template;

public class LaunchChainOfResponsability {
	public static void main(String[] args) {
		HandleManager handleManager = new HandleManager();

		handleManager.criteriaHandler(50);
		handleManager.criteriaHandler(150);
		handleManager.criteriaHandler(250);
		handleManager.criteriaHandler(350);

		// La responsabilidad debería ir en aumento para hacer condiciones más simples
	}
}
