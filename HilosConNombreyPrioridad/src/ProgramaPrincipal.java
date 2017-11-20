
public class ProgramaPrincipal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HiloNombre h1 = new HiloNombre(5);
		h1.setName("NombreCambiado!");
		h1.start();
		
		HiloPrioridad hp1 = new HiloPrioridad(Thread.MAX_PRIORITY);
		HiloPrioridad hp2 = new HiloPrioridad(Thread.NORM_PRIORITY);
		HiloPrioridad hp3 = new HiloPrioridad(Thread.MIN_PRIORITY);
		HiloPrioridad hp4 = new HiloPrioridad(Thread.MAX_PRIORITY);
		HiloPrioridad hp5 = new HiloPrioridad(Thread.NORM_PRIORITY);
		HiloPrioridad hp6 = new HiloPrioridad(Thread.MIN_PRIORITY);
		HiloPrioridad hp7 = new HiloPrioridad(Thread.MAX_PRIORITY);
		HiloPrioridad hp8 = new HiloPrioridad(Thread.NORM_PRIORITY);
		HiloPrioridad hp9 = new HiloPrioridad(Thread.MIN_PRIORITY);
		
		hp1.start();
		hp2.start();
		hp3.start();
		hp4.start();
		hp5.start();
		hp6.start();
		hp7.start();
		hp8.start();
		hp9.start();
		
	}

}
