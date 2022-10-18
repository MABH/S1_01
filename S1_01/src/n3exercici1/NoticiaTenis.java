package n3exercici1;

import java.util.Scanner;

public class NoticiaTenis extends Noticia{	
	private String tenista;

	public NoticiaTenis(String titular, String tenista) {
		super(titular);
		this.tenista = tenista;
		
		super.setTitular(titular);
		super.setPreu(calcularPreuNoticia(tenista));
		super.setPuntacio(calcularPuntuacioNoticia(tenista));
	}	
	
	public static int calcularPreuNoticia(String tenista) {
		int auxPreu=150;
		if (tenista.equalsIgnoreCase("Nadal") || tenista.equalsIgnoreCase("Djokovic")|| tenista.equalsIgnoreCase("Federer")) auxPreu += 100;
		
		System.out.println("\nPrecio de la noticia: "+auxPreu);
		return auxPreu;
	};
	
	public static int calcularPuntuacioNoticia(String tenista) {
		int auxPuntuacio=4;
		
		if (tenista.equalsIgnoreCase("Nadal") || tenista.equalsIgnoreCase("Djokovic") || tenista.equalsIgnoreCase("Federer")) auxPuntuacio += 3;
										
		System.out.println("\nPuntuacion de la noticia: "+auxPuntuacio);
		return auxPuntuacio;
	};
}
