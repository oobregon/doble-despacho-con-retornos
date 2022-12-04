package patrones.dobledespacho.operaciongenerica.tipos;

public class VisitorReturnedTypes {
	
	private Integer integerValue;
	
	private String stringValue;
	
	private Boolean booleanValue;
	
	private ObjetoComplejo objetoComplejo;

	public VisitorReturnedTypes(Integer value) {
		this.integerValue = value;
	}
	
	public VisitorReturnedTypes(String value) {
		this.stringValue = value;
	}
	
	public VisitorReturnedTypes(Boolean value) {
		this.booleanValue = value;
	}
	
	public VisitorReturnedTypes(ObjetoComplejo value) {
		this.objetoComplejo = value;
	}

	public Boolean getBooleanValue() {
		return booleanValue;
	}
	
	public String getStringValue() {
		return stringValue;
	}
	
	public Integer getIntegerValue() {
		return integerValue;
	}
	
	public ObjetoComplejo getObjetoComplejoValue() {
		return objetoComplejo;
	}
}
