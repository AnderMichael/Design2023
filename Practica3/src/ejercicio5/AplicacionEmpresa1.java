package ejercicio5;

public class AplicacionEmpresa1 implements AplicacionMovil {
	private String name;

	public AplicacionEmpresa1(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void login() {
		System.out.println(String.format("*****%s*****", name));
		System.out.println(String.format("An user has logged in the app %s!", name));
	}

	@Override
	public void logout() {
		System.out.println(String.format("*****%s*****", name));
		System.out.println(String.format("An user has closed his session in the app %s!", name));

	}

	@Override
	public void report(String reportContent) {
		System.out.println(String.format("*****%s*****", name));
		System.out.println(String.format("An user has wrote the next content:\n%s", reportContent));
		if (reportContent.length() > 60) {
			System.out.println("You must simplify the report content otherwise it won't we be analyzed!");
		} else {
			System.out.println("The report will we be analyzed in some minutes. Wait please!");
		}
	}

}
