package template;

public class LaunchVisitor {

	public static void main(String[] args) {
		// Un algoritmo que puede ser seteado en un atributo

		ConcreteElementA elementA = new ConcreteElementA();
		ConcreteElementB elementB = new ConcreteElementB();

		ConcreteVisitor visitor = new ConcreteVisitor();

		elementA.accept(visitor);
		elementB.accept(visitor);
	}

}
