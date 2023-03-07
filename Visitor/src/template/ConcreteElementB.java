package template;

public class ConcreteElementB implements IConcreteElement {

	@Override
	public void accept(IVisitor visitor) {
		System.out.println("Visitor accepted!!");
		visitor.visit(this);
	}

	@Override
	public void method1() {
		System.out.println("ConcreteElementB -> Method 1()");
	}

	@Override
	public void method2() {
		System.out.println("ConcreteElementB -> Method 2()");
	}

	@Override
	public void method3() {
		System.out.println("ConcreteElementB -> Method 3()");
	}

}
