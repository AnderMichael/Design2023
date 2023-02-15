package exercise;

public class LaunchComputadoras {

	public static void main(String[] args) {
		// Nuestro técnico
		ExpertoEnsambladorComputadorasCertificadoISO tecnico = new ExpertoEnsambladorComputadorasCertificadoISO();

		// Maquinas para ensamblar
		ComputadoraI5 computadoraI5 = new ComputadoraI5();
		tecnico.setBuilderComputadora(computadoraI5);
		tecnico.ensamblarComputadora();
		Computadora computadoraHuguito = tecnico.getComputadoraEnsamblada();

		ComputadoraI7 computadoraI7 = new ComputadoraI7();
		tecnico.setBuilderComputadora(computadoraI7);
		tecnico.ensamblarComputadora();
		Computadora computadoraChefcito = tecnico.getComputadoraEnsamblada();

		ComputadoraI9 computadoraI9 = new ComputadoraI9();
		tecnico.setBuilderComputadora(computadoraI9);
		tecnico.ensamblarComputadora();
		Computadora computadoraMateo = tecnico.getComputadoraEnsamblada();

		// Máquinas ensambladas
		computadoraHuguito.showInfo();
		computadoraChefcito.showInfo();
		computadoraMateo.showInfo();
		// Todo gracias a nuestro Experto Ensamblador de Computadoras Certificado por la ISO!
	}

}
