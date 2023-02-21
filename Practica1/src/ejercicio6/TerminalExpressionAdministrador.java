package ejercicio6;

public class TerminalExpressionAdministrador extends AbstractExpression {

	@Override
	public void interpreter(Context context) {
		if (context.getInput().startsWith("administrador")) {
			context.setOutput(context.getOutput() + "administrator ");
			context.setInput(context.getInput().substring(13));
		}

	}

}
