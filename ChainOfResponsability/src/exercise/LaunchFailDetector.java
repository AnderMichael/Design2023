package exercise;

public class LaunchFailDetector {

	public static void main(String[] args) {
		FailDetector failDetector = new FailDetector();

		Fail fail1 = new Fail();
		fail1.setTitulo("La pagina no responde!");
		fail1.setSeveridad("BAJA");
		fail1.setDescripcion("Ingreso a mi perfil pero no tengo mis datos\nLa base de datos debe contar con problemas");

		Fail fail2 = new Fail();
		fail2.setTitulo("Los datos del producto son incorrectos!");
		fail2.setSeveridad("MEDIA");
		fail2.setDescripcion(
				"Compre un producto pero no obtengo la informacion correcta de este\nLos productos no estan configurados");

		Fail fail3 = new Fail();
		fail3.setTitulo("La pagina me muestra diferentes configuraciones que no solicite!");
		fail3.setSeveridad("ALTA");
		fail3.setDescripcion(
				"Configure la vista de la pagina por default pero tengo otras vistas configuradas en lugar de esa\nLa pagina no ofrece un experiencia de calidad");

		Fail fail4 = new Fail();
		fail4.setTitulo("Mi usuario no existe a pesar de que me haya registrado 3 veces!");
		fail4.setSeveridad("CRITICA");
		fail4.setDescripcion(
				"No puedo iniciar sesion en la pagina, me aparece un error de logeo\nLa informacion no debe guardarse en la base de datos");

		System.out.println("Se tienen los siguientes reportes de fallas:");
		System.out.println();

		failDetector.catchFail(fail1);
		failDetector.catchFail(fail2);
		failDetector.catchFail(fail3);
		failDetector.catchFail(fail4);

		System.out.println("INFORMAR A LOS CORRESPONDIENTES!");
	}

}
