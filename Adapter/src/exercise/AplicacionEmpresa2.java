package exercise;

public class AplicacionEmpresa2 implements AplicacionWeb {
	private String nombre;
	private String dominio;

	public AplicacionEmpresa2(String nombre, String dominio) {
		this.nombre = nombre;
		this.dominio = dominio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) {
		this.dominio = dominio;
	}

	@Override
	public void iniciarSesion() {
		System.out.println(String.format("=====%s=====", nombre));
		System.out.println(String.format("Un usuario se ha logeado en la aplicacion %s!\nDireccion: www.%s.%s ", nombre,
				nombre, dominio));

	}

	@Override
	public void cerrarSesion() {
		System.out.println(String.format("=====%s=====", nombre));
		System.out.println(String.format("Un usuario ha cerrado su sesión en la aplicacion %s!", nombre));
	}

	@Override
	public void generacionDatos(String contenidoReporte) {
		System.out.println(String.format("=====%s=====", nombre));
		System.out.println(String.format("Un usuario aniadio la siguiente informacion:\n%s", contenidoReporte));
		if (contenidoReporte.length() > 50) {
			System.out.println("El reporte es muy largo y debe simplificarse para ser analizado");
		} else {
			System.out.println("El reporte sera analizado! Gracias por su aporte!");
		}
	}

}
