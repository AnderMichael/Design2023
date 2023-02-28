package exercise;

public class Backupper {
	private BDPersonas lastBDPersonas;

	public void setLastBDPersonas(BDPersonas lastBDPersonas) {
		this.lastBDPersonas = new BDPersonas();
		this.lastBDPersonas.setPersonas(lastBDPersonas.getPersonas().stream().toList());
	}

	public Backup createBackup(String alias) {
		return new Backup(alias, lastBDPersonas);
	}

	public BDPersonas restore(Backup backup) {
		this.lastBDPersonas = backup.getBDPersonasBackup();
		return this.lastBDPersonas;
	}
}
