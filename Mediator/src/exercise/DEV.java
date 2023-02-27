package exercise;

public class DEV extends TeamMember {

	public DEV(ICanalComunicacion canalComunicacion) {
		super(canalComunicacion, "DEV");
	}

	@Override
	public void sendMessage(String message) {
		String headerMessage = "Desde el equipo DEV para el equipo DEV:\n";
		String footerMessage = "By " + super.getNombre() + " - " + super.getCi() + " |YoC++|";
		super.getCanalComunicacion().sendMessage(headerMessage + message + footerMessage, this);
	}

	@Override
	public void reciveMessage(String message) {
		System.out.println("Bandeja de " + super.getNombre() + ":");
		System.out.println(message);
		System.out.println("Avoid Wrong Answer...");
		System.out.println();
	}

}
