package exercise;

public class Personaje {

	private String nombre;
	private int lifePoints;
	private boolean escudo;

	public void correr() {
		System.out.println("El personaje correra.");
	}

	public void saltar() {
		System.out.println("El personaje saltara.");
	}

	public void golpear() {
		System.out.println("El personaje golpeara.");
	}

	public void protegerse() {
		System.out.println("El personaje se protegera.");
	}

	public void curarse() {
		System.out.println("El personaje se curara.");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLifePoints() {
		return lifePoints;
	}

	public void setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
	}

	public boolean isEscudo() {
		return escudo;
	}

	public void setEscudo(boolean escudo) {
		this.escudo = escudo;
	}

	public Personaje(String nombre, int lifePoints) {
		this.nombre = nombre;
		this.lifePoints = lifePoints;
	}

	public void showInfo() {
		System.out.println("*****Personaje*****");
		System.out.println(String.format("Nombre: %s", nombre));
		System.out.println(String.format("Puntos de vida: %d", lifePoints));
		System.out.println(String.format("Escudo: %s", escudo));
		System.out.println("*******************");
	}

}
