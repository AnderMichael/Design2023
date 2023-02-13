package example;

public class LaunchStory {
	public static void main(String[] args) {
		MaquinaExpendedora maquinaExpendedora = MaquinaExpendedora.getMaquinaExpendedora();

		maquinaExpendedora.showInfo();

		Pablito pablito = new Pablito();

		pablito.comerChocolates(maquinaExpendedora);
		pablito.tomarCocaCola(maquinaExpendedora);

		maquinaExpendedora.showInfo();
		Mickey mickey = new Mickey();
		mickey.aniadirCocaColas(maquinaExpendedora);
		
		maquinaExpendedora.showInfo();
	}
}
