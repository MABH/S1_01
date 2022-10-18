package n3exercici1;

public abstract class Noticia {	
	private String titular;
	private String text;
	private int puntacio;
	private int preu;
	
	public Noticia(String titular) {
		this.titular = titular;
		this.text = "";
		this.puntacio = 0;
		this.preu = 0;
	}	
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getPuntacio() {
		return puntacio;
	}

	public void setPuntacio(int puntacio) {
		this.puntacio = puntacio;
	}

	public int getPreu() {
		return preu;
	}

	public void setPreu(int preu) {
		this.preu = preu;
	}

	@Override
	public String toString() {
		return "Noticia [titular=" + titular + ", text=" + text + ", puntacio=" + puntacio + ", preu=" + preu + "]";
	}
}
