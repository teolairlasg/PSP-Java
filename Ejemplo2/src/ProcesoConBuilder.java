import java.io.File;
import java.io.IOException;


public class ProcesoConBuilder {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ProcessBuilder pb = new ProcessBuilder("ls","-l","/");
		File fOut = new File("/home/user/fichero_salida.txt");
		File fErr = new File("/home/user/fichero_salida_error.txt");
		
		pb.redirectError(fErr);
		pb.redirectOutput(fOut);
		
		pb.start();
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pb.start();
	}

}
