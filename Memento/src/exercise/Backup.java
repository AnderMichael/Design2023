package exercise;

public class Backup {
	private String alias;
	private BDPersonas bdPersonas;

	public Backup(String alias, BDPersonas bdPersonas) {
		this.alias = alias;
		this.bdPersonas = new BDPersonas();
		this.bdPersonas.setPersonas(bdPersonas.getPersonas().stream().toList());
	}

	public BDPersonas getBDPersonasBackup() {
		System.out.format("Usando Backup: %s\n", alias);
		return bdPersonas;
	}

	public String getAlias() {
		return alias;
	}

}
