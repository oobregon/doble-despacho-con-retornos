package patrones.dobledespacho.operaciongenerica.personas;

import patrones.dobledespacho.operaciongenerica.tipos.VisitorReturnedTypes;
import patrones.dobledespacho.operaciongenerica.visitor.VisitadorPersona;

public abstract class Persona {

	public abstract VisitorReturnedTypes accept (VisitadorPersona visitadorPersona);
}
