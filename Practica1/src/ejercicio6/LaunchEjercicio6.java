package ejercicio6;

public class LaunchEjercicio6 {
	public static void main(String[] args) {
		String userStory = "Como administrador Quiero generar un reporte diario Para evaluar las ganancias";
		NonTerminalExpression nonTerminalExpression = new NonTerminalExpression(userStory);
		String output = nonTerminalExpression.getOutput();
		System.out.println(output);
	}
}
