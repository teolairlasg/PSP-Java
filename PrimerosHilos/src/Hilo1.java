
public class Hilo1 extends Thread {

	private String nombre;
	
	public Hilo1(String nombre){
		this.nombre = nombre;
	}
	
	public void run(){
		System.out.println("Hola mundo, hola "+nombre);
	}
}
