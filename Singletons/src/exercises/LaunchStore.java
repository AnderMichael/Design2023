package exercises;

import template.SingletonWawita3;

public class LaunchStore {

	public static void main(String[] args) {

		Logger logger = Logger.getLogger();

		Thread user1 = new Thread(new Runnable() {
			@Override
			public void run() {
				Product product = new Product("OLA", 192.00);
				logger.register(product.presentation());
			}
		});

		Thread user2 = new Thread(new Runnable() {
			@Override
			public void run() {
				Client client = new Client("Andersaurio", "Cayman", "11");
				logger.register(client.presentation());

			}
		});

		Thread user3 = new Thread(new Runnable() {
			@Override
			public void run() {
				Bill bill = new Bill("11", "Gracias por comprar en Pollos Hermanos");
				logger.register(bill.presentation());
			}
		});

		Thread user4 = new Thread(new Runnable() {
			@Override
			public void run() {
				Promotion bill = new Promotion("19-08.22", 190.00);
				logger.register(bill.presentation());
			}
		});

		user1.start();
		user2.start();
		user3.start();
		user4.start();
	}

}
