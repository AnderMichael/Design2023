
public class Child extends Parent {

	@Override
	public void method1() {
		super.method1();
		System.out.println("Del Hijo!");
	}

	/* NOOOO se puede, porque es un final
	 * @Override 
	 * public final void method2() { 
	 * 	super.method2();
	 * 	System.out.println("Del Hijo!"); 
	 * }
	 */
	
	@Override
	public void method3() {
		System.out.println("Metodo 3... Hijo!");
	}

}
