package exercise;

public class SM extends TeamMember {

	public SM(ICanalComunicacion canalComunicacion) {
		super(canalComunicacion, "SM");
	}

	@Override
	public void sendMessage(String message) {
		String headerMessage = "Desde el equipo de SM para todo el personal de desarrollo:\n";
		String footerMessage = "By " + super.getNombre() + " - " + super.getCi() + " URGENTE!";
		super.getCanalComunicacion().sendMessage(headerMessage + message + footerMessage, this);
	}

	@Override
	public void reciveMessage(String message) {
		System.out.println("Bandeja de " + super.getNombre() + ":");
		System.out.println(message);
		System.out.println();
	}

}
