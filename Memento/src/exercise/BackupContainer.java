package exercise;

import java.util.ArrayList;
import java.util.List;

public class BackupContainer {
	private List<Backup> backups = new ArrayList<>();

	public void addBackup(Backup backup) {
		backups.add(backup);
	}

	public Backup getBackup(int backupNumber) {
		Backup backup = backups.get(backupNumber - 1);
		return backup;
	}
}
