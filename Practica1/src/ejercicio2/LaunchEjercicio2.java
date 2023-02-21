package ejercicio2;

public class LaunchEjercicio2 {
	public static void main(String[] args) {

		Contrato contrato1 = new Contrato("Cesar", "Cayllan");
		contrato1.setAccesoPlataforma(true);
		contrato1.setCargaHoraria(80);
		contrato1.setCursoEducacionSuperior(true);
		contrato1.setMarcadoBiometrico(false);
		contrato1.setMarcadoHoraEntrada("8:00");
		contrato1.setMarcadoHoraSalida("18:00");
		contrato1.setSueldo(5000);
		contrato1.showInfo();

		Contrato contrato2 = contrato1.clone();
		contrato2.setNombre("Maria");
		contrato2.setApellido("Mamani");
		contrato2.showInfo();

		Contrato contrato3 = contrato1.clone();
		contrato3.setNombre("Virginia");
		contrato3.setApellido("Mamani");
		contrato3.showInfo();

		Contrato contrato4 = contrato1.clone();
		contrato4.setNombre("Simon");
		contrato4.setApellido("Posto");
		contrato4.showInfo();

		Contrato contrato5 = contrato1.clone();
		contrato5.setNombre("Jose");
		contrato5.setApellido("Mendoza");
		contrato5.showInfo();

		Contrato contrato6 = contrato1.clone();
		contrato6.setNombre("Johan");
		contrato6.setApellido("Paredes");
		contrato6.showInfo();

		Contrato contrato7 = contrato1.clone();
		contrato7.setNombre("Marcos");
		contrato7.setApellido("Lopez");
		contrato7.showInfo();

		Contrato contrato8 = contrato1.clone();
		contrato8.setNombre("Franco");
		contrato8.setApellido("Mamani");
		contrato8.showInfo();

		Contrato contrato9 = contrato1.clone();
		contrato9.setNombre("Gabriela");
		contrato9.setApellido("Cabrera");
		contrato9.showInfo();

		Contrato contrato10 = contrato1.clone();
		contrato10.setNombre("Angela");
		contrato10.setApellido("Choque");
		contrato10.showInfo();

		Contrato contrato11 = contrato1.clone();
		contrato11.setNombre("Humberto");
		contrato11.setApellido("Cruz");
		contrato11.showInfo();

		Contrato contrato12 = contrato1.clone();
		contrato12.setNombre("Franz");
		contrato12.setApellido("Loza");
		contrato12.showInfo();

		Contrato contrato13 = contrato1.clone();
		contrato13.setNombre("Francisco");
		contrato13.setApellido("Zuleta");
		contrato13.showInfo();

		Contrato contrato14 = contrato1.clone();
		contrato14.setNombre("Pedro");
		contrato14.setApellido("Machaca");
		contrato14.showInfo();

		Contrato contrato15 = contrato1.clone();
		contrato15.setNombre("Geovanna");
		contrato15.setApellido("Rojas");
		contrato15.showInfo();
	}
}
