package n3exercici1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class n3exercici1 {
	static ArrayList<Redactor> redactores = new ArrayList<Redactor>();
	
	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		char opcio=' ';		
		
		do {
			System.out.println("1.- Introduir redactor.");
			System.out.println("2.- Eliminar redactor.");
			System.out.println("3.- Introduir notícia a un redactor.");
			System.out.println("4.- Eliminar notícia (ha de demanar redactor i titular de la notícia).");
			System.out.println("5.- Mostrar totes les notícies per redactor.");
			System.out.println("6.- Calcular puntuació de la notícia.");
			System.out.println("7.- Calcular preu notícia.");
			System.out.println("0.- Sortir.");
			opcio=sc.nextLine().charAt(0);
			
			switch(opcio) {
			case '1':
				crearRedactor();		
				break;
			case '2':	
				eliminarRedactor();
				break;
			case '3':
				introduirNoticia();
				break;		
			case '4':
				eliminarNoticia();
				break;
			case '5':
				mostrarNoticias();
				break;	
			case '6':
				calcularPuntuacion();
				break;
			case '7':
				calcularPrecio();
				break;
			case '0':				
				System.out.println("\nHas sortit de l'aplicació\n");
				break;
			default:
				System.out.println("\nOpció incorrecta\n");
				break;
			}	
		}while (opcio!='0');
	}
	
	public static void crearRedactor()
	{
		Redactor redactor;
		Scanner sc=new Scanner(System.in);
		String nombre, dni;		
		
		System.out.println("\nIntroduzca el nombre del nuevo redactor: ");
		nombre=sc.nextLine();
		System.out.println("Introduzca el DNI del redactor: ");
		dni=sc.nextLine();
		ArrayList<Noticia> noticias= new ArrayList<Noticia>();
		redactor = new Redactor(nombre, dni, noticias);
		redactores.add(redactor);
	};
	
	public static void eliminarRedactor() {
		Scanner sc=new Scanner(System.in);
		String nombre;		
		Iterator<Redactor> it = redactores.iterator();
		Redactor auxiliar;
		
		System.out.println("\nIntroduzca el nombre del redactor a eliminar: ");
		nombre=sc.nextLine();
		
		while(it.hasNext()) {
			if(it.next().getNom().equalsIgnoreCase(nombre)) it.remove();
		}
	};
	
	public static void introduirNoticia() {
		Redactor redactor;
		Noticia noticia;
		
		Scanner sc=new Scanner(System.in);
		String nombre;		
		
		System.out.println("\nIntroduzca el nombre del redactor: ");
		nombre=sc.nextLine();
		redactor=buscarRedactor(nombre);
		noticia=crearNoticia();
		redactor.getNoticias().add(noticia);
	};
	
	public static void eliminarNoticia() {
		Redactor redactor;
		Noticia noticia;
		Scanner sc=new Scanner(System.in);
		String nombre, titular;		
		
		System.out.println("\nIntroduzca el nombre del redactor: ");
		nombre=sc.nextLine();
		System.out.println("Introduzca el titular de la noticia: ");
		titular=sc.nextLine();
		
		redactor=buscarRedactor(nombre);
		noticia=buscarNoticia(titular,redactor.getNoticias());
		redactor.getNoticias().remove(noticia);
	}
	
	public static void mostrarNoticias() {
		Redactor redactor;
		ArrayList<Noticia> noticies;
		Scanner sc=new Scanner(System.in);
		String nombre, titular;		
		
		System.out.println("\nIntroduzca el nombre del redactor: ");
		nombre=sc.nextLine();
		redactor=buscarRedactor(nombre);
		noticies=redactor.getNoticias();
		
		for(Noticia noticia : noticies) {
			System.out.println(noticia.toString());
		}
	};
	
	public static void calcularPuntuacion() {
		Noticia noticia=null;
		char opcio=' ';		
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("\nTipus de notícia");
			System.out.println("1.- Notícia de futbol.");
			System.out.println("2.- Notícia de basket.");
			System.out.println("3.- Notícia de tenis.");
			System.out.println("4.- Notícia de F1.");
			System.out.println("5.- Notícia de motos.");
			opcio=sc.nextLine().charAt(0);
			
			switch(opcio) {
			case '1':
				calcularPuntuacionFutbol();		
				break;
			case '2':	
				calcularPuntuacionBasquet();	
				break;
			case '3':
				calcularPuntuacionTenis();	
				break;		
			case '4':
				calcularPuntuacionF1();	
				break;
			case '5':
				calcularPuntuacionMotos();	
				break;
			default:
				System.out.println("\nOpció incorrecta\n");
				break;
			}	
		}while (opcio!='1' && opcio!='2' && opcio!='3' && opcio!='4' && opcio!='5');
	};
	
	public static void calcularPrecio() {
		Noticia noticia=null;
		char opcio=' ';		
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("\nTipus de notícia");
			System.out.println("1.- Notícia de futbol.");
			System.out.println("2.- Notícia de basket.");
			System.out.println("3.- Notícia de tenis.");
			System.out.println("4.- Notícia de F1.");
			System.out.println("5.- Notícia de motos.");
			opcio=sc.nextLine().charAt(0);
			
			switch(opcio) {
			case '1':
				calcularPrecioFutbol();		
				break;
			case '2':	
				calcularPrecioBasket();	
				break;
			case '3':
				calcularPrecioTenis();	
				break;		
			case '4':
				calcularPrecioF1();	
				break;
			case '5':
				calcularPrecioMotos();	
				break;
			default:
				System.out.println("\nOpció incorrecta\n");
				break;
			}	
		}while (opcio!='1' && opcio!='2' && opcio!='3' && opcio!='4' && opcio!='5');
	};	
	
	public static Noticia crearNoticia() {
		Noticia noticia=null;
		char opcio=' ';		
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("\nTipus de notícia");
			System.out.println("1.- Notícia de futbol.");
			System.out.println("2.- Notícia de basket.");
			System.out.println("3.- Notícia de tenis.");
			System.out.println("4.- Notícia de F1.");
			System.out.println("5.- Notícia de motos.");
			opcio=sc.nextLine().charAt(0);
			
			switch(opcio) {
			case '1':
				noticia=crearNoticiaFutbol();		
				break;
			case '2':	
				noticia=crearNoticiaBasket();
				break;
			case '3':
				noticia=crearNoticiaTenis();
				break;		
			case '4':
				noticia=crearNoticiaF1();
				break;
			case '5':
				noticia=crearNoticiaMotos();
				break;
			default:
				System.out.println("\nOpció incorrecta\n");
				break;
			}	
		}while (opcio!='1' && opcio!='2' && opcio!='3' && opcio!='4' && opcio!='5');
		
		return noticia;		
	}
	
	public static Redactor buscarRedactor(String nombre) {
		Redactor redactor=null;
		int i=0;
		
		while (redactor==null && i<redactores.size()) {
			if (redactores.get(i).getNom().equalsIgnoreCase(nombre)) redactor=redactores.get(i);
			i++;
		}
		
		return redactor;
	};
	
	public static Noticia crearNoticiaFutbol() {
		NoticiaFutbol noticia;
		Scanner sc=new Scanner(System.in);
		String titular, club, competicion, jugador;		
		
		System.out.println("\nIntroduzca el titular: ");
		titular=sc.nextLine();
		System.out.println("Introduzca el club: ");
		club=sc.nextLine();
		System.out.println("Introduzca la competición: ");
		competicion=sc.nextLine();
		System.out.println("Introduzca el jugador: ");
		jugador=sc.nextLine();
				
		noticia=new NoticiaFutbol(titular, competicion, club, jugador);
		return noticia;
	};
	
	public static Noticia crearNoticiaBasket() {
		NoticiaBasquet noticia;
		Scanner sc=new Scanner(System.in);
		String titular, club, competicion;		
		
		System.out.println("\nIntroduzca el titular: ");
		titular=sc.nextLine();
		System.out.println("Introduzca el club: ");
		club=sc.nextLine();
		System.out.println("Introduzca la competición: ");
		competicion=sc.nextLine();
			
		noticia=new NoticiaBasquet(titular, competicion, club);
		return noticia;
	};
	
	public static Noticia crearNoticiaTenis() {
		NoticiaTenis noticia;
		Scanner sc=new Scanner(System.in);
		String titular, tenista;	
		
		System.out.println("\nIntroduzca el titular: ");
		titular=sc.nextLine();
		System.out.println("Introduzca el tenista: ");
		tenista=sc.nextLine();

		noticia=new NoticiaTenis(titular, tenista);
		return noticia;
	};
	
	public static Noticia crearNoticiaF1() {
		NoticiaF1 noticia;
		Scanner sc=new Scanner(System.in);
		String titular, escuderia;	
		
		System.out.println("\nIntroduzca el titular: ");
		titular=sc.nextLine();
		System.out.println("Introduzca la escuderia: ");
		escuderia=sc.nextLine();

		noticia=new NoticiaF1(titular, escuderia);
		return noticia;
	};
	
	public static Noticia crearNoticiaMotos() {
		NoticiaMotos noticia;
		Scanner sc=new Scanner(System.in);
		String titular, equipo;	
		
		System.out.println("\nIntroduzca el titular: ");
		titular=sc.nextLine();
		System.out.println("Introduzca el equipo: ");
		equipo=sc.nextLine();

		noticia=new NoticiaMotos(titular, equipo);
		return noticia;
	};
	
	public static Noticia buscarNoticia(String titular, ArrayList<Noticia> noticias) {
		Noticia noticia=null;
		int i=0;
		
		while (noticia==null && i<noticias.size()) {
			if (redactores.get(i).getNom().equalsIgnoreCase(titular)) noticia=noticias.get(i);
			i++;
		}
		
		return noticia;
	};
	
	public static void calcularPuntuacionFutbol(){
		Scanner sc=new Scanner(System.in);
		String club, competicion, jugador;	
		int puntuacion;
		
		System.out.println("\nIntroduzca el club: ");
		club=sc.nextLine();
		System.out.println("Introduzca la competición: ");
		competicion=sc.nextLine();		
		System.out.println("Introduzca el jugador: ");
		jugador=sc.nextLine();
		
		puntuacion=NoticiaFutbol.calcularPuntuacioNoticia(competicion, club, jugador);
	}
	
	public static void calcularPuntuacionBasquet(){
		Scanner sc=new Scanner(System.in);
		String club, competicion;	
		int puntuacion;
		
		System.out.println("\nIntroduzca el club: ");
		club=sc.nextLine();
		System.out.println("Introduzca la competición: ");
		competicion=sc.nextLine();
		System.out.println("Introduzca el club: ");
		club=sc.nextLine();
		
		puntuacion=NoticiaBasquet.calcularPuntuacioNoticia(competicion, club);
	}
	
	public static void calcularPuntuacionTenis(){
		Scanner sc=new Scanner(System.in);
		String tenista;	
		int puntuacion;
		
		System.out.println("\nIntroduzca el tenista: ");
		tenista=sc.nextLine();
				
		puntuacion=NoticiaTenis.calcularPuntuacioNoticia(tenista);
	}
	
	public static void calcularPuntuacionF1(){
		Scanner sc=new Scanner(System.in);
		String escuderia;	
		int puntuacion;
		
		System.out.println("\nIntroduzca la escuderia: ");
		escuderia=sc.nextLine();
				
		puntuacion=NoticiaTenis.calcularPuntuacioNoticia(escuderia);
	}
	
	public static void calcularPuntuacionMotos(){
		Scanner sc=new Scanner(System.in);
		String equipo;	
		int puntuacion;
		
		System.out.println("\nIntroduzca el equipo: ");
		equipo=sc.nextLine();
				
		puntuacion=NoticiaTenis.calcularPuntuacioNoticia(equipo);
	}
	
	public static void calcularPrecioFutbol(){
		Scanner sc=new Scanner(System.in);
		String club, competicion, jugador;	
		int puntuacion;
		
		System.out.println("\nIntroduzca el club: ");
		club=sc.nextLine();
		System.out.println("Introduzca la competición: ");
		competicion=sc.nextLine();		
		System.out.println("Introduzca el jugador: ");
		jugador=sc.nextLine();
		
		puntuacion=NoticiaFutbol.calcularPreuNoticia(competicion, club, jugador);
	}
	
	public static void calcularPrecioBasket(){
		Scanner sc=new Scanner(System.in);
		String club, competicion;	
		int puntuacion;
		
		System.out.println("\nIntroduzca el club: ");
		club=sc.nextLine();
		System.out.println("Introduzca la competición: ");
		competicion=sc.nextLine();
		System.out.println("Introduzca el club: ");
		club=sc.nextLine();
		
		puntuacion=NoticiaBasquet.calcularPreuNoticia(competicion, club);
	}
	
	public static void calcularPrecioTenis(){
		Scanner sc=new Scanner(System.in);
		String tenista;	
		int puntuacion;
		
		System.out.println("\nIntroduzca el tenista: ");
		tenista=sc.nextLine();
				
		puntuacion=NoticiaTenis.calcularPreuNoticia(tenista);
	}
	
	public static void calcularPrecioF1(){
		Scanner sc=new Scanner(System.in);
		String escuderia;	
		int puntuacion;
		
		System.out.println("\nIntroduzca la escuderia: ");
		escuderia=sc.nextLine();
				
		puntuacion=NoticiaTenis.calcularPreuNoticia(escuderia);
	}
	
	public static void calcularPrecioMotos(){
		Scanner sc=new Scanner(System.in);
		String equipo;	
		int puntuacion;
		
		System.out.println("\nIntroduzca el equipo: ");
		equipo=sc.nextLine();
				
		puntuacion=NoticiaTenis.calcularPreuNoticia(equipo);
	}
}
