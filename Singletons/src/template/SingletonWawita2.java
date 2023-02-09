package template;

public class SingletonWawita2 {

	private static final SingletonWawita2 SINGLETON_WAWITA2 = new SingletonWawita2();

	private SingletonWawita2() {
		System.out.println("Un singleton solo debería crearse una sola vez");
	}
	
	public static SingletonWawita2 getSingletonWawtita() {
		return SINGLETON_WAWITA2;
	}

	public void getName() {
		System.out.println("El SingletonWawita2 está VIVO!");
	}

}
