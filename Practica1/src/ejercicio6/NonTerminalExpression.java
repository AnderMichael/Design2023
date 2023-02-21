package ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class NonTerminalExpression {
	private Context context;
	private List<AbstractExpression> grammar = new ArrayList<>();

	public NonTerminalExpression(String input) {
		context = new Context(input.replace(" ", ""));
		for (String palabra : input.split(" ")) {
			switch (palabra) {
			case "Como":
				grammar.add(new TerminalExpressionComo());
				break;
			case "Quiero":
				grammar.add(new TerminalExpressionQuiero());
				break;
			case "Para":
				grammar.add(new TerminalExpressionPara());
				break;
			case "administrador":
				grammar.add(new TerminalExpressionAdministrador());
				break;
			default:
				grammar.add(new TerminalExpressionCualquierPalabra(palabra));
				break;
			}
		}
	}

	public String getOutput() {
		for (AbstractExpression expression : grammar) {
			expression.interpreter(context);
		}
		return context.getOutput();
	}
}
