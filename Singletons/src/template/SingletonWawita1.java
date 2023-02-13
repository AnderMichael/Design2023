package template;

public class SingletonWawita1 {

	// 1st step ---> Same type attribute
	private static SingletonWawita1 singletonWawita;

	// 2nd Private constructor
	private SingletonWawita1() {
		System.out.println("Un singleton solo debería crearse una sola vez: SingletonWawita1");
	}

	// 3rd Global access
	public static SingletonWawita1 getSingletonWawtita() {
		if (singletonWawita == null) {
			singletonWawita = new SingletonWawita1();
		} 
		return singletonWawita;
	}

	public void getName() {
		System.out.println("El Singleton está VIVO!");
	}
}
