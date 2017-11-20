
public class LanzarHilo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Hilo2 hilo = null;
		for(int i = 0; i<5;i++){
			hilo = new Hilo2();
			System.out.println("Lanzador: "+hilo.getName()+": "+hilo.getId());
			hilo.start();
			try {
				hilo.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
	}

}
