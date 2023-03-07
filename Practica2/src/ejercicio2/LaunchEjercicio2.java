package ejercicio2;

public class LaunchEjercicio2 {
	public static void main(String[] args) {
		AdministradorCuartel administradorCuartel = new AdministradorCuartel();

		administradorCuartel.attend("Limpieza");
		administradorCuartel.attend("Desbloqueos");
		administradorCuartel.attend("Manifestaciones");
		administradorCuartel.attend("Disciplina");
		administradorCuartel.attend("Entrevistas");

		administradorCuartel.attend("Organizacion");

	}
}
