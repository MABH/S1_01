package n1exercici1;

public class n1exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstrumentCorda instrumentC1 = new InstrumentCorda("Guitarra", 100);
		InstrumentVent instrumentV1 = new InstrumentVent("Trompeta", 200);
		InstrumentPercussio instrumentP1 = new InstrumentPercussio("Bombo", 50);
		
		instrumentC1.tocar();
		instrumentV1.tocar();
		instrumentP1.tocar();
		
		InstrumentCorda instrumentC2 = new InstrumentCorda("Guitarra", 100);
		InstrumentVent instrumentV2 = new InstrumentVent("Trompeta", 200);
		InstrumentPercussio instrumentP2 = new InstrumentPercussio("Bombo", 50);
		
		instrumentC2.tocar();
		instrumentV2.tocar();
		instrumentP2.tocar();
		
		System.out.println("\nLos bloques estáticos se han ejecutado solo una vez al cargar las correspondientes clases.\nMientras que los bloques de inicialización se ejecuatan cada vez que se instancian dichas clases.\n");
		
	}

}
