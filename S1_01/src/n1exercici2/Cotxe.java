package n1exercici2;

public class Cotxe {	
	private static final String marca="Inicializado en la declaración";
	private static String model;
	private final String potència;
	
	public Cotxe(String potència) {
		super();
		this.potència = potència;
	}

	public static void frenar() {
		System.out.println("El vehicle està frenant");
	}
	
	public void accelerar() {
		System.out.println("El vehicle està accelerant");
	}
}
