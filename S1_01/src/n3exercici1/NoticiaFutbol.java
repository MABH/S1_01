package n3exercici1;

import java.util.Scanner;

public class NoticiaFutbol extends Noticia{
	private String competicio;
	private String club;
	private String jugador;	
	
	public NoticiaFutbol(String titular, String competicio, String club, String jugador) {
		super(titular);
		this.competicio = competicio;
		this.club = club;
		this.jugador = jugador;
		
		super.setTitular(titular);
		super.setPreu(calcularPreuNoticia(competicio, club, jugador));
		super.setPuntacio(calcularPuntuacioNoticia(competicio, club, jugador));
	}
	
	public static int calcularPreuNoticia(String competicio, String equip, String jugador) {
		int auxPreu=300;
		
		if (competicio.equalsIgnoreCase("Chamions League") || competicio.equalsIgnoreCase("Liga de campeones")) auxPreu += 100;
		
		if (equip.equalsIgnoreCase("Barça") || equip.equalsIgnoreCase("Madrid")) auxPreu += 100;
		
		if (jugador.equalsIgnoreCase("Ferran Torres") || jugador.equalsIgnoreCase("Benzema")) auxPreu += 50;
		
		System.out.println("\nPrecio de la noticia: "+auxPreu);
		return auxPreu;
	}
	
	public static int calcularPuntuacioNoticia(String competicio, String equip, String jugador) {
		int auxPuntuacio=5;
		
		if (competicio.equalsIgnoreCase("Chamions League") || competicio.equalsIgnoreCase("Liga de campeones")) auxPuntuacio += 3;
		
		if (competicio.equalsIgnoreCase("La Liga") || competicio.equalsIgnoreCase("La Lliga")) auxPuntuacio += 2;
		
		if (equip.equalsIgnoreCase("Barça") || equip.equalsIgnoreCase("Madrid")) auxPuntuacio += 1;
		
		if (jugador.equalsIgnoreCase("Ferran Torres") || jugador.equalsIgnoreCase("Benzema")) auxPuntuacio += 1;
		
		System.out.println("\nPuntuacio de la noticia: "+auxPuntuacio);
		return auxPuntuacio;
	}
}
