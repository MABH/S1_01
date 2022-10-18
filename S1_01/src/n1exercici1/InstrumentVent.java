package n1exercici1;

public class InstrumentVent extends Instrument {

	public InstrumentVent(String nom, int preu) {
		super(nom, preu);
	}

	static{
		System.out.println("Carga de la clase -InstrumentVent-. Bloque estático.\n"+
						   "Se ejecuta cuando se carga la clase. Solo una vez.");
	}
	
	{
        System.out.println("Bloque de inicialización de la clase -InstrumentVent-. Se carga tras la llamada a -Super- del constructor.");
	}
	

	@Override
	public void tocar() {
		System.out.println("Està sonant un instrument de vent");		
	}
}
