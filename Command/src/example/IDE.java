package example;

public class IDE {
	private String nombre;
	private String version;
	private String license;
	private String owner;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void cleanBuild() {
		System.out.println("Limpiando el directorio build/ SUCCESS!");
	}

	public void runUnitTest() {
		System.out.println("Corriendo unit test programado / SUCCESS!");
	}

	public void compileCode() {
		System.out.println("Compilando el codigo/ SUCCESS!");
	}
	
	public void buildProject() {
		System.out.println("Construyendo el proyecto/ SUCCESS!");
	}

	public void showInfo() {
		System.out.println("*****IDE*****");
		System.out.println(String.format("Nombre: %s", nombre));
		System.out.println(String.format("Version: %s", version));
		System.out.println(String.format("License: %s", license));
		System.out.println(String.format("Owner: %s", nombre));



	}
}
