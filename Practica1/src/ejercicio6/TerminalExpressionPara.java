package ejercicio6;

public class TerminalExpressionPara extends AbstractExpression {

	@Override
	public void interpreter(Context context) {
		if (context.getInput().startsWith("Para")) {
			context.setOutput(context.getOutput() + "Then ");
			context.setInput(context.getInput().substring(4));
		}

	}

}
