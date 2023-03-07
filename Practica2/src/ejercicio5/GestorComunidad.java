package ejercicio5;

public interface GestorComunidad {
	public void addSuscriptor(SuscriptorGitHub suscriptorGitHub);

	public void removeSuscriptor(SuscriptorGitHub suscriptorGitHub);
	
	public void notifyComunidad(String message);
}
