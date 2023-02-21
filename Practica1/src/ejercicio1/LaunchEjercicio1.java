package ejercicio1;

import java.util.Random;

public class LaunchEjercicio1 {

	public static void main(String[] args) {
		Random rnd = new Random();
		VentanillaDePago ventanillaDePago = VentanillaDePago.getVentanilla();

		ventanillaDePago.showInfo();

		Encargado encargado = new Encargado("Luciano Vargas", "61398");

		encargado.ingresarVentanila(ventanillaDePago);
		ventanillaDePago.showInfo();

		Estudiante estudiantes[] = { new Estudiante("Ander", "63428"), new Estudiante("Hugo", "62468"),
				new Estudiante("Enrique", "53929"), new Estudiante("Dylan", "85893"),
				new Estudiante("Mateo", "56372") };

		for (Estudiante estudiante : estudiantes) {
			estudiante.pagarMatricula(ventanillaDePago, Math.round(rnd.nextDouble() * 200));
		}

		encargado.salirVentanilla();
		ventanillaDePago.showInfo();
	}
}
