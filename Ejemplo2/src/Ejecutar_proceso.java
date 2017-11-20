import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Ejecutar_proceso {

		public static void main(String[] args){
			
			Runtime r = Runtime.getRuntime();
			String comando = "ls -l /";
			String comando1 = "java -classpath ./bin HolaPersona Juan";
			String comando2 = "j";
			Process p = null;
			try{
				p = r.exec(comando2);
				InputStream is = p.getErrorStream();
				InputStreamReader in = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(in);
				String lineaLeida;
				while((lineaLeida = br.readLine())!=null){
					System.out.println(lineaLeida);
				}
				br.close();
				in.close();
				is.close();
				int exitVal =p.waitFor();
				System.out.println("Valor de Salida: "+ exitVal);
			}catch (Exception e){
				System.out.println("Error en: "+comando2);
				e.printStackTrace();
			}
			/*
			int exitVal;
			try{
				exitVal = p.waitFor();
				System.out.println("Valor de Salida: "+ exitVal);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			*/
		}
}