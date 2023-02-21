package ejercicio6;

public class TerminalExpressionQuiero extends AbstractExpression {

	@Override
	public void interpreter(Context context) {
		if (context.getInput().startsWith("Quiero")) {
			context.setOutput(context.getOutput() + "When ");
			context.setInput(context.getInput().substring(6));
		}

	}

}
