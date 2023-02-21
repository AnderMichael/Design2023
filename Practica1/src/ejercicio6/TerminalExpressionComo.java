package ejercicio6;

public class TerminalExpressionComo extends AbstractExpression {

	@Override
	public void interpreter(Context context) {
		if (context.getInput().startsWith("Como")) {
			context.setOutput(context.getOutput() + "Given ");
			context.setInput(context.getInput().substring(4));
		}

	}

}
