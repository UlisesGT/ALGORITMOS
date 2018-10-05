import java.util.Random;

public class Arreglos {
	
	public String[] Año (int[] n1) {
		
		int aux = 0;
		String[] meses = new String [n1.length];
		String[] prueba = {"jaja","Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		
		for (int i = 0; i < n1.length; i++) {
			
			aux = n1[i];
			meses[i] = prueba[aux];		
			
	        } return meses;
	}
	public int[] Suma (int[] n1, int[] n2) {
		
		int[] aleatorio = new int [n1.length];
		
		for (int i = 0; i < n1.length; i++) {
			aleatorio [i] = n1[i] + n2[i];

		} return aleatorio;		
	}
}
