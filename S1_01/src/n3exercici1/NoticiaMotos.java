package n3exercici1;

import java.util.Scanner;

public class NoticiaMotos extends Noticia{	
	private String equip;

	public NoticiaMotos(String titular, String equip) {
		super(titular);
		this.equip = equip;
		
		super.setTitular(titular);
		super.setPreu(calcularPreuNoticia(equip));
		super.setPuntacio(calcularPuntuacioNoticia(equip));
	}

	public int calcularPreuNoticia(String equip) {
		int auxPreu=100;
		
		if (equip.equalsIgnoreCase("Honda") || equip.equalsIgnoreCase("Yamaha")) auxPreu += 50;
		
		System.out.println("\nPrecio de la noticia: "+auxPreu);
		return auxPreu;
	}

	public int calcularPuntuacioNoticia(String equip) {
		int auxPuntuacio=3;		
		
		if (equip.equalsIgnoreCase("Honda") || equip.equalsIgnoreCase("Yamaha")) 
		auxPuntuacio += 3;
		
		System.out.println("\nPuntuacion de la noticia: "+auxPuntuacio);
		return auxPuntuacio;
	}
}
