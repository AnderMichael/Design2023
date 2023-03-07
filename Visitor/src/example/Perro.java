package example;

public class Perro implements Animal {

	@Override
	public void accept(MedicoAnimales medicoAnimales) {
		medicoAnimales.tratamiento(this);
	}

	@Override
	public void onomatopeya() {
		System.out.println("Guau guau!");
	}

}
