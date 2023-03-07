package ejercicio7;

public class LaunchEjercicio7 {

	public static void main(String[] args) {
		EncargadoPrestamos encargadoPrestamos = new EncargadoPrestamos();

		Persona persona1 = new Persona("Andersuario Cayman", "12830093");
		Persona persona2 = new Persona("Hugotzilla Apaza", "57483900");
		persona1.showInfo();
		persona2.showInfo();

		persona1.solicitarPrestamo("No me da la vida", "01-01-2023", encargadoPrestamos, 1000);
		persona2.solicitarPrestamo("No me da la vida pos...", "01-02-2023", encargadoPrestamos, 2000);
		persona1.showInfo();
		persona2.showInfo();

		for (int i = 0; i < 10; i++) {
			persona1.pagarPrestamo(100, encargadoPrestamos);
			//persona2.pagarPrestamo(200, encargadoPrestamos);
		}

	}

}
