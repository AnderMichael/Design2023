package ejercicio5;

public class LaunchProyecto {

	public static void main(String[] args) {
		Git git = new Git();
		GitHub gitHub = new GitHub();
		Proyecto proyecto = new Proyecto("AndersaurioSchool");

		Desarrollador dev1 = new Desarrollador("Andersaurio", "DinoAnder1");
		Desarrollador dev2 = new Desarrollador("Vivs", "DinoVivs2");
		Desarrollador dev3 = new Desarrollador("Brenda", "DinoBrenda3");

		gitHub.addSuscriptor(dev1);
		gitHub.addSuscriptor(dev2);
		gitHub.addSuscriptor(dev3);

		proyecto.addCodigo("1. Class -> Student, Class -> Teacher, Class -> School\n");
		git.setLastVersion(proyecto);
		gitHub.addVersionProyecto(git.getLastVersion());

		proyecto.addCodigo("2. Student COMPOSE Teacher\n");
		git.setLastVersion(proyecto);
		gitHub.addVersionProyecto(git.getLastVersion());

		proyecto.addCodigo("3. Teacher COMPOSE School\n");
		git.setLastVersion(proyecto);
		gitHub.addVersionProyecto(git.getLastVersion());

		proyecto.addCodigo("4. Class -> Course\n");
		git.setLastVersion(proyecto);
		gitHub.addVersionProyecto(git.getLastVersion());

		proyecto.addCodigo("5. Student COMPOSE Course\n");
		git.setLastVersion(proyecto);
		gitHub.addVersionProyecto(git.getLastVersion());

		git.setLastVersion(gitHub.getVersionProyecto(1));
		git.getLastVersion().showInfo();

		gitHub.removeSuscriptor(dev1);
		gitHub.removeSuscriptor(dev2);
		gitHub.removeSuscriptor(dev3);

		dev1 = new Desarrollador("Enrique", "Chef1");
		dev2 = new Desarrollador("Huguito", "Chef2");
		dev3 = new Desarrollador("Amy", "Chef3");

		gitHub.addSuscriptor(dev1);
		gitHub.addSuscriptor(dev2);
		gitHub.addSuscriptor(dev3);

		git.setLastVersion(gitHub.getVersionProyecto(5));
		git.getLastVersion().showInfo();

	}

}
