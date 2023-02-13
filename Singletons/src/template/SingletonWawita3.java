package template;

public class SingletonWawita3 {

	private static SingletonWawita3 instance;

	// 2) constructor private
	private SingletonWawita3() {
		System.out.println("Creacion deberia mostrarse 1 sola vez singleton Wawita3");
	}

	// La extensión synchronized ayuda a atender consultas de manera secuencial
	// aunque sean al mismo tiempo
	private synchronized static void multiThreadManage() {
		if (instance == null) {
			instance = new SingletonWawita3();
		}
	}

	// global access
	public static SingletonWawita3 getSingletonWawtita() {
		if (instance == null) {
			multiThreadManage();
		}
		return instance;
	}
	
	// Un Singleton no es un objeto clonable
}
