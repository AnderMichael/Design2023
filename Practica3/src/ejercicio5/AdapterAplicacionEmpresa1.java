package ejercicio5;

public class AdapterAplicacionEmpresa1 implements AplicacionWeb {

	private AplicacionEmpresa1 aplicacionEmpresa1;

	public AdapterAplicacionEmpresa1(AplicacionEmpresa1 aplicacionEmpresa1) {
		this.aplicacionEmpresa1 = aplicacionEmpresa1;
	}

	@Override
	public void iniciarSesion() {
		aplicacionEmpresa1.login();
	}

	@Override
	public void cerrarSesion() {
		aplicacionEmpresa1.logout();
	}

	@Override
	public void generacionDatos(String contenidoReporte) {
		aplicacionEmpresa1.report(contenidoReporte);
	}

}
