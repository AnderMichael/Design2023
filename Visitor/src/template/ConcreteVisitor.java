package template;

public class ConcreteVisitor implements IVisitor {

	@Override
	public void visit(ConcreteElementA elementA) {
		System.out.println("El visitante visita a ConcreteElementA:");
		elementA.method1();
		elementA.method2();
		elementA.method3();
	}

	@Override
	public void visit(ConcreteElementB elementB) {
		System.out.println("El visitante visita a ConcreteElementB:");
		elementB.method1();
		elementB.method2();
		elementB.method3();
	}

}
