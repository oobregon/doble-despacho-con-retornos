package patrones.dobledespacho.operaciongenerica.visitor;

import patrones.dobledespacho.operaciongenerica.personas.GeneroA;
import patrones.dobledespacho.operaciongenerica.personas.GeneroN;
import patrones.dobledespacho.operaciongenerica.personas.Hombre;
import patrones.dobledespacho.operaciongenerica.personas.Mujer;
import patrones.dobledespacho.operaciongenerica.tipos.VisitorReturnedTypes;

public interface VisitadorPersona {

	public VisitorReturnedTypes visit(Hombre hombre);
	
	public VisitorReturnedTypes visit(Mujer mujer);
	
	public VisitorReturnedTypes visit(GeneroA generoA);
	
	public VisitorReturnedTypes visit(GeneroN generoN);
}
