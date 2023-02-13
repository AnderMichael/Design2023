package example;

public class MaquinaExpendedora {
	private static MaquinaExpendedora maquinaExpendedora;
	private static int latasCocaCola;
	private static int chocolates;

	private MaquinaExpendedora(int latasCocaCola, int chocolates) {
		this.latasCocaCola = latasCocaCola;
		this.chocolates = chocolates;
	}

	public static MaquinaExpendedora getMaquinaExpendedora() {
		if (maquinaExpendedora == null) {
			maquinaExpendedora = new MaquinaExpendedora(5, 5);
		}
		return maquinaExpendedora;
	}
	
	public void sacarCocaCola () {
		latasCocaCola--;
	}
	
	public void sacarChocolates () {
		chocolates--;
	}
	
	public void showInfo() {
		System.out.println("CocaColas: " +latasCocaCola);
		System.out.println("Chocolates: " +chocolates );
	}

	public void masCocaCola() {
		latasCocaCola++;
		
	}

}
