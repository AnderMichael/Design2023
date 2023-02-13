package template;

public class LaunchSingletons {

	public static void main(String[] args) {
		SingletonWawita1 singletonWawita1 = SingletonWawita1.getSingletonWawtita();
//		SingletonWawita1 singletonWawita2 = SingletonWawita1.getSingletonWawtita();
//		SingletonWawita1 singletonWawita3 = SingletonWawita1.getSingletonWawtita();
	
		// Todos los singletons superiores son solo uno, diferentes variables pero con
		// una sola dirección de memoria

//		System.out.println(singletonWawita1.hashCode());
//		System.out.println(singletonWawita2.hashCode());
//		System.out.println(singletonWawita3.hashCode());
//		System.out.println(singletonWawita1);
//
//		SingletonWawita2 singletonWawita4 = SingletonWawita2.getSingletonWawtita();
//		SingletonWawita2 singletonWawita5 = SingletonWawita2.getSingletonWawtita();
//		SingletonWawita2 singletonWawita6 = SingletonWawita2.getSingletonWawtita();
//
//		// Todos los singletons superiores son solo uno, diferentes variables pero con
//		// una sola dirección de memoria
//
//		System.out.println(singletonWawita4.hashCode());
//		System.out.println(singletonWawita5.hashCode());
//		System.out.println(singletonWawita6.hashCode());
//		System.out.println(singletonWawita4);
//
//		// El tercer modelo se basa enteramente en usar la extensión syncrinized con tal
//		// de evitar que los hilos creen sus propios singletons
//
//		Thread user1 = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				SingletonWawita3 singletonWawita7 = SingletonWawita3.getSingletonWawtita();
//				System.out.println("singleton 7 : " + singletonWawita7);
//			}
//		});
//
//		Thread user2 = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				SingletonWawita3 singletonWawita8 = SingletonWawita3.getSingletonWawtita();
//				System.out.println("singleton 2 : " + singletonWawita8);
//			}
//		});
//
//		Thread user3 = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				SingletonWawita3 singletonWawita9 = SingletonWawita3.getSingletonWawtita();
//				System.out.println("singleton 3 : " + singletonWawita9);
//			}
//		});
//
//		user1.start();
//		user2.start();
//		user3.start();
	}

}
