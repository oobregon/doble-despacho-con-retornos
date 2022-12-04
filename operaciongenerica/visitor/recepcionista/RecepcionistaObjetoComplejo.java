package patrones.dobledespacho.operaciongenerica.visitor.recepcionista;

import patrones.dobledespacho.operaciongenerica.personas.GeneroA;
import patrones.dobledespacho.operaciongenerica.personas.GeneroN;
import patrones.dobledespacho.operaciongenerica.personas.Hombre;
import patrones.dobledespacho.operaciongenerica.personas.Mujer;
import patrones.dobledespacho.operaciongenerica.personas.Persona;
import patrones.dobledespacho.operaciongenerica.tipos.ObjetoComplejo;
import patrones.dobledespacho.operaciongenerica.tipos.VisitorReturnedTypes;
import patrones.dobledespacho.operaciongenerica.visitor.VisitadorPersona;

public class RecepcionistaObjetoComplejo implements VisitadorPersona {
	
	public void recibir(Persona persona) {
		System.out.println("!!!!!!!!!! Soy un recepcionista de ObjetoComplejo que se alegra de su visita");
		VisitorReturnedTypes recepComplexReturned = persona.accept(this);
		ObjetoComplejo recepComplexValue = recepComplexReturned.getObjetoComplejoValue();
		System.out.println(recepComplexValue.getDatoString());
		System.out.println(recepComplexValue.getDatoEntero());
	}

	@Override
	public VisitorReturnedTypes visit(Hombre hombre) {
		ObjetoComplejo objetoComplejo = new ObjetoComplejo(1, "Recibiendo a un hombre"); 
		return new VisitorReturnedTypes(objetoComplejo);
	}

	@Override
	public VisitorReturnedTypes visit(Mujer mujer) {
		ObjetoComplejo objetoComplejo = new ObjetoComplejo(2, "Recibiendo a una mujer"); 
		return new VisitorReturnedTypes(objetoComplejo);
	}

	@Override
	public VisitorReturnedTypes visit(GeneroA generoA) {
		ObjetoComplejo objetoComplejo = new ObjetoComplejo(3, "Recibiendo a un Genero A"); 
		return new VisitorReturnedTypes(objetoComplejo);
	}

	@Override
	public VisitorReturnedTypes visit(GeneroN generoN) {
		ObjetoComplejo objetoComplejo = new ObjetoComplejo(4, "Recibiendo a un Genero N"); 
		return new VisitorReturnedTypes(objetoComplejo);
	}
}
