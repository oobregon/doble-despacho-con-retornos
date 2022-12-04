package patrones.dobledespacho.operaciongenerica.visitor.camarero;

import patrones.dobledespacho.operaciongenerica.personas.GeneroA;
import patrones.dobledespacho.operaciongenerica.personas.GeneroN;
import patrones.dobledespacho.operaciongenerica.personas.Hombre;
import patrones.dobledespacho.operaciongenerica.personas.Mujer;
import patrones.dobledespacho.operaciongenerica.personas.Persona;
import patrones.dobledespacho.operaciongenerica.tipos.VisitorReturnedTypes;
import patrones.dobledespacho.operaciongenerica.visitor.VisitadorPersona;

public class CamareroString implements VisitadorPersona {
	
	public void servir(Persona persona) {
		System.out.println("!!!!!!!!!! Soy un Camarero que retorna Strings !!!!");
		System.out.println(persona.accept(this).getStringValue());
	}

	@Override
	public VisitorReturnedTypes visit(Hombre hombre) {
		return new VisitorReturnedTypes("Soy un camarero que le invita a coñac");
	}

	@Override
	public VisitorReturnedTypes visit(Mujer mujer) {
		return new VisitorReturnedTypes("Soy una camarero que le invita a un coktail");
	}

	@Override
	public VisitorReturnedTypes visit(GeneroA generoA) {
		return new VisitorReturnedTypes("Soy un camamero que no sabe cómo comportarse con A");
	}

	@Override
	public VisitorReturnedTypes visit(GeneroN generoN) {
		return new VisitorReturnedTypes("Soy un camamero que no sabe cómo comportarse con N");
	}

}
