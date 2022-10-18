package n1exercici1;

public abstract class Instrument {
	public Instrument(String nom, int preu) {
		this.nom = nom;
		this.preu = preu;
	}

	private String nom;
	private int preu;
	
	public abstract void tocar();


}
