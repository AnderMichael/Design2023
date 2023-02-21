
package ejercicio8;

public class CajeroViviendaCreator implements ICreator {

	@Override
	public Cajero generateCajero() {
		CajeroVivienda cajeroVivienda = new CajeroVivienda();
		cajeroVivienda.setNombre("Banco - Lulu - Vivienda");
		cajeroVivienda.setTipoPrestamos("vivienda");
		cajeroVivienda.setMontoPrestamos(300);
		cajeroVivienda.setCuentaFondosBanco(CuentaFondosBanco.getInstance());
		cajeroVivienda.showInfo();
		return cajeroVivienda;
	}

}
