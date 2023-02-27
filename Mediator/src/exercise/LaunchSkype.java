package exercise;

public class LaunchSkype {

	public static void main(String[] args) {
		Skype skype = new Skype();

		QA amy = new QA(skype);
		amy.setCi("123");
		amy.setNombre("Amy");
		amy.showInfo();

		QA huguito = new QA(skype);
		huguito.setCi("456");
		huguito.setNombre("Huguito");
		huguito.showInfo();

		QA ander = new QA(skype);
		ander.setCi("789");
		ander.setNombre("Ander");
		ander.showInfo();

		skype.addQA(huguito);
		skype.addQA(ander);
		skype.addQA(amy);

		amy.sendMessage("Tenemos un Fatal Exception!!!");

		DEV jose = new DEV(skype);
		jose.setCi("135");
		jose.setNombre("Jose");
		jose.showInfo();

		DEV sarai = new DEV(skype);
		sarai.setCi("246");
		sarai.setNombre("Sarai");
		sarai.showInfo();

		DEV enrique = new DEV(skype);
		enrique.setCi("357");
		enrique.setNombre("Enrique");
		enrique.showInfo();

		skype.addDEV(jose);
		skype.addDEV(sarai);
		skype.addDEV(enrique);

		jose.sendMessage("Mi git no funca!!!");

		SM alexis = new SM(skype);
		alexis.setCi("579");
		alexis.setNombre("Alexis");
		alexis.showInfo();

		SM erwin = new SM(skype);
		erwin.setCi("680");
		erwin.setNombre("Erwin");
		erwin.showInfo();

		SM tommy = new SM(skype);
		tommy.setCi("536");
		tommy.setNombre("Tommy");
		tommy.showInfo();

		skype.addSM(alexis);
		skype.addSM(erwin);
		skype.addSM(tommy);

		alexis.sendMessage("Ante demasiados problemas solo puedo decir...\nBetter call Paul!!!");
	}
}
