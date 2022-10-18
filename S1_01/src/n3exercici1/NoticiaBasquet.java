package n3exercici1;

import java.util.Scanner;

public class NoticiaBasquet extends Noticia{	

	private String competicio;
	private String club;
	
	public NoticiaBasquet(String titular, String competicio, String club) {
		super(titular);
		this.competicio = competicio;
		this.club = club;
		
		super.setTitular(titular);
		super.setPreu(calcularPreuNoticia(competicio, club));
		super.setPuntacio(calcularPuntuacioNoticia(competicio, club));
	}
	 
	public static int calcularPreuNoticia(String competicio, String club) {
		int auxPreu=250;
		
		if (competicio.equalsIgnoreCase("Euroliga") || competicio.equalsIgnoreCase("Eurolliga")) auxPreu += 75;
		
		if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) auxPreu += 75;
		
		System.out.println("\nPrecio de la noticia: "+auxPreu);
		return auxPreu;
	}
 
	public static int calcularPuntuacioNoticia(String competicio, String club) {
		int auxPuntuacio=5;
		
		if (competicio.equalsIgnoreCase("Euroliga") || competicio.equalsIgnoreCase("Eurolliga")) auxPuntuacio += 3;
		
		if (competicio.equalsIgnoreCase("ACB")) auxPuntuacio += 2;
		
		if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) auxPuntuacio += 1;
						
		System.out.println("\nPuntuacion de la noticia: "+auxPuntuacio);
		return auxPuntuacio;
	}

}
