package exercise;

import java.util.List;

public class LaunchBDPersonas {
	public static void main(String[] args) {
		BackupContainer backupContainer = new BackupContainer();
		Backupper backupper = new Backupper();

		BDPersonas bdPersonas = new BDPersonas();
		List<Persona> personas = List.of(new Persona("Clem Alenikov", "33.189.164.61/17", 2009),
				new Persona("Etienne de Chastelain", "219.95.137.180/17", 2005),
				new Persona("Adrianna Crompton", "95.216.31.232/9", 1992),
				new Persona("Fowler Lyburn", "45.83.82.166/15", 1992),
				new Persona("Hersh Harmes", "214.186.38.154/17", 1994),
				new Persona("Eleanor Mowsdale", "107.10.170.207/15", 2000),
				new Persona("Dale Carnew", "255.63.115.194/24", 1996),
				new Persona("Brien Dows", "34.123.216.245/25", 2001),
				new Persona("Blancha Thurnham", "124.40.26.13/25", 2010),
				new Persona("Stavro Thurlbourne", "38.254.16.47/22", 1998),
				new Persona("Leoline Boyse", "253.62.202.208/25", 2000),
				new Persona("Ax Tessier", "64.109.239.254/16", 2010),
				new Persona("Petronella Lowth", "152.105.240.9/25", 2004),
				new Persona("Georgetta Wheeldon", "10.238.132.185/9", 1987),
				new Persona("Wynne Roff", "29.63.79.118/10", 1995),
				new Persona("Noble Foulis", "106.70.117.147/6", 1998),
				new Persona("Pauletta Benoix", "126.158.120.79/2", 2012),
				new Persona("Linnea de Grey", "70.9.101.51/18", 1992),
				new Persona("Rafaellle Pashby", "243.215.21.187/5", 1992),
				new Persona("Freeman MacLice", "214.0.210.138/13", 2009),
				new Persona("Edward Loomes", "180.63.184.138/8", 2012),
				new Persona("Bengt Suggey", "33.110.196.104/8", 2006),
				new Persona("Willie Bernat", "250.18.47.213/23", 2005),
				new Persona("Mannie Daws", "148.153.53.22/26", 1998),
				new Persona("Sig Vaen", "120.33.223.175/11", 2012),
				new Persona("Jenda Lawford", "43.49.67.171/20", 2002),
				new Persona("Walliw Turgoose", "252.51.235.225/14", 2009),
				new Persona("Ninetta Alessandrucci", "134.155.73.237/28", 2007),
				new Persona("Cassandry Purdom", "246.251.14.121/6", 2004),
				new Persona("Wyatt Matura", "183.125.133.37/13", 1992),
				new Persona("Lynnell Petyt", "158.180.190.35/12", 1993),
				new Persona("Johnna Woodier", "166.155.245.119/18", 2005),
				new Persona("Bibbie Pinor", "113.63.68.138/12", 2011),
				new Persona("Oberon Conew", "96.198.138.33/25", 2002),
				new Persona("Tracy Shrimplin", "193.113.154.169/25", 2008),
				new Persona("Morie Spottiswoode", "248.85.171.209/12", 2010),
				new Persona("Becka Lillow", "107.31.109.144/19", 1996),
				new Persona("Beatrisa Fourman", "94.254.85.197/30", 1998),
				new Persona("Drucie Westrope", "239.251.183.64/7", 1976),
				new Persona("Marchall Treat", "181.162.122.147/23", 2003),
				new Persona("Seline Arman", "70.53.172.102/20", 2011),
				new Persona("Ashlin Paragreen", "114.153.209.60/2", 1995),
				new Persona("Letizia Skeermer", "67.181.73.124/28", 2012),
				new Persona("Cally Baszkiewicz", "154.186.30.82/25", 2004),
				new Persona("Audy Frew", "237.184.113.17/1", 1988),
				new Persona("Kahaleel Turtle", "23.224.45.72/30", 2013),
				new Persona("Carleton Wheatland", "244.45.7.29/10", 2007),
				new Persona("Charla Dreelan", "41.180.200.79/25", 2012),
				new Persona("Orland Fallowfield", "173.7.165.53/28", 2005),
				new Persona("Tove Langford", "22.211.77.119/31", 2010),
				new Persona("Buddie Crews", "130.231.103.16/31", 1995),
				new Persona("Kaitlynn MacGiolla", "1.30.253.101/20", 1992),
				new Persona("Lurleen Howler", "92.169.134.77/14", 2003),
				new Persona("Gavrielle Heinrich", "100.83.230.243/6", 1989),
				new Persona("Fanchon Silveston", "20.76.6.231/26", 1985),
				new Persona("Kristine Lemin", "63.123.243.217/13", 1999),
				new Persona("Normie Durbann", "232.192.136.156/11", 2005),
				new Persona("Torrie McCarrell", "183.226.56.12/21", 2002),
				new Persona("Dave Coaker", "93.15.8.216/27", 2010),
				new Persona("Erma Entwistle", "4.42.114.31/13", 2011),
				new Persona("Lindsay Giddings", "224.200.211.12/6", 2006),
				new Persona("Yorgo O'Neal", "66.210.229.218/11", 2002),
				new Persona("Michelle Haxell", "24.197.239.127/7", 1996),
				new Persona("Bastian Gingle", "225.59.222.52/14", 2001),
				new Persona("Shae Robberecht", "168.202.153.8/15", 2006),
				new Persona("Wolfy Klee", "148.208.192.232/8", 1995),
				new Persona("Winnah Rebichon", "92.215.207.35/3", 2002),
				new Persona("Katalin Rowbottom", "128.25.39.103/10", 2007),
				new Persona("Arden Lathom", "93.125.3.147/18", 1984), new Persona("Lil Covil", "149.67.4.181/31", 1986),
				new Persona("Pru McGirl", "182.163.119.236/5", 2011),
				new Persona("Spense Ybarra", "221.181.127.193/10", 2005),
				new Persona("Abbi Hallyburton", "46.106.179.53/29", 2001),
				new Persona("Laurie Hoopper", "220.183.12.29/28", 1997),
				new Persona("Kayley Itzig", "139.170.194.77/13", 2002),
				new Persona("Marcella Vanichev", "250.168.99.125/11", 1993),
				new Persona("Letta Housiaux", "6.105.75.13/24", 1987),
				new Persona("Inglis Titcumb", "245.12.126.111/2", 2000),
				new Persona("Braden Bastide", "176.240.232.196/21", 1966),
				new Persona("Ewan Audenis", "186.186.252.173/12", 2007),
				new Persona("Janella Ruffle", "175.120.124.140/8", 2001),
				new Persona("Dell Blacklock", "243.134.28.213/7", 2011),
				new Persona("Romeo Zarfati", "73.83.71.7/16", 2009),
				new Persona("Kylie Lawful", "212.56.203.73/17", 2004),
				new Persona("Huntington Heppner", "23.116.18.25/29", 2003),
				new Persona("Shae Columbine", "253.188.211.161/28", 2007),
				new Persona("Rebeka McCrory", "9.200.218.124/4", 2012),
				new Persona("Danette Bengtsson", "102.176.65.98/11", 1987),
				new Persona("Tandy Kunert", "8.28.162.146/10", 2010),
				new Persona("Christos Hedgeman", "181.126.192.30/11", 2001),
				new Persona("Millie Gilluley", "69.254.126.214/27", 1991),
				new Persona("Eryn Sikora", "113.21.205.42/1", 1992),
				new Persona("Giusto Tweede", "111.107.55.243/19", 2011),
				new Persona("Orsa Lockery", "62.18.12.10/6", 2011),
				new Persona("Audrie Besset", "44.73.225.180/25", 2001),
				new Persona("Bryna Hammer", "159.171.229.149/23", 1997),
				new Persona("Jakie Yurenev", "140.139.122.159/19", 2008),
				new Persona("Levey O'Currigan", "11.130.43.38/3", 2011),
				new Persona("Karil Cockson", "205.28.136.175/19", 2002),
				new Persona("Joshuah De la Barre", "92.124.194.121/5", 1992));

		int i = 0;
		for (; i < 5; i++) {
			bdPersonas.addPersona(personas.get(i));
		}

		backupper.setLastBDPersonas(bdPersonas);
		backupContainer.addBackup(backupper.createBackup("BackupFebrero"));

		for (; i < 10; i++) {
			bdPersonas.addPersona(personas.get(i));
		}

		backupper.setLastBDPersonas(bdPersonas);
		backupContainer.addBackup(backupper.createBackup("BackupMarzo"));

		for (; i < 20; i++) {
			bdPersonas.addPersona(personas.get(i));
		}

		backupper.setLastBDPersonas(bdPersonas);
		backupContainer.addBackup(backupper.createBackup("BackupAbril"));

		for (; i < 25; i++) {
			bdPersonas.addPersona(personas.get(i));
		}

		backupper.setLastBDPersonas(bdPersonas);
		backupContainer.addBackup(backupper.createBackup("BackupJunio"));

		for (; i < 50; i++) {
			bdPersonas.addPersona(personas.get(i));
		}

		backupper.setLastBDPersonas(bdPersonas);
		backupContainer.addBackup(backupper.createBackup("BackupJulio"));

		bdPersonas = backupper.getBDPersonasVersion(backupContainer.getBackup(2));
		
		bdPersonas.showInfo();
	}
}
