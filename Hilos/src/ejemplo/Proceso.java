package ejemplo;

public class Proceso extends Thread{

	public Proceso (String msg) {
		super (msg);
	}
	
	//crear metodo run
	public void run() {
		for (int i=0; i<=5; i++) {
			System.out.println(this.getName());
		}
	}
}
