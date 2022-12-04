package patrones.dobledespacho.operaciongenerica.personas;

import patrones.dobledespacho.operaciongenerica.tipos.VisitorReturnedTypes;
import patrones.dobledespacho.operaciongenerica.visitor.VisitadorPersona;

public class Hombre extends Persona {

	@Override
	public VisitorReturnedTypes accept(VisitadorPersona visitadorPersona) {
		return visitadorPersona.visit(this);
	}
}
