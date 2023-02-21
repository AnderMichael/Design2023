package ejercicio4;

public class LaunchEjercicio4 {

	public static void main(String[] args) {
		Estudiante estudiantes[] = { new Estudiante("Huguito Apaza", "64732"), new Estudiante("Amy Rojas", "75840"),
				new Estudiante("Enrique Vicente", "53455"), new Estudiante("Jose Carrasco", "47574"),
				new Estudiante("Andersaurio Cayman", "75748") };
		Materia matematicas = FactoryMaterias.generateMateria("Matematicas");
		Materia lenguaje = FactoryMaterias.generateMateria("Lenguaje");
		Materia historia = FactoryMaterias.generateMateria("Historia");
		Materia ingles = FactoryMaterias.generateMateria("Ingles");

		matematicas.inscribirEstudiante(estudiantes[0]);
		// Un estudiante solo puede inscribirse una vez
		matematicas.inscribirEstudiante(estudiantes[0]);

		matematicas.inscribirEstudiante(estudiantes[4]);

		lenguaje.inscribirEstudiante(estudiantes[1]);
		historia.inscribirEstudiante(estudiantes[3]);
		ingles.inscribirEstudiante(estudiantes[2]);

		matematicas.showInfo();
		lenguaje.showInfo();
		historia.showInfo();
		ingles.showInfo();

	}

}
