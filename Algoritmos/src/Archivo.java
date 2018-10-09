import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Archivo {
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
}
