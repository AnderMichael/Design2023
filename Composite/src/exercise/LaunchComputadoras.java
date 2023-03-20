package exercise;

public class LaunchComputadoras {

	public static void main(String[] args) {
		Computadora computadoras[] = new Computadora[5];
		for (int i = 0; i < computadoras.length; i++) {
			computadoras[i] = new Computadora("Computadora" + i, 100);
		}

		computadoras[0].showInfo();

		Laboratorio laboratorio1 = new Laboratorio("Labo1", computadoras[0], computadoras[1]);
		Laboratorio laboratorio2 = new Laboratorio("Labo2", computadoras[2], computadoras[3]);

		laboratorio1.showInfo();

		ContenedorComputadoras contenedor1 = new ContenedorComputadoras("Contenedor1", laboratorio1, laboratorio2);

		contenedor1.showInfo();
	}

}
