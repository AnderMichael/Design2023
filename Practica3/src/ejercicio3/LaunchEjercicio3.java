package ejercicio3;

public class LaunchEjercicio3 {
	public static void main(String[] args) {
		Archivo archivo1 = new Archivo("Patrones de disenio");
		Archivo archivo2 = new Archivo("Redes neuronales e inteligencia artificial");
		Archivo archivo3 = new Archivo("Teleinformatica");
		Archivo archivo4 = new Archivo("Better call Saul!!!");

		archivo1.showGuardable();

		Folder folder1 = new Folder();
		folder1.guardarArchivo(archivo1);
		folder1.guardarArchivo(archivo4);

		Folder folder2 = new Folder();
		folder2.guardarArchivo(archivo2);
		folder2.guardarArchivo(archivo3);

		folder1.showGuardable();

		UnidadDisco disco = new UnidadDisco();
		disco.guardarFolder(folder1);
		disco.guardarFolder(folder2);

		disco.showGuardable();
	}
}
