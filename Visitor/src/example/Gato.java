package example;

public class Gato implements Animal {

	@Override
	public void accept(MedicoAnimales medicoAnimales) {
		medicoAnimales.tratamiento(this);
	}

	@Override
	public void onomatopeya() {
		System.out.println("Miau miau!!");
	}

}
