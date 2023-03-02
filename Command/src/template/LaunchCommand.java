package template;

public class LaunchCommand {
	public static void main(String[] args) {
		// Un concrete object
		Receiver receiver = new Receiver();
		// Comandos para que el Concrete object realice las diferentes acciones
		ConcreteCommand1 clear = new ConcreteCommand1(receiver);
		ConcreteCommand2 build = new ConcreteCommand2(receiver);
		ConcreteCommand3 copy = new ConcreteCommand3(receiver);
		// Definir el proceso a través de una lista
		Invoker invoker = new Invoker();
		invoker.addCommand(copy).addCommand(clear).addCommand(build).addCommand(copy);

		invoker.run();
	}
}
