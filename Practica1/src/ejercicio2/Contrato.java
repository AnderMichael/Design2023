package ejercicio2;

public class Contrato implements IPrototype {

	private int sueldo;
	private int cargaHoraria;
	private boolean cursoEducacionSuperior;
	private boolean accesoPlataforma;
	private boolean marcadoBiometrico;
	private String marcadoHoraEntrada;
	private String marcadoHoraSalida;

	private String nombre;
	private String apellido;

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public boolean isCursoEducacionSuperior() {
		return cursoEducacionSuperior;
	}

	public void setCursoEducacionSuperior(boolean cursoEducacionSuperior) {
		this.cursoEducacionSuperior = cursoEducacionSuperior;
	}

	public boolean isAccesoPlataforma() {
		return accesoPlataforma;
	}

	public void setAccesoPlataforma(boolean accesoPlataforma) {
		this.accesoPlataforma = accesoPlataforma;
	}

	public boolean isMarcadoBiometrico() {
		return marcadoBiometrico;
	}

	public void setMarcadoBiometrico(boolean marcadoBiometrico) {
		this.marcadoBiometrico = marcadoBiometrico;
	}

	public String getMarcadoHoraEntrada() {
		return marcadoHoraEntrada;
	}

	public void setMarcadoHoraEntrada(String marcadoHoraEntrada) {
		this.marcadoHoraEntrada = marcadoHoraEntrada;
	}

	public String getMarcadoHoraSalida() {
		return marcadoHoraSalida;
	}

	public void setMarcadoHoraSalida(String marcadoHoraSalida) {
		this.marcadoHoraSalida = marcadoHoraSalida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Contrato(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	@Override
	public Contrato clone() {
		Contrato contrato = new Contrato(nombre, apellido);
		contrato.setAccesoPlataforma(accesoPlataforma);
		contrato.setCargaHoraria(cargaHoraria);
		contrato.setCursoEducacionSuperior(cursoEducacionSuperior);
		contrato.setMarcadoBiometrico(marcadoBiometrico);
		contrato.setMarcadoHoraEntrada(marcadoHoraEntrada);
		contrato.setMarcadoHoraSalida(marcadoHoraSalida);
		contrato.setSueldo(sueldo);

		return contrato;
	}

	public void showInfo() {
		System.out.println("******************************************************");
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Acceso a la plataforma: " + accesoPlataforma);
		System.out.println("Carga Horaria: " + cargaHoraria);
		System.out.println("Curso Educacion Superior: " + cursoEducacionSuperior);
		System.out.println("Marcado Biometrico: " + marcadoBiometrico);
		System.out.println("Marcado Hora Entrada: " + marcadoHoraEntrada);
		System.out.println("Marcado Hora Salida: " + marcadoHoraSalida);
		System.out.println("Sueldo: " + sueldo);
		System.out.println("******************************************************");
	}

}
