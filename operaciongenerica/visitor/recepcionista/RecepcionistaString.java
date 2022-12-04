package patrones.dobledespacho.operaciongenerica.visitor.recepcionista;

import patrones.dobledespacho.operaciongenerica.personas.GeneroA;
import patrones.dobledespacho.operaciongenerica.personas.GeneroN;
import patrones.dobledespacho.operaciongenerica.personas.Hombre;
import patrones.dobledespacho.operaciongenerica.personas.Mujer;
import patrones.dobledespacho.operaciongenerica.personas.Persona;
import patrones.dobledespacho.operaciongenerica.tipos.VisitorReturnedTypes;
import patrones.dobledespacho.operaciongenerica.visitor.VisitadorPersona;

public class RecepcionistaString implements VisitadorPersona {
	
	public void recibir(Persona persona) {
		System.out.println("!!!!!!!!!! Soy un recepcionista String que se alegra de su visita");
		System.out.println(persona.accept(this).getStringValue());		
	}

	@Override
	public VisitorReturnedTypes visit(Hombre hombre) {
		return new VisitorReturnedTypes("Soy un recepcionista que recibe propina");
	}

	@Override
	public VisitorReturnedTypes visit(Mujer mujer) {
		return new VisitorReturnedTypes("Soy un recepcionista que se admira de su belleza");
	}

	@Override
	public VisitorReturnedTypes visit(GeneroA generoA) {
		return new VisitorReturnedTypes("Soy un camamero que no sabe cómo recibir a A");
	}

	@Override
	public VisitorReturnedTypes visit(GeneroN generoN) {
		return new VisitorReturnedTypes("Soy un camamero que no sabe cómo recibir a N");
	}

}
