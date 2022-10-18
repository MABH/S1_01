package n3exercici1;

import java.util.Scanner;

public class NoticiaF1 extends Noticia{
	private String escuderia;
	
	public NoticiaF1(String titular, String escuderia) {
		super(titular);
		this.escuderia = escuderia;
		
		super.setTitular(titular);
		super.setPreu(calcularPreuNoticia(escuderia));
		super.setPuntacio(calcularPuntuacioNoticia(escuderia));
	}
	
	public int calcularPreuNoticia(String escuderia) {
		int auxPreu=100;
		
		if (escuderia.equalsIgnoreCase("Ferrari") || escuderia.equalsIgnoreCase("Mercedes")) auxPreu += 50;
		
		System.out.println("\nPrecio de la noticia: "+auxPreu);
		return auxPreu;
	}

	public int calcularPuntuacioNoticia(String escuderia) {
		int auxPuntuacio=4;
		if (escuderia.equalsIgnoreCase("Ferrari") || escuderia.equalsIgnoreCase("Mercedes")) auxPuntuacio += 2;
		
		System.out.println("\nPuntuacion de la noticia: "+auxPuntuacio);
		return auxPuntuacio;
	}
}
