package ejemplo;

public class Principal {

	public static void main (String[]args) {
		
		Thread hilo = new Proceso ("Proceso 1");
		Thread hilo2 = new Proceso ("Proceso 2");
		Thread hilo3 = new Proceso ("Proceso 3");
		
		//inicializar
		hilo.start();
		hilo2.start();
		hilo3.start();
	}
}
