
public class HiloPrioridad extends Thread {

	public HiloPrioridad(int prioridad){
		this.setPriority(prioridad);
	}

	@Override
	public void run() {
		
		long tiempoInicial = System.nanoTime();

		System.out.println("Hola soy el hilo: "+getName()
				  +". Mi prioridad: "+getPriority());
		for(long i=0;i<12345678901L;i++);
		System.out.println(getName()+": Acabado!");

		long tiempoFinal = System.nanoTime();
		double tiempoTotal = (tiempoFinal - tiempoInicial)/1000000000.0;
		System.out.println("Ha tardado "+tiempoTotal+ " segundos.");
		
	}
}
