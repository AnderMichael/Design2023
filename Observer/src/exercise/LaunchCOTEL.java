package exercise;

public class LaunchCOTEL {
	public static void main(String[] args) {
		COTEL cotel = new COTEL();
		String notificaciones[] = { "PreciosLlamadas", "Promociones", "Premios", "Noticia" };

		Usuario pedro = new Usuario("Pedro", "13456");
		Usuario maria = new Usuario("Maria", "75840");
		Usuario eynar = new Usuario("Eynar", "86859");

		pedro.getNotificaciones().add(notificaciones[1]);
		pedro.getNotificaciones().add(notificaciones[2]);

		maria.getNotificaciones().add(notificaciones[3]);

		eynar.getNotificaciones().add(notificaciones[0]);
		eynar.getNotificaciones().add(notificaciones[1]);
		eynar.getNotificaciones().add(notificaciones[2]);
		eynar.getNotificaciones().add(notificaciones[3]);

		cotel.attach(pedro);
		cotel.attach(maria);
		cotel.attach(eynar);

		cotel.sendNotification(new Notificacion("Escuchaste la oferta de COTELEANDO, 8Bs la hora!", notificaciones[0]));
		cotel.sendNotification(
				new Notificacion("COTEL! Ahora si con fibra optica a 200Bs! Ya nada sera como antes...", notificaciones[1]));
		cotel.sendNotification(
				new Notificacion("Felicidades! Por realizar 10 llamadas el dia de hoy te regalamos 1 minuto de llamada!",
						notificaciones[2]));
		cotel.sendNotification(new Notificacion("No quebramos! Revivimos con mas fuerza. Por cierto, aun debes del telefono...",
				notificaciones[3]));

	}
}
