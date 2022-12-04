package patrones.dobledespacho.operaciongenerica.tipos;

public class ObjetoComplejo {
	
	private Integer datoEntero;
	
	private String datoString;
	
	public ObjetoComplejo(Integer datoEntero, String datoString) {
		this.datoEntero = datoEntero;
		this.datoString = datoString;
	}

	public Integer getDatoEntero() {
		return datoEntero;
	}

	public String getDatoString() {
		return datoString;
	}
}
