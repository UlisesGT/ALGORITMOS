import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivo {
	//LEER un archivo de texto
	public String leer (String ubicacion) {
		String texto = "";
		
		try {
			File archivo = new File (ubicacion);
			FileReader reader = new FileReader (archivo);
			BufferedReader buffer = new BufferedReader (reader);
			String temp;
			
			while ((temp = buffer.readLine()) != null) {
				texto += temp;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} return texto;	
	}
		 //ESCRIBIR un archivo de texto
		public void escribir (String ubicacion, String contenido) {
			try {
	//Agregar texto al archivo ,true
				FileWriter archivo = new FileWriter (ubicacion, true);
	//Sobreescribir el archivo o ,false
			//FileWriter archivo = new FileWriter (ubicacion);
				PrintWriter writer = new PrintWriter (archivo);
				writer.println(contenido);
				writer.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
		public String cambiar (String ubicacion) {
		String texto = "";
			
			try {
				File archivo = new File (ubicacion);
				FileReader reader = new FileReader (archivo);
				BufferedReader buffer = new BufferedReader (reader);
				String temp;
				
				while ((temp = buffer.readLine()) != null) {
					texto += temp.replaceAll("[aeiouAEIOU]", "_"); 
				}
			} catch (IOException e) {
				e.printStackTrace();
			} return texto;	
			
//			char[] temp = ubicacion.toCharArray();
//			
//			for (int i = 0; i < ubicacion.length(); i++) {
//				char letra = temp[i];
//				if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
//					temp[i] = '_';
//					
//				texto = String.valueOf(temp);
//				
//			} return texto;
		}
}
