package exercises;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.StandardOpenOption;

public class Logger {
	private static FileWriter db;
	private static Logger logger = null;

	private Logger() {
		try {
			this.db = new FileWriter("dbLoggerToWrite.txt");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static synchronized void register(String message) {
		try {
			db.write(message);
			db.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static synchronized Logger getLogger() {
		if (logger == null) {
			logger = new Logger();
		}
		return logger;
	}

}
