package n1exercici1;

public class InstrumentPercussio extends Instrument {	

	public InstrumentPercussio(String nom, int preu) {
		super(nom, preu);
		// TODO Auto-generated constructor stub
	}

	static{
		System.out.println("Carga de la clase -InstrumentPercussio-. Bloque estático.\n"+
						   "Se ejecuta cuando se carga la clase. Solo una vez.");
	}
	
	{
        System.out.println("Bloque de inicialización de la clase -InstrumentPercussio-. Se carga tras la llamada a -Super- del constructor.");
	}
	

	@Override
	public void tocar() {
		System.out.println("Està sonant un instrument de percussió.");		
	}

}
