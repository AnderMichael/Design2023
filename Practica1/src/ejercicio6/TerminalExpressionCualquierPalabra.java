package ejercicio6;

public class TerminalExpressionCualquierPalabra extends AbstractExpression {
	private String palabra;

	public TerminalExpressionCualquierPalabra(String palabra) {
		this.palabra = palabra;
	}

	@Override
	public void interpreter(Context context) {
		context.setOutput(context.getOutput() + palabra + " ");
		context.setInput(context.getInput().substring(palabra.length()));
	}

}
