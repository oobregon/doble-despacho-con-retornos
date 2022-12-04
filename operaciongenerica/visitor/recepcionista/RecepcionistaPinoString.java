package patrones.dobledespacho.operaciongenerica.visitor.recepcionista;

import patrones.dobledespacho.operaciongenerica.personas.GeneroA;
import patrones.dobledespacho.operaciongenerica.personas.GeneroN;
import patrones.dobledespacho.operaciongenerica.personas.Hombre;
import patrones.dobledespacho.operaciongenerica.personas.Mujer;
import patrones.dobledespacho.operaciongenerica.personas.Persona;
import patrones.dobledespacho.operaciongenerica.tipos.VisitorReturnedTypes;
import patrones.dobledespacho.operaciongenerica.visitor.VisitadorPersona;

public class RecepcionistaPinoString implements VisitadorPersona {

	public void recibir(Persona persona) {
		System.out.println("!!!!!!!!!! Soy un recepcionista que retorna Strings y que hace el pino");
		System.out.println(persona.accept(this).getStringValue());		
	}

	@Override
	public VisitorReturnedTypes visit(Hombre hombre) {
		return new VisitorReturnedTypes("Recepcionista retornando un String haciendo el pino con un hombre");
	}

	@Override
	public VisitorReturnedTypes visit(Mujer mujer) {
		return new VisitorReturnedTypes("Recepcionista retornando un String haciendo el pino con una mujer");
	}

	@Override
	public VisitorReturnedTypes visit(GeneroA generoA) {
		return new VisitorReturnedTypes("Recepcionista retornando un String de haciendo el pino con un Genero A");
	}

	@Override
	public VisitorReturnedTypes visit(GeneroN generoN) {
		return new VisitorReturnedTypes("Recepcionista retornando un String de haciendo el pino con un Genero N");
	}
}
