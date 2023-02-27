package template;

public class LaunchMediator {
	// Patron de comportamiento
	// Es un tipo de comunicador entre objetos, que funciona como una torre de
	// control para permitir a los objetos una comunicación sin conocerse

	public static void main(String[] args) {
		ConcreteMediator mediator = new ConcreteMediator();
		ConcreteColleagueA colleagueA = new ConcreteColleagueA(mediator);
		ConcreteColleagueB colleagueB = new ConcreteColleagueB(mediator);

		mediator.setColleagueA(colleagueA);
		mediator.setColleagueB(colleagueB);
		colleagueA.send("Andersaurio te saluda!");
		colleagueB.send("Hugotzilla te saluda!");
	}
}
