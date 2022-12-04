package patrones.dobledespacho.operaciongenerica.visitor.recepcionista;

import patrones.dobledespacho.operaciongenerica.personas.GeneroA;
import patrones.dobledespacho.operaciongenerica.personas.GeneroN;
import patrones.dobledespacho.operaciongenerica.personas.Hombre;
import patrones.dobledespacho.operaciongenerica.personas.Mujer;
import patrones.dobledespacho.operaciongenerica.personas.Persona;
import patrones.dobledespacho.operaciongenerica.tipos.VisitorReturnedTypes;
import patrones.dobledespacho.operaciongenerica.visitor.VisitadorPersona;

public class RecepcionistaEntero implements VisitadorPersona {
	
	public void recibir(Persona persona) {
		System.out.println("!!!!!!!!!! Soy un recepcionista Entero que se alegra de su visita");
		System.out.println(persona.accept(this).getIntegerValue());		
	}

	@Override
	public VisitorReturnedTypes visit(Hombre hombre) {
		return new VisitorReturnedTypes(1);
	}

	@Override
	public VisitorReturnedTypes visit(Mujer mujer) {
		return new VisitorReturnedTypes(2);
	}

	@Override
	public VisitorReturnedTypes visit(GeneroA generoA) {
		return new VisitorReturnedTypes(3);
	}

	@Override
	public VisitorReturnedTypes visit(GeneroN generoN) {
		return new VisitorReturnedTypes(4);
	}
}
