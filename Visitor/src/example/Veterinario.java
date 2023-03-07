package example;

public class Veterinario implements MedicoAnimales {

	@Override
	public void tratamiento(Gato gato) {
		System.out.println("Gatito curado!");
	}

	@Override
	public void tratamiento(Caballo caballo) {
		System.out.println("Caballo curado!");

	}

	@Override
	public void tratamiento(Perro perro) {
		System.out.println("Perro curado!");
	}

}
