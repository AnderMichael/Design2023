package exercise;

public class Computadora {
	private String monitor;
	private String teclado;
	private String mouse;
	private String memoria;
	private String procesador;
	private String video;

	public String getMonitor() {
		return monitor;
	}

	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}

	public String getTeclado() {
		return teclado;
	}

	public void setTeclado(String teclado) {
		this.teclado = teclado;
	}

	public String getMouse() {
		return mouse;
	}

	public void setMouse(String mouse) {
		this.mouse = mouse;
	}

	public String getMemoria() {
		return memoria;
	}

	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public void showInfo() {
		System.out.println("************************************");
		System.out.println("Monitor: " + monitor);
		System.out.println("Teclado: " + teclado);
		System.out.println("Mouse: " + mouse);
		System.out.println("Memoria: " + memoria);
		System.out.println("Procesador: " + procesador);
		System.out.println("Video: " + video);
		System.out.println("************************************");
		System.out.println();
	}

}
