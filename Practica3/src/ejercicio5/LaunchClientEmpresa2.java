package ejercicio5;

public class LaunchClientEmpresa2 {

	public static void main(String[] args) {
		AplicacionEmpresa1 awesomeList = new AplicacionEmpresa1("AwesomeList");
		AplicacionEmpresa2 reactJose = new AplicacionEmpresa2("React_Jose!", "com");

		reactJose.iniciarSesion();
		// No puedo hacer awesomeList.login(); No existe en el flujo de trabajo de la
		// empresa 2
		AdapterAplicacionEmpresa1 awesomeListE2 = new AdapterAplicacionEmpresa1(awesomeList);
		// Ahora sí...
		awesomeListE2.iniciarSesion();

		reactJose.generacionDatos("React es una herramienta poderosa al momento de hacer frontend!");
		awesomeListE2.generacionDatos("Herramienta desarrollada en el framework React Native!");

		reactJose.cerrarSesion();
		awesomeListE2.cerrarSesion();
	}

}
