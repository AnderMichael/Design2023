package template;

public class LaunchAbstractFactory {

	public static void main(String[] args) {
		String dato = "ConcreteProduct3";
		
		AbstractFactory.make(dato).methodA();
		AbstractFactory.make(dato).methodB();
		AbstractFactory.make(dato).methodC();
	}

}
