package exercise.bridge;

public class LaunchSOs {
	public static void main(String[] args) {
		Windows windows1 = new Windows("7");
		windows1.setArquitectura(new ArqX64());
		windows1.showInfo();

		Windows windows2 = new Windows("7");
		windows2.setArquitectura(new ArqX86());
		windows2.showInfo();

		Windows windows3 = new Windows("7");
		windows3.setArquitectura(new ArqX128());
		windows3.showInfo();

		Linux linux1 = new Linux();
		linux1.setArquitectura(new ArqX64());
		linux1.showInfo();

		Linux linux2 = new Linux();
		linux2.setArquitectura(new ArqX86());
		linux2.showInfo();

		Linux linux3 = new Linux();
		linux3.setArquitectura(new ArqX128());
		linux3.showInfo();
	}

}
