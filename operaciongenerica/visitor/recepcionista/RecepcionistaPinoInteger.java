package patrones.dobledespacho.operaciongenerica.visitor.recepcionista;

import patrones.dobledespacho.operaciongenerica.personas.GeneroA;
import patrones.dobledespacho.operaciongenerica.personas.GeneroN;
import patrones.dobledespacho.operaciongenerica.personas.Hombre;
import patrones.dobledespacho.operaciongenerica.personas.Mujer;
import patrones.dobledespacho.operaciongenerica.personas.Persona;
import patrones.dobledespacho.operaciongenerica.tipos.VisitorReturnedTypes;
import patrones.dobledespacho.operaciongenerica.visitor.VisitadorPersona;

public class RecepcionistaPinoInteger implements VisitadorPersona {

	public void recibir(Persona persona) {
		System.out.println("!!!!!!!!!! Soy un recepcionista que retorna Enteros y que hace el pino");
		System.out.println(persona.accept(this).getIntegerValue());		
	}

	@Override
	public VisitorReturnedTypes visit(Hombre hombre) {
		System.out.println("Recepcionista retornando el entero 1 y haciendo el pino con un hombre");
		return new VisitorReturnedTypes(1);
	}

	@Override
	public VisitorReturnedTypes visit(Mujer mujer) {
		System.out.println("Recepcionista retornando el entero 2 y haciendo el pino con una mujer");
		return new VisitorReturnedTypes(2);
	}

	@Override
	public VisitorReturnedTypes visit(GeneroA generoA) {
		System.out.println("Recepcionista retornando el entero 3 y haciendo el pino con un genero A");
		return new VisitorReturnedTypes(3);
	}

	@Override
	public VisitorReturnedTypes visit(GeneroN generoN) {
		System.out.println("Recepcionista retornando el entero 4 y haciendo el pino con un genero N");
		return new VisitorReturnedTypes(4);
	}
}
