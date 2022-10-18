package n1exercici2;

public class n1exercici2 {

	public static void main(String[] args) {
		Cotxe cotxe1 = new Cotxe("Atributo inicializado en el constructor.");

		cotxe1.accelerar();
		cotxe1.frenar();
		
		Cotxe.frenar();
		
		System.out.println("Solo el atributo no éstatico -potencia- puede ser inicializado en el constructor.\n"
						 + "El método estático -frenar- puede ser accedido tanto desde un objeto como desde la clase.");
	}

}
