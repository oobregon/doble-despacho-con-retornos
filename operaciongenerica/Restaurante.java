package patrones.dobledespacho.operaciongenerica;

import java.util.Random;

import patrones.dobledespacho.operaciongenerica.personas.GeneroA;
import patrones.dobledespacho.operaciongenerica.personas.GeneroN;
import patrones.dobledespacho.operaciongenerica.personas.Hombre;
import patrones.dobledespacho.operaciongenerica.personas.Mujer;
import patrones.dobledespacho.operaciongenerica.personas.Persona;
import patrones.dobledespacho.operaciongenerica.visitor.camarero.CamareroEntero;
import patrones.dobledespacho.operaciongenerica.visitor.camarero.CamareroString;
import patrones.dobledespacho.operaciongenerica.visitor.recepcionista.RecepcionistaEntero;
import patrones.dobledespacho.operaciongenerica.visitor.recepcionista.RecepcionistaObjetoComplejo;
import patrones.dobledespacho.operaciongenerica.visitor.recepcionista.RecepcionistaPinoInteger;
import patrones.dobledespacho.operaciongenerica.visitor.recepcionista.RecepcionistaPinoString;
import patrones.dobledespacho.operaciongenerica.visitor.recepcionista.RecepcionistaString;

public class Restaurante {
	
	private RecepcionistaString recepcionistaString;
	
	private RecepcionistaEntero recepcionistaEntero;
	
	private RecepcionistaObjetoComplejo recepcionistaObjetoComplejo;
	
	private RecepcionistaPinoString recepPinoString;
	
	private RecepcionistaPinoInteger recepPinoInteger;
	
	private CamareroString camareroString;
	
	private CamareroEntero camareroEntero;
	
	private Restaurante() {
		recepcionistaString = new RecepcionistaString();

		recepcionistaEntero = new RecepcionistaEntero();
		
		recepcionistaObjetoComplejo = new RecepcionistaObjetoComplejo();
		
		recepPinoString = new RecepcionistaPinoString();
		
		recepPinoInteger = new RecepcionistaPinoInteger();
		
		camareroString = new CamareroString();
		
		camareroEntero = new CamareroEntero();
	}
	
	public static void main(String[] args) {
		new Restaurante().simularEscenario();
	}

	private void simularEscenario() {
		Random random = new Random(System.currentTimeMillis());
		for (int i = 0; i < 5; i++) {
			Persona persona;
			int numRandom = random.nextInt(5);
			if (numRandom < 2) {
				persona = new GeneroN();
			} else if (numRandom > 1 && numRandom < 3) {
				persona = new Mujer();
			} else if (numRandom > 2 && numRandom < 4) {
				persona = new GeneroA();
			} else {
				persona = new Hombre();
			}
			this.simularEscenario(persona);
		}
	}

	private void simularEscenario(Persona persona) {
		recepcionistaString.recibir(persona);		
		recepcionistaEntero.recibir(persona);
		recepcionistaObjetoComplejo.recibir(persona);		
		recepPinoString.recibir(persona);
		recepPinoInteger.recibir(persona);
		camareroString.servir(persona);
		camareroEntero.servir(persona);

		System.out.println("##############################################################################");
		System.out.println(" ######################## pasa el tiempo #####################################");
		System.out.println("##############################################################################");
	}
}
