package n3exercici1;

import java.util.ArrayList;

public class Redactor {
	
	private String nom;
	private final String dni;
	private static int sou;
	private ArrayList<Noticia> noticias;
	
	public Redactor(String nom, String dni, ArrayList<Noticia> noticias) {
		super();
		this.nom = nom;
		this.dni = dni;
		this.noticias = noticias;
		this.sou = 1500;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public static int getSou() {
		return sou;
	}
	public static void setSou(int sou) {
		Redactor.sou = sou;
	}
	public ArrayList<Noticia> getNoticias() {
		return noticias;
	}
	public void setNoticias(ArrayList<Noticia> noticias) {
		this.noticias = noticias;
	}
	public String getDni() {
		return dni;
	}
}
