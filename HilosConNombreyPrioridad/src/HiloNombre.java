
public class HiloNombre extends Thread {

	/**
	 * @param args
	 */
	public HiloNombre(int numHilo) {
		
		setName("Hilo "+numHilo);
	}

	@Override
	public void run() {
		System.out.println("Soy el hilo: "+getName());
	}	
}
