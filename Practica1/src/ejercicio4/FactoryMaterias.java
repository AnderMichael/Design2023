package ejercicio4;

public class FactoryMaterias {
	public static Materia generateMateria(String materia) {
		switch (materia) {
		case "Matematicas":
			return new Matematicas();
		case "Lenguaje":
			return new Lenguaje();
		case "Historia":
			return new Historia();
		case "Ingles":
			return new Ingles();
		default:
			return null;
		}
	}
}
